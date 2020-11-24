package typings.asynciterator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asynciterator", "SimpleTransformIterator")
@js.native
/**
  Creates a new `SimpleTransformIterator`.
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
  @param {Array|module:asynciterator.AsyncIterator} [options.prepend] Items to insert before the source items
  @param {Array|module:asynciterator.AsyncIterator} [options.append]  Items to insert after the source items
  */
class SimpleTransformIterator[S, D] () extends TransformIterator[S, D] {
  def this(source: SourceExpression[S]) = this()
  def this(
    source: js.UndefOr[SourceExpression[S]],
    options: ((TransformOptions[S, D]) with (js.Function2[/* item */ S, /* done */ js.Function0[Unit], Unit])) | (TransformOptions[S, D])
  ) = this()
  
  var _appender: js.Any = js.native
  
  var _filter: js.Any = js.native
  
  /* protected */ def _insert(inserter: js.UndefOr[scala.Nothing], done: js.Function0[Unit]): Unit = js.native
  /* protected */ def _insert(inserter: AsyncIterator[D], done: js.Function0[Unit]): Unit = js.native
  
  var _limit: js.Any = js.native
  
  var _map: js.Any = js.native
  
  var _offset: js.Any = js.native
  
  var _prepender: js.Any = js.native
  
  /* protected */ def _readAndTransformSimple(count: Double, next: js.Function0[Unit], done: js.Function0[Unit]): Unit = js.native
}
