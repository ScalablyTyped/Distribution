package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThroughResourcesStatement extends StObject {
  
  /**
    * The resource statement.
    */
  var ResourceStatement: js.UndefOr[typings.awsSdk.clientsEc2Mod.ResourceStatement] = js.undefined
}
object ThroughResourcesStatement {
  
  inline def apply(): ThroughResourcesStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThroughResourcesStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThroughResourcesStatement] (val x: Self) extends AnyVal {
    
    inline def setResourceStatement(value: ResourceStatement): Self = StObject.set(x, "ResourceStatement", value.asInstanceOf[js.Any])
    
    inline def setResourceStatementUndefined: Self = StObject.set(x, "ResourceStatement", js.undefined)
  }
}
