package typings.atomically

import typings.atomically.distTypesMod.Exception
import typings.atomically.distTypesMod.FN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsRetryifyMod {
  
  @JSImport("atomically/dist/utils/retryify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def retryifyAsync[T /* <: FN[js.Array[Any], Any] */](fn: T, isRetriableError: FN[js.Array[Exception], Boolean | Unit]): FN[js.Array[Double], T] = (^.asInstanceOf[js.Dynamic].applyDynamic("retryifyAsync")(fn.asInstanceOf[js.Any], isRetriableError.asInstanceOf[js.Any])).asInstanceOf[FN[js.Array[Double], T]]
  
  inline def retryifySync[T /* <: FN[js.Array[Any], Any] */](fn: T, isRetriableError: FN[js.Array[Exception], Boolean | Unit]): FN[js.Array[Double], T] = (^.asInstanceOf[js.Dynamic].applyDynamic("retryifySync")(fn.asInstanceOf[js.Any], isRetriableError.asInstanceOf[js.Any])).asInstanceOf[FN[js.Array[Double], T]]
}
