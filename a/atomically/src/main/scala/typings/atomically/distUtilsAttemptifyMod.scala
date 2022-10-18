package typings.atomically

import typings.atomically.distTypesMod.Exception
import typings.atomically.distTypesMod.FN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsAttemptifyMod {
  
  @JSImport("atomically/dist/utils/attemptify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attemptifyAsync[T /* <: FN[js.Array[Any], Any] */](fn: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("attemptifyAsync")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def attemptifyAsync[T /* <: FN[js.Array[Any], Any] */](fn: T, onError: FN[js.Array[Exception], Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("attemptifyAsync")(fn.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def attemptifySync[T /* <: FN[js.Array[Any], Any] */](fn: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("attemptifySync")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def attemptifySync[T /* <: FN[js.Array[Any], Any] */](fn: T, onError: FN[js.Array[Exception], Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("attemptifySync")(fn.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[T]
}
