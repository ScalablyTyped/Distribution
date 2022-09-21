package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TraceResultExtend
  extends StObject
     with Object {
  
  /**
    * TraceItem extends the named trace configuration and adds a property to manage the selection on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#TraceResultExtend)
    */
  var TraceItem: typings.arcgisJsApi.esri.TraceItem
  
  /**
    * The collection of results returned from the trace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#TraceResultExtend)
    */
  var TraceResult: typings.arcgisJsApi.esri.TraceResult
  
  /**
    * The color for the graphic of the trace results in the graphics layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#TraceResultExtend)
    */
  var graphicColor: GraphicColor
  
  /**
    * Returns true if graphic is enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#TraceResultExtend)
    */
  var graphicEnabled: Boolean
  
  /**
    * Returns true if selection is enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#TraceResultExtend)
    */
  var selectionEnabled: Boolean
  
  /**
    * The current status of the trace to return errors from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#TraceResultExtend)
    */
  var status: String
}
object TraceResultExtend {
  
  inline def apply(
    TraceItem: TraceItem,
    TraceResult: TraceResult,
    constructor: js.Function,
    graphicColor: GraphicColor,
    graphicEnabled: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    selectionEnabled: Boolean,
    status: String
  ): TraceResultExtend = {
    val __obj = js.Dynamic.literal(TraceItem = TraceItem.asInstanceOf[js.Any], TraceResult = TraceResult.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], graphicColor = graphicColor.asInstanceOf[js.Any], graphicEnabled = graphicEnabled.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), selectionEnabled = selectionEnabled.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraceResultExtend]
  }
  
  extension [Self <: TraceResultExtend](x: Self) {
    
    inline def setGraphicColor(value: GraphicColor): Self = StObject.set(x, "graphicColor", value.asInstanceOf[js.Any])
    
    inline def setGraphicEnabled(value: Boolean): Self = StObject.set(x, "graphicEnabled", value.asInstanceOf[js.Any])
    
    inline def setSelectionEnabled(value: Boolean): Self = StObject.set(x, "selectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTraceItem(value: TraceItem): Self = StObject.set(x, "TraceItem", value.asInstanceOf[js.Any])
    
    inline def setTraceResult(value: TraceResult): Self = StObject.set(x, "TraceResult", value.asInstanceOf[js.Any])
  }
}
