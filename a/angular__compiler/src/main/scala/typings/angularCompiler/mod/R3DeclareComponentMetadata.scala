package typings.angularCompiler.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DeclareComponentMetadata
  extends StObject
     with R3DeclareDirectiveMetadata {
  
  /**
    * A collection of animation triggers that will be used in the component template.
    */
  var animations: js.UndefOr[Expression] = js.undefined
  
  /**
    * Strategy used for detecting changes in the component.
    * Defaults to `ChangeDetectionStrategy.Default`.
    */
  var changeDetection: js.UndefOr[ChangeDetectionStrategy] = js.undefined
  
  /**
    * List of components which matched in the template, including sufficient
    * metadata for each directive to attribute bindings and references within
    * the template to each directive specifically, if the runtime instructions
    * support this.
    */
  var components: js.UndefOr[js.Array[R3DeclareDirectiveDependencyMetadata]] = js.undefined
  
  /**
    * List of dependencies which matched in the template, including sufficient
    * metadata for each directive/pipe to attribute bindings and references within
    * the template to each directive specifically, if the runtime instructions
    * support this.
    */
  var dependencies: js.UndefOr[js.Array[R3DeclareTemplateDependencyMetadata]] = js.undefined
  
  /**
    * List of directives which matched in the template, including sufficient
    * metadata for each directive to attribute bindings and references within
    * the template to each directive specifically, if the runtime instructions
    * support this.
    */
  var directives: js.UndefOr[js.Array[R3DeclareDirectiveDependencyMetadata]] = js.undefined
  
  /**
    * An encapsulation policy for the component's styling.
    * Defaults to `ViewEncapsulation.Emulated`.
    */
  var encapsulation: js.UndefOr[ViewEncapsulation] = js.undefined
  
  /**
    * Overrides the default interpolation start and end delimiters. Defaults to {{ and }}.
    */
  var interpolation: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  
  /**
    * Whether the template was inline (using `template`) or external (using `templateUrl`).
    * Defaults to false.
    */
  var isInline: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A map of pipe names to an expression referencing the pipe type (possibly a forward reference
    * wrapped in a `forwardRef` invocation) which are used in the template.
    */
  var pipes: js.UndefOr[StringDictionary[Expression | js.Function0[Expression]]] = js.undefined
  
  /**
    * Whether whitespace in the template should be preserved. Defaults to false.
    */
  var preserveWhitespaces: js.UndefOr[Boolean] = js.undefined
  
  /**
    * CSS from inline styles and included styleUrls.
    */
  var styles: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The component's unparsed template string as opaque expression. The template is represented
    * using either a string literal or template literal without substitutions, but its value is
    * not read directly. Instead, the template parser is given the full source file's text and
    * the range of this expression to parse directly from source.
    */
  var template: Expression
  
  /**
    * The list of view providers defined in the component.
    */
  var viewProviders: js.UndefOr[Expression] = js.undefined
}
object R3DeclareComponentMetadata {
  
  inline def apply(
    minVersion: String,
    ngImport: Expression,
    template: Expression,
    `type`: Expression,
    version: String
  ): R3DeclareComponentMetadata = {
    val __obj = js.Dynamic.literal(minVersion = minVersion.asInstanceOf[js.Any], ngImport = ngImport.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclareComponentMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: R3DeclareComponentMetadata] (val x: Self) extends AnyVal {
    
    inline def setAnimations(value: Expression): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    inline def setAnimationsUndefined: Self = StObject.set(x, "animations", js.undefined)
    
    inline def setChangeDetection(value: ChangeDetectionStrategy): Self = StObject.set(x, "changeDetection", value.asInstanceOf[js.Any])
    
    inline def setChangeDetectionUndefined: Self = StObject.set(x, "changeDetection", js.undefined)
    
    inline def setComponents(value: js.Array[R3DeclareDirectiveDependencyMetadata]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setComponentsVarargs(value: R3DeclareDirectiveDependencyMetadata*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setDependencies(value: js.Array[R3DeclareTemplateDependencyMetadata]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: R3DeclareTemplateDependencyMetadata*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setDirectives(value: js.Array[R3DeclareDirectiveDependencyMetadata]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    inline def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
    
    inline def setDirectivesVarargs(value: R3DeclareDirectiveDependencyMetadata*): Self = StObject.set(x, "directives", js.Array(value*))
    
    inline def setEncapsulation(value: ViewEncapsulation): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
    
    inline def setEncapsulationUndefined: Self = StObject.set(x, "encapsulation", js.undefined)
    
    inline def setInterpolation(value: js.Tuple2[String, String]): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    inline def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
    
    inline def setIsInlineUndefined: Self = StObject.set(x, "isInline", js.undefined)
    
    inline def setPipes(value: StringDictionary[Expression | js.Function0[Expression]]): Self = StObject.set(x, "pipes", value.asInstanceOf[js.Any])
    
    inline def setPipesUndefined: Self = StObject.set(x, "pipes", js.undefined)
    
    inline def setPreserveWhitespaces(value: Boolean): Self = StObject.set(x, "preserveWhitespaces", value.asInstanceOf[js.Any])
    
    inline def setPreserveWhitespacesUndefined: Self = StObject.set(x, "preserveWhitespaces", js.undefined)
    
    inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setTemplate(value: Expression): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setViewProviders(value: Expression): Self = StObject.set(x, "viewProviders", value.asInstanceOf[js.Any])
    
    inline def setViewProvidersUndefined: Self = StObject.set(x, "viewProviders", js.undefined)
  }
}
