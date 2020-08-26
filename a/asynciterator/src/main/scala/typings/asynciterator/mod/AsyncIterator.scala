package typings.asynciterator.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asynciterator", "AsyncIterator")
@js.native
/** Creates a new `AsyncIterator`. */
class AsyncIterator[T] () extends EventEmitter {
  def this(initialState: Double) = this()
  var _properties: js.UndefOr[StringDictionary[js.Any]] = js.native
  var _propertyCallbacks: js.UndefOr[StringDictionary[js.Array[js.Function1[/* value */ _, Unit]]]] = js.native
  var _readable: js.Any = js.native
  var _state: Double = js.native
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
  /* protected */ def _destroy(cause: js.UndefOr[scala.Nothing], callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
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
  def copyProperties(source: AsyncIterator[_], propertyNames: js.Array[String]): Unit = js.native
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

