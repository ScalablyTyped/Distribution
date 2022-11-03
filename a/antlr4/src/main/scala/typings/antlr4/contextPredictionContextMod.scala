package typings.antlr4

import typings.antlr4.antlr4Ints.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextPredictionContextMod {
  
  @JSImport("antlr4/context/PredictionContext", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with PredictionContext {
    def this(cachedHashCode: Double) = this()
    
    /* CompleteClass */
    override def hasEmptyPath(): Boolean = js.native
    
    /**
      * Stores the computed hash code of this {@link PredictionContext}.
      */
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /* CompleteClass */
    override def updateHashCode(hash: typings.antlr4.miscHashCodeMod.default): Unit = js.native
  }
  /* static members */
  object default {
    
    @JSImport("antlr4/context/PredictionContext", "default.EMPTY")
    @js.native
    val EMPTY: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    
    @JSImport("antlr4/context/PredictionContext", "default.EMPTY_RETURN_STATE")
    @js.native
    val EMPTY_RETURN_STATE: /* 0x7fffffff */ Double = js.native
    
    @JSImport("antlr4/context/PredictionContext", "default.globalNodeCount")
    @js.native
    val globalNodeCount: `1` = js.native
    
    @JSImport("antlr4/context/PredictionContext", "default.id")
    @js.native
    val id: Double = js.native
  }
  
  trait PredictionContext extends StObject {
    
    def hasEmptyPath(): Boolean
    
    /**
      * Stores the computed hash code of this {@link PredictionContext}.
      */
    def isEmpty(): Boolean
    
    def updateHashCode(hash: typings.antlr4.miscHashCodeMod.default): Unit
  }
  object PredictionContext {
    
    inline def apply(
      hasEmptyPath: () => Boolean,
      isEmpty: () => Boolean,
      updateHashCode: typings.antlr4.miscHashCodeMod.default => Unit
    ): PredictionContext = {
      val __obj = js.Dynamic.literal(hasEmptyPath = js.Any.fromFunction0(hasEmptyPath), isEmpty = js.Any.fromFunction0(isEmpty), updateHashCode = js.Any.fromFunction1(updateHashCode))
      __obj.asInstanceOf[PredictionContext]
    }
    
    extension [Self <: PredictionContext](x: Self) {
      
      inline def setHasEmptyPath(value: () => Boolean): Self = StObject.set(x, "hasEmptyPath", js.Any.fromFunction0(value))
      
      inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      inline def setUpdateHashCode(value: typings.antlr4.miscHashCodeMod.default => Unit): Self = StObject.set(x, "updateHashCode", js.Any.fromFunction1(value))
    }
  }
}
