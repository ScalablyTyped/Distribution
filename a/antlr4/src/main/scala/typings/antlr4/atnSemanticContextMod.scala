package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atnSemanticContextMod {
  
  /* note: abstract class */ @JSImport("antlr4/atn/SemanticContext", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with SemanticContext {
    
    /**
      * Evaluate the precedence predicates for the context and reduce the result.
      *
      * @param parser The parser instance.
      * @param outerContext The current parser context object.
      * @return The simplified semantic context after precedence predicates are
      * evaluated, which will be one of the following values.
      *
      * - {@link NONE}: if the predicate simplifies to `true` after
      * precedence predicates are evaluated.
      * - `null`: if the predicate simplifies to `false` after
      * precedence predicates are evaluated.</li>
      * - `this`: if the semantic context is not changed as a result of
      * precedence predicate evaluation.
      * - A non-`null` {@link SemanticContext}: the new simplified
      * semantic context after precedence predicates are evaluated.
      */
    /* CompleteClass */
    override def evalPrecedence(
      parser: typings.antlr4.recognizerMod.default,
      outerContext: typings.antlr4.contextRuleContextMod.default
    ): SemanticContext | Null = js.native
    
    /**
      * For context independent predicates, we evaluate them without a local
      * context (i.e., null context). That way, we can evaluate them without
      * having to create proper rule-specific context during prediction (as
      * opposed to the parser, which creates them naturally). In a practical
      * sense, this avoids a cast exception from RuleContext to myruleContext.
      *
      * For context dependent predicates, we must pass in a local context so that
      * references such as $arg evaluate properly as _localctx.arg. We only
      * capture context dependent predicates in the context in which we begin
      * prediction, so we passed in the outer context here in case of context
      * dependent predicate evaluation.
      */
    /* CompleteClass */
    override def evaluate(
      parser: typings.antlr4.recognizerMod.default,
      outerContext: typings.antlr4.contextRuleContextMod.default
    ): Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("antlr4/atn/SemanticContext", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antlr4/atn/SemanticContext", "default.NONE")
    @js.native
    def NONE: typings.antlr4.atnPredicateMod.default = js.native
    inline def NONE_=(x: typings.antlr4.atnPredicateMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE")(x.asInstanceOf[js.Any])
    
    inline def andContext(): AND = ^.asInstanceOf[js.Dynamic].applyDynamic("andContext")().asInstanceOf[AND]
    inline def andContext(a: Null, b: SemanticContext): AND = (^.asInstanceOf[js.Dynamic].applyDynamic("andContext")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[AND]
    inline def andContext(a: SemanticContext): AND = ^.asInstanceOf[js.Dynamic].applyDynamic("andContext")(a.asInstanceOf[js.Any]).asInstanceOf[AND]
    inline def andContext(a: SemanticContext, b: SemanticContext): AND = (^.asInstanceOf[js.Dynamic].applyDynamic("andContext")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[AND]
    
    inline def orContext(): OR = ^.asInstanceOf[js.Dynamic].applyDynamic("orContext")().asInstanceOf[OR]
    inline def orContext(a: Null, b: SemanticContext): OR = (^.asInstanceOf[js.Dynamic].applyDynamic("orContext")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[OR]
    inline def orContext(a: SemanticContext): OR = ^.asInstanceOf[js.Dynamic].applyDynamic("orContext")(a.asInstanceOf[js.Any]).asInstanceOf[OR]
    inline def orContext(a: SemanticContext, b: SemanticContext): OR = (^.asInstanceOf[js.Dynamic].applyDynamic("orContext")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[OR]
  }
  
  @JSImport("antlr4/atn/SemanticContext", "AND")
  @js.native
  open class AND protected ()
    extends StObject
       with SemanticContext {
    def this(a: SemanticContext, b: SemanticContext) = this()
    
    def equals(other: SemanticContext): Boolean = js.native
    
    def evalPrecedence(parser: Any, outerContext: Any): SemanticContext | Null = js.native
    /**
      * Evaluate the precedence predicates for the context and reduce the result.
      *
      * @param parser The parser instance.
      * @param outerContext The current parser context object.
      * @return The simplified semantic context after precedence predicates are
      * evaluated, which will be one of the following values.
      *
      * - {@link NONE}: if the predicate simplifies to `true` after
      * precedence predicates are evaluated.
      * - `null`: if the predicate simplifies to `false` after
      * precedence predicates are evaluated.</li>
      * - `this`: if the semantic context is not changed as a result of
      * precedence predicate evaluation.
      * - A non-`null` {@link SemanticContext}: the new simplified
      * semantic context after precedence predicates are evaluated.
      */
    /* CompleteClass */
    override def evalPrecedence(
      parser: typings.antlr4.recognizerMod.default,
      outerContext: typings.antlr4.contextRuleContextMod.default
    ): SemanticContext | Null = js.native
    
    def evaluate(parser: Any, outerContext: Any): Boolean = js.native
    /**
      * For context independent predicates, we evaluate them without a local
      * context (i.e., null context). That way, we can evaluate them without
      * having to create proper rule-specific context during prediction (as
      * opposed to the parser, which creates them naturally). In a practical
      * sense, this avoids a cast exception from RuleContext to myruleContext.
      *
      * For context dependent predicates, we must pass in a local context so that
      * references such as $arg evaluate properly as _localctx.arg. We only
      * capture context dependent predicates in the context in which we begin
      * prediction, so we passed in the outer context here in case of context
      * dependent predicate evaluation.
      */
    /* CompleteClass */
    override def evaluate(
      parser: typings.antlr4.recognizerMod.default,
      outerContext: typings.antlr4.contextRuleContextMod.default
    ): Boolean = js.native
    
    def updateHashCode(hash: typings.antlr4.miscHashCodeMod.default): Unit = js.native
  }
  
  @JSImport("antlr4/atn/SemanticContext", "OR")
  @js.native
  open class OR protected ()
    extends StObject
       with SemanticContext {
    def this(a: SemanticContext, b: SemanticContext) = this()
    
    def equals(other: SemanticContext): Boolean = js.native
    
    /**
      * Evaluate the precedence predicates for the context and reduce the result.
      *
      * @param parser The parser instance.
      * @param outerContext The current parser context object.
      * @return The simplified semantic context after precedence predicates are
      * evaluated, which will be one of the following values.
      *
      * - {@link NONE}: if the predicate simplifies to `true` after
      * precedence predicates are evaluated.
      * - `null`: if the predicate simplifies to `false` after
      * precedence predicates are evaluated.</li>
      * - `this`: if the semantic context is not changed as a result of
      * precedence predicate evaluation.
      * - A non-`null` {@link SemanticContext}: the new simplified
      * semantic context after precedence predicates are evaluated.
      */
    /* CompleteClass */
    override def evalPrecedence(
      parser: typings.antlr4.recognizerMod.default,
      outerContext: typings.antlr4.contextRuleContextMod.default
    ): SemanticContext | Null = js.native
    
    /**
      * For context independent predicates, we evaluate them without a local
      * context (i.e., null context). That way, we can evaluate them without
      * having to create proper rule-specific context during prediction (as
      * opposed to the parser, which creates them naturally). In a practical
      * sense, this avoids a cast exception from RuleContext to myruleContext.
      *
      * For context dependent predicates, we must pass in a local context so that
      * references such as $arg evaluate properly as _localctx.arg. We only
      * capture context dependent predicates in the context in which we begin
      * prediction, so we passed in the outer context here in case of context
      * dependent predicate evaluation.
      */
    /* CompleteClass */
    override def evaluate(
      parser: typings.antlr4.recognizerMod.default,
      outerContext: typings.antlr4.contextRuleContextMod.default
    ): Boolean = js.native
    
    def updateHashCode(hash: typings.antlr4.miscHashCodeMod.default): Unit = js.native
  }
  
  trait SemanticContext extends StObject {
    
    /**
      * Evaluate the precedence predicates for the context and reduce the result.
      *
      * @param parser The parser instance.
      * @param outerContext The current parser context object.
      * @return The simplified semantic context after precedence predicates are
      * evaluated, which will be one of the following values.
      *
      * - {@link NONE}: if the predicate simplifies to `true` after
      * precedence predicates are evaluated.
      * - `null`: if the predicate simplifies to `false` after
      * precedence predicates are evaluated.</li>
      * - `this`: if the semantic context is not changed as a result of
      * precedence predicate evaluation.
      * - A non-`null` {@link SemanticContext}: the new simplified
      * semantic context after precedence predicates are evaluated.
      */
    def evalPrecedence(
      parser: typings.antlr4.recognizerMod.default,
      outerContext: typings.antlr4.contextRuleContextMod.default
    ): SemanticContext | Null
    
    /**
      * For context independent predicates, we evaluate them without a local
      * context (i.e., null context). That way, we can evaluate them without
      * having to create proper rule-specific context during prediction (as
      * opposed to the parser, which creates them naturally). In a practical
      * sense, this avoids a cast exception from RuleContext to myruleContext.
      *
      * For context dependent predicates, we must pass in a local context so that
      * references such as $arg evaluate properly as _localctx.arg. We only
      * capture context dependent predicates in the context in which we begin
      * prediction, so we passed in the outer context here in case of context
      * dependent predicate evaluation.
      */
    def evaluate(
      parser: typings.antlr4.recognizerMod.default,
      outerContext: typings.antlr4.contextRuleContextMod.default
    ): Boolean
  }
  object SemanticContext {
    
    inline def apply(
      evalPrecedence: (typings.antlr4.recognizerMod.default, typings.antlr4.contextRuleContextMod.default) => SemanticContext | Null,
      evaluate: (typings.antlr4.recognizerMod.default, typings.antlr4.contextRuleContextMod.default) => Boolean
    ): SemanticContext = {
      val __obj = js.Dynamic.literal(evalPrecedence = js.Any.fromFunction2(evalPrecedence), evaluate = js.Any.fromFunction2(evaluate))
      __obj.asInstanceOf[SemanticContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SemanticContext] (val x: Self) extends AnyVal {
      
      inline def setEvalPrecedence(
        value: (typings.antlr4.recognizerMod.default, typings.antlr4.contextRuleContextMod.default) => SemanticContext | Null
      ): Self = StObject.set(x, "evalPrecedence", js.Any.fromFunction2(value))
      
      inline def setEvaluate(
        value: (typings.antlr4.recognizerMod.default, typings.antlr4.contextRuleContextMod.default) => Boolean
      ): Self = StObject.set(x, "evaluate", js.Any.fromFunction2(value))
    }
  }
}
