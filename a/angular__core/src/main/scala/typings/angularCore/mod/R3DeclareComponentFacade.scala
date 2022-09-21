package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DeclareComponentFacade
  extends StObject
     with R3DeclareDirectiveFacade {
  
  var animations: js.UndefOr[OpaqueValue] = js.undefined
  
  var changeDetection: js.UndefOr[ChangeDetectionStrategy2] = js.undefined
  
  var components: js.UndefOr[js.Array[R3DeclareDirectiveDependencyFacade]] = js.undefined
  
  var dependencies: js.UndefOr[js.Array[R3DeclareTemplateDependencyFacade]] = js.undefined
  
  var directives: js.UndefOr[js.Array[R3DeclareDirectiveDependencyFacade]] = js.undefined
  
  var encapsulation: js.UndefOr[ViewEncapsulation2] = js.undefined
  
  var interpolation: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  
  var isInline: js.UndefOr[Boolean] = js.undefined
  
  var pipes: js.UndefOr[StringDictionary[OpaqueValue | js.Function0[OpaqueValue]]] = js.undefined
  
  var preserveWhitespaces: js.UndefOr[Boolean] = js.undefined
  
  var styles: js.UndefOr[js.Array[String]] = js.undefined
  
  var template: String
  
  var viewProviders: js.UndefOr[OpaqueValue] = js.undefined
}
object R3DeclareComponentFacade {
  
  inline def apply(template: String, `type`: Type2): R3DeclareComponentFacade = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclareComponentFacade]
  }
  
  extension [Self <: R3DeclareComponentFacade](x: Self) {
    
    inline def setAnimations(value: OpaqueValue): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    inline def setAnimationsUndefined: Self = StObject.set(x, "animations", js.undefined)
    
    inline def setChangeDetection(value: ChangeDetectionStrategy2): Self = StObject.set(x, "changeDetection", value.asInstanceOf[js.Any])
    
    inline def setChangeDetectionUndefined: Self = StObject.set(x, "changeDetection", js.undefined)
    
    inline def setComponents(value: js.Array[R3DeclareDirectiveDependencyFacade]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setComponentsVarargs(value: R3DeclareDirectiveDependencyFacade*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setDependencies(value: js.Array[R3DeclareTemplateDependencyFacade]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: R3DeclareTemplateDependencyFacade*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setDirectives(value: js.Array[R3DeclareDirectiveDependencyFacade]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    inline def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
    
    inline def setDirectivesVarargs(value: R3DeclareDirectiveDependencyFacade*): Self = StObject.set(x, "directives", js.Array(value*))
    
    inline def setEncapsulation(value: ViewEncapsulation2): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
    
    inline def setEncapsulationUndefined: Self = StObject.set(x, "encapsulation", js.undefined)
    
    inline def setInterpolation(value: js.Tuple2[String, String]): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    inline def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
    
    inline def setIsInlineUndefined: Self = StObject.set(x, "isInline", js.undefined)
    
    inline def setPipes(value: StringDictionary[OpaqueValue | js.Function0[OpaqueValue]]): Self = StObject.set(x, "pipes", value.asInstanceOf[js.Any])
    
    inline def setPipesUndefined: Self = StObject.set(x, "pipes", js.undefined)
    
    inline def setPreserveWhitespaces(value: Boolean): Self = StObject.set(x, "preserveWhitespaces", value.asInstanceOf[js.Any])
    
    inline def setPreserveWhitespacesUndefined: Self = StObject.set(x, "preserveWhitespaces", js.undefined)
    
    inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setViewProviders(value: OpaqueValue): Self = StObject.set(x, "viewProviders", value.asInstanceOf[js.Any])
    
    inline def setViewProvidersUndefined: Self = StObject.set(x, "viewProviders", js.undefined)
  }
}
