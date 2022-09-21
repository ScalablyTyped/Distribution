package typings.abstractLevel

import typings.abstractLevel.abstractSublevelMod.AbstractSublevel
import typings.abstractLevel.interfacesMod.NodeCallback
import typings.levelTranscoder.encodingMod.PartialEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractChainedBatchMod {
  
  @JSImport("abstract-level/types/abstract-chained-batch", "AbstractChainedBatch")
  @js.native
  open class AbstractChainedBatch[TDatabase, KDefault, VDefault] protected () extends StObject {
    def this(db: TDatabase) = this()
    
    /**
      * Clear all queued operations on this batch.
      */
    def clear(): this.type = js.native
    
    /**
      * Free up underlying resources. This should be done even if the chained batch has
      * zero queued operations. Automatically called by {@link write} so normally not
      * necessary to call, unless the intent is to discard a chained batch without
      * committing it.
      */
    def close(): js.Promise[Unit] = js.native
    def close(callback: NodeCallback[Unit]): Unit = js.native
    
    /**
      * A reference to the database that created this chained batch.
      */
    var db: TDatabase = js.native
    
    /**
      * Queue a _del_ operation on this batch, not committed until {@link write} is
      * called.
      */
    def del(key: KDefault): this.type = js.native
    def del[K](key: K, options: AbstractChainedBatchDelOptions[TDatabase, K]): this.type = js.native
    
    /**
      * The number of queued operations on the current batch.
      */
    def length: Double = js.native
    
    /**
      * Queue a _put_ operation on this batch, not committed until {@link write} is
      * called.
      */
    def put(key: KDefault, value: VDefault): this.type = js.native
    def put[K, V](key: K, value: V, options: AbstractChainedBatchPutOptions[TDatabase, K, V]): this.type = js.native
    
    /**
      * Commit the queued operations for this batch. All operations will be written
      * atomically, that is, they will either all succeed or fail with no partial
      * commits.
      */
    def write(): js.Promise[Unit] = js.native
    def write(callback: NodeCallback[Unit]): Unit = js.native
    def write(options: AbstractChainedBatchWriteOptions): js.Promise[Unit] = js.native
    def write(options: AbstractChainedBatchWriteOptions, callback: NodeCallback[Unit]): Unit = js.native
  }
  
  trait AbstractChainedBatchDelOptions[TDatabase, K] extends StObject {
    
    /**
      * Custom key encoding for this _del_ operation, used to encode the `key`.
      */
    var keyEncoding: js.UndefOr[String | PartialEncoder[K]] = js.undefined
    
    /**
      * Act as though the _del_ operation is performed on the given sublevel, to similar
      * effect as:
      *
      * ```js
      * await sublevel.batch().del(key).write()
      * ```
      *
      * This allows atomically committing data to multiple sublevels. The `key` will be
      * prefixed with the `prefix` of the sublevel, and the `key` will be encoded by the
      * sublevel (using the default key encoding of the sublevel unless {@link keyEncoding}
      * is provided).
      */
    var sublevel: js.UndefOr[AbstractSublevel[TDatabase, Any, Any, Any]] = js.undefined
  }
  object AbstractChainedBatchDelOptions {
    
    inline def apply[TDatabase, K](): AbstractChainedBatchDelOptions[TDatabase, K] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractChainedBatchDelOptions[TDatabase, K]]
    }
    
    extension [Self <: AbstractChainedBatchDelOptions[?, ?], TDatabase, K](x: Self & (AbstractChainedBatchDelOptions[TDatabase, K])) {
      
      inline def setKeyEncoding(value: String | PartialEncoder[K]): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
      
      inline def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
      
      inline def setSublevel(value: AbstractSublevel[TDatabase, Any, Any, Any]): Self = StObject.set(x, "sublevel", value.asInstanceOf[js.Any])
      
      inline def setSublevelUndefined: Self = StObject.set(x, "sublevel", js.undefined)
    }
  }
  
  trait AbstractChainedBatchPutOptions[TDatabase, K, V] extends StObject {
    
    /**
      * Custom key encoding for this _put_ operation, used to encode the `key`.
      */
    var keyEncoding: js.UndefOr[String | PartialEncoder[K]] = js.undefined
    
    /**
      * Act as though the _put_ operation is performed on the given sublevel, to similar
      * effect as:
      *
      * ```js
      * await sublevel.batch().put(key, value).write()
      * ```
      *
      * This allows atomically committing data to multiple sublevels. The `key` will be
      * prefixed with the `prefix` of the sublevel, and the `key` and `value` will be
      * encoded by the sublevel (using the default encodings of the sublevel unless
      * {@link keyEncoding} and / or {@link valueEncoding} are provided).
      */
    var sublevel: js.UndefOr[AbstractSublevel[TDatabase, Any, Any, Any]] = js.undefined
    
    /**
      * Custom value encoding for this _put_ operation, used to encode the `value`.
      */
    var valueEncoding: js.UndefOr[String | PartialEncoder[V]] = js.undefined
  }
  object AbstractChainedBatchPutOptions {
    
    inline def apply[TDatabase, K, V](): AbstractChainedBatchPutOptions[TDatabase, K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractChainedBatchPutOptions[TDatabase, K, V]]
    }
    
    extension [Self <: AbstractChainedBatchPutOptions[?, ?, ?], TDatabase, K, V](x: Self & (AbstractChainedBatchPutOptions[TDatabase, K, V])) {
      
      inline def setKeyEncoding(value: String | PartialEncoder[K]): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
      
      inline def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
      
      inline def setSublevel(value: AbstractSublevel[TDatabase, Any, Any, Any]): Self = StObject.set(x, "sublevel", value.asInstanceOf[js.Any])
      
      inline def setSublevelUndefined: Self = StObject.set(x, "sublevel", js.undefined)
      
      inline def setValueEncoding(value: String | PartialEncoder[V]): Self = StObject.set(x, "valueEncoding", value.asInstanceOf[js.Any])
      
      inline def setValueEncodingUndefined: Self = StObject.set(x, "valueEncoding", js.undefined)
    }
  }
  
  trait AbstractChainedBatchWriteOptions extends StObject
}
