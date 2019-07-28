package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeListenerCertificatesInput extends js.Object {
  /**
    * The Amazon Resource Names (ARN) of the listener.
    */
  var ListenerArn: typings.awsDashSdk.clientsElbv2Mod.ListenerArn
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.Marker] = js.undefined
  /**
    * The maximum number of results to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.PageSize] = js.undefined
}

object DescribeListenerCertificatesInput {
  @scala.inline
  def apply(ListenerArn: ListenerArn, Marker: Marker = null, PageSize: js.UndefOr[PageSize] = js.undefined): DescribeListenerCertificatesInput = {
    val __obj = js.Dynamic.literal(ListenerArn = ListenerArn)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize)
    __obj.asInstanceOf[DescribeListenerCertificatesInput]
  }
}

