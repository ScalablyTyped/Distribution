package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscHashCodeMod {
  
  @JSImport("antlr4/misc/HashCode", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with HashCode {
    
    /* CompleteClass */
    override def finish(): Double = js.native
    
    /* CompleteClass */
    override def update(hashes: Double*): Unit = js.native
  }
  /* static members */
  object default {
    
    @JSImport("antlr4/misc/HashCode", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def hashStuff(hashes: Double*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hashStuff")(hashes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Double]
  }
  
  trait HashCode extends StObject {
    
    def finish(): Double
    
    def update(hashes: Double*): Unit
  }
  object HashCode {
    
    inline def apply(finish: () => Double, update: /* repeated */ Double => Unit): HashCode = {
      val __obj = js.Dynamic.literal(finish = js.Any.fromFunction0(finish), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[HashCode]
    }
    
    extension [Self <: HashCode](x: Self) {
      
      inline def setFinish(value: () => Double): Self = StObject.set(x, "finish", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: /* repeated */ Double => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
}
