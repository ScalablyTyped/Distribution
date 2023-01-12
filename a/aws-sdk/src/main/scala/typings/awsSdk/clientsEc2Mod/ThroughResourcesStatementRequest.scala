package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThroughResourcesStatementRequest extends StObject {
  
  /**
    * The resource statement.
    */
  var ResourceStatement: js.UndefOr[ResourceStatementRequest] = js.undefined
}
object ThroughResourcesStatementRequest {
  
  inline def apply(): ThroughResourcesStatementRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThroughResourcesStatementRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThroughResourcesStatementRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceStatement(value: ResourceStatementRequest): Self = StObject.set(x, "ResourceStatement", value.asInstanceOf[js.Any])
    
    inline def setResourceStatementUndefined: Self = StObject.set(x, "ResourceStatement", js.undefined)
  }
}
