package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlagProperty extends StObject {
  
  /**
    * The available [terminals](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-Terminal.html) to define the permissible paths based on the terminal configurations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#FlagProperty)
    */
  var allTerminals: TerminalConfiguration
  
  /**
    * All the information returned by the hitTest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#FlagProperty)
    */
  var details: Any
  
  /**
    * The display field of the flag.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#FlagProperty)
    */
  var displayField: DisplayField
  
  /**
    * The id of the flag.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#FlagProperty)
    */
  var id: Double
  
  /**
    * The flag graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#FlagProperty)
    */
  var mapGraphic: Graphic
  
  /**
    * The geometry point of the flag.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#FlagProperty)
    */
  var mapPoint: Point
  
  /**
    * The terminals that are selected for the flag (this can be the default terminal or terminals selected by the end-user).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#FlagProperty)
    */
  var selectedTerminals: js.Array[Double]
  
  /**
    * The flag type being set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#FlagProperty)
    */
  var `type`: String
}
object FlagProperty {
  
  inline def apply(
    allTerminals: TerminalConfiguration,
    details: Any,
    displayField: DisplayField,
    id: Double,
    mapGraphic: Graphic,
    mapPoint: Point,
    selectedTerminals: js.Array[Double],
    `type`: String
  ): FlagProperty = {
    val __obj = js.Dynamic.literal(allTerminals = allTerminals.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], displayField = displayField.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mapGraphic = mapGraphic.asInstanceOf[js.Any], mapPoint = mapPoint.asInstanceOf[js.Any], selectedTerminals = selectedTerminals.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlagProperty]
  }
  
  extension [Self <: FlagProperty](x: Self) {
    
    inline def setAllTerminals(value: TerminalConfiguration): Self = StObject.set(x, "allTerminals", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: Any): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDisplayField(value: DisplayField): Self = StObject.set(x, "displayField", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMapGraphic(value: Graphic): Self = StObject.set(x, "mapGraphic", value.asInstanceOf[js.Any])
    
    inline def setMapPoint(value: Point): Self = StObject.set(x, "mapPoint", value.asInstanceOf[js.Any])
    
    inline def setSelectedTerminals(value: js.Array[Double]): Self = StObject.set(x, "selectedTerminals", value.asInstanceOf[js.Any])
    
    inline def setSelectedTerminalsVarargs(value: Double*): Self = StObject.set(x, "selectedTerminals", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
