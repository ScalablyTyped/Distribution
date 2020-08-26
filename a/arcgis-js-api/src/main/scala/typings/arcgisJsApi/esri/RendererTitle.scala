package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RendererTitle extends Object {
  /**
    * The field name used in the renderer. This is used in the generated title of the renderer in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RendererTitle)
    */
  var field: String = js.native
  /**
    * Indicates if a percentage is used in the normalization of the renderer. This is used to create a more readable legend for that scenario.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RendererTitle)
    */
  var normByPct: Boolean = js.native
  /**
    * If a normalization field is provided to the renderer, this field is also used in the generated title for the renderer in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RendererTitle)
    */
  var normField: String = js.native
  /**
    * The title of the renderer as displayed in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RendererTitle)
    */
  var title: js.UndefOr[String] = js.native
}

object RendererTitle {
  @scala.inline
  def apply(
    constructor: js.Function,
    field: String,
    hasOwnProperty: PropertyKey => Boolean,
    normByPct: Boolean,
    normField: String,
    propertyIsEnumerable: PropertyKey => Boolean
  ): RendererTitle = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), normByPct = normByPct.asInstanceOf[js.Any], normField = normField.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[RendererTitle]
  }
  @scala.inline
  implicit class RendererTitleOps[Self <: RendererTitle] (val x: Self) extends AnyVal {
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormByPct(value: Boolean): Self = this.set("normByPct", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormField(value: String): Self = this.set("normField", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

