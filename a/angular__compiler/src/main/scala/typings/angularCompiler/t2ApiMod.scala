package typings.angularCompiler

import typings.angularCompiler.anon.Directive
import typings.angularCompiler.astMod.AST
import typings.angularCompiler.r3AstMod.BoundAttribute
import typings.angularCompiler.r3AstMod.BoundEvent
import typings.angularCompiler.r3AstMod.Element
import typings.angularCompiler.r3AstMod.Node
import typings.angularCompiler.r3AstMod.Reference
import typings.angularCompiler.r3AstMod.Template
import typings.angularCompiler.r3AstMod.TextAttribute
import typings.angularCompiler.r3AstMod.Variable
import typings.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object t2ApiMod {
  
  @js.native
  trait BoundTarget[DirectiveT /* <: DirectiveMeta */] extends StObject {
    
    /**
      * For a given binding, get the entity to which the binding is being made.
      *
      * This will either be a directive or the node itself.
      */
    def getConsumerOfBinding(binding: BoundAttribute): DirectiveT | Element | Template | Null = js.native
    def getConsumerOfBinding(binding: BoundEvent): DirectiveT | Element | Template | Null = js.native
    def getConsumerOfBinding(binding: TextAttribute): DirectiveT | Element | Template | Null = js.native
    
    /**
      * For a given template node (either an `Element` or a `Template`), get the set of directives
      * which matched the node, if any.
      */
    def getDirectivesOfNode(node: Element): js.Array[DirectiveT] | Null = js.native
    def getDirectivesOfNode(node: Template): js.Array[DirectiveT] | Null = js.native
    
    /**
      * Get all `Reference`s and `Variables` visible within the given `Template` (or at the top level,
      * if `null` is passed).
      */
    def getEntitiesInTemplateScope(): ReadonlySet[Reference | Variable] = js.native
    def getEntitiesInTemplateScope(template: Template): ReadonlySet[Reference | Variable] = js.native
    
    /**
      * If the given `AST` expression refers to a `Reference` or `Variable` within the `Target`, then
      * return that.
      *
      * Otherwise, returns `null`.
      *
      * This is only defined for `AST` expressions that read or write to a property of an
      * `ImplicitReceiver`.
      */
    def getExpressionTarget(expr: AST): Reference | Variable | Null = js.native
    
    /**
      * Get the nesting level of a particular `Template`.
      *
      * This starts at 1 for top-level `Template`s within the `Target` and increases for `Template`s
      * nested at deeper levels.
      */
    def getNestingLevel(template: Template): Double = js.native
    
    /**
      * For a given `Reference`, get the reference's target - either an `Element`, a `Template`, or
      * a directive on a particular node.
      */
    def getReferenceTarget(ref: Reference): Directive[DirectiveT] | Element | Template | Null = js.native
    
    /**
      * Given a particular `Reference` or `Variable`, get the `Template` which created it.
      *
      * All `Variable`s are defined on templates, so this will always return a value for a `Variable`
      * from the `Target`. For `Reference`s this only returns a value if the `Reference` points to a
      * `Template`. Returns `null` otherwise.
      */
    def getTemplateOfSymbol(symbol: Reference): Template | Null = js.native
    def getTemplateOfSymbol(symbol: Variable): Template | Null = js.native
    
    /**
      * Get a list of all the directives used by the target.
      */
    def getUsedDirectives(): js.Array[DirectiveT] = js.native
    
    /**
      * Get a list of all the pipes used by the target.
      */
    def getUsedPipes(): js.Array[String] = js.native
    
    /**
      * Get the original `Target` that was bound.
      */
    val target: Target = js.native
  }
  
  @js.native
  trait DirectiveMeta extends StObject {
    
    /**
      * Name under which the directive is exported, if any (exportAs in Angular).
      *
      * Null otherwise
      */
    var exportAs: js.Array[String] | Null = js.native
    
    /**
      * Set of inputs which this directive claims.
      *
      * Goes from property names to field names.
      */
    var inputs: InputOutputPropertySet = js.native
    
    /**
      * Whether the directive is a component.
      */
    var isComponent: Boolean = js.native
    
    /**
      * Name of the directive class (used for debugging).
      */
    var name: String = js.native
    
    /**
      * Set of outputs which this directive claims.
      *
      * Goes from property names to field names.
      */
    var outputs: InputOutputPropertySet = js.native
    
    /** The selector for the directive or `null` if there isn't one. */
    var selector: String | Null = js.native
  }
  object DirectiveMeta {
    
    @scala.inline
    def apply(
      inputs: InputOutputPropertySet,
      isComponent: Boolean,
      name: String,
      outputs: InputOutputPropertySet
    ): DirectiveMeta = {
      val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectiveMeta]
    }
    
    @scala.inline
    implicit class DirectiveMetaMutableBuilder[Self <: DirectiveMeta] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExportAs(value: js.Array[String]): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportAsNull: Self = StObject.set(x, "exportAs", null)
      
      @scala.inline
      def setExportAsVarargs(value: String*): Self = StObject.set(x, "exportAs", js.Array(value :_*))
      
      @scala.inline
      def setInputs(value: InputOutputPropertySet): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsComponent(value: Boolean): Self = StObject.set(x, "isComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputs(value: InputOutputPropertySet): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorNull: Self = StObject.set(x, "selector", null)
    }
  }
  
  @js.native
  trait InputOutputPropertySet extends StObject {
    
    def hasBindingPropertyName(propertyName: String): Boolean = js.native
  }
  object InputOutputPropertySet {
    
    @scala.inline
    def apply(hasBindingPropertyName: String => Boolean): InputOutputPropertySet = {
      val __obj = js.Dynamic.literal(hasBindingPropertyName = js.Any.fromFunction1(hasBindingPropertyName))
      __obj.asInstanceOf[InputOutputPropertySet]
    }
    
    @scala.inline
    implicit class InputOutputPropertySetMutableBuilder[Self <: InputOutputPropertySet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasBindingPropertyName(value: String => Boolean): Self = StObject.set(x, "hasBindingPropertyName", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Target extends StObject {
    
    var template: js.UndefOr[js.Array[Node]] = js.native
  }
  object Target {
    
    @scala.inline
    def apply(): Target = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Target]
    }
    
    @scala.inline
    implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTemplate(value: js.Array[Node]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTemplateVarargs(value: Node*): Self = StObject.set(x, "template", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TargetBinder[D /* <: DirectiveMeta */] extends StObject {
    
    def bind(target: Target): BoundTarget[D] = js.native
  }
  object TargetBinder {
    
    @scala.inline
    def apply[D /* <: DirectiveMeta */](bind: Target => BoundTarget[D]): TargetBinder[D] = {
      val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind))
      __obj.asInstanceOf[TargetBinder[D]]
    }
    
    @scala.inline
    implicit class TargetBinderMutableBuilder[Self <: TargetBinder[_], D /* <: DirectiveMeta */] (val x: Self with TargetBinder[D]) extends AnyVal {
      
      @scala.inline
      def setBind(value: Target => BoundTarget[D]): Self = StObject.set(x, "bind", js.Any.fromFunction1(value))
    }
  }
}
