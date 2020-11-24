package typings.atomically

import typings.atomically.typesMod.Exception
import typings.atomically.typesMod.FN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("atomically/dist/utils/retryify", JSImport.Namespace)
@js.native
object retryifyMod extends js.Object {
  
  def retryifyAsync[T /* <: FN[js.Array[_], _] */](fn: T, isRetriableError: FN[js.Array[Exception], Boolean | Unit]): FN[js.Array[Double], T] = js.native
  
  def retryifySync[T /* <: FN[js.Array[_], _] */](fn: T, isRetriableError: FN[js.Array[Exception], Boolean | Unit]): FN[js.Array[Double], T] = js.native
}
