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
import scala.scalajs.js.annotation._

trait Visitor[M] extends js.Object {
  var visitAnyTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AnyTypeAnnotation, _], _]
  ] = js.undefined
  var visitArrayExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrayExpression, _], _]
  ] = js.undefined
  var visitArrayPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrayPattern, _], _]
  ] = js.undefined
  var visitArrayTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrayTypeAnnotation, _], _]
  ] = js.undefined
  var visitArrowFunctionExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrowFunctionExpression, _], _]
  ] = js.undefined
  var visitAssignmentExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AssignmentExpression, _], _]
  ] = js.undefined
  var visitAssignmentPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AssignmentPattern, _], _]
  ] = js.undefined
  var visitAwaitExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AwaitExpression, _], _]
  ] = js.undefined
  var visitBigIntLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BigIntLiteral, _], _]
  ] = js.undefined
  var visitBinaryExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BinaryExpression, _], _]
  ] = js.undefined
  var visitBindExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BindExpression, _], _]
  ] = js.undefined
  var visitBlock: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Block, _], _]] = js.undefined
  var visitBlockStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BlockStatement, _], _]
  ] = js.undefined
  var visitBooleanLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BooleanLiteral, _], _]
  ] = js.undefined
  var visitBooleanLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BooleanLiteralTypeAnnotation, _], _]
  ] = js.undefined
  var visitBooleanTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BooleanTypeAnnotation, _], _]
  ] = js.undefined
  var visitBreakStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BreakStatement, _], _]
  ] = js.undefined
  var visitCallExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CallExpression, _], _]
  ] = js.undefined
  var visitCatchClause: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CatchClause, _], _]
  ] = js.undefined
  var visitClassBody: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassBody, _], _]
  ] = js.undefined
  var visitClassDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassDeclaration, _], _]
  ] = js.undefined
  var visitClassExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassExpression, _], _]
  ] = js.undefined
  var visitClassImplements: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassImplements, _], _]
  ] = js.undefined
  var visitClassMethod: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassMethod, _], _]
  ] = js.undefined
  var visitClassPrivateMethod: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassPrivateMethod, _], _]
  ] = js.undefined
  var visitClassPrivateProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassPrivateProperty, _], _]
  ] = js.undefined
  var visitClassProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassProperty, _], _]
  ] = js.undefined
  var visitClassPropertyDefinition: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassPropertyDefinition, _], _]
  ] = js.undefined
  var visitComment: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Comment, _], _]] = js.undefined
  var visitCommentBlock: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CommentBlock, _], _]
  ] = js.undefined
  var visitCommentLine: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CommentLine, _], _]
  ] = js.undefined
  var visitComprehensionBlock: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ComprehensionBlock, _], _]
  ] = js.undefined
  var visitComprehensionExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ComprehensionExpression, _], _]
  ] = js.undefined
  var visitConditionalExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ConditionalExpression, _], _]
  ] = js.undefined
  var visitContinueStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ContinueStatement, _], _]
  ] = js.undefined
  var visitDebuggerStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DebuggerStatement, _], _]
  ] = js.undefined
  var visitDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Declaration, _], _]
  ] = js.undefined
  var visitDeclareClass: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareClass, _], _]
  ] = js.undefined
  var visitDeclareExportAllDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareExportAllDeclaration, _], _]
  ] = js.undefined
  var visitDeclareExportDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareExportDeclaration, _], _]
  ] = js.undefined
  var visitDeclareFunction: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareFunction, _], _]
  ] = js.undefined
  var visitDeclareInterface: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareInterface, _], _]
  ] = js.undefined
  var visitDeclareModule: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareModule, _], _]
  ] = js.undefined
  var visitDeclareModuleExports: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareModuleExports, _], _]
  ] = js.undefined
  var visitDeclareOpaqueType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareOpaqueType, _], _]
  ] = js.undefined
  var visitDeclareTypeAlias: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareTypeAlias, _], _]
  ] = js.undefined
  var visitDeclareVariable: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareVariable, _], _]
  ] = js.undefined
  var visitDeclaredPredicate: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclaredPredicate, _], _]
  ] = js.undefined
  var visitDecorator: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Decorator, _], _]
  ] = js.undefined
  var visitDirective: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Directive, _], _]
  ] = js.undefined
  var visitDirectiveLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DirectiveLiteral, _], _]
  ] = js.undefined
  var visitDoExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DoExpression, _], _]
  ] = js.undefined
  var visitDoWhileStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DoWhileStatement, _], _]
  ] = js.undefined
  var visitEmptyStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EmptyStatement, _], _]
  ] = js.undefined
  var visitEmptyTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EmptyTypeAnnotation, _], _]
  ] = js.undefined
  var visitExistentialTypeParam: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExistentialTypeParam, _], _]
  ] = js.undefined
  var visitExistsTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExistsTypeAnnotation, _], _]
  ] = js.undefined
  var visitExportAllDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportAllDeclaration, _], _]
  ] = js.undefined
  var visitExportBatchSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportBatchSpecifier, _], _]
  ] = js.undefined
  var visitExportDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportDeclaration, _], _]
  ] = js.undefined
  var visitExportDefaultDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportDefaultDeclaration, _], _]
  ] = js.undefined
  var visitExportDefaultSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportDefaultSpecifier, _], _]
  ] = js.undefined
  var visitExportNamedDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportNamedDeclaration, _], _]
  ] = js.undefined
  var visitExportNamespaceSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportNamespaceSpecifier, _], _]
  ] = js.undefined
  var visitExportSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportSpecifier, _], _]
  ] = js.undefined
  var visitExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Expression, _], _]
  ] = js.undefined
  var visitExpressionStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExpressionStatement, _], _]
  ] = js.undefined
  var visitFile: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[File, _], _]] = js.undefined
  var visitFlow: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Flow, _], _]] = js.undefined
  var visitFlowPredicate: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FlowPredicate, _], _]
  ] = js.undefined
  var visitFlowType: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FlowType, _], _]] = js.undefined
  var visitForAwaitStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForAwaitStatement, _], _]
  ] = js.undefined
  var visitForInStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForInStatement, _], _]
  ] = js.undefined
  var visitForOfStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForOfStatement, _], _]
  ] = js.undefined
  var visitForStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForStatement, _], _]
  ] = js.undefined
  var visitFunction: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Function, _], _]] = js.undefined
  var visitFunctionDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionDeclaration, _], _]
  ] = js.undefined
  var visitFunctionExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionExpression, _], _]
  ] = js.undefined
  var visitFunctionTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionTypeAnnotation, _], _]
  ] = js.undefined
  var visitFunctionTypeParam: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionTypeParam, _], _]
  ] = js.undefined
  var visitGeneratorExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[GeneratorExpression, _], _]
  ] = js.undefined
  var visitGenericTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[GenericTypeAnnotation, _], _]
  ] = js.undefined
  var visitIdentifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Identifier, _], _]
  ] = js.undefined
  var visitIfStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[IfStatement, _], _]
  ] = js.undefined
  var visitImport: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Import, _], _]] = js.undefined
  var visitImportDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportDeclaration, _], _]
  ] = js.undefined
  var visitImportDefaultSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportDefaultSpecifier, _], _]
  ] = js.undefined
  var visitImportNamespaceSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportNamespaceSpecifier, _], _]
  ] = js.undefined
  var visitImportSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportSpecifier, _], _]
  ] = js.undefined
  var visitInferredPredicate: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InferredPredicate, _], _]
  ] = js.undefined
  var visitInterfaceDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterfaceDeclaration, _], _]
  ] = js.undefined
  var visitInterfaceExtends: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterfaceExtends, _], _]
  ] = js.undefined
  var visitInterfaceTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterfaceTypeAnnotation, _], _]
  ] = js.undefined
  var visitInterpreterDirective: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterpreterDirective, _], _]
  ] = js.undefined
  var visitIntersectionTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[IntersectionTypeAnnotation, _], _]
  ] = js.undefined
  var visitJSXAttribute: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXAttribute, _], _]
  ] = js.undefined
  var visitJSXClosingElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXClosingElement, _], _]
  ] = js.undefined
  var visitJSXClosingFragment: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXClosingFragment, _], _]
  ] = js.undefined
  var visitJSXElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXElement, _], _]
  ] = js.undefined
  var visitJSXEmptyExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXEmptyExpression, _], _]
  ] = js.undefined
  var visitJSXExpressionContainer: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXExpressionContainer, _], _]
  ] = js.undefined
  var visitJSXFragment: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXFragment, _], _]
  ] = js.undefined
  var visitJSXIdentifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXIdentifier, _], _]
  ] = js.undefined
  var visitJSXMemberExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXMemberExpression, _], _]
  ] = js.undefined
  var visitJSXNamespacedName: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXNamespacedName, _], _]
  ] = js.undefined
  var visitJSXOpeningElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXOpeningElement, _], _]
  ] = js.undefined
  var visitJSXOpeningFragment: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXOpeningFragment, _], _]
  ] = js.undefined
  var visitJSXSpreadAttribute: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXSpreadAttribute, _], _]
  ] = js.undefined
  var visitJSXSpreadChild: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXSpreadChild, _], _]
  ] = js.undefined
  var visitJSXText: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXText, _], _]] = js.undefined
  var visitLabeledStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[LabeledStatement, _], _]
  ] = js.undefined
  var visitLine: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Line, _], _]] = js.undefined
  var visitLiteral: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Literal, _], _]] = js.undefined
  var visitLogicalExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[LogicalExpression, _], _]
  ] = js.undefined
  var visitMemberExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MemberExpression, _], _]
  ] = js.undefined
  var visitMemberTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MemberTypeAnnotation, _], _]
  ] = js.undefined
  var visitMetaProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MetaProperty, _], _]
  ] = js.undefined
  var visitMethodDefinition: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MethodDefinition, _], _]
  ] = js.undefined
  var visitMixedTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MixedTypeAnnotation, _], _]
  ] = js.undefined
  var visitModuleSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ModuleSpecifier, _], _]
  ] = js.undefined
  var visitNewExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NewExpression, _], _]
  ] = js.undefined
  var visitNode: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Node, _], _]] = js.undefined
  var visitNoop: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Noop, _], _]] = js.undefined
  var visitNullLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullLiteral, _], _]
  ] = js.undefined
  var visitNullLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullLiteralTypeAnnotation, _], _]
  ] = js.undefined
  var visitNullTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullTypeAnnotation, _], _]
  ] = js.undefined
  var visitNullableTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullableTypeAnnotation, _], _]
  ] = js.undefined
  var visitNumberLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumberLiteralTypeAnnotation, _], _]
  ] = js.undefined
  var visitNumberTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumberTypeAnnotation, _], _]
  ] = js.undefined
  var visitNumericLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumericLiteral, _], _]
  ] = js.undefined
  var visitNumericLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumericLiteralTypeAnnotation, _], _]
  ] = js.undefined
  var visitObjectExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectExpression, _], _]
  ] = js.undefined
  var visitObjectMethod: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectMethod, _], _]
  ] = js.undefined
  var visitObjectPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectPattern, _], _]
  ] = js.undefined
  var visitObjectProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectProperty, _], _]
  ] = js.undefined
  var visitObjectTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeAnnotation, _], _]
  ] = js.undefined
  var visitObjectTypeCallProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeCallProperty, _], _]
  ] = js.undefined
  var visitObjectTypeIndexer: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeIndexer, _], _]
  ] = js.undefined
  var visitObjectTypeInternalSlot: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeInternalSlot, _], _]
  ] = js.undefined
  var visitObjectTypeProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeProperty, _], _]
  ] = js.undefined
  var visitObjectTypeSpreadProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeSpreadProperty, _], _]
  ] = js.undefined
  var visitOpaqueType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[OpaqueType, _], _]
  ] = js.undefined
  var visitOptionalCallExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[OptionalCallExpression, _], _]
  ] = js.undefined
  var visitOptionalMemberExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[OptionalMemberExpression, _], _]
  ] = js.undefined
  var visitParenthesizedExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ParenthesizedExpression, _], _]
  ] = js.undefined
  var visitPattern: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Pattern, _], _]] = js.undefined
  var visitPosition: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Position, _], _]] = js.undefined
  var visitPrintable: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Printable, _], _]
  ] = js.undefined
  var visitPrivateName: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[PrivateName, _], _]
  ] = js.undefined
  var visitProgram: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Program, _], _]] = js.undefined
  var visitProperty: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Property, _], _]] = js.undefined
  var visitPropertyPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[PropertyPattern, _], _]
  ] = js.undefined
  var visitQualifiedTypeIdentifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[QualifiedTypeIdentifier, _], _]
  ] = js.undefined
  var visitRegExpLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[RegExpLiteral, _], _]
  ] = js.undefined
  var visitRestElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[RestElement, _], _]
  ] = js.undefined
  var visitRestProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[RestProperty, _], _]
  ] = js.undefined
  var visitReturnStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ReturnStatement, _], _]
  ] = js.undefined
  var visitSequenceExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SequenceExpression, _], _]
  ] = js.undefined
  var visitSourceLocation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SourceLocation, _], _]
  ] = js.undefined
  var visitSpecifier: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Specifier, _], _]
  ] = js.undefined
  var visitSpreadElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadElement, _], _]
  ] = js.undefined
  var visitSpreadElementPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadElementPattern, _], _]
  ] = js.undefined
  var visitSpreadProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadProperty, _], _]
  ] = js.undefined
  var visitSpreadPropertyPattern: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadPropertyPattern, _], _]
  ] = js.undefined
  var visitStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Statement, _], _]
  ] = js.undefined
  var visitStringLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[StringLiteral, _], _]
  ] = js.undefined
  var visitStringLiteralTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[StringLiteralTypeAnnotation, _], _]
  ] = js.undefined
  var visitStringTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[StringTypeAnnotation, _], _]
  ] = js.undefined
  var visitSuper: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Super, _], _]] = js.undefined
  var visitSwitchCase: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SwitchCase, _], _]
  ] = js.undefined
  var visitSwitchStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SwitchStatement, _], _]
  ] = js.undefined
  var visitTSAnyKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSAnyKeyword, _], _]
  ] = js.undefined
  var visitTSArrayType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSArrayType, _], _]
  ] = js.undefined
  var visitTSAsExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSAsExpression, _], _]
  ] = js.undefined
  var visitTSBigIntKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSBigIntKeyword, _], _]
  ] = js.undefined
  var visitTSBooleanKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSBooleanKeyword, _], _]
  ] = js.undefined
  var visitTSCallSignatureDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSCallSignatureDeclaration, _], _]
  ] = js.undefined
  var visitTSConditionalType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSConditionalType, _], _]
  ] = js.undefined
  var visitTSConstructSignatureDeclaration: js.UndefOr[
    js.ThisFunction1[
      /* this */ Context with M, 
      /* path */ NodePath[TSConstructSignatureDeclaration, _], 
      _
    ]
  ] = js.undefined
  var visitTSConstructorType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSConstructorType, _], _]
  ] = js.undefined
  var visitTSDeclareFunction: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSDeclareFunction, _], _]
  ] = js.undefined
  var visitTSDeclareMethod: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSDeclareMethod, _], _]
  ] = js.undefined
  var visitTSEnumDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSEnumDeclaration, _], _]
  ] = js.undefined
  var visitTSEnumMember: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSEnumMember, _], _]
  ] = js.undefined
  var visitTSExportAssignment: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSExportAssignment, _], _]
  ] = js.undefined
  var visitTSExpressionWithTypeArguments: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSExpressionWithTypeArguments, _], _]
  ] = js.undefined
  var visitTSExternalModuleReference: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSExternalModuleReference, _], _]
  ] = js.undefined
  var visitTSFunctionType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSFunctionType, _], _]
  ] = js.undefined
  var visitTSHasOptionalTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSHasOptionalTypeAnnotation, _], _]
  ] = js.undefined
  var visitTSHasOptionalTypeParameterInstantiation: js.UndefOr[
    js.ThisFunction1[
      /* this */ Context with M, 
      /* path */ NodePath[TSHasOptionalTypeParameterInstantiation, _], 
      _
    ]
  ] = js.undefined
  var visitTSHasOptionalTypeParameters: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSHasOptionalTypeParameters, _], _]
  ] = js.undefined
  var visitTSImportEqualsDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSImportEqualsDeclaration, _], _]
  ] = js.undefined
  var visitTSImportType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSImportType, _], _]
  ] = js.undefined
  var visitTSIndexSignature: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSIndexSignature, _], _]
  ] = js.undefined
  var visitTSIndexedAccessType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSIndexedAccessType, _], _]
  ] = js.undefined
  var visitTSInferType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSInferType, _], _]
  ] = js.undefined
  var visitTSInterfaceBody: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSInterfaceBody, _], _]
  ] = js.undefined
  var visitTSInterfaceDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSInterfaceDeclaration, _], _]
  ] = js.undefined
  var visitTSIntersectionType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSIntersectionType, _], _]
  ] = js.undefined
  var visitTSLiteralType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSLiteralType, _], _]
  ] = js.undefined
  var visitTSMappedType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSMappedType, _], _]
  ] = js.undefined
  var visitTSMethodSignature: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSMethodSignature, _], _]
  ] = js.undefined
  var visitTSModuleBlock: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSModuleBlock, _], _]
  ] = js.undefined
  var visitTSModuleDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSModuleDeclaration, _], _]
  ] = js.undefined
  var visitTSNamespaceExportDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNamespaceExportDeclaration, _], _]
  ] = js.undefined
  var visitTSNeverKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNeverKeyword, _], _]
  ] = js.undefined
  var visitTSNonNullExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNonNullExpression, _], _]
  ] = js.undefined
  var visitTSNullKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNullKeyword, _], _]
  ] = js.undefined
  var visitTSNumberKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNumberKeyword, _], _]
  ] = js.undefined
  var visitTSObjectKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSObjectKeyword, _], _]
  ] = js.undefined
  var visitTSOptionalType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSOptionalType, _], _]
  ] = js.undefined
  var visitTSParameterProperty: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSParameterProperty, _], _]
  ] = js.undefined
  var visitTSParenthesizedType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSParenthesizedType, _], _]
  ] = js.undefined
  var visitTSPropertySignature: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSPropertySignature, _], _]
  ] = js.undefined
  var visitTSQualifiedName: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSQualifiedName, _], _]
  ] = js.undefined
  var visitTSRestType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSRestType, _], _]
  ] = js.undefined
  var visitTSStringKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSStringKeyword, _], _]
  ] = js.undefined
  var visitTSSymbolKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSSymbolKeyword, _], _]
  ] = js.undefined
  var visitTSThisType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSThisType, _], _]
  ] = js.undefined
  var visitTSTupleType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTupleType, _], _]
  ] = js.undefined
  var visitTSType: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSType, _], _]] = js.undefined
  var visitTSTypeAliasDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeAliasDeclaration, _], _]
  ] = js.undefined
  var visitTSTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeAnnotation, _], _]
  ] = js.undefined
  var visitTSTypeAssertion: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeAssertion, _], _]
  ] = js.undefined
  var visitTSTypeLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeLiteral, _], _]
  ] = js.undefined
  var visitTSTypeOperator: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeOperator, _], _]
  ] = js.undefined
  var visitTSTypeParameter: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeParameter, _], _]
  ] = js.undefined
  var visitTSTypeParameterDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeParameterDeclaration, _], _]
  ] = js.undefined
  var visitTSTypeParameterInstantiation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeParameterInstantiation, _], _]
  ] = js.undefined
  var visitTSTypePredicate: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypePredicate, _], _]
  ] = js.undefined
  var visitTSTypeQuery: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeQuery, _], _]
  ] = js.undefined
  var visitTSTypeReference: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeReference, _], _]
  ] = js.undefined
  var visitTSUndefinedKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSUndefinedKeyword, _], _]
  ] = js.undefined
  var visitTSUnionType: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSUnionType, _], _]
  ] = js.undefined
  var visitTSUnknownKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSUnknownKeyword, _], _]
  ] = js.undefined
  var visitTSVoidKeyword: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSVoidKeyword, _], _]
  ] = js.undefined
  var visitTaggedTemplateExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TaggedTemplateExpression, _], _]
  ] = js.undefined
  var visitTemplateElement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TemplateElement, _], _]
  ] = js.undefined
  var visitTemplateLiteral: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TemplateLiteral, _], _]
  ] = js.undefined
  var visitThisExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ThisExpression, _], _]
  ] = js.undefined
  var visitThisTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ThisTypeAnnotation, _], _]
  ] = js.undefined
  var visitThrowStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ThrowStatement, _], _]
  ] = js.undefined
  var visitTryStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TryStatement, _], _]
  ] = js.undefined
  var visitTupleTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TupleTypeAnnotation, _], _]
  ] = js.undefined
  var visitTypeAlias: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeAlias, _], _]
  ] = js.undefined
  var visitTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeAnnotation, _], _]
  ] = js.undefined
  var visitTypeCastExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeCastExpression, _], _]
  ] = js.undefined
  var visitTypeParameter: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeParameter, _], _]
  ] = js.undefined
  var visitTypeParameterDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeParameterDeclaration, _], _]
  ] = js.undefined
  var visitTypeParameterInstantiation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeParameterInstantiation, _], _]
  ] = js.undefined
  var visitTypeofTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeofTypeAnnotation, _], _]
  ] = js.undefined
  var visitUnaryExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[UnaryExpression, _], _]
  ] = js.undefined
  var visitUnionTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[UnionTypeAnnotation, _], _]
  ] = js.undefined
  var visitUpdateExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[UpdateExpression, _], _]
  ] = js.undefined
  var visitVariableDeclaration: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[VariableDeclaration, _], _]
  ] = js.undefined
  var visitVariableDeclarator: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[VariableDeclarator, _], _]
  ] = js.undefined
  var visitVariance: js.UndefOr[js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Variance, _], _]] = js.undefined
  var visitVoidTypeAnnotation: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[VoidTypeAnnotation, _], _]
  ] = js.undefined
  var visitWhileStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[WhileStatement, _], _]
  ] = js.undefined
  var visitWithStatement: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[WithStatement, _], _]
  ] = js.undefined
  var visitYieldExpression: js.UndefOr[
    js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[YieldExpression, _], _]
  ] = js.undefined
}

