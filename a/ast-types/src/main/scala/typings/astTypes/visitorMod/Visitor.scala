package typings.astTypes.visitorMod

import typings.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.ArrayExpression
import typings.astTypes.namedTypesMod.namedTypes.ArrayPattern
import typings.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression
import typings.astTypes.namedTypesMod.namedTypes.AssignmentExpression
import typings.astTypes.namedTypesMod.namedTypes.AssignmentPattern
import typings.astTypes.namedTypesMod.namedTypes.AwaitExpression
import typings.astTypes.namedTypesMod.namedTypes.BigIntLiteral
import typings.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.BinaryExpression
import typings.astTypes.namedTypesMod.namedTypes.BindExpression
import typings.astTypes.namedTypesMod.namedTypes.Block
import typings.astTypes.namedTypesMod.namedTypes.BlockStatement
import typings.astTypes.namedTypesMod.namedTypes.BooleanLiteral
import typings.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.BreakStatement
import typings.astTypes.namedTypesMod.namedTypes.CallExpression
import typings.astTypes.namedTypesMod.namedTypes.CatchClause
import typings.astTypes.namedTypesMod.namedTypes.ChainElement
import typings.astTypes.namedTypesMod.namedTypes.ChainExpression
import typings.astTypes.namedTypesMod.namedTypes.ClassBody
import typings.astTypes.namedTypesMod.namedTypes.ClassDeclaration
import typings.astTypes.namedTypesMod.namedTypes.ClassExpression
import typings.astTypes.namedTypesMod.namedTypes.ClassImplements
import typings.astTypes.namedTypesMod.namedTypes.ClassMethod
import typings.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
import typings.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
import typings.astTypes.namedTypesMod.namedTypes.ClassProperty
import typings.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition
import typings.astTypes.namedTypesMod.namedTypes.Comment
import typings.astTypes.namedTypesMod.namedTypes.CommentBlock
import typings.astTypes.namedTypesMod.namedTypes.CommentLine
import typings.astTypes.namedTypesMod.namedTypes.ComprehensionBlock
import typings.astTypes.namedTypesMod.namedTypes.ComprehensionExpression
import typings.astTypes.namedTypesMod.namedTypes.ConditionalExpression
import typings.astTypes.namedTypesMod.namedTypes.ContinueStatement
import typings.astTypes.namedTypesMod.namedTypes.DebuggerStatement
import typings.astTypes.namedTypesMod.namedTypes.Declaration
import typings.astTypes.namedTypesMod.namedTypes.DeclareClass
import typings.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration
import typings.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration
import typings.astTypes.namedTypesMod.namedTypes.DeclareFunction
import typings.astTypes.namedTypesMod.namedTypes.DeclareInterface
import typings.astTypes.namedTypesMod.namedTypes.DeclareModule
import typings.astTypes.namedTypesMod.namedTypes.DeclareModuleExports
import typings.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
import typings.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
import typings.astTypes.namedTypesMod.namedTypes.DeclareVariable
import typings.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
import typings.astTypes.namedTypesMod.namedTypes.Decorator
import typings.astTypes.namedTypesMod.namedTypes.Directive
import typings.astTypes.namedTypesMod.namedTypes.DirectiveLiteral
import typings.astTypes.namedTypesMod.namedTypes.DoExpression
import typings.astTypes.namedTypesMod.namedTypes.DoWhileStatement
import typings.astTypes.namedTypesMod.namedTypes.EmptyStatement
import typings.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.EnumBooleanBody
import typings.astTypes.namedTypesMod.namedTypes.EnumBooleanMember
import typings.astTypes.namedTypesMod.namedTypes.EnumDeclaration
import typings.astTypes.namedTypesMod.namedTypes.EnumDefaultedMember
import typings.astTypes.namedTypesMod.namedTypes.EnumNumberBody
import typings.astTypes.namedTypesMod.namedTypes.EnumNumberMember
import typings.astTypes.namedTypesMod.namedTypes.EnumStringBody
import typings.astTypes.namedTypesMod.namedTypes.EnumStringMember
import typings.astTypes.namedTypesMod.namedTypes.EnumSymbolBody
import typings.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam
import typings.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration
import typings.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier
import typings.astTypes.namedTypesMod.namedTypes.ExportDeclaration
import typings.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration
import typings.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier
import typings.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration
import typings.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier
import typings.astTypes.namedTypesMod.namedTypes.ExportSpecifier
import typings.astTypes.namedTypesMod.namedTypes.Expression
import typings.astTypes.namedTypesMod.namedTypes.ExpressionStatement
import typings.astTypes.namedTypesMod.namedTypes.File
import typings.astTypes.namedTypesMod.namedTypes.Flow
import typings.astTypes.namedTypesMod.namedTypes.FlowPredicate
import typings.astTypes.namedTypesMod.namedTypes.FlowType
import typings.astTypes.namedTypesMod.namedTypes.ForAwaitStatement
import typings.astTypes.namedTypesMod.namedTypes.ForInStatement
import typings.astTypes.namedTypesMod.namedTypes.ForOfStatement
import typings.astTypes.namedTypesMod.namedTypes.ForStatement
import typings.astTypes.namedTypesMod.namedTypes.Function
import typings.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
import typings.astTypes.namedTypesMod.namedTypes.FunctionExpression
import typings.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.FunctionTypeParam
import typings.astTypes.namedTypesMod.namedTypes.GeneratorExpression
import typings.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.Identifier
import typings.astTypes.namedTypesMod.namedTypes.IfStatement
import typings.astTypes.namedTypesMod.namedTypes.Import
import typings.astTypes.namedTypesMod.namedTypes.ImportDeclaration
import typings.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier
import typings.astTypes.namedTypesMod.namedTypes.ImportExpression
import typings.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
import typings.astTypes.namedTypesMod.namedTypes.ImportSpecifier
import typings.astTypes.namedTypesMod.namedTypes.InferredPredicate
import typings.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration
import typings.astTypes.namedTypesMod.namedTypes.InterfaceExtends
import typings.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.InterpreterDirective
import typings.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.JSXAttribute
import typings.astTypes.namedTypesMod.namedTypes.JSXClosingElement
import typings.astTypes.namedTypesMod.namedTypes.JSXClosingFragment
import typings.astTypes.namedTypesMod.namedTypes.JSXElement
import typings.astTypes.namedTypesMod.namedTypes.JSXEmptyExpression
import typings.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer
import typings.astTypes.namedTypesMod.namedTypes.JSXFragment
import typings.astTypes.namedTypesMod.namedTypes.JSXIdentifier
import typings.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
import typings.astTypes.namedTypesMod.namedTypes.JSXNamespacedName
import typings.astTypes.namedTypesMod.namedTypes.JSXOpeningElement
import typings.astTypes.namedTypesMod.namedTypes.JSXOpeningFragment
import typings.astTypes.namedTypesMod.namedTypes.JSXSpreadAttribute
import typings.astTypes.namedTypesMod.namedTypes.JSXSpreadChild
import typings.astTypes.namedTypesMod.namedTypes.JSXText
import typings.astTypes.namedTypesMod.namedTypes.LabeledStatement
import typings.astTypes.namedTypesMod.namedTypes.Line
import typings.astTypes.namedTypesMod.namedTypes.Literal
import typings.astTypes.namedTypesMod.namedTypes.LogicalExpression
import typings.astTypes.namedTypesMod.namedTypes.MemberExpression
import typings.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.MetaProperty
import typings.astTypes.namedTypesMod.namedTypes.MethodDefinition
import typings.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.ModuleSpecifier
import typings.astTypes.namedTypesMod.namedTypes.NewExpression
import typings.astTypes.namedTypesMod.namedTypes.Node
import typings.astTypes.namedTypesMod.namedTypes.Noop
import typings.astTypes.namedTypesMod.namedTypes.NullLiteral
import typings.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.NumericLiteral
import typings.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.ObjectExpression
import typings.astTypes.namedTypesMod.namedTypes.ObjectMethod
import typings.astTypes.namedTypesMod.namedTypes.ObjectPattern
import typings.astTypes.namedTypesMod.namedTypes.ObjectProperty
import typings.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.ObjectTypeCallProperty
import typings.astTypes.namedTypesMod.namedTypes.ObjectTypeIndexer
import typings.astTypes.namedTypesMod.namedTypes.ObjectTypeInternalSlot
import typings.astTypes.namedTypesMod.namedTypes.ObjectTypeProperty
import typings.astTypes.namedTypesMod.namedTypes.ObjectTypeSpreadProperty
import typings.astTypes.namedTypesMod.namedTypes.OpaqueType
import typings.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
import typings.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
import typings.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression
import typings.astTypes.namedTypesMod.namedTypes.Pattern
import typings.astTypes.namedTypesMod.namedTypes.Position
import typings.astTypes.namedTypesMod.namedTypes.Printable
import typings.astTypes.namedTypesMod.namedTypes.PrivateName
import typings.astTypes.namedTypesMod.namedTypes.Program
import typings.astTypes.namedTypesMod.namedTypes.Property
import typings.astTypes.namedTypesMod.namedTypes.PropertyPattern
import typings.astTypes.namedTypesMod.namedTypes.QualifiedTypeIdentifier
import typings.astTypes.namedTypesMod.namedTypes.RegExpLiteral
import typings.astTypes.namedTypesMod.namedTypes.RestElement
import typings.astTypes.namedTypesMod.namedTypes.RestProperty
import typings.astTypes.namedTypesMod.namedTypes.ReturnStatement
import typings.astTypes.namedTypesMod.namedTypes.SequenceExpression
import typings.astTypes.namedTypesMod.namedTypes.SourceLocation
import typings.astTypes.namedTypesMod.namedTypes.Specifier
import typings.astTypes.namedTypesMod.namedTypes.SpreadElement
import typings.astTypes.namedTypesMod.namedTypes.SpreadElementPattern
import typings.astTypes.namedTypesMod.namedTypes.SpreadProperty
import typings.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern
import typings.astTypes.namedTypesMod.namedTypes.Statement
import typings.astTypes.namedTypesMod.namedTypes.StringLiteral
import typings.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.Super
import typings.astTypes.namedTypesMod.namedTypes.SwitchCase
import typings.astTypes.namedTypesMod.namedTypes.SwitchStatement
import typings.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.TSAnyKeyword
import typings.astTypes.namedTypesMod.namedTypes.TSArrayType
import typings.astTypes.namedTypesMod.namedTypes.TSAsExpression
import typings.astTypes.namedTypesMod.namedTypes.TSBigIntKeyword
import typings.astTypes.namedTypesMod.namedTypes.TSBooleanKeyword
import typings.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
import typings.astTypes.namedTypesMod.namedTypes.TSConditionalType
import typings.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
import typings.astTypes.namedTypesMod.namedTypes.TSConstructorType
import typings.astTypes.namedTypesMod.namedTypes.TSDeclareFunction
import typings.astTypes.namedTypesMod.namedTypes.TSDeclareMethod
import typings.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration
import typings.astTypes.namedTypesMod.namedTypes.TSEnumMember
import typings.astTypes.namedTypesMod.namedTypes.TSExportAssignment
import typings.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments
import typings.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference
import typings.astTypes.namedTypesMod.namedTypes.TSFunctionType
import typings.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeParameterInstantiation
import typings.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeParameters
import typings.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration
import typings.astTypes.namedTypesMod.namedTypes.TSImportType
import typings.astTypes.namedTypesMod.namedTypes.TSIndexSignature
import typings.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType
import typings.astTypes.namedTypesMod.namedTypes.TSInferType
import typings.astTypes.namedTypesMod.namedTypes.TSInterfaceBody
import typings.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration
import typings.astTypes.namedTypesMod.namedTypes.TSIntersectionType
import typings.astTypes.namedTypesMod.namedTypes.TSLiteralType
import typings.astTypes.namedTypesMod.namedTypes.TSMappedType
import typings.astTypes.namedTypesMod.namedTypes.TSMethodSignature
import typings.astTypes.namedTypesMod.namedTypes.TSModuleBlock
import typings.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration
import typings.astTypes.namedTypesMod.namedTypes.TSNamedTupleMember
import typings.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration
import typings.astTypes.namedTypesMod.namedTypes.TSNeverKeyword
import typings.astTypes.namedTypesMod.namedTypes.TSNonNullExpression
import typings.astTypes.namedTypesMod.namedTypes.TSNullKeyword
import typings.astTypes.namedTypesMod.namedTypes.TSNumberKeyword
import typings.astTypes.namedTypesMod.namedTypes.TSObjectKeyword
import typings.astTypes.namedTypesMod.namedTypes.TSOptionalType
import typings.astTypes.namedTypesMod.namedTypes.TSParameterProperty
import typings.astTypes.namedTypesMod.namedTypes.TSParenthesizedType
import typings.astTypes.namedTypesMod.namedTypes.TSPropertySignature
import typings.astTypes.namedTypesMod.namedTypes.TSQualifiedName
import typings.astTypes.namedTypesMod.namedTypes.TSRestType
import typings.astTypes.namedTypesMod.namedTypes.TSStringKeyword
import typings.astTypes.namedTypesMod.namedTypes.TSSymbolKeyword
import typings.astTypes.namedTypesMod.namedTypes.TSThisType
import typings.astTypes.namedTypesMod.namedTypes.TSTupleType
import typings.astTypes.namedTypesMod.namedTypes.TSType
import typings.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration
import typings.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.TSTypeAssertion
import typings.astTypes.namedTypesMod.namedTypes.TSTypeLiteral
import typings.astTypes.namedTypesMod.namedTypes.TSTypeOperator
import typings.astTypes.namedTypesMod.namedTypes.TSTypeParameter
import typings.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration
import typings.astTypes.namedTypesMod.namedTypes.TSTypeParameterInstantiation
import typings.astTypes.namedTypesMod.namedTypes.TSTypePredicate
import typings.astTypes.namedTypesMod.namedTypes.TSTypeQuery
import typings.astTypes.namedTypesMod.namedTypes.TSTypeReference
import typings.astTypes.namedTypesMod.namedTypes.TSUndefinedKeyword
import typings.astTypes.namedTypesMod.namedTypes.TSUnionType
import typings.astTypes.namedTypesMod.namedTypes.TSUnknownKeyword
import typings.astTypes.namedTypesMod.namedTypes.TSVoidKeyword
import typings.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression
import typings.astTypes.namedTypesMod.namedTypes.TemplateElement
import typings.astTypes.namedTypesMod.namedTypes.TemplateLiteral
import typings.astTypes.namedTypesMod.namedTypes.ThisExpression
import typings.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.ThrowStatement
import typings.astTypes.namedTypesMod.namedTypes.TryStatement
import typings.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.TypeAlias
import typings.astTypes.namedTypesMod.namedTypes.TypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.TypeCastExpression
import typings.astTypes.namedTypesMod.namedTypes.TypeParameter
import typings.astTypes.namedTypesMod.namedTypes.TypeParameterDeclaration
import typings.astTypes.namedTypesMod.namedTypes.TypeParameterInstantiation
import typings.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.UnaryExpression
import typings.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.UpdateExpression
import typings.astTypes.namedTypesMod.namedTypes.VariableDeclaration
import typings.astTypes.namedTypesMod.namedTypes.VariableDeclarator
import typings.astTypes.namedTypesMod.namedTypes.Variance
import typings.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.WhileStatement
import typings.astTypes.namedTypesMod.namedTypes.WithStatement
import typings.astTypes.namedTypesMod.namedTypes.YieldExpression
import typings.astTypes.nodePathMod.NodePath
import typings.astTypes.pathVisitorMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Visitor[M] extends js.Object {
  
  var visitAnyTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AnyTypeAnnotation, _], _]
  ] = js.native
  
  var visitArrayExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrayExpression, _], _]
  ] = js.native
  
  var visitArrayPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrayPattern, _], _]
  ] = js.native
  
  var visitArrayTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrayTypeAnnotation, _], _]
  ] = js.native
  
  var visitArrowFunctionExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrowFunctionExpression, _], _]
  ] = js.native
  
  var visitAssignmentExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AssignmentExpression, _], _]
  ] = js.native
  
  var visitAssignmentPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AssignmentPattern, _], _]
  ] = js.native
  
  var visitAwaitExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AwaitExpression, _], _]
  ] = js.native
  
  var visitBigIntLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BigIntLiteral, _], _]
  ] = js.native
  
  var visitBigIntLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BigIntLiteralTypeAnnotation, _], _]
  ] = js.native
  
  var visitBigIntTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BigIntTypeAnnotation, _], _]
  ] = js.native
  
  var visitBinaryExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BinaryExpression, _], _]
  ] = js.native
  
  var visitBindExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BindExpression, _], _]
  ] = js.native
  
  var visitBlock: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Block, _], _]] = js.native
  
  var visitBlockStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BlockStatement, _], _]
  ] = js.native
  
  var visitBooleanLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BooleanLiteral, _], _]
  ] = js.native
  
  var visitBooleanLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BooleanLiteralTypeAnnotation, _], _]
  ] = js.native
  
  var visitBooleanTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BooleanTypeAnnotation, _], _]
  ] = js.native
  
  var visitBreakStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BreakStatement, _], _]
  ] = js.native
  
  var visitCallExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CallExpression, _], _]
  ] = js.native
  
  var visitCatchClause: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CatchClause, _], _]
  ] = js.native
  
  var visitChainElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ChainElement, _], _]
  ] = js.native
  
  var visitChainExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ChainExpression, _], _]
  ] = js.native
  
  var visitClassBody: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassBody, _], _]
  ] = js.native
  
  var visitClassDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassDeclaration, _], _]
  ] = js.native
  
  var visitClassExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassExpression, _], _]
  ] = js.native
  
  var visitClassImplements: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassImplements, _], _]
  ] = js.native
  
  var visitClassMethod: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassMethod, _], _]
  ] = js.native
  
  var visitClassPrivateMethod: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassPrivateMethod, _], _]
  ] = js.native
  
  var visitClassPrivateProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassPrivateProperty, _], _]
  ] = js.native
  
  var visitClassProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassProperty, _], _]
  ] = js.native
  
  var visitClassPropertyDefinition: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassPropertyDefinition, _], _]
  ] = js.native
  
  var visitComment: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Comment, _], _]] = js.native
  
  var visitCommentBlock: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CommentBlock, _], _]
  ] = js.native
  
  var visitCommentLine: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CommentLine, _], _]
  ] = js.native
  
  var visitComprehensionBlock: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ComprehensionBlock, _], _]
  ] = js.native
  
  var visitComprehensionExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ComprehensionExpression, _], _]
  ] = js.native
  
  var visitConditionalExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ConditionalExpression, _], _]
  ] = js.native
  
  var visitContinueStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ContinueStatement, _], _]
  ] = js.native
  
  var visitDebuggerStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DebuggerStatement, _], _]
  ] = js.native
  
  var visitDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Declaration, _], _]
  ] = js.native
  
  var visitDeclareClass: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareClass, _], _]
  ] = js.native
  
  var visitDeclareExportAllDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareExportAllDeclaration, _], _]
  ] = js.native
  
  var visitDeclareExportDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareExportDeclaration, _], _]
  ] = js.native
  
  var visitDeclareFunction: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareFunction, _], _]
  ] = js.native
  
  var visitDeclareInterface: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareInterface, _], _]
  ] = js.native
  
  var visitDeclareModule: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareModule, _], _]
  ] = js.native
  
  var visitDeclareModuleExports: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareModuleExports, _], _]
  ] = js.native
  
  var visitDeclareOpaqueType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareOpaqueType, _], _]
  ] = js.native
  
  var visitDeclareTypeAlias: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareTypeAlias, _], _]
  ] = js.native
  
  var visitDeclareVariable: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareVariable, _], _]
  ] = js.native
  
  var visitDeclaredPredicate: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclaredPredicate, _], _]
  ] = js.native
  
  var visitDecorator: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Decorator, _], _]
  ] = js.native
  
  var visitDirective: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Directive, _], _]
  ] = js.native
  
  var visitDirectiveLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DirectiveLiteral, _], _]
  ] = js.native
  
  var visitDoExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DoExpression, _], _]
  ] = js.native
  
  var visitDoWhileStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DoWhileStatement, _], _]
  ] = js.native
  
  var visitEmptyStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EmptyStatement, _], _]
  ] = js.native
  
  var visitEmptyTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EmptyTypeAnnotation, _], _]
  ] = js.native
  
  var visitEnumBooleanBody: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumBooleanBody, _], _]
  ] = js.native
  
  var visitEnumBooleanMember: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumBooleanMember, _], _]
  ] = js.native
  
  var visitEnumDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumDeclaration, _], _]
  ] = js.native
  
  var visitEnumDefaultedMember: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumDefaultedMember, _], _]
  ] = js.native
  
  var visitEnumNumberBody: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumNumberBody, _], _]
  ] = js.native
  
  var visitEnumNumberMember: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumNumberMember, _], _]
  ] = js.native
  
  var visitEnumStringBody: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumStringBody, _], _]
  ] = js.native
  
  var visitEnumStringMember: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumStringMember, _], _]
  ] = js.native
  
  var visitEnumSymbolBody: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumSymbolBody, _], _]
  ] = js.native
  
  var visitExistentialTypeParam: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExistentialTypeParam, _], _]
  ] = js.native
  
  var visitExistsTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExistsTypeAnnotation, _], _]
  ] = js.native
  
  var visitExportAllDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportAllDeclaration, _], _]
  ] = js.native
  
  var visitExportBatchSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportBatchSpecifier, _], _]
  ] = js.native
  
  var visitExportDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportDeclaration, _], _]
  ] = js.native
  
  var visitExportDefaultDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportDefaultDeclaration, _], _]
  ] = js.native
  
  var visitExportDefaultSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportDefaultSpecifier, _], _]
  ] = js.native
  
  var visitExportNamedDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportNamedDeclaration, _], _]
  ] = js.native
  
  var visitExportNamespaceSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportNamespaceSpecifier, _], _]
  ] = js.native
  
  var visitExportSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportSpecifier, _], _]
  ] = js.native
  
  var visitExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Expression, _], _]
  ] = js.native
  
  var visitExpressionStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExpressionStatement, _], _]
  ] = js.native
  
  var visitFile: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[File, _], _]] = js.native
  
  var visitFlow: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Flow, _], _]] = js.native
  
  var visitFlowPredicate: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FlowPredicate, _], _]
  ] = js.native
  
  var visitFlowType: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FlowType, _], _]] = js.native
  
  var visitForAwaitStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForAwaitStatement, _], _]
  ] = js.native
  
  var visitForInStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForInStatement, _], _]
  ] = js.native
  
  var visitForOfStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForOfStatement, _], _]
  ] = js.native
  
  var visitForStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForStatement, _], _]
  ] = js.native
  
  var visitFunction: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Function, _], _]] = js.native
  
  var visitFunctionDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionDeclaration, _], _]
  ] = js.native
  
  var visitFunctionExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionExpression, _], _]
  ] = js.native
  
  var visitFunctionTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionTypeAnnotation, _], _]
  ] = js.native
  
  var visitFunctionTypeParam: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionTypeParam, _], _]
  ] = js.native
  
  var visitGeneratorExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[GeneratorExpression, _], _]
  ] = js.native
  
  var visitGenericTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[GenericTypeAnnotation, _], _]
  ] = js.native
  
  var visitIdentifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Identifier, _], _]
  ] = js.native
  
  var visitIfStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[IfStatement, _], _]
  ] = js.native
  
  var visitImport: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Import, _], _]] = js.native
  
  var visitImportDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportDeclaration, _], _]
  ] = js.native
  
  var visitImportDefaultSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportDefaultSpecifier, _], _]
  ] = js.native
  
  var visitImportExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportExpression, _], _]
  ] = js.native
  
  var visitImportNamespaceSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportNamespaceSpecifier, _], _]
  ] = js.native
  
  var visitImportSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportSpecifier, _], _]
  ] = js.native
  
  var visitInferredPredicate: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InferredPredicate, _], _]
  ] = js.native
  
  var visitInterfaceDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterfaceDeclaration, _], _]
  ] = js.native
  
  var visitInterfaceExtends: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterfaceExtends, _], _]
  ] = js.native
  
  var visitInterfaceTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterfaceTypeAnnotation, _], _]
  ] = js.native
  
  var visitInterpreterDirective: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterpreterDirective, _], _]
  ] = js.native
  
  var visitIntersectionTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[IntersectionTypeAnnotation, _], _]
  ] = js.native
  
  var visitJSXAttribute: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXAttribute, _], _]
  ] = js.native
  
  var visitJSXClosingElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXClosingElement, _], _]
  ] = js.native
  
  var visitJSXClosingFragment: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXClosingFragment, _], _]
  ] = js.native
  
  var visitJSXElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXElement, _], _]
  ] = js.native
  
  var visitJSXEmptyExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXEmptyExpression, _], _]
  ] = js.native
  
  var visitJSXExpressionContainer: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXExpressionContainer, _], _]
  ] = js.native
  
  var visitJSXFragment: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXFragment, _], _]
  ] = js.native
  
  var visitJSXIdentifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXIdentifier, _], _]
  ] = js.native
  
  var visitJSXMemberExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXMemberExpression, _], _]
  ] = js.native
  
  var visitJSXNamespacedName: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXNamespacedName, _], _]
  ] = js.native
  
  var visitJSXOpeningElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXOpeningElement, _], _]
  ] = js.native
  
  var visitJSXOpeningFragment: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXOpeningFragment, _], _]
  ] = js.native
  
  var visitJSXSpreadAttribute: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXSpreadAttribute, _], _]
  ] = js.native
  
  var visitJSXSpreadChild: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXSpreadChild, _], _]
  ] = js.native
  
  var visitJSXText: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXText, _], _]] = js.native
  
  var visitLabeledStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[LabeledStatement, _], _]
  ] = js.native
  
  var visitLine: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Line, _], _]] = js.native
  
  var visitLiteral: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Literal, _], _]] = js.native
  
  var visitLogicalExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[LogicalExpression, _], _]
  ] = js.native
  
  var visitMemberExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MemberExpression, _], _]
  ] = js.native
  
  var visitMemberTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MemberTypeAnnotation, _], _]
  ] = js.native
  
  var visitMetaProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MetaProperty, _], _]
  ] = js.native
  
  var visitMethodDefinition: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MethodDefinition, _], _]
  ] = js.native
  
  var visitMixedTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MixedTypeAnnotation, _], _]
  ] = js.native
  
  var visitModuleSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ModuleSpecifier, _], _]
  ] = js.native
  
  var visitNewExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NewExpression, _], _]
  ] = js.native
  
  var visitNode: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Node, _], _]] = js.native
  
  var visitNoop: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Noop, _], _]] = js.native
  
  var visitNullLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullLiteral, _], _]
  ] = js.native
  
  var visitNullLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullLiteralTypeAnnotation, _], _]
  ] = js.native
  
  var visitNullTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullTypeAnnotation, _], _]
  ] = js.native
  
  var visitNullableTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullableTypeAnnotation, _], _]
  ] = js.native
  
  var visitNumberLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumberLiteralTypeAnnotation, _], _]
  ] = js.native
  
  var visitNumberTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumberTypeAnnotation, _], _]
  ] = js.native
  
  var visitNumericLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumericLiteral, _], _]
  ] = js.native
  
  var visitNumericLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumericLiteralTypeAnnotation, _], _]
  ] = js.native
  
  var visitObjectExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectExpression, _], _]
  ] = js.native
  
  var visitObjectMethod: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectMethod, _], _]
  ] = js.native
  
  var visitObjectPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectPattern, _], _]
  ] = js.native
  
  var visitObjectProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectProperty, _], _]
  ] = js.native
  
  var visitObjectTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeAnnotation, _], _]
  ] = js.native
  
  var visitObjectTypeCallProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeCallProperty, _], _]
  ] = js.native
  
  var visitObjectTypeIndexer: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeIndexer, _], _]
  ] = js.native
  
  var visitObjectTypeInternalSlot: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeInternalSlot, _], _]
  ] = js.native
  
  var visitObjectTypeProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeProperty, _], _]
  ] = js.native
  
  var visitObjectTypeSpreadProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeSpreadProperty, _], _]
  ] = js.native
  
  var visitOpaqueType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[OpaqueType, _], _]
  ] = js.native
  
  var visitOptionalCallExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[OptionalCallExpression, _], _]
  ] = js.native
  
  var visitOptionalMemberExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[OptionalMemberExpression, _], _]
  ] = js.native
  
  var visitParenthesizedExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ParenthesizedExpression, _], _]
  ] = js.native
  
  var visitPattern: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Pattern, _], _]] = js.native
  
  var visitPosition: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Position, _], _]] = js.native
  
  var visitPrintable: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Printable, _], _]
  ] = js.native
  
  var visitPrivateName: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[PrivateName, _], _]
  ] = js.native
  
  var visitProgram: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Program, _], _]] = js.native
  
  var visitProperty: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Property, _], _]] = js.native
  
  var visitPropertyPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[PropertyPattern, _], _]
  ] = js.native
  
  var visitQualifiedTypeIdentifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[QualifiedTypeIdentifier, _], _]
  ] = js.native
  
  var visitRegExpLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[RegExpLiteral, _], _]
  ] = js.native
  
  var visitRestElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[RestElement, _], _]
  ] = js.native
  
  var visitRestProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[RestProperty, _], _]
  ] = js.native
  
  var visitReturnStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ReturnStatement, _], _]
  ] = js.native
  
  var visitSequenceExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SequenceExpression, _], _]
  ] = js.native
  
  var visitSourceLocation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SourceLocation, _], _]
  ] = js.native
  
  var visitSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Specifier, _], _]
  ] = js.native
  
  var visitSpreadElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadElement, _], _]
  ] = js.native
  
  var visitSpreadElementPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadElementPattern, _], _]
  ] = js.native
  
  var visitSpreadProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadProperty, _], _]
  ] = js.native
  
  var visitSpreadPropertyPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadPropertyPattern, _], _]
  ] = js.native
  
  var visitStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Statement, _], _]
  ] = js.native
  
  var visitStringLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[StringLiteral, _], _]
  ] = js.native
  
  var visitStringLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[StringLiteralTypeAnnotation, _], _]
  ] = js.native
  
  var visitStringTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[StringTypeAnnotation, _], _]
  ] = js.native
  
  var visitSuper: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Super, _], _]] = js.native
  
  var visitSwitchCase: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SwitchCase, _], _]
  ] = js.native
  
  var visitSwitchStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SwitchStatement, _], _]
  ] = js.native
  
  var visitSymbolTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SymbolTypeAnnotation, _], _]
  ] = js.native
  
  var visitTSAnyKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSAnyKeyword, _], _]
  ] = js.native
  
  var visitTSArrayType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSArrayType, _], _]
  ] = js.native
  
  var visitTSAsExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSAsExpression, _], _]
  ] = js.native
  
  var visitTSBigIntKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSBigIntKeyword, _], _]
  ] = js.native
  
  var visitTSBooleanKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSBooleanKeyword, _], _]
  ] = js.native
  
  var visitTSCallSignatureDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSCallSignatureDeclaration, _], _]
  ] = js.native
  
  var visitTSConditionalType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSConditionalType, _], _]
  ] = js.native
  
  var visitTSConstructSignatureDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ Context with M, 
      /* path */ NodePath[TSConstructSignatureDeclaration, _], 
      _
    ]
  ] = js.native
  
  var visitTSConstructorType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSConstructorType, _], _]
  ] = js.native
  
  var visitTSDeclareFunction: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSDeclareFunction, _], _]
  ] = js.native
  
  var visitTSDeclareMethod: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSDeclareMethod, _], _]
  ] = js.native
  
  var visitTSEnumDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSEnumDeclaration, _], _]
  ] = js.native
  
  var visitTSEnumMember: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSEnumMember, _], _]
  ] = js.native
  
  var visitTSExportAssignment: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSExportAssignment, _], _]
  ] = js.native
  
  var visitTSExpressionWithTypeArguments: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSExpressionWithTypeArguments, _], _]
  ] = js.native
  
  var visitTSExternalModuleReference: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSExternalModuleReference, _], _]
  ] = js.native
  
  var visitTSFunctionType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSFunctionType, _], _]
  ] = js.native
  
  var visitTSHasOptionalTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSHasOptionalTypeAnnotation, _], _]
  ] = js.native
  
  var visitTSHasOptionalTypeParameterInstantiation: js.UndefOr[
    js.ThisFunction1[
      /* this */ Context with M, 
      /* path */ NodePath[TSHasOptionalTypeParameterInstantiation, _], 
      _
    ]
  ] = js.native
  
  var visitTSHasOptionalTypeParameters: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSHasOptionalTypeParameters, _], _]
  ] = js.native
  
  var visitTSImportEqualsDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSImportEqualsDeclaration, _], _]
  ] = js.native
  
  var visitTSImportType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSImportType, _], _]
  ] = js.native
  
  var visitTSIndexSignature: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSIndexSignature, _], _]
  ] = js.native
  
  var visitTSIndexedAccessType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSIndexedAccessType, _], _]
  ] = js.native
  
  var visitTSInferType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSInferType, _], _]
  ] = js.native
  
  var visitTSInterfaceBody: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSInterfaceBody, _], _]
  ] = js.native
  
  var visitTSInterfaceDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSInterfaceDeclaration, _], _]
  ] = js.native
  
  var visitTSIntersectionType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSIntersectionType, _], _]
  ] = js.native
  
  var visitTSLiteralType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSLiteralType, _], _]
  ] = js.native
  
  var visitTSMappedType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSMappedType, _], _]
  ] = js.native
  
  var visitTSMethodSignature: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSMethodSignature, _], _]
  ] = js.native
  
  var visitTSModuleBlock: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSModuleBlock, _], _]
  ] = js.native
  
  var visitTSModuleDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSModuleDeclaration, _], _]
  ] = js.native
  
  var visitTSNamedTupleMember: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNamedTupleMember, _], _]
  ] = js.native
  
  var visitTSNamespaceExportDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNamespaceExportDeclaration, _], _]
  ] = js.native
  
  var visitTSNeverKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNeverKeyword, _], _]
  ] = js.native
  
  var visitTSNonNullExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNonNullExpression, _], _]
  ] = js.native
  
  var visitTSNullKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNullKeyword, _], _]
  ] = js.native
  
  var visitTSNumberKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNumberKeyword, _], _]
  ] = js.native
  
  var visitTSObjectKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSObjectKeyword, _], _]
  ] = js.native
  
  var visitTSOptionalType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSOptionalType, _], _]
  ] = js.native
  
  var visitTSParameterProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSParameterProperty, _], _]
  ] = js.native
  
  var visitTSParenthesizedType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSParenthesizedType, _], _]
  ] = js.native
  
  var visitTSPropertySignature: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSPropertySignature, _], _]
  ] = js.native
  
  var visitTSQualifiedName: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSQualifiedName, _], _]
  ] = js.native
  
  var visitTSRestType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSRestType, _], _]
  ] = js.native
  
  var visitTSStringKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSStringKeyword, _], _]
  ] = js.native
  
  var visitTSSymbolKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSSymbolKeyword, _], _]
  ] = js.native
  
  var visitTSThisType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSThisType, _], _]
  ] = js.native
  
  var visitTSTupleType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTupleType, _], _]
  ] = js.native
  
  var visitTSType: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSType, _], _]] = js.native
  
  var visitTSTypeAliasDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeAliasDeclaration, _], _]
  ] = js.native
  
  var visitTSTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeAnnotation, _], _]
  ] = js.native
  
  var visitTSTypeAssertion: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeAssertion, _], _]
  ] = js.native
  
  var visitTSTypeLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeLiteral, _], _]
  ] = js.native
  
  var visitTSTypeOperator: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeOperator, _], _]
  ] = js.native
  
  var visitTSTypeParameter: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeParameter, _], _]
  ] = js.native
  
  var visitTSTypeParameterDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeParameterDeclaration, _], _]
  ] = js.native
  
  var visitTSTypeParameterInstantiation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeParameterInstantiation, _], _]
  ] = js.native
  
  var visitTSTypePredicate: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypePredicate, _], _]
  ] = js.native
  
  var visitTSTypeQuery: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeQuery, _], _]
  ] = js.native
  
  var visitTSTypeReference: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeReference, _], _]
  ] = js.native
  
  var visitTSUndefinedKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSUndefinedKeyword, _], _]
  ] = js.native
  
  var visitTSUnionType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSUnionType, _], _]
  ] = js.native
  
  var visitTSUnknownKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSUnknownKeyword, _], _]
  ] = js.native
  
  var visitTSVoidKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSVoidKeyword, _], _]
  ] = js.native
  
  var visitTaggedTemplateExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TaggedTemplateExpression, _], _]
  ] = js.native
  
  var visitTemplateElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TemplateElement, _], _]
  ] = js.native
  
  var visitTemplateLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TemplateLiteral, _], _]
  ] = js.native
  
  var visitThisExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ThisExpression, _], _]
  ] = js.native
  
  var visitThisTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ThisTypeAnnotation, _], _]
  ] = js.native
  
  var visitThrowStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ThrowStatement, _], _]
  ] = js.native
  
  var visitTryStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TryStatement, _], _]
  ] = js.native
  
  var visitTupleTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TupleTypeAnnotation, _], _]
  ] = js.native
  
  var visitTypeAlias: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeAlias, _], _]
  ] = js.native
  
  var visitTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeAnnotation, _], _]
  ] = js.native
  
  var visitTypeCastExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeCastExpression, _], _]
  ] = js.native
  
  var visitTypeParameter: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeParameter, _], _]
  ] = js.native
  
  var visitTypeParameterDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeParameterDeclaration, _], _]
  ] = js.native
  
  var visitTypeParameterInstantiation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeParameterInstantiation, _], _]
  ] = js.native
  
  var visitTypeofTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeofTypeAnnotation, _], _]
  ] = js.native
  
  var visitUnaryExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[UnaryExpression, _], _]
  ] = js.native
  
  var visitUnionTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[UnionTypeAnnotation, _], _]
  ] = js.native
  
  var visitUpdateExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[UpdateExpression, _], _]
  ] = js.native
  
  var visitVariableDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[VariableDeclaration, _], _]
  ] = js.native
  
  var visitVariableDeclarator: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[VariableDeclarator, _], _]
  ] = js.native
  
  var visitVariance: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Variance, _], _]] = js.native
  
  var visitVoidTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[VoidTypeAnnotation, _], _]
  ] = js.native
  
  var visitWhileStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[WhileStatement, _], _]
  ] = js.native
  
  var visitWithStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[WithStatement, _], _]
  ] = js.native
  
  var visitYieldExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[YieldExpression, _], _]
  ] = js.native
}
object Visitor {
  
