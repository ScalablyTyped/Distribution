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
import typings.astTypes.namedTypesMod.namedTypes.CatchClause
import typings.astTypes.namedTypesMod.namedTypes.ChainExpression
import typings.astTypes.namedTypesMod.namedTypes.ClassBody
import typings.astTypes.namedTypesMod.namedTypes.ClassDeclaration
import typings.astTypes.namedTypesMod.namedTypes.ClassExpression
import typings.astTypes.namedTypesMod.namedTypes.ClassImplements
import typings.astTypes.namedTypesMod.namedTypes.ClassMethod
import typings.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
import typings.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
import typings.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition
import typings.astTypes.namedTypesMod.namedTypes.CommentBlock
import typings.astTypes.namedTypesMod.namedTypes.CommentLine
import typings.astTypes.namedTypesMod.namedTypes.ComprehensionBlock
import typings.astTypes.namedTypesMod.namedTypes.ComprehensionExpression
import typings.astTypes.namedTypesMod.namedTypes.ConditionalExpression
import typings.astTypes.namedTypesMod.namedTypes.ContinueStatement
import typings.astTypes.namedTypesMod.namedTypes.DebuggerStatement
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
import typings.astTypes.namedTypesMod.namedTypes.ExpressionStatement
import typings.astTypes.namedTypesMod.namedTypes.File
import typings.astTypes.namedTypesMod.namedTypes.ForAwaitStatement
import typings.astTypes.namedTypesMod.namedTypes.ForInStatement
import typings.astTypes.namedTypesMod.namedTypes.ForOfStatement
import typings.astTypes.namedTypesMod.namedTypes.ForStatement
import typings.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
import typings.astTypes.namedTypesMod.namedTypes.FunctionExpression
import typings.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.FunctionTypeParam
import typings.astTypes.namedTypesMod.namedTypes.GeneratorExpression
import typings.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.IfStatement
import typings.astTypes.namedTypesMod.namedTypes.Import
import typings.astTypes.namedTypesMod.namedTypes.ImportDeclaration
import typings.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier
import typings.astTypes.namedTypesMod.namedTypes.ImportExpression
import typings.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
import typings.astTypes.namedTypesMod.namedTypes.ImportSpecifier
import typings.astTypes.namedTypesMod.namedTypes.InferredPredicate
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
import typings.astTypes.namedTypesMod.namedTypes.LogicalExpression
import typings.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.MetaProperty
import typings.astTypes.namedTypesMod.namedTypes.MethodDefinition
import typings.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation
import typings.astTypes.namedTypesMod.namedTypes.NewExpression
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
import typings.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
import typings.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
import typings.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression
import typings.astTypes.namedTypesMod.namedTypes.Position
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
import typings.astTypes.namedTypesMod.namedTypes.SpreadElement
import typings.astTypes.namedTypesMod.namedTypes.SpreadElementPattern
import typings.astTypes.namedTypesMod.namedTypes.SpreadProperty
import typings.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern
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
import typings.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ast-types/gen/kinds", JSImport.Namespace)
@js.native
object kindsMod extends js.Object {
  
