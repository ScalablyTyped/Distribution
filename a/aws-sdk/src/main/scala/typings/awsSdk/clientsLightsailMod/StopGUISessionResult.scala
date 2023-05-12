package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopGUISessionResult extends StObject {
  
  /**
    * The available API operations.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}
object StopGUISessionResult {
  
  inline def apply(): StopGUISessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopGUISessionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopGUISessionResult] (val x: Self) extends AnyVal {
    
    inline def setOperations(value: OperationList): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: Operation*): Self = StObject.set(x, "operations", js.Array(value*))
  }
}
