package typings.astTypes

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visitorMod {
  
  @js.native
  trait Visitor[M] extends StObject {
    
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
    implicit class VisitorMutableBuilder[Self <: Visitor[_], M] (val x: Self with Visitor[M]) extends AnyVal {
      
      @scala.inline
      def setVisitAnyTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AnyTypeAnnotation, _], _]): Self = StObject.set(x, "visitAnyTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitAnyTypeAnnotationUndefined: Self = StObject.set(x, "visitAnyTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitArrayExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrayExpression, _], _]): Self = StObject.set(x, "visitArrayExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitArrayExpressionUndefined: Self = StObject.set(x, "visitArrayExpression", js.undefined)
      
      @scala.inline
      def setVisitArrayPattern(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrayPattern, _], _]): Self = StObject.set(x, "visitArrayPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitArrayPatternUndefined: Self = StObject.set(x, "visitArrayPattern", js.undefined)
      
      @scala.inline
      def setVisitArrayTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrayTypeAnnotation, _], _]): Self = StObject.set(x, "visitArrayTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitArrayTypeAnnotationUndefined: Self = StObject.set(x, "visitArrayTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitArrowFunctionExpression(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ArrowFunctionExpression, _], _]
      ): Self = StObject.set(x, "visitArrowFunctionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitArrowFunctionExpressionUndefined: Self = StObject.set(x, "visitArrowFunctionExpression", js.undefined)
      
      @scala.inline
      def setVisitAssignmentExpression(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AssignmentExpression, _], _]
      ): Self = StObject.set(x, "visitAssignmentExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitAssignmentExpressionUndefined: Self = StObject.set(x, "visitAssignmentExpression", js.undefined)
      
      @scala.inline
      def setVisitAssignmentPattern(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AssignmentPattern, _], _]): Self = StObject.set(x, "visitAssignmentPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitAssignmentPatternUndefined: Self = StObject.set(x, "visitAssignmentPattern", js.undefined)
      
      @scala.inline
      def setVisitAwaitExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[AwaitExpression, _], _]): Self = StObject.set(x, "visitAwaitExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitAwaitExpressionUndefined: Self = StObject.set(x, "visitAwaitExpression", js.undefined)
      
      @scala.inline
      def setVisitBigIntLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BigIntLiteral, _], _]): Self = StObject.set(x, "visitBigIntLiteral", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitBigIntLiteralTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BigIntLiteralTypeAnnotation, _], _]
      ): Self = StObject.set(x, "visitBigIntLiteralTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitBigIntLiteralTypeAnnotationUndefined: Self = StObject.set(x, "visitBigIntLiteralTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitBigIntLiteralUndefined: Self = StObject.set(x, "visitBigIntLiteral", js.undefined)
      
      @scala.inline
      def setVisitBigIntTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BigIntTypeAnnotation, _], _]
      ): Self = StObject.set(x, "visitBigIntTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitBigIntTypeAnnotationUndefined: Self = StObject.set(x, "visitBigIntTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitBinaryExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BinaryExpression, _], _]): Self = StObject.set(x, "visitBinaryExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitBinaryExpressionUndefined: Self = StObject.set(x, "visitBinaryExpression", js.undefined)
      
      @scala.inline
      def setVisitBindExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BindExpression, _], _]): Self = StObject.set(x, "visitBindExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitBindExpressionUndefined: Self = StObject.set(x, "visitBindExpression", js.undefined)
      
      @scala.inline
      def setVisitBlock(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Block, _], _]): Self = StObject.set(x, "visitBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitBlockStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BlockStatement, _], _]): Self = StObject.set(x, "visitBlockStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitBlockStatementUndefined: Self = StObject.set(x, "visitBlockStatement", js.undefined)
      
      @scala.inline
      def setVisitBlockUndefined: Self = StObject.set(x, "visitBlock", js.undefined)
      
      @scala.inline
      def setVisitBooleanLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BooleanLiteral, _], _]): Self = StObject.set(x, "visitBooleanLiteral", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitBooleanLiteralTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BooleanLiteralTypeAnnotation, _], _]
      ): Self = StObject.set(x, "visitBooleanLiteralTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitBooleanLiteralTypeAnnotationUndefined: Self = StObject.set(x, "visitBooleanLiteralTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitBooleanLiteralUndefined: Self = StObject.set(x, "visitBooleanLiteral", js.undefined)
      
      @scala.inline
      def setVisitBooleanTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BooleanTypeAnnotation, _], _]
      ): Self = StObject.set(x, "visitBooleanTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitBooleanTypeAnnotationUndefined: Self = StObject.set(x, "visitBooleanTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitBreakStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[BreakStatement, _], _]): Self = StObject.set(x, "visitBreakStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitBreakStatementUndefined: Self = StObject.set(x, "visitBreakStatement", js.undefined)
      
      @scala.inline
      def setVisitCallExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CallExpression, _], _]): Self = StObject.set(x, "visitCallExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitCallExpressionUndefined: Self = StObject.set(x, "visitCallExpression", js.undefined)
      
      @scala.inline
      def setVisitCatchClause(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CatchClause, _], _]): Self = StObject.set(x, "visitCatchClause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitCatchClauseUndefined: Self = StObject.set(x, "visitCatchClause", js.undefined)
      
      @scala.inline
      def setVisitChainElement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ChainElement, _], _]): Self = StObject.set(x, "visitChainElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitChainElementUndefined: Self = StObject.set(x, "visitChainElement", js.undefined)
      
      @scala.inline
      def setVisitChainExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ChainExpression, _], _]): Self = StObject.set(x, "visitChainExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitChainExpressionUndefined: Self = StObject.set(x, "visitChainExpression", js.undefined)
      
      @scala.inline
      def setVisitClassBody(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassBody, _], _]): Self = StObject.set(x, "visitClassBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitClassBodyUndefined: Self = StObject.set(x, "visitClassBody", js.undefined)
      
      @scala.inline
      def setVisitClassDeclaration(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassDeclaration, _], _]): Self = StObject.set(x, "visitClassDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitClassDeclarationUndefined: Self = StObject.set(x, "visitClassDeclaration", js.undefined)
      
      @scala.inline
      def setVisitClassExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassExpression, _], _]): Self = StObject.set(x, "visitClassExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitClassExpressionUndefined: Self = StObject.set(x, "visitClassExpression", js.undefined)
      
      @scala.inline
      def setVisitClassImplements(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassImplements, _], _]): Self = StObject.set(x, "visitClassImplements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitClassImplementsUndefined: Self = StObject.set(x, "visitClassImplements", js.undefined)
      
      @scala.inline
      def setVisitClassMethod(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassMethod, _], _]): Self = StObject.set(x, "visitClassMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitClassMethodUndefined: Self = StObject.set(x, "visitClassMethod", js.undefined)
      
      @scala.inline
      def setVisitClassPrivateMethod(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassPrivateMethod, _], _]): Self = StObject.set(x, "visitClassPrivateMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitClassPrivateMethodUndefined: Self = StObject.set(x, "visitClassPrivateMethod", js.undefined)
      
      @scala.inline
      def setVisitClassPrivateProperty(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassPrivateProperty, _], _]
      ): Self = StObject.set(x, "visitClassPrivateProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitClassPrivatePropertyUndefined: Self = StObject.set(x, "visitClassPrivateProperty", js.undefined)
      
      @scala.inline
      def setVisitClassProperty(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassProperty, _], _]): Self = StObject.set(x, "visitClassProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitClassPropertyDefinition(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ClassPropertyDefinition, _], _]
      ): Self = StObject.set(x, "visitClassPropertyDefinition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitClassPropertyDefinitionUndefined: Self = StObject.set(x, "visitClassPropertyDefinition", js.undefined)
      
      @scala.inline
      def setVisitClassPropertyUndefined: Self = StObject.set(x, "visitClassProperty", js.undefined)
      
      @scala.inline
      def setVisitComment(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Comment, _], _]): Self = StObject.set(x, "visitComment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitCommentBlock(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CommentBlock, _], _]): Self = StObject.set(x, "visitCommentBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitCommentBlockUndefined: Self = StObject.set(x, "visitCommentBlock", js.undefined)
      
      @scala.inline
      def setVisitCommentLine(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[CommentLine, _], _]): Self = StObject.set(x, "visitCommentLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitCommentLineUndefined: Self = StObject.set(x, "visitCommentLine", js.undefined)
      
      @scala.inline
      def setVisitCommentUndefined: Self = StObject.set(x, "visitComment", js.undefined)
      
      @scala.inline
      def setVisitComprehensionBlock(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ComprehensionBlock, _], _]): Self = StObject.set(x, "visitComprehensionBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitComprehensionBlockUndefined: Self = StObject.set(x, "visitComprehensionBlock", js.undefined)
      
      @scala.inline
      def setVisitComprehensionExpression(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ComprehensionExpression, _], _]
      ): Self = StObject.set(x, "visitComprehensionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitComprehensionExpressionUndefined: Self = StObject.set(x, "visitComprehensionExpression", js.undefined)
      
      @scala.inline
      def setVisitConditionalExpression(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ConditionalExpression, _], _]
      ): Self = StObject.set(x, "visitConditionalExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitConditionalExpressionUndefined: Self = StObject.set(x, "visitConditionalExpression", js.undefined)
      
      @scala.inline
      def setVisitContinueStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ContinueStatement, _], _]): Self = StObject.set(x, "visitContinueStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitContinueStatementUndefined: Self = StObject.set(x, "visitContinueStatement", js.undefined)
      
      @scala.inline
      def setVisitDebuggerStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DebuggerStatement, _], _]): Self = StObject.set(x, "visitDebuggerStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitDebuggerStatementUndefined: Self = StObject.set(x, "visitDebuggerStatement", js.undefined)
      
      @scala.inline
      def setVisitDeclaration(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Declaration, _], _]): Self = StObject.set(x, "visitDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitDeclarationUndefined: Self = StObject.set(x, "visitDeclaration", js.undefined)
      
      @scala.inline
      def setVisitDeclareClass(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareClass, _], _]): Self = StObject.set(x, "visitDeclareClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitDeclareClassUndefined: Self = StObject.set(x, "visitDeclareClass", js.undefined)
      
      @scala.inline
      def setVisitDeclareExportAllDeclaration(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareExportAllDeclaration, _], _]
      ): Self = StObject.set(x, "visitDeclareExportAllDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitDeclareExportAllDeclarationUndefined: Self = StObject.set(x, "visitDeclareExportAllDeclaration", js.undefined)
      
      @scala.inline
      def setVisitDeclareExportDeclaration(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareExportDeclaration, _], _]
      ): Self = StObject.set(x, "visitDeclareExportDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitDeclareExportDeclarationUndefined: Self = StObject.set(x, "visitDeclareExportDeclaration", js.undefined)
      
      @scala.inline
      def setVisitDeclareFunction(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareFunction, _], _]): Self = StObject.set(x, "visitDeclareFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitDeclareFunctionUndefined: Self = StObject.set(x, "visitDeclareFunction", js.undefined)
      
      @scala.inline
      def setVisitDeclareInterface(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareInterface, _], _]): Self = StObject.set(x, "visitDeclareInterface", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitDeclareInterfaceUndefined: Self = StObject.set(x, "visitDeclareInterface", js.undefined)
      
      @scala.inline
      def setVisitDeclareModule(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareModule, _], _]): Self = StObject.set(x, "visitDeclareModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitDeclareModuleExports(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareModuleExports, _], _]
      ): Self = StObject.set(x, "visitDeclareModuleExports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitDeclareModuleExportsUndefined: Self = StObject.set(x, "visitDeclareModuleExports", js.undefined)
      
      @scala.inline
      def setVisitDeclareModuleUndefined: Self = StObject.set(x, "visitDeclareModule", js.undefined)
      
      @scala.inline
      def setVisitDeclareOpaqueType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareOpaqueType, _], _]): Self = StObject.set(x, "visitDeclareOpaqueType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitDeclareOpaqueTypeUndefined: Self = StObject.set(x, "visitDeclareOpaqueType", js.undefined)
      
      @scala.inline
      def setVisitDeclareTypeAlias(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareTypeAlias, _], _]): Self = StObject.set(x, "visitDeclareTypeAlias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitDeclareTypeAliasUndefined: Self = StObject.set(x, "visitDeclareTypeAlias", js.undefined)
      
      @scala.inline
      def setVisitDeclareVariable(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclareVariable, _], _]): Self = StObject.set(x, "visitDeclareVariable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitDeclareVariableUndefined: Self = StObject.set(x, "visitDeclareVariable", js.undefined)
      
      @scala.inline
      def setVisitDeclaredPredicate(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DeclaredPredicate, _], _]): Self = StObject.set(x, "visitDeclaredPredicate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitDeclaredPredicateUndefined: Self = StObject.set(x, "visitDeclaredPredicate", js.undefined)
      
      @scala.inline
      def setVisitDecorator(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Decorator, _], _]): Self = StObject.set(x, "visitDecorator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitDecoratorUndefined: Self = StObject.set(x, "visitDecorator", js.undefined)
      
      @scala.inline
      def setVisitDirective(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Directive, _], _]): Self = StObject.set(x, "visitDirective", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitDirectiveLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DirectiveLiteral, _], _]): Self = StObject.set(x, "visitDirectiveLiteral", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitDirectiveLiteralUndefined: Self = StObject.set(x, "visitDirectiveLiteral", js.undefined)
      
      @scala.inline
      def setVisitDirectiveUndefined: Self = StObject.set(x, "visitDirective", js.undefined)
      
      @scala.inline
      def setVisitDoExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DoExpression, _], _]): Self = StObject.set(x, "visitDoExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitDoExpressionUndefined: Self = StObject.set(x, "visitDoExpression", js.undefined)
      
      @scala.inline
      def setVisitDoWhileStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[DoWhileStatement, _], _]): Self = StObject.set(x, "visitDoWhileStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitDoWhileStatementUndefined: Self = StObject.set(x, "visitDoWhileStatement", js.undefined)
      
      @scala.inline
      def setVisitEmptyStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EmptyStatement, _], _]): Self = StObject.set(x, "visitEmptyStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitEmptyStatementUndefined: Self = StObject.set(x, "visitEmptyStatement", js.undefined)
      
      @scala.inline
      def setVisitEmptyTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EmptyTypeAnnotation, _], _]): Self = StObject.set(x, "visitEmptyTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitEmptyTypeAnnotationUndefined: Self = StObject.set(x, "visitEmptyTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitEnumBooleanBody(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumBooleanBody, _], _]): Self = StObject.set(x, "visitEnumBooleanBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitEnumBooleanBodyUndefined: Self = StObject.set(x, "visitEnumBooleanBody", js.undefined)
      
      @scala.inline
      def setVisitEnumBooleanMember(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumBooleanMember, _], _]): Self = StObject.set(x, "visitEnumBooleanMember", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitEnumBooleanMemberUndefined: Self = StObject.set(x, "visitEnumBooleanMember", js.undefined)
      
      @scala.inline
      def setVisitEnumDeclaration(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumDeclaration, _], _]): Self = StObject.set(x, "visitEnumDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitEnumDeclarationUndefined: Self = StObject.set(x, "visitEnumDeclaration", js.undefined)
      
      @scala.inline
      def setVisitEnumDefaultedMember(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumDefaultedMember, _], _]): Self = StObject.set(x, "visitEnumDefaultedMember", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitEnumDefaultedMemberUndefined: Self = StObject.set(x, "visitEnumDefaultedMember", js.undefined)
      
      @scala.inline
      def setVisitEnumNumberBody(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumNumberBody, _], _]): Self = StObject.set(x, "visitEnumNumberBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitEnumNumberBodyUndefined: Self = StObject.set(x, "visitEnumNumberBody", js.undefined)
      
      @scala.inline
      def setVisitEnumNumberMember(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumNumberMember, _], _]): Self = StObject.set(x, "visitEnumNumberMember", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitEnumNumberMemberUndefined: Self = StObject.set(x, "visitEnumNumberMember", js.undefined)
      
      @scala.inline
      def setVisitEnumStringBody(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumStringBody, _], _]): Self = StObject.set(x, "visitEnumStringBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitEnumStringBodyUndefined: Self = StObject.set(x, "visitEnumStringBody", js.undefined)
      
      @scala.inline
      def setVisitEnumStringMember(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumStringMember, _], _]): Self = StObject.set(x, "visitEnumStringMember", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitEnumStringMemberUndefined: Self = StObject.set(x, "visitEnumStringMember", js.undefined)
      
      @scala.inline
      def setVisitEnumSymbolBody(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[EnumSymbolBody, _], _]): Self = StObject.set(x, "visitEnumSymbolBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitEnumSymbolBodyUndefined: Self = StObject.set(x, "visitEnumSymbolBody", js.undefined)
      
      @scala.inline
      def setVisitExistentialTypeParam(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExistentialTypeParam, _], _]
      ): Self = StObject.set(x, "visitExistentialTypeParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitExistentialTypeParamUndefined: Self = StObject.set(x, "visitExistentialTypeParam", js.undefined)
      
      @scala.inline
      def setVisitExistsTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExistsTypeAnnotation, _], _]
      ): Self = StObject.set(x, "visitExistsTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitExistsTypeAnnotationUndefined: Self = StObject.set(x, "visitExistsTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitExportAllDeclaration(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportAllDeclaration, _], _]
      ): Self = StObject.set(x, "visitExportAllDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitExportAllDeclarationUndefined: Self = StObject.set(x, "visitExportAllDeclaration", js.undefined)
      
      @scala.inline
      def setVisitExportBatchSpecifier(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportBatchSpecifier, _], _]
      ): Self = StObject.set(x, "visitExportBatchSpecifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitExportBatchSpecifierUndefined: Self = StObject.set(x, "visitExportBatchSpecifier", js.undefined)
      
      @scala.inline
      def setVisitExportDeclaration(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportDeclaration, _], _]): Self = StObject.set(x, "visitExportDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitExportDeclarationUndefined: Self = StObject.set(x, "visitExportDeclaration", js.undefined)
      
      @scala.inline
      def setVisitExportDefaultDeclaration(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportDefaultDeclaration, _], _]
      ): Self = StObject.set(x, "visitExportDefaultDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitExportDefaultDeclarationUndefined: Self = StObject.set(x, "visitExportDefaultDeclaration", js.undefined)
      
      @scala.inline
      def setVisitExportDefaultSpecifier(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportDefaultSpecifier, _], _]
      ): Self = StObject.set(x, "visitExportDefaultSpecifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitExportDefaultSpecifierUndefined: Self = StObject.set(x, "visitExportDefaultSpecifier", js.undefined)
      
      @scala.inline
      def setVisitExportNamedDeclaration(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportNamedDeclaration, _], _]
      ): Self = StObject.set(x, "visitExportNamedDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitExportNamedDeclarationUndefined: Self = StObject.set(x, "visitExportNamedDeclaration", js.undefined)
      
      @scala.inline
      def setVisitExportNamespaceSpecifier(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportNamespaceSpecifier, _], _]
      ): Self = StObject.set(x, "visitExportNamespaceSpecifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitExportNamespaceSpecifierUndefined: Self = StObject.set(x, "visitExportNamespaceSpecifier", js.undefined)
      
      @scala.inline
      def setVisitExportSpecifier(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExportSpecifier, _], _]): Self = StObject.set(x, "visitExportSpecifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitExportSpecifierUndefined: Self = StObject.set(x, "visitExportSpecifier", js.undefined)
      
      @scala.inline
      def setVisitExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Expression, _], _]): Self = StObject.set(x, "visitExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitExpressionStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ExpressionStatement, _], _]): Self = StObject.set(x, "visitExpressionStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitExpressionStatementUndefined: Self = StObject.set(x, "visitExpressionStatement", js.undefined)
      
      @scala.inline
      def setVisitExpressionUndefined: Self = StObject.set(x, "visitExpression", js.undefined)
      
      @scala.inline
      def setVisitFile(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[File, _], _]): Self = StObject.set(x, "visitFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitFileUndefined: Self = StObject.set(x, "visitFile", js.undefined)
      
      @scala.inline
      def setVisitFlow(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Flow, _], _]): Self = StObject.set(x, "visitFlow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitFlowPredicate(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FlowPredicate, _], _]): Self = StObject.set(x, "visitFlowPredicate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitFlowPredicateUndefined: Self = StObject.set(x, "visitFlowPredicate", js.undefined)
      
      @scala.inline
      def setVisitFlowType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FlowType, _], _]): Self = StObject.set(x, "visitFlowType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitFlowTypeUndefined: Self = StObject.set(x, "visitFlowType", js.undefined)
      
      @scala.inline
      def setVisitFlowUndefined: Self = StObject.set(x, "visitFlow", js.undefined)
      
      @scala.inline
      def setVisitForAwaitStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForAwaitStatement, _], _]): Self = StObject.set(x, "visitForAwaitStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitForAwaitStatementUndefined: Self = StObject.set(x, "visitForAwaitStatement", js.undefined)
      
      @scala.inline
      def setVisitForInStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForInStatement, _], _]): Self = StObject.set(x, "visitForInStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitForInStatementUndefined: Self = StObject.set(x, "visitForInStatement", js.undefined)
      
      @scala.inline
      def setVisitForOfStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForOfStatement, _], _]): Self = StObject.set(x, "visitForOfStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitForOfStatementUndefined: Self = StObject.set(x, "visitForOfStatement", js.undefined)
      
      @scala.inline
      def setVisitForStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ForStatement, _], _]): Self = StObject.set(x, "visitForStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitForStatementUndefined: Self = StObject.set(x, "visitForStatement", js.undefined)
      
      @scala.inline
      def setVisitFunction(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Function, _], _]): Self = StObject.set(x, "visitFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitFunctionDeclaration(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionDeclaration, _], _]): Self = StObject.set(x, "visitFunctionDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitFunctionDeclarationUndefined: Self = StObject.set(x, "visitFunctionDeclaration", js.undefined)
      
      @scala.inline
      def setVisitFunctionExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionExpression, _], _]): Self = StObject.set(x, "visitFunctionExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitFunctionExpressionUndefined: Self = StObject.set(x, "visitFunctionExpression", js.undefined)
      
      @scala.inline
      def setVisitFunctionTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionTypeAnnotation, _], _]
      ): Self = StObject.set(x, "visitFunctionTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitFunctionTypeAnnotationUndefined: Self = StObject.set(x, "visitFunctionTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitFunctionTypeParam(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[FunctionTypeParam, _], _]): Self = StObject.set(x, "visitFunctionTypeParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitFunctionTypeParamUndefined: Self = StObject.set(x, "visitFunctionTypeParam", js.undefined)
      
      @scala.inline
      def setVisitFunctionUndefined: Self = StObject.set(x, "visitFunction", js.undefined)
      
      @scala.inline
      def setVisitGeneratorExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[GeneratorExpression, _], _]): Self = StObject.set(x, "visitGeneratorExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitGeneratorExpressionUndefined: Self = StObject.set(x, "visitGeneratorExpression", js.undefined)
      
      @scala.inline
      def setVisitGenericTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[GenericTypeAnnotation, _], _]
      ): Self = StObject.set(x, "visitGenericTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitGenericTypeAnnotationUndefined: Self = StObject.set(x, "visitGenericTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitIdentifier(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Identifier, _], _]): Self = StObject.set(x, "visitIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitIdentifierUndefined: Self = StObject.set(x, "visitIdentifier", js.undefined)
      
      @scala.inline
      def setVisitIfStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[IfStatement, _], _]): Self = StObject.set(x, "visitIfStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitIfStatementUndefined: Self = StObject.set(x, "visitIfStatement", js.undefined)
      
      @scala.inline
      def setVisitImport(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Import, _], _]): Self = StObject.set(x, "visitImport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitImportDeclaration(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportDeclaration, _], _]): Self = StObject.set(x, "visitImportDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitImportDeclarationUndefined: Self = StObject.set(x, "visitImportDeclaration", js.undefined)
      
      @scala.inline
      def setVisitImportDefaultSpecifier(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportDefaultSpecifier, _], _]
      ): Self = StObject.set(x, "visitImportDefaultSpecifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitImportDefaultSpecifierUndefined: Self = StObject.set(x, "visitImportDefaultSpecifier", js.undefined)
      
      @scala.inline
      def setVisitImportExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportExpression, _], _]): Self = StObject.set(x, "visitImportExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitImportExpressionUndefined: Self = StObject.set(x, "visitImportExpression", js.undefined)
      
      @scala.inline
      def setVisitImportNamespaceSpecifier(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportNamespaceSpecifier, _], _]
      ): Self = StObject.set(x, "visitImportNamespaceSpecifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitImportNamespaceSpecifierUndefined: Self = StObject.set(x, "visitImportNamespaceSpecifier", js.undefined)
      
      @scala.inline
      def setVisitImportSpecifier(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ImportSpecifier, _], _]): Self = StObject.set(x, "visitImportSpecifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitImportSpecifierUndefined: Self = StObject.set(x, "visitImportSpecifier", js.undefined)
      
      @scala.inline
      def setVisitImportUndefined: Self = StObject.set(x, "visitImport", js.undefined)
      
      @scala.inline
      def setVisitInferredPredicate(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InferredPredicate, _], _]): Self = StObject.set(x, "visitInferredPredicate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitInferredPredicateUndefined: Self = StObject.set(x, "visitInferredPredicate", js.undefined)
      
      @scala.inline
      def setVisitInterfaceDeclaration(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterfaceDeclaration, _], _]
      ): Self = StObject.set(x, "visitInterfaceDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitInterfaceDeclarationUndefined: Self = StObject.set(x, "visitInterfaceDeclaration", js.undefined)
      
      @scala.inline
      def setVisitInterfaceExtends(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterfaceExtends, _], _]): Self = StObject.set(x, "visitInterfaceExtends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitInterfaceExtendsUndefined: Self = StObject.set(x, "visitInterfaceExtends", js.undefined)
      
      @scala.inline
      def setVisitInterfaceTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterfaceTypeAnnotation, _], _]
      ): Self = StObject.set(x, "visitInterfaceTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitInterfaceTypeAnnotationUndefined: Self = StObject.set(x, "visitInterfaceTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitInterpreterDirective(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[InterpreterDirective, _], _]
      ): Self = StObject.set(x, "visitInterpreterDirective", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitInterpreterDirectiveUndefined: Self = StObject.set(x, "visitInterpreterDirective", js.undefined)
      
      @scala.inline
      def setVisitIntersectionTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[IntersectionTypeAnnotation, _], _]
      ): Self = StObject.set(x, "visitIntersectionTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitIntersectionTypeAnnotationUndefined: Self = StObject.set(x, "visitIntersectionTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitJSXAttribute(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXAttribute, _], _]): Self = StObject.set(x, "visitJSXAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitJSXAttributeUndefined: Self = StObject.set(x, "visitJSXAttribute", js.undefined)
      
      @scala.inline
      def setVisitJSXClosingElement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXClosingElement, _], _]): Self = StObject.set(x, "visitJSXClosingElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitJSXClosingElementUndefined: Self = StObject.set(x, "visitJSXClosingElement", js.undefined)
      
      @scala.inline
      def setVisitJSXClosingFragment(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXClosingFragment, _], _]): Self = StObject.set(x, "visitJSXClosingFragment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitJSXClosingFragmentUndefined: Self = StObject.set(x, "visitJSXClosingFragment", js.undefined)
      
      @scala.inline
      def setVisitJSXElement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXElement, _], _]): Self = StObject.set(x, "visitJSXElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitJSXElementUndefined: Self = StObject.set(x, "visitJSXElement", js.undefined)
      
      @scala.inline
      def setVisitJSXEmptyExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXEmptyExpression, _], _]): Self = StObject.set(x, "visitJSXEmptyExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitJSXEmptyExpressionUndefined: Self = StObject.set(x, "visitJSXEmptyExpression", js.undefined)
      
      @scala.inline
      def setVisitJSXExpressionContainer(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXExpressionContainer, _], _]
      ): Self = StObject.set(x, "visitJSXExpressionContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitJSXExpressionContainerUndefined: Self = StObject.set(x, "visitJSXExpressionContainer", js.undefined)
      
      @scala.inline
      def setVisitJSXFragment(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXFragment, _], _]): Self = StObject.set(x, "visitJSXFragment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitJSXFragmentUndefined: Self = StObject.set(x, "visitJSXFragment", js.undefined)
      
      @scala.inline
      def setVisitJSXIdentifier(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXIdentifier, _], _]): Self = StObject.set(x, "visitJSXIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitJSXIdentifierUndefined: Self = StObject.set(x, "visitJSXIdentifier", js.undefined)
      
      @scala.inline
      def setVisitJSXMemberExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXMemberExpression, _], _]): Self = StObject.set(x, "visitJSXMemberExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitJSXMemberExpressionUndefined: Self = StObject.set(x, "visitJSXMemberExpression", js.undefined)
      
      @scala.inline
      def setVisitJSXNamespacedName(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXNamespacedName, _], _]): Self = StObject.set(x, "visitJSXNamespacedName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitJSXNamespacedNameUndefined: Self = StObject.set(x, "visitJSXNamespacedName", js.undefined)
      
      @scala.inline
      def setVisitJSXOpeningElement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXOpeningElement, _], _]): Self = StObject.set(x, "visitJSXOpeningElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitJSXOpeningElementUndefined: Self = StObject.set(x, "visitJSXOpeningElement", js.undefined)
      
      @scala.inline
      def setVisitJSXOpeningFragment(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXOpeningFragment, _], _]): Self = StObject.set(x, "visitJSXOpeningFragment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitJSXOpeningFragmentUndefined: Self = StObject.set(x, "visitJSXOpeningFragment", js.undefined)
      
      @scala.inline
      def setVisitJSXSpreadAttribute(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXSpreadAttribute, _], _]): Self = StObject.set(x, "visitJSXSpreadAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitJSXSpreadAttributeUndefined: Self = StObject.set(x, "visitJSXSpreadAttribute", js.undefined)
      
      @scala.inline
      def setVisitJSXSpreadChild(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXSpreadChild, _], _]): Self = StObject.set(x, "visitJSXSpreadChild", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitJSXSpreadChildUndefined: Self = StObject.set(x, "visitJSXSpreadChild", js.undefined)
      
      @scala.inline
      def setVisitJSXText(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[JSXText, _], _]): Self = StObject.set(x, "visitJSXText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitJSXTextUndefined: Self = StObject.set(x, "visitJSXText", js.undefined)
      
      @scala.inline
      def setVisitLabeledStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[LabeledStatement, _], _]): Self = StObject.set(x, "visitLabeledStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitLabeledStatementUndefined: Self = StObject.set(x, "visitLabeledStatement", js.undefined)
      
      @scala.inline
      def setVisitLine(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Line, _], _]): Self = StObject.set(x, "visitLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitLineUndefined: Self = StObject.set(x, "visitLine", js.undefined)
      
      @scala.inline
      def setVisitLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Literal, _], _]): Self = StObject.set(x, "visitLiteral", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitLiteralUndefined: Self = StObject.set(x, "visitLiteral", js.undefined)
      
      @scala.inline
      def setVisitLogicalExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[LogicalExpression, _], _]): Self = StObject.set(x, "visitLogicalExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitLogicalExpressionUndefined: Self = StObject.set(x, "visitLogicalExpression", js.undefined)
      
      @scala.inline
      def setVisitMemberExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MemberExpression, _], _]): Self = StObject.set(x, "visitMemberExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitMemberExpressionUndefined: Self = StObject.set(x, "visitMemberExpression", js.undefined)
      
      @scala.inline
      def setVisitMemberTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MemberTypeAnnotation, _], _]
      ): Self = StObject.set(x, "visitMemberTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitMemberTypeAnnotationUndefined: Self = StObject.set(x, "visitMemberTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitMetaProperty(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MetaProperty, _], _]): Self = StObject.set(x, "visitMetaProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitMetaPropertyUndefined: Self = StObject.set(x, "visitMetaProperty", js.undefined)
      
      @scala.inline
      def setVisitMethodDefinition(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MethodDefinition, _], _]): Self = StObject.set(x, "visitMethodDefinition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitMethodDefinitionUndefined: Self = StObject.set(x, "visitMethodDefinition", js.undefined)
      
      @scala.inline
      def setVisitMixedTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[MixedTypeAnnotation, _], _]): Self = StObject.set(x, "visitMixedTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitMixedTypeAnnotationUndefined: Self = StObject.set(x, "visitMixedTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitModuleSpecifier(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ModuleSpecifier, _], _]): Self = StObject.set(x, "visitModuleSpecifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitModuleSpecifierUndefined: Self = StObject.set(x, "visitModuleSpecifier", js.undefined)
      
      @scala.inline
      def setVisitNewExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NewExpression, _], _]): Self = StObject.set(x, "visitNewExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitNewExpressionUndefined: Self = StObject.set(x, "visitNewExpression", js.undefined)
      
      @scala.inline
      def setVisitNode(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Node, _], _]): Self = StObject.set(x, "visitNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitNodeUndefined: Self = StObject.set(x, "visitNode", js.undefined)
      
      @scala.inline
      def setVisitNoop(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Noop, _], _]): Self = StObject.set(x, "visitNoop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitNoopUndefined: Self = StObject.set(x, "visitNoop", js.undefined)
      
      @scala.inline
      def setVisitNullLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullLiteral, _], _]): Self = StObject.set(x, "visitNullLiteral", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitNullLiteralTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullLiteralTypeAnnotation, _], _]
      ): Self = StObject.set(x, "visitNullLiteralTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitNullLiteralTypeAnnotationUndefined: Self = StObject.set(x, "visitNullLiteralTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitNullLiteralUndefined: Self = StObject.set(x, "visitNullLiteral", js.undefined)
      
      @scala.inline
      def setVisitNullTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullTypeAnnotation, _], _]): Self = StObject.set(x, "visitNullTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitNullTypeAnnotationUndefined: Self = StObject.set(x, "visitNullTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitNullableTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NullableTypeAnnotation, _], _]
      ): Self = StObject.set(x, "visitNullableTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitNullableTypeAnnotationUndefined: Self = StObject.set(x, "visitNullableTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitNumberLiteralTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumberLiteralTypeAnnotation, _], _]
      ): Self = StObject.set(x, "visitNumberLiteralTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitNumberLiteralTypeAnnotationUndefined: Self = StObject.set(x, "visitNumberLiteralTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitNumberTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumberTypeAnnotation, _], _]
      ): Self = StObject.set(x, "visitNumberTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitNumberTypeAnnotationUndefined: Self = StObject.set(x, "visitNumberTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitNumericLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumericLiteral, _], _]): Self = StObject.set(x, "visitNumericLiteral", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitNumericLiteralTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[NumericLiteralTypeAnnotation, _], _]
      ): Self = StObject.set(x, "visitNumericLiteralTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitNumericLiteralTypeAnnotationUndefined: Self = StObject.set(x, "visitNumericLiteralTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitNumericLiteralUndefined: Self = StObject.set(x, "visitNumericLiteral", js.undefined)
      
      @scala.inline
      def setVisitObjectExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectExpression, _], _]): Self = StObject.set(x, "visitObjectExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitObjectExpressionUndefined: Self = StObject.set(x, "visitObjectExpression", js.undefined)
      
      @scala.inline
      def setVisitObjectMethod(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectMethod, _], _]): Self = StObject.set(x, "visitObjectMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitObjectMethodUndefined: Self = StObject.set(x, "visitObjectMethod", js.undefined)
      
      @scala.inline
      def setVisitObjectPattern(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectPattern, _], _]): Self = StObject.set(x, "visitObjectPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitObjectPatternUndefined: Self = StObject.set(x, "visitObjectPattern", js.undefined)
      
      @scala.inline
      def setVisitObjectProperty(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectProperty, _], _]): Self = StObject.set(x, "visitObjectProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitObjectPropertyUndefined: Self = StObject.set(x, "visitObjectProperty", js.undefined)
      
      @scala.inline
      def setVisitObjectTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeAnnotation, _], _]
      ): Self = StObject.set(x, "visitObjectTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitObjectTypeAnnotationUndefined: Self = StObject.set(x, "visitObjectTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitObjectTypeCallProperty(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeCallProperty, _], _]
      ): Self = StObject.set(x, "visitObjectTypeCallProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitObjectTypeCallPropertyUndefined: Self = StObject.set(x, "visitObjectTypeCallProperty", js.undefined)
      
      @scala.inline
      def setVisitObjectTypeIndexer(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeIndexer, _], _]): Self = StObject.set(x, "visitObjectTypeIndexer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitObjectTypeIndexerUndefined: Self = StObject.set(x, "visitObjectTypeIndexer", js.undefined)
      
      @scala.inline
      def setVisitObjectTypeInternalSlot(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeInternalSlot, _], _]
      ): Self = StObject.set(x, "visitObjectTypeInternalSlot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitObjectTypeInternalSlotUndefined: Self = StObject.set(x, "visitObjectTypeInternalSlot", js.undefined)
      
      @scala.inline
      def setVisitObjectTypeProperty(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeProperty, _], _]): Self = StObject.set(x, "visitObjectTypeProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitObjectTypePropertyUndefined: Self = StObject.set(x, "visitObjectTypeProperty", js.undefined)
      
      @scala.inline
      def setVisitObjectTypeSpreadProperty(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ObjectTypeSpreadProperty, _], _]
      ): Self = StObject.set(x, "visitObjectTypeSpreadProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitObjectTypeSpreadPropertyUndefined: Self = StObject.set(x, "visitObjectTypeSpreadProperty", js.undefined)
      
      @scala.inline
      def setVisitOpaqueType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[OpaqueType, _], _]): Self = StObject.set(x, "visitOpaqueType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitOpaqueTypeUndefined: Self = StObject.set(x, "visitOpaqueType", js.undefined)
      
      @scala.inline
      def setVisitOptionalCallExpression(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[OptionalCallExpression, _], _]
      ): Self = StObject.set(x, "visitOptionalCallExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitOptionalCallExpressionUndefined: Self = StObject.set(x, "visitOptionalCallExpression", js.undefined)
      
      @scala.inline
      def setVisitOptionalMemberExpression(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[OptionalMemberExpression, _], _]
      ): Self = StObject.set(x, "visitOptionalMemberExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitOptionalMemberExpressionUndefined: Self = StObject.set(x, "visitOptionalMemberExpression", js.undefined)
      
      @scala.inline
      def setVisitParenthesizedExpression(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ParenthesizedExpression, _], _]
      ): Self = StObject.set(x, "visitParenthesizedExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitParenthesizedExpressionUndefined: Self = StObject.set(x, "visitParenthesizedExpression", js.undefined)
      
      @scala.inline
      def setVisitPattern(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Pattern, _], _]): Self = StObject.set(x, "visitPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitPatternUndefined: Self = StObject.set(x, "visitPattern", js.undefined)
      
      @scala.inline
      def setVisitPosition(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Position, _], _]): Self = StObject.set(x, "visitPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitPositionUndefined: Self = StObject.set(x, "visitPosition", js.undefined)
      
      @scala.inline
      def setVisitPrintable(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Printable, _], _]): Self = StObject.set(x, "visitPrintable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitPrintableUndefined: Self = StObject.set(x, "visitPrintable", js.undefined)
      
      @scala.inline
      def setVisitPrivateName(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[PrivateName, _], _]): Self = StObject.set(x, "visitPrivateName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitPrivateNameUndefined: Self = StObject.set(x, "visitPrivateName", js.undefined)
      
      @scala.inline
      def setVisitProgram(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Program, _], _]): Self = StObject.set(x, "visitProgram", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitProgramUndefined: Self = StObject.set(x, "visitProgram", js.undefined)
      
      @scala.inline
      def setVisitProperty(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Property, _], _]): Self = StObject.set(x, "visitProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitPropertyPattern(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[PropertyPattern, _], _]): Self = StObject.set(x, "visitPropertyPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitPropertyPatternUndefined: Self = StObject.set(x, "visitPropertyPattern", js.undefined)
      
      @scala.inline
      def setVisitPropertyUndefined: Self = StObject.set(x, "visitProperty", js.undefined)
      
      @scala.inline
      def setVisitQualifiedTypeIdentifier(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[QualifiedTypeIdentifier, _], _]
      ): Self = StObject.set(x, "visitQualifiedTypeIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitQualifiedTypeIdentifierUndefined: Self = StObject.set(x, "visitQualifiedTypeIdentifier", js.undefined)
      
      @scala.inline
      def setVisitRegExpLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[RegExpLiteral, _], _]): Self = StObject.set(x, "visitRegExpLiteral", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitRegExpLiteralUndefined: Self = StObject.set(x, "visitRegExpLiteral", js.undefined)
      
      @scala.inline
      def setVisitRestElement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[RestElement, _], _]): Self = StObject.set(x, "visitRestElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitRestElementUndefined: Self = StObject.set(x, "visitRestElement", js.undefined)
      
      @scala.inline
      def setVisitRestProperty(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[RestProperty, _], _]): Self = StObject.set(x, "visitRestProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitRestPropertyUndefined: Self = StObject.set(x, "visitRestProperty", js.undefined)
      
      @scala.inline
      def setVisitReturnStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ReturnStatement, _], _]): Self = StObject.set(x, "visitReturnStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitReturnStatementUndefined: Self = StObject.set(x, "visitReturnStatement", js.undefined)
      
      @scala.inline
      def setVisitSequenceExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SequenceExpression, _], _]): Self = StObject.set(x, "visitSequenceExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitSequenceExpressionUndefined: Self = StObject.set(x, "visitSequenceExpression", js.undefined)
      
      @scala.inline
      def setVisitSourceLocation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SourceLocation, _], _]): Self = StObject.set(x, "visitSourceLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitSourceLocationUndefined: Self = StObject.set(x, "visitSourceLocation", js.undefined)
      
      @scala.inline
      def setVisitSpecifier(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Specifier, _], _]): Self = StObject.set(x, "visitSpecifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitSpecifierUndefined: Self = StObject.set(x, "visitSpecifier", js.undefined)
      
      @scala.inline
      def setVisitSpreadElement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadElement, _], _]): Self = StObject.set(x, "visitSpreadElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitSpreadElementPattern(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadElementPattern, _], _]
      ): Self = StObject.set(x, "visitSpreadElementPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitSpreadElementPatternUndefined: Self = StObject.set(x, "visitSpreadElementPattern", js.undefined)
      
      @scala.inline
      def setVisitSpreadElementUndefined: Self = StObject.set(x, "visitSpreadElement", js.undefined)
      
      @scala.inline
      def setVisitSpreadProperty(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadProperty, _], _]): Self = StObject.set(x, "visitSpreadProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitSpreadPropertyPattern(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SpreadPropertyPattern, _], _]
      ): Self = StObject.set(x, "visitSpreadPropertyPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitSpreadPropertyPatternUndefined: Self = StObject.set(x, "visitSpreadPropertyPattern", js.undefined)
      
      @scala.inline
      def setVisitSpreadPropertyUndefined: Self = StObject.set(x, "visitSpreadProperty", js.undefined)
      
      @scala.inline
      def setVisitStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Statement, _], _]): Self = StObject.set(x, "visitStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitStatementUndefined: Self = StObject.set(x, "visitStatement", js.undefined)
      
      @scala.inline
      def setVisitStringLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[StringLiteral, _], _]): Self = StObject.set(x, "visitStringLiteral", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitStringLiteralTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[StringLiteralTypeAnnotation, _], _]
      ): Self = StObject.set(x, "visitStringLiteralTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitStringLiteralTypeAnnotationUndefined: Self = StObject.set(x, "visitStringLiteralTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitStringLiteralUndefined: Self = StObject.set(x, "visitStringLiteral", js.undefined)
      
      @scala.inline
      def setVisitStringTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[StringTypeAnnotation, _], _]
      ): Self = StObject.set(x, "visitStringTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitStringTypeAnnotationUndefined: Self = StObject.set(x, "visitStringTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitSuper(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Super, _], _]): Self = StObject.set(x, "visitSuper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitSuperUndefined: Self = StObject.set(x, "visitSuper", js.undefined)
      
      @scala.inline
      def setVisitSwitchCase(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SwitchCase, _], _]): Self = StObject.set(x, "visitSwitchCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitSwitchCaseUndefined: Self = StObject.set(x, "visitSwitchCase", js.undefined)
      
      @scala.inline
      def setVisitSwitchStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SwitchStatement, _], _]): Self = StObject.set(x, "visitSwitchStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitSwitchStatementUndefined: Self = StObject.set(x, "visitSwitchStatement", js.undefined)
      
      @scala.inline
      def setVisitSymbolTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[SymbolTypeAnnotation, _], _]
      ): Self = StObject.set(x, "visitSymbolTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitSymbolTypeAnnotationUndefined: Self = StObject.set(x, "visitSymbolTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitTSAnyKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSAnyKeyword, _], _]): Self = StObject.set(x, "visitTSAnyKeyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSAnyKeywordUndefined: Self = StObject.set(x, "visitTSAnyKeyword", js.undefined)
      
      @scala.inline
      def setVisitTSArrayType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSArrayType, _], _]): Self = StObject.set(x, "visitTSArrayType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSArrayTypeUndefined: Self = StObject.set(x, "visitTSArrayType", js.undefined)
      
      @scala.inline
      def setVisitTSAsExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSAsExpression, _], _]): Self = StObject.set(x, "visitTSAsExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSAsExpressionUndefined: Self = StObject.set(x, "visitTSAsExpression", js.undefined)
      
      @scala.inline
      def setVisitTSBigIntKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSBigIntKeyword, _], _]): Self = StObject.set(x, "visitTSBigIntKeyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSBigIntKeywordUndefined: Self = StObject.set(x, "visitTSBigIntKeyword", js.undefined)
      
      @scala.inline
      def setVisitTSBooleanKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSBooleanKeyword, _], _]): Self = StObject.set(x, "visitTSBooleanKeyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSBooleanKeywordUndefined: Self = StObject.set(x, "visitTSBooleanKeyword", js.undefined)
      
      @scala.inline
      def setVisitTSCallSignatureDeclaration(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSCallSignatureDeclaration, _], _]
      ): Self = StObject.set(x, "visitTSCallSignatureDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSCallSignatureDeclarationUndefined: Self = StObject.set(x, "visitTSCallSignatureDeclaration", js.undefined)
      
      @scala.inline
      def setVisitTSConditionalType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSConditionalType, _], _]): Self = StObject.set(x, "visitTSConditionalType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSConditionalTypeUndefined: Self = StObject.set(x, "visitTSConditionalType", js.undefined)
      
      @scala.inline
      def setVisitTSConstructSignatureDeclaration(
        value: js.ThisFunction1[
              /* this */ Context with M, 
              /* path */ NodePath[TSConstructSignatureDeclaration, _], 
              _
            ]
      ): Self = StObject.set(x, "visitTSConstructSignatureDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSConstructSignatureDeclarationUndefined: Self = StObject.set(x, "visitTSConstructSignatureDeclaration", js.undefined)
      
      @scala.inline
      def setVisitTSConstructorType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSConstructorType, _], _]): Self = StObject.set(x, "visitTSConstructorType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSConstructorTypeUndefined: Self = StObject.set(x, "visitTSConstructorType", js.undefined)
      
      @scala.inline
      def setVisitTSDeclareFunction(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSDeclareFunction, _], _]): Self = StObject.set(x, "visitTSDeclareFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSDeclareFunctionUndefined: Self = StObject.set(x, "visitTSDeclareFunction", js.undefined)
      
      @scala.inline
      def setVisitTSDeclareMethod(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSDeclareMethod, _], _]): Self = StObject.set(x, "visitTSDeclareMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSDeclareMethodUndefined: Self = StObject.set(x, "visitTSDeclareMethod", js.undefined)
      
      @scala.inline
      def setVisitTSEnumDeclaration(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSEnumDeclaration, _], _]): Self = StObject.set(x, "visitTSEnumDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSEnumDeclarationUndefined: Self = StObject.set(x, "visitTSEnumDeclaration", js.undefined)
      
      @scala.inline
      def setVisitTSEnumMember(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSEnumMember, _], _]): Self = StObject.set(x, "visitTSEnumMember", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSEnumMemberUndefined: Self = StObject.set(x, "visitTSEnumMember", js.undefined)
      
      @scala.inline
      def setVisitTSExportAssignment(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSExportAssignment, _], _]): Self = StObject.set(x, "visitTSExportAssignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSExportAssignmentUndefined: Self = StObject.set(x, "visitTSExportAssignment", js.undefined)
      
      @scala.inline
      def setVisitTSExpressionWithTypeArguments(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSExpressionWithTypeArguments, _], _]
      ): Self = StObject.set(x, "visitTSExpressionWithTypeArguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSExpressionWithTypeArgumentsUndefined: Self = StObject.set(x, "visitTSExpressionWithTypeArguments", js.undefined)
      
      @scala.inline
      def setVisitTSExternalModuleReference(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSExternalModuleReference, _], _]
      ): Self = StObject.set(x, "visitTSExternalModuleReference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSExternalModuleReferenceUndefined: Self = StObject.set(x, "visitTSExternalModuleReference", js.undefined)
      
      @scala.inline
      def setVisitTSFunctionType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSFunctionType, _], _]): Self = StObject.set(x, "visitTSFunctionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSFunctionTypeUndefined: Self = StObject.set(x, "visitTSFunctionType", js.undefined)
      
      @scala.inline
      def setVisitTSHasOptionalTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSHasOptionalTypeAnnotation, _], _]
      ): Self = StObject.set(x, "visitTSHasOptionalTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSHasOptionalTypeAnnotationUndefined: Self = StObject.set(x, "visitTSHasOptionalTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitTSHasOptionalTypeParameterInstantiation(
        value: js.ThisFunction1[
              /* this */ Context with M, 
              /* path */ NodePath[TSHasOptionalTypeParameterInstantiation, _], 
              _
            ]
      ): Self = StObject.set(x, "visitTSHasOptionalTypeParameterInstantiation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSHasOptionalTypeParameterInstantiationUndefined: Self = StObject.set(x, "visitTSHasOptionalTypeParameterInstantiation", js.undefined)
      
      @scala.inline
      def setVisitTSHasOptionalTypeParameters(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSHasOptionalTypeParameters, _], _]
      ): Self = StObject.set(x, "visitTSHasOptionalTypeParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSHasOptionalTypeParametersUndefined: Self = StObject.set(x, "visitTSHasOptionalTypeParameters", js.undefined)
      
      @scala.inline
      def setVisitTSImportEqualsDeclaration(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSImportEqualsDeclaration, _], _]
      ): Self = StObject.set(x, "visitTSImportEqualsDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSImportEqualsDeclarationUndefined: Self = StObject.set(x, "visitTSImportEqualsDeclaration", js.undefined)
      
      @scala.inline
      def setVisitTSImportType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSImportType, _], _]): Self = StObject.set(x, "visitTSImportType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSImportTypeUndefined: Self = StObject.set(x, "visitTSImportType", js.undefined)
      
      @scala.inline
      def setVisitTSIndexSignature(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSIndexSignature, _], _]): Self = StObject.set(x, "visitTSIndexSignature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSIndexSignatureUndefined: Self = StObject.set(x, "visitTSIndexSignature", js.undefined)
      
      @scala.inline
      def setVisitTSIndexedAccessType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSIndexedAccessType, _], _]): Self = StObject.set(x, "visitTSIndexedAccessType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSIndexedAccessTypeUndefined: Self = StObject.set(x, "visitTSIndexedAccessType", js.undefined)
      
      @scala.inline
      def setVisitTSInferType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSInferType, _], _]): Self = StObject.set(x, "visitTSInferType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSInferTypeUndefined: Self = StObject.set(x, "visitTSInferType", js.undefined)
      
      @scala.inline
      def setVisitTSInterfaceBody(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSInterfaceBody, _], _]): Self = StObject.set(x, "visitTSInterfaceBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSInterfaceBodyUndefined: Self = StObject.set(x, "visitTSInterfaceBody", js.undefined)
      
      @scala.inline
      def setVisitTSInterfaceDeclaration(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSInterfaceDeclaration, _], _]
      ): Self = StObject.set(x, "visitTSInterfaceDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSInterfaceDeclarationUndefined: Self = StObject.set(x, "visitTSInterfaceDeclaration", js.undefined)
      
      @scala.inline
      def setVisitTSIntersectionType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSIntersectionType, _], _]): Self = StObject.set(x, "visitTSIntersectionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSIntersectionTypeUndefined: Self = StObject.set(x, "visitTSIntersectionType", js.undefined)
      
      @scala.inline
      def setVisitTSLiteralType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSLiteralType, _], _]): Self = StObject.set(x, "visitTSLiteralType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSLiteralTypeUndefined: Self = StObject.set(x, "visitTSLiteralType", js.undefined)
      
      @scala.inline
      def setVisitTSMappedType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSMappedType, _], _]): Self = StObject.set(x, "visitTSMappedType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSMappedTypeUndefined: Self = StObject.set(x, "visitTSMappedType", js.undefined)
      
      @scala.inline
      def setVisitTSMethodSignature(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSMethodSignature, _], _]): Self = StObject.set(x, "visitTSMethodSignature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSMethodSignatureUndefined: Self = StObject.set(x, "visitTSMethodSignature", js.undefined)
      
      @scala.inline
      def setVisitTSModuleBlock(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSModuleBlock, _], _]): Self = StObject.set(x, "visitTSModuleBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSModuleBlockUndefined: Self = StObject.set(x, "visitTSModuleBlock", js.undefined)
      
      @scala.inline
      def setVisitTSModuleDeclaration(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSModuleDeclaration, _], _]): Self = StObject.set(x, "visitTSModuleDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSModuleDeclarationUndefined: Self = StObject.set(x, "visitTSModuleDeclaration", js.undefined)
      
      @scala.inline
      def setVisitTSNamedTupleMember(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNamedTupleMember, _], _]): Self = StObject.set(x, "visitTSNamedTupleMember", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSNamedTupleMemberUndefined: Self = StObject.set(x, "visitTSNamedTupleMember", js.undefined)
      
      @scala.inline
      def setVisitTSNamespaceExportDeclaration(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNamespaceExportDeclaration, _], _]
      ): Self = StObject.set(x, "visitTSNamespaceExportDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSNamespaceExportDeclarationUndefined: Self = StObject.set(x, "visitTSNamespaceExportDeclaration", js.undefined)
      
      @scala.inline
      def setVisitTSNeverKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNeverKeyword, _], _]): Self = StObject.set(x, "visitTSNeverKeyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSNeverKeywordUndefined: Self = StObject.set(x, "visitTSNeverKeyword", js.undefined)
      
      @scala.inline
      def setVisitTSNonNullExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNonNullExpression, _], _]): Self = StObject.set(x, "visitTSNonNullExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSNonNullExpressionUndefined: Self = StObject.set(x, "visitTSNonNullExpression", js.undefined)
      
      @scala.inline
      def setVisitTSNullKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNullKeyword, _], _]): Self = StObject.set(x, "visitTSNullKeyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSNullKeywordUndefined: Self = StObject.set(x, "visitTSNullKeyword", js.undefined)
      
      @scala.inline
      def setVisitTSNumberKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSNumberKeyword, _], _]): Self = StObject.set(x, "visitTSNumberKeyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSNumberKeywordUndefined: Self = StObject.set(x, "visitTSNumberKeyword", js.undefined)
      
      @scala.inline
      def setVisitTSObjectKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSObjectKeyword, _], _]): Self = StObject.set(x, "visitTSObjectKeyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSObjectKeywordUndefined: Self = StObject.set(x, "visitTSObjectKeyword", js.undefined)
      
      @scala.inline
      def setVisitTSOptionalType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSOptionalType, _], _]): Self = StObject.set(x, "visitTSOptionalType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSOptionalTypeUndefined: Self = StObject.set(x, "visitTSOptionalType", js.undefined)
      
      @scala.inline
      def setVisitTSParameterProperty(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSParameterProperty, _], _]): Self = StObject.set(x, "visitTSParameterProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSParameterPropertyUndefined: Self = StObject.set(x, "visitTSParameterProperty", js.undefined)
      
      @scala.inline
      def setVisitTSParenthesizedType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSParenthesizedType, _], _]): Self = StObject.set(x, "visitTSParenthesizedType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSParenthesizedTypeUndefined: Self = StObject.set(x, "visitTSParenthesizedType", js.undefined)
      
      @scala.inline
      def setVisitTSPropertySignature(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSPropertySignature, _], _]): Self = StObject.set(x, "visitTSPropertySignature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSPropertySignatureUndefined: Self = StObject.set(x, "visitTSPropertySignature", js.undefined)
      
      @scala.inline
      def setVisitTSQualifiedName(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSQualifiedName, _], _]): Self = StObject.set(x, "visitTSQualifiedName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSQualifiedNameUndefined: Self = StObject.set(x, "visitTSQualifiedName", js.undefined)
      
      @scala.inline
      def setVisitTSRestType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSRestType, _], _]): Self = StObject.set(x, "visitTSRestType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSRestTypeUndefined: Self = StObject.set(x, "visitTSRestType", js.undefined)
      
      @scala.inline
      def setVisitTSStringKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSStringKeyword, _], _]): Self = StObject.set(x, "visitTSStringKeyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSStringKeywordUndefined: Self = StObject.set(x, "visitTSStringKeyword", js.undefined)
      
      @scala.inline
      def setVisitTSSymbolKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSSymbolKeyword, _], _]): Self = StObject.set(x, "visitTSSymbolKeyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSSymbolKeywordUndefined: Self = StObject.set(x, "visitTSSymbolKeyword", js.undefined)
      
      @scala.inline
      def setVisitTSThisType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSThisType, _], _]): Self = StObject.set(x, "visitTSThisType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSThisTypeUndefined: Self = StObject.set(x, "visitTSThisType", js.undefined)
      
      @scala.inline
      def setVisitTSTupleType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTupleType, _], _]): Self = StObject.set(x, "visitTSTupleType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSTupleTypeUndefined: Self = StObject.set(x, "visitTSTupleType", js.undefined)
      
      @scala.inline
      def setVisitTSType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSType, _], _]): Self = StObject.set(x, "visitTSType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSTypeAliasDeclaration(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeAliasDeclaration, _], _]
      ): Self = StObject.set(x, "visitTSTypeAliasDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSTypeAliasDeclarationUndefined: Self = StObject.set(x, "visitTSTypeAliasDeclaration", js.undefined)
      
      @scala.inline
      def setVisitTSTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeAnnotation, _], _]): Self = StObject.set(x, "visitTSTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSTypeAnnotationUndefined: Self = StObject.set(x, "visitTSTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitTSTypeAssertion(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeAssertion, _], _]): Self = StObject.set(x, "visitTSTypeAssertion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSTypeAssertionUndefined: Self = StObject.set(x, "visitTSTypeAssertion", js.undefined)
      
      @scala.inline
      def setVisitTSTypeLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeLiteral, _], _]): Self = StObject.set(x, "visitTSTypeLiteral", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSTypeLiteralUndefined: Self = StObject.set(x, "visitTSTypeLiteral", js.undefined)
      
      @scala.inline
      def setVisitTSTypeOperator(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeOperator, _], _]): Self = StObject.set(x, "visitTSTypeOperator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSTypeOperatorUndefined: Self = StObject.set(x, "visitTSTypeOperator", js.undefined)
      
      @scala.inline
      def setVisitTSTypeParameter(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeParameter, _], _]): Self = StObject.set(x, "visitTSTypeParameter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSTypeParameterDeclaration(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeParameterDeclaration, _], _]
      ): Self = StObject.set(x, "visitTSTypeParameterDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSTypeParameterDeclarationUndefined: Self = StObject.set(x, "visitTSTypeParameterDeclaration", js.undefined)
      
      @scala.inline
      def setVisitTSTypeParameterInstantiation(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeParameterInstantiation, _], _]
      ): Self = StObject.set(x, "visitTSTypeParameterInstantiation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSTypeParameterInstantiationUndefined: Self = StObject.set(x, "visitTSTypeParameterInstantiation", js.undefined)
      
      @scala.inline
      def setVisitTSTypeParameterUndefined: Self = StObject.set(x, "visitTSTypeParameter", js.undefined)
      
      @scala.inline
      def setVisitTSTypePredicate(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypePredicate, _], _]): Self = StObject.set(x, "visitTSTypePredicate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSTypePredicateUndefined: Self = StObject.set(x, "visitTSTypePredicate", js.undefined)
      
      @scala.inline
      def setVisitTSTypeQuery(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeQuery, _], _]): Self = StObject.set(x, "visitTSTypeQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSTypeQueryUndefined: Self = StObject.set(x, "visitTSTypeQuery", js.undefined)
      
      @scala.inline
      def setVisitTSTypeReference(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSTypeReference, _], _]): Self = StObject.set(x, "visitTSTypeReference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSTypeReferenceUndefined: Self = StObject.set(x, "visitTSTypeReference", js.undefined)
      
      @scala.inline
      def setVisitTSTypeUndefined: Self = StObject.set(x, "visitTSType", js.undefined)
      
      @scala.inline
      def setVisitTSUndefinedKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSUndefinedKeyword, _], _]): Self = StObject.set(x, "visitTSUndefinedKeyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSUndefinedKeywordUndefined: Self = StObject.set(x, "visitTSUndefinedKeyword", js.undefined)
      
      @scala.inline
      def setVisitTSUnionType(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSUnionType, _], _]): Self = StObject.set(x, "visitTSUnionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSUnionTypeUndefined: Self = StObject.set(x, "visitTSUnionType", js.undefined)
      
      @scala.inline
      def setVisitTSUnknownKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSUnknownKeyword, _], _]): Self = StObject.set(x, "visitTSUnknownKeyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSUnknownKeywordUndefined: Self = StObject.set(x, "visitTSUnknownKeyword", js.undefined)
      
      @scala.inline
      def setVisitTSVoidKeyword(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TSVoidKeyword, _], _]): Self = StObject.set(x, "visitTSVoidKeyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTSVoidKeywordUndefined: Self = StObject.set(x, "visitTSVoidKeyword", js.undefined)
      
      @scala.inline
      def setVisitTaggedTemplateExpression(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TaggedTemplateExpression, _], _]
      ): Self = StObject.set(x, "visitTaggedTemplateExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTaggedTemplateExpressionUndefined: Self = StObject.set(x, "visitTaggedTemplateExpression", js.undefined)
      
      @scala.inline
      def setVisitTemplateElement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TemplateElement, _], _]): Self = StObject.set(x, "visitTemplateElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTemplateElementUndefined: Self = StObject.set(x, "visitTemplateElement", js.undefined)
      
      @scala.inline
      def setVisitTemplateLiteral(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TemplateLiteral, _], _]): Self = StObject.set(x, "visitTemplateLiteral", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTemplateLiteralUndefined: Self = StObject.set(x, "visitTemplateLiteral", js.undefined)
      
      @scala.inline
      def setVisitThisExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ThisExpression, _], _]): Self = StObject.set(x, "visitThisExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitThisExpressionUndefined: Self = StObject.set(x, "visitThisExpression", js.undefined)
      
      @scala.inline
      def setVisitThisTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ThisTypeAnnotation, _], _]): Self = StObject.set(x, "visitThisTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitThisTypeAnnotationUndefined: Self = StObject.set(x, "visitThisTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitThrowStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[ThrowStatement, _], _]): Self = StObject.set(x, "visitThrowStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitThrowStatementUndefined: Self = StObject.set(x, "visitThrowStatement", js.undefined)
      
      @scala.inline
      def setVisitTryStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TryStatement, _], _]): Self = StObject.set(x, "visitTryStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTryStatementUndefined: Self = StObject.set(x, "visitTryStatement", js.undefined)
      
      @scala.inline
      def setVisitTupleTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TupleTypeAnnotation, _], _]): Self = StObject.set(x, "visitTupleTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTupleTypeAnnotationUndefined: Self = StObject.set(x, "visitTupleTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitTypeAlias(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeAlias, _], _]): Self = StObject.set(x, "visitTypeAlias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTypeAliasUndefined: Self = StObject.set(x, "visitTypeAlias", js.undefined)
      
      @scala.inline
      def setVisitTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeAnnotation, _], _]): Self = StObject.set(x, "visitTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTypeAnnotationUndefined: Self = StObject.set(x, "visitTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitTypeCastExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeCastExpression, _], _]): Self = StObject.set(x, "visitTypeCastExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTypeCastExpressionUndefined: Self = StObject.set(x, "visitTypeCastExpression", js.undefined)
      
      @scala.inline
      def setVisitTypeParameter(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeParameter, _], _]): Self = StObject.set(x, "visitTypeParameter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTypeParameterDeclaration(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeParameterDeclaration, _], _]
      ): Self = StObject.set(x, "visitTypeParameterDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTypeParameterDeclarationUndefined: Self = StObject.set(x, "visitTypeParameterDeclaration", js.undefined)
      
      @scala.inline
      def setVisitTypeParameterInstantiation(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeParameterInstantiation, _], _]
      ): Self = StObject.set(x, "visitTypeParameterInstantiation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTypeParameterInstantiationUndefined: Self = StObject.set(x, "visitTypeParameterInstantiation", js.undefined)
      
      @scala.inline
      def setVisitTypeParameterUndefined: Self = StObject.set(x, "visitTypeParameter", js.undefined)
      
      @scala.inline
      def setVisitTypeofTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[TypeofTypeAnnotation, _], _]
      ): Self = StObject.set(x, "visitTypeofTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTypeofTypeAnnotationUndefined: Self = StObject.set(x, "visitTypeofTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitUnaryExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[UnaryExpression, _], _]): Self = StObject.set(x, "visitUnaryExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitUnaryExpressionUndefined: Self = StObject.set(x, "visitUnaryExpression", js.undefined)
      
      @scala.inline
      def setVisitUnionTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[UnionTypeAnnotation, _], _]): Self = StObject.set(x, "visitUnionTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitUnionTypeAnnotationUndefined: Self = StObject.set(x, "visitUnionTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitUpdateExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[UpdateExpression, _], _]): Self = StObject.set(x, "visitUpdateExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitUpdateExpressionUndefined: Self = StObject.set(x, "visitUpdateExpression", js.undefined)
      
      @scala.inline
      def setVisitVariableDeclaration(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[VariableDeclaration, _], _]): Self = StObject.set(x, "visitVariableDeclaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitVariableDeclarationUndefined: Self = StObject.set(x, "visitVariableDeclaration", js.undefined)
      
      @scala.inline
      def setVisitVariableDeclarator(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[VariableDeclarator, _], _]): Self = StObject.set(x, "visitVariableDeclarator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitVariableDeclaratorUndefined: Self = StObject.set(x, "visitVariableDeclarator", js.undefined)
      
      @scala.inline
      def setVisitVariance(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[Variance, _], _]): Self = StObject.set(x, "visitVariance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitVarianceUndefined: Self = StObject.set(x, "visitVariance", js.undefined)
      
      @scala.inline
      def setVisitVoidTypeAnnotation(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[VoidTypeAnnotation, _], _]): Self = StObject.set(x, "visitVoidTypeAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitVoidTypeAnnotationUndefined: Self = StObject.set(x, "visitVoidTypeAnnotation", js.undefined)
      
      @scala.inline
      def setVisitWhileStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[WhileStatement, _], _]): Self = StObject.set(x, "visitWhileStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitWhileStatementUndefined: Self = StObject.set(x, "visitWhileStatement", js.undefined)
      
      @scala.inline
      def setVisitWithStatement(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[WithStatement, _], _]): Self = StObject.set(x, "visitWithStatement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitWithStatementUndefined: Self = StObject.set(x, "visitWithStatement", js.undefined)
      
      @scala.inline
      def setVisitYieldExpression(value: js.ThisFunction1[/* this */ Context with M, /* path */ NodePath[YieldExpression, _], _]): Self = StObject.set(x, "visitYieldExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitYieldExpressionUndefined: Self = StObject.set(x, "visitYieldExpression", js.undefined)
    }
  }
}
