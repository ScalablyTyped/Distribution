package typings.astTypes.namedTypesMod

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
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedTypes_ extends js.Object {
  
  var AnyTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation] = js.native
  
  var ArrayExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ArrayExpression] = js.native
  
  var ArrayPattern: Type[typings.astTypes.namedTypesMod.namedTypes.ArrayPattern] = js.native
  
  var ArrayTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation] = js.native
  
  var ArrowFunctionExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression] = js.native
  
  var AssignmentExpression: Type[typings.astTypes.namedTypesMod.namedTypes.AssignmentExpression] = js.native
  
  var AssignmentPattern: Type[typings.astTypes.namedTypesMod.namedTypes.AssignmentPattern] = js.native
  
  var AwaitExpression: Type[typings.astTypes.namedTypesMod.namedTypes.AwaitExpression] = js.native
  
  var BigIntLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.BigIntLiteral] = js.native
  
  var BigIntLiteralTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation] = js.native
  
  var BigIntTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation] = js.native
  
  var BinaryExpression: Type[typings.astTypes.namedTypesMod.namedTypes.BinaryExpression] = js.native
  
  var BindExpression: Type[typings.astTypes.namedTypesMod.namedTypes.BindExpression] = js.native
  
  var Block: Type[typings.astTypes.namedTypesMod.namedTypes.Block] = js.native
  
  var BlockStatement: Type[typings.astTypes.namedTypesMod.namedTypes.BlockStatement] = js.native
  
  var BooleanLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.BooleanLiteral] = js.native
  
  var BooleanLiteralTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation] = js.native
  
  var BooleanTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation] = js.native
  
  var BreakStatement: Type[typings.astTypes.namedTypesMod.namedTypes.BreakStatement] = js.native
  
  var CallExpression: Type[typings.astTypes.namedTypesMod.namedTypes.CallExpression] = js.native
  
  var CatchClause: Type[typings.astTypes.namedTypesMod.namedTypes.CatchClause] = js.native
  
  var ChainElement: Type[typings.astTypes.namedTypesMod.namedTypes.ChainElement] = js.native
  
  var ChainExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ChainExpression] = js.native
  
  var ClassBody: Type[typings.astTypes.namedTypesMod.namedTypes.ClassBody] = js.native
  
  var ClassDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.ClassDeclaration] = js.native
  
  var ClassExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ClassExpression] = js.native
  
  var ClassImplements: Type[typings.astTypes.namedTypesMod.namedTypes.ClassImplements] = js.native
  
  var ClassMethod: Type[typings.astTypes.namedTypesMod.namedTypes.ClassMethod] = js.native
  
  var ClassPrivateMethod: Type[typings.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod] = js.native
  
  var ClassPrivateProperty: Type[typings.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty] = js.native
  
  var ClassProperty: Type[typings.astTypes.namedTypesMod.namedTypes.ClassProperty] = js.native
  
  var ClassPropertyDefinition: Type[typings.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition] = js.native
  
  var Comment: Type[typings.astTypes.namedTypesMod.namedTypes.Comment] = js.native
  
  var CommentBlock: Type[typings.astTypes.namedTypesMod.namedTypes.CommentBlock] = js.native
  
  var CommentLine: Type[typings.astTypes.namedTypesMod.namedTypes.CommentLine] = js.native
  
  var ComprehensionBlock: Type[typings.astTypes.namedTypesMod.namedTypes.ComprehensionBlock] = js.native
  
  var ComprehensionExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ComprehensionExpression] = js.native
  
  var ConditionalExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ConditionalExpression] = js.native
  
  var ContinueStatement: Type[typings.astTypes.namedTypesMod.namedTypes.ContinueStatement] = js.native
  
  var DebuggerStatement: Type[typings.astTypes.namedTypesMod.namedTypes.DebuggerStatement] = js.native
  
  var Declaration: Type[typings.astTypes.namedTypesMod.namedTypes.Declaration] = js.native
  
  var DeclareClass: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareClass] = js.native
  
  var DeclareExportAllDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration] = js.native
  
  var DeclareExportDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration] = js.native
  
  var DeclareFunction: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareFunction] = js.native
  
  var DeclareInterface: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareInterface] = js.native
  
  var DeclareModule: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareModule] = js.native
  
  var DeclareModuleExports: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareModuleExports] = js.native
  
  var DeclareOpaqueType: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType] = js.native
  
  var DeclareTypeAlias: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias] = js.native
  
  var DeclareVariable: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareVariable] = js.native
  
  var DeclaredPredicate: Type[typings.astTypes.namedTypesMod.namedTypes.DeclaredPredicate] = js.native
  
  var Decorator: Type[typings.astTypes.namedTypesMod.namedTypes.Decorator] = js.native
  
  var Directive: Type[typings.astTypes.namedTypesMod.namedTypes.Directive] = js.native
  
  var DirectiveLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.DirectiveLiteral] = js.native
  
  var DoExpression: Type[typings.astTypes.namedTypesMod.namedTypes.DoExpression] = js.native
  
  var DoWhileStatement: Type[typings.astTypes.namedTypesMod.namedTypes.DoWhileStatement] = js.native
  
  var EmptyStatement: Type[typings.astTypes.namedTypesMod.namedTypes.EmptyStatement] = js.native
  
  var EmptyTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation] = js.native
  
  var EnumBooleanBody: Type[typings.astTypes.namedTypesMod.namedTypes.EnumBooleanBody] = js.native
  
  var EnumBooleanMember: Type[typings.astTypes.namedTypesMod.namedTypes.EnumBooleanMember] = js.native
  
  var EnumDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.EnumDeclaration] = js.native
  
  var EnumDefaultedMember: Type[typings.astTypes.namedTypesMod.namedTypes.EnumDefaultedMember] = js.native
  
  var EnumNumberBody: Type[typings.astTypes.namedTypesMod.namedTypes.EnumNumberBody] = js.native
  
  var EnumNumberMember: Type[typings.astTypes.namedTypesMod.namedTypes.EnumNumberMember] = js.native
  
  var EnumStringBody: Type[typings.astTypes.namedTypesMod.namedTypes.EnumStringBody] = js.native
  
  var EnumStringMember: Type[typings.astTypes.namedTypesMod.namedTypes.EnumStringMember] = js.native
  
  var EnumSymbolBody: Type[typings.astTypes.namedTypesMod.namedTypes.EnumSymbolBody] = js.native
  
  var ExistentialTypeParam: Type[typings.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam] = js.native
  
  var ExistsTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation] = js.native
  
  var ExportAllDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration] = js.native
  
  var ExportBatchSpecifier: Type[typings.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier] = js.native
  
  var ExportDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.ExportDeclaration] = js.native
  
  var ExportDefaultDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration] = js.native
  
  var ExportDefaultSpecifier: Type[typings.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier] = js.native
  
  var ExportNamedDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration] = js.native
  
  var ExportNamespaceSpecifier: Type[typings.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier] = js.native
  
  var ExportSpecifier: Type[typings.astTypes.namedTypesMod.namedTypes.ExportSpecifier] = js.native
  
  var Expression: Type[typings.astTypes.namedTypesMod.namedTypes.Expression] = js.native
  
  var ExpressionStatement: Type[typings.astTypes.namedTypesMod.namedTypes.ExpressionStatement] = js.native
  
  var File: Type[typings.astTypes.namedTypesMod.namedTypes.File] = js.native
  
  var Flow: Type[typings.astTypes.namedTypesMod.namedTypes.Flow] = js.native
  
  var FlowPredicate: Type[typings.astTypes.namedTypesMod.namedTypes.FlowPredicate] = js.native
  
  var FlowType: Type[typings.astTypes.namedTypesMod.namedTypes.FlowType] = js.native
  
  var ForAwaitStatement: Type[typings.astTypes.namedTypesMod.namedTypes.ForAwaitStatement] = js.native
  
  var ForInStatement: Type[typings.astTypes.namedTypesMod.namedTypes.ForInStatement] = js.native
  
  var ForOfStatement: Type[typings.astTypes.namedTypesMod.namedTypes.ForOfStatement] = js.native
  
  var ForStatement: Type[typings.astTypes.namedTypesMod.namedTypes.ForStatement] = js.native
  
  var Function: Type[typings.astTypes.namedTypesMod.namedTypes.Function] = js.native
  
  var FunctionDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.FunctionDeclaration] = js.native
  
  var FunctionExpression: Type[typings.astTypes.namedTypesMod.namedTypes.FunctionExpression] = js.native
  
  var FunctionTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation] = js.native
  
  var FunctionTypeParam: Type[typings.astTypes.namedTypesMod.namedTypes.FunctionTypeParam] = js.native
  
  var GeneratorExpression: Type[typings.astTypes.namedTypesMod.namedTypes.GeneratorExpression] = js.native
  
  var GenericTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation] = js.native
  
  var Identifier: Type[typings.astTypes.namedTypesMod.namedTypes.Identifier] = js.native
  
  var IfStatement: Type[typings.astTypes.namedTypesMod.namedTypes.IfStatement] = js.native
  
  var Import: Type[typings.astTypes.namedTypesMod.namedTypes.Import] = js.native
  
  var ImportDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.ImportDeclaration] = js.native
  
  var ImportDefaultSpecifier: Type[typings.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier] = js.native
  
  var ImportExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ImportExpression] = js.native
  
  var ImportNamespaceSpecifier: Type[typings.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier] = js.native
  
  var ImportSpecifier: Type[typings.astTypes.namedTypesMod.namedTypes.ImportSpecifier] = js.native
  
  var InferredPredicate: Type[typings.astTypes.namedTypesMod.namedTypes.InferredPredicate] = js.native
  
  var InterfaceDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration] = js.native
  
  var InterfaceExtends: Type[typings.astTypes.namedTypesMod.namedTypes.InterfaceExtends] = js.native
  
  var InterfaceTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation] = js.native
  
  var InterpreterDirective: Type[typings.astTypes.namedTypesMod.namedTypes.InterpreterDirective] = js.native
  
  var IntersectionTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation] = js.native
  
  var JSXAttribute: Type[typings.astTypes.namedTypesMod.namedTypes.JSXAttribute] = js.native
  
  var JSXClosingElement: Type[typings.astTypes.namedTypesMod.namedTypes.JSXClosingElement] = js.native
  
  var JSXClosingFragment: Type[typings.astTypes.namedTypesMod.namedTypes.JSXClosingFragment] = js.native
  
  var JSXElement: Type[typings.astTypes.namedTypesMod.namedTypes.JSXElement] = js.native
  
  var JSXEmptyExpression: Type[typings.astTypes.namedTypesMod.namedTypes.JSXEmptyExpression] = js.native
  
  var JSXExpressionContainer: Type[typings.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer] = js.native
  
  var JSXFragment: Type[typings.astTypes.namedTypesMod.namedTypes.JSXFragment] = js.native
  
  var JSXIdentifier: Type[typings.astTypes.namedTypesMod.namedTypes.JSXIdentifier] = js.native
  
  var JSXMemberExpression: Type[typings.astTypes.namedTypesMod.namedTypes.JSXMemberExpression] = js.native
  
  var JSXNamespacedName: Type[typings.astTypes.namedTypesMod.namedTypes.JSXNamespacedName] = js.native
  
  var JSXOpeningElement: Type[typings.astTypes.namedTypesMod.namedTypes.JSXOpeningElement] = js.native
  
  var JSXOpeningFragment: Type[typings.astTypes.namedTypesMod.namedTypes.JSXOpeningFragment] = js.native
  
  var JSXSpreadAttribute: Type[typings.astTypes.namedTypesMod.namedTypes.JSXSpreadAttribute] = js.native
  
  var JSXSpreadChild: Type[typings.astTypes.namedTypesMod.namedTypes.JSXSpreadChild] = js.native
  
  var JSXText: Type[typings.astTypes.namedTypesMod.namedTypes.JSXText] = js.native
  
  var LabeledStatement: Type[typings.astTypes.namedTypesMod.namedTypes.LabeledStatement] = js.native
  
  var Line: Type[typings.astTypes.namedTypesMod.namedTypes.Line] = js.native
  
  var Literal: Type[typings.astTypes.namedTypesMod.namedTypes.Literal] = js.native
  
  var LogicalExpression: Type[typings.astTypes.namedTypesMod.namedTypes.LogicalExpression] = js.native
  
  var MemberExpression: Type[typings.astTypes.namedTypesMod.namedTypes.MemberExpression] = js.native
  
  var MemberTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation] = js.native
  
  var MetaProperty: Type[typings.astTypes.namedTypesMod.namedTypes.MetaProperty] = js.native
  
  var MethodDefinition: Type[typings.astTypes.namedTypesMod.namedTypes.MethodDefinition] = js.native
  
  var MixedTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation] = js.native
  
  var ModuleSpecifier: Type[typings.astTypes.namedTypesMod.namedTypes.ModuleSpecifier] = js.native
  
  var NewExpression: Type[typings.astTypes.namedTypesMod.namedTypes.NewExpression] = js.native
  
  var Node: Type[typings.astTypes.namedTypesMod.namedTypes.Node] = js.native
  
  var Noop: Type[typings.astTypes.namedTypesMod.namedTypes.Noop] = js.native
  
  var NullLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.NullLiteral] = js.native
  
  var NullLiteralTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation] = js.native
  
  var NullTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation] = js.native
  
  var NullableTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation] = js.native
  
  var NumberLiteralTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation] = js.native
  
  var NumberTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation] = js.native
  
  var NumericLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.NumericLiteral] = js.native
  
  var NumericLiteralTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation] = js.native
  
  var ObjectExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectExpression] = js.native
  
  var ObjectMethod: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectMethod] = js.native
  
  var ObjectPattern: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectPattern] = js.native
  
  var ObjectProperty: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectProperty] = js.native
  
  var ObjectTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation] = js.native
  
  var ObjectTypeCallProperty: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectTypeCallProperty] = js.native
  
  var ObjectTypeIndexer: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectTypeIndexer] = js.native
  
  var ObjectTypeInternalSlot: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectTypeInternalSlot] = js.native
  
  var ObjectTypeProperty: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectTypeProperty] = js.native
  
  var ObjectTypeSpreadProperty: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectTypeSpreadProperty] = js.native
  
  var OpaqueType: Type[typings.astTypes.namedTypesMod.namedTypes.OpaqueType] = js.native
  
  var OptionalCallExpression: Type[typings.astTypes.namedTypesMod.namedTypes.OptionalCallExpression] = js.native
  
  var OptionalMemberExpression: Type[typings.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression] = js.native
  
  var ParenthesizedExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression] = js.native
  
  var Pattern: Type[typings.astTypes.namedTypesMod.namedTypes.Pattern] = js.native
  
  var Position: Type[typings.astTypes.namedTypesMod.namedTypes.Position] = js.native
  
  var Printable: Type[typings.astTypes.namedTypesMod.namedTypes.Printable] = js.native
  
  var PrivateName: Type[typings.astTypes.namedTypesMod.namedTypes.PrivateName] = js.native
  
  var Program: Type[typings.astTypes.namedTypesMod.namedTypes.Program] = js.native
  
  var Property: Type[typings.astTypes.namedTypesMod.namedTypes.Property] = js.native
  
  var PropertyPattern: Type[typings.astTypes.namedTypesMod.namedTypes.PropertyPattern] = js.native
  
  var QualifiedTypeIdentifier: Type[typings.astTypes.namedTypesMod.namedTypes.QualifiedTypeIdentifier] = js.native
  
  var RegExpLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.RegExpLiteral] = js.native
  
  var RestElement: Type[typings.astTypes.namedTypesMod.namedTypes.RestElement] = js.native
  
  var RestProperty: Type[typings.astTypes.namedTypesMod.namedTypes.RestProperty] = js.native
  
  var ReturnStatement: Type[typings.astTypes.namedTypesMod.namedTypes.ReturnStatement] = js.native
  
  var SequenceExpression: Type[typings.astTypes.namedTypesMod.namedTypes.SequenceExpression] = js.native
  
  var SourceLocation: Type[typings.astTypes.namedTypesMod.namedTypes.SourceLocation] = js.native
  
  var Specifier: Type[typings.astTypes.namedTypesMod.namedTypes.Specifier] = js.native
  
  var SpreadElement: Type[typings.astTypes.namedTypesMod.namedTypes.SpreadElement] = js.native
  
  var SpreadElementPattern: Type[typings.astTypes.namedTypesMod.namedTypes.SpreadElementPattern] = js.native
  
  var SpreadProperty: Type[typings.astTypes.namedTypesMod.namedTypes.SpreadProperty] = js.native
  
  var SpreadPropertyPattern: Type[typings.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern] = js.native
  
  var Statement: Type[typings.astTypes.namedTypesMod.namedTypes.Statement] = js.native
  
  var StringLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.StringLiteral] = js.native
  
  var StringLiteralTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation] = js.native
  
  var StringTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation] = js.native
  
  var Super: Type[typings.astTypes.namedTypesMod.namedTypes.Super] = js.native
  
  var SwitchCase: Type[typings.astTypes.namedTypesMod.namedTypes.SwitchCase] = js.native
  
  var SwitchStatement: Type[typings.astTypes.namedTypesMod.namedTypes.SwitchStatement] = js.native
  
  var SymbolTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation] = js.native
  
  var TSAnyKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSAnyKeyword] = js.native
  
  var TSArrayType: Type[typings.astTypes.namedTypesMod.namedTypes.TSArrayType] = js.native
  
  var TSAsExpression: Type[typings.astTypes.namedTypesMod.namedTypes.TSAsExpression] = js.native
  
  var TSBigIntKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSBigIntKeyword] = js.native
  
  var TSBooleanKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSBooleanKeyword] = js.native
  
  var TSCallSignatureDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration] = js.native
  
  var TSConditionalType: Type[typings.astTypes.namedTypesMod.namedTypes.TSConditionalType] = js.native
  
  var TSConstructSignatureDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration] = js.native
  
  var TSConstructorType: Type[typings.astTypes.namedTypesMod.namedTypes.TSConstructorType] = js.native
  
  var TSDeclareFunction: Type[typings.astTypes.namedTypesMod.namedTypes.TSDeclareFunction] = js.native
  
  var TSDeclareMethod: Type[typings.astTypes.namedTypesMod.namedTypes.TSDeclareMethod] = js.native
  
  var TSEnumDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration] = js.native
  
  var TSEnumMember: Type[typings.astTypes.namedTypesMod.namedTypes.TSEnumMember] = js.native
  
  var TSExportAssignment: Type[typings.astTypes.namedTypesMod.namedTypes.TSExportAssignment] = js.native
  
  var TSExpressionWithTypeArguments: Type[typings.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments] = js.native
  
  var TSExternalModuleReference: Type[typings.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference] = js.native
  
  var TSFunctionType: Type[typings.astTypes.namedTypesMod.namedTypes.TSFunctionType] = js.native
  
  var TSHasOptionalTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeAnnotation] = js.native
  
  var TSHasOptionalTypeParameterInstantiation: Type[
    typings.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeParameterInstantiation
  ] = js.native
  
  var TSHasOptionalTypeParameters: Type[typings.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeParameters] = js.native
  
  var TSImportEqualsDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration] = js.native
  
  var TSImportType: Type[typings.astTypes.namedTypesMod.namedTypes.TSImportType] = js.native
  
  var TSIndexSignature: Type[typings.astTypes.namedTypesMod.namedTypes.TSIndexSignature] = js.native
  
  var TSIndexedAccessType: Type[typings.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType] = js.native
  
  var TSInferType: Type[typings.astTypes.namedTypesMod.namedTypes.TSInferType] = js.native
  
  var TSInterfaceBody: Type[typings.astTypes.namedTypesMod.namedTypes.TSInterfaceBody] = js.native
  
  var TSInterfaceDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration] = js.native
  
  var TSIntersectionType: Type[typings.astTypes.namedTypesMod.namedTypes.TSIntersectionType] = js.native
  
  var TSLiteralType: Type[typings.astTypes.namedTypesMod.namedTypes.TSLiteralType] = js.native
  
  var TSMappedType: Type[typings.astTypes.namedTypesMod.namedTypes.TSMappedType] = js.native
  
  var TSMethodSignature: Type[typings.astTypes.namedTypesMod.namedTypes.TSMethodSignature] = js.native
  
  var TSModuleBlock: Type[typings.astTypes.namedTypesMod.namedTypes.TSModuleBlock] = js.native
  
  var TSModuleDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration] = js.native
  
  var TSNamedTupleMember: Type[typings.astTypes.namedTypesMod.namedTypes.TSNamedTupleMember] = js.native
  
  var TSNamespaceExportDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration] = js.native
  
  var TSNeverKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSNeverKeyword] = js.native
  
  var TSNonNullExpression: Type[typings.astTypes.namedTypesMod.namedTypes.TSNonNullExpression] = js.native
  
  var TSNullKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSNullKeyword] = js.native
  
  var TSNumberKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSNumberKeyword] = js.native
  
  var TSObjectKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSObjectKeyword] = js.native
  
  var TSOptionalType: Type[typings.astTypes.namedTypesMod.namedTypes.TSOptionalType] = js.native
  
  var TSParameterProperty: Type[typings.astTypes.namedTypesMod.namedTypes.TSParameterProperty] = js.native
  
  var TSParenthesizedType: Type[typings.astTypes.namedTypesMod.namedTypes.TSParenthesizedType] = js.native
  
  var TSPropertySignature: Type[typings.astTypes.namedTypesMod.namedTypes.TSPropertySignature] = js.native
  
  var TSQualifiedName: Type[typings.astTypes.namedTypesMod.namedTypes.TSQualifiedName] = js.native
  
  var TSRestType: Type[typings.astTypes.namedTypesMod.namedTypes.TSRestType] = js.native
  
  var TSStringKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSStringKeyword] = js.native
  
  var TSSymbolKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSSymbolKeyword] = js.native
  
  var TSThisType: Type[typings.astTypes.namedTypesMod.namedTypes.TSThisType] = js.native
  
  var TSTupleType: Type[typings.astTypes.namedTypesMod.namedTypes.TSTupleType] = js.native
  
  var TSType: Type[typings.astTypes.namedTypesMod.namedTypes.TSType] = js.native
  
  var TSTypeAliasDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration] = js.native
  
  var TSTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation] = js.native
  
  var TSTypeAssertion: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeAssertion] = js.native
  
  var TSTypeLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeLiteral] = js.native
  
  var TSTypeOperator: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeOperator] = js.native
  
  var TSTypeParameter: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeParameter] = js.native
  
  var TSTypeParameterDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration] = js.native
  
  var TSTypeParameterInstantiation: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeParameterInstantiation] = js.native
  
  var TSTypePredicate: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypePredicate] = js.native
  
  var TSTypeQuery: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeQuery] = js.native
  
  var TSTypeReference: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeReference] = js.native
  
  var TSUndefinedKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSUndefinedKeyword] = js.native
  
  var TSUnionType: Type[typings.astTypes.namedTypesMod.namedTypes.TSUnionType] = js.native
  
  var TSUnknownKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSUnknownKeyword] = js.native
  
  var TSVoidKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSVoidKeyword] = js.native
  
  var TaggedTemplateExpression: Type[typings.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression] = js.native
  
  var TemplateElement: Type[typings.astTypes.namedTypesMod.namedTypes.TemplateElement] = js.native
  
  var TemplateLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.TemplateLiteral] = js.native
  
  var ThisExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ThisExpression] = js.native
  
  var ThisTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation] = js.native
  
  var ThrowStatement: Type[typings.astTypes.namedTypesMod.namedTypes.ThrowStatement] = js.native
  
  var TryStatement: Type[typings.astTypes.namedTypesMod.namedTypes.TryStatement] = js.native
  
  var TupleTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation] = js.native
  
  var TypeAlias: Type[typings.astTypes.namedTypesMod.namedTypes.TypeAlias] = js.native
  
  var TypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.TypeAnnotation] = js.native
  
  var TypeCastExpression: Type[typings.astTypes.namedTypesMod.namedTypes.TypeCastExpression] = js.native
  
  var TypeParameter: Type[typings.astTypes.namedTypesMod.namedTypes.TypeParameter] = js.native
  
  var TypeParameterDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TypeParameterDeclaration] = js.native
  
  var TypeParameterInstantiation: Type[typings.astTypes.namedTypesMod.namedTypes.TypeParameterInstantiation] = js.native
  
  var TypeofTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation] = js.native
  
  var UnaryExpression: Type[typings.astTypes.namedTypesMod.namedTypes.UnaryExpression] = js.native
  
  var UnionTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation] = js.native
  
  var UpdateExpression: Type[typings.astTypes.namedTypesMod.namedTypes.UpdateExpression] = js.native
  
  var VariableDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.VariableDeclaration] = js.native
  
  var VariableDeclarator: Type[typings.astTypes.namedTypesMod.namedTypes.VariableDeclarator] = js.native
  
  var Variance: Type[typings.astTypes.namedTypesMod.namedTypes.Variance] = js.native
  
  var VoidTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation] = js.native
  
  var WhileStatement: Type[typings.astTypes.namedTypesMod.namedTypes.WhileStatement] = js.native
  
  var WithStatement: Type[typings.astTypes.namedTypesMod.namedTypes.WithStatement] = js.native
  
  var YieldExpression: Type[typings.astTypes.namedTypesMod.namedTypes.YieldExpression] = js.native
}
object NamedTypes_ {
  
