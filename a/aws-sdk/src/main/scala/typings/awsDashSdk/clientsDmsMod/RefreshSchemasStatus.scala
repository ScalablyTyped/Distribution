package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshSchemasStatus extends js.Object {
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var EndpointArn: js.UndefOr[String] = js.undefined
  /**
    * The last failure message for the schema.
    */
  var LastFailureMessage: js.UndefOr[String] = js.undefined
  /**
    * The date the schema was last refreshed.
    */
  var LastRefreshDate: js.UndefOr[TStamp] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  var ReplicationInstanceArn: js.UndefOr[String] = js.undefined
  /**
    * The status of the schema.
    */
  var Status: js.UndefOr[RefreshSchemasStatusTypeValue] = js.undefined
}

object RefreshSchemasStatus {
  @scala.inline
  def apply(
    EndpointArn: String = null,
    LastFailureMessage: String = null,
    LastRefreshDate: TStamp = null,
    ReplicationInstanceArn: String = null,
    Status: RefreshSchemasStatusTypeValue = null
  ): RefreshSchemasStatus = {
    val __obj = js.Dynamic.literal()
    if (EndpointArn != null) __obj.updateDynamic("EndpointArn")(EndpointArn)
    if (LastFailureMessage != null) __obj.updateDynamic("LastFailureMessage")(LastFailureMessage)
    if (LastRefreshDate != null) __obj.updateDynamic("LastRefreshDate")(LastRefreshDate)
    if (ReplicationInstanceArn != null) __obj.updateDynamic("ReplicationInstanceArn")(ReplicationInstanceArn)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshSchemasStatus]
  }
}

