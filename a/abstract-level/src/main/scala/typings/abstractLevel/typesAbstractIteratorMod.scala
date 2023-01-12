package typings.abstractLevel

import typings.abstractLevel.typesInterfacesMod.NodeCallback
import typings.abstractLevel.typesInterfacesMod.RangeOptions
import typings.levelTranscoder.libEncodingMod.PartialDecoder
import typings.levelTranscoder.libEncodingMod.PartialEncoder
import typings.levelTranscoder.libEncodingMod.PartialEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAbstractIteratorMod {
  
  @JSImport("abstract-level/types/abstract-iterator", "AbstractIterator")
  @js.native
  open class AbstractIterator[TDatabase, K, V] protected ()
    extends StObject
       with CommonIterator[TDatabase, js.Tuple2[K, V]] {
    def this(db: TDatabase, options: AbstractIteratorOptions[K, V]) = this()
    
    def all(): js.Promise[js.Array[js.Tuple2[K, V]]] = js.native
    def all(callback: NodeCallback[js.Array[js.Tuple2[K, V]]]): Unit = js.native
    def all(options: js.Object): js.Promise[js.Array[js.Tuple2[K, V]]] = js.native
    /**
      * Advance repeatedly and get all (remaining) entries as an array, automatically
      * closing the iterator. Assumes that those entries fit in memory. If that's not the
      * case, instead use {@link next()}, {@link nextv()} or [`for await...of`][1].
      *
      * [1]: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/for-await...of
      *
      * @param options Options (none at the moment, reserved for future use).
      * @param callback Error-first callback. If none is provided, a promise is returned.
      */
    def all(options: js.Object, callback: NodeCallback[js.Array[js.Tuple2[K, V]]]): Unit = js.native
    
    /**
      * Advance to the next entry and yield that entry. When possible, prefer to use
      * [`for await...of`][1] instead.
      *
      * [1]: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/for-await...of
      */
    def next(): js.Promise[js.UndefOr[js.Tuple2[K, V]]] = js.native
    def next(callback: NextCallback[K, V]): Unit = js.native
    
    def nextv(size: Double): js.Promise[js.Array[js.Tuple2[K, V]]] = js.native
    def nextv(size: Double, callback: NodeCallback[js.Array[js.Tuple2[K, V]]]): Unit = js.native
    def nextv(size: Double, options: js.Object): js.Promise[js.Array[js.Tuple2[K, V]]] = js.native
    /**
      * Advance repeatedly and get at most {@link size} amount of entries in a single call.
      * Can be faster than repeated {@link next()} calls. The natural end of the iterator
      * will be signaled by yielding an empty array.
      *
      * @param size Get at most this many entries. Has a soft minimum of 1.
      * @param options Options (none at the moment, reserved for future use).
      * @param callback Error-first callback. If none is provided, a promise is returned.
      */
    def nextv(size: Double, options: js.Object, callback: NodeCallback[js.Array[js.Tuple2[K, V]]]): Unit = js.native
    
    /**
      * Seek to the key closest to {@link target}. Subsequent calls to {@link next()},
      * {@link nextv()} or {@link all()} (including implicit calls in a `for await...of`
      * loop) will yield entries with keys equal to or larger than {@link target}, or equal
      * to or smaller than {@link target} if the {@link AbstractIteratorOptions.reverse}
      * option was true.
      */
    def seek(target: K): Unit = js.native
    def seek[TTarget](target: TTarget, options: AbstractSeekOptions[TTarget]): Unit = js.native
  }
  
  @JSImport("abstract-level/types/abstract-iterator", "AbstractKeyIterator")
  @js.native
  open class AbstractKeyIterator[TDatabase, K] protected ()
    extends StObject
       with CommonIterator[TDatabase, K] {
    def this(db: TDatabase, options: AbstractKeyIteratorOptions[K]) = this()
    
    def all(): js.Promise[js.Array[K]] = js.native
    def all(callback: NodeCallback[js.Array[K]]): Unit = js.native
    def all(options: js.Object): js.Promise[js.Array[K]] = js.native
    /**
      * Advance repeatedly and get all (remaining) keys as an array, automatically closing
      * the iterator. Assumes that those keys fit in memory. If that's not the case, instead
      * use {@link next()}, {@link nextv()} or [`for await...of`][1].
      *
      * [1]: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/for-await...of
      *
      * @param options Options (none at the moment, reserved for future use).
      * @param callback Error-first callback. If none is provided, a promise is returned.
      */
    def all(options: js.Object, callback: NodeCallback[js.Array[K]]): Unit = js.native
    
    /**
      * Advance to the next key and yield that key. When possible, prefer to use
      * [`for await...of`][1] instead.
      *
      * [1]: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/for-await...of
      */
    def next(): js.Promise[js.UndefOr[K]] = js.native
    def next(callback: NodeCallback[K]): Unit = js.native
    
    def nextv(size: Double): js.Promise[js.Array[K]] = js.native
    def nextv(size: Double, callback: NodeCallback[js.Array[K]]): Unit = js.native
    def nextv(size: Double, options: js.Object): js.Promise[js.Array[K]] = js.native
    /**
      * Advance repeatedly and get at most {@link size} amount of keys in a single call. Can
      * be faster than repeated {@link next()} calls. The natural end of the iterator will
      * be signaled by yielding an empty array.
      *
      * @param size Get at most this many keys. Has a soft minimum of 1.
      * @param options Options (none at the moment, reserved for future use).
      * @param callback Error-first callback. If none is provided, a promise is returned.
      */
    def nextv(size: Double, options: js.Object, callback: NodeCallback[js.Array[K]]): Unit = js.native
    
    /**
      * Seek to the key closest to {@link target}. Subsequent calls to {@link next()},
      * {@link nextv()} or {@link all()} (including implicit calls in a `for await...of`
      * loop) will yield keys equal to or larger than {@link target}, or equal to or smaller
      * than {@link target} if the {@link AbstractKeyIteratorOptions.reverse} option was
      * true.
      */
    def seek(target: K): Unit = js.native
    def seek[TTarget](target: TTarget, options: AbstractSeekOptions[TTarget]): Unit = js.native
  }
  
  @JSImport("abstract-level/types/abstract-iterator", "AbstractValueIterator")
  @js.native
  open class AbstractValueIterator[TDatabase, K, V] protected ()
    extends StObject
       with CommonIterator[TDatabase, V] {
    def this(db: TDatabase, options: AbstractValueIteratorOptions[K, V]) = this()
    
    def all(): js.Promise[js.Array[V]] = js.native
    def all(callback: NodeCallback[js.Array[V]]): Unit = js.native
    def all(options: js.Object): js.Promise[js.Array[V]] = js.native
    /**
      * Advance repeatedly and get all (remaining) values as an array, automatically closing
      * the iterator. Assumes that those values fit in memory. If that's not the case,
      * instead use {@link next()}, {@link nextv()} or [`for await...of`][1].
      *
      * [1]: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/for-await...of
      *
      * @param options Options (none at the moment, reserved for future use).
      * @param callback Error-first callback. If none is provided, a promise is returned.
      */
    def all(options: js.Object, callback: NodeCallback[js.Array[V]]): Unit = js.native
    
    /**
      * Advance to the next value and yield that value. When possible, prefer
      * to use [`for await...of`][1] instead.
      *
      * [1]: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/for-await...of
      */
    def next(): js.Promise[js.UndefOr[V]] = js.native
    def next(callback: NodeCallback[V]): Unit = js.native
    
    def nextv(size: Double): js.Promise[js.Array[V]] = js.native
    def nextv(size: Double, callback: NodeCallback[js.Array[V]]): Unit = js.native
    def nextv(size: Double, options: js.Object): js.Promise[js.Array[V]] = js.native
    /**
      * Advance repeatedly and get at most {@link size} amount of values in a single call.
      * Can be faster than repeated {@link next()} calls. The natural end of the iterator
      * will be signaled by yielding an empty array.
      *
      * @param size Get at most this many values. Has a soft minimum of 1.
      * @param options Options (none at the moment, reserved for future use).
      * @param callback Error-first callback. If none is provided, a promise is returned.
      */
    def nextv(size: Double, options: js.Object, callback: NodeCallback[js.Array[V]]): Unit = js.native
    
    /**
      * Seek to the key closest to {@link target}. Subsequent calls to {@link next()},
      * {@link nextv()} or {@link all()} (including implicit calls in a `for await...of`
      * loop) will yield the values of keys equal to or larger than {@link target}, or equal
      * to or smaller than {@link target} if the {@link AbstractValueIteratorOptions.reverse}
      * option was true.
      */
    def seek(target: K): Unit = js.native
    def seek[TTarget](target: TTarget, options: AbstractSeekOptions[TTarget]): Unit = js.native
  }
  
  trait AbstractIteratorOptions[K, V]
    extends StObject
       with RangeOptions[K] {
    
    /**
      * Custom key encoding for this iterator, used to encode range options, to encode
      * {@link AbstractIterator.seek} targets and to decode keys.
      */
    var keyEncoding: js.UndefOr[String | (PartialEncoding[K, K])] = js.undefined
    
    /**
      * Whether to return the key of each entry. Defaults to `true`. If set to `false`,
      * the iterator will yield keys that are `undefined`.
      */
    var keys: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom value encoding for this iterator, used to decode values.
      */
    var valueEncoding: js.UndefOr[String | PartialDecoder[V]] = js.undefined
    
    /**
      * Whether to return the value of each entry. Defaults to `true`. If set to
      * `false`, the iterator will yield values that are `undefined`.
      */
    var values: js.UndefOr[Boolean] = js.undefined
  }
  object AbstractIteratorOptions {
    
    inline def apply[K, V](): AbstractIteratorOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractIteratorOptions[K, V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractIteratorOptions[?, ?], K, V] (val x: Self & (AbstractIteratorOptions[K, V])) extends AnyVal {
      
      inline def setKeyEncoding(value: String | (PartialEncoding[K, K])): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
      
      inline def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
      
      inline def setKeys(value: Boolean): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setValueEncoding(value: String | PartialDecoder[V]): Self = StObject.set(x, "valueEncoding", value.asInstanceOf[js.Any])
      
      inline def setValueEncodingUndefined: Self = StObject.set(x, "valueEncoding", js.undefined)
      
      inline def setValues(value: Boolean): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  trait AbstractKeyIteratorOptions[K]
    extends StObject
       with RangeOptions[K] {
    
    /**
      * Custom key encoding for this iterator, used to encode range options, to encode
      * {@link AbstractKeyIterator.seek} targets and to decode keys.
      */
    var keyEncoding: js.UndefOr[String | (PartialEncoding[K, K])] = js.undefined
  }
  object AbstractKeyIteratorOptions {
    
    inline def apply[K](): AbstractKeyIteratorOptions[K] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractKeyIteratorOptions[K]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractKeyIteratorOptions[?], K] (val x: Self & AbstractKeyIteratorOptions[K]) extends AnyVal {
      
      inline def setKeyEncoding(value: String | (PartialEncoding[K, K])): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
      
      inline def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
    }
  }
  
  trait AbstractSeekOptions[K] extends StObject {
    
    /**
      * Custom key encoding, used to encode the `target`. By default the keyEncoding option
      * of the iterator is used, or (if that wasn't set) the keyEncoding of the database.
      */
    var keyEncoding: js.UndefOr[String | PartialEncoder[K]] = js.undefined
  }
  object AbstractSeekOptions {
    
    inline def apply[K](): AbstractSeekOptions[K] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractSeekOptions[K]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractSeekOptions[?], K] (val x: Self & AbstractSeekOptions[K]) extends AnyVal {
      
      inline def setKeyEncoding(value: String | PartialEncoder[K]): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
      
      inline def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
    }
  }
  
  trait AbstractValueIteratorOptions[K, V]
    extends StObject
       with RangeOptions[K] {
    
    /**
      * Custom key encoding for this iterator, used to encode range options and
      * {@link AbstractValueIterator.seek} targets.
      */
    var keyEncoding: js.UndefOr[String | (PartialEncoding[K, K])] = js.undefined
    
    /**
      * Custom value encoding for this iterator, used to decode values.
      */
    var valueEncoding: js.UndefOr[String | PartialDecoder[V]] = js.undefined
  }
  object AbstractValueIteratorOptions {
    
    inline def apply[K, V](): AbstractValueIteratorOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractValueIteratorOptions[K, V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractValueIteratorOptions[?, ?], K, V] (val x: Self & (AbstractValueIteratorOptions[K, V])) extends AnyVal {
      
      inline def setKeyEncoding(value: String | (PartialEncoding[K, K])): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
      
      inline def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
      
      inline def setValueEncoding(value: String | PartialDecoder[V]): Self = StObject.set(x, "valueEncoding", value.asInstanceOf[js.Any])
      
      inline def setValueEncodingUndefined: Self = StObject.set(x, "valueEncoding", js.undefined)
    }
  }
  
  /**
    * @template TDatabase Type of the database that created this iterator.
    * @template T Type of items yielded. Items can be entries, keys or values.
    */
  @js.native
  trait CommonIterator[TDatabase, T] extends StObject {
    
    /**
      * Free up underlying resources. Not necessary to call if [`for await...of`][1] or
      * `all()` is used.
      *
      * [1]: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/for-await...of
      */
    def close(): js.Promise[Unit] = js.native
    def close(callback: NodeCallback[Unit]): Unit = js.native
    
    /**
      * Read-only getter that indicates how many items have been yielded so far (by any
      * method) excluding calls that errored or yielded `undefined`.
      */
    def count: Double = js.native
    
    /**
      * A reference to the database that created this iterator.
      */
    var db: TDatabase = js.native
    
    /**
      * Read-only getter that reflects the `limit` that was set in options. Greater than or
      * equal to zero. Equals {@link Infinity} if no limit.
      */
    def limit: Double = js.native
  }
  
  type NextCallback[K, V] = js.Function3[
    /* err */ js.UndefOr[js.Error | Null], 
    /* key */ js.UndefOr[K], 
    /* value */ js.UndefOr[V], 
    Unit
  ]
}
