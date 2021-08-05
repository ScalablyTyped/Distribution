package typings.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.astTypes.namedTypesMod.namedTypes.TSFunctionType
  - typings.astTypes.namedTypesMod.namedTypes.TSConstructorType
  - typings.astTypes.namedTypesMod.namedTypes.TSIndexSignature
  - typings.astTypes.namedTypesMod.namedTypes.TSPropertySignature
  - typings.astTypes.namedTypesMod.namedTypes.TSMethodSignature
  - typings.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
  - typings.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
*/
trait TSHasOptionalTypeAnnotationKind extends StObject
object TSHasOptionalTypeAnnotationKind {
  
  inline def TSCallSignatureDeclaration(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): typings.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSCallSignatureDeclaration")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration]
  }
  
  inline def TSConstructSignatureDeclaration(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): typings.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSConstructSignatureDeclaration")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration]
  }
  
  inline def TSConstructorType(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): typings.astTypes.namedTypesMod.namedTypes.TSConstructorType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSConstructorType")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSConstructorType]
  }
  
  inline def TSFunctionType(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): typings.astTypes.namedTypesMod.namedTypes.TSFunctionType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSFunctionType")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSFunctionType]
  }
  
  inline def TSIndexSignature(parameters: js.Array[IdentifierKind]): typings.astTypes.namedTypesMod.namedTypes.TSIndexSignature = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSIndexSignature")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSIndexSignature]
  }
  
  inline def TSMethodSignature(
    key: ExpressionKind,
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]
  ): typings.astTypes.namedTypesMod.namedTypes.TSMethodSignature = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSMethodSignature")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSMethodSignature]
  }
  
  inline def TSPropertySignature(key: ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.TSPropertySignature = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSPropertySignature")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSPropertySignature]
  }
}