  @scala.inline
  implicit class NamedTypes_Ops[Self <: NamedTypes_] (val x: Self) extends AnyVal {
    
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
    def setAnyTypeAnnotation(value: Type[AnyTypeAnnotation]): Self = this.set("AnyTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayExpression(value: Type[ArrayExpression]): Self = this.set("ArrayExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayPattern(value: Type[ArrayPattern]): Self = this.set("ArrayPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayTypeAnnotation(value: Type[ArrayTypeAnnotation]): Self = this.set("ArrayTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowFunctionExpression(value: Type[ArrowFunctionExpression]): Self = this.set("ArrowFunctionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentExpression(value: Type[AssignmentExpression]): Self = this.set("AssignmentExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentPattern(value: Type[AssignmentPattern]): Self = this.set("AssignmentPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwaitExpression(value: Type[AwaitExpression]): Self = this.set("AwaitExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigIntLiteral(value: Type[BigIntLiteral]): Self = this.set("BigIntLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigIntLiteralTypeAnnotation(value: Type[BigIntLiteralTypeAnnotation]): Self = this.set("BigIntLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigIntTypeAnnotation(value: Type[BigIntTypeAnnotation]): Self = this.set("BigIntTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryExpression(value: Type[BinaryExpression]): Self = this.set("BinaryExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindExpression(value: Type[BindExpression]): Self = this.set("BindExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlock(value: Type[Block]): Self = this.set("Block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockStatement(value: Type[BlockStatement]): Self = this.set("BlockStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanLiteral(value: Type[BooleanLiteral]): Self = this.set("BooleanLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanLiteralTypeAnnotation(value: Type[BooleanLiteralTypeAnnotation]): Self = this.set("BooleanLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanTypeAnnotation(value: Type[BooleanTypeAnnotation]): Self = this.set("BooleanTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakStatement(value: Type[BreakStatement]): Self = this.set("BreakStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallExpression(value: Type[CallExpression]): Self = this.set("CallExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatchClause(value: Type[CatchClause]): Self = this.set("CatchClause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChainElement(value: Type[ChainElement]): Self = this.set("ChainElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChainExpression(value: Type[ChainExpression]): Self = this.set("ChainExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassBody(value: Type[ClassBody]): Self = this.set("ClassBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassDeclaration(value: Type[ClassDeclaration]): Self = this.set("ClassDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassExpression(value: Type[ClassExpression]): Self = this.set("ClassExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassImplements(value: Type[ClassImplements]): Self = this.set("ClassImplements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassMethod(value: Type[ClassMethod]): Self = this.set("ClassMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassPrivateMethod(value: Type[ClassPrivateMethod]): Self = this.set("ClassPrivateMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassPrivateProperty(value: Type[ClassPrivateProperty]): Self = this.set("ClassPrivateProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassProperty(value: Type[ClassProperty]): Self = this.set("ClassProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassPropertyDefinition(value: Type[ClassPropertyDefinition]): Self = this.set("ClassPropertyDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: Type[Comment]): Self = this.set("Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentBlock(value: Type[CommentBlock]): Self = this.set("CommentBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentLine(value: Type[CommentLine]): Self = this.set("CommentLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComprehensionBlock(value: Type[ComprehensionBlock]): Self = this.set("ComprehensionBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComprehensionExpression(value: Type[ComprehensionExpression]): Self = this.set("ComprehensionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalExpression(value: Type[ConditionalExpression]): Self = this.set("ConditionalExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueStatement(value: Type[ContinueStatement]): Self = this.set("ContinueStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerStatement(value: Type[DebuggerStatement]): Self = this.set("DebuggerStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclaration(value: Type[Declaration]): Self = this.set("Declaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareClass(value: Type[DeclareClass]): Self = this.set("DeclareClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareExportAllDeclaration(value: Type[DeclareExportAllDeclaration]): Self = this.set("DeclareExportAllDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareExportDeclaration(value: Type[DeclareExportDeclaration]): Self = this.set("DeclareExportDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareFunction(value: Type[DeclareFunction]): Self = this.set("DeclareFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareInterface(value: Type[DeclareInterface]): Self = this.set("DeclareInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareModule(value: Type[DeclareModule]): Self = this.set("DeclareModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareModuleExports(value: Type[DeclareModuleExports]): Self = this.set("DeclareModuleExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareOpaqueType(value: Type[DeclareOpaqueType]): Self = this.set("DeclareOpaqueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareTypeAlias(value: Type[DeclareTypeAlias]): Self = this.set("DeclareTypeAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareVariable(value: Type[DeclareVariable]): Self = this.set("DeclareVariable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclaredPredicate(value: Type[DeclaredPredicate]): Self = this.set("DeclaredPredicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecorator(value: Type[Decorator]): Self = this.set("Decorator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirective(value: Type[Directive]): Self = this.set("Directive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectiveLiteral(value: Type[DirectiveLiteral]): Self = this.set("DirectiveLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoExpression(value: Type[DoExpression]): Self = this.set("DoExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoWhileStatement(value: Type[DoWhileStatement]): Self = this.set("DoWhileStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyStatement(value: Type[EmptyStatement]): Self = this.set("EmptyStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyTypeAnnotation(value: Type[EmptyTypeAnnotation]): Self = this.set("EmptyTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumBooleanBody(value: Type[EnumBooleanBody]): Self = this.set("EnumBooleanBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumBooleanMember(value: Type[EnumBooleanMember]): Self = this.set("EnumBooleanMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumDeclaration(value: Type[EnumDeclaration]): Self = this.set("EnumDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumDefaultedMember(value: Type[EnumDefaultedMember]): Self = this.set("EnumDefaultedMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumNumberBody(value: Type[EnumNumberBody]): Self = this.set("EnumNumberBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumNumberMember(value: Type[EnumNumberMember]): Self = this.set("EnumNumberMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumStringBody(value: Type[EnumStringBody]): Self = this.set("EnumStringBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumStringMember(value: Type[EnumStringMember]): Self = this.set("EnumStringMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumSymbolBody(value: Type[EnumSymbolBody]): Self = this.set("EnumSymbolBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExistentialTypeParam(value: Type[ExistentialTypeParam]): Self = this.set("ExistentialTypeParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExistsTypeAnnotation(value: Type[ExistsTypeAnnotation]): Self = this.set("ExistsTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportAllDeclaration(value: Type[ExportAllDeclaration]): Self = this.set("ExportAllDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportBatchSpecifier(value: Type[ExportBatchSpecifier]): Self = this.set("ExportBatchSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportDeclaration(value: Type[ExportDeclaration]): Self = this.set("ExportDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportDefaultDeclaration(value: Type[ExportDefaultDeclaration]): Self = this.set("ExportDefaultDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportDefaultSpecifier(value: Type[ExportDefaultSpecifier]): Self = this.set("ExportDefaultSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportNamedDeclaration(value: Type[ExportNamedDeclaration]): Self = this.set("ExportNamedDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportNamespaceSpecifier(value: Type[ExportNamespaceSpecifier]): Self = this.set("ExportNamespaceSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportSpecifier(value: Type[ExportSpecifier]): Self = this.set("ExportSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpression(value: Type[Expression]): Self = this.set("Expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionStatement(value: Type[ExpressionStatement]): Self = this.set("ExpressionStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: Type[File]): Self = this.set("File", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlow(value: Type[Flow]): Self = this.set("Flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowPredicate(value: Type[FlowPredicate]): Self = this.set("FlowPredicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowType(value: Type[FlowType]): Self = this.set("FlowType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForAwaitStatement(value: Type[ForAwaitStatement]): Self = this.set("ForAwaitStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForInStatement(value: Type[ForInStatement]): Self = this.set("ForInStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForOfStatement(value: Type[ForOfStatement]): Self = this.set("ForOfStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForStatement(value: Type[ForStatement]): Self = this.set("ForStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunction(value: Type[Function]): Self = this.set("Function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionDeclaration(value: Type[FunctionDeclaration]): Self = this.set("FunctionDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionExpression(value: Type[FunctionExpression]): Self = this.set("FunctionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionTypeAnnotation(value: Type[FunctionTypeAnnotation]): Self = this.set("FunctionTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionTypeParam(value: Type[FunctionTypeParam]): Self = this.set("FunctionTypeParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratorExpression(value: Type[GeneratorExpression]): Self = this.set("GeneratorExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenericTypeAnnotation(value: Type[GenericTypeAnnotation]): Self = this.set("GenericTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: Type[Identifier]): Self = this.set("Identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfStatement(value: Type[IfStatement]): Self = this.set("IfStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImport(value: Type[Import]): Self = this.set("Import", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportDeclaration(value: Type[ImportDeclaration]): Self = this.set("ImportDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportDefaultSpecifier(value: Type[ImportDefaultSpecifier]): Self = this.set("ImportDefaultSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportExpression(value: Type[ImportExpression]): Self = this.set("ImportExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportNamespaceSpecifier(value: Type[ImportNamespaceSpecifier]): Self = this.set("ImportNamespaceSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportSpecifier(value: Type[ImportSpecifier]): Self = this.set("ImportSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInferredPredicate(value: Type[InferredPredicate]): Self = this.set("InferredPredicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceDeclaration(value: Type[InterfaceDeclaration]): Self = this.set("InterfaceDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceExtends(value: Type[InterfaceExtends]): Self = this.set("InterfaceExtends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceTypeAnnotation(value: Type[InterfaceTypeAnnotation]): Self = this.set("InterfaceTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpreterDirective(value: Type[InterpreterDirective]): Self = this.set("InterpreterDirective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectionTypeAnnotation(value: Type[IntersectionTypeAnnotation]): Self = this.set("IntersectionTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXAttribute(value: Type[JSXAttribute]): Self = this.set("JSXAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXClosingElement(value: Type[JSXClosingElement]): Self = this.set("JSXClosingElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXClosingFragment(value: Type[JSXClosingFragment]): Self = this.set("JSXClosingFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXElement(value: Type[JSXElement]): Self = this.set("JSXElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXEmptyExpression(value: Type[JSXEmptyExpression]): Self = this.set("JSXEmptyExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXExpressionContainer(value: Type[JSXExpressionContainer]): Self = this.set("JSXExpressionContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXFragment(value: Type[JSXFragment]): Self = this.set("JSXFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXIdentifier(value: Type[JSXIdentifier]): Self = this.set("JSXIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXMemberExpression(value: Type[JSXMemberExpression]): Self = this.set("JSXMemberExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXNamespacedName(value: Type[JSXNamespacedName]): Self = this.set("JSXNamespacedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXOpeningElement(value: Type[JSXOpeningElement]): Self = this.set("JSXOpeningElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXOpeningFragment(value: Type[JSXOpeningFragment]): Self = this.set("JSXOpeningFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXSpreadAttribute(value: Type[JSXSpreadAttribute]): Self = this.set("JSXSpreadAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXSpreadChild(value: Type[JSXSpreadChild]): Self = this.set("JSXSpreadChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSXText(value: Type[JSXText]): Self = this.set("JSXText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabeledStatement(value: Type[LabeledStatement]): Self = this.set("LabeledStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Type[Line]): Self = this.set("Line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiteral(value: Type[Literal]): Self = this.set("Literal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalExpression(value: Type[LogicalExpression]): Self = this.set("LogicalExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberExpression(value: Type[MemberExpression]): Self = this.set("MemberExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberTypeAnnotation(value: Type[MemberTypeAnnotation]): Self = this.set("MemberTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaProperty(value: Type[MetaProperty]): Self = this.set("MetaProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodDefinition(value: Type[MethodDefinition]): Self = this.set("MethodDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixedTypeAnnotation(value: Type[MixedTypeAnnotation]): Self = this.set("MixedTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleSpecifier(value: Type[ModuleSpecifier]): Self = this.set("ModuleSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewExpression(value: Type[NewExpression]): Self = this.set("NewExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Type[Node]): Self = this.set("Node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoop(value: Type[Noop]): Self = this.set("Noop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullLiteral(value: Type[NullLiteral]): Self = this.set("NullLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullLiteralTypeAnnotation(value: Type[NullLiteralTypeAnnotation]): Self = this.set("NullLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullTypeAnnotation(value: Type[NullTypeAnnotation]): Self = this.set("NullTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullableTypeAnnotation(value: Type[NullableTypeAnnotation]): Self = this.set("NullableTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberLiteralTypeAnnotation(value: Type[NumberLiteralTypeAnnotation]): Self = this.set("NumberLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberTypeAnnotation(value: Type[NumberTypeAnnotation]): Self = this.set("NumberTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericLiteral(value: Type[NumericLiteral]): Self = this.set("NumericLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericLiteralTypeAnnotation(value: Type[NumericLiteralTypeAnnotation]): Self = this.set("NumericLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectExpression(value: Type[ObjectExpression]): Self = this.set("ObjectExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectMethod(value: Type[ObjectMethod]): Self = this.set("ObjectMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectPattern(value: Type[ObjectPattern]): Self = this.set("ObjectPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectProperty(value: Type[ObjectProperty]): Self = this.set("ObjectProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeAnnotation(value: Type[ObjectTypeAnnotation]): Self = this.set("ObjectTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeCallProperty(value: Type[ObjectTypeCallProperty]): Self = this.set("ObjectTypeCallProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeIndexer(value: Type[ObjectTypeIndexer]): Self = this.set("ObjectTypeIndexer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeInternalSlot(value: Type[ObjectTypeInternalSlot]): Self = this.set("ObjectTypeInternalSlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeProperty(value: Type[ObjectTypeProperty]): Self = this.set("ObjectTypeProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeSpreadProperty(value: Type[ObjectTypeSpreadProperty]): Self = this.set("ObjectTypeSpreadProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpaqueType(value: Type[OpaqueType]): Self = this.set("OpaqueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalCallExpression(value: Type[OptionalCallExpression]): Self = this.set("OptionalCallExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalMemberExpression(value: Type[OptionalMemberExpression]): Self = this.set("OptionalMemberExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParenthesizedExpression(value: Type[ParenthesizedExpression]): Self = this.set("ParenthesizedExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: Type[Pattern]): Self = this.set("Pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Type[Position]): Self = this.set("Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintable(value: Type[Printable]): Self = this.set("Printable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateName(value: Type[PrivateName]): Self = this.set("PrivateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgram(value: Type[Program]): Self = this.set("Program", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: Type[Property]): Self = this.set("Property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyPattern(value: Type[PropertyPattern]): Self = this.set("PropertyPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifiedTypeIdentifier(value: Type[QualifiedTypeIdentifier]): Self = this.set("QualifiedTypeIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegExpLiteral(value: Type[RegExpLiteral]): Self = this.set("RegExpLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestElement(value: Type[RestElement]): Self = this.set("RestElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestProperty(value: Type[RestProperty]): Self = this.set("RestProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnStatement(value: Type[ReturnStatement]): Self = this.set("ReturnStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceExpression(value: Type[SequenceExpression]): Self = this.set("SequenceExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLocation(value: Type[SourceLocation]): Self = this.set("SourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecifier(value: Type[Specifier]): Self = this.set("Specifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadElement(value: Type[SpreadElement]): Self = this.set("SpreadElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadElementPattern(value: Type[SpreadElementPattern]): Self = this.set("SpreadElementPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadProperty(value: Type[SpreadProperty]): Self = this.set("SpreadProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadPropertyPattern(value: Type[SpreadPropertyPattern]): Self = this.set("SpreadPropertyPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement(value: Type[Statement]): Self = this.set("Statement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringLiteral(value: Type[StringLiteral]): Self = this.set("StringLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringLiteralTypeAnnotation(value: Type[StringLiteralTypeAnnotation]): Self = this.set("StringLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringTypeAnnotation(value: Type[StringTypeAnnotation]): Self = this.set("StringTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuper(value: Type[Super]): Self = this.set("Super", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchCase(value: Type[SwitchCase]): Self = this.set("SwitchCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchStatement(value: Type[SwitchStatement]): Self = this.set("SwitchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolTypeAnnotation(value: Type[SymbolTypeAnnotation]): Self = this.set("SymbolTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSAnyKeyword(value: Type[TSAnyKeyword]): Self = this.set("TSAnyKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSArrayType(value: Type[TSArrayType]): Self = this.set("TSArrayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSAsExpression(value: Type[TSAsExpression]): Self = this.set("TSAsExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSBigIntKeyword(value: Type[TSBigIntKeyword]): Self = this.set("TSBigIntKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSBooleanKeyword(value: Type[TSBooleanKeyword]): Self = this.set("TSBooleanKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSCallSignatureDeclaration(value: Type[TSCallSignatureDeclaration]): Self = this.set("TSCallSignatureDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSConditionalType(value: Type[TSConditionalType]): Self = this.set("TSConditionalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSConstructSignatureDeclaration(value: Type[TSConstructSignatureDeclaration]): Self = this.set("TSConstructSignatureDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSConstructorType(value: Type[TSConstructorType]): Self = this.set("TSConstructorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSDeclareFunction(value: Type[TSDeclareFunction]): Self = this.set("TSDeclareFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSDeclareMethod(value: Type[TSDeclareMethod]): Self = this.set("TSDeclareMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSEnumDeclaration(value: Type[TSEnumDeclaration]): Self = this.set("TSEnumDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSEnumMember(value: Type[TSEnumMember]): Self = this.set("TSEnumMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSExportAssignment(value: Type[TSExportAssignment]): Self = this.set("TSExportAssignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSExpressionWithTypeArguments(value: Type[TSExpressionWithTypeArguments]): Self = this.set("TSExpressionWithTypeArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSExternalModuleReference(value: Type[TSExternalModuleReference]): Self = this.set("TSExternalModuleReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSFunctionType(value: Type[TSFunctionType]): Self = this.set("TSFunctionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSHasOptionalTypeAnnotation(value: Type[TSHasOptionalTypeAnnotation]): Self = this.set("TSHasOptionalTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSHasOptionalTypeParameterInstantiation(value: Type[TSHasOptionalTypeParameterInstantiation]): Self = this.set("TSHasOptionalTypeParameterInstantiation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSHasOptionalTypeParameters(value: Type[TSHasOptionalTypeParameters]): Self = this.set("TSHasOptionalTypeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSImportEqualsDeclaration(value: Type[TSImportEqualsDeclaration]): Self = this.set("TSImportEqualsDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSImportType(value: Type[TSImportType]): Self = this.set("TSImportType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSIndexSignature(value: Type[TSIndexSignature]): Self = this.set("TSIndexSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSIndexedAccessType(value: Type[TSIndexedAccessType]): Self = this.set("TSIndexedAccessType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSInferType(value: Type[TSInferType]): Self = this.set("TSInferType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSInterfaceBody(value: Type[TSInterfaceBody]): Self = this.set("TSInterfaceBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSInterfaceDeclaration(value: Type[TSInterfaceDeclaration]): Self = this.set("TSInterfaceDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSIntersectionType(value: Type[TSIntersectionType]): Self = this.set("TSIntersectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSLiteralType(value: Type[TSLiteralType]): Self = this.set("TSLiteralType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSMappedType(value: Type[TSMappedType]): Self = this.set("TSMappedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSMethodSignature(value: Type[TSMethodSignature]): Self = this.set("TSMethodSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSModuleBlock(value: Type[TSModuleBlock]): Self = this.set("TSModuleBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSModuleDeclaration(value: Type[TSModuleDeclaration]): Self = this.set("TSModuleDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSNamedTupleMember(value: Type[TSNamedTupleMember]): Self = this.set("TSNamedTupleMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSNamespaceExportDeclaration(value: Type[TSNamespaceExportDeclaration]): Self = this.set("TSNamespaceExportDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSNeverKeyword(value: Type[TSNeverKeyword]): Self = this.set("TSNeverKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSNonNullExpression(value: Type[TSNonNullExpression]): Self = this.set("TSNonNullExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSNullKeyword(value: Type[TSNullKeyword]): Self = this.set("TSNullKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSNumberKeyword(value: Type[TSNumberKeyword]): Self = this.set("TSNumberKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSObjectKeyword(value: Type[TSObjectKeyword]): Self = this.set("TSObjectKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSOptionalType(value: Type[TSOptionalType]): Self = this.set("TSOptionalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSParameterProperty(value: Type[TSParameterProperty]): Self = this.set("TSParameterProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSParenthesizedType(value: Type[TSParenthesizedType]): Self = this.set("TSParenthesizedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSPropertySignature(value: Type[TSPropertySignature]): Self = this.set("TSPropertySignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSQualifiedName(value: Type[TSQualifiedName]): Self = this.set("TSQualifiedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSRestType(value: Type[TSRestType]): Self = this.set("TSRestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSStringKeyword(value: Type[TSStringKeyword]): Self = this.set("TSStringKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSSymbolKeyword(value: Type[TSSymbolKeyword]): Self = this.set("TSSymbolKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSThisType(value: Type[TSThisType]): Self = this.set("TSThisType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSTupleType(value: Type[TSTupleType]): Self = this.set("TSTupleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSType(value: Type[TSType]): Self = this.set("TSType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSTypeAliasDeclaration(value: Type[TSTypeAliasDeclaration]): Self = this.set("TSTypeAliasDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSTypeAnnotation(value: Type[TSTypeAnnotation]): Self = this.set("TSTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSTypeAssertion(value: Type[TSTypeAssertion]): Self = this.set("TSTypeAssertion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSTypeLiteral(value: Type[TSTypeLiteral]): Self = this.set("TSTypeLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSTypeOperator(value: Type[TSTypeOperator]): Self = this.set("TSTypeOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSTypeParameter(value: Type[TSTypeParameter]): Self = this.set("TSTypeParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSTypeParameterDeclaration(value: Type[TSTypeParameterDeclaration]): Self = this.set("TSTypeParameterDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSTypeParameterInstantiation(value: Type[TSTypeParameterInstantiation]): Self = this.set("TSTypeParameterInstantiation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSTypePredicate(value: Type[TSTypePredicate]): Self = this.set("TSTypePredicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSTypeQuery(value: Type[TSTypeQuery]): Self = this.set("TSTypeQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSTypeReference(value: Type[TSTypeReference]): Self = this.set("TSTypeReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSUndefinedKeyword(value: Type[TSUndefinedKeyword]): Self = this.set("TSUndefinedKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSUnionType(value: Type[TSUnionType]): Self = this.set("TSUnionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSUnknownKeyword(value: Type[TSUnknownKeyword]): Self = this.set("TSUnknownKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTSVoidKeyword(value: Type[TSVoidKeyword]): Self = this.set("TSVoidKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaggedTemplateExpression(value: Type[TaggedTemplateExpression]): Self = this.set("TaggedTemplateExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateElement(value: Type[TemplateElement]): Self = this.set("TemplateElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateLiteral(value: Type[TemplateLiteral]): Self = this.set("TemplateLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThisExpression(value: Type[ThisExpression]): Self = this.set("ThisExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThisTypeAnnotation(value: Type[ThisTypeAnnotation]): Self = this.set("ThisTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowStatement(value: Type[ThrowStatement]): Self = this.set("ThrowStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryStatement(value: Type[TryStatement]): Self = this.set("TryStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTupleTypeAnnotation(value: Type[TupleTypeAnnotation]): Self = this.set("TupleTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAlias(value: Type[TypeAlias]): Self = this.set("TypeAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: Type[TypeAnnotation]): Self = this.set("TypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeCastExpression(value: Type[TypeCastExpression]): Self = this.set("TypeCastExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameter(value: Type[TypeParameter]): Self = this.set("TypeParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameterDeclaration(value: Type[TypeParameterDeclaration]): Self = this.set("TypeParameterDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameterInstantiation(value: Type[TypeParameterInstantiation]): Self = this.set("TypeParameterInstantiation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeofTypeAnnotation(value: Type[TypeofTypeAnnotation]): Self = this.set("TypeofTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnaryExpression(value: Type[UnaryExpression]): Self = this.set("UnaryExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnionTypeAnnotation(value: Type[UnionTypeAnnotation]): Self = this.set("UnionTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateExpression(value: Type[UpdateExpression]): Self = this.set("UpdateExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableDeclaration(value: Type[VariableDeclaration]): Self = this.set("VariableDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableDeclarator(value: Type[VariableDeclarator]): Self = this.set("VariableDeclarator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariance(value: Type[Variance]): Self = this.set("Variance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoidTypeAnnotation(value: Type[VoidTypeAnnotation]): Self = this.set("VoidTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhileStatement(value: Type[WhileStatement]): Self = this.set("WhileStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithStatement(value: Type[WithStatement]): Self = this.set("WithStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYieldExpression(value: Type[YieldExpression]): Self = this.set("YieldExpression", value.asInstanceOf[js.Any])
  }
}