  @scala.inline
  def apply[M](): Visitor[M] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Visitor[M]]
  }
  
  @scala.inline
  implicit class VisitorOps[Self <: Visitor[_], M] (val x: Self with Visitor[M]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVisitAnyTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AnyTypeAnnotation, _], _]): Self = this.set("visitAnyTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitAnyTypeAnnotation: Self = this.set("visitAnyTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitArrayExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrayExpression, _], _]): Self = this.set("visitArrayExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitArrayExpression: Self = this.set("visitArrayExpression", js.undefined)
    
    @scala.inline
    def setVisitArrayPattern(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrayPattern, _], _]): Self = this.set("visitArrayPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitArrayPattern: Self = this.set("visitArrayPattern", js.undefined)
    
    @scala.inline
    def setVisitArrayTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrayTypeAnnotation, _], _]): Self = this.set("visitArrayTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitArrayTypeAnnotation: Self = this.set("visitArrayTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitArrowFunctionExpression(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrowFunctionExpression, _], _]
    ): Self = this.set("visitArrowFunctionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitArrowFunctionExpression: Self = this.set("visitArrowFunctionExpression", js.undefined)
    
    @scala.inline
    def setVisitAssignmentExpression(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AssignmentExpression, _], _]
    ): Self = this.set("visitAssignmentExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitAssignmentExpression: Self = this.set("visitAssignmentExpression", js.undefined)
    
    @scala.inline
    def setVisitAssignmentPattern(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AssignmentPattern, _], _]): Self = this.set("visitAssignmentPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitAssignmentPattern: Self = this.set("visitAssignmentPattern", js.undefined)
    
    @scala.inline
    def setVisitAwaitExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AwaitExpression, _], _]): Self = this.set("visitAwaitExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitAwaitExpression: Self = this.set("visitAwaitExpression", js.undefined)
    
    @scala.inline
    def setVisitBigIntLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BigIntLiteral, _], _]): Self = this.set("visitBigIntLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitBigIntLiteral: Self = this.set("visitBigIntLiteral", js.undefined)
    
    @scala.inline
    def setVisitBigIntLiteralTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BigIntLiteralTypeAnnotation, _], _]
    ): Self = this.set("visitBigIntLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitBigIntLiteralTypeAnnotation: Self = this.set("visitBigIntLiteralTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitBigIntTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BigIntTypeAnnotation, _], _]
    ): Self = this.set("visitBigIntTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitBigIntTypeAnnotation: Self = this.set("visitBigIntTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitBinaryExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BinaryExpression, _], _]): Self = this.set("visitBinaryExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitBinaryExpression: Self = this.set("visitBinaryExpression", js.undefined)
    
    @scala.inline
    def setVisitBindExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BindExpression, _], _]): Self = this.set("visitBindExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitBindExpression: Self = this.set("visitBindExpression", js.undefined)
    
    @scala.inline
    def setVisitBlock(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Block, _], _]): Self = this.set("visitBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitBlock: Self = this.set("visitBlock", js.undefined)
    
    @scala.inline
    def setVisitBlockStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BlockStatement, _], _]): Self = this.set("visitBlockStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitBlockStatement: Self = this.set("visitBlockStatement", js.undefined)
    
    @scala.inline
    def setVisitBooleanLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BooleanLiteral, _], _]): Self = this.set("visitBooleanLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitBooleanLiteral: Self = this.set("visitBooleanLiteral", js.undefined)
    
    @scala.inline
    def setVisitBooleanLiteralTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BooleanLiteralTypeAnnotation, _], _]
    ): Self = this.set("visitBooleanLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitBooleanLiteralTypeAnnotation: Self = this.set("visitBooleanLiteralTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitBooleanTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BooleanTypeAnnotation, _], _]
    ): Self = this.set("visitBooleanTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitBooleanTypeAnnotation: Self = this.set("visitBooleanTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitBreakStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BreakStatement, _], _]): Self = this.set("visitBreakStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitBreakStatement: Self = this.set("visitBreakStatement", js.undefined)
    
    @scala.inline
    def setVisitCallExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CallExpression, _], _]): Self = this.set("visitCallExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitCallExpression: Self = this.set("visitCallExpression", js.undefined)
    
    @scala.inline
    def setVisitCatchClause(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CatchClause, _], _]): Self = this.set("visitCatchClause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitCatchClause: Self = this.set("visitCatchClause", js.undefined)
    
    @scala.inline
    def setVisitChainElement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ChainElement, _], _]): Self = this.set("visitChainElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitChainElement: Self = this.set("visitChainElement", js.undefined)
    
    @scala.inline
    def setVisitChainExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ChainExpression, _], _]): Self = this.set("visitChainExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitChainExpression: Self = this.set("visitChainExpression", js.undefined)
    
    @scala.inline
    def setVisitClassBody(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassBody, _], _]): Self = this.set("visitClassBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitClassBody: Self = this.set("visitClassBody", js.undefined)
    
    @scala.inline
    def setVisitClassDeclaration(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassDeclaration, _], _]): Self = this.set("visitClassDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitClassDeclaration: Self = this.set("visitClassDeclaration", js.undefined)
    
    @scala.inline
    def setVisitClassExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassExpression, _], _]): Self = this.set("visitClassExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitClassExpression: Self = this.set("visitClassExpression", js.undefined)
    
    @scala.inline
    def setVisitClassImplements(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassImplements, _], _]): Self = this.set("visitClassImplements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitClassImplements: Self = this.set("visitClassImplements", js.undefined)
    
    @scala.inline
    def setVisitClassMethod(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassMethod, _], _]): Self = this.set("visitClassMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitClassMethod: Self = this.set("visitClassMethod", js.undefined)
    
    @scala.inline
    def setVisitClassPrivateMethod(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassPrivateMethod, _], _]): Self = this.set("visitClassPrivateMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitClassPrivateMethod: Self = this.set("visitClassPrivateMethod", js.undefined)
    
    @scala.inline
    def setVisitClassPrivateProperty(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassPrivateProperty, _], _]
    ): Self = this.set("visitClassPrivateProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitClassPrivateProperty: Self = this.set("visitClassPrivateProperty", js.undefined)
    
    @scala.inline
    def setVisitClassProperty(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassProperty, _], _]): Self = this.set("visitClassProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitClassProperty: Self = this.set("visitClassProperty", js.undefined)
    
    @scala.inline
    def setVisitClassPropertyDefinition(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassPropertyDefinition, _], _]
    ): Self = this.set("visitClassPropertyDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitClassPropertyDefinition: Self = this.set("visitClassPropertyDefinition", js.undefined)
    
    @scala.inline
    def setVisitComment(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Comment, _], _]): Self = this.set("visitComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitComment: Self = this.set("visitComment", js.undefined)
    
    @scala.inline
    def setVisitCommentBlock(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CommentBlock, _], _]): Self = this.set("visitCommentBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitCommentBlock: Self = this.set("visitCommentBlock", js.undefined)
    
    @scala.inline
    def setVisitCommentLine(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CommentLine, _], _]): Self = this.set("visitCommentLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitCommentLine: Self = this.set("visitCommentLine", js.undefined)
    
    @scala.inline
    def setVisitComprehensionBlock(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ComprehensionBlock, _], _]): Self = this.set("visitComprehensionBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitComprehensionBlock: Self = this.set("visitComprehensionBlock", js.undefined)
    
    @scala.inline
    def setVisitComprehensionExpression(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ComprehensionExpression, _], _]
    ): Self = this.set("visitComprehensionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitComprehensionExpression: Self = this.set("visitComprehensionExpression", js.undefined)
    
    @scala.inline
    def setVisitConditionalExpression(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ConditionalExpression, _], _]
    ): Self = this.set("visitConditionalExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitConditionalExpression: Self = this.set("visitConditionalExpression", js.undefined)
    
    @scala.inline
    def setVisitContinueStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ContinueStatement, _], _]): Self = this.set("visitContinueStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitContinueStatement: Self = this.set("visitContinueStatement", js.undefined)
    
    @scala.inline
    def setVisitDebuggerStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DebuggerStatement, _], _]): Self = this.set("visitDebuggerStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitDebuggerStatement: Self = this.set("visitDebuggerStatement", js.undefined)
    
    @scala.inline
    def setVisitDeclaration(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Declaration, _], _]): Self = this.set("visitDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitDeclaration: Self = this.set("visitDeclaration", js.undefined)
    
    @scala.inline
    def setVisitDeclareClass(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareClass, _], _]): Self = this.set("visitDeclareClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitDeclareClass: Self = this.set("visitDeclareClass", js.undefined)
    
    @scala.inline
    def setVisitDeclareExportAllDeclaration(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareExportAllDeclaration, _], _]
    ): Self = this.set("visitDeclareExportAllDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitDeclareExportAllDeclaration: Self = this.set("visitDeclareExportAllDeclaration", js.undefined)
    
    @scala.inline
    def setVisitDeclareExportDeclaration(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareExportDeclaration, _], _]
    ): Self = this.set("visitDeclareExportDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitDeclareExportDeclaration: Self = this.set("visitDeclareExportDeclaration", js.undefined)
    
    @scala.inline
    def setVisitDeclareFunction(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareFunction, _], _]): Self = this.set("visitDeclareFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitDeclareFunction: Self = this.set("visitDeclareFunction", js.undefined)
    
    @scala.inline
    def setVisitDeclareInterface(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareInterface, _], _]): Self = this.set("visitDeclareInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitDeclareInterface: Self = this.set("visitDeclareInterface", js.undefined)
    
    @scala.inline
    def setVisitDeclareModule(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareModule, _], _]): Self = this.set("visitDeclareModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitDeclareModule: Self = this.set("visitDeclareModule", js.undefined)
    
    @scala.inline
    def setVisitDeclareModuleExports(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareModuleExports, _], _]
    ): Self = this.set("visitDeclareModuleExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitDeclareModuleExports: Self = this.set("visitDeclareModuleExports", js.undefined)
    
    @scala.inline
    def setVisitDeclareOpaqueType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareOpaqueType, _], _]): Self = this.set("visitDeclareOpaqueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitDeclareOpaqueType: Self = this.set("visitDeclareOpaqueType", js.undefined)
    
    @scala.inline
    def setVisitDeclareTypeAlias(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareTypeAlias, _], _]): Self = this.set("visitDeclareTypeAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitDeclareTypeAlias: Self = this.set("visitDeclareTypeAlias", js.undefined)
    
    @scala.inline
    def setVisitDeclareVariable(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareVariable, _], _]): Self = this.set("visitDeclareVariable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitDeclareVariable: Self = this.set("visitDeclareVariable", js.undefined)
    
    @scala.inline
    def setVisitDeclaredPredicate(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclaredPredicate, _], _]): Self = this.set("visitDeclaredPredicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitDeclaredPredicate: Self = this.set("visitDeclaredPredicate", js.undefined)
    
    @scala.inline
    def setVisitDecorator(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Decorator, _], _]): Self = this.set("visitDecorator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitDecorator: Self = this.set("visitDecorator", js.undefined)
    
    @scala.inline
    def setVisitDirective(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Directive, _], _]): Self = this.set("visitDirective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitDirective: Self = this.set("visitDirective", js.undefined)
    
    @scala.inline
    def setVisitDirectiveLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DirectiveLiteral, _], _]): Self = this.set("visitDirectiveLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitDirectiveLiteral: Self = this.set("visitDirectiveLiteral", js.undefined)
    
    @scala.inline
    def setVisitDoExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DoExpression, _], _]): Self = this.set("visitDoExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitDoExpression: Self = this.set("visitDoExpression", js.undefined)
    
    @scala.inline
    def setVisitDoWhileStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DoWhileStatement, _], _]): Self = this.set("visitDoWhileStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitDoWhileStatement: Self = this.set("visitDoWhileStatement", js.undefined)
    
    @scala.inline
    def setVisitEmptyStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EmptyStatement, _], _]): Self = this.set("visitEmptyStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitEmptyStatement: Self = this.set("visitEmptyStatement", js.undefined)
    
    @scala.inline
    def setVisitEmptyTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EmptyTypeAnnotation, _], _]): Self = this.set("visitEmptyTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitEmptyTypeAnnotation: Self = this.set("visitEmptyTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitEnumBooleanBody(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumBooleanBody, _], _]): Self = this.set("visitEnumBooleanBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitEnumBooleanBody: Self = this.set("visitEnumBooleanBody", js.undefined)
    
    @scala.inline
    def setVisitEnumBooleanMember(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumBooleanMember, _], _]): Self = this.set("visitEnumBooleanMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitEnumBooleanMember: Self = this.set("visitEnumBooleanMember", js.undefined)
    
    @scala.inline
    def setVisitEnumDeclaration(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumDeclaration, _], _]): Self = this.set("visitEnumDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitEnumDeclaration: Self = this.set("visitEnumDeclaration", js.undefined)
    
    @scala.inline
    def setVisitEnumDefaultedMember(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumDefaultedMember, _], _]): Self = this.set("visitEnumDefaultedMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitEnumDefaultedMember: Self = this.set("visitEnumDefaultedMember", js.undefined)
    
    @scala.inline
    def setVisitEnumNumberBody(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumNumberBody, _], _]): Self = this.set("visitEnumNumberBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitEnumNumberBody: Self = this.set("visitEnumNumberBody", js.undefined)
    
    @scala.inline
    def setVisitEnumNumberMember(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumNumberMember, _], _]): Self = this.set("visitEnumNumberMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitEnumNumberMember: Self = this.set("visitEnumNumberMember", js.undefined)
    
    @scala.inline
    def setVisitEnumStringBody(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumStringBody, _], _]): Self = this.set("visitEnumStringBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitEnumStringBody: Self = this.set("visitEnumStringBody", js.undefined)
    
    @scala.inline
    def setVisitEnumStringMember(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumStringMember, _], _]): Self = this.set("visitEnumStringMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitEnumStringMember: Self = this.set("visitEnumStringMember", js.undefined)
    
    @scala.inline
    def setVisitEnumSymbolBody(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumSymbolBody, _], _]): Self = this.set("visitEnumSymbolBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitEnumSymbolBody: Self = this.set("visitEnumSymbolBody", js.undefined)
    
    @scala.inline
    def setVisitExistentialTypeParam(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExistentialTypeParam, _], _]
    ): Self = this.set("visitExistentialTypeParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitExistentialTypeParam: Self = this.set("visitExistentialTypeParam", js.undefined)
    
    @scala.inline
    def setVisitExistsTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExistsTypeAnnotation, _], _]
    ): Self = this.set("visitExistsTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitExistsTypeAnnotation: Self = this.set("visitExistsTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitExportAllDeclaration(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportAllDeclaration, _], _]
    ): Self = this.set("visitExportAllDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitExportAllDeclaration: Self = this.set("visitExportAllDeclaration", js.undefined)
    
    @scala.inline
    def setVisitExportBatchSpecifier(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportBatchSpecifier, _], _]
    ): Self = this.set("visitExportBatchSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitExportBatchSpecifier: Self = this.set("visitExportBatchSpecifier", js.undefined)
    
    @scala.inline
    def setVisitExportDeclaration(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportDeclaration, _], _]): Self = this.set("visitExportDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitExportDeclaration: Self = this.set("visitExportDeclaration", js.undefined)
    
    @scala.inline
    def setVisitExportDefaultDeclaration(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportDefaultDeclaration, _], _]
    ): Self = this.set("visitExportDefaultDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitExportDefaultDeclaration: Self = this.set("visitExportDefaultDeclaration", js.undefined)
    
    @scala.inline
    def setVisitExportDefaultSpecifier(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportDefaultSpecifier, _], _]
    ): Self = this.set("visitExportDefaultSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitExportDefaultSpecifier: Self = this.set("visitExportDefaultSpecifier", js.undefined)
    
    @scala.inline
    def setVisitExportNamedDeclaration(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportNamedDeclaration, _], _]
    ): Self = this.set("visitExportNamedDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitExportNamedDeclaration: Self = this.set("visitExportNamedDeclaration", js.undefined)
    
    @scala.inline
    def setVisitExportNamespaceSpecifier(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportNamespaceSpecifier, _], _]
    ): Self = this.set("visitExportNamespaceSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitExportNamespaceSpecifier: Self = this.set("visitExportNamespaceSpecifier", js.undefined)
    
    @scala.inline
    def setVisitExportSpecifier(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportSpecifier, _], _]): Self = this.set("visitExportSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitExportSpecifier: Self = this.set("visitExportSpecifier", js.undefined)
    
    @scala.inline
    def setVisitExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Expression, _], _]): Self = this.set("visitExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitExpression: Self = this.set("visitExpression", js.undefined)
    
    @scala.inline
    def setVisitExpressionStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExpressionStatement, _], _]): Self = this.set("visitExpressionStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitExpressionStatement: Self = this.set("visitExpressionStatement", js.undefined)
    
    @scala.inline
    def setVisitFile(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[File, _], _]): Self = this.set("visitFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitFile: Self = this.set("visitFile", js.undefined)
    
    @scala.inline
    def setVisitFlow(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Flow, _], _]): Self = this.set("visitFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitFlow: Self = this.set("visitFlow", js.undefined)
    
    @scala.inline
    def setVisitFlowPredicate(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FlowPredicate, _], _]): Self = this.set("visitFlowPredicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitFlowPredicate: Self = this.set("visitFlowPredicate", js.undefined)
    
    @scala.inline
    def setVisitFlowType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FlowType, _], _]): Self = this.set("visitFlowType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitFlowType: Self = this.set("visitFlowType", js.undefined)
    
    @scala.inline
    def setVisitForAwaitStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForAwaitStatement, _], _]): Self = this.set("visitForAwaitStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitForAwaitStatement: Self = this.set("visitForAwaitStatement", js.undefined)
    
    @scala.inline
    def setVisitForInStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForInStatement, _], _]): Self = this.set("visitForInStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitForInStatement: Self = this.set("visitForInStatement", js.undefined)
    
    @scala.inline
    def setVisitForOfStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForOfStatement, _], _]): Self = this.set("visitForOfStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitForOfStatement: Self = this.set("visitForOfStatement", js.undefined)
    
    @scala.inline
    def setVisitForStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForStatement, _], _]): Self = this.set("visitForStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitForStatement: Self = this.set("visitForStatement", js.undefined)
    
    @scala.inline
    def setVisitFunction(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Function, _], _]): Self = this.set("visitFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitFunction: Self = this.set("visitFunction", js.undefined)
    
    @scala.inline
    def setVisitFunctionDeclaration(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionDeclaration, _], _]): Self = this.set("visitFunctionDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitFunctionDeclaration: Self = this.set("visitFunctionDeclaration", js.undefined)
    
    @scala.inline
    def setVisitFunctionExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionExpression, _], _]): Self = this.set("visitFunctionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitFunctionExpression: Self = this.set("visitFunctionExpression", js.undefined)
    
    @scala.inline
    def setVisitFunctionTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionTypeAnnotation, _], _]
    ): Self = this.set("visitFunctionTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitFunctionTypeAnnotation: Self = this.set("visitFunctionTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitFunctionTypeParam(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionTypeParam, _], _]): Self = this.set("visitFunctionTypeParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitFunctionTypeParam: Self = this.set("visitFunctionTypeParam", js.undefined)
    
    @scala.inline
    def setVisitGeneratorExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[GeneratorExpression, _], _]): Self = this.set("visitGeneratorExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitGeneratorExpression: Self = this.set("visitGeneratorExpression", js.undefined)
    
    @scala.inline
    def setVisitGenericTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[GenericTypeAnnotation, _], _]
    ): Self = this.set("visitGenericTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitGenericTypeAnnotation: Self = this.set("visitGenericTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitIdentifier(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Identifier, _], _]): Self = this.set("visitIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitIdentifier: Self = this.set("visitIdentifier", js.undefined)
    
    @scala.inline
    def setVisitIfStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[IfStatement, _], _]): Self = this.set("visitIfStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitIfStatement: Self = this.set("visitIfStatement", js.undefined)
    
    @scala.inline
    def setVisitImport(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Import, _], _]): Self = this.set("visitImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitImport: Self = this.set("visitImport", js.undefined)
    
    @scala.inline
    def setVisitImportDeclaration(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportDeclaration, _], _]): Self = this.set("visitImportDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitImportDeclaration: Self = this.set("visitImportDeclaration", js.undefined)
    
    @scala.inline
    def setVisitImportDefaultSpecifier(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportDefaultSpecifier, _], _]
    ): Self = this.set("visitImportDefaultSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitImportDefaultSpecifier: Self = this.set("visitImportDefaultSpecifier", js.undefined)
    
    @scala.inline
    def setVisitImportExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportExpression, _], _]): Self = this.set("visitImportExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitImportExpression: Self = this.set("visitImportExpression", js.undefined)
    
    @scala.inline
    def setVisitImportNamespaceSpecifier(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportNamespaceSpecifier, _], _]
    ): Self = this.set("visitImportNamespaceSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitImportNamespaceSpecifier: Self = this.set("visitImportNamespaceSpecifier", js.undefined)
    
    @scala.inline
    def setVisitImportSpecifier(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportSpecifier, _], _]): Self = this.set("visitImportSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitImportSpecifier: Self = this.set("visitImportSpecifier", js.undefined)
    
    @scala.inline
    def setVisitInferredPredicate(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InferredPredicate, _], _]): Self = this.set("visitInferredPredicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitInferredPredicate: Self = this.set("visitInferredPredicate", js.undefined)
    
    @scala.inline
    def setVisitInterfaceDeclaration(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterfaceDeclaration, _], _]
    ): Self = this.set("visitInterfaceDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitInterfaceDeclaration: Self = this.set("visitInterfaceDeclaration", js.undefined)
    
    @scala.inline
    def setVisitInterfaceExtends(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterfaceExtends, _], _]): Self = this.set("visitInterfaceExtends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitInterfaceExtends: Self = this.set("visitInterfaceExtends", js.undefined)
    
    @scala.inline
    def setVisitInterfaceTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterfaceTypeAnnotation, _], _]
    ): Self = this.set("visitInterfaceTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitInterfaceTypeAnnotation: Self = this.set("visitInterfaceTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitInterpreterDirective(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterpreterDirective, _], _]
    ): Self = this.set("visitInterpreterDirective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitInterpreterDirective: Self = this.set("visitInterpreterDirective", js.undefined)
    
    @scala.inline
    def setVisitIntersectionTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[IntersectionTypeAnnotation, _], _]
    ): Self = this.set("visitIntersectionTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitIntersectionTypeAnnotation: Self = this.set("visitIntersectionTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitJSXAttribute(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXAttribute, _], _]): Self = this.set("visitJSXAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitJSXAttribute: Self = this.set("visitJSXAttribute", js.undefined)
    
    @scala.inline
    def setVisitJSXClosingElement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXClosingElement, _], _]): Self = this.set("visitJSXClosingElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitJSXClosingElement: Self = this.set("visitJSXClosingElement", js.undefined)
    
    @scala.inline
    def setVisitJSXClosingFragment(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXClosingFragment, _], _]): Self = this.set("visitJSXClosingFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitJSXClosingFragment: Self = this.set("visitJSXClosingFragment", js.undefined)
    
    @scala.inline
    def setVisitJSXElement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXElement, _], _]): Self = this.set("visitJSXElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitJSXElement: Self = this.set("visitJSXElement", js.undefined)
    
    @scala.inline
    def setVisitJSXEmptyExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXEmptyExpression, _], _]): Self = this.set("visitJSXEmptyExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitJSXEmptyExpression: Self = this.set("visitJSXEmptyExpression", js.undefined)
    
    @scala.inline
    def setVisitJSXExpressionContainer(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXExpressionContainer, _], _]
    ): Self = this.set("visitJSXExpressionContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitJSXExpressionContainer: Self = this.set("visitJSXExpressionContainer", js.undefined)
    
    @scala.inline
    def setVisitJSXFragment(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXFragment, _], _]): Self = this.set("visitJSXFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitJSXFragment: Self = this.set("visitJSXFragment", js.undefined)
    
    @scala.inline
    def setVisitJSXIdentifier(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXIdentifier, _], _]): Self = this.set("visitJSXIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitJSXIdentifier: Self = this.set("visitJSXIdentifier", js.undefined)
    
    @scala.inline
    def setVisitJSXMemberExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXMemberExpression, _], _]): Self = this.set("visitJSXMemberExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitJSXMemberExpression: Self = this.set("visitJSXMemberExpression", js.undefined)
    
    @scala.inline
    def setVisitJSXNamespacedName(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXNamespacedName, _], _]): Self = this.set("visitJSXNamespacedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitJSXNamespacedName: Self = this.set("visitJSXNamespacedName", js.undefined)
    
    @scala.inline
    def setVisitJSXOpeningElement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXOpeningElement, _], _]): Self = this.set("visitJSXOpeningElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitJSXOpeningElement: Self = this.set("visitJSXOpeningElement", js.undefined)
    
    @scala.inline
    def setVisitJSXOpeningFragment(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXOpeningFragment, _], _]): Self = this.set("visitJSXOpeningFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitJSXOpeningFragment: Self = this.set("visitJSXOpeningFragment", js.undefined)
    
    @scala.inline
    def setVisitJSXSpreadAttribute(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXSpreadAttribute, _], _]): Self = this.set("visitJSXSpreadAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitJSXSpreadAttribute: Self = this.set("visitJSXSpreadAttribute", js.undefined)
    
    @scala.inline
    def setVisitJSXSpreadChild(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXSpreadChild, _], _]): Self = this.set("visitJSXSpreadChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitJSXSpreadChild: Self = this.set("visitJSXSpreadChild", js.undefined)
    
    @scala.inline
    def setVisitJSXText(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXText, _], _]): Self = this.set("visitJSXText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitJSXText: Self = this.set("visitJSXText", js.undefined)
    
    @scala.inline
    def setVisitLabeledStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[LabeledStatement, _], _]): Self = this.set("visitLabeledStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitLabeledStatement: Self = this.set("visitLabeledStatement", js.undefined)
    
    @scala.inline
    def setVisitLine(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Line, _], _]): Self = this.set("visitLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitLine: Self = this.set("visitLine", js.undefined)
    
    @scala.inline
    def setVisitLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Literal, _], _]): Self = this.set("visitLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitLiteral: Self = this.set("visitLiteral", js.undefined)
    
    @scala.inline
    def setVisitLogicalExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[LogicalExpression, _], _]): Self = this.set("visitLogicalExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitLogicalExpression: Self = this.set("visitLogicalExpression", js.undefined)
    
    @scala.inline
    def setVisitMemberExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MemberExpression, _], _]): Self = this.set("visitMemberExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitMemberExpression: Self = this.set("visitMemberExpression", js.undefined)
    
    @scala.inline
    def setVisitMemberTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MemberTypeAnnotation, _], _]
    ): Self = this.set("visitMemberTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitMemberTypeAnnotation: Self = this.set("visitMemberTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitMetaProperty(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MetaProperty, _], _]): Self = this.set("visitMetaProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitMetaProperty: Self = this.set("visitMetaProperty", js.undefined)
    
    @scala.inline
    def setVisitMethodDefinition(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MethodDefinition, _], _]): Self = this.set("visitMethodDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitMethodDefinition: Self = this.set("visitMethodDefinition", js.undefined)
    
    @scala.inline
    def setVisitMixedTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MixedTypeAnnotation, _], _]): Self = this.set("visitMixedTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitMixedTypeAnnotation: Self = this.set("visitMixedTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitModuleSpecifier(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ModuleSpecifier, _], _]): Self = this.set("visitModuleSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitModuleSpecifier: Self = this.set("visitModuleSpecifier", js.undefined)
    
    @scala.inline
    def setVisitNewExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NewExpression, _], _]): Self = this.set("visitNewExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitNewExpression: Self = this.set("visitNewExpression", js.undefined)
    
    @scala.inline
    def setVisitNode(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Node, _], _]): Self = this.set("visitNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitNode: Self = this.set("visitNode", js.undefined)
    
    @scala.inline
    def setVisitNoop(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Noop, _], _]): Self = this.set("visitNoop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitNoop: Self = this.set("visitNoop", js.undefined)
    
    @scala.inline
    def setVisitNullLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullLiteral, _], _]): Self = this.set("visitNullLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitNullLiteral: Self = this.set("visitNullLiteral", js.undefined)
    
    @scala.inline
    def setVisitNullLiteralTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullLiteralTypeAnnotation, _], _]
    ): Self = this.set("visitNullLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitNullLiteralTypeAnnotation: Self = this.set("visitNullLiteralTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitNullTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullTypeAnnotation, _], _]): Self = this.set("visitNullTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitNullTypeAnnotation: Self = this.set("visitNullTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitNullableTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullableTypeAnnotation, _], _]
    ): Self = this.set("visitNullableTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitNullableTypeAnnotation: Self = this.set("visitNullableTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitNumberLiteralTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumberLiteralTypeAnnotation, _], _]
    ): Self = this.set("visitNumberLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitNumberLiteralTypeAnnotation: Self = this.set("visitNumberLiteralTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitNumberTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumberTypeAnnotation, _], _]
    ): Self = this.set("visitNumberTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitNumberTypeAnnotation: Self = this.set("visitNumberTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitNumericLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumericLiteral, _], _]): Self = this.set("visitNumericLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitNumericLiteral: Self = this.set("visitNumericLiteral", js.undefined)
    
    @scala.inline
    def setVisitNumericLiteralTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumericLiteralTypeAnnotation, _], _]
    ): Self = this.set("visitNumericLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitNumericLiteralTypeAnnotation: Self = this.set("visitNumericLiteralTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitObjectExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectExpression, _], _]): Self = this.set("visitObjectExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitObjectExpression: Self = this.set("visitObjectExpression", js.undefined)
    
    @scala.inline
    def setVisitObjectMethod(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectMethod, _], _]): Self = this.set("visitObjectMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitObjectMethod: Self = this.set("visitObjectMethod", js.undefined)
    
    @scala.inline
    def setVisitObjectPattern(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectPattern, _], _]): Self = this.set("visitObjectPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitObjectPattern: Self = this.set("visitObjectPattern", js.undefined)
    
    @scala.inline
    def setVisitObjectProperty(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectProperty, _], _]): Self = this.set("visitObjectProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitObjectProperty: Self = this.set("visitObjectProperty", js.undefined)
    
    @scala.inline
    def setVisitObjectTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeAnnotation, _], _]
    ): Self = this.set("visitObjectTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitObjectTypeAnnotation: Self = this.set("visitObjectTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitObjectTypeCallProperty(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeCallProperty, _], _]
    ): Self = this.set("visitObjectTypeCallProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitObjectTypeCallProperty: Self = this.set("visitObjectTypeCallProperty", js.undefined)
    
    @scala.inline
    def setVisitObjectTypeIndexer(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeIndexer, _], _]): Self = this.set("visitObjectTypeIndexer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitObjectTypeIndexer: Self = this.set("visitObjectTypeIndexer", js.undefined)
    
    @scala.inline
    def setVisitObjectTypeInternalSlot(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeInternalSlot, _], _]
    ): Self = this.set("visitObjectTypeInternalSlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitObjectTypeInternalSlot: Self = this.set("visitObjectTypeInternalSlot", js.undefined)
    
    @scala.inline
    def setVisitObjectTypeProperty(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeProperty, _], _]): Self = this.set("visitObjectTypeProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitObjectTypeProperty: Self = this.set("visitObjectTypeProperty", js.undefined)
    
    @scala.inline
    def setVisitObjectTypeSpreadProperty(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeSpreadProperty, _], _]
    ): Self = this.set("visitObjectTypeSpreadProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitObjectTypeSpreadProperty: Self = this.set("visitObjectTypeSpreadProperty", js.undefined)
    
    @scala.inline
    def setVisitOpaqueType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[OpaqueType, _], _]): Self = this.set("visitOpaqueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitOpaqueType: Self = this.set("visitOpaqueType", js.undefined)
    
    @scala.inline
    def setVisitOptionalCallExpression(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[OptionalCallExpression, _], _]
    ): Self = this.set("visitOptionalCallExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitOptionalCallExpression: Self = this.set("visitOptionalCallExpression", js.undefined)
    
    @scala.inline
    def setVisitOptionalMemberExpression(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[OptionalMemberExpression, _], _]
    ): Self = this.set("visitOptionalMemberExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitOptionalMemberExpression: Self = this.set("visitOptionalMemberExpression", js.undefined)
    
    @scala.inline
    def setVisitParenthesizedExpression(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ParenthesizedExpression, _], _]
    ): Self = this.set("visitParenthesizedExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitParenthesizedExpression: Self = this.set("visitParenthesizedExpression", js.undefined)
    
    @scala.inline
    def setVisitPattern(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Pattern, _], _]): Self = this.set("visitPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitPattern: Self = this.set("visitPattern", js.undefined)
    
    @scala.inline
    def setVisitPosition(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Position, _], _]): Self = this.set("visitPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitPosition: Self = this.set("visitPosition", js.undefined)
    
    @scala.inline
    def setVisitPrintable(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Printable, _], _]): Self = this.set("visitPrintable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitPrintable: Self = this.set("visitPrintable", js.undefined)
    
    @scala.inline
    def setVisitPrivateName(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[PrivateName, _], _]): Self = this.set("visitPrivateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitPrivateName: Self = this.set("visitPrivateName", js.undefined)
    
    @scala.inline
    def setVisitProgram(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Program, _], _]): Self = this.set("visitProgram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitProgram: Self = this.set("visitProgram", js.undefined)
    
    @scala.inline
    def setVisitProperty(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Property, _], _]): Self = this.set("visitProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitProperty: Self = this.set("visitProperty", js.undefined)
    
    @scala.inline
    def setVisitPropertyPattern(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[PropertyPattern, _], _]): Self = this.set("visitPropertyPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitPropertyPattern: Self = this.set("visitPropertyPattern", js.undefined)
    
    @scala.inline
    def setVisitQualifiedTypeIdentifier(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[QualifiedTypeIdentifier, _], _]
    ): Self = this.set("visitQualifiedTypeIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitQualifiedTypeIdentifier: Self = this.set("visitQualifiedTypeIdentifier", js.undefined)
    
    @scala.inline
    def setVisitRegExpLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[RegExpLiteral, _], _]): Self = this.set("visitRegExpLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitRegExpLiteral: Self = this.set("visitRegExpLiteral", js.undefined)
    
    @scala.inline
    def setVisitRestElement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[RestElement, _], _]): Self = this.set("visitRestElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitRestElement: Self = this.set("visitRestElement", js.undefined)
    
    @scala.inline
    def setVisitRestProperty(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[RestProperty, _], _]): Self = this.set("visitRestProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitRestProperty: Self = this.set("visitRestProperty", js.undefined)
    
    @scala.inline
    def setVisitReturnStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ReturnStatement, _], _]): Self = this.set("visitReturnStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitReturnStatement: Self = this.set("visitReturnStatement", js.undefined)
    
    @scala.inline
    def setVisitSequenceExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SequenceExpression, _], _]): Self = this.set("visitSequenceExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitSequenceExpression: Self = this.set("visitSequenceExpression", js.undefined)
    
    @scala.inline
    def setVisitSourceLocation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SourceLocation, _], _]): Self = this.set("visitSourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitSourceLocation: Self = this.set("visitSourceLocation", js.undefined)
    
    @scala.inline
    def setVisitSpecifier(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Specifier, _], _]): Self = this.set("visitSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitSpecifier: Self = this.set("visitSpecifier", js.undefined)
    
    @scala.inline
    def setVisitSpreadElement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadElement, _], _]): Self = this.set("visitSpreadElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitSpreadElement: Self = this.set("visitSpreadElement", js.undefined)
    
    @scala.inline
    def setVisitSpreadElementPattern(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadElementPattern, _], _]
    ): Self = this.set("visitSpreadElementPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitSpreadElementPattern: Self = this.set("visitSpreadElementPattern", js.undefined)
    
    @scala.inline
    def setVisitSpreadProperty(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadProperty, _], _]): Self = this.set("visitSpreadProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitSpreadProperty: Self = this.set("visitSpreadProperty", js.undefined)
    
    @scala.inline
    def setVisitSpreadPropertyPattern(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadPropertyPattern, _], _]
    ): Self = this.set("visitSpreadPropertyPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitSpreadPropertyPattern: Self = this.set("visitSpreadPropertyPattern", js.undefined)
    
    @scala.inline
    def setVisitStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Statement, _], _]): Self = this.set("visitStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitStatement: Self = this.set("visitStatement", js.undefined)
    
    @scala.inline
    def setVisitStringLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[StringLiteral, _], _]): Self = this.set("visitStringLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitStringLiteral: Self = this.set("visitStringLiteral", js.undefined)
    
    @scala.inline
    def setVisitStringLiteralTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[StringLiteralTypeAnnotation, _], _]
    ): Self = this.set("visitStringLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitStringLiteralTypeAnnotation: Self = this.set("visitStringLiteralTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitStringTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[StringTypeAnnotation, _], _]
    ): Self = this.set("visitStringTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitStringTypeAnnotation: Self = this.set("visitStringTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitSuper(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Super, _], _]): Self = this.set("visitSuper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitSuper: Self = this.set("visitSuper", js.undefined)
    
    @scala.inline
    def setVisitSwitchCase(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SwitchCase, _], _]): Self = this.set("visitSwitchCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitSwitchCase: Self = this.set("visitSwitchCase", js.undefined)
    
    @scala.inline
    def setVisitSwitchStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SwitchStatement, _], _]): Self = this.set("visitSwitchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitSwitchStatement: Self = this.set("visitSwitchStatement", js.undefined)
    
    @scala.inline
    def setVisitSymbolTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SymbolTypeAnnotation, _], _]
    ): Self = this.set("visitSymbolTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitSymbolTypeAnnotation: Self = this.set("visitSymbolTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitTSAnyKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSAnyKeyword, _], _]): Self = this.set("visitTSAnyKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSAnyKeyword: Self = this.set("visitTSAnyKeyword", js.undefined)
    
    @scala.inline
    def setVisitTSArrayType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSArrayType, _], _]): Self = this.set("visitTSArrayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSArrayType: Self = this.set("visitTSArrayType", js.undefined)
    
    @scala.inline
    def setVisitTSAsExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSAsExpression, _], _]): Self = this.set("visitTSAsExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSAsExpression: Self = this.set("visitTSAsExpression", js.undefined)
    
    @scala.inline
    def setVisitTSBigIntKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSBigIntKeyword, _], _]): Self = this.set("visitTSBigIntKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSBigIntKeyword: Self = this.set("visitTSBigIntKeyword", js.undefined)
    
    @scala.inline
    def setVisitTSBooleanKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSBooleanKeyword, _], _]): Self = this.set("visitTSBooleanKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSBooleanKeyword: Self = this.set("visitTSBooleanKeyword", js.undefined)
    
    @scala.inline
    def setVisitTSCallSignatureDeclaration(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSCallSignatureDeclaration, _], _]
    ): Self = this.set("visitTSCallSignatureDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSCallSignatureDeclaration: Self = this.set("visitTSCallSignatureDeclaration", js.undefined)
    
    @scala.inline
    def setVisitTSConditionalType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSConditionalType, _], _]): Self = this.set("visitTSConditionalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSConditionalType: Self = this.set("visitTSConditionalType", js.undefined)
    
    @scala.inline
    def setVisitTSConstructSignatureDeclaration(
      value: js.ThisFunction1[
          /* this */ Context with M, 
          /* path */ NodePath[TSConstructSignatureDeclaration, _], 
          _
        ]
    ): Self = this.set("visitTSConstructSignatureDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSConstructSignatureDeclaration: Self = this.set("visitTSConstructSignatureDeclaration", js.undefined)
    
    @scala.inline
    def setVisitTSConstructorType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSConstructorType, _], _]): Self = this.set("visitTSConstructorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSConstructorType: Self = this.set("visitTSConstructorType", js.undefined)
    
    @scala.inline
    def setVisitTSDeclareFunction(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSDeclareFunction, _], _]): Self = this.set("visitTSDeclareFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSDeclareFunction: Self = this.set("visitTSDeclareFunction", js.undefined)
    
    @scala.inline
    def setVisitTSDeclareMethod(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSDeclareMethod, _], _]): Self = this.set("visitTSDeclareMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSDeclareMethod: Self = this.set("visitTSDeclareMethod", js.undefined)
    
    @scala.inline
    def setVisitTSEnumDeclaration(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSEnumDeclaration, _], _]): Self = this.set("visitTSEnumDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSEnumDeclaration: Self = this.set("visitTSEnumDeclaration", js.undefined)
    
    @scala.inline
    def setVisitTSEnumMember(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSEnumMember, _], _]): Self = this.set("visitTSEnumMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSEnumMember: Self = this.set("visitTSEnumMember", js.undefined)
    
    @scala.inline
    def setVisitTSExportAssignment(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSExportAssignment, _], _]): Self = this.set("visitTSExportAssignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSExportAssignment: Self = this.set("visitTSExportAssignment", js.undefined)
    
    @scala.inline
    def setVisitTSExpressionWithTypeArguments(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSExpressionWithTypeArguments, _], _]
    ): Self = this.set("visitTSExpressionWithTypeArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSExpressionWithTypeArguments: Self = this.set("visitTSExpressionWithTypeArguments", js.undefined)
    
    @scala.inline
    def setVisitTSExternalModuleReference(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSExternalModuleReference, _], _]
    ): Self = this.set("visitTSExternalModuleReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSExternalModuleReference: Self = this.set("visitTSExternalModuleReference", js.undefined)
    
    @scala.inline
    def setVisitTSFunctionType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSFunctionType, _], _]): Self = this.set("visitTSFunctionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSFunctionType: Self = this.set("visitTSFunctionType", js.undefined)
    
    @scala.inline
    def setVisitTSHasOptionalTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSHasOptionalTypeAnnotation, _], _]
    ): Self = this.set("visitTSHasOptionalTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSHasOptionalTypeAnnotation: Self = this.set("visitTSHasOptionalTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitTSHasOptionalTypeParameterInstantiation(
      value: js.ThisFunction1[
          /* this */ Context with M, 
          /* path */ NodePath[TSHasOptionalTypeParameterInstantiation, _], 
          _
        ]
    ): Self = this.set("visitTSHasOptionalTypeParameterInstantiation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSHasOptionalTypeParameterInstantiation: Self = this.set("visitTSHasOptionalTypeParameterInstantiation", js.undefined)
    
    @scala.inline
    def setVisitTSHasOptionalTypeParameters(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSHasOptionalTypeParameters, _], _]
    ): Self = this.set("visitTSHasOptionalTypeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSHasOptionalTypeParameters: Self = this.set("visitTSHasOptionalTypeParameters", js.undefined)
    
    @scala.inline
    def setVisitTSImportEqualsDeclaration(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSImportEqualsDeclaration, _], _]
    ): Self = this.set("visitTSImportEqualsDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSImportEqualsDeclaration: Self = this.set("visitTSImportEqualsDeclaration", js.undefined)
    
    @scala.inline
    def setVisitTSImportType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSImportType, _], _]): Self = this.set("visitTSImportType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSImportType: Self = this.set("visitTSImportType", js.undefined)
    
    @scala.inline
    def setVisitTSIndexSignature(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSIndexSignature, _], _]): Self = this.set("visitTSIndexSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSIndexSignature: Self = this.set("visitTSIndexSignature", js.undefined)
    
    @scala.inline
    def setVisitTSIndexedAccessType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSIndexedAccessType, _], _]): Self = this.set("visitTSIndexedAccessType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSIndexedAccessType: Self = this.set("visitTSIndexedAccessType", js.undefined)
    
    @scala.inline
    def setVisitTSInferType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSInferType, _], _]): Self = this.set("visitTSInferType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSInferType: Self = this.set("visitTSInferType", js.undefined)
    
    @scala.inline
    def setVisitTSInterfaceBody(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSInterfaceBody, _], _]): Self = this.set("visitTSInterfaceBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSInterfaceBody: Self = this.set("visitTSInterfaceBody", js.undefined)
    
    @scala.inline
    def setVisitTSInterfaceDeclaration(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSInterfaceDeclaration, _], _]
    ): Self = this.set("visitTSInterfaceDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSInterfaceDeclaration: Self = this.set("visitTSInterfaceDeclaration", js.undefined)
    
    @scala.inline
    def setVisitTSIntersectionType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSIntersectionType, _], _]): Self = this.set("visitTSIntersectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSIntersectionType: Self = this.set("visitTSIntersectionType", js.undefined)
    
    @scala.inline
    def setVisitTSLiteralType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSLiteralType, _], _]): Self = this.set("visitTSLiteralType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSLiteralType: Self = this.set("visitTSLiteralType", js.undefined)
    
    @scala.inline
    def setVisitTSMappedType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSMappedType, _], _]): Self = this.set("visitTSMappedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSMappedType: Self = this.set("visitTSMappedType", js.undefined)
    
    @scala.inline
    def setVisitTSMethodSignature(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSMethodSignature, _], _]): Self = this.set("visitTSMethodSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSMethodSignature: Self = this.set("visitTSMethodSignature", js.undefined)
    
    @scala.inline
    def setVisitTSModuleBlock(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSModuleBlock, _], _]): Self = this.set("visitTSModuleBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSModuleBlock: Self = this.set("visitTSModuleBlock", js.undefined)
    
    @scala.inline
    def setVisitTSModuleDeclaration(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSModuleDeclaration, _], _]): Self = this.set("visitTSModuleDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSModuleDeclaration: Self = this.set("visitTSModuleDeclaration", js.undefined)
    
    @scala.inline
    def setVisitTSNamedTupleMember(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNamedTupleMember, _], _]): Self = this.set("visitTSNamedTupleMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSNamedTupleMember: Self = this.set("visitTSNamedTupleMember", js.undefined)
    
    @scala.inline
    def setVisitTSNamespaceExportDeclaration(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNamespaceExportDeclaration, _], _]
    ): Self = this.set("visitTSNamespaceExportDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSNamespaceExportDeclaration: Self = this.set("visitTSNamespaceExportDeclaration", js.undefined)
    
    @scala.inline
    def setVisitTSNeverKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNeverKeyword, _], _]): Self = this.set("visitTSNeverKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSNeverKeyword: Self = this.set("visitTSNeverKeyword", js.undefined)
    
    @scala.inline
    def setVisitTSNonNullExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNonNullExpression, _], _]): Self = this.set("visitTSNonNullExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSNonNullExpression: Self = this.set("visitTSNonNullExpression", js.undefined)
    
    @scala.inline
    def setVisitTSNullKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNullKeyword, _], _]): Self = this.set("visitTSNullKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSNullKeyword: Self = this.set("visitTSNullKeyword", js.undefined)
    
    @scala.inline
    def setVisitTSNumberKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNumberKeyword, _], _]): Self = this.set("visitTSNumberKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSNumberKeyword: Self = this.set("visitTSNumberKeyword", js.undefined)
    
    @scala.inline
    def setVisitTSObjectKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSObjectKeyword, _], _]): Self = this.set("visitTSObjectKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSObjectKeyword: Self = this.set("visitTSObjectKeyword", js.undefined)
    
    @scala.inline
    def setVisitTSOptionalType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSOptionalType, _], _]): Self = this.set("visitTSOptionalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSOptionalType: Self = this.set("visitTSOptionalType", js.undefined)
    
    @scala.inline
    def setVisitTSParameterProperty(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSParameterProperty, _], _]): Self = this.set("visitTSParameterProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSParameterProperty: Self = this.set("visitTSParameterProperty", js.undefined)
    
    @scala.inline
    def setVisitTSParenthesizedType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSParenthesizedType, _], _]): Self = this.set("visitTSParenthesizedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSParenthesizedType: Self = this.set("visitTSParenthesizedType", js.undefined)
    
    @scala.inline
    def setVisitTSPropertySignature(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSPropertySignature, _], _]): Self = this.set("visitTSPropertySignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSPropertySignature: Self = this.set("visitTSPropertySignature", js.undefined)
    
    @scala.inline
    def setVisitTSQualifiedName(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSQualifiedName, _], _]): Self = this.set("visitTSQualifiedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSQualifiedName: Self = this.set("visitTSQualifiedName", js.undefined)
    
    @scala.inline
    def setVisitTSRestType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSRestType, _], _]): Self = this.set("visitTSRestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSRestType: Self = this.set("visitTSRestType", js.undefined)
    
    @scala.inline
    def setVisitTSStringKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSStringKeyword, _], _]): Self = this.set("visitTSStringKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSStringKeyword: Self = this.set("visitTSStringKeyword", js.undefined)
    
    @scala.inline
    def setVisitTSSymbolKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSSymbolKeyword, _], _]): Self = this.set("visitTSSymbolKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSSymbolKeyword: Self = this.set("visitTSSymbolKeyword", js.undefined)
    
    @scala.inline
    def setVisitTSThisType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSThisType, _], _]): Self = this.set("visitTSThisType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSThisType: Self = this.set("visitTSThisType", js.undefined)
    
    @scala.inline
    def setVisitTSTupleType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTupleType, _], _]): Self = this.set("visitTSTupleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSTupleType: Self = this.set("visitTSTupleType", js.undefined)
    
    @scala.inline
    def setVisitTSType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSType, _], _]): Self = this.set("visitTSType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSType: Self = this.set("visitTSType", js.undefined)
    
    @scala.inline
    def setVisitTSTypeAliasDeclaration(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeAliasDeclaration, _], _]
    ): Self = this.set("visitTSTypeAliasDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSTypeAliasDeclaration: Self = this.set("visitTSTypeAliasDeclaration", js.undefined)
    
    @scala.inline
    def setVisitTSTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeAnnotation, _], _]): Self = this.set("visitTSTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSTypeAnnotation: Self = this.set("visitTSTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitTSTypeAssertion(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeAssertion, _], _]): Self = this.set("visitTSTypeAssertion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSTypeAssertion: Self = this.set("visitTSTypeAssertion", js.undefined)
    
    @scala.inline
    def setVisitTSTypeLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeLiteral, _], _]): Self = this.set("visitTSTypeLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSTypeLiteral: Self = this.set("visitTSTypeLiteral", js.undefined)
    
    @scala.inline
    def setVisitTSTypeOperator(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeOperator, _], _]): Self = this.set("visitTSTypeOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSTypeOperator: Self = this.set("visitTSTypeOperator", js.undefined)
    
    @scala.inline
    def setVisitTSTypeParameter(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeParameter, _], _]): Self = this.set("visitTSTypeParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSTypeParameter: Self = this.set("visitTSTypeParameter", js.undefined)
    
    @scala.inline
    def setVisitTSTypeParameterDeclaration(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeParameterDeclaration, _], _]
    ): Self = this.set("visitTSTypeParameterDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSTypeParameterDeclaration: Self = this.set("visitTSTypeParameterDeclaration", js.undefined)
    
    @scala.inline
    def setVisitTSTypeParameterInstantiation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeParameterInstantiation, _], _]
    ): Self = this.set("visitTSTypeParameterInstantiation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSTypeParameterInstantiation: Self = this.set("visitTSTypeParameterInstantiation", js.undefined)
    
    @scala.inline
    def setVisitTSTypePredicate(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypePredicate, _], _]): Self = this.set("visitTSTypePredicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSTypePredicate: Self = this.set("visitTSTypePredicate", js.undefined)
    
    @scala.inline
    def setVisitTSTypeQuery(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeQuery, _], _]): Self = this.set("visitTSTypeQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSTypeQuery: Self = this.set("visitTSTypeQuery", js.undefined)
    
    @scala.inline
    def setVisitTSTypeReference(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeReference, _], _]): Self = this.set("visitTSTypeReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSTypeReference: Self = this.set("visitTSTypeReference", js.undefined)
    
    @scala.inline
    def setVisitTSUndefinedKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSUndefinedKeyword, _], _]): Self = this.set("visitTSUndefinedKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSUndefinedKeyword: Self = this.set("visitTSUndefinedKeyword", js.undefined)
    
    @scala.inline
    def setVisitTSUnionType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSUnionType, _], _]): Self = this.set("visitTSUnionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSUnionType: Self = this.set("visitTSUnionType", js.undefined)
    
    @scala.inline
    def setVisitTSUnknownKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSUnknownKeyword, _], _]): Self = this.set("visitTSUnknownKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSUnknownKeyword: Self = this.set("visitTSUnknownKeyword", js.undefined)
    
    @scala.inline
    def setVisitTSVoidKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSVoidKeyword, _], _]): Self = this.set("visitTSVoidKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTSVoidKeyword: Self = this.set("visitTSVoidKeyword", js.undefined)
    
    @scala.inline
    def setVisitTaggedTemplateExpression(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TaggedTemplateExpression, _], _]
    ): Self = this.set("visitTaggedTemplateExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTaggedTemplateExpression: Self = this.set("visitTaggedTemplateExpression", js.undefined)
    
    @scala.inline
    def setVisitTemplateElement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TemplateElement, _], _]): Self = this.set("visitTemplateElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTemplateElement: Self = this.set("visitTemplateElement", js.undefined)
    
    @scala.inline
    def setVisitTemplateLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TemplateLiteral, _], _]): Self = this.set("visitTemplateLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTemplateLiteral: Self = this.set("visitTemplateLiteral", js.undefined)
    
    @scala.inline
    def setVisitThisExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ThisExpression, _], _]): Self = this.set("visitThisExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitThisExpression: Self = this.set("visitThisExpression", js.undefined)
    
    @scala.inline
    def setVisitThisTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ThisTypeAnnotation, _], _]): Self = this.set("visitThisTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitThisTypeAnnotation: Self = this.set("visitThisTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitThrowStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ThrowStatement, _], _]): Self = this.set("visitThrowStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitThrowStatement: Self = this.set("visitThrowStatement", js.undefined)
    
    @scala.inline
    def setVisitTryStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TryStatement, _], _]): Self = this.set("visitTryStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTryStatement: Self = this.set("visitTryStatement", js.undefined)
    
    @scala.inline
    def setVisitTupleTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TupleTypeAnnotation, _], _]): Self = this.set("visitTupleTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTupleTypeAnnotation: Self = this.set("visitTupleTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitTypeAlias(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeAlias, _], _]): Self = this.set("visitTypeAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTypeAlias: Self = this.set("visitTypeAlias", js.undefined)
    
    @scala.inline
    def setVisitTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeAnnotation, _], _]): Self = this.set("visitTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTypeAnnotation: Self = this.set("visitTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitTypeCastExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeCastExpression, _], _]): Self = this.set("visitTypeCastExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTypeCastExpression: Self = this.set("visitTypeCastExpression", js.undefined)
    
    @scala.inline
    def setVisitTypeParameter(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeParameter, _], _]): Self = this.set("visitTypeParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTypeParameter: Self = this.set("visitTypeParameter", js.undefined)
    
    @scala.inline
    def setVisitTypeParameterDeclaration(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeParameterDeclaration, _], _]
    ): Self = this.set("visitTypeParameterDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTypeParameterDeclaration: Self = this.set("visitTypeParameterDeclaration", js.undefined)
    
    @scala.inline
    def setVisitTypeParameterInstantiation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeParameterInstantiation, _], _]
    ): Self = this.set("visitTypeParameterInstantiation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTypeParameterInstantiation: Self = this.set("visitTypeParameterInstantiation", js.undefined)
    
    @scala.inline
    def setVisitTypeofTypeAnnotation(
      value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeofTypeAnnotation, _], _]
    ): Self = this.set("visitTypeofTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitTypeofTypeAnnotation: Self = this.set("visitTypeofTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitUnaryExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[UnaryExpression, _], _]): Self = this.set("visitUnaryExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitUnaryExpression: Self = this.set("visitUnaryExpression", js.undefined)
    
    @scala.inline
    def setVisitUnionTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[UnionTypeAnnotation, _], _]): Self = this.set("visitUnionTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitUnionTypeAnnotation: Self = this.set("visitUnionTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitUpdateExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[UpdateExpression, _], _]): Self = this.set("visitUpdateExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitUpdateExpression: Self = this.set("visitUpdateExpression", js.undefined)
    
    @scala.inline
    def setVisitVariableDeclaration(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[VariableDeclaration, _], _]): Self = this.set("visitVariableDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitVariableDeclaration: Self = this.set("visitVariableDeclaration", js.undefined)
    
    @scala.inline
    def setVisitVariableDeclarator(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[VariableDeclarator, _], _]): Self = this.set("visitVariableDeclarator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitVariableDeclarator: Self = this.set("visitVariableDeclarator", js.undefined)
    
    @scala.inline
    def setVisitVariance(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Variance, _], _]): Self = this.set("visitVariance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitVariance: Self = this.set("visitVariance", js.undefined)
    
    @scala.inline
    def setVisitVoidTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[VoidTypeAnnotation, _], _]): Self = this.set("visitVoidTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitVoidTypeAnnotation: Self = this.set("visitVoidTypeAnnotation", js.undefined)
    
    @scala.inline
    def setVisitWhileStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[WhileStatement, _], _]): Self = this.set("visitWhileStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitWhileStatement: Self = this.set("visitWhileStatement", js.undefined)
    
    @scala.inline
    def setVisitWithStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[WithStatement, _], _]): Self = this.set("visitWithStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitWithStatement: Self = this.set("visitWithStatement", js.undefined)
    
    @scala.inline
    def setVisitYieldExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[YieldExpression, _], _]): Self = this.set("visitYieldExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitYieldExpression: Self = this.set("visitYieldExpression", js.undefined)
  }
}
