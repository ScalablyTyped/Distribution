package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsManagedResources extends StObject {
  
  /**
    *  The choice of application destination that you specify. 
    */
  var targetDestination: AwsManagedTargetDestinations
}
object AwsManagedResources {
  
  inline def apply(targetDestination: AwsManagedTargetDestinations): AwsManagedResources = {
    val __obj = js.Dynamic.literal(targetDestination = targetDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsManagedResources]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsManagedResources] (val x: Self) extends AnyVal {
    
    inline def setTargetDestination(value: AwsManagedTargetDestinations): Self = StObject.set(x, "targetDestination", value.asInstanceOf[js.Any])
    
    inline def setTargetDestinationVarargs(value: AwsManagedTargetDestination*): Self = StObject.set(x, "targetDestination", js.Array(value*))
  }
}
