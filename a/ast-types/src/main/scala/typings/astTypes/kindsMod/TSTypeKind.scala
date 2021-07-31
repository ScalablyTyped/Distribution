package typings.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments
  - typings.astTypes.namedTypesMod.namedTypes.TSTypeReference
  - typings.astTypes.namedTypesMod.namedTypes.TSAnyKeyword
  - typings.astTypes.namedTypesMod.namedTypes.TSBigIntKeyword
  - typings.astTypes.namedTypesMod.namedTypes.TSBooleanKeyword
  - typings.astTypes.namedTypesMod.namedTypes.TSNeverKeyword
  - typings.astTypes.namedTypesMod.namedTypes.TSNullKeyword
  - typings.astTypes.namedTypesMod.namedTypes.TSNumberKeyword
  - typings.astTypes.namedTypesMod.namedTypes.TSObjectKeyword
  - typings.astTypes.namedTypesMod.namedTypes.TSStringKeyword
  - typings.astTypes.namedTypesMod.namedTypes.TSSymbolKeyword
  - typings.astTypes.namedTypesMod.namedTypes.TSUndefinedKeyword
  - typings.astTypes.namedTypesMod.namedTypes.TSUnknownKeyword
  - typings.astTypes.namedTypesMod.namedTypes.TSVoidKeyword
  - typings.astTypes.namedTypesMod.namedTypes.TSThisType
  - typings.astTypes.namedTypesMod.namedTypes.TSArrayType
  - typings.astTypes.namedTypesMod.namedTypes.TSLiteralType
  - typings.astTypes.namedTypesMod.namedTypes.TSUnionType
  - typings.astTypes.namedTypesMod.namedTypes.TSIntersectionType
  - typings.astTypes.namedTypesMod.namedTypes.TSConditionalType
  - typings.astTypes.namedTypesMod.namedTypes.TSInferType
  - typings.astTypes.namedTypesMod.namedTypes.TSParenthesizedType
  - typings.astTypes.namedTypesMod.namedTypes.TSFunctionType
  - typings.astTypes.namedTypesMod.namedTypes.TSConstructorType
  - typings.astTypes.namedTypesMod.namedTypes.TSMappedType
  - typings.astTypes.namedTypesMod.namedTypes.TSTupleType
  - typings.astTypes.namedTypesMod.namedTypes.TSNamedTupleMember
  - typings.astTypes.namedTypesMod.namedTypes.TSRestType
  - typings.astTypes.namedTypesMod.namedTypes.TSOptionalType
  - typings.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType
  - typings.astTypes.namedTypesMod.namedTypes.TSTypeOperator
  - typings.astTypes.namedTypesMod.namedTypes.TSTypePredicate
  - typings.astTypes.namedTypesMod.namedTypes.TSTypeQuery
  - typings.astTypes.namedTypesMod.namedTypes.TSImportType
  - typings.astTypes.namedTypesMod.namedTypes.TSTypeLiteral
*/
trait TSTypeKind extends StObject
object TSTypeKind {
  