  /* Rewritten from type alias, can be one of: 
    - typings.astTypes.namedTypesMod.namedTypes.CallExpression
    - typings.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
  */
  trait CallExpressionKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astTypes.namedTypesMod.namedTypes.MemberExpression
    - typings.astTypes.namedTypesMod.namedTypes.CallExpression
    - typings.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
    - typings.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
    - typings.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
  */
  trait ChainElementKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astTypes.namedTypesMod.namedTypes.ClassProperty
    - typings.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
  */
  trait ClassPropertyKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astTypes.namedTypesMod.namedTypes.Block
    - typings.astTypes.namedTypesMod.namedTypes.Line
    - typings.astTypes.namedTypesMod.namedTypes.CommentBlock
    - typings.astTypes.namedTypesMod.namedTypes.CommentLine
  */
  trait CommentKind extends js.Object
  
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
  trait DeclarationKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astTypes.namedTypesMod.namedTypes.Identifier
    - typings.astTypes.namedTypesMod.namedTypes.FunctionExpression
    - typings.astTypes.namedTypesMod.namedTypes.ThisExpression
    - typings.astTypes.namedTypesMod.namedTypes.ArrayExpression
    - typings.astTypes.namedTypesMod.namedTypes.ObjectExpression
    - typings.astTypes.namedTypesMod.namedTypes.Literal
    - typings.astTypes.namedTypesMod.namedTypes.SequenceExpression
    - typings.astTypes.namedTypesMod.namedTypes.UnaryExpression
    - typings.astTypes.namedTypesMod.namedTypes.BinaryExpression
    - typings.astTypes.namedTypesMod.namedTypes.AssignmentExpression
    - typings.astTypes.namedTypesMod.namedTypes.MemberExpression
    - typings.astTypes.namedTypesMod.namedTypes.UpdateExpression
    - typings.astTypes.namedTypesMod.namedTypes.LogicalExpression
    - typings.astTypes.namedTypesMod.namedTypes.ConditionalExpression
    - typings.astTypes.namedTypesMod.namedTypes.NewExpression
    - typings.astTypes.namedTypesMod.namedTypes.CallExpression
    - typings.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression
    - typings.astTypes.namedTypesMod.namedTypes.YieldExpression
    - typings.astTypes.namedTypesMod.namedTypes.GeneratorExpression
    - typings.astTypes.namedTypesMod.namedTypes.ComprehensionExpression
    - typings.astTypes.namedTypesMod.namedTypes.ClassExpression
    - typings.astTypes.namedTypesMod.namedTypes.Super
    - typings.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression
    - typings.astTypes.namedTypesMod.namedTypes.TemplateLiteral
    - typings.astTypes.namedTypesMod.namedTypes.MetaProperty
    - typings.astTypes.namedTypesMod.namedTypes.AwaitExpression
    - typings.astTypes.namedTypesMod.namedTypes.ImportExpression
    - typings.astTypes.namedTypesMod.namedTypes.ChainExpression
    - typings.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
    - typings.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
    - typings.astTypes.namedTypesMod.namedTypes.JSXIdentifier
    - typings.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer
    - typings.astTypes.namedTypesMod.namedTypes.JSXElement
    - typings.astTypes.namedTypesMod.namedTypes.JSXFragment
    - typings.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
    - typings.astTypes.namedTypesMod.namedTypes.JSXText
    - typings.astTypes.namedTypesMod.namedTypes.PrivateName
    - typings.astTypes.namedTypesMod.namedTypes.TypeCastExpression
    - typings.astTypes.namedTypesMod.namedTypes.DoExpression
    - typings.astTypes.namedTypesMod.namedTypes.BindExpression
    - typings.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression
    - typings.astTypes.namedTypesMod.namedTypes.DirectiveLiteral
    - typings.astTypes.namedTypesMod.namedTypes.StringLiteral
    - typings.astTypes.namedTypesMod.namedTypes.NumericLiteral
    - typings.astTypes.namedTypesMod.namedTypes.BigIntLiteral
    - typings.astTypes.namedTypesMod.namedTypes.NullLiteral
    - typings.astTypes.namedTypesMod.namedTypes.BooleanLiteral
    - typings.astTypes.namedTypesMod.namedTypes.RegExpLiteral
    - typings.astTypes.namedTypesMod.namedTypes.Import
    - typings.astTypes.namedTypesMod.namedTypes.TSAsExpression
    - typings.astTypes.namedTypesMod.namedTypes.TSNonNullExpression
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeParameter
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeAssertion
  */
  trait ExpressionKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam
    - typings.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.TypeParameter
    - typings.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.InferredPredicate
    - typings.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
  */
  trait FlowKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astTypes.namedTypesMod.namedTypes.InferredPredicate
    - typings.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
  */
  trait FlowPredicateKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam
    - typings.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.TypeParameter
    - typings.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation
  */
  trait FlowTypeKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.FunctionExpression
    - typings.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression
    - typings.astTypes.namedTypesMod.namedTypes.ObjectMethod
    - typings.astTypes.namedTypesMod.namedTypes.ClassMethod
    - typings.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
  */
  trait FunctionKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astTypes.namedTypesMod.namedTypes.Identifier
    - typings.astTypes.namedTypesMod.namedTypes.JSXIdentifier
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeParameter
  */
  trait IdentifierKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.DeclareInterface
    - typings.astTypes.namedTypesMod.namedTypes.DeclareClass
  */
  trait InterfaceDeclarationKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astTypes.namedTypesMod.namedTypes.Literal
    - typings.astTypes.namedTypesMod.namedTypes.JSXText
    - typings.astTypes.namedTypesMod.namedTypes.StringLiteral
    - typings.astTypes.namedTypesMod.namedTypes.NumericLiteral
    - typings.astTypes.namedTypesMod.namedTypes.BigIntLiteral
    - typings.astTypes.namedTypesMod.namedTypes.NullLiteral
    - typings.astTypes.namedTypesMod.namedTypes.BooleanLiteral
    - typings.astTypes.namedTypesMod.namedTypes.RegExpLiteral
  */
  trait LiteralKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astTypes.namedTypesMod.namedTypes.MemberExpression
    - typings.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
    - typings.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
  */
  trait MemberExpressionKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astTypes.namedTypesMod.namedTypes.ImportSpecifier
    - typings.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier
    - typings.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
    - typings.astTypes.namedTypesMod.namedTypes.ExportSpecifier
  */
  trait ModuleSpecifierKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astTypes.namedTypesMod.namedTypes.File
    - typings.astTypes.namedTypesMod.namedTypes.Program
    - typings.astTypes.namedTypesMod.namedTypes.Identifier
    - typings.astTypes.namedTypesMod.namedTypes.BlockStatement
    - typings.astTypes.namedTypesMod.namedTypes.EmptyStatement
    - typings.astTypes.namedTypesMod.namedTypes.ExpressionStatement
    - typings.astTypes.namedTypesMod.namedTypes.IfStatement
    - typings.astTypes.namedTypesMod.namedTypes.LabeledStatement
    - typings.astTypes.namedTypesMod.namedTypes.BreakStatement
    - typings.astTypes.namedTypesMod.namedTypes.ContinueStatement
    - typings.astTypes.namedTypesMod.namedTypes.WithStatement
    - typings.astTypes.namedTypesMod.namedTypes.SwitchStatement
    - typings.astTypes.namedTypesMod.namedTypes.SwitchCase
    - typings.astTypes.namedTypesMod.namedTypes.ReturnStatement
    - typings.astTypes.namedTypesMod.namedTypes.ThrowStatement
    - typings.astTypes.namedTypesMod.namedTypes.TryStatement
    - typings.astTypes.namedTypesMod.namedTypes.CatchClause
    - typings.astTypes.namedTypesMod.namedTypes.WhileStatement
    - typings.astTypes.namedTypesMod.namedTypes.DoWhileStatement
    - typings.astTypes.namedTypesMod.namedTypes.ForStatement
    - typings.astTypes.namedTypesMod.namedTypes.VariableDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.ForInStatement
    - typings.astTypes.namedTypesMod.namedTypes.DebuggerStatement
    - typings.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.FunctionExpression
    - typings.astTypes.namedTypesMod.namedTypes.VariableDeclarator
    - typings.astTypes.namedTypesMod.namedTypes.ThisExpression
    - typings.astTypes.namedTypesMod.namedTypes.ArrayExpression
    - typings.astTypes.namedTypesMod.namedTypes.ObjectExpression
    - typings.astTypes.namedTypesMod.namedTypes.Property
    - typings.astTypes.namedTypesMod.namedTypes.Literal
    - typings.astTypes.namedTypesMod.namedTypes.SequenceExpression
    - typings.astTypes.namedTypesMod.namedTypes.UnaryExpression
    - typings.astTypes.namedTypesMod.namedTypes.BinaryExpression
    - typings.astTypes.namedTypesMod.namedTypes.AssignmentExpression
    - typings.astTypes.namedTypesMod.namedTypes.MemberExpression
    - typings.astTypes.namedTypesMod.namedTypes.UpdateExpression
    - typings.astTypes.namedTypesMod.namedTypes.LogicalExpression
    - typings.astTypes.namedTypesMod.namedTypes.ConditionalExpression
    - typings.astTypes.namedTypesMod.namedTypes.NewExpression
    - typings.astTypes.namedTypesMod.namedTypes.CallExpression
    - typings.astTypes.namedTypesMod.namedTypes.RestElement
    - typings.astTypes.namedTypesMod.namedTypes.TypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.SpreadElementPattern
    - typings.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression
    - typings.astTypes.namedTypesMod.namedTypes.ForOfStatement
    - typings.astTypes.namedTypesMod.namedTypes.YieldExpression
    - typings.astTypes.namedTypesMod.namedTypes.GeneratorExpression
    - typings.astTypes.namedTypesMod.namedTypes.ComprehensionBlock
    - typings.astTypes.namedTypesMod.namedTypes.ComprehensionExpression
    - typings.astTypes.namedTypesMod.namedTypes.ObjectProperty
    - typings.astTypes.namedTypesMod.namedTypes.PropertyPattern
    - typings.astTypes.namedTypesMod.namedTypes.ObjectPattern
    - typings.astTypes.namedTypesMod.namedTypes.ArrayPattern
    - typings.astTypes.namedTypesMod.namedTypes.SpreadElement
    - typings.astTypes.namedTypesMod.namedTypes.AssignmentPattern
    - typings.astTypes.namedTypesMod.namedTypes.MethodDefinition
    - typings.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition
    - typings.astTypes.namedTypesMod.namedTypes.ClassProperty
    - typings.astTypes.namedTypesMod.namedTypes.ClassBody
    - typings.astTypes.namedTypesMod.namedTypes.ClassDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.ClassExpression
    - typings.astTypes.namedTypesMod.namedTypes.Super
    - typings.astTypes.namedTypesMod.namedTypes.ImportSpecifier
    - typings.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier
    - typings.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
    - typings.astTypes.namedTypesMod.namedTypes.ImportDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.ExportSpecifier
    - typings.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression
    - typings.astTypes.namedTypesMod.namedTypes.TemplateLiteral
    - typings.astTypes.namedTypesMod.namedTypes.TemplateElement
    - typings.astTypes.namedTypesMod.namedTypes.MetaProperty
    - typings.astTypes.namedTypesMod.namedTypes.AwaitExpression
    - typings.astTypes.namedTypesMod.namedTypes.SpreadProperty
    - typings.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern
    - typings.astTypes.namedTypesMod.namedTypes.ImportExpression
    - typings.astTypes.namedTypesMod.namedTypes.ChainExpression
    - typings.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
    - typings.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
    - typings.astTypes.namedTypesMod.namedTypes.JSXAttribute
    - typings.astTypes.namedTypesMod.namedTypes.JSXIdentifier
    - typings.astTypes.namedTypesMod.namedTypes.JSXNamespacedName
    - typings.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer
    - typings.astTypes.namedTypesMod.namedTypes.JSXElement
    - typings.astTypes.namedTypesMod.namedTypes.JSXFragment
    - typings.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
    - typings.astTypes.namedTypesMod.namedTypes.JSXSpreadAttribute
    - typings.astTypes.namedTypesMod.namedTypes.JSXEmptyExpression
    - typings.astTypes.namedTypesMod.namedTypes.JSXText
    - typings.astTypes.namedTypesMod.namedTypes.JSXSpreadChild
    - typings.astTypes.namedTypesMod.namedTypes.JSXOpeningElement
    - typings.astTypes.namedTypesMod.namedTypes.JSXClosingElement
    - typings.astTypes.namedTypesMod.namedTypes.JSXOpeningFragment
    - typings.astTypes.namedTypesMod.namedTypes.JSXClosingFragment
    - typings.astTypes.namedTypesMod.namedTypes.Decorator
    - typings.astTypes.namedTypesMod.namedTypes.PrivateName
    - typings.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
    - typings.astTypes.namedTypesMod.namedTypes.TypeParameterDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.TypeParameterInstantiation
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeParameterInstantiation
    - typings.astTypes.namedTypesMod.namedTypes.ClassImplements
    - typings.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments
    - typings.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam
    - typings.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.FunctionTypeParam
    - typings.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.ObjectTypeProperty
    - typings.astTypes.namedTypesMod.namedTypes.ObjectTypeSpreadProperty
    - typings.astTypes.namedTypesMod.namedTypes.ObjectTypeIndexer
    - typings.astTypes.namedTypesMod.namedTypes.ObjectTypeCallProperty
    - typings.astTypes.namedTypesMod.namedTypes.ObjectTypeInternalSlot
    - typings.astTypes.namedTypesMod.namedTypes.Variance
    - typings.astTypes.namedTypesMod.namedTypes.QualifiedTypeIdentifier
    - typings.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.TypeParameter
    - typings.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.InterfaceExtends
    - typings.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.DeclareInterface
    - typings.astTypes.namedTypesMod.namedTypes.TypeAlias
    - typings.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
    - typings.astTypes.namedTypesMod.namedTypes.OpaqueType
    - typings.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
    - typings.astTypes.namedTypesMod.namedTypes.TypeCastExpression
    - typings.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.DeclareVariable
    - typings.astTypes.namedTypesMod.namedTypes.DeclareFunction
    - typings.astTypes.namedTypesMod.namedTypes.DeclareClass
    - typings.astTypes.namedTypesMod.namedTypes.DeclareModule
    - typings.astTypes.namedTypesMod.namedTypes.DeclareModuleExports
    - typings.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier
    - typings.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.InferredPredicate
    - typings.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
    - typings.astTypes.namedTypesMod.namedTypes.EnumDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.ExportDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.Noop
    - typings.astTypes.namedTypesMod.namedTypes.DoExpression
    - typings.astTypes.namedTypesMod.namedTypes.BindExpression
    - typings.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression
    - typings.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier
    - typings.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier
    - typings.astTypes.namedTypesMod.namedTypes.Directive
    - typings.astTypes.namedTypesMod.namedTypes.DirectiveLiteral
    - typings.astTypes.namedTypesMod.namedTypes.InterpreterDirective
    - typings.astTypes.namedTypesMod.namedTypes.StringLiteral
    - typings.astTypes.namedTypesMod.namedTypes.NumericLiteral
    - typings.astTypes.namedTypesMod.namedTypes.BigIntLiteral
    - typings.astTypes.namedTypesMod.namedTypes.NullLiteral
    - typings.astTypes.namedTypesMod.namedTypes.BooleanLiteral
    - typings.astTypes.namedTypesMod.namedTypes.RegExpLiteral
    - typings.astTypes.namedTypesMod.namedTypes.ObjectMethod
    - typings.astTypes.namedTypesMod.namedTypes.ClassMethod
    - typings.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
    - typings.astTypes.namedTypesMod.namedTypes.RestProperty
    - typings.astTypes.namedTypesMod.namedTypes.ForAwaitStatement
    - typings.astTypes.namedTypesMod.namedTypes.Import
    - typings.astTypes.namedTypesMod.namedTypes.TSQualifiedName
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeReference
    - typings.astTypes.namedTypesMod.namedTypes.TSAsExpression
    - typings.astTypes.namedTypesMod.namedTypes.TSNonNullExpression
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
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeParameter
    - typings.astTypes.namedTypesMod.namedTypes.TSParenthesizedType
    - typings.astTypes.namedTypesMod.namedTypes.TSFunctionType
    - typings.astTypes.namedTypesMod.namedTypes.TSConstructorType
    - typings.astTypes.namedTypesMod.namedTypes.TSDeclareFunction
    - typings.astTypes.namedTypesMod.namedTypes.TSDeclareMethod
    - typings.astTypes.namedTypesMod.namedTypes.TSMappedType
    - typings.astTypes.namedTypesMod.namedTypes.TSTupleType
    - typings.astTypes.namedTypesMod.namedTypes.TSNamedTupleMember
    - typings.astTypes.namedTypesMod.namedTypes.TSRestType
    - typings.astTypes.namedTypesMod.namedTypes.TSOptionalType
    - typings.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeOperator
    - typings.astTypes.namedTypesMod.namedTypes.TSIndexSignature
    - typings.astTypes.namedTypesMod.namedTypes.TSPropertySignature
    - typings.astTypes.namedTypesMod.namedTypes.TSMethodSignature
    - typings.astTypes.namedTypesMod.namedTypes.TSTypePredicate
    - typings.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.TSEnumMember
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeQuery
    - typings.astTypes.namedTypesMod.namedTypes.TSImportType
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeLiteral
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeAssertion
    - typings.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.TSModuleBlock
    - typings.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference
    - typings.astTypes.namedTypesMod.namedTypes.TSExportAssignment
    - typings.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.TSInterfaceBody
    - typings.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.TSParameterProperty
  */
  trait NodeKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astTypes.namedTypesMod.namedTypes.OpaqueType
    - typings.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
  */
  trait OpaqueTypeKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astTypes.namedTypesMod.namedTypes.Identifier
    - typings.astTypes.namedTypesMod.namedTypes.RestElement
    - typings.astTypes.namedTypesMod.namedTypes.SpreadElementPattern
    - typings.astTypes.namedTypesMod.namedTypes.PropertyPattern
    - typings.astTypes.namedTypesMod.namedTypes.ObjectPattern
    - typings.astTypes.namedTypesMod.namedTypes.ArrayPattern
    - typings.astTypes.namedTypesMod.namedTypes.AssignmentPattern
    - typings.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern
    - typings.astTypes.namedTypesMod.namedTypes.JSXIdentifier
    - typings.astTypes.namedTypesMod.namedTypes.PrivateName
    - typings.astTypes.namedTypesMod.namedTypes.TSAsExpression
    - typings.astTypes.namedTypesMod.namedTypes.TSNonNullExpression
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeParameter
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeAssertion
    - typings.astTypes.namedTypesMod.namedTypes.TSParameterProperty
  */
  trait PatternKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astTypes.namedTypesMod.namedTypes.File
    - typings.astTypes.namedTypesMod.namedTypes.Program
    - typings.astTypes.namedTypesMod.namedTypes.Identifier
    - typings.astTypes.namedTypesMod.namedTypes.BlockStatement
    - typings.astTypes.namedTypesMod.namedTypes.EmptyStatement
    - typings.astTypes.namedTypesMod.namedTypes.ExpressionStatement
    - typings.astTypes.namedTypesMod.namedTypes.IfStatement
    - typings.astTypes.namedTypesMod.namedTypes.LabeledStatement
    - typings.astTypes.namedTypesMod.namedTypes.BreakStatement
    - typings.astTypes.namedTypesMod.namedTypes.ContinueStatement
    - typings.astTypes.namedTypesMod.namedTypes.WithStatement
    - typings.astTypes.namedTypesMod.namedTypes.SwitchStatement
    - typings.astTypes.namedTypesMod.namedTypes.SwitchCase
    - typings.astTypes.namedTypesMod.namedTypes.ReturnStatement
    - typings.astTypes.namedTypesMod.namedTypes.ThrowStatement
    - typings.astTypes.namedTypesMod.namedTypes.TryStatement
    - typings.astTypes.namedTypesMod.namedTypes.CatchClause
    - typings.astTypes.namedTypesMod.namedTypes.WhileStatement
    - typings.astTypes.namedTypesMod.namedTypes.DoWhileStatement
    - typings.astTypes.namedTypesMod.namedTypes.ForStatement
    - typings.astTypes.namedTypesMod.namedTypes.VariableDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.ForInStatement
    - typings.astTypes.namedTypesMod.namedTypes.DebuggerStatement
    - typings.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.FunctionExpression
    - typings.astTypes.namedTypesMod.namedTypes.VariableDeclarator
    - typings.astTypes.namedTypesMod.namedTypes.ThisExpression
    - typings.astTypes.namedTypesMod.namedTypes.ArrayExpression
    - typings.astTypes.namedTypesMod.namedTypes.ObjectExpression
    - typings.astTypes.namedTypesMod.namedTypes.Property
    - typings.astTypes.namedTypesMod.namedTypes.Literal
    - typings.astTypes.namedTypesMod.namedTypes.SequenceExpression
    - typings.astTypes.namedTypesMod.namedTypes.UnaryExpression
    - typings.astTypes.namedTypesMod.namedTypes.BinaryExpression
    - typings.astTypes.namedTypesMod.namedTypes.AssignmentExpression
    - typings.astTypes.namedTypesMod.namedTypes.MemberExpression
    - typings.astTypes.namedTypesMod.namedTypes.UpdateExpression
    - typings.astTypes.namedTypesMod.namedTypes.LogicalExpression
    - typings.astTypes.namedTypesMod.namedTypes.ConditionalExpression
    - typings.astTypes.namedTypesMod.namedTypes.NewExpression
    - typings.astTypes.namedTypesMod.namedTypes.CallExpression
    - typings.astTypes.namedTypesMod.namedTypes.RestElement
    - typings.astTypes.namedTypesMod.namedTypes.TypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.SpreadElementPattern
    - typings.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression
    - typings.astTypes.namedTypesMod.namedTypes.ForOfStatement
    - typings.astTypes.namedTypesMod.namedTypes.YieldExpression
    - typings.astTypes.namedTypesMod.namedTypes.GeneratorExpression
    - typings.astTypes.namedTypesMod.namedTypes.ComprehensionBlock
    - typings.astTypes.namedTypesMod.namedTypes.ComprehensionExpression
    - typings.astTypes.namedTypesMod.namedTypes.ObjectProperty
    - typings.astTypes.namedTypesMod.namedTypes.PropertyPattern
    - typings.astTypes.namedTypesMod.namedTypes.ObjectPattern
    - typings.astTypes.namedTypesMod.namedTypes.ArrayPattern
    - typings.astTypes.namedTypesMod.namedTypes.SpreadElement
    - typings.astTypes.namedTypesMod.namedTypes.AssignmentPattern
    - typings.astTypes.namedTypesMod.namedTypes.MethodDefinition
    - typings.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition
    - typings.astTypes.namedTypesMod.namedTypes.ClassProperty
    - typings.astTypes.namedTypesMod.namedTypes.ClassBody
    - typings.astTypes.namedTypesMod.namedTypes.ClassDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.ClassExpression
    - typings.astTypes.namedTypesMod.namedTypes.Super
    - typings.astTypes.namedTypesMod.namedTypes.ImportSpecifier
    - typings.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier
    - typings.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
    - typings.astTypes.namedTypesMod.namedTypes.ImportDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.ExportSpecifier
    - typings.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression
    - typings.astTypes.namedTypesMod.namedTypes.TemplateLiteral
    - typings.astTypes.namedTypesMod.namedTypes.TemplateElement
    - typings.astTypes.namedTypesMod.namedTypes.MetaProperty
    - typings.astTypes.namedTypesMod.namedTypes.AwaitExpression
    - typings.astTypes.namedTypesMod.namedTypes.SpreadProperty
    - typings.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern
    - typings.astTypes.namedTypesMod.namedTypes.ImportExpression
    - typings.astTypes.namedTypesMod.namedTypes.ChainExpression
    - typings.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
    - typings.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
    - typings.astTypes.namedTypesMod.namedTypes.JSXAttribute
    - typings.astTypes.namedTypesMod.namedTypes.JSXIdentifier
    - typings.astTypes.namedTypesMod.namedTypes.JSXNamespacedName
    - typings.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer
    - typings.astTypes.namedTypesMod.namedTypes.JSXElement
    - typings.astTypes.namedTypesMod.namedTypes.JSXFragment
    - typings.astTypes.namedTypesMod.namedTypes.JSXMemberExpression
    - typings.astTypes.namedTypesMod.namedTypes.JSXSpreadAttribute
    - typings.astTypes.namedTypesMod.namedTypes.JSXEmptyExpression
    - typings.astTypes.namedTypesMod.namedTypes.JSXText
    - typings.astTypes.namedTypesMod.namedTypes.JSXSpreadChild
    - typings.astTypes.namedTypesMod.namedTypes.JSXOpeningElement
    - typings.astTypes.namedTypesMod.namedTypes.JSXClosingElement
    - typings.astTypes.namedTypesMod.namedTypes.JSXOpeningFragment
    - typings.astTypes.namedTypesMod.namedTypes.JSXClosingFragment
    - typings.astTypes.namedTypesMod.namedTypes.Decorator
    - typings.astTypes.namedTypesMod.namedTypes.PrivateName
    - typings.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
    - typings.astTypes.namedTypesMod.namedTypes.TypeParameterDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.TypeParameterInstantiation
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeParameterInstantiation
    - typings.astTypes.namedTypesMod.namedTypes.ClassImplements
    - typings.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments
    - typings.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam
    - typings.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.FunctionTypeParam
    - typings.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.ObjectTypeProperty
    - typings.astTypes.namedTypesMod.namedTypes.ObjectTypeSpreadProperty
    - typings.astTypes.namedTypesMod.namedTypes.ObjectTypeIndexer
    - typings.astTypes.namedTypesMod.namedTypes.ObjectTypeCallProperty
    - typings.astTypes.namedTypesMod.namedTypes.ObjectTypeInternalSlot
    - typings.astTypes.namedTypesMod.namedTypes.Variance
    - typings.astTypes.namedTypesMod.namedTypes.QualifiedTypeIdentifier
    - typings.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.TypeParameter
    - typings.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.InterfaceExtends
    - typings.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.DeclareInterface
    - typings.astTypes.namedTypesMod.namedTypes.TypeAlias
    - typings.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
    - typings.astTypes.namedTypesMod.namedTypes.OpaqueType
    - typings.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
    - typings.astTypes.namedTypesMod.namedTypes.TypeCastExpression
    - typings.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.DeclareVariable
    - typings.astTypes.namedTypesMod.namedTypes.DeclareFunction
    - typings.astTypes.namedTypesMod.namedTypes.DeclareClass
    - typings.astTypes.namedTypesMod.namedTypes.DeclareModule
    - typings.astTypes.namedTypesMod.namedTypes.DeclareModuleExports
    - typings.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier
    - typings.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.InferredPredicate
    - typings.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
    - typings.astTypes.namedTypesMod.namedTypes.EnumDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.ExportDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.Block
    - typings.astTypes.namedTypesMod.namedTypes.Line
    - typings.astTypes.namedTypesMod.namedTypes.Noop
    - typings.astTypes.namedTypesMod.namedTypes.DoExpression
    - typings.astTypes.namedTypesMod.namedTypes.BindExpression
    - typings.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression
    - typings.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier
    - typings.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier
    - typings.astTypes.namedTypesMod.namedTypes.CommentBlock
    - typings.astTypes.namedTypesMod.namedTypes.CommentLine
    - typings.astTypes.namedTypesMod.namedTypes.Directive
    - typings.astTypes.namedTypesMod.namedTypes.DirectiveLiteral
    - typings.astTypes.namedTypesMod.namedTypes.InterpreterDirective
    - typings.astTypes.namedTypesMod.namedTypes.StringLiteral
    - typings.astTypes.namedTypesMod.namedTypes.NumericLiteral
    - typings.astTypes.namedTypesMod.namedTypes.BigIntLiteral
    - typings.astTypes.namedTypesMod.namedTypes.NullLiteral
    - typings.astTypes.namedTypesMod.namedTypes.BooleanLiteral
    - typings.astTypes.namedTypesMod.namedTypes.RegExpLiteral
    - typings.astTypes.namedTypesMod.namedTypes.ObjectMethod
    - typings.astTypes.namedTypesMod.namedTypes.ClassMethod
    - typings.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
    - typings.astTypes.namedTypesMod.namedTypes.RestProperty
    - typings.astTypes.namedTypesMod.namedTypes.ForAwaitStatement
    - typings.astTypes.namedTypesMod.namedTypes.Import
    - typings.astTypes.namedTypesMod.namedTypes.TSQualifiedName
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeReference
    - typings.astTypes.namedTypesMod.namedTypes.TSAsExpression
    - typings.astTypes.namedTypesMod.namedTypes.TSNonNullExpression
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
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeParameter
    - typings.astTypes.namedTypesMod.namedTypes.TSParenthesizedType
    - typings.astTypes.namedTypesMod.namedTypes.TSFunctionType
    - typings.astTypes.namedTypesMod.namedTypes.TSConstructorType
    - typings.astTypes.namedTypesMod.namedTypes.TSDeclareFunction
    - typings.astTypes.namedTypesMod.namedTypes.TSDeclareMethod
    - typings.astTypes.namedTypesMod.namedTypes.TSMappedType
    - typings.astTypes.namedTypesMod.namedTypes.TSTupleType
    - typings.astTypes.namedTypesMod.namedTypes.TSNamedTupleMember
    - typings.astTypes.namedTypesMod.namedTypes.TSRestType
    - typings.astTypes.namedTypesMod.namedTypes.TSOptionalType
    - typings.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeOperator
    - typings.astTypes.namedTypesMod.namedTypes.TSIndexSignature
    - typings.astTypes.namedTypesMod.namedTypes.TSPropertySignature
    - typings.astTypes.namedTypesMod.namedTypes.TSMethodSignature
    - typings.astTypes.namedTypesMod.namedTypes.TSTypePredicate
    - typings.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.TSEnumMember
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeQuery
    - typings.astTypes.namedTypesMod.namedTypes.TSImportType
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeLiteral
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeAssertion
    - typings.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.TSModuleBlock
    - typings.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference
    - typings.astTypes.namedTypesMod.namedTypes.TSExportAssignment
    - typings.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.TSInterfaceBody
    - typings.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.TSParameterProperty
  */
  trait PrintableKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astTypes.namedTypesMod.namedTypes.ImportSpecifier
    - typings.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier
    - typings.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier
    - typings.astTypes.namedTypesMod.namedTypes.ExportSpecifier
    - typings.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier
    - typings.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier
    - typings.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier
  */
  trait SpecifierKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astTypes.namedTypesMod.namedTypes.BlockStatement
    - typings.astTypes.namedTypesMod.namedTypes.EmptyStatement
    - typings.astTypes.namedTypesMod.namedTypes.ExpressionStatement
    - typings.astTypes.namedTypesMod.namedTypes.IfStatement
    - typings.astTypes.namedTypesMod.namedTypes.LabeledStatement
    - typings.astTypes.namedTypesMod.namedTypes.BreakStatement
    - typings.astTypes.namedTypesMod.namedTypes.ContinueStatement
    - typings.astTypes.namedTypesMod.namedTypes.WithStatement
    - typings.astTypes.namedTypesMod.namedTypes.SwitchStatement
    - typings.astTypes.namedTypesMod.namedTypes.ReturnStatement
    - typings.astTypes.namedTypesMod.namedTypes.ThrowStatement
    - typings.astTypes.namedTypesMod.namedTypes.TryStatement
    - typings.astTypes.namedTypesMod.namedTypes.WhileStatement
    - typings.astTypes.namedTypesMod.namedTypes.DoWhileStatement
    - typings.astTypes.namedTypesMod.namedTypes.ForStatement
    - typings.astTypes.namedTypesMod.namedTypes.VariableDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.ForInStatement
    - typings.astTypes.namedTypesMod.namedTypes.DebuggerStatement
    - typings.astTypes.namedTypesMod.namedTypes.FunctionDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.ForOfStatement
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
    - typings.astTypes.namedTypesMod.namedTypes.DeclareVariable
    - typings.astTypes.namedTypesMod.namedTypes.DeclareFunction
    - typings.astTypes.namedTypesMod.namedTypes.DeclareClass
    - typings.astTypes.namedTypesMod.namedTypes.DeclareModule
    - typings.astTypes.namedTypesMod.namedTypes.DeclareModuleExports
    - typings.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.EnumDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.ExportDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.Noop
    - typings.astTypes.namedTypesMod.namedTypes.ClassMethod
    - typings.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
    - typings.astTypes.namedTypesMod.namedTypes.ForAwaitStatement
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
    - typings.astTypes.namedTypesMod.namedTypes.TSExportAssignment
    - typings.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration
  */
  trait StatementKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astTypes.namedTypesMod.namedTypes.TSFunctionType
    - typings.astTypes.namedTypesMod.namedTypes.TSConstructorType
    - typings.astTypes.namedTypesMod.namedTypes.TSIndexSignature
    - typings.astTypes.namedTypesMod.namedTypes.TSPropertySignature
    - typings.astTypes.namedTypesMod.namedTypes.TSMethodSignature
    - typings.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration
    - typings.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration
  */
  trait TSHasOptionalTypeAnnotationKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeReference
    - typings.astTypes.namedTypesMod.namedTypes.TSImportType
  */
  trait TSHasOptionalTypeParameterInstantiationKind extends js.Object
  
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
  trait TSHasOptionalTypeParametersKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation
    - typings.astTypes.namedTypesMod.namedTypes.TSTypePredicate
  */
  trait TSTypeAnnotationKind extends js.Object
  
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
  trait TSTypeKind extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.astTypes.namedTypesMod.namedTypes.TypeAlias
    - typings.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
  */
  trait TypeAliasKind extends js.Object
  
