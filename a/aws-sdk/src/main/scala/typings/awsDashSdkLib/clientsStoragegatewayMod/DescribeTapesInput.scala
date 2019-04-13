package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTapesInput extends js.Object {
  var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.GatewayARN
  /**
    * Specifies that the number of virtual tapes described be limited to the specified number.  Amazon Web Services may impose its own limit, if this field is not set. 
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.undefined
  /**
    * A marker value, obtained in a previous call to DescribeTapes. This marker indicates which page of results to retrieve.  If not specified, the first page of results is retrieved.
    */
  var Marker: js.UndefOr[Marker] = js.undefined
  /**
    * Specifies one or more unique Amazon Resource Names (ARNs) that represent the virtual tapes you want to describe. If this parameter is not specified, Tape gateway returns a description of all virtual tapes associated with the specified gateway.
    */
  var TapeARNs: js.UndefOr[TapeARNs] = js.undefined
}

object DescribeTapesInput {
  @scala.inline
  def apply(
    GatewayARN: GatewayARN,
    Limit: js.UndefOr[PositiveIntObject] = js.undefined,
    Marker: Marker = null,
    TapeARNs: TapeARNs = null
  ): DescribeTapesInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (TapeARNs != null) __obj.updateDynamic("TapeARNs")(TapeARNs)
    __obj.asInstanceOf[DescribeTapesInput]
  }
}

