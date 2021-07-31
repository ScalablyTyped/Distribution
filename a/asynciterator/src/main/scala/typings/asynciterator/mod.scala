package typings.asynciterator

import org.scalablytyped.runtime.StringDictionary
import typings.asynciterator.anon.AutoStart
import typings.asynciterator.anon.End
import typings.asynciterator.anon.MaxBufferSize
import typings.asynciterator.taskschedulerMod.Task
import typings.asynciterator.taskschedulerMod.TaskScheduler
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("asynciterator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("asynciterator", "ArrayIterator")
  @js.native
  /**
    Creates a new `ArrayIterator`.
    @param {Array} items The items that will be emitted.
    */
  class ArrayIterator[T] () extends AsyncIterator[T] {
    def this(items: Iterable[T]) = this()
    def this(items: Unit, hasAutoStart: AutoStart) = this()
    def this(items: Iterable[T], hasAutoStart: AutoStart) = this()
    
    var _buffer: js.Any = js.native
  }
  
  @JSImport("asynciterator", "AsyncIterator")
  @js.native
  /** Creates a new `AsyncIterator`. */
  class AsyncIterator[T] () extends EventEmitter {
    def this(initialState: Double) = this()
    
    /**
      Changes the iterator to the given state if possible and necessary,
      possibly emitting events to signal that change.
      @protected
      @param {integer} newState The ID of the new state
      @param {boolean} [eventAsync=false] Whether resulting events should be emitted asynchronously
      @returns {boolean} Whether the state was changed
      @emits module:asynciterator.AsyncIterator.end
      */
    /* protected */ def _changeState(newState: Double): Boolean = js.native
    /* protected */ def _changeState(newState: Double, eventAsync: Boolean): Boolean = js.native
    
    /* protected */ def _destroy(cause: Unit, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
    /**
      Called by {@link module:asynciterator.AsyncIterator#destroy}.
      Implementers can override this, but this should not be called directly.
      @param {?Error} cause The reason why the iterator is destroyed.
      @param {Function} callback A callback function with an optional error argument.
      */
    /* protected */ def _destroy(cause: Error, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
    
    /**
      Ends the iterator and cleans up.
      Should never be called before {@link module:asynciterator.AsyncIterator#close};
      typically, `close` is responsible for calling `_end`.
      @param {boolean} [destroy] If the iterator should be forcefully destroyed.
      @protected
      @emits module:asynciterator.AsyncIterator.end
      */
    /* protected */ def _end(): Unit = js.native
    /* protected */ def _end(destroy: Boolean): Unit = js.native
    
    /**
      Asynchronously calls `_end`.
      @protected
      */
    /* protected */ def _endAsync(): Unit = js.native
    
    var _properties: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var _propertyCallbacks: js.UndefOr[StringDictionary[js.Array[js.Function1[/* value */ js.Any, Unit]]]] = js.native
    
    var _readable: js.Any = js.native
    
    var _state: Double = js.native
    
    /**
      Generates details for a textual representation of the iterator.
      @protected
      */
    /* protected */ def _toStringDetails(): String = js.native
    
    /**
      Appends the items after those of the current iterator.
      After this operation, only read the returned iterator instead of the current one.
      @param {Array|module:asynciterator.AsyncIterator} items Items to insert after this iterator's (remaining) items
      @returns {module:asynciterator.AsyncIterator} A new iterator that appends items to this iterator
      */
    def append(items: js.Array[T]): AsyncIterator[T] = js.native
    def append(items: AsyncIterator[T]): AsyncIterator[T] = js.native
    
    /**
      Stops the iterator from generating new items.
      Already generated items or terminating items can still be emitted.
      After this, the iterator will end asynchronously.
      @emits module:asynciterator.AsyncIterator.end
      */
    def close(): Unit = js.native
    
    /**
      Gets whether the iterator has stopped generating new items.
      @type boolean
      @readonly
      */
    def closed: Boolean = js.native
    
    /**
      Copies the given properties from the source iterator.
      @param {module:asynciterator.AsyncIterator} source The iterator to copy from
      @param {Array} propertyNames List of property names to copy
      */
    def copyProperties(source: AsyncIterator[js.Any], propertyNames: js.Array[String]): Unit = js.native
    
    /**
      Destroy the iterator and stop it from generating new items.
      This will not do anything if the iterator was already ended or destroyed.
      All internal resources will be released an no new items will be emitted,
      even not already generated items.
      Implementors should not override this method,
      but instead implement {@link module:asynciterator.AsyncIterator#_destroy}.
      @param {Error} [cause] An optional error to emit.
      @emits module:asynciterator.AsyncIterator.end
      @emits module:asynciterator.AsyncIterator.error Only if an error is passed.
      */
    def destroy(): Unit = js.native
    def destroy(cause: Error): Unit = js.native
    
    /**
      Gets whether the iterator has been destroyed.
      @type boolean
      @readonly
      */
    def destroyed: Boolean = js.native
    
    /**
      Gets whether the iterator will not emit anymore items,
      either due to being closed or due to being destroyed.
      @type boolean
      @readonly
      */
    def done: Boolean = js.native
    
    /**
      Gets whether the iterator has finished emitting items.
      @type boolean
      @readonly
      */
    def ended: Boolean = js.native
    
    /**
      Return items from this iterator that match the filter.
      After this operation, only read the returned iterator instead of the current one.
      @param {Function} filter A filter function to call on this iterator's (remaining) items
      @param {object?} self The `this` pointer for the filter function
      @returns {module:asynciterator.AsyncIterator} A new iterator that filters items from this iterator
      */
    def filter(filter: js.Function1[/* item */ T, Boolean]): AsyncIterator[T] = js.native
    def filter(filter: js.Function1[/* item */ T, Boolean], self: js.Any): AsyncIterator[T] = js.native
    
    /**
      The iterator emits a `readable` event when it might have new items available
      after having had no items available right before this event.
      If the iterator is not in flow mode, items can be retrieved
      by calling {@link module:asynciterator.AsyncIterator#read}.
      @event module:asynciterator.readable
      */
    /**
      The iterator emits a `data` event with a new item as soon as it becomes available.
      When one or more listeners are attached to the `data` event,
      the iterator switches to _flow mode_,
      generating and emitting new items as fast as possible.
      This drains the source and might create backpressure on the consumers,
      so only subscribe to this event if this behavior is intended.
      In flow mode, don't use {@link module:asynciterator.AsyncIterator#read}.
      To switch back to _on-demand mode_, remove all listeners from the `data` event.
      You can then obtain items through `read` again.
      @event module:asynciterator.data
      @param {object} item The new item
      */
    /**
      Invokes the callback for each remaining item in the iterator.
      Switches the iterator to flow mode.
      @param {Function} callback A function that will be called with each item
      @param {object?} self The `this` pointer for the callback
      */
    def forEach(callback: js.Function1[/* item */ T, Unit]): Unit = js.native
    def forEach(callback: js.Function1[/* item */ T, Unit], self: js.Object): Unit = js.native
    
    /**
      Retrieves all properties of the iterator.
      @returns {object} An object with property names as keys.
      */
    def getProperties(): StringDictionary[js.Any] = js.native
    
    /**
      Retrieves the property with the given name from the iterator.
      If no callback is passed, it returns the value of the property
      or `undefined` if the property is not set.
      If a callback is passed, it returns `undefined`
      and calls the callback with the property the moment it is set.
      @param {string} propertyName The name of the property to retrieve
      @param {Function?} [callback] A one-argument callback to receive the property value
      @returns {object?} The value of the property (if set and no callback is given)
      */
    def getProperty[P](propertyName: String): js.UndefOr[P] = js.native
    def getProperty[P](propertyName: String, callback: js.Function1[/* value */ P, Unit]): js.UndefOr[P] = js.native
    
    /**
      Maps items from this iterator using the given function.
      After this operation, only read the returned iterator instead of the current one.
      @param {Function} map A mapping function to call on this iterator's (remaining) items
      @param {object?} self The `this` pointer for the mapping function
      @returns {module:asynciterator.AsyncIterator} A new iterator that maps the items from this iterator
      */
    def map[D](map: js.Function1[/* item */ T, D]): AsyncIterator[D] = js.native
    def map[D](map: js.Function1[/* item */ T, D], self: js.Any): AsyncIterator[D] = js.native
    
    /**
      Prepends the items after those of the current iterator.
      After this operation, only read the returned iterator instead of the current one.
      @param {Array|module:asynciterator.AsyncIterator} items Items to insert before this iterator's (remaining) items
      @returns {module:asynciterator.AsyncIterator} A new iterator that prepends items to this iterator
      */
    def prepend(items: js.Array[T]): AsyncIterator[T] = js.native
    def prepend(items: AsyncIterator[T]): AsyncIterator[T] = js.native
    
    /**
      Limits the current iterator to the given range.
      The current iterator may not be read anymore until the returned iterator ends.
      @param {integer} start Index of the first item to return
      @param {integer} end Index of the last item to return
      @returns {module:asynciterator.AsyncIterator} A new iterator with items in the given range
      */
    def range(start: Double, end: Double): AsyncIterator[T] = js.native
    
    /**
      Tries to read the next item from the iterator.
      This is the main method for reading the iterator in _on-demand mode_,
      where new items are only created when needed by consumers.
      If no items are currently available, this methods returns `null`.
      The {@link module:asynciterator.event:readable} event
      will then signal when new items might be ready.
      To read all items from the iterator,
      switch to _flow mode_ by subscribing
      to the {@link module:asynciterator.event:data} event.
      When in flow mode, do not use the `read` method.
      @returns {object?} The next item, or `null` if none is available
      */
    def read(): T | Null = js.native
    
    /**
      The `end` event is emitted after the last item of the iterator has been read.
      @event module:asynciterator.end
      */
    /**
      Gets or sets whether this iterator might have items available for read.
      A value of `false` means there are _definitely_ no items available;
      a value of `true` means items _might_ be available.
      @type boolean
      @emits module:asynciterator.AsyncIterator.readable
      */
    def readable: Boolean = js.native
    def readable_=(readable: Boolean): Unit = js.native
    
    /**
      Sets all of the given properties.
      @param {object} properties Key/value pairs of properties to set
      */
    def setProperties(properties: StringDictionary[js.Any]): Unit = js.native
    
    /**
      Sets the property with the given name to the value.
      @param {string} propertyName The name of the property to set
      @param {object?} value The new value of the property
      */
    def setProperty[P](propertyName: String, value: P): Unit = js.native
    
    /**
      Skips the given number of items from the current iterator.
      The current iterator may not be read anymore until the returned iterator ends.
      @param {integer} offset The number of items to skip
      @returns {module:asynciterator.AsyncIterator} A new iterator that skips the given number of items
      */
    def skip(offset: Double): AsyncIterator[T] = js.native
    
    /**
      Surrounds items of the current iterator with the given items.
      After this operation, only read the returned iterator instead of the current one.
      @param {Array|module:asynciterator.AsyncIterator} prepend Items to insert before this iterator's (remaining) items
      @param {Array|module:asynciterator.AsyncIterator} append Items to insert after this iterator's (remaining) items
      @returns {module:asynciterator.AsyncIterator} A new iterator that appends and prepends items to this iterator
      */
    def surround(prepend: AsyncIteratorOrArray[T], append: AsyncIteratorOrArray[T]): AsyncIterator[T] = js.native
    
    /**
      Limits the current iterator to the given number of items.
      The current iterator may not be read anymore until the returned iterator ends.
      @param {integer} limit The maximum number of items
      @returns {module:asynciterator.AsyncIterator} A new iterator with at most the given number of items
      */
    def take(limit: Double): AsyncIterator[T] = js.native
    
    /**
      Transforms items from this iterator.
      After this operation, only read the returned iterator instead of the current one.
      @param {object|Function} [options] Settings of the iterator, or the transformation function
      @param {integer} [options.maxbufferSize=4] The maximum number of items to keep in the buffer
      @param {boolean} [options.autoStart=true] Whether buffering starts directly after construction
      @param {integer} [options.offset] The number of items to skip
      @param {integer} [options.limit] The maximum number of items
      @param {Function} [options.filter] A function to synchronously filter items from the source
      @param {Function} [options.map] A function to synchronously transform items from the source
      @param {Function} [options.transform] A function to asynchronously transform items from the source
      @param {boolean} [options.optional=false] If transforming is optional, the original item is pushed when its mapping yields `null` or its transformation yields no items
      @param {Array|module:asynciterator.AsyncIterator} [options.prepend] Items to insert before the source items
      @param {Array|module:asynciterator.AsyncIterator} [options.append]  Items to insert after the source items
      @returns {module:asynciterator.AsyncIterator} A new iterator that maps the items from this iterator
      */
    def transform[D](options: TransformOptions[T, D]): AsyncIterator[D] = js.native
  }
  
  @JSImport("asynciterator", "BufferedIterator")
  @js.native
  /**
    Creates a new `BufferedIterator`.
    @param {object} [options] Settings of the iterator
    @param {integer} [options.maxBufferSize=4] The number of items to preload in the internal buffer
    @param {boolean} [options.autoStart=true] Whether buffering starts directly after construction
    */
  class BufferedIterator[T] () extends AsyncIterator[T] {
    def this(hasMaxBufferSizeAutoStart: MaxBufferSize) = this()
    
    /**
      Writes beginning items and opens iterator resources.
      Should never be called before {@link BufferedIterator#_init};
      typically, `_init` is responsible for calling `_begin`.
      @protected
      @param {function} done To be called when initialization is complete
      */
    /* protected */ def _begin(done: js.Function0[Unit]): Unit = js.native
    
    var _buffer: js.Any = js.native
    
    /**
      Stops the iterator from generating new items,
      switching from `CLOSING` state into `CLOSED` state.
      @protected
      @emits module:asynciterator.AsyncIterator.end
      */
    /* protected */ def _completeClose(): Unit = js.native
    
    /**
      Fills the internal buffer until `this._maxBufferSize` items are present.
      This method calls {@link BufferedIterator#_read} to fetch items.
      @protected
      @emits module:asynciterator.AsyncIterator.readable
      */
    /* protected */ def _fillBuffer(): Unit = js.native
    
    /**
      Schedules `_fillBuffer` asynchronously.
      */
    /* protected */ def _fillBufferAsync(): Unit = js.native
    
    /**
      Writes terminating items and closes iterator resources.
      Should never be called before {@link BufferedIterator#close};
      typically, `close` is responsible for calling `_flush`.
      @protected
      @param {function} done To be called when termination is complete
      */
    /* protected */ def _flush(done: js.Function0[Unit]): Unit = js.native
    
    /**
      Initializing the iterator by calling {@link BufferedIterator#_begin}
      and changing state from INIT to OPEN.
      @protected
      @param {boolean} autoStart Whether reading of items should immediately start after OPEN.
      */
    /* protected */ def _init(autoStart: Boolean): Unit = js.native
    
    var _maxBufferSize: js.Any = js.native
    
    /**
      Adds an item to the internal buffer.
      @protected
      @param {object} item The item to add
      @emits module:asynciterator.AsyncIterator.readable
      */
    /* protected */ def _push(item: T): Unit = js.native
    
    var _pushedCount: Double = js.native
    
    /**
      Tries to generate the given number of items.
      Implementers should add `count` items through {@link BufferedIterator#_push}.
      @protected
      @param {integer} count The number of items to generate
      @param {function} done To be called when reading is complete
      */
    /* protected */ def _read(count: Double, done: js.Function0[Unit]): Unit = js.native
    
    var _reading: Boolean = js.native
    
    /**
      The maximum number of items to preload in the internal buffer.
      A `BufferedIterator` tries to fill its buffer as far as possible.
      Set to `Infinity` to fully drain the source.
      @type number
      */
    def maxBufferSize: Double = js.native
    def maxBufferSize_=(maxBufferSize: Double): Unit = js.native
  }
  
  @JSImport("asynciterator", "CLOSED")
  @js.native
  val CLOSED: Double = js.native
  
  @JSImport("asynciterator", "CLOSING")
  @js.native
  val CLOSING: Double = js.native
  
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
  
  @JSImport("asynciterator", "DESTROYED")
  @js.native
  val DESTROYED: Double = js.native
  
  @JSImport("asynciterator", "ENDED")
  @js.native
  val ENDED: Double = js.native
  
  @JSImport("asynciterator", "EmptyIterator")
  @js.native
  /** Creates a new `EmptyIterator`. */
  class EmptyIterator[T] () extends AsyncIterator[T]
  
  @JSImport("asynciterator", "INIT")
  @js.native
  val INIT: Double = js.native
  
  @JSImport("asynciterator", "IntegerIterator")
  @js.native
  /**
    Creates a new `IntegerIterator`.
    @param {object} [options] Settings of the iterator
    @param {integer} [options.start=0] The first number to emit
    @param {integer} [options.end=Infinity] The last number to emit
    @param {integer} [options.step=1] The increment between two numbers
    */
  class IntegerIterator () extends AsyncIterator[Double] {
    def this(hasStartStepEnd: End) = this()
    
    var _last: js.Any = js.native
    
    var _next: js.Any = js.native
    
    var _step: js.Any = js.native
  }
  
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
      options: (MultiTransformOptions[S, D]) & (js.Function1[/* item */ S, AsyncIterator[D]])
    ) = this()
    def this(source: AsyncIterator[S], options: MultiTransformOptions[S, D]) = this()
    
    /**
      Creates a transformer for the given item.
      @param {object} item The last read item from the source
      @returns {module:asynciterator.AsyncIterator} An iterator that transforms the given item
      */
    /* protected */ def _createTransformer(item: S): AsyncIterator[D] = js.native
    
    var _transformerQueue: js.Any = js.native
  }
  
  @JSImport("asynciterator", "OPEN")
  @js.native
  val OPEN: Double = js.native
  
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
      source: Unit,
      options: (TransformOptions[S, D]) & (js.Function2[/* item */ S, /* done */ js.Function0[Unit], Unit])
    ) = this()
    def this(source: Unit, options: TransformOptions[S, D]) = this()
    def this(
      source: SourceExpression[S],
      options: (TransformOptions[S, D]) & (js.Function2[/* item */ S, /* done */ js.Function0[Unit], Unit])
    ) = this()
    def this(source: SourceExpression[S], options: TransformOptions[S, D]) = this()
    
    var _appender: js.Any = js.native
    
    var _filter: js.Any = js.native
    
    /* protected */ def _insert(inserter: Unit, done: js.Function0[Unit]): Unit = js.native
    /* protected */ def _insert(inserter: AsyncIterator[D], done: js.Function0[Unit]): Unit = js.native
    
    var _limit: js.Any = js.native
    
    var _map: js.Any = js.native
    
    var _offset: js.Any = js.native
    
    var _prepender: js.Any = js.native
    
    /* protected */ def _readAndTransformSimple(count: Double, next: js.Function0[Unit], done: js.Function0[Unit]): Unit = js.native
  }
  
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
    def this(source: Unit, options: TransformIteratorOptions[S]) = this()
    def this(source: SourceExpression[S], options: TransformIteratorOptions[S]) = this()
    
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
    /* protected */ def _validateSource(source: Unit, allowDestination: Boolean): InternalSource[S] = js.native
    /* protected */ def _validateSource(source: AsyncIterator[S]): InternalSource[S] = js.native
    /* protected */ def _validateSource(source: AsyncIterator[S], allowDestination: Boolean): InternalSource[S] = js.native
    
    /**
      The source this iterator generates items from.
      @type module:asynciterator.AsyncIterator
      */
    def source: js.UndefOr[AsyncIterator[S]] = js.native
    def source_=(value: js.UndefOr[AsyncIterator[S]]): Unit = js.native
  }
  
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
  
  @scala.inline
  def empty[T](): EmptyIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[EmptyIterator[T]]
  
  @scala.inline
  def fromArray[T](items: Iterable[T]): ArrayIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(items.asInstanceOf[js.Any]).asInstanceOf[ArrayIterator[T]]
  
  @scala.inline
  def getTaskScheduler(): TaskScheduler = ^.asInstanceOf[js.Dynamic].applyDynamic("getTaskScheduler")().asInstanceOf[TaskScheduler]
  
  @scala.inline
  def range(start: Double, end: Double): IntegerIterator = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[IntegerIterator]
  @scala.inline
  def range(start: Double, end: Double, step: Double): IntegerIterator = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[IntegerIterator]
  
  @scala.inline
  def scheduleTask(task: Task): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scheduleTask")(task.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setTaskScheduler(scheduler: TaskScheduler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTaskScheduler")(scheduler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def single[T](item: T): SingletonIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("single")(item.asInstanceOf[js.Any]).asInstanceOf[SingletonIterator[T]]
  
  @scala.inline
  def union[T](sources: AsyncIteratorOrArray[AsyncIterator[T]]): UnionIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(sources.asInstanceOf[js.Any]).asInstanceOf[UnionIterator[T]]
  
  @scala.inline
  def wrap[T](source: js.Promise[EventEmitter]): TransformIterator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(source.asInstanceOf[js.Any]).asInstanceOf[TransformIterator[T, T]]
  @scala.inline
  def wrap[T](source: js.Promise[EventEmitter], options: TransformIteratorOptions[T]): TransformIterator[T, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TransformIterator[T, T]]
  @scala.inline
  def wrap[T](source: EventEmitter): TransformIterator[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(source.asInstanceOf[js.Any]).asInstanceOf[TransformIterator[T, T]]
  @scala.inline
  def wrap[T](source: EventEmitter, options: TransformIteratorOptions[T]): TransformIterator[T, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TransformIterator[T, T]]
  
  type AsyncIteratorOrArray[T] = js.Array[T] | AsyncIterator[T]
  
  type AsyncIteratorOrPromise[T] = AsyncIterator[T] | js.Promise[AsyncIterator[T]]
  
  trait BufferedIteratorOptions extends StObject {
    
    var autoStart: js.UndefOr[Boolean] = js.undefined
    
    var maxBufferSize: js.UndefOr[Double] = js.undefined
  }
  object BufferedIteratorOptions {
    
    @scala.inline
    def apply(): BufferedIteratorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BufferedIteratorOptions]
    }
    
    @scala.inline
    implicit class BufferedIteratorOptionsMutableBuilder[Self <: BufferedIteratorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
      
      @scala.inline
      def setMaxBufferSize(value: Double): Self = StObject.set(x, "maxBufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBufferSizeUndefined: Self = StObject.set(x, "maxBufferSize", js.undefined)
    }
  }
  
  @js.native
  trait InternalSource[T] extends AsyncIterator[T] {
    
    var _destination: AsyncIterator[js.Any] = js.native
  }
  
  trait MultiTransformOptions[S, D]
    extends StObject
       with TransformOptions[S, D] {
    
    var multiTransform: js.UndefOr[js.Function1[/* item */ S, AsyncIterator[D]]] = js.undefined
  }
  object MultiTransformOptions {
    
    @scala.inline
    def apply[S, D](): MultiTransformOptions[S, D] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiTransformOptions[S, D]]
    }
    
    @scala.inline
    implicit class MultiTransformOptionsMutableBuilder[Self <: MultiTransformOptions[?, ?], S, D] (val x: Self & (MultiTransformOptions[S, D])) extends AnyVal {
      
      @scala.inline
      def setMultiTransform(value: /* item */ S => AsyncIterator[D]): Self = StObject.set(x, "multiTransform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMultiTransformUndefined: Self = StObject.set(x, "multiTransform", js.undefined)
    }
  }
  
  type SourceExpression[T] = AsyncIteratorOrPromise[T] | js.Function0[AsyncIteratorOrPromise[T]]
  
  trait TransformIteratorOptions[S]
    extends StObject
       with BufferedIteratorOptions {
    
    var destroySource: js.UndefOr[Boolean] = js.undefined
    
    var optional: js.UndefOr[Boolean] = js.undefined
    
    var source: js.UndefOr[SourceExpression[S]] = js.undefined
  }
  object TransformIteratorOptions {
    
    @scala.inline
    def apply[S](): TransformIteratorOptions[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformIteratorOptions[S]]
    }
    
    @scala.inline
    implicit class TransformIteratorOptionsMutableBuilder[Self <: TransformIteratorOptions[?], S] (val x: Self & TransformIteratorOptions[S]) extends AnyVal {
      
      @scala.inline
      def setDestroySource(value: Boolean): Self = StObject.set(x, "destroySource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroySourceUndefined: Self = StObject.set(x, "destroySource", js.undefined)
      
      @scala.inline
      def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      @scala.inline
      def setSource(value: SourceExpression[S]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceFunction0(value: () => AsyncIteratorOrPromise[S]): Self = StObject.set(x, "source", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  trait TransformOptions[S, D]
    extends StObject
       with TransformIteratorOptions[S] {
    
    var append: js.UndefOr[AsyncIteratorOrArray[D]] = js.undefined
    
    var filter: js.UndefOr[js.Function1[/* item */ S, Boolean]] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var map: js.UndefOr[js.Function1[/* item */ S, D]] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var prepend: js.UndefOr[AsyncIteratorOrArray[D]] = js.undefined
    
    var transform: js.UndefOr[
        js.Function3[
          /* item */ S, 
          /* done */ js.Function0[Unit], 
          /* push */ js.Function1[/* item */ D, Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object TransformOptions {
    
    @scala.inline
    def apply[S, D](): TransformOptions[S, D] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformOptions[S, D]]
    }
    
    @scala.inline
    implicit class TransformOptionsMutableBuilder[Self <: TransformOptions[?, ?], S, D] (val x: Self & (TransformOptions[S, D])) extends AnyVal {
      
      @scala.inline
      def setAppend(value: AsyncIteratorOrArray[D]): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      @scala.inline
      def setAppendVarargs(value: D*): Self = StObject.set(x, "append", js.Array(value :_*))
      
      @scala.inline
      def setFilter(value: /* item */ S => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setMap(value: /* item */ S => D): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPrepend(value: AsyncIteratorOrArray[D]): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
      
      @scala.inline
      def setPrependVarargs(value: D*): Self = StObject.set(x, "prepend", js.Array(value :_*))
      
      @scala.inline
      def setTransform(
        value: (/* item */ S, /* done */ js.Function0[Unit], /* push */ js.Function1[/* item */ D, Unit]) => Unit
      ): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
}
