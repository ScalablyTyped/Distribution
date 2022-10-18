package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessScopePathRequest extends StObject {
  
  /**
    * The destination.
    */
  var Destination: js.UndefOr[PathStatementRequest] = js.undefined
  
  /**
    * The source.
    */
  var Source: js.UndefOr[PathStatementRequest] = js.undefined
  
  /**
    * The through resources.
    */
  var ThroughResources: js.UndefOr[ThroughResourcesStatementRequestList] = js.undefined
}
object AccessScopePathRequest {
  
  inline def apply(): AccessScopePathRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessScopePathRequest]
  }
  
  extension [Self <: AccessScopePathRequest](x: Self) {
    
    inline def setDestination(value: PathStatementRequest): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setSource(value: PathStatementRequest): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setThroughResources(value: ThroughResourcesStatementRequestList): Self = StObject.set(x, "ThroughResources", value.asInstanceOf[js.Any])
    
    inline def setThroughResourcesUndefined: Self = StObject.set(x, "ThroughResources", js.undefined)
    
    inline def setThroughResourcesVarargs(value: ThroughResourcesStatementRequest*): Self = StObject.set(x, "ThroughResources", js.Array(value*))
  }
}
