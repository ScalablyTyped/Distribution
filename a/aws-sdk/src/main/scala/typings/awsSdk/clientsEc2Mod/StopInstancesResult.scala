package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopInstancesResult extends StObject {
  
  /**
    * Information about the stopped instances.
    */
  var StoppingInstances: js.UndefOr[InstanceStateChangeList] = js.undefined
}
object StopInstancesResult {
  
  inline def apply(): StopInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopInstancesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopInstancesResult] (val x: Self) extends AnyVal {
    
    inline def setStoppingInstances(value: InstanceStateChangeList): Self = StObject.set(x, "StoppingInstances", value.asInstanceOf[js.Any])
    
    inline def setStoppingInstancesUndefined: Self = StObject.set(x, "StoppingInstances", js.undefined)
    
    inline def setStoppingInstancesVarargs(value: InstanceStateChange*): Self = StObject.set(x, "StoppingInstances", js.Array(value*))
  }
}
