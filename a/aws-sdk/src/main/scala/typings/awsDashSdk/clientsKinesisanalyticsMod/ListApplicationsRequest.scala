package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListApplicationsRequest extends js.Object {
  /**
    * Name of the application to start the list with. When using pagination to retrieve the list, you don't need to specify this parameter in the first request. However, in subsequent requests, you add the last application name from the previous response to get the next page of applications.
    */
  var ExclusiveStartApplicationName: js.UndefOr[ApplicationName] = js.undefined
  /**
    * Maximum number of applications to list.
    */
  var Limit: js.UndefOr[ListApplicationsInputLimit] = js.undefined
}

object ListApplicationsRequest {
  @scala.inline
  def apply(
    ExclusiveStartApplicationName: ApplicationName = null,
    Limit: js.UndefOr[ListApplicationsInputLimit] = js.undefined
  ): ListApplicationsRequest = {
    val __obj = js.Dynamic.literal()
    if (ExclusiveStartApplicationName != null) __obj.updateDynamic("ExclusiveStartApplicationName")(ExclusiveStartApplicationName)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    __obj.asInstanceOf[ListApplicationsRequest]
  }
}

