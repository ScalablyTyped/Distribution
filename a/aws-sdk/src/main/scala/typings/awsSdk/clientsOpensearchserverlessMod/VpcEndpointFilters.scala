package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcEndpointFilters extends StObject {
  
  /**
    * The current status of the endpoint.
    */
  var status: js.UndefOr[VpcEndpointStatus] = js.undefined
}
object VpcEndpointFilters {
  
  inline def apply(): VpcEndpointFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpointFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpcEndpointFilters] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: VpcEndpointStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
