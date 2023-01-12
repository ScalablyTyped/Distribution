package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atnAtnsimulatorMod {
  
  @JSImport("antlr4/atn/ATNSimulator", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ATNSimulator {
    def this(
      atn: typings.antlr4.atnAtnMod.default,
      sharedContextCache: typings.antlr4.atnPredictionContextCacheMod.default
    ) = this()
    
    /**
      * The context cache maps all PredictionContext objects that are ==
      * to a single cached copy. This cache is shared across all contexts
      * in all ATNConfigs in all DFA states.  We rebuild each ATNConfigSet
      * to use only cached nodes/graphs in addDFAState(). We don't want to
      * fill this during closure() since there are lots of contexts that
      * pop up but are not used ever again. It also greatly slows down closure().
      *
      * This cache makes a huge difference in memory and a little bit in speed.
      * For the Java grammar on java.*, it dropped the memory requirements
      * at the end from 25M to 16M. We don't store any of the full context
      * graphs in the DFA because they are limited to local context only,
      * but apparently there's a lot of repetition there as well. We optimize
      * the config contexts before storing the config set in the DFA states
      * by literally rebuilding them with cached subgraphs only.
      *
      * I tried a cache for use during closure operations, that was
      * whacked after each adaptivePredict(). It cost a little bit
      * more time I think and doesn't save on the overall footprint
      * so it's not worth the complexity.
      */
    /* CompleteClass */
    override val atn: typings.antlr4.atnAtnMod.default = js.native
    
    /* CompleteClass */
    override def getCachedContext(context: typings.antlr4.contextPredictionContextMod.default): typings.antlr4.contextPredictionContextMod.default = js.native
    
    /* CompleteClass */
    override val sharedContextCache: typings.antlr4.atnPredictionContextCacheMod.default = js.native
  }
  /* static members */
  object default {
    
    @JSImport("antlr4/atn/ATNSimulator", "default.ERROR")
    @js.native
    val ERROR: typings.antlr4.dfaDfastateMod.default = js.native
  }
  
  trait ATNSimulator extends StObject {
    
    /**
      * The context cache maps all PredictionContext objects that are ==
      * to a single cached copy. This cache is shared across all contexts
      * in all ATNConfigs in all DFA states.  We rebuild each ATNConfigSet
      * to use only cached nodes/graphs in addDFAState(). We don't want to
      * fill this during closure() since there are lots of contexts that
      * pop up but are not used ever again. It also greatly slows down closure().
      *
      * This cache makes a huge difference in memory and a little bit in speed.
      * For the Java grammar on java.*, it dropped the memory requirements
      * at the end from 25M to 16M. We don't store any of the full context
      * graphs in the DFA because they are limited to local context only,
      * but apparently there's a lot of repetition there as well. We optimize
      * the config contexts before storing the config set in the DFA states
      * by literally rebuilding them with cached subgraphs only.
      *
      * I tried a cache for use during closure operations, that was
      * whacked after each adaptivePredict(). It cost a little bit
      * more time I think and doesn't save on the overall footprint
      * so it's not worth the complexity.
      */
    val atn: typings.antlr4.atnAtnMod.default
    
    def getCachedContext(context: typings.antlr4.contextPredictionContextMod.default): typings.antlr4.contextPredictionContextMod.default
    
    val sharedContextCache: typings.antlr4.atnPredictionContextCacheMod.default
  }
  object ATNSimulator {
    
    inline def apply(
      atn: typings.antlr4.atnAtnMod.default,
      getCachedContext: typings.antlr4.contextPredictionContextMod.default => typings.antlr4.contextPredictionContextMod.default,
      sharedContextCache: typings.antlr4.atnPredictionContextCacheMod.default
    ): ATNSimulator = {
      val __obj = js.Dynamic.literal(atn = atn.asInstanceOf[js.Any], getCachedContext = js.Any.fromFunction1(getCachedContext), sharedContextCache = sharedContextCache.asInstanceOf[js.Any])
      __obj.asInstanceOf[ATNSimulator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ATNSimulator] (val x: Self) extends AnyVal {
      
      inline def setAtn(value: typings.antlr4.atnAtnMod.default): Self = StObject.set(x, "atn", value.asInstanceOf[js.Any])
      
      inline def setGetCachedContext(
        value: typings.antlr4.contextPredictionContextMod.default => typings.antlr4.contextPredictionContextMod.default
      ): Self = StObject.set(x, "getCachedContext", js.Any.fromFunction1(value))
      
      inline def setSharedContextCache(value: typings.antlr4.atnPredictionContextCacheMod.default): Self = StObject.set(x, "sharedContextCache", value.asInstanceOf[js.Any])
    }
  }
}
