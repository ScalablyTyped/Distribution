package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartGUISessionResult extends StObject {
  
  /**
    * The available API operations.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}
object StartGUISessionResult {
  
  inline def apply(): StartGUISessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartGUISessionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartGUISessionResult] (val x: Self) extends AnyVal {
    
    inline def setOperations(value: OperationList): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: Operation*): Self = StObject.set(x, "operations", js.Array(value*))
  }
}
