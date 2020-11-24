package typings.androiduix.global.java_

import typings.androiduix.anon.Print
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("java.lang")
@js.native
object lang extends js.Object {
  
  @js.native
  class Class protected ()
    extends typings.androiduix.java_.lang.Class {
    def this(clazz: js.Function) = this()
  }
  /* static members */
  @js.native
  object Class extends js.Object {
    
    var classCache: js.Any = js.native
    
    /* private */ def getClass(clazz: js.Any): js.Any = js.native
  }
  
  @js.native
  object Comparable extends js.Object {
    
    def isImpl(obj: js.Any): js.Any = js.native
  }
  
  @js.native
  class Float ()
    extends typings.androiduix.java_.lang.Float
  /* static members */
  @js.native
  object Float extends js.Object {
    
    var MAX_VALUE: Double = js.native
    
    var MIN_VALUE: Double = js.native
    
    def parseFloat(value: String): Double = js.native
  }
  
  @js.native
  class Integer ()
    extends typings.androiduix.java_.lang.Integer
  /* static members */
  @js.native
  object Integer extends js.Object {
    
    var MAX_VALUE: Double = js.native
    
    var MIN_VALUE: Double = js.native
    
    def parseInt(value: String): Double = js.native
    
    def toHexString(n: Double): String = js.native
  }
  
  @js.native
  class JavaObject ()
    extends typings.androiduix.java_.lang.JavaObject
  /* static members */
  @js.native
  object JavaObject extends js.Object {
    
    val `class`: typings.androiduix.java_.lang.Class = js.native
  }
  
  @js.native
  class Long ()
    extends typings.androiduix.java_.lang.Long
  /* static members */
  @js.native
  object Long extends js.Object {
    
    var MAX_VALUE: Double = js.native
    
    var MIN_VALUE: Double = js.native
  }
  
  @js.native
  object Runnable extends js.Object {
    
    def of(func: js.Function0[_]): typings.androiduix.java_.lang.Runnable = js.native
  }
  
  @js.native
  class StringBuilder ()
    extends typings.androiduix.java_.lang.StringBuilder {
    def this(capacity: Double) = this()
    def this(str: String) = this()
  }
  
  @js.native
  class System ()
    extends typings.androiduix.java_.lang.System
  /* static members */
  @js.native
  object System extends js.Object {
    
    def arraycopy(src: js.Array[_], srcPos: Double, dest: js.Array[_], destPos: Double, length: Double): Unit = js.native
    
    def currentTimeMillis(): Double = js.native
    
    var out: Print = js.native
  }
  
  @js.native
  object ref extends js.Object {
    
    @js.native
    class WeakReference[T] protected ()
      extends typings.androiduix.java_.lang.ref.WeakReference[T] {
      def this(referent: T) = this()
    }
  }
  
  @js.native
  object util extends js.Object {
    
    @js.native
    object concurrent extends js.Object {
      
      @js.native
      class CopyOnWriteArrayList[T] ()
        extends typings.androiduix.java_.lang.util.concurrent.CopyOnWriteArrayList[T]
    }
  }
}
