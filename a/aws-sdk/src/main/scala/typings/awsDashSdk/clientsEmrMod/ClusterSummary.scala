package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterSummary extends js.Object {
  /**
    * The unique identifier for the cluster.
    */
  var Id: js.UndefOr[ClusterId] = js.undefined
  /**
    * The name of the cluster.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * An approximation of the cost of the cluster, represented in m1.small/hours. This value is incremented one time for every hour an m1.small instance runs. Larger instances are weighted more, so an EC2 instance that is roughly four times more expensive would result in the normalized instance hours being incremented by four. This result is only an approximation and does not reflect the actual billing rate.
    */
  var NormalizedInstanceHours: js.UndefOr[Integer] = js.undefined
  /**
    * The details about the current status of the cluster.
    */
  var Status: js.UndefOr[ClusterStatus] = js.undefined
}

object ClusterSummary {
  @scala.inline
  def apply(
    Id: ClusterId = null,
    Name: String = null,
    NormalizedInstanceHours: js.UndefOr[Integer] = js.undefined,
    Status: ClusterStatus = null
  ): ClusterSummary = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (!js.isUndefined(NormalizedInstanceHours)) __obj.updateDynamic("NormalizedInstanceHours")(NormalizedInstanceHours)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[ClusterSummary]
  }
}

