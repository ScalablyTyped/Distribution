package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atnAtnconfigMod {
  
  @JSImport("antlr4/atn/ATNConfig", JSImport.Default)
  @js.native
  /**
    * The syntactic context is a graph-structured stack node whose
    * path(s) to the root is the rule invocation(s)
    * chain used to arrive at the state.  The semantic context is
    * the tree of semantic predicates encountered before reaching
    * an ATN state
    */
  open class default ()
    extends StObject
       with ATNConfig {
    def this(params: ATNConfig) = this()
    def this(params: Unit, config: ATNConfigConfig) = this()
    def this(params: ATNConfig, config: ATNConfigConfig) = this()
    
    /* CompleteClass */
    var alt: Double = js.native
    
    /* CompleteClass */
    override def checkContext(state: typings.antlr4.stateAtnstateMod.default, config: ATNConfig): Unit = js.native
    
    /**
      * The stack of invoking states leading to the rule/states associated
      * with this config.  We track only those contexts pushed during
      * execution of the ATN simulator
      */
    /* CompleteClass */
    var context: typings.antlr4.contextPredictionContextMod.default = js.native
    
    /**
      * An ATN configuration is equal to another if both have
      * the same state, they predict the same alternative, and
      * syntactic/semantic contexts are the same
      */
    /* CompleteClass */
    override def equals(other: ATNConfig): Any = js.native
    
    /* CompleteClass */
    override def equalsForConfigSet(other: ATNConfig): Boolean = js.native
    
    /* CompleteClass */
    override def hashCodeForConfigSet(): Double = js.native
    
    /* CompleteClass */
    var precedenceFilterSuppressed: Boolean = js.native
    
    /**
      * We cannot execute predicates dependent upon local context unless
      * we know for sure we are in the correct context. Because there is
      * no way to do this efficiently, we simply cannot evaluate
      * dependent predicates unless we are in the rule that initially
      * invokes the ATN simulator.
      * closure() tracks the depth of how far we dip into the
      * outer context: depth < 0.  Note that it may not be totally
      * accurate depth since I don't ever decrement
      */
    /* CompleteClass */
    var reachesIntoOuterContext: Double = js.native
    
    /* CompleteClass */
    var semanticContext: typings.antlr4.atnSemanticContextMod.default = js.native
    
    /* CompleteClass */
    var state: typings.antlr4.stateAtnstateMod.default = js.native
    
    /* CompleteClass */
    override def updateHashCode(hash: typings.antlr4.miscHashCodeMod.default): Unit = js.native
  }
  
  trait ATNConfig extends StObject {
    
    var alt: Double
    
    def checkContext(state: typings.antlr4.stateAtnstateMod.default, config: ATNConfig): Unit
    
    /**
      * The stack of invoking states leading to the rule/states associated
      * with this config.  We track only those contexts pushed during
      * execution of the ATN simulator
      */
    var context: typings.antlr4.contextPredictionContextMod.default
    
    /**
      * An ATN configuration is equal to another if both have
      * the same state, they predict the same alternative, and
      * syntactic/semantic contexts are the same
      */
    def equals(other: ATNConfig): Any
    
    def equalsForConfigSet(other: ATNConfig): Boolean
    
    def hashCodeForConfigSet(): Double
    
    var precedenceFilterSuppressed: Boolean
    
    /**
      * We cannot execute predicates dependent upon local context unless
      * we know for sure we are in the correct context. Because there is
      * no way to do this efficiently, we simply cannot evaluate
      * dependent predicates unless we are in the rule that initially
      * invokes the ATN simulator.
      * closure() tracks the depth of how far we dip into the
      * outer context: depth < 0.  Note that it may not be totally
      * accurate depth since I don't ever decrement
      */
    var reachesIntoOuterContext: Double
    
    var semanticContext: typings.antlr4.atnSemanticContextMod.default
    
    var state: typings.antlr4.stateAtnstateMod.default
    
    def updateHashCode(hash: typings.antlr4.miscHashCodeMod.default): Unit
  }
  object ATNConfig {
    
    inline def apply(
      alt: Double,
      checkContext: (typings.antlr4.stateAtnstateMod.default, ATNConfig) => Unit,
      context: typings.antlr4.contextPredictionContextMod.default,
      equalsForConfigSet: ATNConfig => Boolean,
      equals_ : ATNConfig => Any,
      hashCodeForConfigSet: () => Double,
      precedenceFilterSuppressed: Boolean,
      reachesIntoOuterContext: Double,
      semanticContext: typings.antlr4.atnSemanticContextMod.default,
      state: typings.antlr4.stateAtnstateMod.default,
      updateHashCode: typings.antlr4.miscHashCodeMod.default => Unit
    ): ATNConfig = {
      val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], checkContext = js.Any.fromFunction2(checkContext), context = context.asInstanceOf[js.Any], equalsForConfigSet = js.Any.fromFunction1(equalsForConfigSet), hashCodeForConfigSet = js.Any.fromFunction0(hashCodeForConfigSet), precedenceFilterSuppressed = precedenceFilterSuppressed.asInstanceOf[js.Any], reachesIntoOuterContext = reachesIntoOuterContext.asInstanceOf[js.Any], semanticContext = semanticContext.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updateHashCode = js.Any.fromFunction1(updateHashCode))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[ATNConfig]
    }
    
    extension [Self <: ATNConfig](x: Self) {
      
      inline def setAlt(value: Double): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setCheckContext(value: (typings.antlr4.stateAtnstateMod.default, ATNConfig) => Unit): Self = StObject.set(x, "checkContext", js.Any.fromFunction2(value))
      
      inline def setContext(value: typings.antlr4.contextPredictionContextMod.default): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setEqualsForConfigSet(value: ATNConfig => Boolean): Self = StObject.set(x, "equalsForConfigSet", js.Any.fromFunction1(value))
      
      inline def setEquals_(value: ATNConfig => Any): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setHashCodeForConfigSet(value: () => Double): Self = StObject.set(x, "hashCodeForConfigSet", js.Any.fromFunction0(value))
      
      inline def setPrecedenceFilterSuppressed(value: Boolean): Self = StObject.set(x, "precedenceFilterSuppressed", value.asInstanceOf[js.Any])
      
      inline def setReachesIntoOuterContext(value: Double): Self = StObject.set(x, "reachesIntoOuterContext", value.asInstanceOf[js.Any])
      
      inline def setSemanticContext(value: typings.antlr4.atnSemanticContextMod.default): Self = StObject.set(x, "semanticContext", value.asInstanceOf[js.Any])
      
      inline def setState(value: typings.antlr4.stateAtnstateMod.default): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setUpdateHashCode(value: typings.antlr4.miscHashCodeMod.default => Unit): Self = StObject.set(x, "updateHashCode", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined parent std.Pick<antlr4.antlr4/atn/ATNConfig.ATNConfig, 'state' | 'alt' | 'context' | 'semanticContext'> */
  trait ATNConfigConfig extends StObject {
    
    var alt: Double
    
    var context: typings.antlr4.contextPredictionContextMod.default
    
    var precedenceFilterSuppressed: Boolean
    
    var reachesIntoOuterContext: Double
    
    var semanticContext: typings.antlr4.atnSemanticContextMod.default
    
    var state: typings.antlr4.stateAtnstateMod.default
  }
  object ATNConfigConfig {
    
    inline def apply(
      alt: Double,
      context: typings.antlr4.contextPredictionContextMod.default,
      precedenceFilterSuppressed: Boolean,
      reachesIntoOuterContext: Double,
      semanticContext: typings.antlr4.atnSemanticContextMod.default,
      state: typings.antlr4.stateAtnstateMod.default
    ): ATNConfigConfig = {
      val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], precedenceFilterSuppressed = precedenceFilterSuppressed.asInstanceOf[js.Any], reachesIntoOuterContext = reachesIntoOuterContext.asInstanceOf[js.Any], semanticContext = semanticContext.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ATNConfigConfig]
    }
    
    extension [Self <: ATNConfigConfig](x: Self) {
      
      inline def setAlt(value: Double): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setContext(value: typings.antlr4.contextPredictionContextMod.default): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setPrecedenceFilterSuppressed(value: Boolean): Self = StObject.set(x, "precedenceFilterSuppressed", value.asInstanceOf[js.Any])
      
      inline def setReachesIntoOuterContext(value: Double): Self = StObject.set(x, "reachesIntoOuterContext", value.asInstanceOf[js.Any])
      
      inline def setSemanticContext(value: typings.antlr4.atnSemanticContextMod.default): Self = StObject.set(x, "semanticContext", value.asInstanceOf[js.Any])
      
      inline def setState(value: typings.antlr4.stateAtnstateMod.default): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
