package typings.atomically

import typings.atomically.typesMod.Exception
import typings.atomically.typesMod.FN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retryifyMod {
  
  @JSImport("atomically/dist/utils/retryify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def retryifyAsync[T /* <: FN[js.Array[js.Any], js.Any] */](fn: T, isRetriableError: FN[js.Array[Exception], Boolean | Unit]): FN[js.Array[Double], T] = (^.asInstanceOf[js.Dynamic].applyDynamic("retryifyAsync")(fn.asInstanceOf[js.Any], isRetriableError.asInstanceOf[js.Any])).asInstanceOf[FN[js.Array[Double], T]]
  
  @scala.inline
  def retryifySync[T /* <: FN[js.Array[js.Any], js.Any] */](fn: T, isRetriableError: FN[js.Array[Exception], Boolean | Unit]): FN[js.Array[Double], T] = (^.asInstanceOf[js.Dynamic].applyDynamic("retryifySync")(fn.asInstanceOf[js.Any], isRetriableError.asInstanceOf[js.Any])).asInstanceOf[FN[js.Array[Double], T]]
}
