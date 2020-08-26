package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorRampElement
  extends Object
     with LegendElement {
  /**
    * The individual color stops rendered in the legend that correspond to the color visual variable in the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ColorRampElement)
    */
  var infos: js.Array[ColorRampStop] = js.native
  /**
    * The title of the color ramp as displayed in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ColorRampElement)
    */
  var title: String | RampTitle = js.native
  /**
    * The type of this element is always `color-ramp`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ColorRampElement)
    */
  var `type`: String = js.native
}

object ColorRampElement {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    infos: js.Array[ColorRampStop],
    propertyIsEnumerable: PropertyKey => Boolean,
    title: String | RampTitle,
    `type`: String
  ): ColorRampElement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), infos = infos.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorRampElement]
  }
  @scala.inline
  implicit class ColorRampElementOps[Self <: ColorRampElement] (val x: Self) extends AnyVal {
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
    def setInfosVarargs(value: ColorRampStop*): Self = this.set("infos", js.Array(value :_*))
    @scala.inline
    def setInfos(value: js.Array[ColorRampStop]): Self = this.set("infos", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String | RampTitle): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

