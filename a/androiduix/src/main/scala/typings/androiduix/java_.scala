package typings.androiduix

import typings.std.IterableIterator
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object java_ {
  
  object lang {
    
    @js.native
    trait Class extends StObject {
      
      var clazz: js.Function = js.native
      
      def getName(): String = js.native
      
      def getSimpleName(): String = js.native
    }
    object Class {
      
      @scala.inline
      def apply(clazz: js.Function, getName: () => String, getSimpleName: () => String): Class = {
        val __obj = js.Dynamic.literal(clazz = clazz.asInstanceOf[js.Any], getName = js.Any.fromFunction0(getName), getSimpleName = js.Any.fromFunction0(getSimpleName))
        __obj.asInstanceOf[Class]
      }
      
      @scala.inline
      implicit class ClassMutableBuilder[Self <: Class] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClazz(value: js.Function): Self = StObject.set(x, "clazz", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetSimpleName(value: () => String): Self = StObject.set(x, "getSimpleName", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait Comparable[T] extends StObject {
      
      def compareTo(o: T): Double = js.native
    }
    object Comparable {
      
      @scala.inline
      def apply[T](compareTo: T => Double): Comparable[T] = {
        val __obj = js.Dynamic.literal(compareTo = js.Any.fromFunction1(compareTo))
        __obj.asInstanceOf[Comparable[T]]
      }
      
      @scala.inline
      implicit class ComparableMutableBuilder[Self <: Comparable[_], T] (val x: Self with Comparable[T]) extends AnyVal {
        
        @scala.inline
        def setCompareTo(value: T => Double): Self = StObject.set(x, "compareTo", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait Float extends StObject
    
    @js.native
    trait Integer extends StObject
    
    @js.native
    trait JavaObject extends StObject {
      
      def equals(o: js.Any): Boolean = js.native
      
      var hash: js.Any = js.native
    }
    object JavaObject {
      
      @scala.inline
      def apply(equals_ : js.Any => Boolean, hash: js.Any): JavaObject = {
        val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
        __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
        __obj.asInstanceOf[JavaObject]
      }
      
      @scala.inline
      implicit class JavaObjectMutableBuilder[Self <: JavaObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEquals_(value: js.Any => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
        
        @scala.inline
        def setHash(value: js.Any): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Long extends StObject
    
    @js.native
    trait Runnable extends StObject {
      
      def run(): js.Any = js.native
    }
    object Runnable {
      
      @scala.inline
      def apply(run: () => js.Any): Runnable = {
        val __obj = js.Dynamic.literal(run = js.Any.fromFunction0(run))
        __obj.asInstanceOf[Runnable]
      }
      
      @scala.inline
      implicit class RunnableMutableBuilder[Self <: Runnable] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRun(value: () => js.Any): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait StringBuilder extends StObject {
      
      def append(a: js.Any): StringBuilder = js.native
      
      var array: js.Array[String] = js.native
      
      def deleteCharAt(index: Double): StringBuilder = js.native
      
      def length(): Double = js.native
      
      def replace(start: Double, end: Double, str: String): StringBuilder = js.native
      
      def setLength(length: Double): Unit = js.native
    }
    object StringBuilder {
      
      @scala.inline
      def apply(
        append: js.Any => StringBuilder,
        array: js.Array[String],
        deleteCharAt: Double => StringBuilder,
        length: () => Double,
        replace: (Double, Double, String) => StringBuilder,
        setLength: Double => Unit
      ): StringBuilder = {
        val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), array = array.asInstanceOf[js.Any], deleteCharAt = js.Any.fromFunction1(deleteCharAt), length = js.Any.fromFunction0(length), replace = js.Any.fromFunction3(replace), setLength = js.Any.fromFunction1(setLength))
        __obj.asInstanceOf[StringBuilder]
      }
      
      @scala.inline
      implicit class StringBuilderMutableBuilder[Self <: StringBuilder] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAppend(value: js.Any => StringBuilder): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
        
        @scala.inline
        def setArray(value: js.Array[String]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArrayVarargs(value: String*): Self = StObject.set(x, "array", js.Array(value :_*))
        
        @scala.inline
        def setDeleteCharAt(value: Double => StringBuilder): Self = StObject.set(x, "deleteCharAt", js.Any.fromFunction1(value))
        
        @scala.inline
        def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
        
        @scala.inline
        def setReplace(value: (Double, Double, String) => StringBuilder): Self = StObject.set(x, "replace", js.Any.fromFunction3(value))
        
        @scala.inline
        def setSetLength(value: Double => Unit): Self = StObject.set(x, "setLength", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait System extends StObject
    
    object ref {
      
      @js.native
      trait WeakReference[T] extends StObject {
        
        def clear(): Unit = js.native
        
        def get(): T = js.native
        
        def set(value: T): Unit = js.native
        
        var weakMap: WeakMap[_, T] = js.native
      }
      object WeakReference {
        
        @scala.inline
        def apply[T](clear: () => Unit, get: () => T, set: T => Unit, weakMap: WeakMap[_, T]): WeakReference[T] = {
          val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set), weakMap = weakMap.asInstanceOf[js.Any])
          __obj.asInstanceOf[WeakReference[T]]
        }
        
        @scala.inline
        implicit class WeakReferenceMutableBuilder[Self <: WeakReference[_], T] (val x: Self with WeakReference[T]) extends AnyVal {
          
          @scala.inline
          def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
          
          @scala.inline
          def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
          
          @scala.inline
          def setSet(value: T => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
          
          @scala.inline
          def setWeakMap(value: WeakMap[_, T]): Self = StObject.set(x, "weakMap", value.asInstanceOf[js.Any])
        }
      }
    }
    
    object util {
      
      object concurrent {
        
        @js.native
        trait CopyOnWriteArrayList[T] extends StObject {
          
          def add(items: T*): Unit = js.native
          
          def addAll(array: CopyOnWriteArrayList[T]): Unit = js.native
          
          /* private */ def checkNewData(): js.Any = js.native
          
          var isDataNew: js.Any = js.native
          
          def iterator(): js.Array[T] = js.native
          
          @JSName(js.Symbol.iterator)
          var iterator_FCopyOnWriteArrayList: js.Function0[IterableIterator[T]] = js.native
          
          var mData: js.Any = js.native
          
          def remove(item: T): Unit = js.native
          
          def size(): Double = js.native
        }
      }
    }
  }
  
  object util {
    
    @js.native
    trait ArrayDeque[E] extends ArrayList[E] {
      
      def addFirst(e: E): Unit = js.native
      
      def addLast(e: E): Unit = js.native
      
      /* private */ def delete(i: js.Any): js.Any = js.native
      
      def element(): E = js.native
      
      def getFirst(): E = js.native
      
      def getLast(): E = js.native
      
      def offer(e: E): Boolean = js.native
      
      def offerFirst(e: E): Boolean = js.native
      
      def offerLast(e: E): Boolean = js.native
      
      def peek(): E = js.native
      
      def peekFirst(): E = js.native
      
      def peekLast(): E = js.native
      
      def poll(): E = js.native
      
      def pollFirst(): E = js.native
      
      def pollLast(): E = js.native
      
      def pop(): E = js.native
      
      def push(e: E): Unit = js.native
      
      def remove(): E = js.native
      
      def removeFirst(): E = js.native
      
      def removeFirstOccurrence(o: js.Any): Boolean = js.native
      
      def removeLast(): E = js.native
      
      def removeLastOccurrence(o: js.Any): Boolean = js.native
    }
    
    @js.native
    trait ArrayList[T] extends List[T] {
      
      def addAll(index: Double, list: ArrayList[T]): js.Any = js.native
      def addAll(list: ArrayList[T]): js.Any = js.native
      
      var array: js.Array[T] = js.native
      
      @JSName(js.Symbol.iterator)
      var iterator: js.Function0[js.Function0[IterableIterator[T]]] = js.native
      
      def removeAll(list: ArrayList[T]): Boolean = js.native
      
      def toArray(): js.Array[T] = js.native
    }
    
    @js.native
    trait Arrays extends StObject
    
    @js.native
    trait Collections extends StObject
    
    @js.native
    trait Comparator[T] extends StObject {
      
      def compare(o1: T, o2: T): Double = js.native
    }
    object Comparator {
      
      @scala.inline
      def apply[T](compare: (T, T) => Double): Comparator[T] = {
        val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare))
        __obj.asInstanceOf[Comparator[T]]
      }
      
      @scala.inline
      implicit class ComparatorMutableBuilder[Self <: Comparator[_], T] (val x: Self with Comparator[T]) extends AnyVal {
        
        @scala.inline
        def setCompare(value: (T, T) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
      }
    }
    
    @js.native
    trait List[T] extends StObject {
      
      def add(index: Double, t: T): js.Any = js.native
      def add(t: T): js.Any = js.native
      
      def addAll(index: Double, list: List[T]): js.Any = js.native
      def addAll(list: List[T]): js.Any = js.native
      
      def clear(): js.Any = js.native
      
      def contains(o: T): js.Any = js.native
      
      def get(index: Double): T = js.native
      
      def getArray(): js.Array[T] = js.native
      
      def indexOf(o: T): js.Any = js.native
      
      def isEmpty(): Boolean = js.native
      
      def lastIndexOf(o: T): js.Any = js.native
      
      def remove(o: T): js.Any = js.native
      def remove(o: Double): js.Any = js.native
      
      def removeAll(list: List[T]): Boolean = js.native
      
      def set(index: Double, element: T): T = js.native
      
      def size(): Double = js.native
      
      def sort(): js.Any = js.native
      def sort(compareFn: js.Function2[/* a */ T, /* b */ T, Double]): js.Any = js.native
      
      def subList(fromIndex: Double, toIndex: Double): List[T] = js.native
      
      def toArray(a: js.Array[T]): js.Array[T] = js.native
    }
  }
}
