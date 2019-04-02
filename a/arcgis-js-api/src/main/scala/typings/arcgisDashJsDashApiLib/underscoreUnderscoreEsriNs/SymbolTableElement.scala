package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolTableElement
  extends stdLib.Object
     with LegendElement {
  /**
    * An array of each symbol/category/break rendered for the symbol table. For example, this may be individual breaks for a ClassBreaksRenderer, or unique values for a UniqueValueRenderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SymbolTableElement)
    */
  var infos: js.Array[SymbolTableElementType]
  /**
    * Only used for renderers set to ImageryLayers. Indicates the type of renderer set on the layer (e.g. `stretched` or `Unique Values`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SymbolTableElement)
    */
  var legendType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The title of the renderer as displayed in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SymbolTableElement)
    */
  var title: js.UndefOr[java.lang.String | RendererTitle] = js.undefined
  /**
    * The type of this element is always `symbol-table`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SymbolTableElement)
    */
  var `type`: java.lang.String
}

object SymbolTableElement {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    infos: js.Array[SymbolTableElementType],
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    `type`: java.lang.String,
    legendType: java.lang.String = null,
    title: java.lang.String | RendererTitle = null
  ): SymbolTableElement = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), infos = infos, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`)
    if (legendType != null) __obj.updateDynamic("legendType")(legendType)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolTableElement]
  }
}

