package typings.astDashTypes.genVisitorMod

import typings.astDashTypes.genNamedTypesMod.namedTypes.AnyTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.ArrayExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.ArrayPattern
import typings.astDashTypes.genNamedTypesMod.namedTypes.ArrayTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.ArrowFunctionExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.AssignmentExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.AssignmentPattern
import typings.astDashTypes.genNamedTypesMod.namedTypes.AwaitExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.BigIntLiteral
import typings.astDashTypes.genNamedTypesMod.namedTypes.BinaryExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.BindExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.Block
import typings.astDashTypes.genNamedTypesMod.namedTypes.BlockStatement
import typings.astDashTypes.genNamedTypesMod.namedTypes.BooleanLiteral
import typings.astDashTypes.genNamedTypesMod.namedTypes.BooleanLiteralTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.BooleanTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.BreakStatement
import typings.astDashTypes.genNamedTypesMod.namedTypes.CallExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.CatchClause
import typings.astDashTypes.genNamedTypesMod.namedTypes.ClassBody
import typings.astDashTypes.genNamedTypesMod.namedTypes.ClassDeclaration
import typings.astDashTypes.genNamedTypesMod.namedTypes.ClassExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.ClassImplements
import typings.astDashTypes.genNamedTypesMod.namedTypes.ClassMethod
import typings.astDashTypes.genNamedTypesMod.namedTypes.ClassPrivateMethod
import typings.astDashTypes.genNamedTypesMod.namedTypes.ClassPrivateProperty
import typings.astDashTypes.genNamedTypesMod.namedTypes.ClassProperty
import typings.astDashTypes.genNamedTypesMod.namedTypes.ClassPropertyDefinition
import typings.astDashTypes.genNamedTypesMod.namedTypes.Comment
import typings.astDashTypes.genNamedTypesMod.namedTypes.CommentBlock
import typings.astDashTypes.genNamedTypesMod.namedTypes.CommentLine
import typings.astDashTypes.genNamedTypesMod.namedTypes.ComprehensionBlock
import typings.astDashTypes.genNamedTypesMod.namedTypes.ComprehensionExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.ConditionalExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.ContinueStatement
import typings.astDashTypes.genNamedTypesMod.namedTypes.DebuggerStatement
import typings.astDashTypes.genNamedTypesMod.namedTypes.Declaration
import typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareClass
import typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareExportAllDeclaration
import typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareExportDeclaration
import typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareFunction
import typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareInterface
import typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareModule
import typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareModuleExports
import typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareOpaqueType
import typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareTypeAlias
import typings.astDashTypes.genNamedTypesMod.namedTypes.DeclareVariable
import typings.astDashTypes.genNamedTypesMod.namedTypes.DeclaredPredicate
import typings.astDashTypes.genNamedTypesMod.namedTypes.Decorator
import typings.astDashTypes.genNamedTypesMod.namedTypes.Directive
import typings.astDashTypes.genNamedTypesMod.namedTypes.DirectiveLiteral
import typings.astDashTypes.genNamedTypesMod.namedTypes.DoExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.DoWhileStatement
import typings.astDashTypes.genNamedTypesMod.namedTypes.EmptyStatement
import typings.astDashTypes.genNamedTypesMod.namedTypes.EmptyTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.ExistentialTypeParam
import typings.astDashTypes.genNamedTypesMod.namedTypes.ExistsTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.ExportAllDeclaration
import typings.astDashTypes.genNamedTypesMod.namedTypes.ExportBatchSpecifier
import typings.astDashTypes.genNamedTypesMod.namedTypes.ExportDeclaration
import typings.astDashTypes.genNamedTypesMod.namedTypes.ExportDefaultDeclaration
import typings.astDashTypes.genNamedTypesMod.namedTypes.ExportDefaultSpecifier
import typings.astDashTypes.genNamedTypesMod.namedTypes.ExportNamedDeclaration
import typings.astDashTypes.genNamedTypesMod.namedTypes.ExportNamespaceSpecifier
import typings.astDashTypes.genNamedTypesMod.namedTypes.ExportSpecifier
import typings.astDashTypes.genNamedTypesMod.namedTypes.Expression
import typings.astDashTypes.genNamedTypesMod.namedTypes.ExpressionStatement
import typings.astDashTypes.genNamedTypesMod.namedTypes.File
import typings.astDashTypes.genNamedTypesMod.namedTypes.Flow
import typings.astDashTypes.genNamedTypesMod.namedTypes.FlowPredicate
import typings.astDashTypes.genNamedTypesMod.namedTypes.FlowType
import typings.astDashTypes.genNamedTypesMod.namedTypes.ForAwaitStatement
import typings.astDashTypes.genNamedTypesMod.namedTypes.ForInStatement
import typings.astDashTypes.genNamedTypesMod.namedTypes.ForOfStatement
import typings.astDashTypes.genNamedTypesMod.namedTypes.ForStatement
import typings.astDashTypes.genNamedTypesMod.namedTypes.Function
import typings.astDashTypes.genNamedTypesMod.namedTypes.FunctionDeclaration
import typings.astDashTypes.genNamedTypesMod.namedTypes.FunctionExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.FunctionTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.FunctionTypeParam
import typings.astDashTypes.genNamedTypesMod.namedTypes.GeneratorExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.GenericTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.Identifier
import typings.astDashTypes.genNamedTypesMod.namedTypes.IfStatement
import typings.astDashTypes.genNamedTypesMod.namedTypes.Import
import typings.astDashTypes.genNamedTypesMod.namedTypes.ImportDeclaration
import typings.astDashTypes.genNamedTypesMod.namedTypes.ImportDefaultSpecifier
import typings.astDashTypes.genNamedTypesMod.namedTypes.ImportNamespaceSpecifier
import typings.astDashTypes.genNamedTypesMod.namedTypes.ImportSpecifier
import typings.astDashTypes.genNamedTypesMod.namedTypes.InferredPredicate
import typings.astDashTypes.genNamedTypesMod.namedTypes.InterfaceDeclaration
import typings.astDashTypes.genNamedTypesMod.namedTypes.InterfaceExtends
import typings.astDashTypes.genNamedTypesMod.namedTypes.InterfaceTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.InterpreterDirective
import typings.astDashTypes.genNamedTypesMod.namedTypes.IntersectionTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.JSXAttribute
import typings.astDashTypes.genNamedTypesMod.namedTypes.JSXClosingElement
import typings.astDashTypes.genNamedTypesMod.namedTypes.JSXClosingFragment
import typings.astDashTypes.genNamedTypesMod.namedTypes.JSXElement
import typings.astDashTypes.genNamedTypesMod.namedTypes.JSXEmptyExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.JSXExpressionContainer
import typings.astDashTypes.genNamedTypesMod.namedTypes.JSXFragment
import typings.astDashTypes.genNamedTypesMod.namedTypes.JSXIdentifier
import typings.astDashTypes.genNamedTypesMod.namedTypes.JSXMemberExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.JSXNamespacedName
import typings.astDashTypes.genNamedTypesMod.namedTypes.JSXOpeningElement
import typings.astDashTypes.genNamedTypesMod.namedTypes.JSXOpeningFragment
import typings.astDashTypes.genNamedTypesMod.namedTypes.JSXSpreadAttribute
import typings.astDashTypes.genNamedTypesMod.namedTypes.JSXSpreadChild
import typings.astDashTypes.genNamedTypesMod.namedTypes.JSXText
import typings.astDashTypes.genNamedTypesMod.namedTypes.LabeledStatement
import typings.astDashTypes.genNamedTypesMod.namedTypes.Line
import typings.astDashTypes.genNamedTypesMod.namedTypes.Literal
import typings.astDashTypes.genNamedTypesMod.namedTypes.LogicalExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.MemberExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.MemberTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.MetaProperty
import typings.astDashTypes.genNamedTypesMod.namedTypes.MethodDefinition
import typings.astDashTypes.genNamedTypesMod.namedTypes.MixedTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.ModuleSpecifier
import typings.astDashTypes.genNamedTypesMod.namedTypes.NewExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.Node
import typings.astDashTypes.genNamedTypesMod.namedTypes.Noop
import typings.astDashTypes.genNamedTypesMod.namedTypes.NullLiteral
import typings.astDashTypes.genNamedTypesMod.namedTypes.NullLiteralTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.NullTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.NullableTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.NumberLiteralTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.NumberTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.NumericLiteral
import typings.astDashTypes.genNamedTypesMod.namedTypes.NumericLiteralTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectMethod
import typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectPattern
import typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectProperty
import typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeCallProperty
import typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeIndexer
import typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeInternalSlot
import typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeProperty
import typings.astDashTypes.genNamedTypesMod.namedTypes.ObjectTypeSpreadProperty
import typings.astDashTypes.genNamedTypesMod.namedTypes.OpaqueType
import typings.astDashTypes.genNamedTypesMod.namedTypes.OptionalCallExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.OptionalMemberExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.ParenthesizedExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.Pattern
import typings.astDashTypes.genNamedTypesMod.namedTypes.Position
import typings.astDashTypes.genNamedTypesMod.namedTypes.Printable
import typings.astDashTypes.genNamedTypesMod.namedTypes.PrivateName
import typings.astDashTypes.genNamedTypesMod.namedTypes.Program
import typings.astDashTypes.genNamedTypesMod.namedTypes.Property
import typings.astDashTypes.genNamedTypesMod.namedTypes.PropertyPattern
import typings.astDashTypes.genNamedTypesMod.namedTypes.QualifiedTypeIdentifier
import typings.astDashTypes.genNamedTypesMod.namedTypes.RegExpLiteral
import typings.astDashTypes.genNamedTypesMod.namedTypes.RestElement
import typings.astDashTypes.genNamedTypesMod.namedTypes.RestProperty
import typings.astDashTypes.genNamedTypesMod.namedTypes.ReturnStatement
import typings.astDashTypes.genNamedTypesMod.namedTypes.SequenceExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.SourceLocation
import typings.astDashTypes.genNamedTypesMod.namedTypes.Specifier
import typings.astDashTypes.genNamedTypesMod.namedTypes.SpreadElement
import typings.astDashTypes.genNamedTypesMod.namedTypes.SpreadElementPattern
import typings.astDashTypes.genNamedTypesMod.namedTypes.SpreadProperty
import typings.astDashTypes.genNamedTypesMod.namedTypes.SpreadPropertyPattern
import typings.astDashTypes.genNamedTypesMod.namedTypes.Statement
import typings.astDashTypes.genNamedTypesMod.namedTypes.StringLiteral
import typings.astDashTypes.genNamedTypesMod.namedTypes.StringLiteralTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.StringTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.Super
import typings.astDashTypes.genNamedTypesMod.namedTypes.SwitchCase
import typings.astDashTypes.genNamedTypesMod.namedTypes.SwitchStatement
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSAnyKeyword
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSArrayType
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSAsExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSBigIntKeyword
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSBooleanKeyword
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSCallSignatureDeclaration
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSConditionalType
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSConstructSignatureDeclaration
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSConstructorType
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSDeclareFunction
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSDeclareMethod
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSEnumDeclaration
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSEnumMember
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSExportAssignment
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSExpressionWithTypeArguments
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSExternalModuleReference
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSFunctionType
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSHasOptionalTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSHasOptionalTypeParameterInstantiation
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSHasOptionalTypeParameters
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSImportEqualsDeclaration
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSImportType
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSIndexSignature
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSIndexedAccessType
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSInferType
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSInterfaceBody
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSInterfaceDeclaration
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSIntersectionType
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSLiteralType
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSMappedType
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSMethodSignature
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSModuleBlock
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSModuleDeclaration
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSNamespaceExportDeclaration
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSNeverKeyword
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSNonNullExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSNullKeyword
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSNumberKeyword
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSObjectKeyword
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSOptionalType
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSParameterProperty
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSParenthesizedType
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSPropertySignature
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSQualifiedName
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSRestType
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSStringKeyword
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSSymbolKeyword
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSThisType
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSTupleType
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSType
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeAliasDeclaration
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeAssertion
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeLiteral
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeOperator
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeParameter
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeParameterDeclaration
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeParameterInstantiation
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypePredicate
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeQuery
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeReference
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSUndefinedKeyword
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSUnionType
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSUnknownKeyword
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSVoidKeyword
import typings.astDashTypes.genNamedTypesMod.namedTypes.TaggedTemplateExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.TemplateElement
import typings.astDashTypes.genNamedTypesMod.namedTypes.TemplateLiteral
import typings.astDashTypes.genNamedTypesMod.namedTypes.ThisExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.ThisTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.ThrowStatement
import typings.astDashTypes.genNamedTypesMod.namedTypes.TryStatement
import typings.astDashTypes.genNamedTypesMod.namedTypes.TupleTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.TypeAlias
import typings.astDashTypes.genNamedTypesMod.namedTypes.TypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.TypeCastExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.TypeParameter
import typings.astDashTypes.genNamedTypesMod.namedTypes.TypeParameterDeclaration
import typings.astDashTypes.genNamedTypesMod.namedTypes.TypeParameterInstantiation
import typings.astDashTypes.genNamedTypesMod.namedTypes.TypeofTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.UnaryExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.UnionTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.UpdateExpression
import typings.astDashTypes.genNamedTypesMod.namedTypes.VariableDeclaration
import typings.astDashTypes.genNamedTypesMod.namedTypes.VariableDeclarator
import typings.astDashTypes.genNamedTypesMod.namedTypes.Variance
import typings.astDashTypes.genNamedTypesMod.namedTypes.VoidTypeAnnotation
import typings.astDashTypes.genNamedTypesMod.namedTypes.WhileStatement
import typings.astDashTypes.genNamedTypesMod.namedTypes.WithStatement
import typings.astDashTypes.genNamedTypesMod.namedTypes.YieldExpression
import typings.astDashTypes.libNodeDashPathMod.NodePath
import typings.astDashTypes.libPathDashVisitorMod.Context
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

