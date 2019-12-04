package typings.apolloDashClient

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/util/arrays", JSImport.Namespace)
@js.native
object utilArraysMod extends js.Object {
  def isNonEmptyArray[T](): /* is std.Array<T> */ Boolean = js.native
  def isNonEmptyArray[T](value: ArrayLike[T]): /* is std.Array<T> */ Boolean = js.native
}

