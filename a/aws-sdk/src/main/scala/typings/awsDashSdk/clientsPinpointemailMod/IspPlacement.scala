package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IspPlacement extends js.Object {
  /**
    * The name of the email provider that the inbox placement data applies to.
    */
  var IspName: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.IspName] = js.undefined
  /**
    * An object that contains inbox placement metrics for a specific email provider.
    */
  var PlacementStatistics: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.PlacementStatistics] = js.undefined
}

object IspPlacement {
  @scala.inline
  def apply(IspName: IspName = null, PlacementStatistics: PlacementStatistics = null): IspPlacement = {
    val __obj = js.Dynamic.literal()
    if (IspName != null) __obj.updateDynamic("IspName")(IspName)
    if (PlacementStatistics != null) __obj.updateDynamic("PlacementStatistics")(PlacementStatistics)
    __obj.asInstanceOf[IspPlacement]
  }
}

