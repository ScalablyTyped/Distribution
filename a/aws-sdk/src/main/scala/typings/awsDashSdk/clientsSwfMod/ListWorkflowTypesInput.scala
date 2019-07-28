package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListWorkflowTypesInput extends js.Object {
  /**
    * The name of the domain in which the workflow types have been registered.
    */
  var domain: DomainName
  /**
    * The maximum number of results that are returned per call. Use nextPageToken to obtain further pages of results. 
    */
  var maximumPageSize: js.UndefOr[PageSize] = js.undefined
  /**
    * If specified, lists the workflow type with this name.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * If NextPageToken is returned there are more results available. The value of NextPageToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 60 seconds. Using an expired pagination token will return a 400 error: "Specified token has exceeded its maximum lifetime".  The configured maximumPageSize determines how many results can be returned in a single call. 
    */
  var nextPageToken: js.UndefOr[PageToken] = js.undefined
  /**
    * Specifies the registration status of the workflow types to list.
    */
  var registrationStatus: RegistrationStatus
  /**
    * When set to true, returns the results in reverse order. By default the results are returned in ascending alphabetical order of the name of the workflow types.
    */
  var reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
}

object ListWorkflowTypesInput {
  @scala.inline
  def apply(
    domain: DomainName,
    registrationStatus: RegistrationStatus,
    maximumPageSize: js.UndefOr[PageSize] = js.undefined,
    name: Name = null,
    nextPageToken: PageToken = null,
    reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
  ): ListWorkflowTypesInput = {
    val __obj = js.Dynamic.literal(domain = domain, registrationStatus = registrationStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumPageSize)) __obj.updateDynamic("maximumPageSize")(maximumPageSize)
    if (name != null) __obj.updateDynamic("name")(name)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (!js.isUndefined(reverseOrder)) __obj.updateDynamic("reverseOrder")(reverseOrder)
    __obj.asInstanceOf[ListWorkflowTypesInput]
  }
}

