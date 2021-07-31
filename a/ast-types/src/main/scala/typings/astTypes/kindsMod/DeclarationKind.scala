package typings.astTypes.kindsMod

import typings.astTypes.astTypesStrings.`var`
import typings.astTypes.astTypesStrings.const
import typings.astTypes.astTypesStrings.constructor
import typings.astTypes.astTypesStrings.get
import typings.astTypes.astTypesStrings.let
import typings.astTypes.astTypesStrings.method
import typings.astTypes.astTypesStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.astTypes.namedTypesMod.namedTypes.VariableDeclaration
  - typings.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
  - typings.astTypes.namedTypesMod.namedTypes.MethodDefinition
  - typings.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition
  - typings.astTypes.namedTypesMod.namedTypes.ClassProperty
  - typings.astTypes.namedTypesMod.namedTypes.ClassBody
  - typings.astTypes.namedTypesMod.namedTypes.ClassDeclaration
  - typings.astTypes.namedTypesMod.namedTypes.ImportDeclaration
  - typings.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration
  - typings.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration
  - typings.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration
  - typings.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
  - typings.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration
  - typings.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration
  - typings.astTypes.namedTypesMod.namedTypes.DeclareInterface
  - typings.astTypes.namedTypesMod.namedTypes.TypeAlias
  - typings.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
  - typings.astTypes.namedTypesMod.namedTypes.OpaqueType
  - typings.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
  - typings.astTypes.namedTypesMod.namedTypes.DeclareClass
  - typings.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration
  - typings.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration
  - typings.astTypes.namedTypesMod.namedTypes.EnumDeclaration
  - typings.astTypes.namedTypesMod.namedTypes.ExportDeclaration
  - typings.astTypes.namedTypesMod.namedTypes.ClassMethod
  - typings.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
  - typings.astTypes.namedTypesMod.namedTypes.TSDeclareFunction
  - typings.astTypes.namedTypesMod.namedTypes.TSDeclareMethod
  - typings.astTypes.namedTypesMod.namedTypes.TSIndexSignature
  - typings.astTypes.namedTypesMod.namedTypes.TSPropertySignature
  - typings.astTypes.namedTypesMod.namedTypes.TSMethodSignature
  - typings.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
  - typings.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
  - typings.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration
  - typings.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration
  - typings.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration
  - typings.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration
  - typings.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference
  - typings.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration
  - typings.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration
*/
trait DeclarationKind extends StObject
object DeclarationKind {
  
