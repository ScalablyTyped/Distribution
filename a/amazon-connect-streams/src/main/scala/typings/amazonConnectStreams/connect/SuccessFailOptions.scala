package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuccessFailOptions extends StObject {
  
  /** A callback that executes when the operation has an error. */
  val failure: js.UndefOr[SuccessFailCallback[js.Array[String]]] = js.undefined
  
  /** A callback that executes when the operation completes successfully. */
  val success: js.UndefOr[SuccessFailCallback[js.Array[js.Any]]] = js.undefined
}
object SuccessFailOptions {
  
  inline def apply(): SuccessFailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuccessFailOptions]
  }
  
  extension [Self <: SuccessFailOptions](x: Self) {
    
    inline def setFailure(value: js.Array[String] => Unit): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
    
    inline def setSuccess(value: js.Array[js.Any] => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