  type AnyTypeAnnotationKind = AnyTypeAnnotation
  
  type ArrayExpressionKind = ArrayExpression
  
  type ArrayPatternKind = ArrayPattern
  
  type ArrayTypeAnnotationKind = ArrayTypeAnnotation
  
  type ArrowFunctionExpressionKind = ArrowFunctionExpression
  
  type AssignmentExpressionKind = AssignmentExpression
  
  type AssignmentPatternKind = AssignmentPattern
  
  type AwaitExpressionKind = AwaitExpression
  
  type BigIntLiteralKind = BigIntLiteral
  
  type BigIntLiteralTypeAnnotationKind = BigIntLiteralTypeAnnotation
  
  type BigIntTypeAnnotationKind = BigIntTypeAnnotation
  
  type BinaryExpressionKind = BinaryExpression
  
  type BindExpressionKind = BindExpression
  
  type BlockKind = Block
  
  type BlockStatementKind = BlockStatement
  
  type BooleanLiteralKind = BooleanLiteral
  
  type BooleanLiteralTypeAnnotationKind = BooleanLiteralTypeAnnotation
  
  type BooleanTypeAnnotationKind = BooleanTypeAnnotation
  
  type BreakStatementKind = BreakStatement
  
  type CatchClauseKind = CatchClause
  
