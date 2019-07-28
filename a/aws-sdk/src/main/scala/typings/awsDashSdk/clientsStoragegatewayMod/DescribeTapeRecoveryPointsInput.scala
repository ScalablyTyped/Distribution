package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTapeRecoveryPointsInput extends js.Object {
  var GatewayARN: typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN
  /**
    * Specifies that the number of virtual tape recovery points that are described be limited to the specified number.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.undefined
  /**
    * An opaque string that indicates the position at which to begin describing the virtual tape recovery points.
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.Marker] = js.undefined
}

object DescribeTapeRecoveryPointsInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN, Limit: js.UndefOr[PositiveIntObject] = js.undefined, Marker: Marker = null): DescribeTapeRecoveryPointsInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[DescribeTapeRecoveryPointsInput]
  }
}

