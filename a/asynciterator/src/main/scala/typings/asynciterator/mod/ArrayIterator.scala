package typings.asynciterator.mod

import typings.asynciterator.anon.AutoStart
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asynciterator", "ArrayIterator")
@js.native
/**
  Creates a new `ArrayIterator`.
  @param {Array} items The items that will be emitted.
  */
class ArrayIterator[T] () extends AsyncIterator[T] {
  def this(items: Iterable[T]) = this()
  def this(items: js.UndefOr[scala.Nothing], hasAutoStart: AutoStart) = this()
  def this(items: Iterable[T], hasAutoStart: AutoStart) = this()
  
  var _buffer: js.Any = js.native
}
