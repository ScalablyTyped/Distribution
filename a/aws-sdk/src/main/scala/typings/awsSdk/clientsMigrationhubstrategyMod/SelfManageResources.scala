package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelfManageResources extends StObject {
  
  /**
    *  Self-managed resources target destination. 
    */
  var targetDestination: SelfManageTargetDestinations
}
object SelfManageResources {
  
  inline def apply(targetDestination: SelfManageTargetDestinations): SelfManageResources = {
    val __obj = js.Dynamic.literal(targetDestination = targetDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelfManageResources]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelfManageResources] (val x: Self) extends AnyVal {
    
    inline def setTargetDestination(value: SelfManageTargetDestinations): Self = StObject.set(x, "targetDestination", value.asInstanceOf[js.Any])
    
    inline def setTargetDestinationVarargs(value: SelfManageTargetDestination*): Self = StObject.set(x, "targetDestination", js.Array(value*))
  }
}
