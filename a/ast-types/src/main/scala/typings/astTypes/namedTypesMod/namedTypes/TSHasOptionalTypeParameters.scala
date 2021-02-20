package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.TSTypeParameterDeclarationKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSHasOptionalTypeParameters extends StObject {
  
  var typeParameters: js.UndefOr[TSTypeParameterDeclarationKind | Null] = js.native
}
object TSHasOptionalTypeParameters {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.TSHasOptionalTypeParameters")
  @js.native
  val ^ : Type[TSHasOptionalTypeParameters] = js.native
  
  @scala.inline
  implicit class TSHasOptionalTypeParametersMutableBuilder[Self <: TSHasOptionalTypeParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTypeParameters(value: TSTypeParameterDeclarationKind): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    @scala.inline
    def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