  type ChainExpressionKind = ChainExpression
  
  type ClassBodyKind = ClassBody
  
  type ClassDeclarationKind = ClassDeclaration
  
  type ClassExpressionKind = ClassExpression
  
  type ClassImplementsKind = ClassImplements
  
  type ClassMethodKind = ClassMethod
  
  type ClassPrivateMethodKind = ClassPrivateMethod
  
  type ClassPrivatePropertyKind = ClassPrivateProperty
  
  type ClassPropertyDefinitionKind = ClassPropertyDefinition
  
  type CommentBlockKind = CommentBlock
  
  type CommentLineKind = CommentLine
  
  type ComprehensionBlockKind = ComprehensionBlock
  
  type ComprehensionExpressionKind = ComprehensionExpression
  
  type ConditionalExpressionKind = ConditionalExpression
  
  type ContinueStatementKind = ContinueStatement
  
  type DebuggerStatementKind = DebuggerStatement
  
  type DeclareClassKind = DeclareClass
  
  type DeclareExportAllDeclarationKind = DeclareExportAllDeclaration
  
  type DeclareExportDeclarationKind = DeclareExportDeclaration
  
  type DeclareFunctionKind = DeclareFunction
  
  type DeclareInterfaceKind = DeclareInterface
  
  type DeclareModuleExportsKind = DeclareModuleExports
  
