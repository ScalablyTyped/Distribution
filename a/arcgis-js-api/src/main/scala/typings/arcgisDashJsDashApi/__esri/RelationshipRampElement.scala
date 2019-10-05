package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationshipRampElement
  extends Object
     with LegendElement {
  /**
    * A 2-dimensional array of colors as displayed in the legend grid.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipRampElement)
    */
  var colors: js.Array[js.Array[Color]]
  /**
    * Determines the orientation of the Legend. Values can be `HH`, `HL`, `LH`, `LL`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipRampElement)
    */
  var focus: String
  /**
    * Info objects associated with the relationship renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipRampElement)
    */
  var infos: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The labels for each corner of the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipRampElement)
    */
  var labels: RelationshipLabels
  /**
    * The number of classes for each field comprising the renderer. Can either be 2, 3, or 4.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipRampElement)
    */
  var numClasses: Double
  /**
    * The rotation of the legend in degrees (0-360). `0` degrees displays the legend as a square with the `LL` cell in the bottom left corner of the legend and the `HH` cell in the top right corner.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipRampElement)
    */
  var rotation: Double
  /**
    * The title of the renderer as displayed in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipRampElement)
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The type of this element is always `relationship-ramp`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipRampElement)
    */
  var `type`: String
}

object RelationshipRampElement {
  @scala.inline
  def apply(
    colors: js.Array[js.Array[Color]],
    constructor: js.Function,
    focus: String,
    hasOwnProperty: PropertyKey => Boolean,
    labels: RelationshipLabels,
    numClasses: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    rotation: Double,
    `type`: String,
    infos: js.Array[_] = null,
    title: String = null
  ): RelationshipRampElement = {
    val __obj = js.Dynamic.literal(colors = colors, constructor = constructor, focus = focus, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), labels = labels, numClasses = numClasses, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), rotation = rotation)
    __obj.updateDynamic("type")(`type`)
    if (infos != null) __obj.updateDynamic("infos")(infos)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[RelationshipRampElement]
  }
}

