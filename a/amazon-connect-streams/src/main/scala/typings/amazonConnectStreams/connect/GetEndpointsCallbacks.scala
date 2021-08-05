package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEndpointsCallbacks extends StObject {
  
  val failure: js.UndefOr[SuccessFailCallback[js.Array[String]]] = js.undefined
  
  def success(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: js.Array[GetEndpointsResult]
  ): Unit
}
object GetEndpointsCallbacks {
  
  inline def apply(success: js.Array[GetEndpointsResult] => Unit): GetEndpointsCallbacks = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetEndpointsCallbacks]
  }
  
  extension [Self <: GetEndpointsCallbacks](x: Self) {
    
    inline def setFailure(value: js.Array[String] => Unit): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
    
    inline def setSuccess(value: js.Array[GetEndpointsResult] => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
