package typings
package arcgisDashRestDashApiLib.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleFillSymbol extends Symbol {
  var color: js.UndefOr[Color] = js.undefined
  var outline: js.UndefOr[SimpleLineSymbol] = js.undefined
  @JSName("style")
  var style_SimpleFillSymbol: js.UndefOr[SimpleFillSymbolStyle] = js.undefined
  @JSName("type")
  var type_SimpleFillSymbol: arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSFS
}

object SimpleFillSymbol {
  @scala.inline
  def apply(
    `type`: arcgisDashRestDashApiLib.arcgisDashRestDashApiLibStrings.esriSFS,
    color: Color = null,
    outline: SimpleLineSymbol = null,
    style: SimpleFillSymbolStyle = null
  ): SimpleFillSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (color != null) __obj.updateDynamic("color")(color)
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SimpleFillSymbol]
  }
}

