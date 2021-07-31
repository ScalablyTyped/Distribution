package typings.abstractLeveldown

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.abstractLeveldown.abstractLeveldownStrings.del
import typings.abstractLeveldown.abstractLeveldownStrings.put
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait AbstractChainedBatch[K, V]
    extends StObject
       with AbstractOptions {
    
    def clear(): this.type = js.native
    
    def del(key: K): this.type = js.native
    
    def put(key: K, value: V): this.type = js.native
    
    def write(cb: ErrorCallback): js.Any = js.native
    def write(options: js.Any, cb: ErrorCallback): js.Any = js.native
  }
  @JSImport("abstract-leveldown", "AbstractChainedBatch")
  @js.native
  val AbstractChainedBatch: AbstractChainedBatchConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("abstract-leveldown", "AbstractChainedBatch")
  @js.native
  class AbstractChainedBatchCls[K, V] protected ()
    extends StObject
       with typings.abstractLeveldown.mod.AbstractChainedBatch[K, V] {
    // tslint:disable-next-line no-unnecessary-generics
    def this(db: js.Any) = this()
  }
  
  trait AbstractIterator[K, V]
    extends StObject
       with AbstractOptions {
    
    var db: typings.abstractLeveldown.mod.AbstractLevelDOWN[K, V]
    
    def end(cb: ErrorCallback): Unit
    
    def next(cb: ErrorKeyValueCallback[K, V]): this.type
  }
  object AbstractIterator {
    
    @JSImport("abstract-leveldown", "AbstractIterator")
    @js.native
    val ^ : AbstractIteratorConstructor = js.native
    
    @scala.inline
    implicit class AbstractIteratorMutableBuilder[Self <: AbstractIterator[?, ?], K, V] (val x: Self & (AbstractIterator[K, V])) extends AnyVal {
      
      @scala.inline
      def setDb(value: typings.abstractLeveldown.mod.AbstractLevelDOWN[K, V]): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd(value: ErrorCallback => Unit): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNext(value: ErrorKeyValueCallback[K, V] => AbstractIterator[K, V]): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("abstract-leveldown", "AbstractIterator")
  @js.native
  class AbstractIteratorCls[K, V] protected ()
    extends StObject
       with AbstractIterator[K, V] {
    // tslint:disable-next-line no-unnecessary-generics
    def this(db: js.Any) = this()
    
    /* CompleteClass */
    var db: typings.abstractLeveldown.mod.AbstractLevelDOWN[K, V] = js.native
    
    /* CompleteClass */
    override def end(cb: ErrorCallback): Unit = js.native
    
    /* CompleteClass */
    override def next(cb: ErrorKeyValueCallback[K, V]): this.type = js.native
  }
  
  @js.native
  trait AbstractLevelDOWN[K, V]
    extends StObject
       with AbstractOptions {
    
    def batch(): typings.abstractLeveldown.mod.AbstractChainedBatch[K, V] = js.native
    def batch(array: js.Array[AbstractBatch[K, V]], cb: ErrorCallback): typings.abstractLeveldown.mod.AbstractChainedBatch[K, V] = js.native
    def batch(array: js.Array[AbstractBatch[K, V]], options: AbstractOptions, cb: ErrorCallback): typings.abstractLeveldown.mod.AbstractChainedBatch[K, V] = js.native
    
    def close(cb: ErrorCallback): Unit = js.native
    
    def del(key: K, cb: ErrorCallback): Unit = js.native
    def del(key: K, options: AbstractOptions, cb: ErrorCallback): Unit = js.native
    
    def get(key: K, cb: ErrorValueCallback[V]): Unit = js.native
    def get(key: K, options: AbstractGetOptions, cb: ErrorValueCallback[V]): Unit = js.native
    
    def iterator(): AbstractIterator[K, V] = js.native
    def iterator(options: AbstractIteratorOptions[K]): AbstractIterator[K, V] = js.native
    
    def open(cb: ErrorCallback): Unit = js.native
    def open(options: AbstractOpenOptions, cb: ErrorCallback): Unit = js.native
    
    def put(key: K, value: V, cb: ErrorCallback): Unit = js.native
    def put(key: K, value: V, options: AbstractOptions, cb: ErrorCallback): Unit = js.native
  }
  @JSImport("abstract-leveldown", "AbstractLevelDOWN")
  @js.native
  val AbstractLevelDOWN: AbstractLevelDOWNConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("abstract-leveldown", "AbstractLevelDOWN")
  @js.native
  class AbstractLevelDOWNCls[K, V] protected ()
    extends StObject
       with typings.abstractLeveldown.mod.AbstractLevelDOWN[K, V] {
    // tslint:disable-next-line no-unnecessary-generics
    def this(location: String) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.abstractLeveldown.mod.PutBatch[K, V]
    - typings.abstractLeveldown.mod.DelBatch[K, V]
  */
  trait AbstractBatch[K, V] extends StObject
  object AbstractBatch {
    
    @scala.inline
    def DelBatch[K, V](key: K): typings.abstractLeveldown.mod.DelBatch[K, V] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("del")
      __obj.asInstanceOf[typings.abstractLeveldown.mod.DelBatch[K, V]]
    }
    
    @scala.inline
    def PutBatch[K, V](key: K, value: V): typings.abstractLeveldown.mod.PutBatch[K, V] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("put")
      __obj.asInstanceOf[typings.abstractLeveldown.mod.PutBatch[K, V]]
    }
  }
  
  @js.native
  trait AbstractChainedBatchConstructor
    extends StObject
       with // tslint:disable-next-line no-unnecessary-generics
  Instantiable1[
          /* db */ js.Any, 
          typings.abstractLeveldown.mod.AbstractChainedBatch[js.Object, js.Object]
        ] {
    
    // tslint:disable-next-line no-unnecessary-generics
    def apply[K, V](db: js.Any): typings.abstractLeveldown.mod.AbstractChainedBatch[K, V] = js.native
  }
  
  trait AbstractGetOptions
    extends StObject
       with AbstractOptions {
    
    var asBuffer: js.UndefOr[Boolean] = js.undefined
  }
  object AbstractGetOptions {
    
    @scala.inline
    def apply(): AbstractGetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractGetOptions]
    }
    
    @scala.inline
    implicit class AbstractGetOptionsMutableBuilder[Self <: AbstractGetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsBuffer(value: Boolean): Self = StObject.set(x, "asBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsBufferUndefined: Self = StObject.set(x, "asBuffer", js.undefined)
    }
  }
  
  @js.native
  trait AbstractIteratorConstructor
    extends StObject
       with // tslint:disable-next-line no-unnecessary-generics
  Instantiable1[/* db */ js.Any, AbstractIterator[js.Object, js.Object]] {
    
    // tslint:disable-next-line no-unnecessary-generics
    def apply[K, V](db: js.Any): AbstractIterator[K, V] = js.native
  }
  
  trait AbstractIteratorOptions[K]
    extends StObject
       with AbstractOptions {
    
    var gt: js.UndefOr[K] = js.undefined
    
    var gte: js.UndefOr[K] = js.undefined
    
    var keyAsBuffer: js.UndefOr[Boolean] = js.undefined
    
    var keys: js.UndefOr[Boolean] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var lt: js.UndefOr[K] = js.undefined
    
    var lte: js.UndefOr[K] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var valueAsBuffer: js.UndefOr[Boolean] = js.undefined
    
    var values: js.UndefOr[Boolean] = js.undefined
  }
  object AbstractIteratorOptions {
    
    @scala.inline
    def apply[K](): AbstractIteratorOptions[K] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractIteratorOptions[K]]
    }
    
    @scala.inline
    implicit class AbstractIteratorOptionsMutableBuilder[Self <: AbstractIteratorOptions[?], K] (val x: Self & AbstractIteratorOptions[K]) extends AnyVal {
      
      @scala.inline
      def setGt(value: K): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGtUndefined: Self = StObject.set(x, "gt", js.undefined)
      
      @scala.inline
      def setGte(value: K): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGteUndefined: Self = StObject.set(x, "gte", js.undefined)
      
      @scala.inline
      def setKeyAsBuffer(value: Boolean): Self = StObject.set(x, "keyAsBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyAsBufferUndefined: Self = StObject.set(x, "keyAsBuffer", js.undefined)
      
      @scala.inline
      def setKeys(value: Boolean): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setLt(value: K): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
      
      @scala.inline
      def setLte(value: K): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLteUndefined: Self = StObject.set(x, "lte", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setValueAsBuffer(value: Boolean): Self = StObject.set(x, "valueAsBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueAsBufferUndefined: Self = StObject.set(x, "valueAsBuffer", js.undefined)
      
      @scala.inline
      def setValues(value: Boolean): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  @js.native
  trait AbstractLevelDOWNConstructor
    extends StObject
       with // tslint:disable-next-line no-unnecessary-generics
  Instantiable1[
          /* location */ String, 
          typings.abstractLeveldown.mod.AbstractLevelDOWN[js.Object, js.Object]
        ] {
    
    // tslint:disable-next-line no-unnecessary-generics
    def apply[K, V](location: String): typings.abstractLeveldown.mod.AbstractLevelDOWN[K, V] = js.native
  }
  
  trait AbstractOpenOptions
    extends StObject
       with AbstractOptions {
    
    var createIfMissing: js.UndefOr[Boolean] = js.undefined
    
    var errorIfExists: js.UndefOr[Boolean] = js.undefined
  }
  object AbstractOpenOptions {
    
    @scala.inline
    def apply(): AbstractOpenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractOpenOptions]
    }
    
    @scala.inline
    implicit class AbstractOpenOptionsMutableBuilder[Self <: AbstractOpenOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateIfMissing(value: Boolean): Self = StObject.set(x, "createIfMissing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateIfMissingUndefined: Self = StObject.set(x, "createIfMissing", js.undefined)
      
      @scala.inline
      def setErrorIfExists(value: Boolean): Self = StObject.set(x, "errorIfExists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorIfExistsUndefined: Self = StObject.set(x, "errorIfExists", js.undefined)
    }
  }
  
  type AbstractOptions = StringDictionary[js.Any]
  
  trait DelBatch[K, V]
    extends StObject
       with AbstractBatch[K, V] {
    
    val key: K
    
    val `type`: del
  }
  object DelBatch {
    
    @scala.inline
    def apply[K, V](key: K): DelBatch[K, V] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("del")
      __obj.asInstanceOf[DelBatch[K, V]]
    }
    
    @scala.inline
    implicit class DelBatchMutableBuilder[Self <: DelBatch[?, ?], K, V] (val x: Self & (DelBatch[K, V])) extends AnyVal {
      
      @scala.inline
      def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: del): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ErrorCallback = js.Function1[/* err */ js.UndefOr[Error], Unit]
  
  type ErrorKeyValueCallback[K, V] = js.Function3[/* err */ js.UndefOr[Error], /* key */ K, /* value */ V, Unit]
  
  type ErrorValueCallback[V] = js.Function2[/* err */ js.UndefOr[Error], /* value */ V, Unit]
  
  trait PutBatch[K, V]
    extends StObject
       with AbstractBatch[K, V] {
    
    val key: K
    
    val `type`: put
    
    val value: V
  }
  object PutBatch {
    
    @scala.inline
    def apply[K, V](key: K, value: V): PutBatch[K, V] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("put")
      __obj.asInstanceOf[PutBatch[K, V]]
    }
    
    @scala.inline
    implicit class PutBatchMutableBuilder[Self <: PutBatch[?, ?], K, V] (val x: Self & (PutBatch[K, V])) extends AnyVal {
      
      @scala.inline
      def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: put): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
