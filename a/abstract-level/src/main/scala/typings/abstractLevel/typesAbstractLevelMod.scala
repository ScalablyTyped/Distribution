package typings.abstractLevel

import typings.abstractLevel.abstractLevelStrings.buffer
import typings.abstractLevel.abstractLevelStrings.closed
import typings.abstractLevel.abstractLevelStrings.closing
import typings.abstractLevel.abstractLevelStrings.del
import typings.abstractLevel.abstractLevelStrings.open
import typings.abstractLevel.abstractLevelStrings.opening
import typings.abstractLevel.abstractLevelStrings.put
import typings.abstractLevel.abstractLevelStrings.utf8
import typings.abstractLevel.abstractLevelStrings.view
import typings.abstractLevel.anon.PartialIManifest
import typings.abstractLevel.typesAbstractChainedBatchMod.AbstractChainedBatch
import typings.abstractLevel.typesAbstractIteratorMod.AbstractIterator
import typings.abstractLevel.typesAbstractIteratorMod.AbstractIteratorOptions
import typings.abstractLevel.typesAbstractIteratorMod.AbstractKeyIterator
import typings.abstractLevel.typesAbstractIteratorMod.AbstractKeyIteratorOptions
import typings.abstractLevel.typesAbstractIteratorMod.AbstractValueIterator
import typings.abstractLevel.typesAbstractIteratorMod.AbstractValueIteratorOptions
import typings.abstractLevel.typesAbstractSublevelMod.AbstractSublevel
import typings.abstractLevel.typesAbstractSublevelMod.AbstractSublevelOptions
import typings.abstractLevel.typesInterfacesMod.NodeCallback
import typings.abstractLevel.typesInterfacesMod.RangeOptions
import typings.levelSupports.mod.IManifest
import typings.levelTranscoder.libEncodingMod.KnownEncoding
import typings.levelTranscoder.libEncodingMod.KnownEncodingName
import typings.levelTranscoder.libEncodingMod.MixedEncoding
import typings.levelTranscoder.libEncodingMod.PartialDecoder
import typings.levelTranscoder.libEncodingMod.PartialEncoder
import typings.levelTranscoder.libEncodingMod.PartialEncoding
import typings.levelTranscoder.mod.Encoding
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAbstractLevelMod {
  
  /**
    * Abstract class for a lexicographically sorted key-value database.
    *
    * @template TFormat The type used internally by the database to store data.
    * @template KDefault The default type of keys if not overridden on operations.
    * @template VDefault The default type of values if not overridden on operations.
    */
  @JSImport("abstract-level/types/abstract-level", "AbstractLevel")
  @js.native
  open class AbstractLevel[TFormat, KDefault, VDefault] protected () extends EventEmitter {
    /**
      * Private database constructor.
      *
      * @param manifest A [manifest](https://github.com/Level/supports) describing the
      * features supported by (the private API of) this database.
      * @param options Options, of which some will be forwarded to {@link open}.
      */
    def this(manifest: PartialIManifest) = this()
    def this(manifest: PartialIManifest, options: AbstractDatabaseOptions[KDefault, VDefault]) = this()
    
    def batch(): AbstractChainedBatch[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof this */ Any, 
        KDefault, 
        VDefault
      ] = js.native
    /**
      * Perform multiple _put_ and/or _del_ operations in bulk.
      */
    def batch(
      operations: js.Array[
          AbstractBatchOperation[
            /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof this */ Any, 
            KDefault, 
            VDefault
          ]
        ]
    ): js.Promise[Unit] = js.native
    def batch(
      operations: js.Array[
          AbstractBatchOperation[
            /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof this */ Any, 
            KDefault, 
            VDefault
          ]
        ],
      callback: NodeCallback[Unit]
    ): Unit = js.native
    def batch[K, V](
      operations: js.Array[
          AbstractBatchOperation[
            /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof this */ Any, 
            K, 
            V
          ]
        ],
      options: AbstractBatchOptions[K, V]
    ): js.Promise[Unit] = js.native
    def batch[K, V](
      operations: js.Array[
          AbstractBatchOperation[
            /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof this */ Any, 
            K, 
            V
          ]
        ],
      options: AbstractBatchOptions[K, V],
      callback: NodeCallback[Unit]
    ): Unit = js.native
    
    /**
      * Delete all entries or a range.
      */
    def clear(): js.Promise[Unit] = js.native
    def clear(callback: NodeCallback[Unit]): Unit = js.native
    def clear[K](options: AbstractClearOptions[K]): js.Promise[Unit] = js.native
    def clear[K](options: AbstractClearOptions[K], callback: NodeCallback[Unit]): Unit = js.native
    
    /**
      * Close the database.
      */
    def close(): js.Promise[Unit] = js.native
    def close(callback: NodeCallback[Unit]): Unit = js.native
    
    /**
      * Call the function {@link fn} at a later time when {@link status} changes to
      * `'open'` or `'closed'`.
      */
    def defer(fn: js.Function): Unit = js.native
    
    /**
      * Delete an entry by {@link key}.
      */
    def del(key: KDefault): js.Promise[Unit] = js.native
    def del(key: KDefault, callback: NodeCallback[Unit]): Unit = js.native
    def del[K](key: K, options: AbstractDelOptions[K]): js.Promise[Unit] = js.native
    def del[K](key: K, options: AbstractDelOptions[K], callback: NodeCallback[Unit]): Unit = js.native
    
    /**
      * Get a value from the database by {@link key}.
      */
    def get(key: KDefault): js.Promise[VDefault] = js.native
    def get(key: KDefault, callback: NodeCallback[VDefault]): Unit = js.native
    def get[K, V](key: K, options: AbstractGetOptions[K, V]): js.Promise[V] = js.native
    def get[K, V](key: K, options: AbstractGetOptions[K, V], callback: NodeCallback[V]): Unit = js.native
    
    /**
      * Get multiple values from the database by an array of {@link keys}.
      */
    def getMany(keys: js.Array[KDefault]): js.Promise[js.Array[VDefault]] = js.native
    def getMany(keys: js.Array[KDefault], callback: NodeCallback[js.Array[VDefault]]): Unit = js.native
    def getMany[K, V](keys: js.Array[K], options: AbstractGetManyOptions[K, V]): js.Promise[js.Array[V]] = js.native
    def getMany[K, V](keys: js.Array[K], options: AbstractGetManyOptions[K, V], callback: NodeCallback[js.Array[V]]): Unit = js.native
    
    /**
      * Create an iterator. For example:
      *
      * ```js
      * for await (const [key, value] of db.iterator({ gte: 'a' })) {
      *   console.log([key, value])
      * }
      * ```
      */
    def iterator(): AbstractIterator[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof this */ Any, 
        KDefault, 
        VDefault
      ] = js.native
    def iterator[K, V](options: AbstractIteratorOptions[K, V]): AbstractIterator[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof this */ Any, 
        K, 
        V
      ] = js.native
    
    /**
      * Returns the default key encoding of the database as a normalized encoding
      * object that follows the [`level-transcoder`](https://github.com/Level/transcoder)
      * encoding interface.
      */
    def keyEncoding(): Encoding[KDefault, TFormat, KDefault] = js.native
    /**
      * Returns the given {@link encoding} argument as a normalized encoding object
      * that follows the [`level-transcoder`](https://github.com/Level/transcoder)
      * encoding interface.
      */
    def keyEncoding[N /* <: KnownEncodingName */](encoding: N): KnownEncoding[N, TFormat] = js.native
    def keyEncoding[TIn, TOut](encoding: MixedEncoding[TIn, Any, TOut]): Encoding[TIn, TFormat, TOut] = js.native
    
    /**
      * Create a key iterator. For example:
      *
      * ```js
      * for await (const key of db.keys({ gte: 'a' })) {
      *   console.log(key)
      * }
      * ```
      */
    def keys(): AbstractKeyIterator[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof this */ Any, 
        KDefault
      ] = js.native
    def keys[K](options: AbstractKeyIteratorOptions[K]): AbstractKeyIterator[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof this */ Any, 
        K
      ] = js.native
    
    /**
      * Schedule the function {@link fn} to be called in a next tick of the JavaScript
      * event loop, using a microtask scheduler. It will be called with the provided
      * {@link args}.
      */
    def nextTick(fn: js.Function, args: Any*): Unit = js.native
    
    /**
      * Open the database.
      */
    def open(): js.Promise[Unit] = js.native
    def open(callback: NodeCallback[Unit]): Unit = js.native
    def open(options: AbstractOpenOptions): js.Promise[Unit] = js.native
    def open(options: AbstractOpenOptions, callback: NodeCallback[Unit]): Unit = js.native
    
    @JSName("prefixKey")
    def prefixKey_buffer(key: Buffer, keyFormat: buffer): Buffer = js.native
    /**
      * Add sublevel prefix to the given {@link key}, which must be already-encoded. If this
      * database is not a sublevel, the given {@link key} is returned as-is.
      *
      * @param key Key to add prefix to.
      * @param keyFormat Format of {@link key}. One of `'utf8'`, `'buffer'`, `'view'`.
      * If `'utf8'` then {@link key} must be a string and the return value will be a string.
      * If `'buffer'` then Buffer, if `'view'` then Uint8Array.
      */
    @JSName("prefixKey")
    def prefixKey_utf8(key: String, keyFormat: utf8): String = js.native
    @JSName("prefixKey")
    def prefixKey_view(key: js.typedarray.Uint8Array, keyFormat: view): js.typedarray.Uint8Array = js.native
    
    /**
      * Add a new entry or overwrite an existing entry.
      */
    def put(key: KDefault, value: VDefault): js.Promise[Unit] = js.native
    def put(key: KDefault, value: VDefault, callback: NodeCallback[Unit]): Unit = js.native
    def put[K, V](key: K, value: V, options: AbstractPutOptions[K, V]): js.Promise[Unit] = js.native
    def put[K, V](key: K, value: V, options: AbstractPutOptions[K, V], callback: NodeCallback[Unit]): Unit = js.native
    
    /**
      * Read-only getter that returns a string reflecting the current state of the database:
      *
      * - `'opening'` - waiting for the database to be opened
      * - `'open'` - successfully opened the database
      * - `'closing'` - waiting for the database to be closed
      * - `'closed'` - successfully closed the database.
      */
    def status: opening | open | closing | closed = js.native
    
    /**
      * Create a sublevel.
      * @param name Name of the sublevel, used to prefix keys.
      */
    def sublevel(name: String): AbstractSublevel[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof this */ Any, 
        TFormat, 
        String, 
        String
      ] = js.native
    def sublevel[K, V](name: String, options: AbstractSublevelOptions[K, V]): AbstractSublevel[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof this */ Any, 
        TFormat, 
        K, 
        V
      ] = js.native
    
    /**
      * A [manifest](https://github.com/Level/supports) describing the features
      * supported by this database.
      */
    var supports: IManifest = js.native
    
    /**
      * Returns the default value encoding of the database as a normalized encoding
      * object that follows the [`level-transcoder`](https://github.com/Level/transcoder)
      * encoding interface.
      */
    def valueEncoding(): Encoding[VDefault, TFormat, VDefault] = js.native
    /**
      * Returns the given {@link encoding} argument as a normalized encoding object
      * that follows the [`level-transcoder`](https://github.com/Level/transcoder)
      * encoding interface.
      */
    def valueEncoding[N /* <: KnownEncodingName */](encoding: N): KnownEncoding[N, TFormat] = js.native
    def valueEncoding[TIn, TOut](encoding: MixedEncoding[TIn, Any, TOut]): Encoding[TIn, TFormat, TOut] = js.native
    
    /**
      * Create a value iterator. For example:
      *
      * ```js
      * for await (const value of db.values({ gte: 'a' })) {
      *   console.log(value)
      * }
      * ```
      */
    def values(): AbstractValueIterator[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof this */ Any, 
        KDefault, 
        VDefault
      ] = js.native
    def values[K, V](options: AbstractValueIteratorOptions[K, V]): AbstractValueIterator[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof this */ Any, 
        K, 
        V
      ] = js.native
  }
  
  trait AbstractBatchDelOperation[TDatabase, K]
    extends StObject
       with AbstractBatchOperation[TDatabase, K, Any] {
    
    var key: K
    
    /**
      * Custom key encoding for this _del_ operation, used to encode the {@link key}.
      */
    var keyEncoding: js.UndefOr[String | (PartialEncoding[K, K])] = js.undefined
    
    /**
      * Act as though the _del_ operation is performed on the given sublevel, to similar
      * effect as:
      *
      * ```js
      * await sublevel.batch([{ type: 'del', key }])
      * ```
      *
      * This allows atomically committing data to multiple sublevels. The {@link key} will
      * be prefixed with the `prefix` of the sublevel, and the {@link key} will be encoded
      * by the sublevel (using the default key encoding of the sublevel unless
      * {@link keyEncoding} is provided).
      */
    var sublevel: js.UndefOr[AbstractSublevel[TDatabase, Any, Any, Any]] = js.undefined
    
    var `type`: del
  }
  object AbstractBatchDelOperation {
    
    inline def apply[TDatabase, K](key: K): AbstractBatchDelOperation[TDatabase, K] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("del")
      __obj.asInstanceOf[AbstractBatchDelOperation[TDatabase, K]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractBatchDelOperation[?, ?], TDatabase, K] (val x: Self & (AbstractBatchDelOperation[TDatabase, K])) extends AnyVal {
      
      inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyEncoding(value: String | (PartialEncoding[K, K])): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
      
      inline def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
      
      inline def setSublevel(value: AbstractSublevel[TDatabase, Any, Any, Any]): Self = StObject.set(x, "sublevel", value.asInstanceOf[js.Any])
      
      inline def setSublevelUndefined: Self = StObject.set(x, "sublevel", js.undefined)
      
      inline def setType(value: del): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.abstractLevel.typesAbstractLevelMod.AbstractBatchPutOperation[TDatabase, K, V]
    - typings.abstractLevel.typesAbstractLevelMod.AbstractBatchDelOperation[TDatabase, K]
  */
  trait AbstractBatchOperation[TDatabase, K, V] extends StObject
  object AbstractBatchOperation {
    
    inline def AbstractBatchDelOperation[TDatabase, K](key: K): typings.abstractLevel.typesAbstractLevelMod.AbstractBatchDelOperation[TDatabase, K] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("del")
      __obj.asInstanceOf[typings.abstractLevel.typesAbstractLevelMod.AbstractBatchDelOperation[TDatabase, K]]
    }
    
    inline def AbstractBatchPutOperation[TDatabase, K, V](key: K, value: V): typings.abstractLevel.typesAbstractLevelMod.AbstractBatchPutOperation[TDatabase, K, V] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("put")
      __obj.asInstanceOf[typings.abstractLevel.typesAbstractLevelMod.AbstractBatchPutOperation[TDatabase, K, V]]
    }
  }
  
  trait AbstractBatchOptions[K, V] extends StObject {
    
    /**
      * Custom key encoding for this batch, used to encode keys.
      */
    var keyEncoding: js.UndefOr[String | PartialEncoder[K]] = js.undefined
    
    /**
      * Custom value encoding for this batch, used to encode values.
      */
    var valueEncoding: js.UndefOr[String | PartialEncoder[V]] = js.undefined
  }
  object AbstractBatchOptions {
    
    inline def apply[K, V](): AbstractBatchOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractBatchOptions[K, V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractBatchOptions[?, ?], K, V] (val x: Self & (AbstractBatchOptions[K, V])) extends AnyVal {
      
      inline def setKeyEncoding(value: String | PartialEncoder[K]): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
      
      inline def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
      
      inline def setValueEncoding(value: String | PartialEncoder[V]): Self = StObject.set(x, "valueEncoding", value.asInstanceOf[js.Any])
      
      inline def setValueEncodingUndefined: Self = StObject.set(x, "valueEncoding", js.undefined)
    }
  }
  
  trait AbstractBatchPutOperation[TDatabase, K, V]
    extends StObject
       with AbstractBatchOperation[TDatabase, K, V] {
    
    var key: K
    
    /**
      * Custom key encoding for this _put_ operation, used to encode the {@link key}.
      */
    var keyEncoding: js.UndefOr[String | (PartialEncoding[K, K])] = js.undefined
    
    /**
      * Act as though the _put_ operation is performed on the given sublevel, to similar
      * effect as:
      *
      * ```js
      * await sublevel.batch([{ type: 'put', key, value }])
      * ```
      *
      * This allows atomically committing data to multiple sublevels. The {@link key} will
      * be prefixed with the `prefix` of the sublevel, and the {@link key} and {@link value}
      * will be encoded by the sublevel (using the default encodings of the sublevel unless
      * {@link keyEncoding} and / or {@link valueEncoding} are provided).
      */
    var sublevel: js.UndefOr[AbstractSublevel[TDatabase, Any, Any, Any]] = js.undefined
    
    var `type`: put
    
    var value: V
    
    /**
      * Custom key encoding for this _put_ operation, used to encode the {@link value}.
      */
    var valueEncoding: js.UndefOr[String | (PartialEncoding[V, V])] = js.undefined
  }
  object AbstractBatchPutOperation {
    
    inline def apply[TDatabase, K, V](key: K, value: V): AbstractBatchPutOperation[TDatabase, K, V] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("put")
      __obj.asInstanceOf[AbstractBatchPutOperation[TDatabase, K, V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractBatchPutOperation[?, ?, ?], TDatabase, K, V] (val x: Self & (AbstractBatchPutOperation[TDatabase, K, V])) extends AnyVal {
      
      inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyEncoding(value: String | (PartialEncoding[K, K])): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
      
      inline def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
      
      inline def setSublevel(value: AbstractSublevel[TDatabase, Any, Any, Any]): Self = StObject.set(x, "sublevel", value.asInstanceOf[js.Any])
      
      inline def setSublevelUndefined: Self = StObject.set(x, "sublevel", js.undefined)
      
      inline def setType(value: put): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueEncoding(value: String | (PartialEncoding[V, V])): Self = StObject.set(x, "valueEncoding", value.asInstanceOf[js.Any])
      
      inline def setValueEncodingUndefined: Self = StObject.set(x, "valueEncoding", js.undefined)
    }
  }
  
  trait AbstractClearOptions[K]
    extends StObject
       with RangeOptions[K] {
    
    /**
      * Custom key encoding for this operation, used to encode range options.
      */
    var keyEncoding: js.UndefOr[String | (PartialEncoding[K, K])] = js.undefined
  }
  object AbstractClearOptions {
    
    inline def apply[K](): AbstractClearOptions[K] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractClearOptions[K]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractClearOptions[?], K] (val x: Self & AbstractClearOptions[K]) extends AnyVal {
      
      inline def setKeyEncoding(value: String | (PartialEncoding[K, K])): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
      
      inline def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<abstract-level.abstract-level/types/abstract-level.AbstractOpenOptions, 'passive'> */
  trait AbstractDatabaseOptions[K, V] extends StObject {
    
    var createIfMissing: js.UndefOr[Boolean] = js.undefined
    
    var errorIfExists: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Encoding to use for keys.
      * @defaultValue `'utf8'`
      */
    var keyEncoding: js.UndefOr[String | (PartialEncoding[K, K])] = js.undefined
    
    /**
      * Encoding to use for values.
      * @defaultValue `'utf8'`
      */
    var valueEncoding: js.UndefOr[String | (PartialEncoding[V, V])] = js.undefined
  }
  object AbstractDatabaseOptions {
    
    inline def apply[K, V](): AbstractDatabaseOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractDatabaseOptions[K, V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractDatabaseOptions[?, ?], K, V] (val x: Self & (AbstractDatabaseOptions[K, V])) extends AnyVal {
      
      inline def setCreateIfMissing(value: Boolean): Self = StObject.set(x, "createIfMissing", value.asInstanceOf[js.Any])
      
      inline def setCreateIfMissingUndefined: Self = StObject.set(x, "createIfMissing", js.undefined)
      
      inline def setErrorIfExists(value: Boolean): Self = StObject.set(x, "errorIfExists", value.asInstanceOf[js.Any])
      
      inline def setErrorIfExistsUndefined: Self = StObject.set(x, "errorIfExists", js.undefined)
      
      inline def setKeyEncoding(value: String | (PartialEncoding[K, K])): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
      
      inline def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
      
      inline def setValueEncoding(value: String | (PartialEncoding[V, V])): Self = StObject.set(x, "valueEncoding", value.asInstanceOf[js.Any])
      
      inline def setValueEncodingUndefined: Self = StObject.set(x, "valueEncoding", js.undefined)
    }
  }
  
  trait AbstractDelOptions[K] extends StObject {
    
    /**
      * Custom key encoding for this operation, used to encode the `key`.
      */
    var keyEncoding: js.UndefOr[String | PartialEncoder[K]] = js.undefined
  }
  object AbstractDelOptions {
    
    inline def apply[K](): AbstractDelOptions[K] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractDelOptions[K]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractDelOptions[?], K] (val x: Self & AbstractDelOptions[K]) extends AnyVal {
      
      inline def setKeyEncoding(value: String | PartialEncoder[K]): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
      
      inline def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
    }
  }
  
  trait AbstractGetManyOptions[K, V] extends StObject {
    
    /**
      * Custom key encoding for this operation, used to encode the `keys`.
      */
    var keyEncoding: js.UndefOr[String | PartialEncoder[K]] = js.undefined
    
    /**
      * Custom value encoding for this operation, used to decode values.
      */
    var valueEncoding: js.UndefOr[String | PartialDecoder[V]] = js.undefined
  }
  object AbstractGetManyOptions {
    
    inline def apply[K, V](): AbstractGetManyOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractGetManyOptions[K, V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractGetManyOptions[?, ?], K, V] (val x: Self & (AbstractGetManyOptions[K, V])) extends AnyVal {
      
      inline def setKeyEncoding(value: String | PartialEncoder[K]): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
      
      inline def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
      
      inline def setValueEncoding(value: String | PartialDecoder[V]): Self = StObject.set(x, "valueEncoding", value.asInstanceOf[js.Any])
      
      inline def setValueEncodingUndefined: Self = StObject.set(x, "valueEncoding", js.undefined)
    }
  }
  
  trait AbstractGetOptions[K, V] extends StObject {
    
    /**
      * Custom key encoding for this operation, used to encode the `key`.
      */
    var keyEncoding: js.UndefOr[String | PartialEncoder[K]] = js.undefined
    
    /**
      * Custom value encoding for this operation, used to decode the value.
      */
    var valueEncoding: js.UndefOr[String | PartialDecoder[V]] = js.undefined
  }
  object AbstractGetOptions {
    
    inline def apply[K, V](): AbstractGetOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractGetOptions[K, V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractGetOptions[?, ?], K, V] (val x: Self & (AbstractGetOptions[K, V])) extends AnyVal {
      
      inline def setKeyEncoding(value: String | PartialEncoder[K]): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
      
      inline def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
      
      inline def setValueEncoding(value: String | PartialDecoder[V]): Self = StObject.set(x, "valueEncoding", value.asInstanceOf[js.Any])
      
      inline def setValueEncodingUndefined: Self = StObject.set(x, "valueEncoding", js.undefined)
    }
  }
  
  trait AbstractOpenOptions extends StObject {
    
    /**
      * If `true`, create an empty database if one doesn't already exist. If `false`
      * and the database doesn't exist, opening will fail.
      *
      * @defaultValue `true`
      */
    var createIfMissing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true` and the database already exists, opening will fail.
      *
      * @defaultValue `false`
      */
    var errorIfExists: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Wait for, but do not initiate, opening of the database.
      *
      * @defaultValue `false`
      */
    var passive: js.UndefOr[Boolean] = js.undefined
  }
  object AbstractOpenOptions {
    
    inline def apply(): AbstractOpenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractOpenOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractOpenOptions] (val x: Self) extends AnyVal {
      
      inline def setCreateIfMissing(value: Boolean): Self = StObject.set(x, "createIfMissing", value.asInstanceOf[js.Any])
      
      inline def setCreateIfMissingUndefined: Self = StObject.set(x, "createIfMissing", js.undefined)
      
      inline def setErrorIfExists(value: Boolean): Self = StObject.set(x, "errorIfExists", value.asInstanceOf[js.Any])
      
      inline def setErrorIfExistsUndefined: Self = StObject.set(x, "errorIfExists", js.undefined)
      
      inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      inline def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
    }
  }
  
  trait AbstractPutOptions[K, V] extends StObject {
    
    /**
      * Custom key encoding for this operation, used to encode the `key`.
      */
    var keyEncoding: js.UndefOr[String | PartialEncoder[K]] = js.undefined
    
    /**
      * Custom value encoding for this operation, used to encode the `value`.
      */
    var valueEncoding: js.UndefOr[String | PartialEncoder[V]] = js.undefined
  }
  object AbstractPutOptions {
    
    inline def apply[K, V](): AbstractPutOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractPutOptions[K, V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractPutOptions[?, ?], K, V] (val x: Self & (AbstractPutOptions[K, V])) extends AnyVal {
      
      inline def setKeyEncoding(value: String | PartialEncoder[K]): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
      
      inline def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
      
      inline def setValueEncoding(value: String | PartialEncoder[V]): Self = StObject.set(x, "valueEncoding", value.asInstanceOf[js.Any])
      
      inline def setValueEncodingUndefined: Self = StObject.set(x, "valueEncoding", js.undefined)
    }
  }
}
