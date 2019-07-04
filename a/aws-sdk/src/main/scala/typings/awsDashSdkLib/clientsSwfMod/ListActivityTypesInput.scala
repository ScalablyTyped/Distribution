package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListActivityTypesInput extends js.Object {
  /**
    * The name of the domain in which the activity types have been registered.
    */
  var domain: DomainName
  /**
    * The maximum number of results that are returned per call. Use nextPageToken to obtain further pages of results. 
    */
  var maximumPageSize: js.UndefOr[PageSize] = js.undefined
  /**
    * If specified, only lists the activity types that have this name.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * If NextPageToken is returned there are more results available. The value of NextPageToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 60 seconds. Using an expired pagination token will return a 400 error: "Specified token has exceeded its maximum lifetime".  The configured maximumPageSize determines how many results can be returned in a single call. 
    */
  var nextPageToken: js.UndefOr[PageToken] = js.undefined
  /**
    * Specifies the registration status of the activity types to list.
    */
  var registrationStatus: RegistrationStatus
  /**
    * When set to true, returns the results in reverse order. By default, the results are returned in ascending alphabetical order by name of the activity types.
    */
  var reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
}

object ListActivityTypesInput {
  @scala.inline
  def apply(
    domain: DomainName,
    registrationStatus: RegistrationStatus,
    maximumPageSize: js.UndefOr[PageSize] = js.undefined,
    name: Name = null,
    nextPageToken: PageToken = null,
    reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
  ): ListActivityTypesInput = {
    val __obj = js.Dynamic.literal(domain = domain, registrationStatus = registrationStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumPageSize)) __obj.updateDynamic("maximumPageSize")(maximumPageSize)
    if (name != null) __obj.updateDynamic("name")(name)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (!js.isUndefined(reverseOrder)) __obj.updateDynamic("reverseOrder")(reverseOrder)
    __obj.asInstanceOf[ListActivityTypesInput]
  }
}

