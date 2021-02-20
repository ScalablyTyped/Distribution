package typings.androiduix.android

import typings.androiduix.android.util.Pools.SimplePool
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @js.native
  trait ArrayMap[K, V] extends StObject {
    
    def append(key: K, value: V): Unit = js.native
    
    def clear(): Unit = js.native
    
    def containsKey(key: K): Boolean = js.native
    
    def containsValue(value: V): Boolean = js.native
    
    def ensureCapacity(minimumCapacity: Double): Unit = js.native
    
    def erase(): Unit = js.native
    
    def get(key: K): V = js.native
    
    def indexOfValue(value: V): Double = js.native
    
    def isEmpty(): Boolean = js.native
    
    def keyAt(index: Double): K = js.native
    
    def keySet(): Set[K] = js.native
    
    var map: js.Any = js.native
    
    def put(key: K, value: V): V = js.native
    
    def remove(key: K): V = js.native
    
    def removeAt(index: Double): V = js.native
    
    def setValueAt(index: Double, value: V): V = js.native
    
    def size(): Double = js.native
    
    def valueAt(index: Double): V = js.native
  }
  object ArrayMap {
    
    @scala.inline
    def apply[K, V](
      append: (K, V) => Unit,
      clear: () => Unit,
      containsKey: K => Boolean,
      containsValue: V => Boolean,
      ensureCapacity: Double => Unit,
      erase: () => Unit,
      get: K => V,
      indexOfValue: V => Double,
      isEmpty: () => Boolean,
      keyAt: Double => K,
      keySet: () => Set[K],
      map: js.Any,
      put: (K, V) => V,
      remove: K => V,
      removeAt: Double => V,
      setValueAt: (Double, V) => V,
      size: () => Double,
      valueAt: Double => V
    ): ArrayMap[K, V] = {
      val __obj = js.Dynamic.literal(append = js.Any.fromFunction2(append), clear = js.Any.fromFunction0(clear), containsKey = js.Any.fromFunction1(containsKey), containsValue = js.Any.fromFunction1(containsValue), ensureCapacity = js.Any.fromFunction1(ensureCapacity), erase = js.Any.fromFunction0(erase), get = js.Any.fromFunction1(get), indexOfValue = js.Any.fromFunction1(indexOfValue), isEmpty = js.Any.fromFunction0(isEmpty), keyAt = js.Any.fromFunction1(keyAt), keySet = js.Any.fromFunction0(keySet), map = map.asInstanceOf[js.Any], put = js.Any.fromFunction2(put), remove = js.Any.fromFunction1(remove), removeAt = js.Any.fromFunction1(removeAt), setValueAt = js.Any.fromFunction2(setValueAt), size = js.Any.fromFunction0(size), valueAt = js.Any.fromFunction1(valueAt))
      __obj.asInstanceOf[ArrayMap[K, V]]
    }
    
    @scala.inline
    implicit class ArrayMapMutableBuilder[Self <: ArrayMap[_, _], K, V] (val x: Self with (ArrayMap[K, V])) extends AnyVal {
      
      @scala.inline
      def setAppend(value: (K, V) => Unit): Self = StObject.set(x, "append", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContainsKey(value: K => Boolean): Self = StObject.set(x, "containsKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContainsValue(value: V => Boolean): Self = StObject.set(x, "containsValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEnsureCapacity(value: Double => Unit): Self = StObject.set(x, "ensureCapacity", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErase(value: () => Unit): Self = StObject.set(x, "erase", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet(value: K => V): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIndexOfValue(value: V => Double): Self = StObject.set(x, "indexOfValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setKeyAt(value: Double => K): Self = StObject.set(x, "keyAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeySet(value: () => Set[K]): Self = StObject.set(x, "keySet", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMap(value: js.Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPut(value: (K, V) => V): Self = StObject.set(x, "put", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemove(value: K => V): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveAt(value: Double => V): Self = StObject.set(x, "removeAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetValueAt(value: (Double, V) => V): Self = StObject.set(x, "setValueAt", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValueAt(value: Double => V): Self = StObject.set(x, "valueAt", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait CopyOnWriteArray[T] extends StObject {
    
    def add(items: T*): Unit = js.native
    
    def addAll(array: CopyOnWriteArray[T]): Unit = js.native
    
    def end(): Unit = js.native
    
    /* private */ def getArray(): js.Any = js.native
    
    var mAccess: js.Any = js.native
    
    var mData: js.Any = js.native
    
    var mDataCopy: js.Any = js.native
    
    var mStart: js.Any = js.native
    
    def remove(item: T): Unit = js.native
    
    def size(): Double = js.native
    
    def start(): js.Array[T] = js.native
  }
  object CopyOnWriteArray {
    
    @scala.inline
    def apply[T](
      add: /* repeated */ T => Unit,
      addAll: CopyOnWriteArray[T] => Unit,
      end: () => Unit,
      getArray: () => js.Any,
      mAccess: js.Any,
      mData: js.Any,
      mDataCopy: js.Any,
      mStart: js.Any,
      remove: T => Unit,
      size: () => Double,
      start: () => js.Array[T]
    ): CopyOnWriteArray[T] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addAll = js.Any.fromFunction1(addAll), end = js.Any.fromFunction0(end), getArray = js.Any.fromFunction0(getArray), mAccess = mAccess.asInstanceOf[js.Any], mData = mData.asInstanceOf[js.Any], mDataCopy = mDataCopy.asInstanceOf[js.Any], mStart = mStart.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), size = js.Any.fromFunction0(size), start = js.Any.fromFunction0(start))
      __obj.asInstanceOf[CopyOnWriteArray[T]]
    }
    
    @scala.inline
    implicit class CopyOnWriteArrayMutableBuilder[Self <: CopyOnWriteArray[_], T] (val x: Self with CopyOnWriteArray[T]) extends AnyVal {
      
      @scala.inline
      def setAdd(value: /* repeated */ T => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddAll(value: CopyOnWriteArray[T] => Unit): Self = StObject.set(x, "addAll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetArray(value: () => js.Any): Self = StObject.set(x, "getArray", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMAccess(value: js.Any): Self = StObject.set(x, "mAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMData(value: js.Any): Self = StObject.set(x, "mData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDataCopy(value: js.Any): Self = StObject.set(x, "mDataCopy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMStart(value: js.Any): Self = StObject.set(x, "mStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemove(value: T => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStart(value: () => js.Array[T]): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait DisplayMetrics extends StObject {
    
    var density: Double = js.native
    
    var densityDpi: Double = js.native
    
    var heightPixels: Double = js.native
    
    var scaledDensity: Double = js.native
    
    var widthPixels: Double = js.native
    
    var xdpi: Double = js.native
    
    var ydpi: Double = js.native
  }
  object DisplayMetrics {
    
    @scala.inline
    def apply(
      density: Double,
      densityDpi: Double,
      heightPixels: Double,
      scaledDensity: Double,
      widthPixels: Double,
      xdpi: Double,
      ydpi: Double
    ): DisplayMetrics = {
      val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any], densityDpi = densityDpi.asInstanceOf[js.Any], heightPixels = heightPixels.asInstanceOf[js.Any], scaledDensity = scaledDensity.asInstanceOf[js.Any], widthPixels = widthPixels.asInstanceOf[js.Any], xdpi = xdpi.asInstanceOf[js.Any], ydpi = ydpi.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayMetrics]
    }
    
    @scala.inline
    implicit class DisplayMetricsMutableBuilder[Self <: DisplayMetrics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDensityDpi(value: Double): Self = StObject.set(x, "densityDpi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightPixels(value: Double): Self = StObject.set(x, "heightPixels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaledDensity(value: Double): Self = StObject.set(x, "scaledDensity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthPixels(value: Double): Self = StObject.set(x, "widthPixels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXdpi(value: Double): Self = StObject.set(x, "xdpi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYdpi(value: Double): Self = StObject.set(x, "ydpi", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LayoutDirection extends StObject
  
  @js.native
  trait Log extends StObject
  
  type LongSparseArray[T] = SparseArray[T]
  
  @js.native
  trait MathUtils extends StObject
  
  @js.native
  trait Pools extends StObject {
    
    var a: SimplePool[String] = js.native
  }
  object Pools {
    
    @scala.inline
    def apply(a: SimplePool[String]): Pools = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pools]
    }
    
    @js.native
    trait Pool[T] extends StObject {
      
      def acquire(): T = js.native
      
      def release(instance: T): Boolean = js.native
    }
    object Pool {
      
      @scala.inline
      def apply[T](acquire: () => T, release: T => Boolean): Pool[T] = {
        val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), release = js.Any.fromFunction1(release))
        __obj.asInstanceOf[Pool[T]]
      }
      
      @scala.inline
      implicit class PoolMutableBuilder[Self <: Pool[_], T] (val x: Self with Pool[T]) extends AnyVal {
        
        @scala.inline
        def setAcquire(value: () => T): Self = StObject.set(x, "acquire", js.Any.fromFunction0(value))
        
        @scala.inline
        def setRelease(value: T => Boolean): Self = StObject.set(x, "release", js.Any.fromFunction1(value))
      }
    }
    
    @scala.inline
    implicit class PoolsMutableBuilder[Self <: Pools] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: SimplePool[String]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    }
    
    @js.native
    trait SimplePool[T] extends Pool[T] {
      
      /* private */ def isInPool(instance: js.Any): js.Any = js.native
      
      var mPool: js.Array[T] = js.native
      
      var mPoolSize: Double = js.native
    }
    object SimplePool {
      
      @scala.inline
      def apply[T](
        acquire: () => T,
        isInPool: js.Any => js.Any,
        mPool: js.Array[T],
        mPoolSize: Double,
        release: T => Boolean
      ): SimplePool[T] = {
        val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), isInPool = js.Any.fromFunction1(isInPool), mPool = mPool.asInstanceOf[js.Any], mPoolSize = mPoolSize.asInstanceOf[js.Any], release = js.Any.fromFunction1(release))
        __obj.asInstanceOf[SimplePool[T]]
      }
      
      @scala.inline
      implicit class SimplePoolMutableBuilder[Self <: SimplePool[_], T] (val x: Self with SimplePool[T]) extends AnyVal {
        
        @scala.inline
        def setIsInPool(value: js.Any => js.Any): Self = StObject.set(x, "isInPool", js.Any.fromFunction1(value))
        
        @scala.inline
        def setMPool(value: js.Array[T]): Self = StObject.set(x, "mPool", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMPoolSize(value: Double): Self = StObject.set(x, "mPoolSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMPoolVarargs(value: T*): Self = StObject.set(x, "mPool", js.Array(value :_*))
      }
    }
    
    type SynchronizedPool[T] = SimplePool[T]
  }
  
  type SparseArray[T] = SparseMap[Double, T]
  
  type SparseBooleanArray = SparseArray[Boolean]
  
  @js.native
  trait SparseMap[K, T] extends StObject {
    
    def append(key: js.Any, value: js.Any): Unit = js.native
    
    def clear(): Unit = js.native
    
    def delete(key: K): Unit = js.native
    
    def get(key: K): T = js.native
    def get(key: K, valueIfKeyNotFound: T): T = js.native
    
    def indexOfKey(key: K): Double = js.native
    
    def indexOfValue(value: T): Double = js.native
    
    def keyAt(index: Double): K = js.native
    
    var map: Map[K, T] = js.native
    
    def put(key: K, value: T): Unit = js.native
    
    def remove(key: K): Unit = js.native
    
    def removeAt(index: Double): Unit = js.native
    
    def removeAtRange(index: Double): Unit = js.native
    def removeAtRange(index: Double, size: Double): Unit = js.native
    
    def setValueAt(index: Double, value: T): Unit = js.native
    
    def size(): Double = js.native
    
    def valueAt(index: Double): T = js.native
  }
  
  @js.native
  trait StateSet extends StObject
  
  @js.native
  trait TypedValue extends StObject
}
