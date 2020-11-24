package typings.asynciterator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asynciterator", "UnionIterator")
@js.native
class UnionIterator[T] protected () extends BufferedIterator[T] {
  /**
    Creates a new `UnionIterator`.
    @param {module:asynciterator.AsyncIterator|Array} [sources] The sources to read from
    @param {object} [options] Settings of the iterator
    */
  def this(sources: AsyncIteratorOrArray[AsyncIterator[T]]) = this()
  def this(sources: AsyncIteratorOrArray[AsyncIterator[T]], options: BufferedIteratorOptions) = this()
  
  /* protected */ def _addSource(source: InternalSource[T]): Unit = js.native
  
  var _currentSource: js.Any = js.native
  
  /* protected */ def _loadSources(): Unit = js.native
  
  var _pending: js.Any = js.native
  
  /* protected */ def _removeEmptySources(): Unit = js.native
  
  var _sources: js.Any = js.native
}
