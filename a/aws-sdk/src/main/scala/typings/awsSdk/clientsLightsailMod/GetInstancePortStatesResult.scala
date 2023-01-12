package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstancePortStatesResult extends StObject {
  
  /**
    * An array of objects that describe the firewall port states for the specified instance.
    */
  var portStates: js.UndefOr[InstancePortStateList] = js.undefined
}
object GetInstancePortStatesResult {
  
  inline def apply(): GetInstancePortStatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstancePortStatesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInstancePortStatesResult] (val x: Self) extends AnyVal {
    
    inline def setPortStates(value: InstancePortStateList): Self = StObject.set(x, "portStates", value.asInstanceOf[js.Any])
    
    inline def setPortStatesUndefined: Self = StObject.set(x, "portStates", js.undefined)
    
    inline def setPortStatesVarargs(value: InstancePortState*): Self = StObject.set(x, "portStates", js.Array(value*))
  }
}