  type DeclareModuleKind = DeclareModule
  
  type DeclareOpaqueTypeKind = DeclareOpaqueType
  
  type DeclareTypeAliasKind = DeclareTypeAlias
  
  type DeclareVariableKind = DeclareVariable
  
  type DeclaredPredicateKind = DeclaredPredicate
  
  type DecoratorKind = Decorator
  
  type DirectiveKind = Directive
  
  type DirectiveLiteralKind = DirectiveLiteral
  
  type DoExpressionKind = DoExpression
  
  type DoWhileStatementKind = DoWhileStatement
  
  type EmptyStatementKind = EmptyStatement
  
  type EmptyTypeAnnotationKind = EmptyTypeAnnotation
  
  type EnumBooleanBodyKind = EnumBooleanBody
  
  type EnumBooleanMemberKind = EnumBooleanMember
  
  type EnumDeclarationKind = EnumDeclaration
  
  type EnumDefaultedMemberKind = EnumDefaultedMember
  
  type EnumNumberBodyKind = EnumNumberBody
  
  type EnumNumberMemberKind = EnumNumberMember
  
  type EnumStringBodyKind = EnumStringBody
  
  type EnumStringMemberKind = EnumStringMember
  
  type EnumSymbolBodyKind = EnumSymbolBody
  
