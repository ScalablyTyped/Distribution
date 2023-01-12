package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMapRequest extends StObject {
  
  /**
    * The name of the map resource.
    */
  var MapName: ResourceName
}
object DescribeMapRequest {
  
  inline def apply(MapName: ResourceName): DescribeMapRequest = {
    val __obj = js.Dynamic.literal(MapName = MapName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMapRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeMapRequest] (val x: Self) extends AnyVal {
    
    inline def setMapName(value: ResourceName): Self = StObject.set(x, "MapName", value.asInstanceOf[js.Any])
  }
}
