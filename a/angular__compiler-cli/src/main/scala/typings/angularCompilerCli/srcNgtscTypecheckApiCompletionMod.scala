package typings.angularCompilerCli

import typings.angularCompiler.mod.TmplAstReference
import typings.angularCompiler.mod.TmplAstVariable
import typings.angularCompilerCli.srcNgtscTypecheckApiCompletionMod.CompletionKind.Reference
import typings.angularCompilerCli.srcNgtscTypecheckApiCompletionMod.CompletionKind.Variable
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.TcbLocation
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckApiCompletionMod {
  
  @js.native
  sealed trait CompletionKind extends StObject
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/api/completion", "CompletionKind")
  @js.native
  object CompletionKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CompletionKind & Double] = js.native
    
    @js.native
    sealed trait Reference
      extends StObject
         with CompletionKind
    /* 0 */ val Reference: typings.angularCompilerCli.srcNgtscTypecheckApiCompletionMod.CompletionKind.Reference & Double = js.native
    
    @js.native
    sealed trait Variable
      extends StObject
         with CompletionKind
    /* 1 */ val Variable: typings.angularCompilerCli.srcNgtscTypecheckApiCompletionMod.CompletionKind.Variable & Double = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularCompilerCli.srcNgtscTypecheckApiCompletionMod.ReferenceCompletion
    - typings.angularCompilerCli.srcNgtscTypecheckApiCompletionMod.VariableCompletion
  */
  trait Completion extends StObject
  object Completion {
    
    inline def ReferenceCompletion(kind: Reference, node: TmplAstReference): typings.angularCompilerCli.srcNgtscTypecheckApiCompletionMod.ReferenceCompletion = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscTypecheckApiCompletionMod.ReferenceCompletion]
    }
    
    inline def VariableCompletion(kind: Variable, node: TmplAstVariable): typings.angularCompilerCli.srcNgtscTypecheckApiCompletionMod.VariableCompletion = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscTypecheckApiCompletionMod.VariableCompletion]
    }
  }
  
  trait GlobalCompletion extends StObject {
    
    /**
      * A location within the type-checking shim where TypeScript's completion APIs can be used to
      * access completions for the template's component context (component class members).
      */
    var componentContext: TcbLocation
    
    /**
      * A location within the type-checking shim where TypeScript's completion APIs can be used to
      * access completions for the AST node of the cursor position (primitive constants).
      */
    var nodeContext: TcbLocation | Null
    
    /**
      * `Map` of local references and variables that are visible at the requested level of the
      * template.
      *
      * Shadowing of references/variables from multiple levels of the template has already been
      * accounted for in the preparation of `templateContext`. Entries here shadow component members of
      * the same name (from the `componentContext` completions).
      */
    var templateContext: Map[String, ReferenceCompletion | VariableCompletion]
  }
  object GlobalCompletion {
    
    inline def apply(
      componentContext: TcbLocation,
      templateContext: Map[String, ReferenceCompletion | VariableCompletion]
    ): GlobalCompletion = {
      val __obj = js.Dynamic.literal(componentContext = componentContext.asInstanceOf[js.Any], templateContext = templateContext.asInstanceOf[js.Any], nodeContext = null)
      __obj.asInstanceOf[GlobalCompletion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlobalCompletion] (val x: Self) extends AnyVal {
      
      inline def setComponentContext(value: TcbLocation): Self = StObject.set(x, "componentContext", value.asInstanceOf[js.Any])
      
      inline def setNodeContext(value: TcbLocation): Self = StObject.set(x, "nodeContext", value.asInstanceOf[js.Any])
      
      inline def setNodeContextNull: Self = StObject.set(x, "nodeContext", null)
      
      inline def setTemplateContext(value: Map[String, ReferenceCompletion | VariableCompletion]): Self = StObject.set(x, "templateContext", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReferenceCompletion
    extends StObject
       with Completion {
    
    var kind: Reference
    
    /**
      * The `TmplAstReference` from the template which should be available as a completion.
      */
    var node: TmplAstReference
  }
  object ReferenceCompletion {
    
    inline def apply(kind: Reference, node: TmplAstReference): ReferenceCompletion = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReferenceCompletion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReferenceCompletion] (val x: Self) extends AnyVal {
      
      inline def setKind(value: Reference): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setNode(value: TmplAstReference): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait VariableCompletion
    extends StObject
       with Completion {
    
    var kind: Variable
    
    /**
      * The `TmplAstVariable` from the template which should be available as a completion.
      */
    var node: TmplAstVariable
  }
  object VariableCompletion {
    
    inline def apply(kind: Variable, node: TmplAstVariable): VariableCompletion = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[VariableCompletion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VariableCompletion] (val x: Self) extends AnyVal {
      
      inline def setKind(value: Variable): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setNode(value: TmplAstVariable): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
}
