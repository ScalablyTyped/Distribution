package typings.asynciterator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asynciterator", "MultiTransformIterator")
@js.native
class MultiTransformIterator[S, D] protected () extends TransformIterator[S, D] {
  /**
    Creates a new `MultiTransformIterator`.
    @param {module:asynciterator.AsyncIterator|Readable} [source] The source this iterator generates items from
    @param {object|Function} [options] Settings of the iterator, or the transformation function
    @param {integer} [options.maxbufferSize=4] The maximum number of items to keep in the buffer
    @param {boolean} [options.autoStart=true] Whether buffering starts directly after construction
    @param {module:asynciterator.AsyncIterator} [options.source] The source this iterator generates items from
    @param {integer} [options.offset] The number of items to skip
    @param {integer} [options.limit] The maximum number of items
    @param {Function} [options.filter] A function to synchronously filter items from the source
    @param {Function} [options.map] A function to synchronously transform items from the source
    @param {Function} [options.transform] A function to asynchronously transform items from the source
    @param {boolean} [options.optional=false] If transforming is optional, the original item is pushed when its mapping yields `null` or its transformation yields no items
    @param {Function} [options.multiTransform] A function to asynchronously transform items to iterators from the source
    @param {Array|module:asynciterator.AsyncIterator} [options.prepend] Items to insert before the source items
    @param {Array|module:asynciterator.AsyncIterator} [options.append]  Items to insert after the source items
    */
  def this(source: AsyncIterator[S]) = this()
  def this(
    source: AsyncIterator[S],
    options: ((MultiTransformOptions[S, D]) with (js.Function1[/* item */ S, AsyncIterator[D]])) | (MultiTransformOptions[S, D])
  ) = this()
  
  /**
    Creates a transformer for the given item.
    @param {object} item The last read item from the source
    @returns {module:asynciterator.AsyncIterator} An iterator that transforms the given item
    */
  /* protected */ def _createTransformer(item: S): AsyncIterator[D] = js.native
  
  var _transformerQueue: js.Any = js.native
}
