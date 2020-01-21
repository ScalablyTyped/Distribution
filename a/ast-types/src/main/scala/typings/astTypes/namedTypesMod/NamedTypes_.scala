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
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedTypes_ extends js.Object {
  var AnyTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation]
  var ArrayExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ArrayExpression]
  var ArrayPattern: Type[typings.astTypes.namedTypesMod.namedTypes.ArrayPattern]
  var ArrayTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation]
  var ArrowFunctionExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression]
  var AssignmentExpression: Type[typings.astTypes.namedTypesMod.namedTypes.AssignmentExpression]
  var AssignmentPattern: Type[typings.astTypes.namedTypesMod.namedTypes.AssignmentPattern]
  var AwaitExpression: Type[typings.astTypes.namedTypesMod.namedTypes.AwaitExpression]
  var BigIntLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.BigIntLiteral]
  var BinaryExpression: Type[typings.astTypes.namedTypesMod.namedTypes.BinaryExpression]
  var BindExpression: Type[typings.astTypes.namedTypesMod.namedTypes.BindExpression]
  var Block: Type[typings.astTypes.namedTypesMod.namedTypes.Block]
  var BlockStatement: Type[typings.astTypes.namedTypesMod.namedTypes.BlockStatement]
  var BooleanLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.BooleanLiteral]
  var BooleanLiteralTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation]
  var BooleanTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation]
  var BreakStatement: Type[typings.astTypes.namedTypesMod.namedTypes.BreakStatement]
  var CallExpression: Type[typings.astTypes.namedTypesMod.namedTypes.CallExpression]
  var CatchClause: Type[typings.astTypes.namedTypesMod.namedTypes.CatchClause]
  var ClassBody: Type[typings.astTypes.namedTypesMod.namedTypes.ClassBody]
  var ClassDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.ClassDeclaration]
  var ClassExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ClassExpression]
  var ClassImplements: Type[typings.astTypes.namedTypesMod.namedTypes.ClassImplements]
  var ClassMethod: Type[typings.astTypes.namedTypesMod.namedTypes.ClassMethod]
  var ClassPrivateMethod: Type[typings.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod]
  var ClassPrivateProperty: Type[typings.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty]
  var ClassProperty: Type[typings.astTypes.namedTypesMod.namedTypes.ClassProperty]
  var ClassPropertyDefinition: Type[typings.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition]
  var Comment: Type[typings.astTypes.namedTypesMod.namedTypes.Comment]
  var CommentBlock: Type[typings.astTypes.namedTypesMod.namedTypes.CommentBlock]
  var CommentLine: Type[typings.astTypes.namedTypesMod.namedTypes.CommentLine]
  var ComprehensionBlock: Type[typings.astTypes.namedTypesMod.namedTypes.ComprehensionBlock]
  var ComprehensionExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ComprehensionExpression]
  var ConditionalExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ConditionalExpression]
  var ContinueStatement: Type[typings.astTypes.namedTypesMod.namedTypes.ContinueStatement]
  var DebuggerStatement: Type[typings.astTypes.namedTypesMod.namedTypes.DebuggerStatement]
  var Declaration: Type[typings.astTypes.namedTypesMod.namedTypes.Declaration]
  var DeclareClass: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareClass]
  var DeclareExportAllDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration]
  var DeclareExportDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration]
  var DeclareFunction: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareFunction]
  var DeclareInterface: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareInterface]
  var DeclareModule: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareModule]
  var DeclareModuleExports: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareModuleExports]
  var DeclareOpaqueType: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType]
  var DeclareTypeAlias: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias]
  var DeclareVariable: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareVariable]
  var DeclaredPredicate: Type[typings.astTypes.namedTypesMod.namedTypes.DeclaredPredicate]
  var Decorator: Type[typings.astTypes.namedTypesMod.namedTypes.Decorator]
  var Directive: Type[typings.astTypes.namedTypesMod.namedTypes.Directive]
  var DirectiveLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.DirectiveLiteral]
  var DoExpression: Type[typings.astTypes.namedTypesMod.namedTypes.DoExpression]
  var DoWhileStatement: Type[typings.astTypes.namedTypesMod.namedTypes.DoWhileStatement]
  var EmptyStatement: Type[typings.astTypes.namedTypesMod.namedTypes.EmptyStatement]
  var EmptyTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation]
  var ExistentialTypeParam: Type[typings.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam]
  var ExistsTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation]
  var ExportAllDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration]
  var ExportBatchSpecifier: Type[typings.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier]
  var ExportDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.ExportDeclaration]
  var ExportDefaultDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration]
  var ExportDefaultSpecifier: Type[typings.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier]
  var ExportNamedDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration]
  var ExportNamespaceSpecifier: Type[typings.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier]
  var ExportSpecifier: Type[typings.astTypes.namedTypesMod.namedTypes.ExportSpecifier]
  var Expression: Type[typings.astTypes.namedTypesMod.namedTypes.Expression]
  var ExpressionStatement: Type[typings.astTypes.namedTypesMod.namedTypes.ExpressionStatement]
  var File: Type[typings.astTypes.namedTypesMod.namedTypes.File]
  var Flow: Type[typings.astTypes.namedTypesMod.namedTypes.Flow]
  var FlowPredicate: Type[typings.astTypes.namedTypesMod.namedTypes.FlowPredicate]
  var FlowType: Type[typings.astTypes.namedTypesMod.namedTypes.FlowType]
  var ForAwaitStatement: Type[typings.astTypes.namedTypesMod.namedTypes.ForAwaitStatement]
  var ForInStatement: Type[typings.astTypes.namedTypesMod.namedTypes.ForInStatement]
  var ForOfStatement: Type[typings.astTypes.namedTypesMod.namedTypes.ForOfStatement]
  var ForStatement: Type[typings.astTypes.namedTypesMod.namedTypes.ForStatement]
  var Function: Type[typings.astTypes.namedTypesMod.namedTypes.Function]
  var FunctionDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.FunctionDeclaration]
  var FunctionExpression: Type[typings.astTypes.namedTypesMod.namedTypes.FunctionExpression]
  var FunctionTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation]
  var FunctionTypeParam: Type[typings.astTypes.namedTypesMod.namedTypes.FunctionTypeParam]
  var GeneratorExpression: Type[typings.astTypes.namedTypesMod.namedTypes.GeneratorExpression]
  var GenericTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation]
  var Identifier: Type[typings.astTypes.namedTypesMod.namedTypes.Identifier]
  var IfStatement: Type[typings.astTypes.namedTypesMod.namedTypes.IfStatement]
  var Import: Type[typings.astTypes.namedTypesMod.namedTypes.Import]
  var ImportDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.ImportDeclaration]
  var ImportDefaultSpecifier: Type[typings.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier]
  var ImportNamespaceSpecifier: Type[typings.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier]
  var ImportSpecifier: Type[typings.astTypes.namedTypesMod.namedTypes.ImportSpecifier]
  var InferredPredicate: Type[typings.astTypes.namedTypesMod.namedTypes.InferredPredicate]
  var InterfaceDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration]
  var InterfaceExtends: Type[typings.astTypes.namedTypesMod.namedTypes.InterfaceExtends]
  var InterfaceTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation]
  var InterpreterDirective: Type[typings.astTypes.namedTypesMod.namedTypes.InterpreterDirective]
  var IntersectionTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation]
  var JSXAttribute: Type[typings.astTypes.namedTypesMod.namedTypes.JSXAttribute]
  var JSXClosingElement: Type[typings.astTypes.namedTypesMod.namedTypes.JSXClosingElement]
  var JSXClosingFragment: Type[typings.astTypes.namedTypesMod.namedTypes.JSXClosingFragment]
  var JSXElement: Type[typings.astTypes.namedTypesMod.namedTypes.JSXElement]
  var JSXEmptyExpression: Type[typings.astTypes.namedTypesMod.namedTypes.JSXEmptyExpression]
  var JSXExpressionContainer: Type[typings.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer]
  var JSXFragment: Type[typings.astTypes.namedTypesMod.namedTypes.JSXFragment]
  var JSXIdentifier: Type[typings.astTypes.namedTypesMod.namedTypes.JSXIdentifier]
  var JSXMemberExpression: Type[typings.astTypes.namedTypesMod.namedTypes.JSXMemberExpression]
  var JSXNamespacedName: Type[typings.astTypes.namedTypesMod.namedTypes.JSXNamespacedName]
  var JSXOpeningElement: Type[typings.astTypes.namedTypesMod.namedTypes.JSXOpeningElement]
  var JSXOpeningFragment: Type[typings.astTypes.namedTypesMod.namedTypes.JSXOpeningFragment]
  var JSXSpreadAttribute: Type[typings.astTypes.namedTypesMod.namedTypes.JSXSpreadAttribute]
  var JSXSpreadChild: Type[typings.astTypes.namedTypesMod.namedTypes.JSXSpreadChild]
  var JSXText: Type[typings.astTypes.namedTypesMod.namedTypes.JSXText]
  var LabeledStatement: Type[typings.astTypes.namedTypesMod.namedTypes.LabeledStatement]
  var Line: Type[typings.astTypes.namedTypesMod.namedTypes.Line]
  var Literal: Type[typings.astTypes.namedTypesMod.namedTypes.Literal]
  var LogicalExpression: Type[typings.astTypes.namedTypesMod.namedTypes.LogicalExpression]
  var MemberExpression: Type[typings.astTypes.namedTypesMod.namedTypes.MemberExpression]
  var MemberTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation]
  var MetaProperty: Type[typings.astTypes.namedTypesMod.namedTypes.MetaProperty]
  var MethodDefinition: Type[typings.astTypes.namedTypesMod.namedTypes.MethodDefinition]
  var MixedTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation]
  var ModuleSpecifier: Type[typings.astTypes.namedTypesMod.namedTypes.ModuleSpecifier]
  var NewExpression: Type[typings.astTypes.namedTypesMod.namedTypes.NewExpression]
  var Node: Type[typings.astTypes.namedTypesMod.namedTypes.Node]
  var Noop: Type[typings.astTypes.namedTypesMod.namedTypes.Noop]
  var NullLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.NullLiteral]
  var NullLiteralTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation]
  var NullTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation]
  var NullableTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation]
  var NumberLiteralTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation]
  var NumberTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation]
  var NumericLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.NumericLiteral]
  var NumericLiteralTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation]
  var ObjectExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectExpression]
  var ObjectMethod: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectMethod]
  var ObjectPattern: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectPattern]
  var ObjectProperty: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectProperty]
  var ObjectTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation]
  var ObjectTypeCallProperty: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectTypeCallProperty]
  var ObjectTypeIndexer: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectTypeIndexer]
  var ObjectTypeInternalSlot: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectTypeInternalSlot]
  var ObjectTypeProperty: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectTypeProperty]
  var ObjectTypeSpreadProperty: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectTypeSpreadProperty]
  var OpaqueType: Type[typings.astTypes.namedTypesMod.namedTypes.OpaqueType]
  var OptionalCallExpression: Type[typings.astTypes.namedTypesMod.namedTypes.OptionalCallExpression]
  var OptionalMemberExpression: Type[typings.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression]
  var ParenthesizedExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression]
  var Pattern: Type[typings.astTypes.namedTypesMod.namedTypes.Pattern]
  var Position: Type[typings.astTypes.namedTypesMod.namedTypes.Position]
  var Printable: Type[typings.astTypes.namedTypesMod.namedTypes.Printable]
  var PrivateName: Type[typings.astTypes.namedTypesMod.namedTypes.PrivateName]
  var Program: Type[typings.astTypes.namedTypesMod.namedTypes.Program]
  var Property: Type[typings.astTypes.namedTypesMod.namedTypes.Property]
  var PropertyPattern: Type[typings.astTypes.namedTypesMod.namedTypes.PropertyPattern]
  var QualifiedTypeIdentifier: Type[typings.astTypes.namedTypesMod.namedTypes.QualifiedTypeIdentifier]
  var RegExpLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.RegExpLiteral]
  var RestElement: Type[typings.astTypes.namedTypesMod.namedTypes.RestElement]
  var RestProperty: Type[typings.astTypes.namedTypesMod.namedTypes.RestProperty]
  var ReturnStatement: Type[typings.astTypes.namedTypesMod.namedTypes.ReturnStatement]
  var SequenceExpression: Type[typings.astTypes.namedTypesMod.namedTypes.SequenceExpression]
  var SourceLocation: Type[typings.astTypes.namedTypesMod.namedTypes.SourceLocation]
  var Specifier: Type[typings.astTypes.namedTypesMod.namedTypes.Specifier]
  var SpreadElement: Type[typings.astTypes.namedTypesMod.namedTypes.SpreadElement]
  var SpreadElementPattern: Type[typings.astTypes.namedTypesMod.namedTypes.SpreadElementPattern]
  var SpreadProperty: Type[typings.astTypes.namedTypesMod.namedTypes.SpreadProperty]
  var SpreadPropertyPattern: Type[typings.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern]
  var Statement: Type[typings.astTypes.namedTypesMod.namedTypes.Statement]
  var StringLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.StringLiteral]
  var StringLiteralTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation]
  var StringTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation]
  var Super: Type[typings.astTypes.namedTypesMod.namedTypes.Super]
  var SwitchCase: Type[typings.astTypes.namedTypesMod.namedTypes.SwitchCase]
  var SwitchStatement: Type[typings.astTypes.namedTypesMod.namedTypes.SwitchStatement]
  var TSAnyKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSAnyKeyword]
  var TSArrayType: Type[typings.astTypes.namedTypesMod.namedTypes.TSArrayType]
  var TSAsExpression: Type[typings.astTypes.namedTypesMod.namedTypes.TSAsExpression]
  var TSBigIntKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSBigIntKeyword]
  var TSBooleanKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSBooleanKeyword]
  var TSCallSignatureDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration]
  var TSConditionalType: Type[typings.astTypes.namedTypesMod.namedTypes.TSConditionalType]
  var TSConstructSignatureDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration]
  var TSConstructorType: Type[typings.astTypes.namedTypesMod.namedTypes.TSConstructorType]
  var TSDeclareFunction: Type[typings.astTypes.namedTypesMod.namedTypes.TSDeclareFunction]
  var TSDeclareMethod: Type[typings.astTypes.namedTypesMod.namedTypes.TSDeclareMethod]
  var TSEnumDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration]
  var TSEnumMember: Type[typings.astTypes.namedTypesMod.namedTypes.TSEnumMember]
  var TSExportAssignment: Type[typings.astTypes.namedTypesMod.namedTypes.TSExportAssignment]
  var TSExpressionWithTypeArguments: Type[typings.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments]
  var TSExternalModuleReference: Type[typings.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference]
  var TSFunctionType: Type[typings.astTypes.namedTypesMod.namedTypes.TSFunctionType]
  var TSHasOptionalTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeAnnotation]
  var TSHasOptionalTypeParameterInstantiation: Type[
    typings.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeParameterInstantiation
  ]
  var TSHasOptionalTypeParameters: Type[typings.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeParameters]
  var TSImportEqualsDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration]
  var TSImportType: Type[typings.astTypes.namedTypesMod.namedTypes.TSImportType]
  var TSIndexSignature: Type[typings.astTypes.namedTypesMod.namedTypes.TSIndexSignature]
  var TSIndexedAccessType: Type[typings.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType]
  var TSInferType: Type[typings.astTypes.namedTypesMod.namedTypes.TSInferType]
  var TSInterfaceBody: Type[typings.astTypes.namedTypesMod.namedTypes.TSInterfaceBody]
  var TSInterfaceDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration]
  var TSIntersectionType: Type[typings.astTypes.namedTypesMod.namedTypes.TSIntersectionType]
  var TSLiteralType: Type[typings.astTypes.namedTypesMod.namedTypes.TSLiteralType]
  var TSMappedType: Type[typings.astTypes.namedTypesMod.namedTypes.TSMappedType]
  var TSMethodSignature: Type[typings.astTypes.namedTypesMod.namedTypes.TSMethodSignature]
  var TSModuleBlock: Type[typings.astTypes.namedTypesMod.namedTypes.TSModuleBlock]
  var TSModuleDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration]
  var TSNamespaceExportDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration]
  var TSNeverKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSNeverKeyword]
  var TSNonNullExpression: Type[typings.astTypes.namedTypesMod.namedTypes.TSNonNullExpression]
  var TSNullKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSNullKeyword]
  var TSNumberKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSNumberKeyword]
  var TSObjectKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSObjectKeyword]
  var TSOptionalType: Type[typings.astTypes.namedTypesMod.namedTypes.TSOptionalType]
  var TSParameterProperty: Type[typings.astTypes.namedTypesMod.namedTypes.TSParameterProperty]
  var TSParenthesizedType: Type[typings.astTypes.namedTypesMod.namedTypes.TSParenthesizedType]
  var TSPropertySignature: Type[typings.astTypes.namedTypesMod.namedTypes.TSPropertySignature]
  var TSQualifiedName: Type[typings.astTypes.namedTypesMod.namedTypes.TSQualifiedName]
  var TSRestType: Type[typings.astTypes.namedTypesMod.namedTypes.TSRestType]
  var TSStringKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSStringKeyword]
  var TSSymbolKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSSymbolKeyword]
  var TSThisType: Type[typings.astTypes.namedTypesMod.namedTypes.TSThisType]
  var TSTupleType: Type[typings.astTypes.namedTypesMod.namedTypes.TSTupleType]
  var TSType: Type[typings.astTypes.namedTypesMod.namedTypes.TSType]
  var TSTypeAliasDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration]
  var TSTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation]
  var TSTypeAssertion: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeAssertion]
  var TSTypeLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeLiteral]
  var TSTypeOperator: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeOperator]
  var TSTypeParameter: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeParameter]
  var TSTypeParameterDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration]
  var TSTypeParameterInstantiation: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeParameterInstantiation]
  var TSTypePredicate: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypePredicate]
  var TSTypeQuery: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeQuery]
  var TSTypeReference: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeReference]
  var TSUndefinedKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSUndefinedKeyword]
  var TSUnionType: Type[typings.astTypes.namedTypesMod.namedTypes.TSUnionType]
  var TSUnknownKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSUnknownKeyword]
  var TSVoidKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSVoidKeyword]
  var TaggedTemplateExpression: Type[typings.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression]
  var TemplateElement: Type[typings.astTypes.namedTypesMod.namedTypes.TemplateElement]
  var TemplateLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.TemplateLiteral]
  var ThisExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ThisExpression]
  var ThisTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation]
  var ThrowStatement: Type[typings.astTypes.namedTypesMod.namedTypes.ThrowStatement]
  var TryStatement: Type[typings.astTypes.namedTypesMod.namedTypes.TryStatement]
  var TupleTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation]
  var TypeAlias: Type[typings.astTypes.namedTypesMod.namedTypes.TypeAlias]
  var TypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.TypeAnnotation]
  var TypeCastExpression: Type[typings.astTypes.namedTypesMod.namedTypes.TypeCastExpression]
  var TypeParameter: Type[typings.astTypes.namedTypesMod.namedTypes.TypeParameter]
  var TypeParameterDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TypeParameterDeclaration]
  var TypeParameterInstantiation: Type[typings.astTypes.namedTypesMod.namedTypes.TypeParameterInstantiation]
  var TypeofTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation]
  var UnaryExpression: Type[typings.astTypes.namedTypesMod.namedTypes.UnaryExpression]
  var UnionTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation]
  var UpdateExpression: Type[typings.astTypes.namedTypesMod.namedTypes.UpdateExpression]
  var VariableDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.VariableDeclaration]
  var VariableDeclarator: Type[typings.astTypes.namedTypesMod.namedTypes.VariableDeclarator]
  var Variance: Type[typings.astTypes.namedTypesMod.namedTypes.Variance]
  var VoidTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation]
  var WhileStatement: Type[typings.astTypes.namedTypesMod.namedTypes.WhileStatement]
  var WithStatement: Type[typings.astTypes.namedTypesMod.namedTypes.WithStatement]
  var YieldExpression: Type[typings.astTypes.namedTypesMod.namedTypes.YieldExpression]
}

