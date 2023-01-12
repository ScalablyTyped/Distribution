package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMapRequest extends StObject {
  
  /**
    * The name of the map resource to be deleted.
    */
  var MapName: ResourceName
}
object DeleteMapRequest {
  
  inline def apply(MapName: ResourceName): DeleteMapRequest = {
    val __obj = js.Dynamic.literal(MapName = MapName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMapRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMapRequest] (val x: Self) extends AnyVal {
    
    inline def setMapName(value: ResourceName): Self = StObject.set(x, "MapName", value.asInstanceOf[js.Any])
  }
}
