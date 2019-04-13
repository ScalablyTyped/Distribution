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
    * The maximum number of results that are returned per call. nextPageToken can be used to obtain futher pages of results. The default is 1000, which is the maximum allowed page size. You can, however, specify a page size smaller than the maximum. This is an upper limit only; the actual number of results returned per call may be fewer than the specified maximum.
    */
  var maximumPageSize: js.UndefOr[PageSize] = js.undefined
  /**
    * If specified, only lists the activity types that have this name.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.
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

