package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.esri.SymbolTableElement
  - typings.arcgisJsApi.esri.ColorRampElement
  - typings.arcgisJsApi.esri.OpacityRampElement
  - typings.arcgisJsApi.esri.SizeRampElement
  - typings.arcgisJsApi.esri.HeatmapRampElement
  - typings.arcgisJsApi.esri.RelationshipRampElement
*/
trait LegendElement extends StObject
object LegendElement {
  
  inline def ColorRampElement(infos: js.Array[ColorRampStop], title: String | RampTitle, `type`: String): typings.arcgisJsApi.esri.ColorRampElement = {
    val __obj = js.Dynamic.literal(infos = infos.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.ColorRampElement]
  }
  
  inline def HeatmapRampElement(infos: js.Array[HeatmapRampStop], `type`: String): typings.arcgisJsApi.esri.HeatmapRampElement = {
    val __obj = js.Dynamic.literal(infos = infos.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.HeatmapRampElement]
  }
  
  inline def OpacityRampElement(infos: js.Array[OpacityRampStop], `type`: String): typings.arcgisJsApi.esri.OpacityRampElement = {
    val __obj = js.Dynamic.literal(infos = infos.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.OpacityRampElement]
  }
  
  inline def RelationshipRampElement(
    colors: js.Array[js.Array[Color_]],
    focus: String,
    labels: RelationshipLabels,
    numClasses: Double,
    rotation: Double,
    `type`: String
  ): typings.arcgisJsApi.esri.RelationshipRampElement = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], numClasses = numClasses.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.RelationshipRampElement]
  }
  
  inline def SizeRampElement(infos: js.Array[SizeRampStop], `type`: String): typings.arcgisJsApi.esri.SizeRampElement = {
    val __obj = js.Dynamic.literal(infos = infos.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.SizeRampElement]
  }
  
  inline def SymbolTableElement(infos: js.Array[SymbolTableElementType], `type`: String): typings.arcgisJsApi.esri.SymbolTableElement = {
    val __obj = js.Dynamic.literal(infos = infos.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.SymbolTableElement]
  }
}
