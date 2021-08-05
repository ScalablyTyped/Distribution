package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.TSTypeParameterInstantiationKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSHasOptionalTypeParameterInstantiation extends StObject {
  
  var typeParameters: js.UndefOr[TSTypeParameterInstantiationKind | Null] = js.undefined
}
object TSHasOptionalTypeParameterInstantiation {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.TSHasOptionalTypeParameterInstantiation")
  @js.native
  val ^ : Type[TSHasOptionalTypeParameterInstantiation] = js.native
  
  extension [Self <: TSHasOptionalTypeParameterInstantiation](x: Self) {
    
    inline def setTypeParameters(value: TSTypeParameterInstantiationKind): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