  @scala.inline
  def TSAnyKeyword(): typings.astTypes.namedTypesMod.namedTypes.TSAnyKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSAnyKeyword")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSAnyKeyword]
  }
  
  @scala.inline
  def TSArrayType(elementType: TSTypeKind): typings.astTypes.namedTypesMod.namedTypes.TSArrayType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSArrayType")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSArrayType]
  }
  
  @scala.inline
  def TSBigIntKeyword(): typings.astTypes.namedTypesMod.namedTypes.TSBigIntKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSBigIntKeyword")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSBigIntKeyword]
  }
  
  @scala.inline
  def TSBooleanKeyword(): typings.astTypes.namedTypesMod.namedTypes.TSBooleanKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSBooleanKeyword")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSBooleanKeyword]
  }
  
  @scala.inline
  def TSConditionalType(checkType: TSTypeKind, extendsType: TSTypeKind, falseType: TSTypeKind, trueType: TSTypeKind): typings.astTypes.namedTypesMod.namedTypes.TSConditionalType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSConditionalType")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSConditionalType]
  }
  
  @scala.inline
  def TSConstructorType(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): typings.astTypes.namedTypesMod.namedTypes.TSConstructorType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSConstructorType")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSConstructorType]
  }
  
  @scala.inline
  def TSExpressionWithTypeArguments(expression: IdentifierKind | TSQualifiedNameKind): typings.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSExpressionWithTypeArguments")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments]
  }
  
  @scala.inline
  def TSFunctionType(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): typings.astTypes.namedTypesMod.namedTypes.TSFunctionType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSFunctionType")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSFunctionType]
  }
  
  @scala.inline
  def TSImportType(argument: StringLiteralKind): typings.astTypes.namedTypesMod.namedTypes.TSImportType = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSImportType")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSImportType]
  }
  
  @scala.inline
  def TSIndexedAccessType(indexType: TSTypeKind, objectType: TSTypeKind): typings.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSIndexedAccessType")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType]
  }
  
  @scala.inline
  def TSInferType(typeParameter: TSTypeParameterKind): typings.astTypes.namedTypesMod.namedTypes.TSInferType = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSInferType")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSInferType]
  }
  
  @scala.inline
  def TSIntersectionType(types: js.Array[TSTypeKind]): typings.astTypes.namedTypesMod.namedTypes.TSIntersectionType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSIntersectionType")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSIntersectionType]
  }
  
  @scala.inline
  def TSLiteralType(
    literal: NumericLiteralKind | StringLiteralKind | BooleanLiteralKind | TemplateLiteralKind | UnaryExpressionKind
  ): typings.astTypes.namedTypesMod.namedTypes.TSLiteralType = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSLiteralType")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSLiteralType]
  }
  
  @scala.inline
  def TSMappedType(typeParameter: TSTypeParameterKind): typings.astTypes.namedTypesMod.namedTypes.TSMappedType = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSMappedType")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSMappedType]
  }
  
  @scala.inline
  def TSNamedTupleMember(elementType: TSTypeKind, label: IdentifierKind): typings.astTypes.namedTypesMod.namedTypes.TSNamedTupleMember = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSNamedTupleMember")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSNamedTupleMember]
  }
  
  @scala.inline
  def TSNeverKeyword(): typings.astTypes.namedTypesMod.namedTypes.TSNeverKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNeverKeyword")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSNeverKeyword]
  }
  
  @scala.inline
  def TSNullKeyword(): typings.astTypes.namedTypesMod.namedTypes.TSNullKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNullKeyword")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSNullKeyword]
  }
  
  @scala.inline
  def TSNumberKeyword(): typings.astTypes.namedTypesMod.namedTypes.TSNumberKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNumberKeyword")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSNumberKeyword]
  }
  
  @scala.inline
  def TSObjectKeyword(): typings.astTypes.namedTypesMod.namedTypes.TSObjectKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSObjectKeyword")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSObjectKeyword]
  }
  
  @scala.inline
  def TSOptionalType(typeAnnotation: TSTypeKind): typings.astTypes.namedTypesMod.namedTypes.TSOptionalType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSOptionalType")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSOptionalType]
  }
  
  @scala.inline
  def TSParenthesizedType(typeAnnotation: TSTypeKind): typings.astTypes.namedTypesMod.namedTypes.TSParenthesizedType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSParenthesizedType")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSParenthesizedType]
  }
  
  @scala.inline
  def TSRestType(typeAnnotation: TSTypeKind): typings.astTypes.namedTypesMod.namedTypes.TSRestType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSRestType")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSRestType]
  }
  
  @scala.inline
  def TSStringKeyword(): typings.astTypes.namedTypesMod.namedTypes.TSStringKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSStringKeyword")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSStringKeyword]
  }
  
  @scala.inline
  def TSSymbolKeyword(): typings.astTypes.namedTypesMod.namedTypes.TSSymbolKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSSymbolKeyword")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSSymbolKeyword]
  }
  
  @scala.inline
  def TSThisType(): typings.astTypes.namedTypesMod.namedTypes.TSThisType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSThisType")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSThisType]
  }
  
  @scala.inline
  def TSTupleType(elementTypes: js.Array[TSTypeKind | TSNamedTupleMemberKind]): typings.astTypes.namedTypesMod.namedTypes.TSTupleType = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTupleType")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTupleType]
  }
  
  @scala.inline
  def TSTypeLiteral(
    members: js.Array[
      TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ]
  ): typings.astTypes.namedTypesMod.namedTypes.TSTypeLiteral = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeLiteral")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypeLiteral]
  }
  
  @scala.inline
  def TSTypeOperator(operator: String, typeAnnotation: TSTypeKind): typings.astTypes.namedTypesMod.namedTypes.TSTypeOperator = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeOperator")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypeOperator]
  }
  
  @scala.inline
  def TSTypePredicate(parameterName: IdentifierKind | TSThisTypeKind): typings.astTypes.namedTypesMod.namedTypes.TSTypePredicate = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypePredicate")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypePredicate]
  }
  
  @scala.inline
  def TSTypeQuery(exprName: IdentifierKind | TSQualifiedNameKind | TSImportTypeKind): typings.astTypes.namedTypesMod.namedTypes.TSTypeQuery = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeQuery")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypeQuery]
  }
  
  @scala.inline
  def TSTypeReference(typeName: IdentifierKind | TSQualifiedNameKind): typings.astTypes.namedTypesMod.namedTypes.TSTypeReference = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeReference")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypeReference]
  }
  
  @scala.inline
  def TSUndefinedKeyword(): typings.astTypes.namedTypesMod.namedTypes.TSUndefinedKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSUndefinedKeyword")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSUndefinedKeyword]
  }
  
  @scala.inline
  def TSUnionType(types: js.Array[TSTypeKind]): typings.astTypes.namedTypesMod.namedTypes.TSUnionType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSUnionType")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSUnionType]
  }
  
  @scala.inline
  def TSUnknownKeyword(): typings.astTypes.namedTypesMod.namedTypes.TSUnknownKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSUnknownKeyword")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSUnknownKeyword]
  }
  
  @scala.inline
  def TSVoidKeyword(): typings.astTypes.namedTypesMod.namedTypes.TSVoidKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSVoidKeyword")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSVoidKeyword]
  }
}
