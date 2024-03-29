package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloneStackResult extends StObject {
  
  /**
    * The cloned stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
}
object CloneStackResult {
  
  inline def apply(): CloneStackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloneStackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloneStackResult] (val x: Self) extends AnyVal {
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
