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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visitorMod {
  
  trait Visitor[M] extends StObject {
    
    var visitAnyTypeAnnotation: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[AnyTypeAnnotation, js.Any], js.Any]
      ] = js.undefined
    
    var visitArrayExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ArrayExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitArrayPattern: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ArrayPattern, js.Any], js.Any]
      ] = js.undefined
    
    var visitArrayTypeAnnotation: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ArrayTypeAnnotation, js.Any], js.Any]
      ] = js.undefined
    
    var visitArrowFunctionExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ArrowFunctionExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitAssignmentExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[AssignmentExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitAssignmentPattern: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[AssignmentPattern, js.Any], js.Any]
      ] = js.undefined
    
    var visitAwaitExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[AwaitExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitBigIntLiteral: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[BigIntLiteral, js.Any], js.Any]
      ] = js.undefined
    
    var visitBigIntLiteralTypeAnnotation: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[BigIntLiteralTypeAnnotation, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitBigIntTypeAnnotation: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[BigIntTypeAnnotation, js.Any], js.Any]
      ] = js.undefined
    
    var visitBinaryExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[BinaryExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitBindExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[BindExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitBlock: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Block, js.Any], js.Any]
      ] = js.undefined
    
    var visitBlockStatement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[BlockStatement, js.Any], js.Any]
      ] = js.undefined
    
    var visitBooleanLiteral: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[BooleanLiteral, js.Any], js.Any]
      ] = js.undefined
    
    var visitBooleanLiteralTypeAnnotation: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[BooleanLiteralTypeAnnotation, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitBooleanTypeAnnotation: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[BooleanTypeAnnotation, js.Any], js.Any]
      ] = js.undefined
    
    var visitBreakStatement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[BreakStatement, js.Any], js.Any]
      ] = js.undefined
    
    var visitCallExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[CallExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitCatchClause: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[CatchClause, js.Any], js.Any]
      ] = js.undefined
    
    var visitChainElement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ChainElement, js.Any], js.Any]
      ] = js.undefined
    
    var visitChainExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ChainExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitClassBody: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ClassBody, js.Any], js.Any]
      ] = js.undefined
    
    var visitClassDeclaration: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ClassDeclaration, js.Any], js.Any]
      ] = js.undefined
    
    var visitClassExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ClassExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitClassImplements: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ClassImplements, js.Any], js.Any]
      ] = js.undefined
    
    var visitClassMethod: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ClassMethod, js.Any], js.Any]
      ] = js.undefined
    
    var visitClassPrivateMethod: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ClassPrivateMethod, js.Any], js.Any]
      ] = js.undefined
    
    var visitClassPrivateProperty: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ClassPrivateProperty, js.Any], js.Any]
      ] = js.undefined
    
    var visitClassProperty: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ClassProperty, js.Any], js.Any]
      ] = js.undefined
    
    var visitClassPropertyDefinition: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ClassPropertyDefinition, js.Any], js.Any]
      ] = js.undefined
    
    var visitComment: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Comment, js.Any], js.Any]
      ] = js.undefined
    
    var visitCommentBlock: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[CommentBlock, js.Any], js.Any]
      ] = js.undefined
    
    var visitCommentLine: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[CommentLine, js.Any], js.Any]
      ] = js.undefined
    
    var visitComprehensionBlock: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ComprehensionBlock, js.Any], js.Any]
      ] = js.undefined
    
    var visitComprehensionExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ComprehensionExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitConditionalExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ConditionalExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitContinueStatement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ContinueStatement, js.Any], js.Any]
      ] = js.undefined
    
    var visitDebuggerStatement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[DebuggerStatement, js.Any], js.Any]
      ] = js.undefined
    
    var visitDeclaration: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Declaration, js.Any], js.Any]
      ] = js.undefined
    
    var visitDeclareClass: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[DeclareClass, js.Any], js.Any]
      ] = js.undefined
    
    var visitDeclareExportAllDeclaration: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[DeclareExportAllDeclaration, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitDeclareExportDeclaration: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[DeclareExportDeclaration, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitDeclareFunction: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[DeclareFunction, js.Any], js.Any]
      ] = js.undefined
    
    var visitDeclareInterface: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[DeclareInterface, js.Any], js.Any]
      ] = js.undefined
    
    var visitDeclareModule: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[DeclareModule, js.Any], js.Any]
      ] = js.undefined
    
    var visitDeclareModuleExports: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[DeclareModuleExports, js.Any], js.Any]
      ] = js.undefined
    
    var visitDeclareOpaqueType: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[DeclareOpaqueType, js.Any], js.Any]
      ] = js.undefined
    
    var visitDeclareTypeAlias: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[DeclareTypeAlias, js.Any], js.Any]
      ] = js.undefined
    
    var visitDeclareVariable: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[DeclareVariable, js.Any], js.Any]
      ] = js.undefined
    
    var visitDeclaredPredicate: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[DeclaredPredicate, js.Any], js.Any]
      ] = js.undefined
    
    var visitDecorator: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Decorator, js.Any], js.Any]
      ] = js.undefined
    
    var visitDirective: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Directive, js.Any], js.Any]
      ] = js.undefined
    
    var visitDirectiveLiteral: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[DirectiveLiteral, js.Any], js.Any]
      ] = js.undefined
    
    var visitDoExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[DoExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitDoWhileStatement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[DoWhileStatement, js.Any], js.Any]
      ] = js.undefined
    
    var visitEmptyStatement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[EmptyStatement, js.Any], js.Any]
      ] = js.undefined
    
    var visitEmptyTypeAnnotation: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[EmptyTypeAnnotation, js.Any], js.Any]
      ] = js.undefined
    
    var visitEnumBooleanBody: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[EnumBooleanBody, js.Any], js.Any]
      ] = js.undefined
    
    var visitEnumBooleanMember: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[EnumBooleanMember, js.Any], js.Any]
      ] = js.undefined
    
    var visitEnumDeclaration: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[EnumDeclaration, js.Any], js.Any]
      ] = js.undefined
    
    var visitEnumDefaultedMember: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[EnumDefaultedMember, js.Any], js.Any]
      ] = js.undefined
    
    var visitEnumNumberBody: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[EnumNumberBody, js.Any], js.Any]
      ] = js.undefined
    
    var visitEnumNumberMember: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[EnumNumberMember, js.Any], js.Any]
      ] = js.undefined
    
    var visitEnumStringBody: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[EnumStringBody, js.Any], js.Any]
      ] = js.undefined
    
    var visitEnumStringMember: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[EnumStringMember, js.Any], js.Any]
      ] = js.undefined
    
    var visitEnumSymbolBody: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[EnumSymbolBody, js.Any], js.Any]
      ] = js.undefined
    
    var visitExistentialTypeParam: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ExistentialTypeParam, js.Any], js.Any]
      ] = js.undefined
    
    var visitExistsTypeAnnotation: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ExistsTypeAnnotation, js.Any], js.Any]
      ] = js.undefined
    
    var visitExportAllDeclaration: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ExportAllDeclaration, js.Any], js.Any]
      ] = js.undefined
    
    var visitExportBatchSpecifier: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ExportBatchSpecifier, js.Any], js.Any]
      ] = js.undefined
    
    var visitExportDeclaration: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ExportDeclaration, js.Any], js.Any]
      ] = js.undefined
    
    var visitExportDefaultDeclaration: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[ExportDefaultDeclaration, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitExportDefaultSpecifier: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ExportDefaultSpecifier, js.Any], js.Any]
      ] = js.undefined
    
    var visitExportNamedDeclaration: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ExportNamedDeclaration, js.Any], js.Any]
      ] = js.undefined
    
    var visitExportNamespaceSpecifier: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[ExportNamespaceSpecifier, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitExportSpecifier: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ExportSpecifier, js.Any], js.Any]
      ] = js.undefined
    
    var visitExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Expression, js.Any], js.Any]
      ] = js.undefined
    
    var visitExpressionStatement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ExpressionStatement, js.Any], js.Any]
      ] = js.undefined
    
    var visitFile: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[File, js.Any], js.Any]
      ] = js.undefined
    
    var visitFlow: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Flow, js.Any], js.Any]
      ] = js.undefined
    
    var visitFlowPredicate: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[FlowPredicate, js.Any], js.Any]
      ] = js.undefined
    
    var visitFlowType: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[FlowType, js.Any], js.Any]
      ] = js.undefined
    
    var visitForAwaitStatement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ForAwaitStatement, js.Any], js.Any]
      ] = js.undefined
    
    var visitForInStatement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ForInStatement, js.Any], js.Any]
      ] = js.undefined
    
    var visitForOfStatement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ForOfStatement, js.Any], js.Any]
      ] = js.undefined
    
    var visitForStatement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ForStatement, js.Any], js.Any]
      ] = js.undefined
    
    var visitFunction: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Function, js.Any], js.Any]
      ] = js.undefined
    
    var visitFunctionDeclaration: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[FunctionDeclaration, js.Any], js.Any]
      ] = js.undefined
    
    var visitFunctionExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[FunctionExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitFunctionTypeAnnotation: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[FunctionTypeAnnotation, js.Any], js.Any]
      ] = js.undefined
    
    var visitFunctionTypeParam: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[FunctionTypeParam, js.Any], js.Any]
      ] = js.undefined
    
    var visitGeneratorExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[GeneratorExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitGenericTypeAnnotation: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[GenericTypeAnnotation, js.Any], js.Any]
      ] = js.undefined
    
    var visitIdentifier: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Identifier, js.Any], js.Any]
      ] = js.undefined
    
    var visitIfStatement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[IfStatement, js.Any], js.Any]
      ] = js.undefined
    
    var visitImport: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Import, js.Any], js.Any]
      ] = js.undefined
    
    var visitImportDeclaration: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ImportDeclaration, js.Any], js.Any]
      ] = js.undefined
    
    var visitImportDefaultSpecifier: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ImportDefaultSpecifier, js.Any], js.Any]
      ] = js.undefined
    
    var visitImportExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ImportExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitImportNamespaceSpecifier: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[ImportNamespaceSpecifier, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitImportSpecifier: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ImportSpecifier, js.Any], js.Any]
      ] = js.undefined
    
    var visitInferredPredicate: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[InferredPredicate, js.Any], js.Any]
      ] = js.undefined
    
    var visitInterfaceDeclaration: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[InterfaceDeclaration, js.Any], js.Any]
      ] = js.undefined
    
    var visitInterfaceExtends: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[InterfaceExtends, js.Any], js.Any]
      ] = js.undefined
    
    var visitInterfaceTypeAnnotation: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[InterfaceTypeAnnotation, js.Any], js.Any]
      ] = js.undefined
    
    var visitInterpreterDirective: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[InterpreterDirective, js.Any], js.Any]
      ] = js.undefined
    
    var visitIntersectionTypeAnnotation: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[IntersectionTypeAnnotation, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitJSXAttribute: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXAttribute, js.Any], js.Any]
      ] = js.undefined
    
    var visitJSXClosingElement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXClosingElement, js.Any], js.Any]
      ] = js.undefined
    
    var visitJSXClosingFragment: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXClosingFragment, js.Any], js.Any]
      ] = js.undefined
    
    var visitJSXElement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXElement, js.Any], js.Any]
      ] = js.undefined
    
    var visitJSXEmptyExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXEmptyExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitJSXExpressionContainer: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXExpressionContainer, js.Any], js.Any]
      ] = js.undefined
    
    var visitJSXFragment: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXFragment, js.Any], js.Any]
      ] = js.undefined
    
    var visitJSXIdentifier: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXIdentifier, js.Any], js.Any]
      ] = js.undefined
    
    var visitJSXMemberExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXMemberExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitJSXNamespacedName: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXNamespacedName, js.Any], js.Any]
      ] = js.undefined
    
    var visitJSXOpeningElement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXOpeningElement, js.Any], js.Any]
      ] = js.undefined
    
    var visitJSXOpeningFragment: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXOpeningFragment, js.Any], js.Any]
      ] = js.undefined
    
    var visitJSXSpreadAttribute: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXSpreadAttribute, js.Any], js.Any]
      ] = js.undefined
    
    var visitJSXSpreadChild: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXSpreadChild, js.Any], js.Any]
      ] = js.undefined
    
    var visitJSXText: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXText, js.Any], js.Any]
      ] = js.undefined
    
    var visitLabeledStatement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[LabeledStatement, js.Any], js.Any]
      ] = js.undefined
    
    var visitLine: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Line, js.Any], js.Any]
      ] = js.undefined
    
    var visitLiteral: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Literal, js.Any], js.Any]
      ] = js.undefined
    
    var visitLogicalExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[LogicalExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitMemberExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[MemberExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitMemberTypeAnnotation: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[MemberTypeAnnotation, js.Any], js.Any]
      ] = js.undefined
    
    var visitMetaProperty: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[MetaProperty, js.Any], js.Any]
      ] = js.undefined
    
    var visitMethodDefinition: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[MethodDefinition, js.Any], js.Any]
      ] = js.undefined
    
    var visitMixedTypeAnnotation: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[MixedTypeAnnotation, js.Any], js.Any]
      ] = js.undefined
    
    var visitModuleSpecifier: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ModuleSpecifier, js.Any], js.Any]
      ] = js.undefined
    
    var visitNewExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[NewExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitNode: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Node, js.Any], js.Any]
      ] = js.undefined
    
    var visitNoop: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Noop, js.Any], js.Any]
      ] = js.undefined
    
    var visitNullLiteral: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[NullLiteral, js.Any], js.Any]
      ] = js.undefined
    
    var visitNullLiteralTypeAnnotation: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[NullLiteralTypeAnnotation, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitNullTypeAnnotation: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[NullTypeAnnotation, js.Any], js.Any]
      ] = js.undefined
    
    var visitNullableTypeAnnotation: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[NullableTypeAnnotation, js.Any], js.Any]
      ] = js.undefined
    
    var visitNumberLiteralTypeAnnotation: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[NumberLiteralTypeAnnotation, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitNumberTypeAnnotation: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[NumberTypeAnnotation, js.Any], js.Any]
      ] = js.undefined
    
    var visitNumericLiteral: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[NumericLiteral, js.Any], js.Any]
      ] = js.undefined
    
    var visitNumericLiteralTypeAnnotation: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[NumericLiteralTypeAnnotation, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitObjectExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ObjectExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitObjectMethod: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ObjectMethod, js.Any], js.Any]
      ] = js.undefined
    
    var visitObjectPattern: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ObjectPattern, js.Any], js.Any]
      ] = js.undefined
    
    var visitObjectProperty: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ObjectProperty, js.Any], js.Any]
      ] = js.undefined
    
    var visitObjectTypeAnnotation: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ObjectTypeAnnotation, js.Any], js.Any]
      ] = js.undefined
    
    var visitObjectTypeCallProperty: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ObjectTypeCallProperty, js.Any], js.Any]
      ] = js.undefined
    
    var visitObjectTypeIndexer: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ObjectTypeIndexer, js.Any], js.Any]
      ] = js.undefined
    
    var visitObjectTypeInternalSlot: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ObjectTypeInternalSlot, js.Any], js.Any]
      ] = js.undefined
    
    var visitObjectTypeProperty: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ObjectTypeProperty, js.Any], js.Any]
      ] = js.undefined
    
    var visitObjectTypeSpreadProperty: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[ObjectTypeSpreadProperty, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitOpaqueType: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[OpaqueType, js.Any], js.Any]
      ] = js.undefined
    
    var visitOptionalCallExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[OptionalCallExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitOptionalMemberExpression: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[OptionalMemberExpression, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitParenthesizedExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ParenthesizedExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitPattern: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Pattern, js.Any], js.Any]
      ] = js.undefined
    
    var visitPosition: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Position, js.Any], js.Any]
      ] = js.undefined
    
    var visitPrintable: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Printable, js.Any], js.Any]
      ] = js.undefined
    
    var visitPrivateName: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[PrivateName, js.Any], js.Any]
      ] = js.undefined
    
    var visitProgram: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Program, js.Any], js.Any]
      ] = js.undefined
    
    var visitProperty: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Property, js.Any], js.Any]
      ] = js.undefined
    
    var visitPropertyPattern: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[PropertyPattern, js.Any], js.Any]
      ] = js.undefined
    
    var visitQualifiedTypeIdentifier: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[QualifiedTypeIdentifier, js.Any], js.Any]
      ] = js.undefined
    
    var visitRegExpLiteral: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[RegExpLiteral, js.Any], js.Any]
      ] = js.undefined
    
    var visitRestElement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[RestElement, js.Any], js.Any]
      ] = js.undefined
    
    var visitRestProperty: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[RestProperty, js.Any], js.Any]
      ] = js.undefined
    
    var visitReturnStatement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ReturnStatement, js.Any], js.Any]
      ] = js.undefined
    
    var visitSequenceExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[SequenceExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitSourceLocation: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[SourceLocation, js.Any], js.Any]
      ] = js.undefined
    
    var visitSpecifier: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Specifier, js.Any], js.Any]
      ] = js.undefined
    
    var visitSpreadElement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[SpreadElement, js.Any], js.Any]
      ] = js.undefined
    
    var visitSpreadElementPattern: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[SpreadElementPattern, js.Any], js.Any]
      ] = js.undefined
    
    var visitSpreadProperty: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[SpreadProperty, js.Any], js.Any]
      ] = js.undefined
    
    var visitSpreadPropertyPattern: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[SpreadPropertyPattern, js.Any], js.Any]
      ] = js.undefined
    
    var visitStatement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Statement, js.Any], js.Any]
      ] = js.undefined
    
    var visitStringLiteral: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[StringLiteral, js.Any], js.Any]
      ] = js.undefined
    
    var visitStringLiteralTypeAnnotation: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[StringLiteralTypeAnnotation, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitStringTypeAnnotation: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[StringTypeAnnotation, js.Any], js.Any]
      ] = js.undefined
    
    var visitSuper: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Super, js.Any], js.Any]
      ] = js.undefined
    
    var visitSwitchCase: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[SwitchCase, js.Any], js.Any]
      ] = js.undefined
    
    var visitSwitchStatement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[SwitchStatement, js.Any], js.Any]
      ] = js.undefined
    
    var visitSymbolTypeAnnotation: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[SymbolTypeAnnotation, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSAnyKeyword: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSAnyKeyword, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSArrayType: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSArrayType, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSAsExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSAsExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSBigIntKeyword: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSBigIntKeyword, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSBooleanKeyword: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSBooleanKeyword, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSCallSignatureDeclaration: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[TSCallSignatureDeclaration, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitTSConditionalType: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSConditionalType, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSConstructSignatureDeclaration: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[TSConstructSignatureDeclaration, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitTSConstructorType: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSConstructorType, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSDeclareFunction: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSDeclareFunction, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSDeclareMethod: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSDeclareMethod, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSEnumDeclaration: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSEnumDeclaration, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSEnumMember: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSEnumMember, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSExportAssignment: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSExportAssignment, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSExpressionWithTypeArguments: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[TSExpressionWithTypeArguments, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitTSExternalModuleReference: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[TSExternalModuleReference, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitTSFunctionType: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSFunctionType, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSHasOptionalTypeAnnotation: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[TSHasOptionalTypeAnnotation, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitTSHasOptionalTypeParameterInstantiation: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[TSHasOptionalTypeParameterInstantiation, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitTSHasOptionalTypeParameters: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[TSHasOptionalTypeParameters, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitTSImportEqualsDeclaration: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[TSImportEqualsDeclaration, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitTSImportType: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSImportType, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSIndexSignature: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSIndexSignature, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSIndexedAccessType: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSIndexedAccessType, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSInferType: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSInferType, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSInterfaceBody: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSInterfaceBody, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSInterfaceDeclaration: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSInterfaceDeclaration, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSIntersectionType: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSIntersectionType, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSLiteralType: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSLiteralType, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSMappedType: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSMappedType, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSMethodSignature: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSMethodSignature, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSModuleBlock: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSModuleBlock, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSModuleDeclaration: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSModuleDeclaration, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSNamedTupleMember: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSNamedTupleMember, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSNamespaceExportDeclaration: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[TSNamespaceExportDeclaration, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitTSNeverKeyword: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSNeverKeyword, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSNonNullExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSNonNullExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSNullKeyword: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSNullKeyword, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSNumberKeyword: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSNumberKeyword, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSObjectKeyword: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSObjectKeyword, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSOptionalType: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSOptionalType, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSParameterProperty: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSParameterProperty, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSParenthesizedType: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSParenthesizedType, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSPropertySignature: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSPropertySignature, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSQualifiedName: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSQualifiedName, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSRestType: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSRestType, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSStringKeyword: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSStringKeyword, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSSymbolKeyword: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSSymbolKeyword, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSThisType: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSThisType, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSTupleType: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSTupleType, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSType: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSType, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSTypeAliasDeclaration: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSTypeAliasDeclaration, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSTypeAnnotation: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSTypeAnnotation, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSTypeAssertion: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSTypeAssertion, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSTypeLiteral: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSTypeLiteral, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSTypeOperator: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSTypeOperator, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSTypeParameter: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSTypeParameter, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSTypeParameterDeclaration: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[TSTypeParameterDeclaration, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitTSTypeParameterInstantiation: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[TSTypeParameterInstantiation, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitTSTypePredicate: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSTypePredicate, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSTypeQuery: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSTypeQuery, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSTypeReference: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSTypeReference, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSUndefinedKeyword: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSUndefinedKeyword, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSUnionType: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSUnionType, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSUnknownKeyword: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSUnknownKeyword, js.Any], js.Any]
      ] = js.undefined
    
    var visitTSVoidKeyword: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSVoidKeyword, js.Any], js.Any]
      ] = js.undefined
    
    var visitTaggedTemplateExpression: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[TaggedTemplateExpression, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitTemplateElement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TemplateElement, js.Any], js.Any]
      ] = js.undefined
    
    var visitTemplateLiteral: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TemplateLiteral, js.Any], js.Any]
      ] = js.undefined
    
    var visitThisExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ThisExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitThisTypeAnnotation: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ThisTypeAnnotation, js.Any], js.Any]
      ] = js.undefined
    
    var visitThrowStatement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ThrowStatement, js.Any], js.Any]
      ] = js.undefined
    
    var visitTryStatement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TryStatement, js.Any], js.Any]
      ] = js.undefined
    
    var visitTupleTypeAnnotation: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TupleTypeAnnotation, js.Any], js.Any]
      ] = js.undefined
    
    var visitTypeAlias: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TypeAlias, js.Any], js.Any]
      ] = js.undefined
    
    var visitTypeAnnotation: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TypeAnnotation, js.Any], js.Any]
      ] = js.undefined
    
    var visitTypeCastExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TypeCastExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitTypeParameter: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TypeParameter, js.Any], js.Any]
      ] = js.undefined
    
    var visitTypeParameterDeclaration: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[TypeParameterDeclaration, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitTypeParameterInstantiation: js.UndefOr[
        js.ThisFunction1[
          /* this */ Context & M, 
          /* path */ NodePath[TypeParameterInstantiation, js.Any], 
          js.Any
        ]
      ] = js.undefined
    
    var visitTypeofTypeAnnotation: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TypeofTypeAnnotation, js.Any], js.Any]
      ] = js.undefined
    
    var visitUnaryExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[UnaryExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitUnionTypeAnnotation: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[UnionTypeAnnotation, js.Any], js.Any]
      ] = js.undefined
    
    var visitUpdateExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[UpdateExpression, js.Any], js.Any]
      ] = js.undefined
    
    var visitVariableDeclaration: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[VariableDeclaration, js.Any], js.Any]
      ] = js.undefined
    
    var visitVariableDeclarator: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[VariableDeclarator, js.Any], js.Any]
      ] = js.undefined
    
    var visitVariance: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Variance, js.Any], js.Any]
      ] = js.undefined
    
    var visitVoidTypeAnnotation: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[VoidTypeAnnotation, js.Any], js.Any]
      ] = js.undefined
    
    var visitWhileStatement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[WhileStatement, js.Any], js.Any]
      ] = js.undefined
    
    var visitWithStatement: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[WithStatement, js.Any], js.Any]
      ] = js.undefined
    
    var visitYieldExpression: js.UndefOr[
        js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[YieldExpression, js.Any], js.Any]
      ] = js.undefined
  }
  object Visitor {
    
    inline def apply[M](): Visitor[M] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Visitor[M]]
    }
    
    extension [Self <: Visitor[?], M](x: Self & Visitor[M]) {
      
      inline def setVisitAnyTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[AnyTypeAnnotation, js.Any], js.Any]
      ): Self = StObject.set(x, "visitAnyTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitAnyTypeAnnotationUndefined: Self = StObject.set(x, "visitAnyTypeAnnotation", js.undefined)
      
      inline def setVisitArrayExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ArrayExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitArrayExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitArrayExpressionUndefined: Self = StObject.set(x, "visitArrayExpression", js.undefined)
      
      inline def setVisitArrayPattern(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ArrayPattern, js.Any], js.Any]): Self = StObject.set(x, "visitArrayPattern", value.asInstanceOf[js.Any])
      
      inline def setVisitArrayPatternUndefined: Self = StObject.set(x, "visitArrayPattern", js.undefined)
      
      inline def setVisitArrayTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ArrayTypeAnnotation, js.Any], js.Any]
      ): Self = StObject.set(x, "visitArrayTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitArrayTypeAnnotationUndefined: Self = StObject.set(x, "visitArrayTypeAnnotation", js.undefined)
      
      inline def setVisitArrowFunctionExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ArrowFunctionExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitArrowFunctionExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitArrowFunctionExpressionUndefined: Self = StObject.set(x, "visitArrowFunctionExpression", js.undefined)
      
      inline def setVisitAssignmentExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[AssignmentExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitAssignmentExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitAssignmentExpressionUndefined: Self = StObject.set(x, "visitAssignmentExpression", js.undefined)
      
      inline def setVisitAssignmentPattern(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[AssignmentPattern, js.Any], js.Any]
      ): Self = StObject.set(x, "visitAssignmentPattern", value.asInstanceOf[js.Any])
      
      inline def setVisitAssignmentPatternUndefined: Self = StObject.set(x, "visitAssignmentPattern", js.undefined)
      
      inline def setVisitAwaitExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[AwaitExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitAwaitExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitAwaitExpressionUndefined: Self = StObject.set(x, "visitAwaitExpression", js.undefined)
      
      inline def setVisitBigIntLiteral(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[BigIntLiteral, js.Any], js.Any]
      ): Self = StObject.set(x, "visitBigIntLiteral", value.asInstanceOf[js.Any])
      
      inline def setVisitBigIntLiteralTypeAnnotation(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[BigIntLiteralTypeAnnotation, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitBigIntLiteralTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitBigIntLiteralTypeAnnotationUndefined: Self = StObject.set(x, "visitBigIntLiteralTypeAnnotation", js.undefined)
      
      inline def setVisitBigIntLiteralUndefined: Self = StObject.set(x, "visitBigIntLiteral", js.undefined)
      
      inline def setVisitBigIntTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[BigIntTypeAnnotation, js.Any], js.Any]
      ): Self = StObject.set(x, "visitBigIntTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitBigIntTypeAnnotationUndefined: Self = StObject.set(x, "visitBigIntTypeAnnotation", js.undefined)
      
      inline def setVisitBinaryExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[BinaryExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitBinaryExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitBinaryExpressionUndefined: Self = StObject.set(x, "visitBinaryExpression", js.undefined)
      
      inline def setVisitBindExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[BindExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitBindExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitBindExpressionUndefined: Self = StObject.set(x, "visitBindExpression", js.undefined)
      
      inline def setVisitBlock(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Block, js.Any], js.Any]): Self = StObject.set(x, "visitBlock", value.asInstanceOf[js.Any])
      
      inline def setVisitBlockStatement(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[BlockStatement, js.Any], js.Any]
      ): Self = StObject.set(x, "visitBlockStatement", value.asInstanceOf[js.Any])
      
      inline def setVisitBlockStatementUndefined: Self = StObject.set(x, "visitBlockStatement", js.undefined)
      
      inline def setVisitBlockUndefined: Self = StObject.set(x, "visitBlock", js.undefined)
      
      inline def setVisitBooleanLiteral(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[BooleanLiteral, js.Any], js.Any]
      ): Self = StObject.set(x, "visitBooleanLiteral", value.asInstanceOf[js.Any])
      
      inline def setVisitBooleanLiteralTypeAnnotation(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[BooleanLiteralTypeAnnotation, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitBooleanLiteralTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitBooleanLiteralTypeAnnotationUndefined: Self = StObject.set(x, "visitBooleanLiteralTypeAnnotation", js.undefined)
      
      inline def setVisitBooleanLiteralUndefined: Self = StObject.set(x, "visitBooleanLiteral", js.undefined)
      
      inline def setVisitBooleanTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[BooleanTypeAnnotation, js.Any], js.Any]
      ): Self = StObject.set(x, "visitBooleanTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitBooleanTypeAnnotationUndefined: Self = StObject.set(x, "visitBooleanTypeAnnotation", js.undefined)
      
      inline def setVisitBreakStatement(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[BreakStatement, js.Any], js.Any]
      ): Self = StObject.set(x, "visitBreakStatement", value.asInstanceOf[js.Any])
      
      inline def setVisitBreakStatementUndefined: Self = StObject.set(x, "visitBreakStatement", js.undefined)
      
      inline def setVisitCallExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[CallExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitCallExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitCallExpressionUndefined: Self = StObject.set(x, "visitCallExpression", js.undefined)
      
      inline def setVisitCatchClause(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[CatchClause, js.Any], js.Any]): Self = StObject.set(x, "visitCatchClause", value.asInstanceOf[js.Any])
      
      inline def setVisitCatchClauseUndefined: Self = StObject.set(x, "visitCatchClause", js.undefined)
      
      inline def setVisitChainElement(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ChainElement, js.Any], js.Any]): Self = StObject.set(x, "visitChainElement", value.asInstanceOf[js.Any])
      
      inline def setVisitChainElementUndefined: Self = StObject.set(x, "visitChainElement", js.undefined)
      
      inline def setVisitChainExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ChainExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitChainExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitChainExpressionUndefined: Self = StObject.set(x, "visitChainExpression", js.undefined)
      
      inline def setVisitClassBody(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ClassBody, js.Any], js.Any]): Self = StObject.set(x, "visitClassBody", value.asInstanceOf[js.Any])
      
      inline def setVisitClassBodyUndefined: Self = StObject.set(x, "visitClassBody", js.undefined)
      
      inline def setVisitClassDeclaration(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ClassDeclaration, js.Any], js.Any]
      ): Self = StObject.set(x, "visitClassDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVisitClassDeclarationUndefined: Self = StObject.set(x, "visitClassDeclaration", js.undefined)
      
      inline def setVisitClassExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ClassExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitClassExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitClassExpressionUndefined: Self = StObject.set(x, "visitClassExpression", js.undefined)
      
      inline def setVisitClassImplements(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ClassImplements, js.Any], js.Any]
      ): Self = StObject.set(x, "visitClassImplements", value.asInstanceOf[js.Any])
      
      inline def setVisitClassImplementsUndefined: Self = StObject.set(x, "visitClassImplements", js.undefined)
      
      inline def setVisitClassMethod(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ClassMethod, js.Any], js.Any]): Self = StObject.set(x, "visitClassMethod", value.asInstanceOf[js.Any])
      
      inline def setVisitClassMethodUndefined: Self = StObject.set(x, "visitClassMethod", js.undefined)
      
      inline def setVisitClassPrivateMethod(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ClassPrivateMethod, js.Any], js.Any]
      ): Self = StObject.set(x, "visitClassPrivateMethod", value.asInstanceOf[js.Any])
      
      inline def setVisitClassPrivateMethodUndefined: Self = StObject.set(x, "visitClassPrivateMethod", js.undefined)
      
      inline def setVisitClassPrivateProperty(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ClassPrivateProperty, js.Any], js.Any]
      ): Self = StObject.set(x, "visitClassPrivateProperty", value.asInstanceOf[js.Any])
      
      inline def setVisitClassPrivatePropertyUndefined: Self = StObject.set(x, "visitClassPrivateProperty", js.undefined)
      
      inline def setVisitClassProperty(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ClassProperty, js.Any], js.Any]
      ): Self = StObject.set(x, "visitClassProperty", value.asInstanceOf[js.Any])
      
      inline def setVisitClassPropertyDefinition(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ClassPropertyDefinition, js.Any], js.Any]
      ): Self = StObject.set(x, "visitClassPropertyDefinition", value.asInstanceOf[js.Any])
      
      inline def setVisitClassPropertyDefinitionUndefined: Self = StObject.set(x, "visitClassPropertyDefinition", js.undefined)
      
      inline def setVisitClassPropertyUndefined: Self = StObject.set(x, "visitClassProperty", js.undefined)
      
      inline def setVisitComment(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Comment, js.Any], js.Any]): Self = StObject.set(x, "visitComment", value.asInstanceOf[js.Any])
      
      inline def setVisitCommentBlock(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[CommentBlock, js.Any], js.Any]): Self = StObject.set(x, "visitCommentBlock", value.asInstanceOf[js.Any])
      
      inline def setVisitCommentBlockUndefined: Self = StObject.set(x, "visitCommentBlock", js.undefined)
      
      inline def setVisitCommentLine(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[CommentLine, js.Any], js.Any]): Self = StObject.set(x, "visitCommentLine", value.asInstanceOf[js.Any])
      
      inline def setVisitCommentLineUndefined: Self = StObject.set(x, "visitCommentLine", js.undefined)
      
      inline def setVisitCommentUndefined: Self = StObject.set(x, "visitComment", js.undefined)
      
      inline def setVisitComprehensionBlock(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ComprehensionBlock, js.Any], js.Any]
      ): Self = StObject.set(x, "visitComprehensionBlock", value.asInstanceOf[js.Any])
      
      inline def setVisitComprehensionBlockUndefined: Self = StObject.set(x, "visitComprehensionBlock", js.undefined)
      
      inline def setVisitComprehensionExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ComprehensionExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitComprehensionExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitComprehensionExpressionUndefined: Self = StObject.set(x, "visitComprehensionExpression", js.undefined)
      
      inline def setVisitConditionalExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ConditionalExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitConditionalExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitConditionalExpressionUndefined: Self = StObject.set(x, "visitConditionalExpression", js.undefined)
      
      inline def setVisitContinueStatement(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ContinueStatement, js.Any], js.Any]
      ): Self = StObject.set(x, "visitContinueStatement", value.asInstanceOf[js.Any])
      
      inline def setVisitContinueStatementUndefined: Self = StObject.set(x, "visitContinueStatement", js.undefined)
      
      inline def setVisitDebuggerStatement(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[DebuggerStatement, js.Any], js.Any]
      ): Self = StObject.set(x, "visitDebuggerStatement", value.asInstanceOf[js.Any])
      
      inline def setVisitDebuggerStatementUndefined: Self = StObject.set(x, "visitDebuggerStatement", js.undefined)
      
      inline def setVisitDeclaration(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Declaration, js.Any], js.Any]): Self = StObject.set(x, "visitDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVisitDeclarationUndefined: Self = StObject.set(x, "visitDeclaration", js.undefined)
      
      inline def setVisitDeclareClass(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[DeclareClass, js.Any], js.Any]): Self = StObject.set(x, "visitDeclareClass", value.asInstanceOf[js.Any])
      
      inline def setVisitDeclareClassUndefined: Self = StObject.set(x, "visitDeclareClass", js.undefined)
      
      inline def setVisitDeclareExportAllDeclaration(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[DeclareExportAllDeclaration, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitDeclareExportAllDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVisitDeclareExportAllDeclarationUndefined: Self = StObject.set(x, "visitDeclareExportAllDeclaration", js.undefined)
      
      inline def setVisitDeclareExportDeclaration(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[DeclareExportDeclaration, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitDeclareExportDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVisitDeclareExportDeclarationUndefined: Self = StObject.set(x, "visitDeclareExportDeclaration", js.undefined)
      
      inline def setVisitDeclareFunction(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[DeclareFunction, js.Any], js.Any]
      ): Self = StObject.set(x, "visitDeclareFunction", value.asInstanceOf[js.Any])
      
      inline def setVisitDeclareFunctionUndefined: Self = StObject.set(x, "visitDeclareFunction", js.undefined)
      
      inline def setVisitDeclareInterface(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[DeclareInterface, js.Any], js.Any]
      ): Self = StObject.set(x, "visitDeclareInterface", value.asInstanceOf[js.Any])
      
      inline def setVisitDeclareInterfaceUndefined: Self = StObject.set(x, "visitDeclareInterface", js.undefined)
      
      inline def setVisitDeclareModule(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[DeclareModule, js.Any], js.Any]
      ): Self = StObject.set(x, "visitDeclareModule", value.asInstanceOf[js.Any])
      
      inline def setVisitDeclareModuleExports(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[DeclareModuleExports, js.Any], js.Any]
      ): Self = StObject.set(x, "visitDeclareModuleExports", value.asInstanceOf[js.Any])
      
      inline def setVisitDeclareModuleExportsUndefined: Self = StObject.set(x, "visitDeclareModuleExports", js.undefined)
      
      inline def setVisitDeclareModuleUndefined: Self = StObject.set(x, "visitDeclareModule", js.undefined)
      
      inline def setVisitDeclareOpaqueType(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[DeclareOpaqueType, js.Any], js.Any]
      ): Self = StObject.set(x, "visitDeclareOpaqueType", value.asInstanceOf[js.Any])
      
      inline def setVisitDeclareOpaqueTypeUndefined: Self = StObject.set(x, "visitDeclareOpaqueType", js.undefined)
      
      inline def setVisitDeclareTypeAlias(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[DeclareTypeAlias, js.Any], js.Any]
      ): Self = StObject.set(x, "visitDeclareTypeAlias", value.asInstanceOf[js.Any])
      
      inline def setVisitDeclareTypeAliasUndefined: Self = StObject.set(x, "visitDeclareTypeAlias", js.undefined)
      
      inline def setVisitDeclareVariable(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[DeclareVariable, js.Any], js.Any]
      ): Self = StObject.set(x, "visitDeclareVariable", value.asInstanceOf[js.Any])
      
      inline def setVisitDeclareVariableUndefined: Self = StObject.set(x, "visitDeclareVariable", js.undefined)
      
      inline def setVisitDeclaredPredicate(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[DeclaredPredicate, js.Any], js.Any]
      ): Self = StObject.set(x, "visitDeclaredPredicate", value.asInstanceOf[js.Any])
      
      inline def setVisitDeclaredPredicateUndefined: Self = StObject.set(x, "visitDeclaredPredicate", js.undefined)
      
      inline def setVisitDecorator(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Decorator, js.Any], js.Any]): Self = StObject.set(x, "visitDecorator", value.asInstanceOf[js.Any])
      
      inline def setVisitDecoratorUndefined: Self = StObject.set(x, "visitDecorator", js.undefined)
      
      inline def setVisitDirective(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Directive, js.Any], js.Any]): Self = StObject.set(x, "visitDirective", value.asInstanceOf[js.Any])
      
      inline def setVisitDirectiveLiteral(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[DirectiveLiteral, js.Any], js.Any]
      ): Self = StObject.set(x, "visitDirectiveLiteral", value.asInstanceOf[js.Any])
      
      inline def setVisitDirectiveLiteralUndefined: Self = StObject.set(x, "visitDirectiveLiteral", js.undefined)
      
      inline def setVisitDirectiveUndefined: Self = StObject.set(x, "visitDirective", js.undefined)
      
      inline def setVisitDoExpression(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[DoExpression, js.Any], js.Any]): Self = StObject.set(x, "visitDoExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitDoExpressionUndefined: Self = StObject.set(x, "visitDoExpression", js.undefined)
      
      inline def setVisitDoWhileStatement(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[DoWhileStatement, js.Any], js.Any]
      ): Self = StObject.set(x, "visitDoWhileStatement", value.asInstanceOf[js.Any])
      
      inline def setVisitDoWhileStatementUndefined: Self = StObject.set(x, "visitDoWhileStatement", js.undefined)
      
      inline def setVisitEmptyStatement(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[EmptyStatement, js.Any], js.Any]
      ): Self = StObject.set(x, "visitEmptyStatement", value.asInstanceOf[js.Any])
      
      inline def setVisitEmptyStatementUndefined: Self = StObject.set(x, "visitEmptyStatement", js.undefined)
      
      inline def setVisitEmptyTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[EmptyTypeAnnotation, js.Any], js.Any]
      ): Self = StObject.set(x, "visitEmptyTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitEmptyTypeAnnotationUndefined: Self = StObject.set(x, "visitEmptyTypeAnnotation", js.undefined)
      
      inline def setVisitEnumBooleanBody(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[EnumBooleanBody, js.Any], js.Any]
      ): Self = StObject.set(x, "visitEnumBooleanBody", value.asInstanceOf[js.Any])
      
      inline def setVisitEnumBooleanBodyUndefined: Self = StObject.set(x, "visitEnumBooleanBody", js.undefined)
      
      inline def setVisitEnumBooleanMember(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[EnumBooleanMember, js.Any], js.Any]
      ): Self = StObject.set(x, "visitEnumBooleanMember", value.asInstanceOf[js.Any])
      
      inline def setVisitEnumBooleanMemberUndefined: Self = StObject.set(x, "visitEnumBooleanMember", js.undefined)
      
      inline def setVisitEnumDeclaration(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[EnumDeclaration, js.Any], js.Any]
      ): Self = StObject.set(x, "visitEnumDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVisitEnumDeclarationUndefined: Self = StObject.set(x, "visitEnumDeclaration", js.undefined)
      
      inline def setVisitEnumDefaultedMember(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[EnumDefaultedMember, js.Any], js.Any]
      ): Self = StObject.set(x, "visitEnumDefaultedMember", value.asInstanceOf[js.Any])
      
      inline def setVisitEnumDefaultedMemberUndefined: Self = StObject.set(x, "visitEnumDefaultedMember", js.undefined)
      
      inline def setVisitEnumNumberBody(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[EnumNumberBody, js.Any], js.Any]
      ): Self = StObject.set(x, "visitEnumNumberBody", value.asInstanceOf[js.Any])
      
      inline def setVisitEnumNumberBodyUndefined: Self = StObject.set(x, "visitEnumNumberBody", js.undefined)
      
      inline def setVisitEnumNumberMember(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[EnumNumberMember, js.Any], js.Any]
      ): Self = StObject.set(x, "visitEnumNumberMember", value.asInstanceOf[js.Any])
      
      inline def setVisitEnumNumberMemberUndefined: Self = StObject.set(x, "visitEnumNumberMember", js.undefined)
      
      inline def setVisitEnumStringBody(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[EnumStringBody, js.Any], js.Any]
      ): Self = StObject.set(x, "visitEnumStringBody", value.asInstanceOf[js.Any])
      
      inline def setVisitEnumStringBodyUndefined: Self = StObject.set(x, "visitEnumStringBody", js.undefined)
      
      inline def setVisitEnumStringMember(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[EnumStringMember, js.Any], js.Any]
      ): Self = StObject.set(x, "visitEnumStringMember", value.asInstanceOf[js.Any])
      
      inline def setVisitEnumStringMemberUndefined: Self = StObject.set(x, "visitEnumStringMember", js.undefined)
      
      inline def setVisitEnumSymbolBody(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[EnumSymbolBody, js.Any], js.Any]
      ): Self = StObject.set(x, "visitEnumSymbolBody", value.asInstanceOf[js.Any])
      
      inline def setVisitEnumSymbolBodyUndefined: Self = StObject.set(x, "visitEnumSymbolBody", js.undefined)
      
      inline def setVisitExistentialTypeParam(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ExistentialTypeParam, js.Any], js.Any]
      ): Self = StObject.set(x, "visitExistentialTypeParam", value.asInstanceOf[js.Any])
      
      inline def setVisitExistentialTypeParamUndefined: Self = StObject.set(x, "visitExistentialTypeParam", js.undefined)
      
      inline def setVisitExistsTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ExistsTypeAnnotation, js.Any], js.Any]
      ): Self = StObject.set(x, "visitExistsTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitExistsTypeAnnotationUndefined: Self = StObject.set(x, "visitExistsTypeAnnotation", js.undefined)
      
      inline def setVisitExportAllDeclaration(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ExportAllDeclaration, js.Any], js.Any]
      ): Self = StObject.set(x, "visitExportAllDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVisitExportAllDeclarationUndefined: Self = StObject.set(x, "visitExportAllDeclaration", js.undefined)
      
      inline def setVisitExportBatchSpecifier(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ExportBatchSpecifier, js.Any], js.Any]
      ): Self = StObject.set(x, "visitExportBatchSpecifier", value.asInstanceOf[js.Any])
      
      inline def setVisitExportBatchSpecifierUndefined: Self = StObject.set(x, "visitExportBatchSpecifier", js.undefined)
      
      inline def setVisitExportDeclaration(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ExportDeclaration, js.Any], js.Any]
      ): Self = StObject.set(x, "visitExportDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVisitExportDeclarationUndefined: Self = StObject.set(x, "visitExportDeclaration", js.undefined)
      
      inline def setVisitExportDefaultDeclaration(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[ExportDefaultDeclaration, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitExportDefaultDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVisitExportDefaultDeclarationUndefined: Self = StObject.set(x, "visitExportDefaultDeclaration", js.undefined)
      
      inline def setVisitExportDefaultSpecifier(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ExportDefaultSpecifier, js.Any], js.Any]
      ): Self = StObject.set(x, "visitExportDefaultSpecifier", value.asInstanceOf[js.Any])
      
      inline def setVisitExportDefaultSpecifierUndefined: Self = StObject.set(x, "visitExportDefaultSpecifier", js.undefined)
      
      inline def setVisitExportNamedDeclaration(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ExportNamedDeclaration, js.Any], js.Any]
      ): Self = StObject.set(x, "visitExportNamedDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVisitExportNamedDeclarationUndefined: Self = StObject.set(x, "visitExportNamedDeclaration", js.undefined)
      
      inline def setVisitExportNamespaceSpecifier(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[ExportNamespaceSpecifier, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitExportNamespaceSpecifier", value.asInstanceOf[js.Any])
      
      inline def setVisitExportNamespaceSpecifierUndefined: Self = StObject.set(x, "visitExportNamespaceSpecifier", js.undefined)
      
      inline def setVisitExportSpecifier(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ExportSpecifier, js.Any], js.Any]
      ): Self = StObject.set(x, "visitExportSpecifier", value.asInstanceOf[js.Any])
      
      inline def setVisitExportSpecifierUndefined: Self = StObject.set(x, "visitExportSpecifier", js.undefined)
      
      inline def setVisitExpression(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Expression, js.Any], js.Any]): Self = StObject.set(x, "visitExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitExpressionStatement(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ExpressionStatement, js.Any], js.Any]
      ): Self = StObject.set(x, "visitExpressionStatement", value.asInstanceOf[js.Any])
      
      inline def setVisitExpressionStatementUndefined: Self = StObject.set(x, "visitExpressionStatement", js.undefined)
      
      inline def setVisitExpressionUndefined: Self = StObject.set(x, "visitExpression", js.undefined)
      
      inline def setVisitFile(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[File, js.Any], js.Any]): Self = StObject.set(x, "visitFile", value.asInstanceOf[js.Any])
      
      inline def setVisitFileUndefined: Self = StObject.set(x, "visitFile", js.undefined)
      
      inline def setVisitFlow(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Flow, js.Any], js.Any]): Self = StObject.set(x, "visitFlow", value.asInstanceOf[js.Any])
      
      inline def setVisitFlowPredicate(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[FlowPredicate, js.Any], js.Any]
      ): Self = StObject.set(x, "visitFlowPredicate", value.asInstanceOf[js.Any])
      
      inline def setVisitFlowPredicateUndefined: Self = StObject.set(x, "visitFlowPredicate", js.undefined)
      
      inline def setVisitFlowType(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[FlowType, js.Any], js.Any]): Self = StObject.set(x, "visitFlowType", value.asInstanceOf[js.Any])
      
      inline def setVisitFlowTypeUndefined: Self = StObject.set(x, "visitFlowType", js.undefined)
      
      inline def setVisitFlowUndefined: Self = StObject.set(x, "visitFlow", js.undefined)
      
      inline def setVisitForAwaitStatement(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ForAwaitStatement, js.Any], js.Any]
      ): Self = StObject.set(x, "visitForAwaitStatement", value.asInstanceOf[js.Any])
      
      inline def setVisitForAwaitStatementUndefined: Self = StObject.set(x, "visitForAwaitStatement", js.undefined)
      
      inline def setVisitForInStatement(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ForInStatement, js.Any], js.Any]
      ): Self = StObject.set(x, "visitForInStatement", value.asInstanceOf[js.Any])
      
      inline def setVisitForInStatementUndefined: Self = StObject.set(x, "visitForInStatement", js.undefined)
      
      inline def setVisitForOfStatement(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ForOfStatement, js.Any], js.Any]
      ): Self = StObject.set(x, "visitForOfStatement", value.asInstanceOf[js.Any])
      
      inline def setVisitForOfStatementUndefined: Self = StObject.set(x, "visitForOfStatement", js.undefined)
      
      inline def setVisitForStatement(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ForStatement, js.Any], js.Any]): Self = StObject.set(x, "visitForStatement", value.asInstanceOf[js.Any])
      
      inline def setVisitForStatementUndefined: Self = StObject.set(x, "visitForStatement", js.undefined)
      
      inline def setVisitFunction(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Function, js.Any], js.Any]): Self = StObject.set(x, "visitFunction", value.asInstanceOf[js.Any])
      
      inline def setVisitFunctionDeclaration(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[FunctionDeclaration, js.Any], js.Any]
      ): Self = StObject.set(x, "visitFunctionDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVisitFunctionDeclarationUndefined: Self = StObject.set(x, "visitFunctionDeclaration", js.undefined)
      
      inline def setVisitFunctionExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[FunctionExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitFunctionExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitFunctionExpressionUndefined: Self = StObject.set(x, "visitFunctionExpression", js.undefined)
      
      inline def setVisitFunctionTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[FunctionTypeAnnotation, js.Any], js.Any]
      ): Self = StObject.set(x, "visitFunctionTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitFunctionTypeAnnotationUndefined: Self = StObject.set(x, "visitFunctionTypeAnnotation", js.undefined)
      
      inline def setVisitFunctionTypeParam(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[FunctionTypeParam, js.Any], js.Any]
      ): Self = StObject.set(x, "visitFunctionTypeParam", value.asInstanceOf[js.Any])
      
      inline def setVisitFunctionTypeParamUndefined: Self = StObject.set(x, "visitFunctionTypeParam", js.undefined)
      
      inline def setVisitFunctionUndefined: Self = StObject.set(x, "visitFunction", js.undefined)
      
      inline def setVisitGeneratorExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[GeneratorExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitGeneratorExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitGeneratorExpressionUndefined: Self = StObject.set(x, "visitGeneratorExpression", js.undefined)
      
      inline def setVisitGenericTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[GenericTypeAnnotation, js.Any], js.Any]
      ): Self = StObject.set(x, "visitGenericTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitGenericTypeAnnotationUndefined: Self = StObject.set(x, "visitGenericTypeAnnotation", js.undefined)
      
      inline def setVisitIdentifier(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Identifier, js.Any], js.Any]): Self = StObject.set(x, "visitIdentifier", value.asInstanceOf[js.Any])
      
      inline def setVisitIdentifierUndefined: Self = StObject.set(x, "visitIdentifier", js.undefined)
      
      inline def setVisitIfStatement(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[IfStatement, js.Any], js.Any]): Self = StObject.set(x, "visitIfStatement", value.asInstanceOf[js.Any])
      
      inline def setVisitIfStatementUndefined: Self = StObject.set(x, "visitIfStatement", js.undefined)
      
      inline def setVisitImport(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Import, js.Any], js.Any]): Self = StObject.set(x, "visitImport", value.asInstanceOf[js.Any])
      
      inline def setVisitImportDeclaration(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ImportDeclaration, js.Any], js.Any]
      ): Self = StObject.set(x, "visitImportDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVisitImportDeclarationUndefined: Self = StObject.set(x, "visitImportDeclaration", js.undefined)
      
      inline def setVisitImportDefaultSpecifier(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ImportDefaultSpecifier, js.Any], js.Any]
      ): Self = StObject.set(x, "visitImportDefaultSpecifier", value.asInstanceOf[js.Any])
      
      inline def setVisitImportDefaultSpecifierUndefined: Self = StObject.set(x, "visitImportDefaultSpecifier", js.undefined)
      
      inline def setVisitImportExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ImportExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitImportExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitImportExpressionUndefined: Self = StObject.set(x, "visitImportExpression", js.undefined)
      
      inline def setVisitImportNamespaceSpecifier(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[ImportNamespaceSpecifier, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitImportNamespaceSpecifier", value.asInstanceOf[js.Any])
      
      inline def setVisitImportNamespaceSpecifierUndefined: Self = StObject.set(x, "visitImportNamespaceSpecifier", js.undefined)
      
      inline def setVisitImportSpecifier(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ImportSpecifier, js.Any], js.Any]
      ): Self = StObject.set(x, "visitImportSpecifier", value.asInstanceOf[js.Any])
      
      inline def setVisitImportSpecifierUndefined: Self = StObject.set(x, "visitImportSpecifier", js.undefined)
      
      inline def setVisitImportUndefined: Self = StObject.set(x, "visitImport", js.undefined)
      
      inline def setVisitInferredPredicate(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[InferredPredicate, js.Any], js.Any]
      ): Self = StObject.set(x, "visitInferredPredicate", value.asInstanceOf[js.Any])
      
      inline def setVisitInferredPredicateUndefined: Self = StObject.set(x, "visitInferredPredicate", js.undefined)
      
      inline def setVisitInterfaceDeclaration(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[InterfaceDeclaration, js.Any], js.Any]
      ): Self = StObject.set(x, "visitInterfaceDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVisitInterfaceDeclarationUndefined: Self = StObject.set(x, "visitInterfaceDeclaration", js.undefined)
      
      inline def setVisitInterfaceExtends(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[InterfaceExtends, js.Any], js.Any]
      ): Self = StObject.set(x, "visitInterfaceExtends", value.asInstanceOf[js.Any])
      
      inline def setVisitInterfaceExtendsUndefined: Self = StObject.set(x, "visitInterfaceExtends", js.undefined)
      
      inline def setVisitInterfaceTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[InterfaceTypeAnnotation, js.Any], js.Any]
      ): Self = StObject.set(x, "visitInterfaceTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitInterfaceTypeAnnotationUndefined: Self = StObject.set(x, "visitInterfaceTypeAnnotation", js.undefined)
      
      inline def setVisitInterpreterDirective(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[InterpreterDirective, js.Any], js.Any]
      ): Self = StObject.set(x, "visitInterpreterDirective", value.asInstanceOf[js.Any])
      
      inline def setVisitInterpreterDirectiveUndefined: Self = StObject.set(x, "visitInterpreterDirective", js.undefined)
      
      inline def setVisitIntersectionTypeAnnotation(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[IntersectionTypeAnnotation, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitIntersectionTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitIntersectionTypeAnnotationUndefined: Self = StObject.set(x, "visitIntersectionTypeAnnotation", js.undefined)
      
      inline def setVisitJSXAttribute(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXAttribute, js.Any], js.Any]): Self = StObject.set(x, "visitJSXAttribute", value.asInstanceOf[js.Any])
      
      inline def setVisitJSXAttributeUndefined: Self = StObject.set(x, "visitJSXAttribute", js.undefined)
      
      inline def setVisitJSXClosingElement(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXClosingElement, js.Any], js.Any]
      ): Self = StObject.set(x, "visitJSXClosingElement", value.asInstanceOf[js.Any])
      
      inline def setVisitJSXClosingElementUndefined: Self = StObject.set(x, "visitJSXClosingElement", js.undefined)
      
      inline def setVisitJSXClosingFragment(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXClosingFragment, js.Any], js.Any]
      ): Self = StObject.set(x, "visitJSXClosingFragment", value.asInstanceOf[js.Any])
      
      inline def setVisitJSXClosingFragmentUndefined: Self = StObject.set(x, "visitJSXClosingFragment", js.undefined)
      
      inline def setVisitJSXElement(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXElement, js.Any], js.Any]): Self = StObject.set(x, "visitJSXElement", value.asInstanceOf[js.Any])
      
      inline def setVisitJSXElementUndefined: Self = StObject.set(x, "visitJSXElement", js.undefined)
      
      inline def setVisitJSXEmptyExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXEmptyExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitJSXEmptyExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitJSXEmptyExpressionUndefined: Self = StObject.set(x, "visitJSXEmptyExpression", js.undefined)
      
      inline def setVisitJSXExpressionContainer(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXExpressionContainer, js.Any], js.Any]
      ): Self = StObject.set(x, "visitJSXExpressionContainer", value.asInstanceOf[js.Any])
      
      inline def setVisitJSXExpressionContainerUndefined: Self = StObject.set(x, "visitJSXExpressionContainer", js.undefined)
      
      inline def setVisitJSXFragment(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXFragment, js.Any], js.Any]): Self = StObject.set(x, "visitJSXFragment", value.asInstanceOf[js.Any])
      
      inline def setVisitJSXFragmentUndefined: Self = StObject.set(x, "visitJSXFragment", js.undefined)
      
      inline def setVisitJSXIdentifier(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXIdentifier, js.Any], js.Any]
      ): Self = StObject.set(x, "visitJSXIdentifier", value.asInstanceOf[js.Any])
      
      inline def setVisitJSXIdentifierUndefined: Self = StObject.set(x, "visitJSXIdentifier", js.undefined)
      
      inline def setVisitJSXMemberExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXMemberExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitJSXMemberExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitJSXMemberExpressionUndefined: Self = StObject.set(x, "visitJSXMemberExpression", js.undefined)
      
      inline def setVisitJSXNamespacedName(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXNamespacedName, js.Any], js.Any]
      ): Self = StObject.set(x, "visitJSXNamespacedName", value.asInstanceOf[js.Any])
      
      inline def setVisitJSXNamespacedNameUndefined: Self = StObject.set(x, "visitJSXNamespacedName", js.undefined)
      
      inline def setVisitJSXOpeningElement(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXOpeningElement, js.Any], js.Any]
      ): Self = StObject.set(x, "visitJSXOpeningElement", value.asInstanceOf[js.Any])
      
      inline def setVisitJSXOpeningElementUndefined: Self = StObject.set(x, "visitJSXOpeningElement", js.undefined)
      
      inline def setVisitJSXOpeningFragment(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXOpeningFragment, js.Any], js.Any]
      ): Self = StObject.set(x, "visitJSXOpeningFragment", value.asInstanceOf[js.Any])
      
      inline def setVisitJSXOpeningFragmentUndefined: Self = StObject.set(x, "visitJSXOpeningFragment", js.undefined)
      
      inline def setVisitJSXSpreadAttribute(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXSpreadAttribute, js.Any], js.Any]
      ): Self = StObject.set(x, "visitJSXSpreadAttribute", value.asInstanceOf[js.Any])
      
      inline def setVisitJSXSpreadAttributeUndefined: Self = StObject.set(x, "visitJSXSpreadAttribute", js.undefined)
      
      inline def setVisitJSXSpreadChild(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXSpreadChild, js.Any], js.Any]
      ): Self = StObject.set(x, "visitJSXSpreadChild", value.asInstanceOf[js.Any])
      
      inline def setVisitJSXSpreadChildUndefined: Self = StObject.set(x, "visitJSXSpreadChild", js.undefined)
      
      inline def setVisitJSXText(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[JSXText, js.Any], js.Any]): Self = StObject.set(x, "visitJSXText", value.asInstanceOf[js.Any])
      
      inline def setVisitJSXTextUndefined: Self = StObject.set(x, "visitJSXText", js.undefined)
      
      inline def setVisitLabeledStatement(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[LabeledStatement, js.Any], js.Any]
      ): Self = StObject.set(x, "visitLabeledStatement", value.asInstanceOf[js.Any])
      
      inline def setVisitLabeledStatementUndefined: Self = StObject.set(x, "visitLabeledStatement", js.undefined)
      
      inline def setVisitLine(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Line, js.Any], js.Any]): Self = StObject.set(x, "visitLine", value.asInstanceOf[js.Any])
      
      inline def setVisitLineUndefined: Self = StObject.set(x, "visitLine", js.undefined)
      
      inline def setVisitLiteral(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Literal, js.Any], js.Any]): Self = StObject.set(x, "visitLiteral", value.asInstanceOf[js.Any])
      
      inline def setVisitLiteralUndefined: Self = StObject.set(x, "visitLiteral", js.undefined)
      
      inline def setVisitLogicalExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[LogicalExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitLogicalExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitLogicalExpressionUndefined: Self = StObject.set(x, "visitLogicalExpression", js.undefined)
      
      inline def setVisitMemberExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[MemberExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitMemberExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitMemberExpressionUndefined: Self = StObject.set(x, "visitMemberExpression", js.undefined)
      
      inline def setVisitMemberTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[MemberTypeAnnotation, js.Any], js.Any]
      ): Self = StObject.set(x, "visitMemberTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitMemberTypeAnnotationUndefined: Self = StObject.set(x, "visitMemberTypeAnnotation", js.undefined)
      
      inline def setVisitMetaProperty(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[MetaProperty, js.Any], js.Any]): Self = StObject.set(x, "visitMetaProperty", value.asInstanceOf[js.Any])
      
      inline def setVisitMetaPropertyUndefined: Self = StObject.set(x, "visitMetaProperty", js.undefined)
      
      inline def setVisitMethodDefinition(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[MethodDefinition, js.Any], js.Any]
      ): Self = StObject.set(x, "visitMethodDefinition", value.asInstanceOf[js.Any])
      
      inline def setVisitMethodDefinitionUndefined: Self = StObject.set(x, "visitMethodDefinition", js.undefined)
      
      inline def setVisitMixedTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[MixedTypeAnnotation, js.Any], js.Any]
      ): Self = StObject.set(x, "visitMixedTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitMixedTypeAnnotationUndefined: Self = StObject.set(x, "visitMixedTypeAnnotation", js.undefined)
      
      inline def setVisitModuleSpecifier(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ModuleSpecifier, js.Any], js.Any]
      ): Self = StObject.set(x, "visitModuleSpecifier", value.asInstanceOf[js.Any])
      
      inline def setVisitModuleSpecifierUndefined: Self = StObject.set(x, "visitModuleSpecifier", js.undefined)
      
      inline def setVisitNewExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[NewExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitNewExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitNewExpressionUndefined: Self = StObject.set(x, "visitNewExpression", js.undefined)
      
      inline def setVisitNode(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Node, js.Any], js.Any]): Self = StObject.set(x, "visitNode", value.asInstanceOf[js.Any])
      
      inline def setVisitNodeUndefined: Self = StObject.set(x, "visitNode", js.undefined)
      
      inline def setVisitNoop(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Noop, js.Any], js.Any]): Self = StObject.set(x, "visitNoop", value.asInstanceOf[js.Any])
      
      inline def setVisitNoopUndefined: Self = StObject.set(x, "visitNoop", js.undefined)
      
      inline def setVisitNullLiteral(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[NullLiteral, js.Any], js.Any]): Self = StObject.set(x, "visitNullLiteral", value.asInstanceOf[js.Any])
      
      inline def setVisitNullLiteralTypeAnnotation(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[NullLiteralTypeAnnotation, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitNullLiteralTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitNullLiteralTypeAnnotationUndefined: Self = StObject.set(x, "visitNullLiteralTypeAnnotation", js.undefined)
      
      inline def setVisitNullLiteralUndefined: Self = StObject.set(x, "visitNullLiteral", js.undefined)
      
      inline def setVisitNullTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[NullTypeAnnotation, js.Any], js.Any]
      ): Self = StObject.set(x, "visitNullTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitNullTypeAnnotationUndefined: Self = StObject.set(x, "visitNullTypeAnnotation", js.undefined)
      
      inline def setVisitNullableTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[NullableTypeAnnotation, js.Any], js.Any]
      ): Self = StObject.set(x, "visitNullableTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitNullableTypeAnnotationUndefined: Self = StObject.set(x, "visitNullableTypeAnnotation", js.undefined)
      
      inline def setVisitNumberLiteralTypeAnnotation(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[NumberLiteralTypeAnnotation, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitNumberLiteralTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitNumberLiteralTypeAnnotationUndefined: Self = StObject.set(x, "visitNumberLiteralTypeAnnotation", js.undefined)
      
      inline def setVisitNumberTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[NumberTypeAnnotation, js.Any], js.Any]
      ): Self = StObject.set(x, "visitNumberTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitNumberTypeAnnotationUndefined: Self = StObject.set(x, "visitNumberTypeAnnotation", js.undefined)
      
      inline def setVisitNumericLiteral(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[NumericLiteral, js.Any], js.Any]
      ): Self = StObject.set(x, "visitNumericLiteral", value.asInstanceOf[js.Any])
      
      inline def setVisitNumericLiteralTypeAnnotation(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[NumericLiteralTypeAnnotation, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitNumericLiteralTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitNumericLiteralTypeAnnotationUndefined: Self = StObject.set(x, "visitNumericLiteralTypeAnnotation", js.undefined)
      
      inline def setVisitNumericLiteralUndefined: Self = StObject.set(x, "visitNumericLiteral", js.undefined)
      
      inline def setVisitObjectExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ObjectExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitObjectExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitObjectExpressionUndefined: Self = StObject.set(x, "visitObjectExpression", js.undefined)
      
      inline def setVisitObjectMethod(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ObjectMethod, js.Any], js.Any]): Self = StObject.set(x, "visitObjectMethod", value.asInstanceOf[js.Any])
      
      inline def setVisitObjectMethodUndefined: Self = StObject.set(x, "visitObjectMethod", js.undefined)
      
      inline def setVisitObjectPattern(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ObjectPattern, js.Any], js.Any]
      ): Self = StObject.set(x, "visitObjectPattern", value.asInstanceOf[js.Any])
      
      inline def setVisitObjectPatternUndefined: Self = StObject.set(x, "visitObjectPattern", js.undefined)
      
      inline def setVisitObjectProperty(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ObjectProperty, js.Any], js.Any]
      ): Self = StObject.set(x, "visitObjectProperty", value.asInstanceOf[js.Any])
      
      inline def setVisitObjectPropertyUndefined: Self = StObject.set(x, "visitObjectProperty", js.undefined)
      
      inline def setVisitObjectTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ObjectTypeAnnotation, js.Any], js.Any]
      ): Self = StObject.set(x, "visitObjectTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitObjectTypeAnnotationUndefined: Self = StObject.set(x, "visitObjectTypeAnnotation", js.undefined)
      
      inline def setVisitObjectTypeCallProperty(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ObjectTypeCallProperty, js.Any], js.Any]
      ): Self = StObject.set(x, "visitObjectTypeCallProperty", value.asInstanceOf[js.Any])
      
      inline def setVisitObjectTypeCallPropertyUndefined: Self = StObject.set(x, "visitObjectTypeCallProperty", js.undefined)
      
      inline def setVisitObjectTypeIndexer(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ObjectTypeIndexer, js.Any], js.Any]
      ): Self = StObject.set(x, "visitObjectTypeIndexer", value.asInstanceOf[js.Any])
      
      inline def setVisitObjectTypeIndexerUndefined: Self = StObject.set(x, "visitObjectTypeIndexer", js.undefined)
      
      inline def setVisitObjectTypeInternalSlot(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ObjectTypeInternalSlot, js.Any], js.Any]
      ): Self = StObject.set(x, "visitObjectTypeInternalSlot", value.asInstanceOf[js.Any])
      
      inline def setVisitObjectTypeInternalSlotUndefined: Self = StObject.set(x, "visitObjectTypeInternalSlot", js.undefined)
      
      inline def setVisitObjectTypeProperty(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ObjectTypeProperty, js.Any], js.Any]
      ): Self = StObject.set(x, "visitObjectTypeProperty", value.asInstanceOf[js.Any])
      
      inline def setVisitObjectTypePropertyUndefined: Self = StObject.set(x, "visitObjectTypeProperty", js.undefined)
      
      inline def setVisitObjectTypeSpreadProperty(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[ObjectTypeSpreadProperty, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitObjectTypeSpreadProperty", value.asInstanceOf[js.Any])
      
      inline def setVisitObjectTypeSpreadPropertyUndefined: Self = StObject.set(x, "visitObjectTypeSpreadProperty", js.undefined)
      
      inline def setVisitOpaqueType(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[OpaqueType, js.Any], js.Any]): Self = StObject.set(x, "visitOpaqueType", value.asInstanceOf[js.Any])
      
      inline def setVisitOpaqueTypeUndefined: Self = StObject.set(x, "visitOpaqueType", js.undefined)
      
      inline def setVisitOptionalCallExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[OptionalCallExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitOptionalCallExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitOptionalCallExpressionUndefined: Self = StObject.set(x, "visitOptionalCallExpression", js.undefined)
      
      inline def setVisitOptionalMemberExpression(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[OptionalMemberExpression, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitOptionalMemberExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitOptionalMemberExpressionUndefined: Self = StObject.set(x, "visitOptionalMemberExpression", js.undefined)
      
      inline def setVisitParenthesizedExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ParenthesizedExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitParenthesizedExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitParenthesizedExpressionUndefined: Self = StObject.set(x, "visitParenthesizedExpression", js.undefined)
      
      inline def setVisitPattern(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Pattern, js.Any], js.Any]): Self = StObject.set(x, "visitPattern", value.asInstanceOf[js.Any])
      
      inline def setVisitPatternUndefined: Self = StObject.set(x, "visitPattern", js.undefined)
      
      inline def setVisitPosition(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Position, js.Any], js.Any]): Self = StObject.set(x, "visitPosition", value.asInstanceOf[js.Any])
      
      inline def setVisitPositionUndefined: Self = StObject.set(x, "visitPosition", js.undefined)
      
      inline def setVisitPrintable(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Printable, js.Any], js.Any]): Self = StObject.set(x, "visitPrintable", value.asInstanceOf[js.Any])
      
      inline def setVisitPrintableUndefined: Self = StObject.set(x, "visitPrintable", js.undefined)
      
      inline def setVisitPrivateName(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[PrivateName, js.Any], js.Any]): Self = StObject.set(x, "visitPrivateName", value.asInstanceOf[js.Any])
      
      inline def setVisitPrivateNameUndefined: Self = StObject.set(x, "visitPrivateName", js.undefined)
      
      inline def setVisitProgram(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Program, js.Any], js.Any]): Self = StObject.set(x, "visitProgram", value.asInstanceOf[js.Any])
      
      inline def setVisitProgramUndefined: Self = StObject.set(x, "visitProgram", js.undefined)
      
      inline def setVisitProperty(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Property, js.Any], js.Any]): Self = StObject.set(x, "visitProperty", value.asInstanceOf[js.Any])
      
      inline def setVisitPropertyPattern(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[PropertyPattern, js.Any], js.Any]
      ): Self = StObject.set(x, "visitPropertyPattern", value.asInstanceOf[js.Any])
      
      inline def setVisitPropertyPatternUndefined: Self = StObject.set(x, "visitPropertyPattern", js.undefined)
      
      inline def setVisitPropertyUndefined: Self = StObject.set(x, "visitProperty", js.undefined)
      
      inline def setVisitQualifiedTypeIdentifier(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[QualifiedTypeIdentifier, js.Any], js.Any]
      ): Self = StObject.set(x, "visitQualifiedTypeIdentifier", value.asInstanceOf[js.Any])
      
      inline def setVisitQualifiedTypeIdentifierUndefined: Self = StObject.set(x, "visitQualifiedTypeIdentifier", js.undefined)
      
      inline def setVisitRegExpLiteral(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[RegExpLiteral, js.Any], js.Any]
      ): Self = StObject.set(x, "visitRegExpLiteral", value.asInstanceOf[js.Any])
      
      inline def setVisitRegExpLiteralUndefined: Self = StObject.set(x, "visitRegExpLiteral", js.undefined)
      
      inline def setVisitRestElement(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[RestElement, js.Any], js.Any]): Self = StObject.set(x, "visitRestElement", value.asInstanceOf[js.Any])
      
      inline def setVisitRestElementUndefined: Self = StObject.set(x, "visitRestElement", js.undefined)
      
      inline def setVisitRestProperty(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[RestProperty, js.Any], js.Any]): Self = StObject.set(x, "visitRestProperty", value.asInstanceOf[js.Any])
      
      inline def setVisitRestPropertyUndefined: Self = StObject.set(x, "visitRestProperty", js.undefined)
      
      inline def setVisitReturnStatement(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ReturnStatement, js.Any], js.Any]
      ): Self = StObject.set(x, "visitReturnStatement", value.asInstanceOf[js.Any])
      
      inline def setVisitReturnStatementUndefined: Self = StObject.set(x, "visitReturnStatement", js.undefined)
      
      inline def setVisitSequenceExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[SequenceExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitSequenceExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitSequenceExpressionUndefined: Self = StObject.set(x, "visitSequenceExpression", js.undefined)
      
      inline def setVisitSourceLocation(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[SourceLocation, js.Any], js.Any]
      ): Self = StObject.set(x, "visitSourceLocation", value.asInstanceOf[js.Any])
      
      inline def setVisitSourceLocationUndefined: Self = StObject.set(x, "visitSourceLocation", js.undefined)
      
      inline def setVisitSpecifier(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Specifier, js.Any], js.Any]): Self = StObject.set(x, "visitSpecifier", value.asInstanceOf[js.Any])
      
      inline def setVisitSpecifierUndefined: Self = StObject.set(x, "visitSpecifier", js.undefined)
      
      inline def setVisitSpreadElement(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[SpreadElement, js.Any], js.Any]
      ): Self = StObject.set(x, "visitSpreadElement", value.asInstanceOf[js.Any])
      
      inline def setVisitSpreadElementPattern(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[SpreadElementPattern, js.Any], js.Any]
      ): Self = StObject.set(x, "visitSpreadElementPattern", value.asInstanceOf[js.Any])
      
      inline def setVisitSpreadElementPatternUndefined: Self = StObject.set(x, "visitSpreadElementPattern", js.undefined)
      
      inline def setVisitSpreadElementUndefined: Self = StObject.set(x, "visitSpreadElement", js.undefined)
      
      inline def setVisitSpreadProperty(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[SpreadProperty, js.Any], js.Any]
      ): Self = StObject.set(x, "visitSpreadProperty", value.asInstanceOf[js.Any])
      
      inline def setVisitSpreadPropertyPattern(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[SpreadPropertyPattern, js.Any], js.Any]
      ): Self = StObject.set(x, "visitSpreadPropertyPattern", value.asInstanceOf[js.Any])
      
      inline def setVisitSpreadPropertyPatternUndefined: Self = StObject.set(x, "visitSpreadPropertyPattern", js.undefined)
      
      inline def setVisitSpreadPropertyUndefined: Self = StObject.set(x, "visitSpreadProperty", js.undefined)
      
      inline def setVisitStatement(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Statement, js.Any], js.Any]): Self = StObject.set(x, "visitStatement", value.asInstanceOf[js.Any])
      
      inline def setVisitStatementUndefined: Self = StObject.set(x, "visitStatement", js.undefined)
      
      inline def setVisitStringLiteral(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[StringLiteral, js.Any], js.Any]
      ): Self = StObject.set(x, "visitStringLiteral", value.asInstanceOf[js.Any])
      
      inline def setVisitStringLiteralTypeAnnotation(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[StringLiteralTypeAnnotation, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitStringLiteralTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitStringLiteralTypeAnnotationUndefined: Self = StObject.set(x, "visitStringLiteralTypeAnnotation", js.undefined)
      
      inline def setVisitStringLiteralUndefined: Self = StObject.set(x, "visitStringLiteral", js.undefined)
      
      inline def setVisitStringTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[StringTypeAnnotation, js.Any], js.Any]
      ): Self = StObject.set(x, "visitStringTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitStringTypeAnnotationUndefined: Self = StObject.set(x, "visitStringTypeAnnotation", js.undefined)
      
      inline def setVisitSuper(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Super, js.Any], js.Any]): Self = StObject.set(x, "visitSuper", value.asInstanceOf[js.Any])
      
      inline def setVisitSuperUndefined: Self = StObject.set(x, "visitSuper", js.undefined)
      
      inline def setVisitSwitchCase(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[SwitchCase, js.Any], js.Any]): Self = StObject.set(x, "visitSwitchCase", value.asInstanceOf[js.Any])
      
      inline def setVisitSwitchCaseUndefined: Self = StObject.set(x, "visitSwitchCase", js.undefined)
      
      inline def setVisitSwitchStatement(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[SwitchStatement, js.Any], js.Any]
      ): Self = StObject.set(x, "visitSwitchStatement", value.asInstanceOf[js.Any])
      
      inline def setVisitSwitchStatementUndefined: Self = StObject.set(x, "visitSwitchStatement", js.undefined)
      
      inline def setVisitSymbolTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[SymbolTypeAnnotation, js.Any], js.Any]
      ): Self = StObject.set(x, "visitSymbolTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitSymbolTypeAnnotationUndefined: Self = StObject.set(x, "visitSymbolTypeAnnotation", js.undefined)
      
      inline def setVisitTSAnyKeyword(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSAnyKeyword, js.Any], js.Any]): Self = StObject.set(x, "visitTSAnyKeyword", value.asInstanceOf[js.Any])
      
      inline def setVisitTSAnyKeywordUndefined: Self = StObject.set(x, "visitTSAnyKeyword", js.undefined)
      
      inline def setVisitTSArrayType(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSArrayType, js.Any], js.Any]): Self = StObject.set(x, "visitTSArrayType", value.asInstanceOf[js.Any])
      
      inline def setVisitTSArrayTypeUndefined: Self = StObject.set(x, "visitTSArrayType", js.undefined)
      
      inline def setVisitTSAsExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSAsExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSAsExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitTSAsExpressionUndefined: Self = StObject.set(x, "visitTSAsExpression", js.undefined)
      
      inline def setVisitTSBigIntKeyword(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSBigIntKeyword, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSBigIntKeyword", value.asInstanceOf[js.Any])
      
      inline def setVisitTSBigIntKeywordUndefined: Self = StObject.set(x, "visitTSBigIntKeyword", js.undefined)
      
      inline def setVisitTSBooleanKeyword(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSBooleanKeyword, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSBooleanKeyword", value.asInstanceOf[js.Any])
      
      inline def setVisitTSBooleanKeywordUndefined: Self = StObject.set(x, "visitTSBooleanKeyword", js.undefined)
      
      inline def setVisitTSCallSignatureDeclaration(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[TSCallSignatureDeclaration, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitTSCallSignatureDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVisitTSCallSignatureDeclarationUndefined: Self = StObject.set(x, "visitTSCallSignatureDeclaration", js.undefined)
      
      inline def setVisitTSConditionalType(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSConditionalType, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSConditionalType", value.asInstanceOf[js.Any])
      
      inline def setVisitTSConditionalTypeUndefined: Self = StObject.set(x, "visitTSConditionalType", js.undefined)
      
      inline def setVisitTSConstructSignatureDeclaration(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[TSConstructSignatureDeclaration, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitTSConstructSignatureDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVisitTSConstructSignatureDeclarationUndefined: Self = StObject.set(x, "visitTSConstructSignatureDeclaration", js.undefined)
      
      inline def setVisitTSConstructorType(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSConstructorType, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSConstructorType", value.asInstanceOf[js.Any])
      
      inline def setVisitTSConstructorTypeUndefined: Self = StObject.set(x, "visitTSConstructorType", js.undefined)
      
      inline def setVisitTSDeclareFunction(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSDeclareFunction, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSDeclareFunction", value.asInstanceOf[js.Any])
      
      inline def setVisitTSDeclareFunctionUndefined: Self = StObject.set(x, "visitTSDeclareFunction", js.undefined)
      
      inline def setVisitTSDeclareMethod(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSDeclareMethod, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSDeclareMethod", value.asInstanceOf[js.Any])
      
      inline def setVisitTSDeclareMethodUndefined: Self = StObject.set(x, "visitTSDeclareMethod", js.undefined)
      
      inline def setVisitTSEnumDeclaration(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSEnumDeclaration, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSEnumDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVisitTSEnumDeclarationUndefined: Self = StObject.set(x, "visitTSEnumDeclaration", js.undefined)
      
      inline def setVisitTSEnumMember(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSEnumMember, js.Any], js.Any]): Self = StObject.set(x, "visitTSEnumMember", value.asInstanceOf[js.Any])
      
      inline def setVisitTSEnumMemberUndefined: Self = StObject.set(x, "visitTSEnumMember", js.undefined)
      
      inline def setVisitTSExportAssignment(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSExportAssignment, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSExportAssignment", value.asInstanceOf[js.Any])
      
      inline def setVisitTSExportAssignmentUndefined: Self = StObject.set(x, "visitTSExportAssignment", js.undefined)
      
      inline def setVisitTSExpressionWithTypeArguments(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[TSExpressionWithTypeArguments, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitTSExpressionWithTypeArguments", value.asInstanceOf[js.Any])
      
      inline def setVisitTSExpressionWithTypeArgumentsUndefined: Self = StObject.set(x, "visitTSExpressionWithTypeArguments", js.undefined)
      
      inline def setVisitTSExternalModuleReference(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[TSExternalModuleReference, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitTSExternalModuleReference", value.asInstanceOf[js.Any])
      
      inline def setVisitTSExternalModuleReferenceUndefined: Self = StObject.set(x, "visitTSExternalModuleReference", js.undefined)
      
      inline def setVisitTSFunctionType(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSFunctionType, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSFunctionType", value.asInstanceOf[js.Any])
      
      inline def setVisitTSFunctionTypeUndefined: Self = StObject.set(x, "visitTSFunctionType", js.undefined)
      
      inline def setVisitTSHasOptionalTypeAnnotation(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[TSHasOptionalTypeAnnotation, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitTSHasOptionalTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitTSHasOptionalTypeAnnotationUndefined: Self = StObject.set(x, "visitTSHasOptionalTypeAnnotation", js.undefined)
      
      inline def setVisitTSHasOptionalTypeParameterInstantiation(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[TSHasOptionalTypeParameterInstantiation, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitTSHasOptionalTypeParameterInstantiation", value.asInstanceOf[js.Any])
      
      inline def setVisitTSHasOptionalTypeParameterInstantiationUndefined: Self = StObject.set(x, "visitTSHasOptionalTypeParameterInstantiation", js.undefined)
      
      inline def setVisitTSHasOptionalTypeParameters(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[TSHasOptionalTypeParameters, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitTSHasOptionalTypeParameters", value.asInstanceOf[js.Any])
      
      inline def setVisitTSHasOptionalTypeParametersUndefined: Self = StObject.set(x, "visitTSHasOptionalTypeParameters", js.undefined)
      
      inline def setVisitTSImportEqualsDeclaration(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[TSImportEqualsDeclaration, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitTSImportEqualsDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVisitTSImportEqualsDeclarationUndefined: Self = StObject.set(x, "visitTSImportEqualsDeclaration", js.undefined)
      
      inline def setVisitTSImportType(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSImportType, js.Any], js.Any]): Self = StObject.set(x, "visitTSImportType", value.asInstanceOf[js.Any])
      
      inline def setVisitTSImportTypeUndefined: Self = StObject.set(x, "visitTSImportType", js.undefined)
      
      inline def setVisitTSIndexSignature(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSIndexSignature, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSIndexSignature", value.asInstanceOf[js.Any])
      
      inline def setVisitTSIndexSignatureUndefined: Self = StObject.set(x, "visitTSIndexSignature", js.undefined)
      
      inline def setVisitTSIndexedAccessType(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSIndexedAccessType, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSIndexedAccessType", value.asInstanceOf[js.Any])
      
      inline def setVisitTSIndexedAccessTypeUndefined: Self = StObject.set(x, "visitTSIndexedAccessType", js.undefined)
      
      inline def setVisitTSInferType(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSInferType, js.Any], js.Any]): Self = StObject.set(x, "visitTSInferType", value.asInstanceOf[js.Any])
      
      inline def setVisitTSInferTypeUndefined: Self = StObject.set(x, "visitTSInferType", js.undefined)
      
      inline def setVisitTSInterfaceBody(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSInterfaceBody, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSInterfaceBody", value.asInstanceOf[js.Any])
      
      inline def setVisitTSInterfaceBodyUndefined: Self = StObject.set(x, "visitTSInterfaceBody", js.undefined)
      
      inline def setVisitTSInterfaceDeclaration(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSInterfaceDeclaration, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSInterfaceDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVisitTSInterfaceDeclarationUndefined: Self = StObject.set(x, "visitTSInterfaceDeclaration", js.undefined)
      
      inline def setVisitTSIntersectionType(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSIntersectionType, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSIntersectionType", value.asInstanceOf[js.Any])
      
      inline def setVisitTSIntersectionTypeUndefined: Self = StObject.set(x, "visitTSIntersectionType", js.undefined)
      
      inline def setVisitTSLiteralType(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSLiteralType, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSLiteralType", value.asInstanceOf[js.Any])
      
      inline def setVisitTSLiteralTypeUndefined: Self = StObject.set(x, "visitTSLiteralType", js.undefined)
      
      inline def setVisitTSMappedType(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSMappedType, js.Any], js.Any]): Self = StObject.set(x, "visitTSMappedType", value.asInstanceOf[js.Any])
      
      inline def setVisitTSMappedTypeUndefined: Self = StObject.set(x, "visitTSMappedType", js.undefined)
      
      inline def setVisitTSMethodSignature(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSMethodSignature, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSMethodSignature", value.asInstanceOf[js.Any])
      
      inline def setVisitTSMethodSignatureUndefined: Self = StObject.set(x, "visitTSMethodSignature", js.undefined)
      
      inline def setVisitTSModuleBlock(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSModuleBlock, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSModuleBlock", value.asInstanceOf[js.Any])
      
      inline def setVisitTSModuleBlockUndefined: Self = StObject.set(x, "visitTSModuleBlock", js.undefined)
      
      inline def setVisitTSModuleDeclaration(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSModuleDeclaration, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSModuleDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVisitTSModuleDeclarationUndefined: Self = StObject.set(x, "visitTSModuleDeclaration", js.undefined)
      
      inline def setVisitTSNamedTupleMember(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSNamedTupleMember, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSNamedTupleMember", value.asInstanceOf[js.Any])
      
      inline def setVisitTSNamedTupleMemberUndefined: Self = StObject.set(x, "visitTSNamedTupleMember", js.undefined)
      
      inline def setVisitTSNamespaceExportDeclaration(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[TSNamespaceExportDeclaration, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitTSNamespaceExportDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVisitTSNamespaceExportDeclarationUndefined: Self = StObject.set(x, "visitTSNamespaceExportDeclaration", js.undefined)
      
      inline def setVisitTSNeverKeyword(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSNeverKeyword, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSNeverKeyword", value.asInstanceOf[js.Any])
      
      inline def setVisitTSNeverKeywordUndefined: Self = StObject.set(x, "visitTSNeverKeyword", js.undefined)
      
      inline def setVisitTSNonNullExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSNonNullExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSNonNullExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitTSNonNullExpressionUndefined: Self = StObject.set(x, "visitTSNonNullExpression", js.undefined)
      
      inline def setVisitTSNullKeyword(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSNullKeyword, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSNullKeyword", value.asInstanceOf[js.Any])
      
      inline def setVisitTSNullKeywordUndefined: Self = StObject.set(x, "visitTSNullKeyword", js.undefined)
      
      inline def setVisitTSNumberKeyword(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSNumberKeyword, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSNumberKeyword", value.asInstanceOf[js.Any])
      
      inline def setVisitTSNumberKeywordUndefined: Self = StObject.set(x, "visitTSNumberKeyword", js.undefined)
      
      inline def setVisitTSObjectKeyword(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSObjectKeyword, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSObjectKeyword", value.asInstanceOf[js.Any])
      
      inline def setVisitTSObjectKeywordUndefined: Self = StObject.set(x, "visitTSObjectKeyword", js.undefined)
      
      inline def setVisitTSOptionalType(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSOptionalType, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSOptionalType", value.asInstanceOf[js.Any])
      
      inline def setVisitTSOptionalTypeUndefined: Self = StObject.set(x, "visitTSOptionalType", js.undefined)
      
      inline def setVisitTSParameterProperty(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSParameterProperty, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSParameterProperty", value.asInstanceOf[js.Any])
      
      inline def setVisitTSParameterPropertyUndefined: Self = StObject.set(x, "visitTSParameterProperty", js.undefined)
      
      inline def setVisitTSParenthesizedType(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSParenthesizedType, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSParenthesizedType", value.asInstanceOf[js.Any])
      
      inline def setVisitTSParenthesizedTypeUndefined: Self = StObject.set(x, "visitTSParenthesizedType", js.undefined)
      
      inline def setVisitTSPropertySignature(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSPropertySignature, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSPropertySignature", value.asInstanceOf[js.Any])
      
      inline def setVisitTSPropertySignatureUndefined: Self = StObject.set(x, "visitTSPropertySignature", js.undefined)
      
      inline def setVisitTSQualifiedName(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSQualifiedName, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSQualifiedName", value.asInstanceOf[js.Any])
      
      inline def setVisitTSQualifiedNameUndefined: Self = StObject.set(x, "visitTSQualifiedName", js.undefined)
      
      inline def setVisitTSRestType(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSRestType, js.Any], js.Any]): Self = StObject.set(x, "visitTSRestType", value.asInstanceOf[js.Any])
      
      inline def setVisitTSRestTypeUndefined: Self = StObject.set(x, "visitTSRestType", js.undefined)
      
      inline def setVisitTSStringKeyword(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSStringKeyword, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSStringKeyword", value.asInstanceOf[js.Any])
      
      inline def setVisitTSStringKeywordUndefined: Self = StObject.set(x, "visitTSStringKeyword", js.undefined)
      
      inline def setVisitTSSymbolKeyword(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSSymbolKeyword, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSSymbolKeyword", value.asInstanceOf[js.Any])
      
      inline def setVisitTSSymbolKeywordUndefined: Self = StObject.set(x, "visitTSSymbolKeyword", js.undefined)
      
      inline def setVisitTSThisType(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSThisType, js.Any], js.Any]): Self = StObject.set(x, "visitTSThisType", value.asInstanceOf[js.Any])
      
      inline def setVisitTSThisTypeUndefined: Self = StObject.set(x, "visitTSThisType", js.undefined)
      
      inline def setVisitTSTupleType(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSTupleType, js.Any], js.Any]): Self = StObject.set(x, "visitTSTupleType", value.asInstanceOf[js.Any])
      
      inline def setVisitTSTupleTypeUndefined: Self = StObject.set(x, "visitTSTupleType", js.undefined)
      
      inline def setVisitTSType(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSType, js.Any], js.Any]): Self = StObject.set(x, "visitTSType", value.asInstanceOf[js.Any])
      
      inline def setVisitTSTypeAliasDeclaration(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSTypeAliasDeclaration, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSTypeAliasDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVisitTSTypeAliasDeclarationUndefined: Self = StObject.set(x, "visitTSTypeAliasDeclaration", js.undefined)
      
      inline def setVisitTSTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSTypeAnnotation, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitTSTypeAnnotationUndefined: Self = StObject.set(x, "visitTSTypeAnnotation", js.undefined)
      
      inline def setVisitTSTypeAssertion(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSTypeAssertion, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSTypeAssertion", value.asInstanceOf[js.Any])
      
      inline def setVisitTSTypeAssertionUndefined: Self = StObject.set(x, "visitTSTypeAssertion", js.undefined)
      
      inline def setVisitTSTypeLiteral(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSTypeLiteral, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSTypeLiteral", value.asInstanceOf[js.Any])
      
      inline def setVisitTSTypeLiteralUndefined: Self = StObject.set(x, "visitTSTypeLiteral", js.undefined)
      
      inline def setVisitTSTypeOperator(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSTypeOperator, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSTypeOperator", value.asInstanceOf[js.Any])
      
      inline def setVisitTSTypeOperatorUndefined: Self = StObject.set(x, "visitTSTypeOperator", js.undefined)
      
      inline def setVisitTSTypeParameter(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSTypeParameter, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSTypeParameter", value.asInstanceOf[js.Any])
      
      inline def setVisitTSTypeParameterDeclaration(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[TSTypeParameterDeclaration, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitTSTypeParameterDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVisitTSTypeParameterDeclarationUndefined: Self = StObject.set(x, "visitTSTypeParameterDeclaration", js.undefined)
      
      inline def setVisitTSTypeParameterInstantiation(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[TSTypeParameterInstantiation, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitTSTypeParameterInstantiation", value.asInstanceOf[js.Any])
      
      inline def setVisitTSTypeParameterInstantiationUndefined: Self = StObject.set(x, "visitTSTypeParameterInstantiation", js.undefined)
      
      inline def setVisitTSTypeParameterUndefined: Self = StObject.set(x, "visitTSTypeParameter", js.undefined)
      
      inline def setVisitTSTypePredicate(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSTypePredicate, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSTypePredicate", value.asInstanceOf[js.Any])
      
      inline def setVisitTSTypePredicateUndefined: Self = StObject.set(x, "visitTSTypePredicate", js.undefined)
      
      inline def setVisitTSTypeQuery(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSTypeQuery, js.Any], js.Any]): Self = StObject.set(x, "visitTSTypeQuery", value.asInstanceOf[js.Any])
      
      inline def setVisitTSTypeQueryUndefined: Self = StObject.set(x, "visitTSTypeQuery", js.undefined)
      
      inline def setVisitTSTypeReference(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSTypeReference, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSTypeReference", value.asInstanceOf[js.Any])
      
      inline def setVisitTSTypeReferenceUndefined: Self = StObject.set(x, "visitTSTypeReference", js.undefined)
      
      inline def setVisitTSTypeUndefined: Self = StObject.set(x, "visitTSType", js.undefined)
      
      inline def setVisitTSUndefinedKeyword(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSUndefinedKeyword, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSUndefinedKeyword", value.asInstanceOf[js.Any])
      
      inline def setVisitTSUndefinedKeywordUndefined: Self = StObject.set(x, "visitTSUndefinedKeyword", js.undefined)
      
      inline def setVisitTSUnionType(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSUnionType, js.Any], js.Any]): Self = StObject.set(x, "visitTSUnionType", value.asInstanceOf[js.Any])
      
      inline def setVisitTSUnionTypeUndefined: Self = StObject.set(x, "visitTSUnionType", js.undefined)
      
      inline def setVisitTSUnknownKeyword(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSUnknownKeyword, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSUnknownKeyword", value.asInstanceOf[js.Any])
      
      inline def setVisitTSUnknownKeywordUndefined: Self = StObject.set(x, "visitTSUnknownKeyword", js.undefined)
      
      inline def setVisitTSVoidKeyword(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TSVoidKeyword, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTSVoidKeyword", value.asInstanceOf[js.Any])
      
      inline def setVisitTSVoidKeywordUndefined: Self = StObject.set(x, "visitTSVoidKeyword", js.undefined)
      
      inline def setVisitTaggedTemplateExpression(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[TaggedTemplateExpression, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitTaggedTemplateExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitTaggedTemplateExpressionUndefined: Self = StObject.set(x, "visitTaggedTemplateExpression", js.undefined)
      
      inline def setVisitTemplateElement(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TemplateElement, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTemplateElement", value.asInstanceOf[js.Any])
      
      inline def setVisitTemplateElementUndefined: Self = StObject.set(x, "visitTemplateElement", js.undefined)
      
      inline def setVisitTemplateLiteral(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TemplateLiteral, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTemplateLiteral", value.asInstanceOf[js.Any])
      
      inline def setVisitTemplateLiteralUndefined: Self = StObject.set(x, "visitTemplateLiteral", js.undefined)
      
      inline def setVisitThisExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ThisExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitThisExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitThisExpressionUndefined: Self = StObject.set(x, "visitThisExpression", js.undefined)
      
      inline def setVisitThisTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ThisTypeAnnotation, js.Any], js.Any]
      ): Self = StObject.set(x, "visitThisTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitThisTypeAnnotationUndefined: Self = StObject.set(x, "visitThisTypeAnnotation", js.undefined)
      
      inline def setVisitThrowStatement(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[ThrowStatement, js.Any], js.Any]
      ): Self = StObject.set(x, "visitThrowStatement", value.asInstanceOf[js.Any])
      
      inline def setVisitThrowStatementUndefined: Self = StObject.set(x, "visitThrowStatement", js.undefined)
      
      inline def setVisitTryStatement(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TryStatement, js.Any], js.Any]): Self = StObject.set(x, "visitTryStatement", value.asInstanceOf[js.Any])
      
      inline def setVisitTryStatementUndefined: Self = StObject.set(x, "visitTryStatement", js.undefined)
      
      inline def setVisitTupleTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TupleTypeAnnotation, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTupleTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitTupleTypeAnnotationUndefined: Self = StObject.set(x, "visitTupleTypeAnnotation", js.undefined)
      
      inline def setVisitTypeAlias(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TypeAlias, js.Any], js.Any]): Self = StObject.set(x, "visitTypeAlias", value.asInstanceOf[js.Any])
      
      inline def setVisitTypeAliasUndefined: Self = StObject.set(x, "visitTypeAlias", js.undefined)
      
      inline def setVisitTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TypeAnnotation, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitTypeAnnotationUndefined: Self = StObject.set(x, "visitTypeAnnotation", js.undefined)
      
      inline def setVisitTypeCastExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TypeCastExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTypeCastExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitTypeCastExpressionUndefined: Self = StObject.set(x, "visitTypeCastExpression", js.undefined)
      
      inline def setVisitTypeParameter(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TypeParameter, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTypeParameter", value.asInstanceOf[js.Any])
      
      inline def setVisitTypeParameterDeclaration(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[TypeParameterDeclaration, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitTypeParameterDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVisitTypeParameterDeclarationUndefined: Self = StObject.set(x, "visitTypeParameterDeclaration", js.undefined)
      
      inline def setVisitTypeParameterInstantiation(
        value: js.ThisFunction1[
              /* this */ Context & M, 
              /* path */ NodePath[TypeParameterInstantiation, js.Any], 
              js.Any
            ]
      ): Self = StObject.set(x, "visitTypeParameterInstantiation", value.asInstanceOf[js.Any])
      
      inline def setVisitTypeParameterInstantiationUndefined: Self = StObject.set(x, "visitTypeParameterInstantiation", js.undefined)
      
      inline def setVisitTypeParameterUndefined: Self = StObject.set(x, "visitTypeParameter", js.undefined)
      
      inline def setVisitTypeofTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[TypeofTypeAnnotation, js.Any], js.Any]
      ): Self = StObject.set(x, "visitTypeofTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitTypeofTypeAnnotationUndefined: Self = StObject.set(x, "visitTypeofTypeAnnotation", js.undefined)
      
      inline def setVisitUnaryExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[UnaryExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitUnaryExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitUnaryExpressionUndefined: Self = StObject.set(x, "visitUnaryExpression", js.undefined)
      
      inline def setVisitUnionTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[UnionTypeAnnotation, js.Any], js.Any]
      ): Self = StObject.set(x, "visitUnionTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitUnionTypeAnnotationUndefined: Self = StObject.set(x, "visitUnionTypeAnnotation", js.undefined)
      
      inline def setVisitUpdateExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[UpdateExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitUpdateExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitUpdateExpressionUndefined: Self = StObject.set(x, "visitUpdateExpression", js.undefined)
      
      inline def setVisitVariableDeclaration(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[VariableDeclaration, js.Any], js.Any]
      ): Self = StObject.set(x, "visitVariableDeclaration", value.asInstanceOf[js.Any])
      
      inline def setVisitVariableDeclarationUndefined: Self = StObject.set(x, "visitVariableDeclaration", js.undefined)
      
      inline def setVisitVariableDeclarator(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[VariableDeclarator, js.Any], js.Any]
      ): Self = StObject.set(x, "visitVariableDeclarator", value.asInstanceOf[js.Any])
      
      inline def setVisitVariableDeclaratorUndefined: Self = StObject.set(x, "visitVariableDeclarator", js.undefined)
      
      inline def setVisitVariance(value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[Variance, js.Any], js.Any]): Self = StObject.set(x, "visitVariance", value.asInstanceOf[js.Any])
      
      inline def setVisitVarianceUndefined: Self = StObject.set(x, "visitVariance", js.undefined)
      
      inline def setVisitVoidTypeAnnotation(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[VoidTypeAnnotation, js.Any], js.Any]
      ): Self = StObject.set(x, "visitVoidTypeAnnotation", value.asInstanceOf[js.Any])
      
      inline def setVisitVoidTypeAnnotationUndefined: Self = StObject.set(x, "visitVoidTypeAnnotation", js.undefined)
      
      inline def setVisitWhileStatement(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[WhileStatement, js.Any], js.Any]
      ): Self = StObject.set(x, "visitWhileStatement", value.asInstanceOf[js.Any])
      
      inline def setVisitWhileStatementUndefined: Self = StObject.set(x, "visitWhileStatement", js.undefined)
      
      inline def setVisitWithStatement(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[WithStatement, js.Any], js.Any]
      ): Self = StObject.set(x, "visitWithStatement", value.asInstanceOf[js.Any])
      
      inline def setVisitWithStatementUndefined: Self = StObject.set(x, "visitWithStatement", js.undefined)
      
      inline def setVisitYieldExpression(
        value: js.ThisFunction1[/* this */ Context & M, /* path */ NodePath[YieldExpression, js.Any], js.Any]
      ): Self = StObject.set(x, "visitYieldExpression", value.asInstanceOf[js.Any])
      
      inline def setVisitYieldExpressionUndefined: Self = StObject.set(x, "visitYieldExpression", js.undefined)
    }
  }
}
