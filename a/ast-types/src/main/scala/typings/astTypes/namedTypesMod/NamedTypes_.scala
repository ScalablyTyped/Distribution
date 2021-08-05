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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedTypes_ extends StObject {
  
  var AnyTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation]
  
  var ArrayExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ArrayExpression]
  
  var ArrayPattern: Type[typings.astTypes.namedTypesMod.namedTypes.ArrayPattern]
  
  var ArrayTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation]
  
  var ArrowFunctionExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression]
  
  var AssignmentExpression: Type[typings.astTypes.namedTypesMod.namedTypes.AssignmentExpression]
  
  var AssignmentPattern: Type[typings.astTypes.namedTypesMod.namedTypes.AssignmentPattern]
  
  var AwaitExpression: Type[typings.astTypes.namedTypesMod.namedTypes.AwaitExpression]
  
  var BigIntLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.BigIntLiteral]
  
  var BigIntLiteralTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation]
  
  var BigIntTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation]
  
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
  
  var ChainElement: Type[typings.astTypes.namedTypesMod.namedTypes.ChainElement]
  
  var ChainExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ChainExpression]
  
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
  
  var EnumBooleanBody: Type[typings.astTypes.namedTypesMod.namedTypes.EnumBooleanBody]
  
  var EnumBooleanMember: Type[typings.astTypes.namedTypesMod.namedTypes.EnumBooleanMember]
  
  var EnumDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.EnumDeclaration]
  
  var EnumDefaultedMember: Type[typings.astTypes.namedTypesMod.namedTypes.EnumDefaultedMember]
  
  var EnumNumberBody: Type[typings.astTypes.namedTypesMod.namedTypes.EnumNumberBody]
  
  var EnumNumberMember: Type[typings.astTypes.namedTypesMod.namedTypes.EnumNumberMember]
  
  var EnumStringBody: Type[typings.astTypes.namedTypesMod.namedTypes.EnumStringBody]
  
  var EnumStringMember: Type[typings.astTypes.namedTypesMod.namedTypes.EnumStringMember]
  
  var EnumSymbolBody: Type[typings.astTypes.namedTypesMod.namedTypes.EnumSymbolBody]
  
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
  
  var ImportExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ImportExpression]
  
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
  
  var SymbolTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation]
  
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
  
  var TSNamedTupleMember: Type[typings.astTypes.namedTypesMod.namedTypes.TSNamedTupleMember]
  
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
  
  extension [Self <: NamedTypes_](x: Self) {
    
    inline def setAnyTypeAnnotation(value: Type[AnyTypeAnnotation]): Self = StObject.set(x, "AnyTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setArrayExpression(value: Type[ArrayExpression]): Self = StObject.set(x, "ArrayExpression", value.asInstanceOf[js.Any])
    
    inline def setArrayPattern(value: Type[ArrayPattern]): Self = StObject.set(x, "ArrayPattern", value.asInstanceOf[js.Any])
    
    inline def setArrayTypeAnnotation(value: Type[ArrayTypeAnnotation]): Self = StObject.set(x, "ArrayTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setArrowFunctionExpression(value: Type[ArrowFunctionExpression]): Self = StObject.set(x, "ArrowFunctionExpression", value.asInstanceOf[js.Any])
    
    inline def setAssignmentExpression(value: Type[AssignmentExpression]): Self = StObject.set(x, "AssignmentExpression", value.asInstanceOf[js.Any])
    
    inline def setAssignmentPattern(value: Type[AssignmentPattern]): Self = StObject.set(x, "AssignmentPattern", value.asInstanceOf[js.Any])
    
    inline def setAwaitExpression(value: Type[AwaitExpression]): Self = StObject.set(x, "AwaitExpression", value.asInstanceOf[js.Any])
    
    inline def setBigIntLiteral(value: Type[BigIntLiteral]): Self = StObject.set(x, "BigIntLiteral", value.asInstanceOf[js.Any])
    
    inline def setBigIntLiteralTypeAnnotation(value: Type[BigIntLiteralTypeAnnotation]): Self = StObject.set(x, "BigIntLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setBigIntTypeAnnotation(value: Type[BigIntTypeAnnotation]): Self = StObject.set(x, "BigIntTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setBinaryExpression(value: Type[BinaryExpression]): Self = StObject.set(x, "BinaryExpression", value.asInstanceOf[js.Any])
    
    inline def setBindExpression(value: Type[BindExpression]): Self = StObject.set(x, "BindExpression", value.asInstanceOf[js.Any])
    
    inline def setBlock(value: Type[Block]): Self = StObject.set(x, "Block", value.asInstanceOf[js.Any])
    
    inline def setBlockStatement(value: Type[BlockStatement]): Self = StObject.set(x, "BlockStatement", value.asInstanceOf[js.Any])
    
    inline def setBooleanLiteral(value: Type[BooleanLiteral]): Self = StObject.set(x, "BooleanLiteral", value.asInstanceOf[js.Any])
    
    inline def setBooleanLiteralTypeAnnotation(value: Type[BooleanLiteralTypeAnnotation]): Self = StObject.set(x, "BooleanLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setBooleanTypeAnnotation(value: Type[BooleanTypeAnnotation]): Self = StObject.set(x, "BooleanTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setBreakStatement(value: Type[BreakStatement]): Self = StObject.set(x, "BreakStatement", value.asInstanceOf[js.Any])
    
    inline def setCallExpression(value: Type[CallExpression]): Self = StObject.set(x, "CallExpression", value.asInstanceOf[js.Any])
    
    inline def setCatchClause(value: Type[CatchClause]): Self = StObject.set(x, "CatchClause", value.asInstanceOf[js.Any])
    
    inline def setChainElement(value: Type[ChainElement]): Self = StObject.set(x, "ChainElement", value.asInstanceOf[js.Any])
    
    inline def setChainExpression(value: Type[ChainExpression]): Self = StObject.set(x, "ChainExpression", value.asInstanceOf[js.Any])
    
    inline def setClassBody(value: Type[ClassBody]): Self = StObject.set(x, "ClassBody", value.asInstanceOf[js.Any])
    
    inline def setClassDeclaration(value: Type[ClassDeclaration]): Self = StObject.set(x, "ClassDeclaration", value.asInstanceOf[js.Any])
    
    inline def setClassExpression(value: Type[ClassExpression]): Self = StObject.set(x, "ClassExpression", value.asInstanceOf[js.Any])
    
    inline def setClassImplements(value: Type[ClassImplements]): Self = StObject.set(x, "ClassImplements", value.asInstanceOf[js.Any])
    
    inline def setClassMethod(value: Type[ClassMethod]): Self = StObject.set(x, "ClassMethod", value.asInstanceOf[js.Any])
    
    inline def setClassPrivateMethod(value: Type[ClassPrivateMethod]): Self = StObject.set(x, "ClassPrivateMethod", value.asInstanceOf[js.Any])
    
    inline def setClassPrivateProperty(value: Type[ClassPrivateProperty]): Self = StObject.set(x, "ClassPrivateProperty", value.asInstanceOf[js.Any])
    
    inline def setClassProperty(value: Type[ClassProperty]): Self = StObject.set(x, "ClassProperty", value.asInstanceOf[js.Any])
    
    inline def setClassPropertyDefinition(value: Type[ClassPropertyDefinition]): Self = StObject.set(x, "ClassPropertyDefinition", value.asInstanceOf[js.Any])
    
    inline def setComment(value: Type[Comment]): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentBlock(value: Type[CommentBlock]): Self = StObject.set(x, "CommentBlock", value.asInstanceOf[js.Any])
    
    inline def setCommentLine(value: Type[CommentLine]): Self = StObject.set(x, "CommentLine", value.asInstanceOf[js.Any])
    
    inline def setComprehensionBlock(value: Type[ComprehensionBlock]): Self = StObject.set(x, "ComprehensionBlock", value.asInstanceOf[js.Any])
    
    inline def setComprehensionExpression(value: Type[ComprehensionExpression]): Self = StObject.set(x, "ComprehensionExpression", value.asInstanceOf[js.Any])
    
    inline def setConditionalExpression(value: Type[ConditionalExpression]): Self = StObject.set(x, "ConditionalExpression", value.asInstanceOf[js.Any])
    
    inline def setContinueStatement(value: Type[ContinueStatement]): Self = StObject.set(x, "ContinueStatement", value.asInstanceOf[js.Any])
    
    inline def setDebuggerStatement(value: Type[DebuggerStatement]): Self = StObject.set(x, "DebuggerStatement", value.asInstanceOf[js.Any])
    
    inline def setDeclaration(value: Type[Declaration]): Self = StObject.set(x, "Declaration", value.asInstanceOf[js.Any])
    
    inline def setDeclareClass(value: Type[DeclareClass]): Self = StObject.set(x, "DeclareClass", value.asInstanceOf[js.Any])
    
    inline def setDeclareExportAllDeclaration(value: Type[DeclareExportAllDeclaration]): Self = StObject.set(x, "DeclareExportAllDeclaration", value.asInstanceOf[js.Any])
    
    inline def setDeclareExportDeclaration(value: Type[DeclareExportDeclaration]): Self = StObject.set(x, "DeclareExportDeclaration", value.asInstanceOf[js.Any])
    
    inline def setDeclareFunction(value: Type[DeclareFunction]): Self = StObject.set(x, "DeclareFunction", value.asInstanceOf[js.Any])
    
    inline def setDeclareInterface(value: Type[DeclareInterface]): Self = StObject.set(x, "DeclareInterface", value.asInstanceOf[js.Any])
    
    inline def setDeclareModule(value: Type[DeclareModule]): Self = StObject.set(x, "DeclareModule", value.asInstanceOf[js.Any])
    
    inline def setDeclareModuleExports(value: Type[DeclareModuleExports]): Self = StObject.set(x, "DeclareModuleExports", value.asInstanceOf[js.Any])
    
    inline def setDeclareOpaqueType(value: Type[DeclareOpaqueType]): Self = StObject.set(x, "DeclareOpaqueType", value.asInstanceOf[js.Any])
    
    inline def setDeclareTypeAlias(value: Type[DeclareTypeAlias]): Self = StObject.set(x, "DeclareTypeAlias", value.asInstanceOf[js.Any])
    
    inline def setDeclareVariable(value: Type[DeclareVariable]): Self = StObject.set(x, "DeclareVariable", value.asInstanceOf[js.Any])
    
    inline def setDeclaredPredicate(value: Type[DeclaredPredicate]): Self = StObject.set(x, "DeclaredPredicate", value.asInstanceOf[js.Any])
    
    inline def setDecorator(value: Type[Decorator]): Self = StObject.set(x, "Decorator", value.asInstanceOf[js.Any])
    
    inline def setDirective(value: Type[Directive]): Self = StObject.set(x, "Directive", value.asInstanceOf[js.Any])
    
    inline def setDirectiveLiteral(value: Type[DirectiveLiteral]): Self = StObject.set(x, "DirectiveLiteral", value.asInstanceOf[js.Any])
    
    inline def setDoExpression(value: Type[DoExpression]): Self = StObject.set(x, "DoExpression", value.asInstanceOf[js.Any])
    
    inline def setDoWhileStatement(value: Type[DoWhileStatement]): Self = StObject.set(x, "DoWhileStatement", value.asInstanceOf[js.Any])
    
    inline def setEmptyStatement(value: Type[EmptyStatement]): Self = StObject.set(x, "EmptyStatement", value.asInstanceOf[js.Any])
    
    inline def setEmptyTypeAnnotation(value: Type[EmptyTypeAnnotation]): Self = StObject.set(x, "EmptyTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setEnumBooleanBody(value: Type[EnumBooleanBody]): Self = StObject.set(x, "EnumBooleanBody", value.asInstanceOf[js.Any])
    
    inline def setEnumBooleanMember(value: Type[EnumBooleanMember]): Self = StObject.set(x, "EnumBooleanMember", value.asInstanceOf[js.Any])
    
    inline def setEnumDeclaration(value: Type[EnumDeclaration]): Self = StObject.set(x, "EnumDeclaration", value.asInstanceOf[js.Any])
    
    inline def setEnumDefaultedMember(value: Type[EnumDefaultedMember]): Self = StObject.set(x, "EnumDefaultedMember", value.asInstanceOf[js.Any])
    
    inline def setEnumNumberBody(value: Type[EnumNumberBody]): Self = StObject.set(x, "EnumNumberBody", value.asInstanceOf[js.Any])
    
    inline def setEnumNumberMember(value: Type[EnumNumberMember]): Self = StObject.set(x, "EnumNumberMember", value.asInstanceOf[js.Any])
    
    inline def setEnumStringBody(value: Type[EnumStringBody]): Self = StObject.set(x, "EnumStringBody", value.asInstanceOf[js.Any])
    
    inline def setEnumStringMember(value: Type[EnumStringMember]): Self = StObject.set(x, "EnumStringMember", value.asInstanceOf[js.Any])
    
    inline def setEnumSymbolBody(value: Type[EnumSymbolBody]): Self = StObject.set(x, "EnumSymbolBody", value.asInstanceOf[js.Any])
    
    inline def setExistentialTypeParam(value: Type[ExistentialTypeParam]): Self = StObject.set(x, "ExistentialTypeParam", value.asInstanceOf[js.Any])
    
    inline def setExistsTypeAnnotation(value: Type[ExistsTypeAnnotation]): Self = StObject.set(x, "ExistsTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setExportAllDeclaration(value: Type[ExportAllDeclaration]): Self = StObject.set(x, "ExportAllDeclaration", value.asInstanceOf[js.Any])
    
    inline def setExportBatchSpecifier(value: Type[ExportBatchSpecifier]): Self = StObject.set(x, "ExportBatchSpecifier", value.asInstanceOf[js.Any])
    
    inline def setExportDeclaration(value: Type[ExportDeclaration]): Self = StObject.set(x, "ExportDeclaration", value.asInstanceOf[js.Any])
    
    inline def setExportDefaultDeclaration(value: Type[ExportDefaultDeclaration]): Self = StObject.set(x, "ExportDefaultDeclaration", value.asInstanceOf[js.Any])
    
    inline def setExportDefaultSpecifier(value: Type[ExportDefaultSpecifier]): Self = StObject.set(x, "ExportDefaultSpecifier", value.asInstanceOf[js.Any])
    
    inline def setExportNamedDeclaration(value: Type[ExportNamedDeclaration]): Self = StObject.set(x, "ExportNamedDeclaration", value.asInstanceOf[js.Any])
    
    inline def setExportNamespaceSpecifier(value: Type[ExportNamespaceSpecifier]): Self = StObject.set(x, "ExportNamespaceSpecifier", value.asInstanceOf[js.Any])
    
    inline def setExportSpecifier(value: Type[ExportSpecifier]): Self = StObject.set(x, "ExportSpecifier", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: Type[Expression]): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionStatement(value: Type[ExpressionStatement]): Self = StObject.set(x, "ExpressionStatement", value.asInstanceOf[js.Any])
    
    inline def setFile(value: Type[File]): Self = StObject.set(x, "File", value.asInstanceOf[js.Any])
    
    inline def setFlow(value: Type[Flow]): Self = StObject.set(x, "Flow", value.asInstanceOf[js.Any])
    
    inline def setFlowPredicate(value: Type[FlowPredicate]): Self = StObject.set(x, "FlowPredicate", value.asInstanceOf[js.Any])
    
    inline def setFlowType(value: Type[FlowType]): Self = StObject.set(x, "FlowType", value.asInstanceOf[js.Any])
    
    inline def setForAwaitStatement(value: Type[ForAwaitStatement]): Self = StObject.set(x, "ForAwaitStatement", value.asInstanceOf[js.Any])
    
    inline def setForInStatement(value: Type[ForInStatement]): Self = StObject.set(x, "ForInStatement", value.asInstanceOf[js.Any])
    
    inline def setForOfStatement(value: Type[ForOfStatement]): Self = StObject.set(x, "ForOfStatement", value.asInstanceOf[js.Any])
    
    inline def setForStatement(value: Type[ForStatement]): Self = StObject.set(x, "ForStatement", value.asInstanceOf[js.Any])
    
    inline def setFunction(value: Type[Function]): Self = StObject.set(x, "Function", value.asInstanceOf[js.Any])
    
    inline def setFunctionDeclaration(value: Type[FunctionDeclaration]): Self = StObject.set(x, "FunctionDeclaration", value.asInstanceOf[js.Any])
    
    inline def setFunctionExpression(value: Type[FunctionExpression]): Self = StObject.set(x, "FunctionExpression", value.asInstanceOf[js.Any])
    
    inline def setFunctionTypeAnnotation(value: Type[FunctionTypeAnnotation]): Self = StObject.set(x, "FunctionTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setFunctionTypeParam(value: Type[FunctionTypeParam]): Self = StObject.set(x, "FunctionTypeParam", value.asInstanceOf[js.Any])
    
    inline def setGeneratorExpression(value: Type[GeneratorExpression]): Self = StObject.set(x, "GeneratorExpression", value.asInstanceOf[js.Any])
    
    inline def setGenericTypeAnnotation(value: Type[GenericTypeAnnotation]): Self = StObject.set(x, "GenericTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: Type[Identifier]): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setIfStatement(value: Type[IfStatement]): Self = StObject.set(x, "IfStatement", value.asInstanceOf[js.Any])
    
    inline def setImport(value: Type[Import]): Self = StObject.set(x, "Import", value.asInstanceOf[js.Any])
    
    inline def setImportDeclaration(value: Type[ImportDeclaration]): Self = StObject.set(x, "ImportDeclaration", value.asInstanceOf[js.Any])
    
    inline def setImportDefaultSpecifier(value: Type[ImportDefaultSpecifier]): Self = StObject.set(x, "ImportDefaultSpecifier", value.asInstanceOf[js.Any])
    
    inline def setImportExpression(value: Type[ImportExpression]): Self = StObject.set(x, "ImportExpression", value.asInstanceOf[js.Any])
    
    inline def setImportNamespaceSpecifier(value: Type[ImportNamespaceSpecifier]): Self = StObject.set(x, "ImportNamespaceSpecifier", value.asInstanceOf[js.Any])
    
    inline def setImportSpecifier(value: Type[ImportSpecifier]): Self = StObject.set(x, "ImportSpecifier", value.asInstanceOf[js.Any])
    
    inline def setInferredPredicate(value: Type[InferredPredicate]): Self = StObject.set(x, "InferredPredicate", value.asInstanceOf[js.Any])
    
    inline def setInterfaceDeclaration(value: Type[InterfaceDeclaration]): Self = StObject.set(x, "InterfaceDeclaration", value.asInstanceOf[js.Any])
    
    inline def setInterfaceExtends(value: Type[InterfaceExtends]): Self = StObject.set(x, "InterfaceExtends", value.asInstanceOf[js.Any])
    
    inline def setInterfaceTypeAnnotation(value: Type[InterfaceTypeAnnotation]): Self = StObject.set(x, "InterfaceTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setInterpreterDirective(value: Type[InterpreterDirective]): Self = StObject.set(x, "InterpreterDirective", value.asInstanceOf[js.Any])
    
    inline def setIntersectionTypeAnnotation(value: Type[IntersectionTypeAnnotation]): Self = StObject.set(x, "IntersectionTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setJSXAttribute(value: Type[JSXAttribute]): Self = StObject.set(x, "JSXAttribute", value.asInstanceOf[js.Any])
    
    inline def setJSXClosingElement(value: Type[JSXClosingElement]): Self = StObject.set(x, "JSXClosingElement", value.asInstanceOf[js.Any])
    
    inline def setJSXClosingFragment(value: Type[JSXClosingFragment]): Self = StObject.set(x, "JSXClosingFragment", value.asInstanceOf[js.Any])
    
    inline def setJSXElement(value: Type[JSXElement]): Self = StObject.set(x, "JSXElement", value.asInstanceOf[js.Any])
    
    inline def setJSXEmptyExpression(value: Type[JSXEmptyExpression]): Self = StObject.set(x, "JSXEmptyExpression", value.asInstanceOf[js.Any])
    
    inline def setJSXExpressionContainer(value: Type[JSXExpressionContainer]): Self = StObject.set(x, "JSXExpressionContainer", value.asInstanceOf[js.Any])
    
    inline def setJSXFragment(value: Type[JSXFragment]): Self = StObject.set(x, "JSXFragment", value.asInstanceOf[js.Any])
    
    inline def setJSXIdentifier(value: Type[JSXIdentifier]): Self = StObject.set(x, "JSXIdentifier", value.asInstanceOf[js.Any])
    
    inline def setJSXMemberExpression(value: Type[JSXMemberExpression]): Self = StObject.set(x, "JSXMemberExpression", value.asInstanceOf[js.Any])
    
    inline def setJSXNamespacedName(value: Type[JSXNamespacedName]): Self = StObject.set(x, "JSXNamespacedName", value.asInstanceOf[js.Any])
    
    inline def setJSXOpeningElement(value: Type[JSXOpeningElement]): Self = StObject.set(x, "JSXOpeningElement", value.asInstanceOf[js.Any])
    
    inline def setJSXOpeningFragment(value: Type[JSXOpeningFragment]): Self = StObject.set(x, "JSXOpeningFragment", value.asInstanceOf[js.Any])
    
    inline def setJSXSpreadAttribute(value: Type[JSXSpreadAttribute]): Self = StObject.set(x, "JSXSpreadAttribute", value.asInstanceOf[js.Any])
    
    inline def setJSXSpreadChild(value: Type[JSXSpreadChild]): Self = StObject.set(x, "JSXSpreadChild", value.asInstanceOf[js.Any])
    
    inline def setJSXText(value: Type[JSXText]): Self = StObject.set(x, "JSXText", value.asInstanceOf[js.Any])
    
    inline def setLabeledStatement(value: Type[LabeledStatement]): Self = StObject.set(x, "LabeledStatement", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Type[Line]): Self = StObject.set(x, "Line", value.asInstanceOf[js.Any])
    
    inline def setLiteral(value: Type[Literal]): Self = StObject.set(x, "Literal", value.asInstanceOf[js.Any])
    
    inline def setLogicalExpression(value: Type[LogicalExpression]): Self = StObject.set(x, "LogicalExpression", value.asInstanceOf[js.Any])
    
    inline def setMemberExpression(value: Type[MemberExpression]): Self = StObject.set(x, "MemberExpression", value.asInstanceOf[js.Any])
    
    inline def setMemberTypeAnnotation(value: Type[MemberTypeAnnotation]): Self = StObject.set(x, "MemberTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setMetaProperty(value: Type[MetaProperty]): Self = StObject.set(x, "MetaProperty", value.asInstanceOf[js.Any])
    
    inline def setMethodDefinition(value: Type[MethodDefinition]): Self = StObject.set(x, "MethodDefinition", value.asInstanceOf[js.Any])
    
    inline def setMixedTypeAnnotation(value: Type[MixedTypeAnnotation]): Self = StObject.set(x, "MixedTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setModuleSpecifier(value: Type[ModuleSpecifier]): Self = StObject.set(x, "ModuleSpecifier", value.asInstanceOf[js.Any])
    
    inline def setNewExpression(value: Type[NewExpression]): Self = StObject.set(x, "NewExpression", value.asInstanceOf[js.Any])
    
    inline def setNode(value: Type[Node]): Self = StObject.set(x, "Node", value.asInstanceOf[js.Any])
    
    inline def setNoop(value: Type[Noop]): Self = StObject.set(x, "Noop", value.asInstanceOf[js.Any])
    
    inline def setNullLiteral(value: Type[NullLiteral]): Self = StObject.set(x, "NullLiteral", value.asInstanceOf[js.Any])
    
    inline def setNullLiteralTypeAnnotation(value: Type[NullLiteralTypeAnnotation]): Self = StObject.set(x, "NullLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setNullTypeAnnotation(value: Type[NullTypeAnnotation]): Self = StObject.set(x, "NullTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setNullableTypeAnnotation(value: Type[NullableTypeAnnotation]): Self = StObject.set(x, "NullableTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setNumberLiteralTypeAnnotation(value: Type[NumberLiteralTypeAnnotation]): Self = StObject.set(x, "NumberLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setNumberTypeAnnotation(value: Type[NumberTypeAnnotation]): Self = StObject.set(x, "NumberTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setNumericLiteral(value: Type[NumericLiteral]): Self = StObject.set(x, "NumericLiteral", value.asInstanceOf[js.Any])
    
    inline def setNumericLiteralTypeAnnotation(value: Type[NumericLiteralTypeAnnotation]): Self = StObject.set(x, "NumericLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setObjectExpression(value: Type[ObjectExpression]): Self = StObject.set(x, "ObjectExpression", value.asInstanceOf[js.Any])
    
    inline def setObjectMethod(value: Type[ObjectMethod]): Self = StObject.set(x, "ObjectMethod", value.asInstanceOf[js.Any])
    
    inline def setObjectPattern(value: Type[ObjectPattern]): Self = StObject.set(x, "ObjectPattern", value.asInstanceOf[js.Any])
    
    inline def setObjectProperty(value: Type[ObjectProperty]): Self = StObject.set(x, "ObjectProperty", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeAnnotation(value: Type[ObjectTypeAnnotation]): Self = StObject.set(x, "ObjectTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeCallProperty(value: Type[ObjectTypeCallProperty]): Self = StObject.set(x, "ObjectTypeCallProperty", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeIndexer(value: Type[ObjectTypeIndexer]): Self = StObject.set(x, "ObjectTypeIndexer", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeInternalSlot(value: Type[ObjectTypeInternalSlot]): Self = StObject.set(x, "ObjectTypeInternalSlot", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeProperty(value: Type[ObjectTypeProperty]): Self = StObject.set(x, "ObjectTypeProperty", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeSpreadProperty(value: Type[ObjectTypeSpreadProperty]): Self = StObject.set(x, "ObjectTypeSpreadProperty", value.asInstanceOf[js.Any])
    
    inline def setOpaqueType(value: Type[OpaqueType]): Self = StObject.set(x, "OpaqueType", value.asInstanceOf[js.Any])
    
    inline def setOptionalCallExpression(value: Type[OptionalCallExpression]): Self = StObject.set(x, "OptionalCallExpression", value.asInstanceOf[js.Any])
    
    inline def setOptionalMemberExpression(value: Type[OptionalMemberExpression]): Self = StObject.set(x, "OptionalMemberExpression", value.asInstanceOf[js.Any])
    
    inline def setParenthesizedExpression(value: Type[ParenthesizedExpression]): Self = StObject.set(x, "ParenthesizedExpression", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: Type[Pattern]): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Type[Position]): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setPrintable(value: Type[Printable]): Self = StObject.set(x, "Printable", value.asInstanceOf[js.Any])
    
    inline def setPrivateName(value: Type[PrivateName]): Self = StObject.set(x, "PrivateName", value.asInstanceOf[js.Any])
    
    inline def setProgram(value: Type[Program]): Self = StObject.set(x, "Program", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: Type[Property]): Self = StObject.set(x, "Property", value.asInstanceOf[js.Any])
    
    inline def setPropertyPattern(value: Type[PropertyPattern]): Self = StObject.set(x, "PropertyPattern", value.asInstanceOf[js.Any])
    
    inline def setQualifiedTypeIdentifier(value: Type[QualifiedTypeIdentifier]): Self = StObject.set(x, "QualifiedTypeIdentifier", value.asInstanceOf[js.Any])
    
    inline def setRegExpLiteral(value: Type[RegExpLiteral]): Self = StObject.set(x, "RegExpLiteral", value.asInstanceOf[js.Any])
    
    inline def setRestElement(value: Type[RestElement]): Self = StObject.set(x, "RestElement", value.asInstanceOf[js.Any])
    
    inline def setRestProperty(value: Type[RestProperty]): Self = StObject.set(x, "RestProperty", value.asInstanceOf[js.Any])
    
    inline def setReturnStatement(value: Type[ReturnStatement]): Self = StObject.set(x, "ReturnStatement", value.asInstanceOf[js.Any])
    
    inline def setSequenceExpression(value: Type[SequenceExpression]): Self = StObject.set(x, "SequenceExpression", value.asInstanceOf[js.Any])
    
    inline def setSourceLocation(value: Type[SourceLocation]): Self = StObject.set(x, "SourceLocation", value.asInstanceOf[js.Any])
    
    inline def setSpecifier(value: Type[Specifier]): Self = StObject.set(x, "Specifier", value.asInstanceOf[js.Any])
    
    inline def setSpreadElement(value: Type[SpreadElement]): Self = StObject.set(x, "SpreadElement", value.asInstanceOf[js.Any])
    
    inline def setSpreadElementPattern(value: Type[SpreadElementPattern]): Self = StObject.set(x, "SpreadElementPattern", value.asInstanceOf[js.Any])
    
    inline def setSpreadProperty(value: Type[SpreadProperty]): Self = StObject.set(x, "SpreadProperty", value.asInstanceOf[js.Any])
    
    inline def setSpreadPropertyPattern(value: Type[SpreadPropertyPattern]): Self = StObject.set(x, "SpreadPropertyPattern", value.asInstanceOf[js.Any])
    
    inline def setStatement(value: Type[Statement]): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
    
    inline def setStringLiteral(value: Type[StringLiteral]): Self = StObject.set(x, "StringLiteral", value.asInstanceOf[js.Any])
    
    inline def setStringLiteralTypeAnnotation(value: Type[StringLiteralTypeAnnotation]): Self = StObject.set(x, "StringLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setStringTypeAnnotation(value: Type[StringTypeAnnotation]): Self = StObject.set(x, "StringTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setSuper(value: Type[Super]): Self = StObject.set(x, "Super", value.asInstanceOf[js.Any])
    
    inline def setSwitchCase(value: Type[SwitchCase]): Self = StObject.set(x, "SwitchCase", value.asInstanceOf[js.Any])
    
    inline def setSwitchStatement(value: Type[SwitchStatement]): Self = StObject.set(x, "SwitchStatement", value.asInstanceOf[js.Any])
    
    inline def setSymbolTypeAnnotation(value: Type[SymbolTypeAnnotation]): Self = StObject.set(x, "SymbolTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTSAnyKeyword(value: Type[TSAnyKeyword]): Self = StObject.set(x, "TSAnyKeyword", value.asInstanceOf[js.Any])
    
    inline def setTSArrayType(value: Type[TSArrayType]): Self = StObject.set(x, "TSArrayType", value.asInstanceOf[js.Any])
    
    inline def setTSAsExpression(value: Type[TSAsExpression]): Self = StObject.set(x, "TSAsExpression", value.asInstanceOf[js.Any])
    
    inline def setTSBigIntKeyword(value: Type[TSBigIntKeyword]): Self = StObject.set(x, "TSBigIntKeyword", value.asInstanceOf[js.Any])
    
    inline def setTSBooleanKeyword(value: Type[TSBooleanKeyword]): Self = StObject.set(x, "TSBooleanKeyword", value.asInstanceOf[js.Any])
    
    inline def setTSCallSignatureDeclaration(value: Type[TSCallSignatureDeclaration]): Self = StObject.set(x, "TSCallSignatureDeclaration", value.asInstanceOf[js.Any])
    
    inline def setTSConditionalType(value: Type[TSConditionalType]): Self = StObject.set(x, "TSConditionalType", value.asInstanceOf[js.Any])
    
    inline def setTSConstructSignatureDeclaration(value: Type[TSConstructSignatureDeclaration]): Self = StObject.set(x, "TSConstructSignatureDeclaration", value.asInstanceOf[js.Any])
    
    inline def setTSConstructorType(value: Type[TSConstructorType]): Self = StObject.set(x, "TSConstructorType", value.asInstanceOf[js.Any])
    
    inline def setTSDeclareFunction(value: Type[TSDeclareFunction]): Self = StObject.set(x, "TSDeclareFunction", value.asInstanceOf[js.Any])
    
    inline def setTSDeclareMethod(value: Type[TSDeclareMethod]): Self = StObject.set(x, "TSDeclareMethod", value.asInstanceOf[js.Any])
    
    inline def setTSEnumDeclaration(value: Type[TSEnumDeclaration]): Self = StObject.set(x, "TSEnumDeclaration", value.asInstanceOf[js.Any])
    
    inline def setTSEnumMember(value: Type[TSEnumMember]): Self = StObject.set(x, "TSEnumMember", value.asInstanceOf[js.Any])
    
    inline def setTSExportAssignment(value: Type[TSExportAssignment]): Self = StObject.set(x, "TSExportAssignment", value.asInstanceOf[js.Any])
    
    inline def setTSExpressionWithTypeArguments(value: Type[TSExpressionWithTypeArguments]): Self = StObject.set(x, "TSExpressionWithTypeArguments", value.asInstanceOf[js.Any])
    
    inline def setTSExternalModuleReference(value: Type[TSExternalModuleReference]): Self = StObject.set(x, "TSExternalModuleReference", value.asInstanceOf[js.Any])
    
    inline def setTSFunctionType(value: Type[TSFunctionType]): Self = StObject.set(x, "TSFunctionType", value.asInstanceOf[js.Any])
    
    inline def setTSHasOptionalTypeAnnotation(value: Type[TSHasOptionalTypeAnnotation]): Self = StObject.set(x, "TSHasOptionalTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTSHasOptionalTypeParameterInstantiation(value: Type[TSHasOptionalTypeParameterInstantiation]): Self = StObject.set(x, "TSHasOptionalTypeParameterInstantiation", value.asInstanceOf[js.Any])
    
    inline def setTSHasOptionalTypeParameters(value: Type[TSHasOptionalTypeParameters]): Self = StObject.set(x, "TSHasOptionalTypeParameters", value.asInstanceOf[js.Any])
    
    inline def setTSImportEqualsDeclaration(value: Type[TSImportEqualsDeclaration]): Self = StObject.set(x, "TSImportEqualsDeclaration", value.asInstanceOf[js.Any])
    
    inline def setTSImportType(value: Type[TSImportType]): Self = StObject.set(x, "TSImportType", value.asInstanceOf[js.Any])
    
    inline def setTSIndexSignature(value: Type[TSIndexSignature]): Self = StObject.set(x, "TSIndexSignature", value.asInstanceOf[js.Any])
    
    inline def setTSIndexedAccessType(value: Type[TSIndexedAccessType]): Self = StObject.set(x, "TSIndexedAccessType", value.asInstanceOf[js.Any])
    
    inline def setTSInferType(value: Type[TSInferType]): Self = StObject.set(x, "TSInferType", value.asInstanceOf[js.Any])
    
    inline def setTSInterfaceBody(value: Type[TSInterfaceBody]): Self = StObject.set(x, "TSInterfaceBody", value.asInstanceOf[js.Any])
    
    inline def setTSInterfaceDeclaration(value: Type[TSInterfaceDeclaration]): Self = StObject.set(x, "TSInterfaceDeclaration", value.asInstanceOf[js.Any])
    
    inline def setTSIntersectionType(value: Type[TSIntersectionType]): Self = StObject.set(x, "TSIntersectionType", value.asInstanceOf[js.Any])
    
    inline def setTSLiteralType(value: Type[TSLiteralType]): Self = StObject.set(x, "TSLiteralType", value.asInstanceOf[js.Any])
    
    inline def setTSMappedType(value: Type[TSMappedType]): Self = StObject.set(x, "TSMappedType", value.asInstanceOf[js.Any])
    
    inline def setTSMethodSignature(value: Type[TSMethodSignature]): Self = StObject.set(x, "TSMethodSignature", value.asInstanceOf[js.Any])
    
    inline def setTSModuleBlock(value: Type[TSModuleBlock]): Self = StObject.set(x, "TSModuleBlock", value.asInstanceOf[js.Any])
    
    inline def setTSModuleDeclaration(value: Type[TSModuleDeclaration]): Self = StObject.set(x, "TSModuleDeclaration", value.asInstanceOf[js.Any])
    
    inline def setTSNamedTupleMember(value: Type[TSNamedTupleMember]): Self = StObject.set(x, "TSNamedTupleMember", value.asInstanceOf[js.Any])
    
    inline def setTSNamespaceExportDeclaration(value: Type[TSNamespaceExportDeclaration]): Self = StObject.set(x, "TSNamespaceExportDeclaration", value.asInstanceOf[js.Any])
    
    inline def setTSNeverKeyword(value: Type[TSNeverKeyword]): Self = StObject.set(x, "TSNeverKeyword", value.asInstanceOf[js.Any])
    
    inline def setTSNonNullExpression(value: Type[TSNonNullExpression]): Self = StObject.set(x, "TSNonNullExpression", value.asInstanceOf[js.Any])
    
    inline def setTSNullKeyword(value: Type[TSNullKeyword]): Self = StObject.set(x, "TSNullKeyword", value.asInstanceOf[js.Any])
    
    inline def setTSNumberKeyword(value: Type[TSNumberKeyword]): Self = StObject.set(x, "TSNumberKeyword", value.asInstanceOf[js.Any])
    
    inline def setTSObjectKeyword(value: Type[TSObjectKeyword]): Self = StObject.set(x, "TSObjectKeyword", value.asInstanceOf[js.Any])
    
    inline def setTSOptionalType(value: Type[TSOptionalType]): Self = StObject.set(x, "TSOptionalType", value.asInstanceOf[js.Any])
    
    inline def setTSParameterProperty(value: Type[TSParameterProperty]): Self = StObject.set(x, "TSParameterProperty", value.asInstanceOf[js.Any])
    
    inline def setTSParenthesizedType(value: Type[TSParenthesizedType]): Self = StObject.set(x, "TSParenthesizedType", value.asInstanceOf[js.Any])
    
    inline def setTSPropertySignature(value: Type[TSPropertySignature]): Self = StObject.set(x, "TSPropertySignature", value.asInstanceOf[js.Any])
    
    inline def setTSQualifiedName(value: Type[TSQualifiedName]): Self = StObject.set(x, "TSQualifiedName", value.asInstanceOf[js.Any])
    
    inline def setTSRestType(value: Type[TSRestType]): Self = StObject.set(x, "TSRestType", value.asInstanceOf[js.Any])
    
    inline def setTSStringKeyword(value: Type[TSStringKeyword]): Self = StObject.set(x, "TSStringKeyword", value.asInstanceOf[js.Any])
    
    inline def setTSSymbolKeyword(value: Type[TSSymbolKeyword]): Self = StObject.set(x, "TSSymbolKeyword", value.asInstanceOf[js.Any])
    
    inline def setTSThisType(value: Type[TSThisType]): Self = StObject.set(x, "TSThisType", value.asInstanceOf[js.Any])
    
    inline def setTSTupleType(value: Type[TSTupleType]): Self = StObject.set(x, "TSTupleType", value.asInstanceOf[js.Any])
    
    inline def setTSType(value: Type[TSType]): Self = StObject.set(x, "TSType", value.asInstanceOf[js.Any])
    
    inline def setTSTypeAliasDeclaration(value: Type[TSTypeAliasDeclaration]): Self = StObject.set(x, "TSTypeAliasDeclaration", value.asInstanceOf[js.Any])
    
    inline def setTSTypeAnnotation(value: Type[TSTypeAnnotation]): Self = StObject.set(x, "TSTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTSTypeAssertion(value: Type[TSTypeAssertion]): Self = StObject.set(x, "TSTypeAssertion", value.asInstanceOf[js.Any])
    
    inline def setTSTypeLiteral(value: Type[TSTypeLiteral]): Self = StObject.set(x, "TSTypeLiteral", value.asInstanceOf[js.Any])
    
    inline def setTSTypeOperator(value: Type[TSTypeOperator]): Self = StObject.set(x, "TSTypeOperator", value.asInstanceOf[js.Any])
    
    inline def setTSTypeParameter(value: Type[TSTypeParameter]): Self = StObject.set(x, "TSTypeParameter", value.asInstanceOf[js.Any])
    
    inline def setTSTypeParameterDeclaration(value: Type[TSTypeParameterDeclaration]): Self = StObject.set(x, "TSTypeParameterDeclaration", value.asInstanceOf[js.Any])
    
    inline def setTSTypeParameterInstantiation(value: Type[TSTypeParameterInstantiation]): Self = StObject.set(x, "TSTypeParameterInstantiation", value.asInstanceOf[js.Any])
    
    inline def setTSTypePredicate(value: Type[TSTypePredicate]): Self = StObject.set(x, "TSTypePredicate", value.asInstanceOf[js.Any])
    
    inline def setTSTypeQuery(value: Type[TSTypeQuery]): Self = StObject.set(x, "TSTypeQuery", value.asInstanceOf[js.Any])
    
    inline def setTSTypeReference(value: Type[TSTypeReference]): Self = StObject.set(x, "TSTypeReference", value.asInstanceOf[js.Any])
    
    inline def setTSUndefinedKeyword(value: Type[TSUndefinedKeyword]): Self = StObject.set(x, "TSUndefinedKeyword", value.asInstanceOf[js.Any])
    
    inline def setTSUnionType(value: Type[TSUnionType]): Self = StObject.set(x, "TSUnionType", value.asInstanceOf[js.Any])
    
    inline def setTSUnknownKeyword(value: Type[TSUnknownKeyword]): Self = StObject.set(x, "TSUnknownKeyword", value.asInstanceOf[js.Any])
    
    inline def setTSVoidKeyword(value: Type[TSVoidKeyword]): Self = StObject.set(x, "TSVoidKeyword", value.asInstanceOf[js.Any])
    
    inline def setTaggedTemplateExpression(value: Type[TaggedTemplateExpression]): Self = StObject.set(x, "TaggedTemplateExpression", value.asInstanceOf[js.Any])
    
    inline def setTemplateElement(value: Type[TemplateElement]): Self = StObject.set(x, "TemplateElement", value.asInstanceOf[js.Any])
    
    inline def setTemplateLiteral(value: Type[TemplateLiteral]): Self = StObject.set(x, "TemplateLiteral", value.asInstanceOf[js.Any])
    
    inline def setThisExpression(value: Type[ThisExpression]): Self = StObject.set(x, "ThisExpression", value.asInstanceOf[js.Any])
    
    inline def setThisTypeAnnotation(value: Type[ThisTypeAnnotation]): Self = StObject.set(x, "ThisTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setThrowStatement(value: Type[ThrowStatement]): Self = StObject.set(x, "ThrowStatement", value.asInstanceOf[js.Any])
    
    inline def setTryStatement(value: Type[TryStatement]): Self = StObject.set(x, "TryStatement", value.asInstanceOf[js.Any])
    
    inline def setTupleTypeAnnotation(value: Type[TupleTypeAnnotation]): Self = StObject.set(x, "TupleTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAlias(value: Type[TypeAlias]): Self = StObject.set(x, "TypeAlias", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: Type[TypeAnnotation]): Self = StObject.set(x, "TypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeCastExpression(value: Type[TypeCastExpression]): Self = StObject.set(x, "TypeCastExpression", value.asInstanceOf[js.Any])
    
    inline def setTypeParameter(value: Type[TypeParameter]): Self = StObject.set(x, "TypeParameter", value.asInstanceOf[js.Any])
    
    inline def setTypeParameterDeclaration(value: Type[TypeParameterDeclaration]): Self = StObject.set(x, "TypeParameterDeclaration", value.asInstanceOf[js.Any])
    
    inline def setTypeParameterInstantiation(value: Type[TypeParameterInstantiation]): Self = StObject.set(x, "TypeParameterInstantiation", value.asInstanceOf[js.Any])
    
    inline def setTypeofTypeAnnotation(value: Type[TypeofTypeAnnotation]): Self = StObject.set(x, "TypeofTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setUnaryExpression(value: Type[UnaryExpression]): Self = StObject.set(x, "UnaryExpression", value.asInstanceOf[js.Any])
    
    inline def setUnionTypeAnnotation(value: Type[UnionTypeAnnotation]): Self = StObject.set(x, "UnionTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setUpdateExpression(value: Type[UpdateExpression]): Self = StObject.set(x, "UpdateExpression", value.asInstanceOf[js.Any])
    
    inline def setVariableDeclaration(value: Type[VariableDeclaration]): Self = StObject.set(x, "VariableDeclaration", value.asInstanceOf[js.Any])
    
    inline def setVariableDeclarator(value: Type[VariableDeclarator]): Self = StObject.set(x, "VariableDeclarator", value.asInstanceOf[js.Any])
    
    inline def setVariance(value: Type[Variance]): Self = StObject.set(x, "Variance", value.asInstanceOf[js.Any])
    
    inline def setVoidTypeAnnotation(value: Type[VoidTypeAnnotation]): Self = StObject.set(x, "VoidTypeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setWhileStatement(value: Type[WhileStatement]): Self = StObject.set(x, "WhileStatement", value.asInstanceOf[js.Any])
    
    inline def setWithStatement(value: Type[WithStatement]): Self = StObject.set(x, "WithStatement", value.asInstanceOf[js.Any])
    
    inline def setYieldExpression(value: Type[YieldExpression]): Self = StObject.set(x, "YieldExpression", value.asInstanceOf[js.Any])
  }
}