  type ExistentialTypeParamKind = ExistentialTypeParam
  
  type ExistsTypeAnnotationKind = ExistsTypeAnnotation
  
  type ExportAllDeclarationKind = ExportAllDeclaration
  
  type ExportBatchSpecifierKind = ExportBatchSpecifier
  
  type ExportDeclarationKind = ExportDeclaration
  
  type ExportDefaultDeclarationKind = ExportDefaultDeclaration
  
  type ExportDefaultSpecifierKind = ExportDefaultSpecifier
  
  type ExportNamedDeclarationKind = ExportNamedDeclaration
  
  type ExportNamespaceSpecifierKind = ExportNamespaceSpecifier
  
  type ExportSpecifierKind = ExportSpecifier
  
  type ExpressionStatementKind = ExpressionStatement
  
  type FileKind = File
  
  type ForAwaitStatementKind = ForAwaitStatement
  
  type ForInStatementKind = ForInStatement
  
  type ForOfStatementKind = ForOfStatement
  
  type ForStatementKind = ForStatement
  
  type FunctionDeclarationKind = FunctionDeclaration
  
  type FunctionExpressionKind = FunctionExpression
  
  type FunctionTypeAnnotationKind = FunctionTypeAnnotation
  
  type FunctionTypeParamKind = FunctionTypeParam
  
