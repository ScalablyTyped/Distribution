package typings.arcgisJsApi.esri

import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.esri.SymbolTableElement
  - typings.arcgisJsApi.esri.ColorRampElement
  - typings.arcgisJsApi.esri.OpacityRampElement
  - typings.arcgisJsApi.esri.SizeRampElement
  - typings.arcgisJsApi.esri.HeatmapRampElement
  - typings.arcgisJsApi.esri.RelationshipRampElement
*/
trait LegendElement extends js.Object

object LegendElement {
  @scala.inline
  def ColorRampElement(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    infos: js.Array[ColorRampStop],
    propertyIsEnumerable: PropertyKey => Boolean,
    title: String | RampTitle,
    `type`: String
  ): LegendElement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), infos = infos.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendElement]
  }
  @scala.inline
  def SymbolTableElement(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    infos: js.Array[SymbolTableElementType],
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String
  ): LegendElement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), infos = infos.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendElement]
  }
  @scala.inline
  def RelationshipRampElement(
    colors: js.Array[js.Array[Color_]],
    constructor: js.Function,
    focus: String,
    hasOwnProperty: PropertyKey => Boolean,
    labels: RelationshipLabels,
    numClasses: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    rotation: Double,
    `type`: String
  ): LegendElement = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), labels = labels.asInstanceOf[js.Any], numClasses = numClasses.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), rotation = rotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendElement]
  }
  @scala.inline
  def SizeRampElement(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    infos: js.Array[SizeRampStop],
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String
  ): LegendElement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), infos = infos.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendElement]
  }
  @scala.inline
  def OpacityRampElement(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    infos: js.Array[OpacityRampStop],
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String
  ): LegendElement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), infos = infos.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendElement]
  }
  @scala.inline
  def HeatmapRampElement(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    infos: js.Array[HeatmapRampStop],
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String
  ): LegendElement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), infos = infos.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendElement]
  }
}

