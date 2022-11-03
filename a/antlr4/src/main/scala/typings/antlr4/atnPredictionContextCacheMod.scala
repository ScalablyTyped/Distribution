package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atnPredictionContextCacheMod {
  
  @JSImport("antlr4/atn/PredictionContextCache", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with PredictionContextCache
  
  @js.native
  trait PredictionContextCache extends StObject {
    
    /**
      * Add a context to the cache and return it. If the context already exists,
      * return that one instead and do not add a new context to the cache.
      * Protect shared cache from unsafe thread access.
      */
    def add(ctx: typings.antlr4.contextPredictionContextMod.default): typings.antlr4.contextPredictionContextMod.default = js.native
    
    val cache: typings.antlr4.miscHashMapMod.default = js.native
    
    def get(ctx: typings.antlr4.contextPredictionContextMod.default): typings.antlr4.contextPredictionContextMod.default | Null = js.native
    
    def length: Double = js.native
  }
}
