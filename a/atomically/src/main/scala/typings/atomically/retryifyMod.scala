package typings.atomically

import typings.atomically.typesMod.Exception
import typings.atomically.typesMod.FN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retryifyMod {
  
  @JSImport("atomically/dist/utils/retryify", "retryifyAsync")
  @js.native
  def retryifyAsync[T /* <: FN[js.Array[_], _] */](fn: T, isRetriableError: FN[js.Array[Exception], Boolean | Unit]): FN[js.Array[Double], T] = js.native
  
  @JSImport("atomically/dist/utils/retryify", "retryifySync")
  @js.native
  def retryifySync[T /* <: FN[js.Array[_], _] */](fn: T, isRetriableError: FN[js.Array[Exception], Boolean | Unit]): FN[js.Array[Double], T] = js.native
}
