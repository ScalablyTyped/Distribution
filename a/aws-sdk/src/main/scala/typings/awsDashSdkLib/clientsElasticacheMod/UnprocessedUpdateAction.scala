package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnprocessedUpdateAction extends js.Object {
  /**
    * The error message that describes the reason the request was not processed
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  /**
    * The error type for requests that are not processed
    */
  var ErrorType: js.UndefOr[String] = js.undefined
  /**
    * The replication group ID
    */
  var ReplicationGroupId: js.UndefOr[String] = js.undefined
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: js.UndefOr[String] = js.undefined
}

object UnprocessedUpdateAction {
  @scala.inline
  def apply(
    ErrorMessage: String = null,
    ErrorType: String = null,
    ReplicationGroupId: String = null,
    ServiceUpdateName: String = null
  ): UnprocessedUpdateAction = {
    val __obj = js.Dynamic.literal()
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (ErrorType != null) __obj.updateDynamic("ErrorType")(ErrorType)
    if (ReplicationGroupId != null) __obj.updateDynamic("ReplicationGroupId")(ReplicationGroupId)
    if (ServiceUpdateName != null) __obj.updateDynamic("ServiceUpdateName")(ServiceUpdateName)
    __obj.asInstanceOf[UnprocessedUpdateAction]
  }
}

