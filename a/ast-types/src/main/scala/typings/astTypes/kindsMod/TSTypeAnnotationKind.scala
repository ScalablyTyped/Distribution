package typings.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation
  - typings.astTypes.namedTypesMod.namedTypes.TSTypePredicate
*/
trait TSTypeAnnotationKind extends StObject
object TSTypeAnnotationKind {
  
  inline def TSTypeAnnotation(typeAnnotation: TSTypeKind | TSTypeAnnotationKind): typings.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeAnnotation")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation]
  }
  
  inline def TSTypePredicate(parameterName: IdentifierKind | TSThisTypeKind): typings.astTypes.namedTypesMod.namedTypes.TSTypePredicate = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypePredicate")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypePredicate]
  }
}
