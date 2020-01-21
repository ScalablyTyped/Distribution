package typings.arcgisRestApi.mod

import typings.arcgisRestApi.arcgisRestApiStrings.esriSFS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleFillSymbol extends Symbol {
  var color: js.UndefOr[Color] = js.undefined
  var outline: js.UndefOr[SimpleLineSymbol] = js.undefined
  @JSName("style")
  var style_SimpleFillSymbol: js.UndefOr[SimpleFillSymbolStyle] = js.undefined
  @JSName("type")
  var type_SimpleFillSymbol: esriSFS
}

object SimpleFillSymbol {
  @scala.inline
  def apply(
    `type`: esriSFS,
    color: Color = null,
    outline: SimpleLineSymbol = null,
    style: SimpleFillSymbolStyle = null
  ): SimpleFillSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleFillSymbol]
  }
}

