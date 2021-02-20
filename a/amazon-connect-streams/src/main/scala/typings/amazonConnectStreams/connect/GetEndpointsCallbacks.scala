package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEndpointsCallbacks extends StObject {
  
  val failure: js.UndefOr[SuccessFailCallback[js.Array[String]]] = js.native
  
  def success(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: js.Array[GetEndpointsResult]
  ): Unit = js.native
}
object GetEndpointsCallbacks {
  
  @scala.inline
  def apply(success: js.Array[GetEndpointsResult] => Unit): GetEndpointsCallbacks = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetEndpointsCallbacks]
  }
  
  @scala.inline
  implicit class GetEndpointsCallbacksMutableBuilder[Self <: GetEndpointsCallbacks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: js.Array[String] => Unit): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
    
    @scala.inline
    def setSuccess(value: js.Array[GetEndpointsResult] => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
