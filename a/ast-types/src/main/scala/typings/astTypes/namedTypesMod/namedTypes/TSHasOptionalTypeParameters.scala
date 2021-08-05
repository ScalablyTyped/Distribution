package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.TSTypeParameterDeclarationKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSHasOptionalTypeParameters extends StObject {
  
  var typeParameters: js.UndefOr[TSTypeParameterDeclarationKind | Null] = js.undefined
}
object TSHasOptionalTypeParameters {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.TSHasOptionalTypeParameters")
  @js.native
  val ^ : Type[TSHasOptionalTypeParameters] = js.native
  
  extension [Self <: TSHasOptionalTypeParameters](x: Self) {
    
    inline def setTypeParameters(value: TSTypeParameterDeclarationKind): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
