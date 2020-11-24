package typings.atomically

import typings.atomically.typesMod.Exception
import typings.atomically.typesMod.FN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("atomically/dist/utils/attemptify", JSImport.Namespace)
@js.native
object attemptifyMod extends js.Object {
  
  def attemptifyAsync[T /* <: FN[js.Array[_], _] */](fn: T): T = js.native
  def attemptifyAsync[T /* <: FN[js.Array[_], _] */](fn: T, onError: FN[js.Array[Exception], _]): T = js.native
  
  def attemptifySync[T /* <: FN[js.Array[_], _] */](fn: T): T = js.native
  def attemptifySync[T /* <: FN[js.Array[_], _] */](fn: T, onError: FN[js.Array[Exception], _]): T = js.native
}
