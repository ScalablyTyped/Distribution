package typings.androiduix.global

import typings.androiduix.java_.util.Comparator
import typings.androiduix.java_.util.List
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object java_ {
  
  object lang {
    
    @JSGlobal("java.lang.Class")
    @js.native
    class Class protected ()
      extends typings.androiduix.java_.lang.Class {
      def this(clazz: js.Function) = this()
    }
    object Class {
      
      @JSGlobal("java.lang.Class")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("java.lang.Class.classCache")
      @js.native
      def classCache: js.Any = js.native
      @scala.inline
      def classCache_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classCache")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("java.lang.Class.getClass")
      @js.native
      def getClass_(clazz: js.Any): js.Any = js.native
    }
    
    object Comparable {
      
      @JSGlobal("java.lang.Comparable.isImpl")
      @js.native
      def isImpl(obj: js.Any): js.Any = js.native
    }
    
    @JSGlobal("java.lang.Float")
    @js.native
    class Float ()
      extends typings.androiduix.java_.lang.Float
    object Float {
      
      @JSGlobal("java.lang.Float")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("java.lang.Float.MAX_VALUE")
      @js.native
      def MAX_VALUE: Double = js.native
      @scala.inline
      def MAX_VALUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VALUE")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("java.lang.Float.MIN_VALUE")
      @js.native
      def MIN_VALUE: Double = js.native
      @scala.inline
      def MIN_VALUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_VALUE")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("java.lang.Float.parseFloat")
      @js.native
      def parseFloat(value: String): Double = js.native
    }
    
    @JSGlobal("java.lang.Integer")
    @js.native
    class Integer ()
      extends typings.androiduix.java_.lang.Integer
    object Integer {
      
      @JSGlobal("java.lang.Integer")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("java.lang.Integer.MAX_VALUE")
      @js.native
      def MAX_VALUE: Double = js.native
      @scala.inline
      def MAX_VALUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VALUE")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("java.lang.Integer.MIN_VALUE")
      @js.native
      def MIN_VALUE: Double = js.native
      @scala.inline
      def MIN_VALUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_VALUE")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("java.lang.Integer.parseInt")
      @js.native
      def parseInt(value: String): Double = js.native
      
      /* static member */
      @JSGlobal("java.lang.Integer.toHexString")
      @js.native
      def toHexString(n: Double): String = js.native
    }
    
    @JSGlobal("java.lang.JavaObject")
    @js.native
    class JavaObject ()
      extends typings.androiduix.java_.lang.JavaObject
    object JavaObject {
      
      /* static member */
      @JSGlobal("java.lang.JavaObject.class")
      @js.native
      val `class`: typings.androiduix.java_.lang.Class = js.native
    }
    
    @JSGlobal("java.lang.Long")
    @js.native
    class Long ()
      extends typings.androiduix.java_.lang.Long
    object Long {
      
      @JSGlobal("java.lang.Long")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("java.lang.Long.MAX_VALUE")
      @js.native
      def MAX_VALUE: Double = js.native
      @scala.inline
      def MAX_VALUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VALUE")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("java.lang.Long.MIN_VALUE")
      @js.native
      def MIN_VALUE: Double = js.native
      @scala.inline
      def MIN_VALUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_VALUE")(x.asInstanceOf[js.Any])
    }
    
    object Runnable {
      
      @JSGlobal("java.lang.Runnable.of")
      @js.native
      def of(func: js.Function0[_]): typings.androiduix.java_.lang.Runnable = js.native
    }
    
    @JSGlobal("java.lang.StringBuilder")
    @js.native
    class StringBuilder ()
      extends typings.androiduix.java_.lang.StringBuilder {
      def this(capacity: Double) = this()
      def this(str: String) = this()
    }
    
    @JSGlobal("java.lang.System")
    @js.native
    class System ()
      extends typings.androiduix.java_.lang.System
    object System {
      
      /* static member */
      @JSGlobal("java.lang.System.arraycopy")
      @js.native
      def arraycopy(src: js.Array[_], srcPos: Double, dest: js.Array[_], destPos: Double, length: Double): Unit = js.native
      
      /* static member */
      @JSGlobal("java.lang.System.currentTimeMillis")
      @js.native
      def currentTimeMillis(): Double = js.native
      
      /* static member */
      object out {
        
        @JSGlobal("java.lang.System.out.print")
        @js.native
        def print(any: js.Any): Unit = js.native
        
        @JSGlobal("java.lang.System.out.println")
        @js.native
        def println(): Unit = js.native
        @JSGlobal("java.lang.System.out.println")
        @js.native
        def println(any: js.Any): Unit = js.native
      }
    }
    
    object ref {
      
      @JSGlobal("java.lang.ref.WeakReference")
      @js.native
      class WeakReference[T] protected ()
        extends typings.androiduix.java_.lang.ref.WeakReference[T] {
        def this(referent: T) = this()
      }
    }
    
    object util {
      
      object concurrent {
        
        @JSGlobal("java.lang.util.concurrent.CopyOnWriteArrayList")
        @js.native
        class CopyOnWriteArrayList[T] ()
          extends typings.androiduix.java_.lang.util.concurrent.CopyOnWriteArrayList[T]
      }
    }
  }
  
  object util {
    
    @JSGlobal("java.util.ArrayDeque")
    @js.native
    class ArrayDeque[E] ()
      extends typings.androiduix.java_.util.ArrayDeque[E]
    
    @JSGlobal("java.util.ArrayList")
    @js.native
    class ArrayList[T] ()
      extends typings.androiduix.java_.util.ArrayList[T] {
      def this(initialCapacity: Double) = this()
    }
    
    @JSGlobal("java.util.Arrays")
    @js.native
    class Arrays ()
      extends typings.androiduix.java_.util.Arrays
    object Arrays {
      
      /* static member */
      @JSGlobal("java.util.Arrays.asList")
      @js.native
      def asList[T](array: js.Array[T]): List[T] = js.native
      
      /* static member */
      @JSGlobal("java.util.Arrays.equals")
      @js.native
      def equals_(a: js.Array[_], a2: js.Array[_]): Boolean = js.native
      
      /* static member */
      @JSGlobal("java.util.Arrays.rangeCheck")
      @js.native
      def rangeCheck(arrayLength: js.Any, fromIndex: js.Any, toIndex: js.Any): js.Any = js.native
      
      /* static member */
      @JSGlobal("java.util.Arrays.sort")
      @js.native
      def sort(a: js.Array[Double], fromIndex: Double, toIndex: Double): Unit = js.native
    }
    
    @JSGlobal("java.util.Collections")
    @js.native
    class Collections ()
      extends typings.androiduix.java_.util.Collections
    object Collections {
      
      @JSGlobal("java.util.Collections")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("java.util.Collections.EMPTY_LIST")
      @js.native
      def EMPTY_LIST: js.Any = js.native
      @scala.inline
      def EMPTY_LIST_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY_LIST")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("java.util.Collections.emptyList")
      @js.native
      def emptyList(): List[_] = js.native
      
      /* static member */
      @JSGlobal("java.util.Collections.sort")
      @js.native
      def sort[T](list: List[T]): Unit = js.native
      @JSGlobal("java.util.Collections.sort")
      @js.native
      def sort[T](list: List[T], c: Comparator[T]): Unit = js.native
    }
  }
}