  @scala.inline
  def ClassBody(
    body: js.Array[
      MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind | ClassPrivatePropertyKind | ClassMethodKind | ClassPrivateMethodKind | TSDeclareMethodKind | TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ]
  ): typings.astTypes.namedTypesMod.namedTypes.ClassBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassBody")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ClassBody]
  }
  
  @scala.inline
  def ClassDeclaration(body: ClassBodyKind): typings.astTypes.namedTypesMod.namedTypes.ClassDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = null)
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ClassDeclaration]
  }
  
  @scala.inline
  def ClassMethod(
    body: BlockStatementKind,
    key: LiteralKind | IdentifierKind | ExpressionKind,
    params: js.Array[PatternKind]
  ): typings.astTypes.namedTypesMod.namedTypes.ClassMethod = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassMethod")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ClassMethod]
  }
  
  @scala.inline
  def ClassPrivateMethod(body: BlockStatementKind, key: PrivateNameKind, params: js.Array[PatternKind]): typings.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassPrivateMethod")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod]
  }
  
  @scala.inline
  def ClassPrivateProperty(key: PrivateNameKind): typings.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassPrivateProperty")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty]
  }
  
  @scala.inline
  def ClassProperty(key: LiteralKind | IdentifierKind | ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.ClassProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = null)
    __obj.updateDynamic("type")("ClassProperty")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ClassProperty]
  }
  
  @scala.inline
  def ClassPropertyDefinition(
    definition: MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind
  ): typings.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassPropertyDefinition")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition]
  }
  
  @scala.inline
  def DeclareClass(body: ObjectTypeAnnotationKind, `extends`: js.Array[InterfaceExtendsKind], id: IdentifierKind): typings.astTypes.namedTypesMod.namedTypes.DeclareClass = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareClass")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DeclareClass]
  }
  
  @scala.inline
  def DeclareExportAllDeclaration(): typings.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareExportAllDeclaration")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration]
  }
  
  @scala.inline
  def DeclareExportDeclaration(default: Boolean): typings.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], declaration = null)
    __obj.updateDynamic("type")("DeclareExportDeclaration")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration]
  }
  
  @scala.inline
  def DeclareInterface(body: ObjectTypeAnnotationKind, `extends`: js.Array[InterfaceExtendsKind], id: IdentifierKind): typings.astTypes.namedTypesMod.namedTypes.DeclareInterface = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareInterface")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DeclareInterface]
  }
  
  @scala.inline
  def DeclareOpaqueType(id: IdentifierKind): typings.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = null)
    __obj.updateDynamic("type")("DeclareOpaqueType")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType]
  }
  
  @scala.inline
  def DeclareTypeAlias(id: IdentifierKind, right: FlowTypeKind): typings.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareTypeAlias")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias]
  }
  
  @scala.inline
  def EnumDeclaration(
    body: EnumBooleanBodyKind | EnumNumberBodyKind | EnumStringBodyKind | EnumSymbolBodyKind,
    id: IdentifierKind
  ): typings.astTypes.namedTypesMod.namedTypes.EnumDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumDeclaration")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.EnumDeclaration]
  }
  
  @scala.inline
  def ExportAllDeclaration(source: LiteralKind): typings.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], exported = null)
    __obj.updateDynamic("type")("ExportAllDeclaration")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration]
  }
  
  @scala.inline
  def ExportDeclaration(default: Boolean): typings.astTypes.namedTypesMod.namedTypes.ExportDeclaration = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], declaration = null)
    __obj.updateDynamic("type")("ExportDeclaration")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ExportDeclaration]
  }
  
  @scala.inline
  def ExportDefaultDeclaration(declaration: DeclarationKind | ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration]
  }
  
  @scala.inline
  def ExportNamedDeclaration(): typings.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration = {
    val __obj = js.Dynamic.literal(declaration = null)
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration]
  }
  
  @scala.inline
  def FunctionDeclaration(body: BlockStatementKind, params: js.Array[PatternKind]): typings.astTypes.namedTypesMod.namedTypes.FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], id = null)
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.FunctionDeclaration]
  }
  
  @scala.inline
  def ImportDeclaration(source: LiteralKind): typings.astTypes.namedTypesMod.namedTypes.ImportDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDeclaration")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ImportDeclaration]
  }
  
  @scala.inline
  def InterfaceDeclaration(body: ObjectTypeAnnotationKind, `extends`: js.Array[InterfaceExtendsKind], id: IdentifierKind): typings.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InterfaceDeclaration")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration]
  }
  
  @scala.inline
  def MethodDefinition(key: ExpressionKind, kind: constructor | method | get | set, value: FunctionKind): typings.astTypes.namedTypesMod.namedTypes.MethodDefinition = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MethodDefinition")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.MethodDefinition]
  }
  
  @scala.inline
  def OpaqueType(id: IdentifierKind, impltype: FlowTypeKind): typings.astTypes.namedTypesMod.namedTypes.OpaqueType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any], supertype = null, typeParameters = null)
    __obj.updateDynamic("type")("OpaqueType")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.OpaqueType]
  }
  
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
  def TSEnumDeclaration(id: IdentifierKind, members: js.Array[TSEnumMemberKind]): typings.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSEnumDeclaration")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration]
  }
  
  @scala.inline
  def TSExternalModuleReference(expression: StringLiteralKind): typings.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSExternalModuleReference")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference]
  }
  
  @scala.inline
  def TSImportEqualsDeclaration(
    id: IdentifierKind,
    moduleReference: IdentifierKind | TSQualifiedNameKind | TSExternalModuleReferenceKind
  ): typings.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], moduleReference = moduleReference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSImportEqualsDeclaration")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration]
  }
  
  @scala.inline
  def TSIndexSignature(parameters: js.Array[IdentifierKind]): typings.astTypes.namedTypesMod.namedTypes.TSIndexSignature = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSIndexSignature")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSIndexSignature]
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
  def TSModuleDeclaration(id: StringLiteralKind | IdentifierKind | TSQualifiedNameKind): typings.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSModuleDeclaration")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration]
  }
  
  @scala.inline
  def TSNamespaceExportDeclaration(id: IdentifierKind): typings.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSNamespaceExportDeclaration")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration]
  }
  
  @scala.inline
  def TSPropertySignature(key: ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.TSPropertySignature = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSPropertySignature")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSPropertySignature]
  }
  
  @scala.inline
  def TSTypeAliasDeclaration(id: IdentifierKind, typeAnnotation: TSTypeKind): typings.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeAliasDeclaration")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration]
  }
  
  @scala.inline
  def TSTypeParameterDeclaration(params: js.Array[TSTypeParameterKind]): typings.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeParameterDeclaration")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration]
  }
  
  @scala.inline
  def TypeAlias(id: IdentifierKind, right: FlowTypeKind): typings.astTypes.namedTypesMod.namedTypes.TypeAlias = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], typeParameters = null)
    __obj.updateDynamic("type")("TypeAlias")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TypeAlias]
  }
  
  @scala.inline
  def VariableDeclaration(declarations: js.Array[VariableDeclaratorKind | IdentifierKind], kind: `var` | let | const): typings.astTypes.namedTypesMod.namedTypes.VariableDeclaration = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.VariableDeclaration]
  }
}
