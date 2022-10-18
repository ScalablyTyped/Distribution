package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RealtimeLogConfigs extends StObject {
  
  /**
    * A flag that indicates whether there are more real-time log configurations than are contained in this list.
    */
  var IsTruncated: Boolean
  
  /**
    * Contains the list of real-time log configurations.
    */
  var Items: js.UndefOr[RealtimeLogConfigList] = js.undefined
  
  /**
    * This parameter indicates where this list of real-time log configurations begins. This list includes real-time log configurations that occur after the marker.
    */
  var Marker: String
  
  /**
    * The maximum number of real-time log configurations requested.
    */
  var MaxItems: integer
  
  /**
    * If there are more items in the list than are in this response, this element is present. It contains the value that you should use in the Marker field of a subsequent request to continue listing real-time log configurations where you left off. 
    */
  var NextMarker: js.UndefOr[String] = js.undefined
}
object RealtimeLogConfigs {
  
  inline def apply(IsTruncated: Boolean, Marker: String, MaxItems: integer): RealtimeLogConfigs = {
    val __obj = js.Dynamic.literal(IsTruncated = IsTruncated.asInstanceOf[js.Any], Marker = Marker.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealtimeLogConfigs]
  }
  
  extension [Self <: RealtimeLogConfigs](x: Self) {
    
    inline def setIsTruncated(value: Boolean): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    inline def setItems(value: RealtimeLogConfigList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: RealtimeLogConfig*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMaxItems(value: integer): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
