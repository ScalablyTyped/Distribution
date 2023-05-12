package typings.angularCompilerCli.srcNgtscMetadataSrcApiMod

import typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.ClassPropertyName
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectiveTypeCheckMeta extends StObject {
  
  /**
    * The set of input fields which have a corresponding static `ngAcceptInputType_` on the
    * Directive's class. This allows inputs to accept a wider range of types and coerce the input to
    * a narrower type with a getter/setter. See https://angular.io/guide/template-typecheck.
    */
  var coercedInputFields: Set[ClassPropertyName]
  
  /**
    * Whether the Directive's class has a static ngTemplateContextGuard function.
    */
  var hasNgTemplateContextGuard: Boolean
  
  /**
    * Whether the Directive's class is generic, i.e. `class MyDir<T> {...}`.
    */
  var isGeneric: Boolean
  
  /**
    * List of static `ngTemplateGuard_xx` members found on the Directive's class.
    * @see `TemplateGuardMeta`
    */
  var ngTemplateGuards: js.Array[TemplateGuardMeta]
  
  /**
    * The set of input fields which map to `readonly`, `private`, or `protected` members in the
    * Directive's class.
    */
  var restrictedInputFields: Set[ClassPropertyName]
  
  /**
    * The set of input fields which are declared as string literal members in the Directive's class.
    * We need to track these separately because these fields may not be valid JS identifiers so
    * we cannot use them with property access expressions when assigning inputs.
    */
  var stringLiteralInputFields: Set[ClassPropertyName]
  
  /**
    * The set of input fields which do not have corresponding members in the Directive's class.
    */
  var undeclaredInputFields: Set[ClassPropertyName]
}
object DirectiveTypeCheckMeta {
  
  inline def apply(
    coercedInputFields: Set[ClassPropertyName],
    hasNgTemplateContextGuard: Boolean,
    isGeneric: Boolean,
    ngTemplateGuards: js.Array[TemplateGuardMeta],
    restrictedInputFields: Set[ClassPropertyName],
    stringLiteralInputFields: Set[ClassPropertyName],
    undeclaredInputFields: Set[ClassPropertyName]
  ): DirectiveTypeCheckMeta = {
    val __obj = js.Dynamic.literal(coercedInputFields = coercedInputFields.asInstanceOf[js.Any], hasNgTemplateContextGuard = hasNgTemplateContextGuard.asInstanceOf[js.Any], isGeneric = isGeneric.asInstanceOf[js.Any], ngTemplateGuards = ngTemplateGuards.asInstanceOf[js.Any], restrictedInputFields = restrictedInputFields.asInstanceOf[js.Any], stringLiteralInputFields = stringLiteralInputFields.asInstanceOf[js.Any], undeclaredInputFields = undeclaredInputFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectiveTypeCheckMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectiveTypeCheckMeta] (val x: Self) extends AnyVal {
    
    inline def setCoercedInputFields(value: Set[ClassPropertyName]): Self = StObject.set(x, "coercedInputFields", value.asInstanceOf[js.Any])
    
    inline def setHasNgTemplateContextGuard(value: Boolean): Self = StObject.set(x, "hasNgTemplateContextGuard", value.asInstanceOf[js.Any])
    
    inline def setIsGeneric(value: Boolean): Self = StObject.set(x, "isGeneric", value.asInstanceOf[js.Any])
    
    inline def setNgTemplateGuards(value: js.Array[TemplateGuardMeta]): Self = StObject.set(x, "ngTemplateGuards", value.asInstanceOf[js.Any])
    
    inline def setNgTemplateGuardsVarargs(value: TemplateGuardMeta*): Self = StObject.set(x, "ngTemplateGuards", js.Array(value*))
    
    inline def setRestrictedInputFields(value: Set[ClassPropertyName]): Self = StObject.set(x, "restrictedInputFields", value.asInstanceOf[js.Any])
    
    inline def setStringLiteralInputFields(value: Set[ClassPropertyName]): Self = StObject.set(x, "stringLiteralInputFields", value.asInstanceOf[js.Any])
    
    inline def setUndeclaredInputFields(value: Set[ClassPropertyName]): Self = StObject.set(x, "undeclaredInputFields", value.asInstanceOf[js.Any])
  }
}
