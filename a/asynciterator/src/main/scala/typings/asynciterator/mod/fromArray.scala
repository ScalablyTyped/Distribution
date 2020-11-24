package typings.asynciterator.mod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asynciterator", "fromArray")
@js.native
object fromArray extends js.Object {
  
  def apply[T](items: Iterable[T]): ArrayIterator[T] = js.native
}