  type GeneratorExpressionKind = GeneratorExpression
  
  type GenericTypeAnnotationKind = GenericTypeAnnotation
  
  type IfStatementKind = IfStatement
  
  type ImportDeclarationKind = ImportDeclaration
  
  type ImportDefaultSpecifierKind = ImportDefaultSpecifier
  
  type ImportExpressionKind = ImportExpression
  
  type ImportKind = Import
  
  type ImportNamespaceSpecifierKind = ImportNamespaceSpecifier
  
  type ImportSpecifierKind = ImportSpecifier
  
  type InferredPredicateKind = InferredPredicate
  
  type InterfaceExtendsKind = InterfaceExtends
  
  type InterfaceTypeAnnotationKind = InterfaceTypeAnnotation
  
  type InterpreterDirectiveKind = InterpreterDirective
  
  type IntersectionTypeAnnotationKind = IntersectionTypeAnnotation
  
  type JSXAttributeKind = JSXAttribute
  
  type JSXClosingElementKind = JSXClosingElement
  
  type JSXClosingFragmentKind = JSXClosingFragment
  
  type JSXElementKind = JSXElement
  
  type JSXEmptyExpressionKind = JSXEmptyExpression
  
  type JSXExpressionContainerKind = JSXExpressionContainer
  
  type JSXFragmentKind = JSXFragment
  
  type JSXIdentifierKind = JSXIdentifier
  
  type JSXMemberExpressionKind = JSXMemberExpression
  
  type JSXNamespacedNameKind = JSXNamespacedName
  
  type JSXOpeningElementKind = JSXOpeningElement
  
  type JSXOpeningFragmentKind = JSXOpeningFragment
  
  type JSXSpreadAttributeKind = JSXSpreadAttribute
  
  type JSXSpreadChildKind = JSXSpreadChild
  
  type JSXTextKind = JSXText
  
  type LabeledStatementKind = LabeledStatement
  
  type LineKind = Line
  
  type LogicalExpressionKind = LogicalExpression
  
  type MemberTypeAnnotationKind = MemberTypeAnnotation
  
  type MetaPropertyKind = MetaProperty
  
  type MethodDefinitionKind = MethodDefinition
  
  type MixedTypeAnnotationKind = MixedTypeAnnotation
  
  type NewExpressionKind = NewExpression
  
  type NoopKind = Noop
  
  type NullLiteralKind = NullLiteral
  
  type NullLiteralTypeAnnotationKind = NullLiteralTypeAnnotation
  
  type NullTypeAnnotationKind = NullTypeAnnotation
  
  type NullableTypeAnnotationKind = NullableTypeAnnotation
  
  type NumberLiteralTypeAnnotationKind = NumberLiteralTypeAnnotation
  
  type NumberTypeAnnotationKind = NumberTypeAnnotation
  
  type NumericLiteralKind = NumericLiteral
  
  type NumericLiteralTypeAnnotationKind = NumericLiteralTypeAnnotation
  
  type ObjectExpressionKind = ObjectExpression
  
  type ObjectMethodKind = ObjectMethod
  
  type ObjectPatternKind = ObjectPattern
  
  type ObjectPropertyKind = ObjectProperty
  
  type ObjectTypeAnnotationKind = ObjectTypeAnnotation
  
  type ObjectTypeCallPropertyKind = ObjectTypeCallProperty
  
  type ObjectTypeIndexerKind = ObjectTypeIndexer
  
  type ObjectTypeInternalSlotKind = ObjectTypeInternalSlot
  
  type ObjectTypePropertyKind = ObjectTypeProperty
  
  type ObjectTypeSpreadPropertyKind = ObjectTypeSpreadProperty
  
  type OptionalCallExpressionKind = OptionalCallExpression
  
  type OptionalMemberExpressionKind = OptionalMemberExpression
  
  type ParenthesizedExpressionKind = ParenthesizedExpression
  
  type PositionKind = Position
  
  type PrivateNameKind = PrivateName
  
