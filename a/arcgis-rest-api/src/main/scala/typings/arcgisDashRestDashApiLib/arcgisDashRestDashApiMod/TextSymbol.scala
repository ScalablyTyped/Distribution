package typings
package arcgisDashRestDashApiLib.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextSymbol extends MarkerSymbol {
  var backgroundColor: js.UndefOr[Color] = js.undefined
   // <size>;
  var borderLineColor: js.UndefOr[Color] = js.undefined
  var borderLineSize: js.UndefOr[scala.Double] = js.undefined
  var color: js.UndefOr[Color] = js.undefined
  var font: js.UndefOr[Font] = js.undefined
   // <size>;
  var haloColor: js.UndefOr[Color] = js.undefined
  var haloSize: js.UndefOr[scala.Double] = js.undefined
  var horizontalAlignment: js.UndefOr[
    arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.left | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.right | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.center | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.justify
  ] = js.undefined
  var kerning: js.UndefOr[scala.Boolean] = js.undefined
  var rightToLeft: js.UndefOr[scala.Boolean] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  @JSName("type")
  var type_TextSymbol: arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriTS
  var verticalAlignment: js.UndefOr[
    arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.baseline | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.top | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.middle | arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.bottom
  ] = js.undefined
}

