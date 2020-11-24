package typings.asynciterator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asynciterator", "ClonedIterator")
@js.native
class ClonedIterator[T] protected () extends TransformIterator[T, T] {
  /**
    Creates a new `ClonedIterator`.
    @param {module:asynciterator.AsyncIterator|Readable} [source] The source this iterator copies items from
    */
  def this(source: AsyncIterator[T]) = this()
  
  /* protected */ def _getSourceProperty[P](propertyName: String, callback: js.Function1[/* value */ P, Unit]): Unit = js.native
  
  /* protected */ def _init(): Unit = js.native
  
  var _readPosition: js.Any = js.native
}
