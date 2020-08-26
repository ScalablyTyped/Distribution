package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SymbolTableElement
  extends Object
     with LegendElement {
  /**
    * An array of each symbol/category/break rendered for the symbol table. For example, this may be individual breaks for a ClassBreaksRenderer, or unique values for a UniqueValueRenderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SymbolTableElement)
    */
  var infos: js.Array[SymbolTableElementType] = js.native
  /**
    * Only used for renderers set to ImageryLayers. Indicates the type of renderer set on the layer (e.g. `stretched` or `Unique Values`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SymbolTableElement)
    */
  var legendType: js.UndefOr[String] = js.native
  /**
    * The title of the renderer as displayed in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SymbolTableElement)
    */
  var title: js.UndefOr[String | RendererTitle] = js.native
  /**
    * The type of this element is always `symbol-table`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SymbolTableElement)
    */
  var `type`: String = js.native
}

object SymbolTableElement {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    infos: js.Array[SymbolTableElementType],
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String
  ): SymbolTableElement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), infos = infos.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolTableElement]
  }
  @scala.inline
  implicit class SymbolTableElementOps[Self <: SymbolTableElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInfosVarargs(value: SymbolTableElementType*): Self = this.set("infos", js.Array(value :_*))
    @scala.inline
    def setInfos(value: js.Array[SymbolTableElementType]): Self = this.set("infos", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setLegendType(value: String): Self = this.set("legendType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendType: Self = this.set("legendType", js.undefined)
    @scala.inline
    def setTitle(value: String | RendererTitle): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