  type ProgramKind = Program
  
  type PropertyKind = Property
  
  type PropertyPatternKind = PropertyPattern
  
  type QualifiedTypeIdentifierKind = QualifiedTypeIdentifier
  
  type RegExpLiteralKind = RegExpLiteral
  
  type RestElementKind = RestElement
  
  type RestPropertyKind = RestProperty
  
  type ReturnStatementKind = ReturnStatement
  
  type SequenceExpressionKind = SequenceExpression
  
  type SourceLocationKind = SourceLocation
  
  type SpreadElementKind = SpreadElement
  
  type SpreadElementPatternKind = SpreadElementPattern
  
  type SpreadPropertyKind = SpreadProperty
  
  type SpreadPropertyPatternKind = SpreadPropertyPattern
  
  type StringLiteralKind = StringLiteral
  
  type StringLiteralTypeAnnotationKind = StringLiteralTypeAnnotation
  
  type StringTypeAnnotationKind = StringTypeAnnotation
  
  type SuperKind = Super
  
  type SwitchCaseKind = SwitchCase
  
  type SwitchStatementKind = SwitchStatement
  
  type SymbolTypeAnnotationKind = SymbolTypeAnnotation
  
  type TSAnyKeywordKind = TSAnyKeyword
  
  type TSArrayTypeKind = TSArrayType
  
  type TSAsExpressionKind = TSAsExpression
  
  type TSBigIntKeywordKind = TSBigIntKeyword
  
  type TSBooleanKeywordKind = TSBooleanKeyword
  
  type TSCallSignatureDeclarationKind = TSCallSignatureDeclaration
  
  type TSConditionalTypeKind = TSConditionalType
  
  type TSConstructSignatureDeclarationKind = TSConstructSignatureDeclaration
  
  type TSConstructorTypeKind = TSConstructorType
  
  type TSDeclareFunctionKind = TSDeclareFunction
  
  type TSDeclareMethodKind = TSDeclareMethod
  
  type TSEnumDeclarationKind = TSEnumDeclaration
  
  type TSEnumMemberKind = TSEnumMember
  
  type TSExportAssignmentKind = TSExportAssignment
  
  type TSExpressionWithTypeArgumentsKind = TSExpressionWithTypeArguments
  
  type TSExternalModuleReferenceKind = TSExternalModuleReference
  
  type TSFunctionTypeKind = TSFunctionType
  
  type TSImportEqualsDeclarationKind = TSImportEqualsDeclaration
  
  type TSImportTypeKind = TSImportType
  
  type TSIndexSignatureKind = TSIndexSignature
  
  type TSIndexedAccessTypeKind = TSIndexedAccessType
  
  type TSInferTypeKind = TSInferType
  
  type TSInterfaceBodyKind = TSInterfaceBody
  
  type TSInterfaceDeclarationKind = TSInterfaceDeclaration
  
  type TSIntersectionTypeKind = TSIntersectionType
  
  type TSLiteralTypeKind = TSLiteralType
  
  type TSMappedTypeKind = TSMappedType
  
  type TSMethodSignatureKind = TSMethodSignature
  
  type TSModuleBlockKind = TSModuleBlock
  
  type TSModuleDeclarationKind = TSModuleDeclaration
  
  type TSNamedTupleMemberKind = TSNamedTupleMember
  
  type TSNamespaceExportDeclarationKind = TSNamespaceExportDeclaration
  
  type TSNeverKeywordKind = TSNeverKeyword
  
  type TSNonNullExpressionKind = TSNonNullExpression
  
  type TSNullKeywordKind = TSNullKeyword
  
  type TSNumberKeywordKind = TSNumberKeyword
  
  type TSObjectKeywordKind = TSObjectKeyword
  
  type TSOptionalTypeKind = TSOptionalType
  
  type TSParameterPropertyKind = TSParameterProperty
  
  type TSParenthesizedTypeKind = TSParenthesizedType
  
  type TSPropertySignatureKind = TSPropertySignature
  
  type TSQualifiedNameKind = TSQualifiedName
  
  type TSRestTypeKind = TSRestType
  
  type TSStringKeywordKind = TSStringKeyword
  
  type TSSymbolKeywordKind = TSSymbolKeyword
  
  type TSThisTypeKind = TSThisType
  
  type TSTupleTypeKind = TSTupleType
  
  type TSTypeAliasDeclarationKind = TSTypeAliasDeclaration
  
  type TSTypeAssertionKind = TSTypeAssertion
  
  type TSTypeLiteralKind = TSTypeLiteral
  
  type TSTypeOperatorKind = TSTypeOperator
  
  type TSTypeParameterDeclarationKind = TSTypeParameterDeclaration
  
  type TSTypeParameterInstantiationKind = TSTypeParameterInstantiation
  
  type TSTypeParameterKind = TSTypeParameter
  
  type TSTypePredicateKind = TSTypePredicate
  
  type TSTypeQueryKind = TSTypeQuery
  
  type TSTypeReferenceKind = TSTypeReference
  
  type TSUndefinedKeywordKind = TSUndefinedKeyword
  
  type TSUnionTypeKind = TSUnionType
  
  type TSUnknownKeywordKind = TSUnknownKeyword
  
  type TSVoidKeywordKind = TSVoidKeyword
  
  type TaggedTemplateExpressionKind = TaggedTemplateExpression
  
  type TemplateElementKind = TemplateElement
  
  type TemplateLiteralKind = TemplateLiteral
  
  type ThisExpressionKind = ThisExpression
  
  type ThisTypeAnnotationKind = ThisTypeAnnotation
  
  type ThrowStatementKind = ThrowStatement
  
  type TryStatementKind = TryStatement
  
  type TupleTypeAnnotationKind = TupleTypeAnnotation
  
  type TypeAnnotationKind = TypeAnnotation
  
  type TypeCastExpressionKind = TypeCastExpression
  
  type TypeParameterDeclarationKind = TypeParameterDeclaration
  
  type TypeParameterInstantiationKind = TypeParameterInstantiation
  
  type TypeParameterKind = TypeParameter
  
  type TypeofTypeAnnotationKind = TypeofTypeAnnotation
  
  type UnaryExpressionKind = UnaryExpression
  
  type UnionTypeAnnotationKind = UnionTypeAnnotation
  
  type UpdateExpressionKind = UpdateExpression
  
  type VariableDeclarationKind = VariableDeclaration
  
  type VariableDeclaratorKind = VariableDeclarator
  
  type VarianceKind = Variance
  
  type VoidTypeAnnotationKind = VoidTypeAnnotation
  
  type WhileStatementKind = WhileStatement
  
  type WithStatementKind = WithStatement
  
  type YieldExpressionKind = YieldExpression
}