object NamedTypes_ {
  @scala.inline
  def apply(
    AnyTypeAnnotation: Type[AnyTypeAnnotation],
    ArrayExpression: Type[ArrayExpression],
    ArrayPattern: Type[ArrayPattern],
    ArrayTypeAnnotation: Type[ArrayTypeAnnotation],
    ArrowFunctionExpression: Type[ArrowFunctionExpression],
    AssignmentExpression: Type[AssignmentExpression],
    AssignmentPattern: Type[AssignmentPattern],
    AwaitExpression: Type[AwaitExpression],
    BigIntLiteral: Type[BigIntLiteral],
    BinaryExpression: Type[BinaryExpression],
    BindExpression: Type[BindExpression],
    Block: Type[Block],
    BlockStatement: Type[BlockStatement],
    BooleanLiteral: Type[BooleanLiteral],
    BooleanLiteralTypeAnnotation: Type[BooleanLiteralTypeAnnotation],
    BooleanTypeAnnotation: Type[BooleanTypeAnnotation],
    BreakStatement: Type[BreakStatement],
    CallExpression: Type[CallExpression],
    CatchClause: Type[CatchClause],
    ClassBody: Type[ClassBody],
    ClassDeclaration: Type[ClassDeclaration],
    ClassExpression: Type[ClassExpression],
    ClassImplements: Type[ClassImplements],
    ClassMethod: Type[ClassMethod],
    ClassPrivateMethod: Type[ClassPrivateMethod],
    ClassPrivateProperty: Type[ClassPrivateProperty],
    ClassProperty: Type[ClassProperty],
    ClassPropertyDefinition: Type[ClassPropertyDefinition],
    Comment: Type[Comment],
    CommentBlock: Type[CommentBlock],
    CommentLine: Type[CommentLine],
    ComprehensionBlock: Type[ComprehensionBlock],
    ComprehensionExpression: Type[ComprehensionExpression],
    ConditionalExpression: Type[ConditionalExpression],
    ContinueStatement: Type[ContinueStatement],
    DebuggerStatement: Type[DebuggerStatement],
    Declaration: Type[Declaration],
    DeclareClass: Type[DeclareClass],
    DeclareExportAllDeclaration: Type[DeclareExportAllDeclaration],
    DeclareExportDeclaration: Type[DeclareExportDeclaration],
    DeclareFunction: Type[DeclareFunction],
    DeclareInterface: Type[DeclareInterface],
    DeclareModule: Type[DeclareModule],
    DeclareModuleExports: Type[DeclareModuleExports],
    DeclareOpaqueType: Type[DeclareOpaqueType],
    DeclareTypeAlias: Type[DeclareTypeAlias],
    DeclareVariable: Type[DeclareVariable],
    DeclaredPredicate: Type[DeclaredPredicate],
    Decorator: Type[Decorator],
    Directive: Type[Directive],
    DirectiveLiteral: Type[DirectiveLiteral],
    DoExpression: Type[DoExpression],
    DoWhileStatement: Type[DoWhileStatement],
    EmptyStatement: Type[EmptyStatement],
    EmptyTypeAnnotation: Type[EmptyTypeAnnotation],
    ExistentialTypeParam: Type[ExistentialTypeParam],
    ExistsTypeAnnotation: Type[ExistsTypeAnnotation],
    ExportAllDeclaration: Type[ExportAllDeclaration],
    ExportBatchSpecifier: Type[ExportBatchSpecifier],
    ExportDeclaration: Type[ExportDeclaration],
    ExportDefaultDeclaration: Type[ExportDefaultDeclaration],
    ExportDefaultSpecifier: Type[ExportDefaultSpecifier],
    ExportNamedDeclaration: Type[ExportNamedDeclaration],
    ExportNamespaceSpecifier: Type[ExportNamespaceSpecifier],
    ExportSpecifier: Type[ExportSpecifier],
    Expression: Type[Expression],
    ExpressionStatement: Type[ExpressionStatement],
    File: Type[File],
    Flow: Type[Flow],
    FlowPredicate: Type[FlowPredicate],
    FlowType: Type[FlowType],
    ForAwaitStatement: Type[ForAwaitStatement],
    ForInStatement: Type[ForInStatement],
    ForOfStatement: Type[ForOfStatement],
    ForStatement: Type[ForStatement],
    Function: Type[Function],
    FunctionDeclaration: Type[FunctionDeclaration],
    FunctionExpression: Type[FunctionExpression],
    FunctionTypeAnnotation: Type[FunctionTypeAnnotation],
    FunctionTypeParam: Type[FunctionTypeParam],
    GeneratorExpression: Type[GeneratorExpression],
    GenericTypeAnnotation: Type[GenericTypeAnnotation],
    Identifier: Type[Identifier],
    IfStatement: Type[IfStatement],
    Import: Type[Import],
    ImportDeclaration: Type[ImportDeclaration],
    ImportDefaultSpecifier: Type[ImportDefaultSpecifier],
    ImportNamespaceSpecifier: Type[ImportNamespaceSpecifier],
    ImportSpecifier: Type[ImportSpecifier],
    InferredPredicate: Type[InferredPredicate],
    InterfaceDeclaration: Type[InterfaceDeclaration],
    InterfaceExtends: Type[InterfaceExtends],
    InterfaceTypeAnnotation: Type[InterfaceTypeAnnotation],
    InterpreterDirective: Type[InterpreterDirective],
    IntersectionTypeAnnotation: Type[IntersectionTypeAnnotation],
    JSXAttribute: Type[JSXAttribute],
    JSXClosingElement: Type[JSXClosingElement],
    JSXClosingFragment: Type[JSXClosingFragment],
    JSXElement: Type[JSXElement],
    JSXEmptyExpression: Type[JSXEmptyExpression],
    JSXExpressionContainer: Type[JSXExpressionContainer],
    JSXFragment: Type[JSXFragment],
    JSXIdentifier: Type[JSXIdentifier],
    JSXMemberExpression: Type[JSXMemberExpression],
    JSXNamespacedName: Type[JSXNamespacedName],
    JSXOpeningElement: Type[JSXOpeningElement],
    JSXOpeningFragment: Type[JSXOpeningFragment],
    JSXSpreadAttribute: Type[JSXSpreadAttribute],
    JSXSpreadChild: Type[JSXSpreadChild],
    JSXText: Type[JSXText],
    LabeledStatement: Type[LabeledStatement],
    Line: Type[Line],
    Literal: Type[Literal],
    LogicalExpression: Type[LogicalExpression],
    MemberExpression: Type[MemberExpression],
    MemberTypeAnnotation: Type[MemberTypeAnnotation],
    MetaProperty: Type[MetaProperty],
    MethodDefinition: Type[MethodDefinition],
    MixedTypeAnnotation: Type[MixedTypeAnnotation],
    ModuleSpecifier: Type[ModuleSpecifier],
    NewExpression: Type[NewExpression],
    Node: Type[Node],
    Noop: Type[Noop],
    NullLiteral: Type[NullLiteral],
    NullLiteralTypeAnnotation: Type[NullLiteralTypeAnnotation],
    NullTypeAnnotation: Type[NullTypeAnnotation],
    NullableTypeAnnotation: Type[NullableTypeAnnotation],
    NumberLiteralTypeAnnotation: Type[NumberLiteralTypeAnnotation],
    NumberTypeAnnotation: Type[NumberTypeAnnotation],
    NumericLiteral: Type[NumericLiteral],
    NumericLiteralTypeAnnotation: Type[NumericLiteralTypeAnnotation],
    ObjectExpression: Type[ObjectExpression],
    ObjectMethod: Type[ObjectMethod],
    ObjectPattern: Type[ObjectPattern],
    ObjectProperty: Type[ObjectProperty],
    ObjectTypeAnnotation: Type[ObjectTypeAnnotation],
    ObjectTypeCallProperty: Type[ObjectTypeCallProperty],
    ObjectTypeIndexer: Type[ObjectTypeIndexer],
    ObjectTypeInternalSlot: Type[ObjectTypeInternalSlot],
    ObjectTypeProperty: Type[ObjectTypeProperty],
    ObjectTypeSpreadProperty: Type[ObjectTypeSpreadProperty],
    OpaqueType: Type[OpaqueType],
    OptionalCallExpression: Type[OptionalCallExpression],
    OptionalMemberExpression: Type[OptionalMemberExpression],
    ParenthesizedExpression: Type[ParenthesizedExpression],
    Pattern: Type[Pattern],
    Position: Type[Position],
    Printable: Type[Printable],
    PrivateName: Type[PrivateName],
    Program: Type[Program],
    Property: Type[Property],
    PropertyPattern: Type[PropertyPattern],
    QualifiedTypeIdentifier: Type[QualifiedTypeIdentifier],
    RegExpLiteral: Type[RegExpLiteral],
    RestElement: Type[RestElement],
    RestProperty: Type[RestProperty],
    ReturnStatement: Type[ReturnStatement],
    SequenceExpression: Type[SequenceExpression],
    SourceLocation: Type[SourceLocation],
    Specifier: Type[Specifier],
    SpreadElement: Type[SpreadElement],
    SpreadElementPattern: Type[SpreadElementPattern],
    SpreadProperty: Type[SpreadProperty],
    SpreadPropertyPattern: Type[SpreadPropertyPattern],
    Statement: Type[Statement],
    StringLiteral: Type[StringLiteral],
    StringLiteralTypeAnnotation: Type[StringLiteralTypeAnnotation],
    StringTypeAnnotation: Type[StringTypeAnnotation],
    Super: Type[Super],
    SwitchCase: Type[SwitchCase],
    SwitchStatement: Type[SwitchStatement],
    TSAnyKeyword: Type[TSAnyKeyword],
    TSArrayType: Type[TSArrayType],
    TSAsExpression: Type[TSAsExpression],
    TSBigIntKeyword: Type[TSBigIntKeyword],
    TSBooleanKeyword: Type[TSBooleanKeyword],
    TSCallSignatureDeclaration: Type[TSCallSignatureDeclaration],
    TSConditionalType: Type[TSConditionalType],
    TSConstructSignatureDeclaration: Type[TSConstructSignatureDeclaration],
    TSConstructorType: Type[TSConstructorType],
    TSDeclareFunction: Type[TSDeclareFunction],
    TSDeclareMethod: Type[TSDeclareMethod],
    TSEnumDeclaration: Type[TSEnumDeclaration],
    TSEnumMember: Type[TSEnumMember],
    TSExportAssignment: Type[TSExportAssignment],
    TSExpressionWithTypeArguments: Type[TSExpressionWithTypeArguments],
    TSExternalModuleReference: Type[TSExternalModuleReference],
    TSFunctionType: Type[TSFunctionType],
    TSHasOptionalTypeAnnotation: Type[TSHasOptionalTypeAnnotation],
    TSHasOptionalTypeParameterInstantiation: Type[TSHasOptionalTypeParameterInstantiation],
    TSHasOptionalTypeParameters: Type[TSHasOptionalTypeParameters],
    TSImportEqualsDeclaration: Type[TSImportEqualsDeclaration],
    TSImportType: Type[TSImportType],
    TSIndexSignature: Type[TSIndexSignature],
    TSIndexedAccessType: Type[TSIndexedAccessType],
    TSInferType: Type[TSInferType],
    TSInterfaceBody: Type[TSInterfaceBody],
    TSInterfaceDeclaration: Type[TSInterfaceDeclaration],
    TSIntersectionType: Type[TSIntersectionType],
    TSLiteralType: Type[TSLiteralType],
    TSMappedType: Type[TSMappedType],
    TSMethodSignature: Type[TSMethodSignature],
    TSModuleBlock: Type[TSModuleBlock],
    TSModuleDeclaration: Type[TSModuleDeclaration],
    TSNamespaceExportDeclaration: Type[TSNamespaceExportDeclaration],
    TSNeverKeyword: Type[TSNeverKeyword],
    TSNonNullExpression: Type[TSNonNullExpression],
    TSNullKeyword: Type[TSNullKeyword],
    TSNumberKeyword: Type[TSNumberKeyword],
    TSObjectKeyword: Type[TSObjectKeyword],
    TSOptionalType: Type[TSOptionalType],
    TSParameterProperty: Type[TSParameterProperty],
    TSParenthesizedType: Type[TSParenthesizedType],
    TSPropertySignature: Type[TSPropertySignature],
    TSQualifiedName: Type[TSQualifiedName],
    TSRestType: Type[TSRestType],
    TSStringKeyword: Type[TSStringKeyword],
    TSSymbolKeyword: Type[TSSymbolKeyword],
    TSThisType: Type[TSThisType],
    TSTupleType: Type[TSTupleType],
    TSType: Type[TSType],
    TSTypeAliasDeclaration: Type[TSTypeAliasDeclaration],
    TSTypeAnnotation: Type[TSTypeAnnotation],
    TSTypeAssertion: Type[TSTypeAssertion],
    TSTypeLiteral: Type[TSTypeLiteral],
    TSTypeOperator: Type[TSTypeOperator],
    TSTypeParameter: Type[TSTypeParameter],
    TSTypeParameterDeclaration: Type[TSTypeParameterDeclaration],
    TSTypeParameterInstantiation: Type[TSTypeParameterInstantiation],
    TSTypePredicate: Type[TSTypePredicate],
    TSTypeQuery: Type[TSTypeQuery],
    TSTypeReference: Type[TSTypeReference],
    TSUndefinedKeyword: Type[TSUndefinedKeyword],
    TSUnionType: Type[TSUnionType],
    TSUnknownKeyword: Type[TSUnknownKeyword],
    TSVoidKeyword: Type[TSVoidKeyword],
    TaggedTemplateExpression: Type[TaggedTemplateExpression],
    TemplateElement: Type[TemplateElement],
    TemplateLiteral: Type[TemplateLiteral],
    ThisExpression: Type[ThisExpression],
    ThisTypeAnnotation: Type[ThisTypeAnnotation],
    ThrowStatement: Type[ThrowStatement],
    TryStatement: Type[TryStatement],
    TupleTypeAnnotation: Type[TupleTypeAnnotation],
    TypeAlias: Type[TypeAlias],
    TypeAnnotation: Type[TypeAnnotation],
    TypeCastExpression: Type[TypeCastExpression],
    TypeParameter: Type[TypeParameter],
    TypeParameterDeclaration: Type[TypeParameterDeclaration],
    TypeParameterInstantiation: Type[TypeParameterInstantiation],
    TypeofTypeAnnotation: Type[TypeofTypeAnnotation],
    UnaryExpression: Type[UnaryExpression],
    UnionTypeAnnotation: Type[UnionTypeAnnotation],
    UpdateExpression: Type[UpdateExpression]
  ): NamedTypes_ = {
    val __obj = js.Dynamic.literal(AnyTypeAnnotation = AnyTypeAnnotation.asInstanceOf[js.Any], ArrayExpression = ArrayExpression.asInstanceOf[js.Any], ArrayPattern = ArrayPattern.asInstanceOf[js.Any], ArrayTypeAnnotation = ArrayTypeAnnotation.asInstanceOf[js.Any], ArrowFunctionExpression = ArrowFunctionExpression.asInstanceOf[js.Any], AssignmentExpression = AssignmentExpression.asInstanceOf[js.Any], AssignmentPattern = AssignmentPattern.asInstanceOf[js.Any], AwaitExpression = AwaitExpression.asInstanceOf[js.Any], BigIntLiteral = BigIntLiteral.asInstanceOf[js.Any], BinaryExpression = BinaryExpression.asInstanceOf[js.Any], BindExpression = BindExpression.asInstanceOf[js.Any], Block = Block.asInstanceOf[js.Any], BlockStatement = BlockStatement.asInstanceOf[js.Any], BooleanLiteral = BooleanLiteral.asInstanceOf[js.Any], BooleanLiteralTypeAnnotation = BooleanLiteralTypeAnnotation.asInstanceOf[js.Any], BooleanTypeAnnotation = BooleanTypeAnnotation.asInstanceOf[js.Any], BreakStatement = BreakStatement.asInstanceOf[js.Any], CallExpression = CallExpression.asInstanceOf[js.Any], CatchClause = CatchClause.asInstanceOf[js.Any], ClassBody = ClassBody.asInstanceOf[js.Any], ClassDeclaration = ClassDeclaration.asInstanceOf[js.Any], ClassExpression = ClassExpression.asInstanceOf[js.Any], ClassImplements = ClassImplements.asInstanceOf[js.Any], ClassMethod = ClassMethod.asInstanceOf[js.Any], ClassPrivateMethod = ClassPrivateMethod.asInstanceOf[js.Any], ClassPrivateProperty = ClassPrivateProperty.asInstanceOf[js.Any], ClassProperty = ClassProperty.asInstanceOf[js.Any], ClassPropertyDefinition = ClassPropertyDefinition.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], CommentBlock = CommentBlock.asInstanceOf[js.Any], CommentLine = CommentLine.asInstanceOf[js.Any], ComprehensionBlock = ComprehensionBlock.asInstanceOf[js.Any], ComprehensionExpression = ComprehensionExpression.asInstanceOf[js.Any], ConditionalExpression = ConditionalExpression.asInstanceOf[js.Any], ContinueStatement = ContinueStatement.asInstanceOf[js.Any], DebuggerStatement = DebuggerStatement.asInstanceOf[js.Any], Declaration = Declaration.asInstanceOf[js.Any], DeclareClass = DeclareClass.asInstanceOf[js.Any], DeclareExportAllDeclaration = DeclareExportAllDeclaration.asInstanceOf[js.Any], DeclareExportDeclaration = DeclareExportDeclaration.asInstanceOf[js.Any], DeclareFunction = DeclareFunction.asInstanceOf[js.Any], DeclareInterface = DeclareInterface.asInstanceOf[js.Any], DeclareModule = DeclareModule.asInstanceOf[js.Any], DeclareModuleExports = DeclareModuleExports.asInstanceOf[js.Any], DeclareOpaqueType = DeclareOpaqueType.asInstanceOf[js.Any], DeclareTypeAlias = DeclareTypeAlias.asInstanceOf[js.Any], DeclareVariable = DeclareVariable.asInstanceOf[js.Any], DeclaredPredicate = DeclaredPredicate.asInstanceOf[js.Any], Decorator = Decorator.asInstanceOf[js.Any], Directive = Directive.asInstanceOf[js.Any], DirectiveLiteral = DirectiveLiteral.asInstanceOf[js.Any], DoExpression = DoExpression.asInstanceOf[js.Any], DoWhileStatement = DoWhileStatement.asInstanceOf[js.Any], EmptyStatement = EmptyStatement.asInstanceOf[js.Any], EmptyTypeAnnotation = EmptyTypeAnnotation.asInstanceOf[js.Any], ExistentialTypeParam = ExistentialTypeParam.asInstanceOf[js.Any], ExistsTypeAnnotation = ExistsTypeAnnotation.asInstanceOf[js.Any], ExportAllDeclaration = ExportAllDeclaration.asInstanceOf[js.Any], ExportBatchSpecifier = ExportBatchSpecifier.asInstanceOf[js.Any], ExportDeclaration = ExportDeclaration.asInstanceOf[js.Any], ExportDefaultDeclaration = ExportDefaultDeclaration.asInstanceOf[js.Any], ExportDefaultSpecifier = ExportDefaultSpecifier.asInstanceOf[js.Any], ExportNamedDeclaration = ExportNamedDeclaration.asInstanceOf[js.Any], ExportNamespaceSpecifier = ExportNamespaceSpecifier.asInstanceOf[js.Any], ExportSpecifier = ExportSpecifier.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any], ExpressionStatement = ExpressionStatement.asInstanceOf[js.Any], File = File.asInstanceOf[js.Any], Flow = Flow.asInstanceOf[js.Any], FlowPredicate = FlowPredicate.asInstanceOf[js.Any], FlowType = FlowType.asInstanceOf[js.Any], ForAwaitStatement = ForAwaitStatement.asInstanceOf[js.Any], ForInStatement = ForInStatement.asInstanceOf[js.Any], ForOfStatement = ForOfStatement.asInstanceOf[js.Any], ForStatement = ForStatement.asInstanceOf[js.Any], Function = Function.asInstanceOf[js.Any], FunctionDeclaration = FunctionDeclaration.asInstanceOf[js.Any], FunctionExpression = FunctionExpression.asInstanceOf[js.Any], FunctionTypeAnnotation = FunctionTypeAnnotation.asInstanceOf[js.Any], FunctionTypeParam = FunctionTypeParam.asInstanceOf[js.Any], GeneratorExpression = GeneratorExpression.asInstanceOf[js.Any], GenericTypeAnnotation = GenericTypeAnnotation.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], IfStatement = IfStatement.asInstanceOf[js.Any], Import = Import.asInstanceOf[js.Any], ImportDeclaration = ImportDeclaration.asInstanceOf[js.Any], ImportDefaultSpecifier = ImportDefaultSpecifier.asInstanceOf[js.Any], ImportNamespaceSpecifier = ImportNamespaceSpecifier.asInstanceOf[js.Any], ImportSpecifier = ImportSpecifier.asInstanceOf[js.Any], InferredPredicate = InferredPredicate.asInstanceOf[js.Any], InterfaceDeclaration = InterfaceDeclaration.asInstanceOf[js.Any], InterfaceExtends = InterfaceExtends.asInstanceOf[js.Any], InterfaceTypeAnnotation = InterfaceTypeAnnotation.asInstanceOf[js.Any], InterpreterDirective = InterpreterDirective.asInstanceOf[js.Any], IntersectionTypeAnnotation = IntersectionTypeAnnotation.asInstanceOf[js.Any], JSXAttribute = JSXAttribute.asInstanceOf[js.Any], JSXClosingElement = JSXClosingElement.asInstanceOf[js.Any], JSXClosingFragment = JSXClosingFragment.asInstanceOf[js.Any], JSXElement = JSXElement.asInstanceOf[js.Any], JSXEmptyExpression = JSXEmptyExpression.asInstanceOf[js.Any], JSXExpressionContainer = JSXExpressionContainer.asInstanceOf[js.Any], JSXFragment = JSXFragment.asInstanceOf[js.Any], JSXIdentifier = JSXIdentifier.asInstanceOf[js.Any], JSXMemberExpression = JSXMemberExpression.asInstanceOf[js.Any], JSXNamespacedName = JSXNamespacedName.asInstanceOf[js.Any], JSXOpeningElement = JSXOpeningElement.asInstanceOf[js.Any], JSXOpeningFragment = JSXOpeningFragment.asInstanceOf[js.Any], JSXSpreadAttribute = JSXSpreadAttribute.asInstanceOf[js.Any], JSXSpreadChild = JSXSpreadChild.asInstanceOf[js.Any], JSXText = JSXText.asInstanceOf[js.Any], LabeledStatement = LabeledStatement.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Literal = Literal.asInstanceOf[js.Any], LogicalExpression = LogicalExpression.asInstanceOf[js.Any], MemberExpression = MemberExpression.asInstanceOf[js.Any], MemberTypeAnnotation = MemberTypeAnnotation.asInstanceOf[js.Any], MetaProperty = MetaProperty.asInstanceOf[js.Any], MethodDefinition = MethodDefinition.asInstanceOf[js.Any], MixedTypeAnnotation = MixedTypeAnnotation.asInstanceOf[js.Any], ModuleSpecifier = ModuleSpecifier.asInstanceOf[js.Any], NewExpression = NewExpression.asInstanceOf[js.Any], Node = Node.asInstanceOf[js.Any], Noop = Noop.asInstanceOf[js.Any], NullLiteral = NullLiteral.asInstanceOf[js.Any], NullLiteralTypeAnnotation = NullLiteralTypeAnnotation.asInstanceOf[js.Any], NullTypeAnnotation = NullTypeAnnotation.asInstanceOf[js.Any], NullableTypeAnnotation = NullableTypeAnnotation.asInstanceOf[js.Any], NumberLiteralTypeAnnotation = NumberLiteralTypeAnnotation.asInstanceOf[js.Any], NumberTypeAnnotation = NumberTypeAnnotation.asInstanceOf[js.Any], NumericLiteral = NumericLiteral.asInstanceOf[js.Any], NumericLiteralTypeAnnotation = NumericLiteralTypeAnnotation.asInstanceOf[js.Any], ObjectExpression = ObjectExpression.asInstanceOf[js.Any], ObjectMethod = ObjectMethod.asInstanceOf[js.Any], ObjectPattern = ObjectPattern.asInstanceOf[js.Any], ObjectProperty = ObjectProperty.asInstanceOf[js.Any], ObjectTypeAnnotation = ObjectTypeAnnotation.asInstanceOf[js.Any], ObjectTypeCallProperty = ObjectTypeCallProperty.asInstanceOf[js.Any], ObjectTypeIndexer = ObjectTypeIndexer.asInstanceOf[js.Any], ObjectTypeInternalSlot = ObjectTypeInternalSlot.asInstanceOf[js.Any], ObjectTypeProperty = ObjectTypeProperty.asInstanceOf[js.Any], ObjectTypeSpreadProperty = ObjectTypeSpreadProperty.asInstanceOf[js.Any], OpaqueType = OpaqueType.asInstanceOf[js.Any], OptionalCallExpression = OptionalCallExpression.asInstanceOf[js.Any], OptionalMemberExpression = OptionalMemberExpression.asInstanceOf[js.Any], ParenthesizedExpression = ParenthesizedExpression.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Printable = Printable.asInstanceOf[js.Any], PrivateName = PrivateName.asInstanceOf[js.Any], Program = Program.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any], PropertyPattern = PropertyPattern.asInstanceOf[js.Any], QualifiedTypeIdentifier = QualifiedTypeIdentifier.asInstanceOf[js.Any], RegExpLiteral = RegExpLiteral.asInstanceOf[js.Any], RestElement = RestElement.asInstanceOf[js.Any], RestProperty = RestProperty.asInstanceOf[js.Any], ReturnStatement = ReturnStatement.asInstanceOf[js.Any], SequenceExpression = SequenceExpression.asInstanceOf[js.Any], SourceLocation = SourceLocation.asInstanceOf[js.Any], Specifier = Specifier.asInstanceOf[js.Any], SpreadElement = SpreadElement.asInstanceOf[js.Any], SpreadElementPattern = SpreadElementPattern.asInstanceOf[js.Any], SpreadProperty = SpreadProperty.asInstanceOf[js.Any], SpreadPropertyPattern = SpreadPropertyPattern.asInstanceOf[js.Any], Statement = Statement.asInstanceOf[js.Any], StringLiteral = StringLiteral.asInstanceOf[js.Any], StringLiteralTypeAnnotation = StringLiteralTypeAnnotation.asInstanceOf[js.Any], StringTypeAnnotation = StringTypeAnnotation.asInstanceOf[js.Any], Super = Super.asInstanceOf[js.Any], SwitchCase = SwitchCase.asInstanceOf[js.Any], SwitchStatement = SwitchStatement.asInstanceOf[js.Any], TSAnyKeyword = TSAnyKeyword.asInstanceOf[js.Any], TSArrayType = TSArrayType.asInstanceOf[js.Any], TSAsExpression = TSAsExpression.asInstanceOf[js.Any], TSBigIntKeyword = TSBigIntKeyword.asInstanceOf[js.Any], TSBooleanKeyword = TSBooleanKeyword.asInstanceOf[js.Any], TSCallSignatureDeclaration = TSCallSignatureDeclaration.asInstanceOf[js.Any], TSConditionalType = TSConditionalType.asInstanceOf[js.Any], TSConstructSignatureDeclaration = TSConstructSignatureDeclaration.asInstanceOf[js.Any], TSConstructorType = TSConstructorType.asInstanceOf[js.Any], TSDeclareFunction = TSDeclareFunction.asInstanceOf[js.Any], TSDeclareMethod = TSDeclareMethod.asInstanceOf[js.Any], TSEnumDeclaration = TSEnumDeclaration.asInstanceOf[js.Any], TSEnumMember = TSEnumMember.asInstanceOf[js.Any], TSExportAssignment = TSExportAssignment.asInstanceOf[js.Any], TSExpressionWithTypeArguments = TSExpressionWithTypeArguments.asInstanceOf[js.Any], TSExternalModuleReference = TSExternalModuleReference.asInstanceOf[js.Any], TSFunctionType = TSFunctionType.asInstanceOf[js.Any], TSHasOptionalTypeAnnotation = TSHasOptionalTypeAnnotation.asInstanceOf[js.Any], TSHasOptionalTypeParameterInstantiation = TSHasOptionalTypeParameterInstantiation.asInstanceOf[js.Any], TSHasOptionalTypeParameters = TSHasOptionalTypeParameters.asInstanceOf[js.Any], TSImportEqualsDeclaration = TSImportEqualsDeclaration.asInstanceOf[js.Any], TSImportType = TSImportType.asInstanceOf[js.Any], TSIndexSignature = TSIndexSignature.asInstanceOf[js.Any], TSIndexedAccessType = TSIndexedAccessType.asInstanceOf[js.Any], TSInferType = TSInferType.asInstanceOf[js.Any], TSInterfaceBody = TSInterfaceBody.asInstanceOf[js.Any], TSInterfaceDeclaration = TSInterfaceDeclaration.asInstanceOf[js.Any], TSIntersectionType = TSIntersectionType.asInstanceOf[js.Any], TSLiteralType = TSLiteralType.asInstanceOf[js.Any], TSMappedType = TSMappedType.asInstanceOf[js.Any], TSMethodSignature = TSMethodSignature.asInstanceOf[js.Any], TSModuleBlock = TSModuleBlock.asInstanceOf[js.Any], TSModuleDeclaration = TSModuleDeclaration.asInstanceOf[js.Any], TSNamespaceExportDeclaration = TSNamespaceExportDeclaration.asInstanceOf[js.Any], TSNeverKeyword = TSNeverKeyword.asInstanceOf[js.Any], TSNonNullExpression = TSNonNullExpression.asInstanceOf[js.Any], TSNullKeyword = TSNullKeyword.asInstanceOf[js.Any], TSNumberKeyword = TSNumberKeyword.asInstanceOf[js.Any], TSObjectKeyword = TSObjectKeyword.asInstanceOf[js.Any], TSOptionalType = TSOptionalType.asInstanceOf[js.Any], TSParameterProperty = TSParameterProperty.asInstanceOf[js.Any], TSParenthesizedType = TSParenthesizedType.asInstanceOf[js.Any], TSPropertySignature = TSPropertySignature.asInstanceOf[js.Any], TSQualifiedName = TSQualifiedName.asInstanceOf[js.Any], TSRestType = TSRestType.asInstanceOf[js.Any], TSStringKeyword = TSStringKeyword.asInstanceOf[js.Any], TSSymbolKeyword = TSSymbolKeyword.asInstanceOf[js.Any], TSThisType = TSThisType.asInstanceOf[js.Any], TSTupleType = TSTupleType.asInstanceOf[js.Any], TSType = TSType.asInstanceOf[js.Any], TSTypeAliasDeclaration = TSTypeAliasDeclaration.asInstanceOf[js.Any], TSTypeAnnotation = TSTypeAnnotation.asInstanceOf[js.Any], TSTypeAssertion = TSTypeAssertion.asInstanceOf[js.Any], TSTypeLiteral = TSTypeLiteral.asInstanceOf[js.Any], TSTypeOperator = TSTypeOperator.asInstanceOf[js.Any], TSTypeParameter = TSTypeParameter.asInstanceOf[js.Any], TSTypeParameterDeclaration = TSTypeParameterDeclaration.asInstanceOf[js.Any], TSTypeParameterInstantiation = TSTypeParameterInstantiation.asInstanceOf[js.Any], TSTypePredicate = TSTypePredicate.asInstanceOf[js.Any], TSTypeQuery = TSTypeQuery.asInstanceOf[js.Any], TSTypeReference = TSTypeReference.asInstanceOf[js.Any], TSUndefinedKeyword = TSUndefinedKeyword.asInstanceOf[js.Any], TSUnionType = TSUnionType.asInstanceOf[js.Any], TSUnknownKeyword = TSUnknownKeyword.asInstanceOf[js.Any], TSVoidKeyword = TSVoidKeyword.asInstanceOf[js.Any], TaggedTemplateExpression = TaggedTemplateExpression.asInstanceOf[js.Any], TemplateElement = TemplateElement.asInstanceOf[js.Any], TemplateLiteral = TemplateLiteral.asInstanceOf[js.Any], ThisExpression = ThisExpression.asInstanceOf[js.Any], ThisTypeAnnotation = ThisTypeAnnotation.asInstanceOf[js.Any], ThrowStatement = ThrowStatement.asInstanceOf[js.Any], TryStatement = TryStatement.asInstanceOf[js.Any], TupleTypeAnnotation = TupleTypeAnnotation.asInstanceOf[js.Any], TypeAlias = TypeAlias.asInstanceOf[js.Any], TypeAnnotation = TypeAnnotation.asInstanceOf[js.Any], TypeCastExpression = TypeCastExpression.asInstanceOf[js.Any], TypeParameter = TypeParameter.asInstanceOf[js.Any], TypeParameterDeclaration = TypeParameterDeclaration.asInstanceOf[js.Any], TypeParameterInstantiation = TypeParameterInstantiation.asInstanceOf[js.Any], TypeofTypeAnnotation = TypeofTypeAnnotation.asInstanceOf[js.Any], UnaryExpression = UnaryExpression.asInstanceOf[js.Any], UnionTypeAnnotation = UnionTypeAnnotation.asInstanceOf[js.Any], UpdateExpression = UpdateExpression.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NamedTypes_]
  }
}

