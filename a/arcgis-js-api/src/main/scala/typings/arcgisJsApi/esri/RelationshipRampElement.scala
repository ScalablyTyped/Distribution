package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationshipRampElement
  extends Object
     with LegendElement {
  /**
    * A 2-dimensional array of colors as displayed in the legend grid.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipRampElement)
    */
  var colors: js.Array[js.Array[Color_]] = js.native
  /**
    * Determines the orientation of the Legend. Values can be `HH`, `HL`, `LH`, `LL`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipRampElement)
    */
  var focus: String = js.native
  /**
    * Info objects associated with the relationship renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipRampElement)
    */
  var infos: js.UndefOr[js.Array[_]] = js.native
  /**
    * The labels for each corner of the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipRampElement)
    */
  var labels: RelationshipLabels = js.native
  /**
    * The number of classes for each field comprising the renderer. Can either be 2, 3, or 4.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipRampElement)
    */
  var numClasses: Double = js.native
  /**
    * The rotation of the legend in degrees (0-360). `0` degrees displays the legend as a square with the `LL` cell in the bottom left corner of the legend and the `HH` cell in the top right corner.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipRampElement)
    */
  var rotation: Double = js.native
  /**
    * The title of the renderer as displayed in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipRampElement)
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The type of this element is always `relationship-ramp`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipRampElement)
    */
  var `type`: String = js.native
}

object RelationshipRampElement {
  @scala.inline
  def apply(
    colors: js.Array[js.Array[Color_]],
    constructor: js.Function,
    focus: String,
    hasOwnProperty: PropertyKey => Boolean,
    labels: RelationshipLabels,
    numClasses: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    rotation: Double,
    `type`: String
  ): RelationshipRampElement = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), labels = labels.asInstanceOf[js.Any], numClasses = numClasses.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), rotation = rotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationshipRampElement]
  }
  @scala.inline
  implicit class RelationshipRampElementOps[Self <: RelationshipRampElement] (val x: Self) extends AnyVal {
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
    def setColorsVarargs(value: js.Array[Color_]*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[js.Array[Color_]]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocus(value: String): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabels(value: RelationshipLabels): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumClasses(value: Double): Self = this.set("numClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfosVarargs(value: js.Any*): Self = this.set("infos", js.Array(value :_*))
    @scala.inline
    def setInfos(value: js.Array[_]): Self = this.set("infos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfos: Self = this.set("infos", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

