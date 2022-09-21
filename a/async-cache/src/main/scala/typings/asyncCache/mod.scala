package typings.asyncCache

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.lruCache.mod.DeprecatedOptions
import typings.lruCache.mod.SharedOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("async-cache", JSImport.Namespace)
  @js.native
  open class ^[T] protected ()
    extends StObject
       with Cache[T] {
    def this(options: Options[T]) = this()
  }
  @JSImport("async-cache", JSImport.Namespace)
  @js.native
  val ^ : AsyncCacheFactory = js.native
  
  @js.native
  trait AsyncCacheFactory
    extends StObject
       with Instantiable1[/* options */ Options[js.Object], Cache[js.Object]] {
    
    def apply[T](options: Options[T]): Cache[T] = js.native
  }
  
  @js.native
  trait Cache[T] extends StObject {
    
    def del(key: String): Unit = js.native
    
    def get(key: String, cb: js.Function2[/* error */ Any, /* value */ T, Unit]): Unit = js.native
    
    def has(key: String): Boolean = js.native
    
    val itemCount: Double = js.native
    
    def keys(): js.Array[String] = js.native
    
    def peek(key: String): js.UndefOr[T] = js.native
    
    def reset(): Unit = js.native
    
    def set(key: String, value: T): Boolean = js.native
    def set(key: String, value: T, maxAge: Double): Boolean = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped lru-cache.lru-cache.LimitedByCount | lru-cache.lru-cache.LimitedBySize<string, T> | lru-cache.lru-cache.LimitedByTTL
  - Dropped lru-cache.anon.MaxEntrySize<string, T> | {} */ trait Options[T]
    extends StObject
       with SharedOptions[String, T]
       with DeprecatedOptions[String, T] {
    
    def load(
      key: String,
      callback: js.Function3[/* error */ Any, /* asyncValue */ T, /* maxAge */ js.UndefOr[Double], Unit]
    ): Unit
  }
  object Options {
    
    inline def apply[T](
      load: (String, js.Function3[/* error */ Any, /* asyncValue */ T, /* maxAge */ js.UndefOr[Double], Unit]) => Unit
    ): Options[T] = {
      val __obj = js.Dynamic.literal(load = js.Any.fromFunction2(load))
      __obj.asInstanceOf[Options[T]]
    }
    
    extension [Self <: Options[?], T](x: Self & Options[T]) {
      
      inline def setLoad(
        value: (String, js.Function3[/* error */ Any, /* asyncValue */ T, /* maxAge */ js.UndefOr[Double], Unit]) => Unit
      ): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
    }
  }
  
  type _To = AsyncCacheFactory
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: AsyncCacheFactory = ^
}
