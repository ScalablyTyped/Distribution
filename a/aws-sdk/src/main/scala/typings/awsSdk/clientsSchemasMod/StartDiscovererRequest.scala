package typings.awsSdk.clientsSchemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDiscovererRequest extends StObject {
  
  /**
    * The ID of the discoverer.
    */
  var DiscovererId: string
}
object StartDiscovererRequest {
  
  inline def apply(DiscovererId: string): StartDiscovererRequest = {
    val __obj = js.Dynamic.literal(DiscovererId = DiscovererId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDiscovererRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartDiscovererRequest] (val x: Self) extends AnyVal {
    
    inline def setDiscovererId(value: string): Self = StObject.set(x, "DiscovererId", value.asInstanceOf[js.Any])
  }
}
