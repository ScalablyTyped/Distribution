package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`picture-fill`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`simple-fill`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillSymbolProperties extends SymbolProperties {
  /**
    * The outline of the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html#outline)
    */
  var outline: js.UndefOr[SimpleLineSymbolProperties] = js.undefined
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html#type)
    */
  var `type`: js.UndefOr[`simple-fill` | `picture-fill`] = js.undefined
}

object FillSymbolProperties {
  @scala.inline
  def apply(
    color: Color | js.Array[Double] | String = null,
    outline: SimpleLineSymbolProperties = null,
    `type`: `simple-fill` | `picture-fill` = null
  ): FillSymbolProperties = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillSymbolProperties]
  }
}

