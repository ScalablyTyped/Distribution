package typings.atomically

import typings.atomically.typesMod.Exception
import typings.atomically.typesMod.FN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attemptifyMod {
  
  @JSImport("atomically/dist/utils/attemptify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attemptifyAsync[T /* <: FN[js.Array[js.Any], js.Any] */](fn: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("attemptifyAsync")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def attemptifyAsync[T /* <: FN[js.Array[js.Any], js.Any] */](fn: T, onError: FN[js.Array[Exception], js.Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("attemptifyAsync")(fn.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def attemptifySync[T /* <: FN[js.Array[js.Any], js.Any] */](fn: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("attemptifySync")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def attemptifySync[T /* <: FN[js.Array[js.Any], js.Any] */](fn: T, onError: FN[js.Array[Exception], js.Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("attemptifySync")(fn.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[T]
}
