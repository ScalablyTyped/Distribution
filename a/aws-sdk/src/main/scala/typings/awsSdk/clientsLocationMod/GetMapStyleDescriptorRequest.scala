package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMapStyleDescriptorRequest extends StObject {
  
  /**
    * The map resource to retrieve the style descriptor from.
    */
  var MapName: ResourceName
}
object GetMapStyleDescriptorRequest {
  
  inline def apply(MapName: ResourceName): GetMapStyleDescriptorRequest = {
    val __obj = js.Dynamic.literal(MapName = MapName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMapStyleDescriptorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMapStyleDescriptorRequest] (val x: Self) extends AnyVal {
    
    inline def setMapName(value: ResourceName): Self = StObject.set(x, "MapName", value.asInstanceOf[js.Any])
  }
}
