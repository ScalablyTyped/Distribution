package typings.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.astTypes.namedTypesMod.namedTypes.TSFunctionType
  - typings.astTypes.namedTypesMod.namedTypes.TSConstructorType
  - typings.astTypes.namedTypesMod.namedTypes.TSDeclareFunction
  - typings.astTypes.namedTypesMod.namedTypes.TSDeclareMethod
  - typings.astTypes.namedTypesMod.namedTypes.TSMethodSignature
  - typings.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
  - typings.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
  - typings.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration
  - typings.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration
*/
trait TSHasOptionalTypeParametersKind extends StObject
object TSHasOptionalTypeParametersKind {
  
  @scala.inline
  def TSCallSignatureDeclaration(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): typings.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSCallSignatureDeclaration")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration]
  }
  
  @scala.inline
  def TSConstructSignatureDeclaration(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): typings.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSConstructSignatureDeclaration")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration]
  }
  
  @scala.inline
  def TSConstructorType(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): typings.astTypes.namedTypesMod.namedTypes.TSConstructorType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSConstructorType")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSConstructorType]
  }
  
  @scala.inline
  def TSDeclareFunction(params: js.Array[PatternKind]): typings.astTypes.namedTypesMod.namedTypes.TSDeclareFunction = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSDeclareFunction")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSDeclareFunction]
  }
  
  @scala.inline
  def TSDeclareMethod(
    key: IdentifierKind | StringLiteralKind | NumericLiteralKind | ExpressionKind,
    params: js.Array[PatternKind]
  ): typings.astTypes.namedTypesMod.namedTypes.TSDeclareMethod = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSDeclareMethod")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSDeclareMethod]
  }
  
  @scala.inline
  def TSFunctionType(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): typings.astTypes.namedTypesMod.namedTypes.TSFunctionType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSFunctionType")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSFunctionType]
  }
  
  @scala.inline
  def TSInterfaceDeclaration(body: TSInterfaceBodyKind, id: IdentifierKind | TSQualifiedNameKind): typings.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSInterfaceDeclaration")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration]
  }
  
  @scala.inline
  def TSMethodSignature(
    key: ExpressionKind,
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]
  ): typings.astTypes.namedTypesMod.namedTypes.TSMethodSignature = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSMethodSignature")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSMethodSignature]
  }
  
  @scala.inline
  def TSTypeAliasDeclaration(id: IdentifierKind, typeAnnotation: TSTypeKind): typings.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeAliasDeclaration")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration]
  }
}
