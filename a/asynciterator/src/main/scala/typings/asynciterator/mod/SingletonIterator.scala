package typings.asynciterator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asynciterator", "SingletonIterator")
@js.native
class SingletonIterator[T] protected () extends AsyncIterator[T] {
  /**
    Creates a new `SingletonIterator`.
    @param {object} item The item that will be emitted.
    */
  def this(item: T) = this()
  
  var _item: js.Any = js.native
}
