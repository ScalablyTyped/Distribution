package typings.arrUnion

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("arr-union", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply[T](arrays: ArrayLike[T]*): js.Array[T] = js.native
}
