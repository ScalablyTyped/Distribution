package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceStateResult extends StObject {
  
  /**
    * The state of the instance.
    */
  var state: js.UndefOr[InstanceState] = js.undefined
}
object GetInstanceStateResult {
  
  inline def apply(): GetInstanceStateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceStateResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInstanceStateResult] (val x: Self) extends AnyVal {
    
    inline def setState(value: InstanceState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
