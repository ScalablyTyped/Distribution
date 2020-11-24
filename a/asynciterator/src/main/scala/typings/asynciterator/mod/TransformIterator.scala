package typings.asynciterator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asynciterator", "TransformIterator")
@js.native
/**
  Creates a new `TransformIterator`.
  @param {module:asynciterator.AsyncIterator|Readable} [source] The source this iterator generates items from
  @param {object} [options] Settings of the iterator
  @param {integer} [options.maxBufferSize=4] The maximum number of items to keep in the buffer
  @param {boolean} [options.autoStart=true] Whether buffering starts directly after construction
  @param {boolean} [options.optional=false] If transforming is optional, the original item is pushed when its transformation yields no items
  @param {boolean} [options.destroySource=true] Whether the source should be destroyed when this transformed iterator is closed or destroyed
  @param {module:asynciterator.AsyncIterator} [options.source] The source this iterator generates items from
  */
class TransformIterator[S, D] () extends BufferedIterator[D] {
  def this(source: SourceExpression[S]) = this()
  def this(source: js.UndefOr[SourceExpression[S]], options: TransformIteratorOptions[S]) = this()
  
  /* protected */ def _boundPush(item: D): Unit = js.native
  
  /**
    Closes the iterator when pending items are transformed.
    @protected
    */
  /* protected */ def _closeWhenDone(): Unit = js.native
  
  var _createSource: js.UndefOr[js.Function0[AsyncIteratorOrPromise[S]] | Null] = js.native
  
  var _destroySource: Boolean = js.native
  
  /**
    Initializes a source that was set through a promise
    @protected
    */
  /* protected */ def _loadSourceAsync(): Unit = js.native
  
  var _optional: Boolean = js.native
  
  /**
    Tries to transform the item;
    if the transformation yields no items, pushes the original item.
    */
  /* protected */ def _optionalTransform(item: S, done: js.Function0[Unit]): Unit = js.native
  
  /**
    Reads a transforms an item
    */
  /* protected */ def _readAndTransform(next: js.Function0[Unit], done: js.Function0[Unit]): Unit = js.native
  
  var _source: js.UndefOr[InternalSource[S]] = js.native
  
  var _sourceStarted: Boolean = js.native
  
  /**
    Generates items based on the item from the source.
    Implementers should add items through {@link BufferedIterator#_push}.
    The default implementation pushes the source item as-is.
    @protected
    @param {object} item The last read item from the source
    @param {function} done To be called when reading is complete
    @param {function} push A callback to push zero or more transformation results.
    */
  /* protected */ def _transform(item: S, done: js.Function0[Unit], push: js.Function1[/* item */ D, Unit]): Unit = js.native
  
  /**
    Validates whether the given iterator can be used as a source.
    @protected
    @param {object} source The source to validate
    @param {boolean} allowDestination Whether the source can already have a destination
    */
  /* protected */ def _validateSource(): InternalSource[S] = js.native
  /* protected */ def _validateSource(source: js.UndefOr[scala.Nothing], allowDestination: Boolean): InternalSource[S] = js.native
  /* protected */ def _validateSource(source: AsyncIterator[S]): InternalSource[S] = js.native
  /* protected */ def _validateSource(source: AsyncIterator[S], allowDestination: Boolean): InternalSource[S] = js.native
  
  /**
    The source this iterator generates items from.
    @type module:asynciterator.AsyncIterator
    */
  def source: js.UndefOr[AsyncIterator[S]] = js.native
  def source_=(value: js.UndefOr[AsyncIterator[S]]): Unit = js.native
}
