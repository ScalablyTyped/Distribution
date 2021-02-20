package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.anon.Cooked
import typings.astTypes.astTypesStrings.Ampersand
import typings.astTypes.astTypesStrings.AmpersandAmpersand
import typings.astTypes.astTypesStrings.AmpersandEqualssign
import typings.astTypes.astTypesStrings.Asterisk
import typings.astTypes.astTypesStrings.AsteriskAsterisk
import typings.astTypes.astTypesStrings.AsteriskAsteriskEqualssign
import typings.astTypes.astTypesStrings.AsteriskEqualssign
import typings.astTypes.astTypesStrings.Equalssign
import typings.astTypes.astTypesStrings.EqualssignEqualssign
import typings.astTypes.astTypesStrings.EqualssignEqualssignEqualssign
import typings.astTypes.astTypesStrings.Exclamationmark
import typings.astTypes.astTypesStrings.ExclamationmarkEqualssign
import typings.astTypes.astTypesStrings.ExclamationmarkEqualssignEqualssign
import typings.astTypes.astTypesStrings.Greaterthansign
import typings.astTypes.astTypesStrings.GreaterthansignEqualssign
import typings.astTypes.astTypesStrings.GreaterthansignGreaterthansign
import typings.astTypes.astTypesStrings.GreaterthansignGreaterthansignEqualssign
import typings.astTypes.astTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typings.astTypes.astTypesStrings.GreaterthansignGreaterthansignGreaterthansignEqualssign
import typings.astTypes.astTypesStrings.Lessthansign
import typings.astTypes.astTypesStrings.LessthansignEqualssign
import typings.astTypes.astTypesStrings.LessthansignLessthansign
import typings.astTypes.astTypesStrings.LessthansignLessthansignEqualssign
import typings.astTypes.astTypesStrings.Percentsign
import typings.astTypes.astTypesStrings.PercentsignEqualssign
import typings.astTypes.astTypesStrings.Plussign
import typings.astTypes.astTypesStrings.PlussignEqualssign
import typings.astTypes.astTypesStrings.PlussignPlussign
import typings.astTypes.astTypesStrings.QuestionmarkQuestionmark
import typings.astTypes.astTypesStrings.Slash
import typings.astTypes.astTypesStrings.SlashEqualssign
import typings.astTypes.astTypesStrings.Tilde
import typings.astTypes.astTypesStrings.Verticalline
import typings.astTypes.astTypesStrings.VerticallineEqualssign
import typings.astTypes.astTypesStrings.VerticallineVerticalline
import typings.astTypes.astTypesStrings.`--`
import typings.astTypes.astTypesStrings.`-Equalssign`
import typings.astTypes.astTypesStrings.`-_`
import typings.astTypes.astTypesStrings.`^Equalssign`
import typings.astTypes.astTypesStrings.`var`
import typings.astTypes.astTypesStrings.const
import typings.astTypes.astTypesStrings.constructor
import typings.astTypes.astTypesStrings.delete
import typings.astTypes.astTypesStrings.get
import typings.astTypes.astTypesStrings.in
import typings.astTypes.astTypesStrings.init
import typings.astTypes.astTypesStrings.instanceof
import typings.astTypes.astTypesStrings.let
import typings.astTypes.astTypesStrings.method
import typings.astTypes.astTypesStrings.minus
import typings.astTypes.astTypesStrings.plus
import typings.astTypes.astTypesStrings.set
import typings.astTypes.astTypesStrings.typeof
import typings.astTypes.astTypesStrings.void
import typings.astTypes.kindsMod.ArrayPatternKind
import typings.astTypes.kindsMod.AssignmentPatternKind
import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.BooleanLiteralKind
import typings.astTypes.kindsMod.ChainElementKind
import typings.astTypes.kindsMod.ClassBodyKind
import typings.astTypes.kindsMod.ClassMethodKind
import typings.astTypes.kindsMod.ClassPrivateMethodKind
import typings.astTypes.kindsMod.ClassPrivatePropertyKind
import typings.astTypes.kindsMod.ClassPropertyDefinitionKind
import typings.astTypes.kindsMod.ClassPropertyKind
import typings.astTypes.kindsMod.ComprehensionBlockKind
import typings.astTypes.kindsMod.DeclarationKind
import typings.astTypes.kindsMod.DirectiveLiteralKind
import typings.astTypes.kindsMod.EnumBooleanBodyKind
import typings.astTypes.kindsMod.EnumBooleanMemberKind
import typings.astTypes.kindsMod.EnumDefaultedMemberKind
import typings.astTypes.kindsMod.EnumNumberBodyKind
import typings.astTypes.kindsMod.EnumNumberMemberKind
import typings.astTypes.kindsMod.EnumStringBodyKind
import typings.astTypes.kindsMod.EnumStringMemberKind
import typings.astTypes.kindsMod.EnumSymbolBodyKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.FunctionKind
import typings.astTypes.kindsMod.FunctionTypeAnnotationKind
import typings.astTypes.kindsMod.FunctionTypeParamKind
import typings.astTypes.kindsMod.GenericTypeAnnotationKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.InterfaceExtendsKind
import typings.astTypes.kindsMod.JSXClosingFragmentKind
import typings.astTypes.kindsMod.JSXEmptyExpressionKind
import typings.astTypes.kindsMod.JSXIdentifierKind
import typings.astTypes.kindsMod.JSXMemberExpressionKind
import typings.astTypes.kindsMod.JSXNamespacedNameKind
import typings.astTypes.kindsMod.JSXOpeningElementKind
import typings.astTypes.kindsMod.JSXOpeningFragmentKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.kindsMod.MemberExpressionKind
import typings.astTypes.kindsMod.MemberTypeAnnotationKind
import typings.astTypes.kindsMod.MethodDefinitionKind
import typings.astTypes.kindsMod.NumericLiteralKind
import typings.astTypes.kindsMod.ObjectMethodKind
import typings.astTypes.kindsMod.ObjectPatternKind
import typings.astTypes.kindsMod.ObjectPropertyKind
import typings.astTypes.kindsMod.ObjectTypeAnnotationKind
import typings.astTypes.kindsMod.ObjectTypePropertyKind
import typings.astTypes.kindsMod.ObjectTypeSpreadPropertyKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.PrivateNameKind
import typings.astTypes.kindsMod.ProgramKind
import typings.astTypes.kindsMod.PropertyKind
import typings.astTypes.kindsMod.PropertyPatternKind
import typings.astTypes.kindsMod.QualifiedTypeIdentifierKind
import typings.astTypes.kindsMod.RestElementKind
import typings.astTypes.kindsMod.RestPropertyKind
import typings.astTypes.kindsMod.SpreadElementKind
import typings.astTypes.kindsMod.SpreadPropertyKind
import typings.astTypes.kindsMod.SpreadPropertyPatternKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.kindsMod.StringLiteralKind
import typings.astTypes.kindsMod.SwitchCaseKind
import typings.astTypes.kindsMod.TSCallSignatureDeclarationKind
import typings.astTypes.kindsMod.TSConstructSignatureDeclarationKind
import typings.astTypes.kindsMod.TSDeclareMethodKind
import typings.astTypes.kindsMod.TSEnumMemberKind
import typings.astTypes.kindsMod.TSExternalModuleReferenceKind
import typings.astTypes.kindsMod.TSImportTypeKind
import typings.astTypes.kindsMod.TSIndexSignatureKind
import typings.astTypes.kindsMod.TSInterfaceBodyKind
import typings.astTypes.kindsMod.TSMethodSignatureKind
import typings.astTypes.kindsMod.TSNamedTupleMemberKind
import typings.astTypes.kindsMod.TSPropertySignatureKind
import typings.astTypes.kindsMod.TSQualifiedNameKind
import typings.astTypes.kindsMod.TSThisTypeKind
import typings.astTypes.kindsMod.TSTypeAnnotationKind
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.kindsMod.TSTypeParameterKind
import typings.astTypes.kindsMod.TemplateElementKind
import typings.astTypes.kindsMod.TemplateLiteralKind
import typings.astTypes.kindsMod.TypeAnnotationKind
import typings.astTypes.kindsMod.TypeParameterKind
import typings.astTypes.kindsMod.UnaryExpressionKind
import typings.astTypes.kindsMod.VariableDeclarationKind
import typings.astTypes.kindsMod.VariableDeclaratorKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  - typings.astTypes.namedTypesMod.namedTypes.EnumBooleanBody
  - typings.astTypes.namedTypesMod.namedTypes.EnumNumberBody
  - typings.astTypes.namedTypesMod.namedTypes.EnumStringBody
  - typings.astTypes.namedTypesMod.namedTypes.EnumSymbolBody
  - typings.astTypes.namedTypesMod.namedTypes.EnumBooleanMember
  - typings.astTypes.namedTypesMod.namedTypes.EnumNumberMember
  - typings.astTypes.namedTypesMod.namedTypes.EnumStringMember
  - typings.astTypes.namedTypesMod.namedTypes.EnumDefaultedMember
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
trait ASTNode extends StObject
object ASTNode {
  
  @scala.inline
  def AnyTypeAnnotation(`type`: typings.astTypes.astTypesStrings.AnyTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation]
  }
  
  @scala.inline
  def ArrayExpression(
    elements: js.Array[ExpressionKind | SpreadElementKind | RestElementKind | Null],
    `type`: typings.astTypes.astTypesStrings.ArrayExpression
  ): typings.astTypes.namedTypesMod.namedTypes.ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ArrayExpression]
  }
  
  @scala.inline
  def ArrayPattern(
    elements: js.Array[PatternKind | SpreadElementKind | Null],
    `type`: typings.astTypes.astTypesStrings.ArrayPattern
  ): typings.astTypes.namedTypesMod.namedTypes.ArrayPattern = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ArrayPattern]
  }
  
  @scala.inline
  def ArrayTypeAnnotation(elementType: FlowTypeKind, `type`: typings.astTypes.astTypesStrings.ArrayTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation]
  }
  
  @scala.inline
  def ArrowFunctionExpression(
    body: BlockStatementKind | ExpressionKind,
    params: js.Array[PatternKind],
    `type`: typings.astTypes.astTypesStrings.ArrowFunctionExpression
  ): typings.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression]
  }
  
  @scala.inline
  def AssignmentExpression(
    left: PatternKind | MemberExpressionKind,
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign | AsteriskAsteriskEqualssign,
    right: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.AssignmentExpression
  ): typings.astTypes.namedTypesMod.namedTypes.AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.AssignmentExpression]
  }
  
  @scala.inline
  def AssignmentPattern(
    left: PatternKind,
    right: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.AssignmentPattern
  ): typings.astTypes.namedTypesMod.namedTypes.AssignmentPattern = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.AssignmentPattern]
  }
  
  @scala.inline
  def AwaitExpression(`type`: typings.astTypes.astTypesStrings.AwaitExpression): typings.astTypes.namedTypesMod.namedTypes.AwaitExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.AwaitExpression]
  }
  
  @scala.inline
  def BigIntLiteral(`type`: typings.astTypes.astTypesStrings.BigIntLiteral, value: String | Double): typings.astTypes.namedTypesMod.namedTypes.BigIntLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BigIntLiteral]
  }
  
  @scala.inline
  def BigIntLiteralTypeAnnotation(raw: String, `type`: typings.astTypes.astTypesStrings.BigIntLiteralTypeAnnotation, value: Null): typings.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation]
  }
  
  @scala.inline
  def BigIntTypeAnnotation(`type`: typings.astTypes.astTypesStrings.BigIntTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation]
  }
  
  @scala.inline
  def BinaryExpression(
    left: ExpressionKind,
    operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | Ampersand | Verticalline | typings.astTypes.astTypesStrings.^ | in | instanceof | AsteriskAsterisk,
    right: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.BinaryExpression
  ): typings.astTypes.namedTypesMod.namedTypes.BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BinaryExpression]
  }
  
  @scala.inline
  def BindExpression(callee: ExpressionKind, `type`: typings.astTypes.astTypesStrings.BindExpression): typings.astTypes.namedTypesMod.namedTypes.BindExpression = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BindExpression]
  }
  
  @scala.inline
  def Block(`type`: typings.astTypes.astTypesStrings.Block, value: String): typings.astTypes.namedTypesMod.namedTypes.Block = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Block]
  }
  
  @scala.inline
  def BlockStatement(body: js.Array[StatementKind], `type`: typings.astTypes.astTypesStrings.BlockStatement): typings.astTypes.namedTypesMod.namedTypes.BlockStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BlockStatement]
  }
  
  @scala.inline
  def BooleanLiteral(`type`: typings.astTypes.astTypesStrings.BooleanLiteral, value: Boolean): typings.astTypes.namedTypesMod.namedTypes.BooleanLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BooleanLiteral]
  }
  
  @scala.inline
  def BooleanLiteralTypeAnnotation(raw: String, `type`: typings.astTypes.astTypesStrings.BooleanLiteralTypeAnnotation, value: Boolean): typings.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation]
  }
  
  @scala.inline
  def BooleanTypeAnnotation(`type`: typings.astTypes.astTypesStrings.BooleanTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation]
  }
  
  @scala.inline
  def BreakStatement(`type`: typings.astTypes.astTypesStrings.BreakStatement): typings.astTypes.namedTypesMod.namedTypes.BreakStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.BreakStatement]
  }
  
  @scala.inline
  def CallExpression(
    arguments: js.Array[ExpressionKind | SpreadElementKind],
    callee: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.CallExpression
  ): typings.astTypes.namedTypesMod.namedTypes.CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.CallExpression]
  }
  
  @scala.inline
  def CatchClause(body: BlockStatementKind, `type`: typings.astTypes.astTypesStrings.CatchClause): typings.astTypes.namedTypesMod.namedTypes.CatchClause = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.CatchClause]
  }
  
  @scala.inline
  def ChainExpression(expression: ChainElementKind, `type`: typings.astTypes.astTypesStrings.ChainExpression): typings.astTypes.namedTypesMod.namedTypes.ChainExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ChainExpression]
  }
  
  @scala.inline
  def ClassBody(
    body: js.Array[
      MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind | ClassPrivatePropertyKind | ClassMethodKind | ClassPrivateMethodKind | TSDeclareMethodKind | TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ],
    `type`: typings.astTypes.astTypesStrings.ClassBody
  ): typings.astTypes.namedTypesMod.namedTypes.ClassBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ClassBody]
  }
  
  @scala.inline
  def ClassDeclaration(body: ClassBodyKind, `type`: typings.astTypes.astTypesStrings.ClassDeclaration): typings.astTypes.namedTypesMod.namedTypes.ClassDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ClassDeclaration]
  }
  
  @scala.inline
  def ClassExpression(body: ClassBodyKind, `type`: typings.astTypes.astTypesStrings.ClassExpression): typings.astTypes.namedTypesMod.namedTypes.ClassExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ClassExpression]
  }
  
  @scala.inline
  def ClassImplements(id: IdentifierKind, `type`: typings.astTypes.astTypesStrings.ClassImplements): typings.astTypes.namedTypesMod.namedTypes.ClassImplements = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ClassImplements]
  }
  
  @scala.inline
  def ClassMethod(
    body: BlockStatementKind,
    key: LiteralKind | IdentifierKind | ExpressionKind,
    params: js.Array[PatternKind],
    `type`: typings.astTypes.astTypesStrings.ClassMethod
  ): typings.astTypes.namedTypesMod.namedTypes.ClassMethod = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ClassMethod]
  }
  
  @scala.inline
  def ClassPrivateMethod(
    body: BlockStatementKind,
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    `type`: typings.astTypes.astTypesStrings.ClassPrivateMethod
  ): typings.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod]
  }
  
  @scala.inline
  def ClassPrivateProperty(key: PrivateNameKind, `type`: typings.astTypes.astTypesStrings.ClassPrivateProperty): typings.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty]
  }
  
  @scala.inline
  def ClassProperty(
    key: LiteralKind | IdentifierKind | ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.ClassProperty
  ): typings.astTypes.namedTypesMod.namedTypes.ClassProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ClassProperty]
  }
  
  @scala.inline
  def ClassPropertyDefinition(
    definition: MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind,
    `type`: typings.astTypes.astTypesStrings.ClassPropertyDefinition
  ): typings.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition]
  }
  
  @scala.inline
  def CommentBlock(`type`: typings.astTypes.astTypesStrings.CommentBlock, value: String): typings.astTypes.namedTypesMod.namedTypes.CommentBlock = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.CommentBlock]
  }
  
  @scala.inline
  def CommentLine(`type`: typings.astTypes.astTypesStrings.CommentLine, value: String): typings.astTypes.namedTypesMod.namedTypes.CommentLine = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.CommentLine]
  }
  
  @scala.inline
  def ComprehensionBlock(
    each: Boolean,
    left: PatternKind,
    right: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.ComprehensionBlock
  ): typings.astTypes.namedTypesMod.namedTypes.ComprehensionBlock = {
    val __obj = js.Dynamic.literal(each = each.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ComprehensionBlock]
  }
  
  @scala.inline
  def ComprehensionExpression(
    blocks: js.Array[ComprehensionBlockKind],
    body: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.ComprehensionExpression
  ): typings.astTypes.namedTypesMod.namedTypes.ComprehensionExpression = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ComprehensionExpression]
  }
  
  @scala.inline
  def ConditionalExpression(
    alternate: ExpressionKind,
    consequent: ExpressionKind,
    test: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.ConditionalExpression
  ): typings.astTypes.namedTypesMod.namedTypes.ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ConditionalExpression]
  }
  
  @scala.inline
  def ContinueStatement(`type`: typings.astTypes.astTypesStrings.ContinueStatement): typings.astTypes.namedTypesMod.namedTypes.ContinueStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ContinueStatement]
  }
  
  @scala.inline
  def DebuggerStatement(`type`: typings.astTypes.astTypesStrings.DebuggerStatement): typings.astTypes.namedTypesMod.namedTypes.DebuggerStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DebuggerStatement]
  }
  
  @scala.inline
  def DeclareClass(
    body: ObjectTypeAnnotationKind,
    `extends`: js.Array[InterfaceExtendsKind],
    id: IdentifierKind,
    `type`: typings.astTypes.astTypesStrings.DeclareClass
  ): typings.astTypes.namedTypesMod.namedTypes.DeclareClass = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DeclareClass]
  }
  
  @scala.inline
  def DeclareExportAllDeclaration(`type`: typings.astTypes.astTypesStrings.DeclareExportAllDeclaration): typings.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration]
  }
  
  @scala.inline
  def DeclareExportDeclaration(default: Boolean, `type`: typings.astTypes.astTypesStrings.DeclareExportDeclaration): typings.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration]
  }
  
  @scala.inline
  def DeclareFunction(id: IdentifierKind, `type`: typings.astTypes.astTypesStrings.DeclareFunction): typings.astTypes.namedTypesMod.namedTypes.DeclareFunction = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DeclareFunction]
  }
  
  @scala.inline
  def DeclareInterface(
    body: ObjectTypeAnnotationKind,
    `extends`: js.Array[InterfaceExtendsKind],
    id: IdentifierKind,
    `type`: typings.astTypes.astTypesStrings.DeclareInterface
  ): typings.astTypes.namedTypesMod.namedTypes.DeclareInterface = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DeclareInterface]
  }
  
  @scala.inline
  def DeclareModule(
    body: BlockStatementKind,
    id: IdentifierKind | LiteralKind,
    `type`: typings.astTypes.astTypesStrings.DeclareModule
  ): typings.astTypes.namedTypesMod.namedTypes.DeclareModule = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DeclareModule]
  }
  
  @scala.inline
  def DeclareModuleExports(`type`: typings.astTypes.astTypesStrings.DeclareModuleExports, typeAnnotation: TypeAnnotationKind): typings.astTypes.namedTypesMod.namedTypes.DeclareModuleExports = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DeclareModuleExports]
  }
  
  @scala.inline
  def DeclareOpaqueType(id: IdentifierKind, `type`: typings.astTypes.astTypesStrings.DeclareOpaqueType): typings.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType]
  }
  
  @scala.inline
  def DeclareTypeAlias(id: IdentifierKind, right: FlowTypeKind, `type`: typings.astTypes.astTypesStrings.DeclareTypeAlias): typings.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias]
  }
  
  @scala.inline
  def DeclareVariable(id: IdentifierKind, `type`: typings.astTypes.astTypesStrings.DeclareVariable): typings.astTypes.namedTypesMod.namedTypes.DeclareVariable = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DeclareVariable]
  }
  
  @scala.inline
  def DeclaredPredicate(`type`: typings.astTypes.astTypesStrings.DeclaredPredicate, value: ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.DeclaredPredicate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DeclaredPredicate]
  }
  
  @scala.inline
  def Decorator(expression: ExpressionKind, `type`: typings.astTypes.astTypesStrings.Decorator): typings.astTypes.namedTypesMod.namedTypes.Decorator = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Decorator]
  }
  
  @scala.inline
  def Directive(`type`: typings.astTypes.astTypesStrings.Directive, value: DirectiveLiteralKind): typings.astTypes.namedTypesMod.namedTypes.Directive = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Directive]
  }
  
  @scala.inline
  def DirectiveLiteral(`type`: typings.astTypes.astTypesStrings.DirectiveLiteral): typings.astTypes.namedTypesMod.namedTypes.DirectiveLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DirectiveLiteral]
  }
  
  @scala.inline
  def DoExpression(body: js.Array[StatementKind], `type`: typings.astTypes.astTypesStrings.DoExpression): typings.astTypes.namedTypesMod.namedTypes.DoExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DoExpression]
  }
  
  @scala.inline
  def DoWhileStatement(
    body: StatementKind,
    test: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.DoWhileStatement
  ): typings.astTypes.namedTypesMod.namedTypes.DoWhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DoWhileStatement]
  }
  
  @scala.inline
  def EmptyStatement(`type`: typings.astTypes.astTypesStrings.EmptyStatement): typings.astTypes.namedTypesMod.namedTypes.EmptyStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.EmptyStatement]
  }
  
  @scala.inline
  def EmptyTypeAnnotation(`type`: typings.astTypes.astTypesStrings.EmptyTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation]
  }
  
  @scala.inline
  def EnumBooleanBody(
    explicitType: Boolean,
    members: js.Array[EnumBooleanMemberKind],
    `type`: typings.astTypes.astTypesStrings.EnumBooleanBody
  ): typings.astTypes.namedTypesMod.namedTypes.EnumBooleanBody = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.EnumBooleanBody]
  }
  
  @scala.inline
  def EnumBooleanMember(
    id: IdentifierKind,
    init: LiteralKind | Boolean,
    `type`: typings.astTypes.astTypesStrings.EnumBooleanMember
  ): typings.astTypes.namedTypesMod.namedTypes.EnumBooleanMember = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.EnumBooleanMember]
  }
  
  @scala.inline
  def EnumDeclaration(
    body: EnumBooleanBodyKind | EnumNumberBodyKind | EnumStringBodyKind | EnumSymbolBodyKind,
    id: IdentifierKind,
    `type`: typings.astTypes.astTypesStrings.EnumDeclaration
  ): typings.astTypes.namedTypesMod.namedTypes.EnumDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.EnumDeclaration]
  }
  
  @scala.inline
  def EnumDefaultedMember(id: IdentifierKind, `type`: typings.astTypes.astTypesStrings.EnumDefaultedMember): typings.astTypes.namedTypesMod.namedTypes.EnumDefaultedMember = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.EnumDefaultedMember]
  }
  
  @scala.inline
  def EnumNumberBody(
    explicitType: Boolean,
    members: js.Array[EnumNumberMemberKind],
    `type`: typings.astTypes.astTypesStrings.EnumNumberBody
  ): typings.astTypes.namedTypesMod.namedTypes.EnumNumberBody = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.EnumNumberBody]
  }
  
  @scala.inline
  def EnumNumberMember(id: IdentifierKind, init: LiteralKind, `type`: typings.astTypes.astTypesStrings.EnumNumberMember): typings.astTypes.namedTypesMod.namedTypes.EnumNumberMember = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.EnumNumberMember]
  }
  
  @scala.inline
  def EnumStringBody(
    explicitType: Boolean,
    members: js.Array[EnumDefaultedMemberKind | EnumStringMemberKind],
    `type`: typings.astTypes.astTypesStrings.EnumStringBody
  ): typings.astTypes.namedTypesMod.namedTypes.EnumStringBody = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.EnumStringBody]
  }
  
  @scala.inline
  def EnumStringMember(id: IdentifierKind, init: LiteralKind, `type`: typings.astTypes.astTypesStrings.EnumStringMember): typings.astTypes.namedTypesMod.namedTypes.EnumStringMember = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.EnumStringMember]
  }
  
  @scala.inline
  def EnumSymbolBody(
    members: js.Array[EnumDefaultedMemberKind],
    `type`: typings.astTypes.astTypesStrings.EnumSymbolBody
  ): typings.astTypes.namedTypesMod.namedTypes.EnumSymbolBody = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.EnumSymbolBody]
  }
  
  @scala.inline
  def ExistentialTypeParam(`type`: typings.astTypes.astTypesStrings.ExistentialTypeParam): typings.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam]
  }
  
  @scala.inline
  def ExistsTypeAnnotation(`type`: typings.astTypes.astTypesStrings.ExistsTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation]
  }
  
  @scala.inline
  def ExportAllDeclaration(source: LiteralKind, `type`: typings.astTypes.astTypesStrings.ExportAllDeclaration): typings.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration]
  }
  
  @scala.inline
  def ExportBatchSpecifier(`type`: typings.astTypes.astTypesStrings.ExportBatchSpecifier): typings.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier]
  }
  
  @scala.inline
  def ExportDeclaration(default: Boolean, `type`: typings.astTypes.astTypesStrings.ExportDeclaration): typings.astTypes.namedTypesMod.namedTypes.ExportDeclaration = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ExportDeclaration]
  }
  
  @scala.inline
  def ExportDefaultDeclaration(
    declaration: DeclarationKind | ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.ExportDefaultDeclaration
  ): typings.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration]
  }
  
  @scala.inline
  def ExportDefaultSpecifier(exported: IdentifierKind, `type`: typings.astTypes.astTypesStrings.ExportDefaultSpecifier): typings.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier]
  }
  
  @scala.inline
  def ExportNamedDeclaration(`type`: typings.astTypes.astTypesStrings.ExportNamedDeclaration): typings.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration]
  }
  
  @scala.inline
  def ExportNamespaceSpecifier(exported: IdentifierKind, `type`: typings.astTypes.astTypesStrings.ExportNamespaceSpecifier): typings.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier]
  }
  
  @scala.inline
  def ExportSpecifier(exported: IdentifierKind, `type`: typings.astTypes.astTypesStrings.ExportSpecifier): typings.astTypes.namedTypesMod.namedTypes.ExportSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ExportSpecifier]
  }
  
  @scala.inline
  def ExpressionStatement(expression: ExpressionKind, `type`: typings.astTypes.astTypesStrings.ExpressionStatement): typings.astTypes.namedTypesMod.namedTypes.ExpressionStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ExpressionStatement]
  }
  
  @scala.inline
  def File(program: ProgramKind, `type`: typings.astTypes.astTypesStrings.File): typings.astTypes.namedTypesMod.namedTypes.File = {
    val __obj = js.Dynamic.literal(program = program.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.File]
  }
  
  @scala.inline
  def ForAwaitStatement(
    body: StatementKind,
    left: VariableDeclarationKind | ExpressionKind,
    right: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.ForAwaitStatement
  ): typings.astTypes.namedTypesMod.namedTypes.ForAwaitStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ForAwaitStatement]
  }
  
  @scala.inline
  def ForInStatement(
    body: StatementKind,
    left: VariableDeclarationKind | ExpressionKind,
    right: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.ForInStatement
  ): typings.astTypes.namedTypesMod.namedTypes.ForInStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ForInStatement]
  }
  
  @scala.inline
  def ForOfStatement(
    body: StatementKind,
    left: VariableDeclarationKind | PatternKind,
    right: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.ForOfStatement
  ): typings.astTypes.namedTypesMod.namedTypes.ForOfStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ForOfStatement]
  }
  
  @scala.inline
  def ForStatement(body: StatementKind, `type`: typings.astTypes.astTypesStrings.ForStatement): typings.astTypes.namedTypesMod.namedTypes.ForStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ForStatement]
  }
  
  @scala.inline
  def FunctionDeclaration(
    body: BlockStatementKind,
    params: js.Array[PatternKind],
    `type`: typings.astTypes.astTypesStrings.FunctionDeclaration
  ): typings.astTypes.namedTypesMod.namedTypes.FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.FunctionDeclaration]
  }
  
  @scala.inline
  def FunctionExpression(
    body: BlockStatementKind,
    params: js.Array[PatternKind],
    `type`: typings.astTypes.astTypesStrings.FunctionExpression
  ): typings.astTypes.namedTypesMod.namedTypes.FunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.FunctionExpression]
  }
  
  @scala.inline
  def FunctionTypeAnnotation(
    params: js.Array[FunctionTypeParamKind],
    returnType: FlowTypeKind,
    `type`: typings.astTypes.astTypesStrings.FunctionTypeAnnotation
  ): typings.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation]
  }
  
  @scala.inline
  def FunctionTypeParam(
    optional: Boolean,
    `type`: typings.astTypes.astTypesStrings.FunctionTypeParam,
    typeAnnotation: FlowTypeKind
  ): typings.astTypes.namedTypesMod.namedTypes.FunctionTypeParam = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.FunctionTypeParam]
  }
  
  @scala.inline
  def GeneratorExpression(
    blocks: js.Array[ComprehensionBlockKind],
    body: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.GeneratorExpression
  ): typings.astTypes.namedTypesMod.namedTypes.GeneratorExpression = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.GeneratorExpression]
  }
  
  @scala.inline
  def GenericTypeAnnotation(
    id: IdentifierKind | QualifiedTypeIdentifierKind,
    `type`: typings.astTypes.astTypesStrings.GenericTypeAnnotation
  ): typings.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation]
  }
  
  @scala.inline
  def Identifier(name: String, `type`: typings.astTypes.astTypesStrings.Identifier): typings.astTypes.namedTypesMod.namedTypes.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Identifier]
  }
  
  @scala.inline
  def IfStatement(
    consequent: StatementKind,
    test: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.IfStatement
  ): typings.astTypes.namedTypesMod.namedTypes.IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.IfStatement]
  }
  
  @scala.inline
  def Import(`type`: typings.astTypes.astTypesStrings.Import): typings.astTypes.namedTypesMod.namedTypes.Import = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Import]
  }
  
  @scala.inline
  def ImportDeclaration(source: LiteralKind, `type`: typings.astTypes.astTypesStrings.ImportDeclaration): typings.astTypes.namedTypesMod.namedTypes.ImportDeclaration = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ImportDeclaration]
  }
  
  @scala.inline
  def ImportDefaultSpecifier(`type`: typings.astTypes.astTypesStrings.ImportDefaultSpecifier): typings.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier]
  }
  
  @scala.inline
  def ImportExpression(source: ExpressionKind, `type`: typings.astTypes.astTypesStrings.ImportExpression): typings.astTypes.namedTypesMod.namedTypes.ImportExpression = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ImportExpression]
  }
  
  @scala.inline
  def ImportNamespaceSpecifier(`type`: typings.astTypes.astTypesStrings.ImportNamespaceSpecifier): typings.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier]
  }
  
  @scala.inline
  def ImportSpecifier(imported: IdentifierKind, `type`: typings.astTypes.astTypesStrings.ImportSpecifier): typings.astTypes.namedTypesMod.namedTypes.ImportSpecifier = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ImportSpecifier]
  }
  
  @scala.inline
  def InferredPredicate(`type`: typings.astTypes.astTypesStrings.InferredPredicate): typings.astTypes.namedTypesMod.namedTypes.InferredPredicate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.InferredPredicate]
  }
  
  @scala.inline
  def InterfaceDeclaration(
    body: ObjectTypeAnnotationKind,
    `extends`: js.Array[InterfaceExtendsKind],
    id: IdentifierKind,
    `type`: typings.astTypes.astTypesStrings.InterfaceDeclaration
  ): typings.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration]
  }
  
  @scala.inline
  def InterfaceExtends(id: IdentifierKind, `type`: typings.astTypes.astTypesStrings.InterfaceExtends): typings.astTypes.namedTypesMod.namedTypes.InterfaceExtends = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.InterfaceExtends]
  }
  
  @scala.inline
  def InterfaceTypeAnnotation(body: ObjectTypeAnnotationKind, `type`: typings.astTypes.astTypesStrings.InterfaceTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation]
  }
  
  @scala.inline
  def InterpreterDirective(`type`: typings.astTypes.astTypesStrings.InterpreterDirective, value: String): typings.astTypes.namedTypesMod.namedTypes.InterpreterDirective = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.InterpreterDirective]
  }
  
  @scala.inline
  def IntersectionTypeAnnotation(`type`: typings.astTypes.astTypesStrings.IntersectionTypeAnnotation, types: js.Array[FlowTypeKind]): typings.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation]
  }
  
  @scala.inline
  def JSXAttribute(
    name: JSXIdentifierKind | JSXNamespacedNameKind,
    `type`: typings.astTypes.astTypesStrings.JSXAttribute
  ): typings.astTypes.namedTypesMod.namedTypes.JSXAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXAttribute]
  }
  
  @scala.inline
  def JSXClosingElement(
    name: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind,
    `type`: typings.astTypes.astTypesStrings.JSXClosingElement
  ): typings.astTypes.namedTypesMod.namedTypes.JSXClosingElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXClosingElement]
  }
  
  @scala.inline
  def JSXClosingFragment(`type`: typings.astTypes.astTypesStrings.JSXClosingFragment): typings.astTypes.namedTypesMod.namedTypes.JSXClosingFragment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXClosingFragment]
  }
  
  @scala.inline
  def JSXElement(openingElement: JSXOpeningElementKind, `type`: typings.astTypes.astTypesStrings.JSXElement): typings.astTypes.namedTypesMod.namedTypes.JSXElement = {
    val __obj = js.Dynamic.literal(openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXElement]
  }
  
  @scala.inline
  def JSXEmptyExpression(`type`: typings.astTypes.astTypesStrings.JSXEmptyExpression): typings.astTypes.namedTypesMod.namedTypes.JSXEmptyExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXEmptyExpression]
  }
  
  @scala.inline
  def JSXExpressionContainer(
    expression: ExpressionKind | JSXEmptyExpressionKind,
    `type`: typings.astTypes.astTypesStrings.JSXExpressionContainer
  ): typings.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer]
  }
  
  @scala.inline
  def JSXFragment(
    closingFragment: JSXClosingFragmentKind,
    openingFragment: JSXOpeningFragmentKind,
    `type`: typings.astTypes.astTypesStrings.JSXFragment
  ): typings.astTypes.namedTypesMod.namedTypes.JSXFragment = {
    val __obj = js.Dynamic.literal(closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXFragment]
  }
  
  @scala.inline
  def JSXIdentifier(name: String, `type`: typings.astTypes.astTypesStrings.JSXIdentifier): typings.astTypes.namedTypesMod.namedTypes.JSXIdentifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXIdentifier]
  }
  
  @scala.inline
  def JSXMemberExpression(
    `object`: JSXIdentifierKind | JSXMemberExpressionKind,
    property: JSXIdentifierKind,
    `type`: typings.astTypes.astTypesStrings.JSXMemberExpression
  ): typings.astTypes.namedTypesMod.namedTypes.JSXMemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXMemberExpression]
  }
  
  @scala.inline
  def JSXNamespacedName(
    name: JSXIdentifierKind,
    namespace: JSXIdentifierKind,
    `type`: typings.astTypes.astTypesStrings.JSXNamespacedName
  ): typings.astTypes.namedTypesMod.namedTypes.JSXNamespacedName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXNamespacedName]
  }
  
  @scala.inline
  def JSXOpeningElement(
    name: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind,
    `type`: typings.astTypes.astTypesStrings.JSXOpeningElement
  ): typings.astTypes.namedTypesMod.namedTypes.JSXOpeningElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXOpeningElement]
  }
  
  @scala.inline
  def JSXOpeningFragment(`type`: typings.astTypes.astTypesStrings.JSXOpeningFragment): typings.astTypes.namedTypesMod.namedTypes.JSXOpeningFragment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXOpeningFragment]
  }
  
  @scala.inline
  def JSXSpreadAttribute(argument: ExpressionKind, `type`: typings.astTypes.astTypesStrings.JSXSpreadAttribute): typings.astTypes.namedTypesMod.namedTypes.JSXSpreadAttribute = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXSpreadAttribute]
  }
  
  @scala.inline
  def JSXSpreadChild(expression: ExpressionKind, `type`: typings.astTypes.astTypesStrings.JSXSpreadChild): typings.astTypes.namedTypesMod.namedTypes.JSXSpreadChild = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXSpreadChild]
  }
  
  @scala.inline
  def JSXText(`type`: typings.astTypes.astTypesStrings.JSXText, value: String): typings.astTypes.namedTypesMod.namedTypes.JSXText = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXText]
  }
  
  @scala.inline
  def LabeledStatement(
    body: StatementKind,
    label: IdentifierKind,
    `type`: typings.astTypes.astTypesStrings.LabeledStatement
  ): typings.astTypes.namedTypesMod.namedTypes.LabeledStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.LabeledStatement]
  }
  
  @scala.inline
  def Line(`type`: typings.astTypes.astTypesStrings.Line, value: String): typings.astTypes.namedTypesMod.namedTypes.Line = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Line]
  }
  
  @scala.inline
  def Literal(`type`: typings.astTypes.astTypesStrings.Literal): typings.astTypes.namedTypesMod.namedTypes.Literal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Literal]
  }
  
  @scala.inline
  def LogicalExpression(
    left: ExpressionKind,
    operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark,
    right: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.LogicalExpression
  ): typings.astTypes.namedTypesMod.namedTypes.LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.LogicalExpression]
  }
  
  @scala.inline
  def MemberExpression(
    `object`: ExpressionKind,
    property: IdentifierKind | ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.MemberExpression
  ): typings.astTypes.namedTypesMod.namedTypes.MemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.MemberExpression]
  }
  
  @scala.inline
  def MemberTypeAnnotation(
    `object`: IdentifierKind,
    property: MemberTypeAnnotationKind | GenericTypeAnnotationKind,
    `type`: typings.astTypes.astTypesStrings.MemberTypeAnnotation
  ): typings.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation]
  }
  
  @scala.inline
  def MetaProperty(
    meta: IdentifierKind,
    property: IdentifierKind,
    `type`: typings.astTypes.astTypesStrings.MetaProperty
  ): typings.astTypes.namedTypesMod.namedTypes.MetaProperty = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.MetaProperty]
  }
  
  @scala.inline
  def MethodDefinition(
    key: ExpressionKind,
    kind: constructor | method | get | set,
    `type`: typings.astTypes.astTypesStrings.MethodDefinition,
    value: FunctionKind
  ): typings.astTypes.namedTypesMod.namedTypes.MethodDefinition = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.MethodDefinition]
  }
  
  @scala.inline
  def MixedTypeAnnotation(`type`: typings.astTypes.astTypesStrings.MixedTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation]
  }
  
  @scala.inline
  def NewExpression(
    arguments: js.Array[ExpressionKind | SpreadElementKind],
    callee: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.NewExpression
  ): typings.astTypes.namedTypesMod.namedTypes.NewExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NewExpression]
  }
  
  @scala.inline
  def Noop(`type`: typings.astTypes.astTypesStrings.Noop): typings.astTypes.namedTypesMod.namedTypes.Noop = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Noop]
  }
  
  @scala.inline
  def NullLiteral(`type`: typings.astTypes.astTypesStrings.NullLiteral): typings.astTypes.namedTypesMod.namedTypes.NullLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NullLiteral]
  }
  
  @scala.inline
  def NullLiteralTypeAnnotation(`type`: typings.astTypes.astTypesStrings.NullLiteralTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation]
  }
  
  @scala.inline
  def NullTypeAnnotation(`type`: typings.astTypes.astTypesStrings.NullTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation]
  }
  
  @scala.inline
  def NullableTypeAnnotation(`type`: typings.astTypes.astTypesStrings.NullableTypeAnnotation, typeAnnotation: FlowTypeKind): typings.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation]
  }
  
  @scala.inline
  def NumberLiteralTypeAnnotation(raw: String, `type`: typings.astTypes.astTypesStrings.NumberLiteralTypeAnnotation, value: Double): typings.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation]
  }
  
  @scala.inline
  def NumberTypeAnnotation(`type`: typings.astTypes.astTypesStrings.NumberTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation]
  }
  
  @scala.inline
  def NumericLiteral(`type`: typings.astTypes.astTypesStrings.NumericLiteral, value: Double): typings.astTypes.namedTypesMod.namedTypes.NumericLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NumericLiteral]
  }
  
  @scala.inline
  def NumericLiteralTypeAnnotation(raw: String, `type`: typings.astTypes.astTypesStrings.NumericLiteralTypeAnnotation, value: Double): typings.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation]
  }
  
  @scala.inline
  def ObjectExpression(
    properties: js.Array[
      PropertyKind | ObjectMethodKind | ObjectPropertyKind | SpreadPropertyKind | SpreadElementKind
    ],
    `type`: typings.astTypes.astTypesStrings.ObjectExpression
  ): typings.astTypes.namedTypesMod.namedTypes.ObjectExpression = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ObjectExpression]
  }
  
  @scala.inline
  def ObjectMethod(
    body: BlockStatementKind,
    key: LiteralKind | IdentifierKind | ExpressionKind,
    kind: method | get | set,
    params: js.Array[PatternKind],
    `type`: typings.astTypes.astTypesStrings.ObjectMethod
  ): typings.astTypes.namedTypesMod.namedTypes.ObjectMethod = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ObjectMethod]
  }
  
  @scala.inline
  def ObjectPattern(
    properties: js.Array[
      PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind
    ],
    `type`: typings.astTypes.astTypesStrings.ObjectPattern
  ): typings.astTypes.namedTypesMod.namedTypes.ObjectPattern = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ObjectPattern]
  }
  
  @scala.inline
  def ObjectProperty(
    key: LiteralKind | IdentifierKind | ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.ObjectProperty,
    value: ExpressionKind | PatternKind
  ): typings.astTypes.namedTypesMod.namedTypes.ObjectProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ObjectProperty]
  }
  
  @scala.inline
  def ObjectTypeAnnotation(
    properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind],
    `type`: typings.astTypes.astTypesStrings.ObjectTypeAnnotation
  ): typings.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation]
  }
  
  @scala.inline
  def ObjectTypeCallProperty(`type`: typings.astTypes.astTypesStrings.ObjectTypeCallProperty, value: FunctionTypeAnnotationKind): typings.astTypes.namedTypesMod.namedTypes.ObjectTypeCallProperty = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ObjectTypeCallProperty]
  }
  
  @scala.inline
  def ObjectTypeIndexer(
    id: IdentifierKind,
    key: FlowTypeKind,
    `type`: typings.astTypes.astTypesStrings.ObjectTypeIndexer,
    value: FlowTypeKind
  ): typings.astTypes.namedTypesMod.namedTypes.ObjectTypeIndexer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ObjectTypeIndexer]
  }
  
  @scala.inline
  def ObjectTypeInternalSlot(
    id: IdentifierKind,
    method: Boolean,
    optional: Boolean,
    static: Boolean,
    `type`: typings.astTypes.astTypesStrings.ObjectTypeInternalSlot,
    value: FlowTypeKind
  ): typings.astTypes.namedTypesMod.namedTypes.ObjectTypeInternalSlot = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ObjectTypeInternalSlot]
  }
  
  @scala.inline
  def ObjectTypeProperty(
    key: LiteralKind | IdentifierKind,
    optional: Boolean,
    `type`: typings.astTypes.astTypesStrings.ObjectTypeProperty,
    value: FlowTypeKind
  ): typings.astTypes.namedTypesMod.namedTypes.ObjectTypeProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ObjectTypeProperty]
  }
  
  @scala.inline
  def ObjectTypeSpreadProperty(argument: FlowTypeKind, `type`: typings.astTypes.astTypesStrings.ObjectTypeSpreadProperty): typings.astTypes.namedTypesMod.namedTypes.ObjectTypeSpreadProperty = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ObjectTypeSpreadProperty]
  }
  
  @scala.inline
  def OpaqueType(id: IdentifierKind, impltype: FlowTypeKind, `type`: typings.astTypes.astTypesStrings.OpaqueType): typings.astTypes.namedTypesMod.namedTypes.OpaqueType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.OpaqueType]
  }
  
  @scala.inline
  def OptionalCallExpression(
    arguments: js.Array[ExpressionKind | SpreadElementKind],
    callee: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.OptionalCallExpression
  ): typings.astTypes.namedTypesMod.namedTypes.OptionalCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.OptionalCallExpression]
  }
  
  @scala.inline
  def OptionalMemberExpression(
    `object`: ExpressionKind,
    property: IdentifierKind | ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.OptionalMemberExpression
  ): typings.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression]
  }
  
  @scala.inline
  def ParenthesizedExpression(expression: ExpressionKind, `type`: typings.astTypes.astTypesStrings.ParenthesizedExpression): typings.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression]
  }
  
  @scala.inline
  def PrivateName(id: IdentifierKind, `type`: typings.astTypes.astTypesStrings.PrivateName): typings.astTypes.namedTypesMod.namedTypes.PrivateName = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.PrivateName]
  }
  
  @scala.inline
  def Program(body: js.Array[StatementKind], `type`: typings.astTypes.astTypesStrings.Program): typings.astTypes.namedTypesMod.namedTypes.Program = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Program]
  }
  
  @scala.inline
  def Property(
    key: LiteralKind | IdentifierKind | ExpressionKind,
    kind: init | get | set,
    `type`: typings.astTypes.astTypesStrings.Property,
    value: ExpressionKind | PatternKind
  ): typings.astTypes.namedTypesMod.namedTypes.Property = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Property]
  }
  
  @scala.inline
  def PropertyPattern(
    key: LiteralKind | IdentifierKind | ExpressionKind,
    pattern: PatternKind,
    `type`: typings.astTypes.astTypesStrings.PropertyPattern
  ): typings.astTypes.namedTypesMod.namedTypes.PropertyPattern = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.PropertyPattern]
  }
  
  @scala.inline
  def QualifiedTypeIdentifier(
    id: IdentifierKind,
    qualification: IdentifierKind | QualifiedTypeIdentifierKind,
    `type`: typings.astTypes.astTypesStrings.QualifiedTypeIdentifier
  ): typings.astTypes.namedTypesMod.namedTypes.QualifiedTypeIdentifier = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], qualification = qualification.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.QualifiedTypeIdentifier]
  }
  
  @scala.inline
  def RegExpLiteral(flags: String, pattern: String, `type`: typings.astTypes.astTypesStrings.RegExpLiteral): typings.astTypes.namedTypesMod.namedTypes.RegExpLiteral = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.RegExpLiteral]
  }
  
  @scala.inline
  def RestElement(argument: PatternKind, `type`: typings.astTypes.astTypesStrings.RestElement): typings.astTypes.namedTypesMod.namedTypes.RestElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.RestElement]
  }
  
  @scala.inline
  def RestProperty(argument: ExpressionKind, `type`: typings.astTypes.astTypesStrings.RestProperty): typings.astTypes.namedTypesMod.namedTypes.RestProperty = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.RestProperty]
  }
  
  @scala.inline
  def ReturnStatement(`type`: typings.astTypes.astTypesStrings.ReturnStatement): typings.astTypes.namedTypesMod.namedTypes.ReturnStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ReturnStatement]
  }
  
  @scala.inline
  def SequenceExpression(expressions: js.Array[ExpressionKind], `type`: typings.astTypes.astTypesStrings.SequenceExpression): typings.astTypes.namedTypesMod.namedTypes.SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.SequenceExpression]
  }
  
  @scala.inline
  def SpreadElement(argument: ExpressionKind, `type`: typings.astTypes.astTypesStrings.SpreadElement): typings.astTypes.namedTypesMod.namedTypes.SpreadElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.SpreadElement]
  }
  
  @scala.inline
  def SpreadElementPattern(argument: PatternKind, `type`: typings.astTypes.astTypesStrings.SpreadElementPattern): typings.astTypes.namedTypesMod.namedTypes.SpreadElementPattern = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.SpreadElementPattern]
  }
  
  @scala.inline
  def SpreadProperty(argument: ExpressionKind, `type`: typings.astTypes.astTypesStrings.SpreadProperty): typings.astTypes.namedTypesMod.namedTypes.SpreadProperty = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.SpreadProperty]
  }
  
  @scala.inline
  def SpreadPropertyPattern(argument: PatternKind, `type`: typings.astTypes.astTypesStrings.SpreadPropertyPattern): typings.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern]
  }
  
  @scala.inline
  def StringLiteral(`type`: typings.astTypes.astTypesStrings.StringLiteral, value: String): typings.astTypes.namedTypesMod.namedTypes.StringLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.StringLiteral]
  }
  
  @scala.inline
  def StringLiteralTypeAnnotation(raw: String, `type`: typings.astTypes.astTypesStrings.StringLiteralTypeAnnotation, value: String): typings.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation]
  }
  
  @scala.inline
  def StringTypeAnnotation(`type`: typings.astTypes.astTypesStrings.StringTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation]
  }
  
  @scala.inline
  def Super(`type`: typings.astTypes.astTypesStrings.Super): typings.astTypes.namedTypesMod.namedTypes.Super = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Super]
  }
  
  @scala.inline
  def SwitchCase(consequent: js.Array[StatementKind], `type`: typings.astTypes.astTypesStrings.SwitchCase): typings.astTypes.namedTypesMod.namedTypes.SwitchCase = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.SwitchCase]
  }
  
  @scala.inline
  def SwitchStatement(
    cases: js.Array[SwitchCaseKind],
    discriminant: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.SwitchStatement
  ): typings.astTypes.namedTypesMod.namedTypes.SwitchStatement = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.SwitchStatement]
  }
  
  @scala.inline
  def SymbolTypeAnnotation(`type`: typings.astTypes.astTypesStrings.SymbolTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation]
  }
  
  @scala.inline
  def TSAnyKeyword(`type`: typings.astTypes.astTypesStrings.TSAnyKeyword): typings.astTypes.namedTypesMod.namedTypes.TSAnyKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSAnyKeyword]
  }
  
  @scala.inline
  def TSArrayType(elementType: TSTypeKind, `type`: typings.astTypes.astTypesStrings.TSArrayType): typings.astTypes.namedTypesMod.namedTypes.TSArrayType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSArrayType]
  }
  
  @scala.inline
  def TSAsExpression(
    expression: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.TSAsExpression,
    typeAnnotation: TSTypeKind
  ): typings.astTypes.namedTypesMod.namedTypes.TSAsExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSAsExpression]
  }
  
  @scala.inline
  def TSBigIntKeyword(`type`: typings.astTypes.astTypesStrings.TSBigIntKeyword): typings.astTypes.namedTypesMod.namedTypes.TSBigIntKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSBigIntKeyword]
  }
  
  @scala.inline
  def TSBooleanKeyword(`type`: typings.astTypes.astTypesStrings.TSBooleanKeyword): typings.astTypes.namedTypesMod.namedTypes.TSBooleanKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSBooleanKeyword]
  }
  
  @scala.inline
  def TSCallSignatureDeclaration(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typings.astTypes.astTypesStrings.TSCallSignatureDeclaration
  ): typings.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration]
  }
  
  @scala.inline
  def TSConditionalType(
    checkType: TSTypeKind,
    extendsType: TSTypeKind,
    falseType: TSTypeKind,
    trueType: TSTypeKind,
    `type`: typings.astTypes.astTypesStrings.TSConditionalType
  ): typings.astTypes.namedTypesMod.namedTypes.TSConditionalType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSConditionalType]
  }
  
  @scala.inline
  def TSConstructSignatureDeclaration(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typings.astTypes.astTypesStrings.TSConstructSignatureDeclaration
  ): typings.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration]
  }
  
  @scala.inline
  def TSConstructorType(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typings.astTypes.astTypesStrings.TSConstructorType
  ): typings.astTypes.namedTypesMod.namedTypes.TSConstructorType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSConstructorType]
  }
  
  @scala.inline
  def TSDeclareFunction(params: js.Array[PatternKind], `type`: typings.astTypes.astTypesStrings.TSDeclareFunction): typings.astTypes.namedTypesMod.namedTypes.TSDeclareFunction = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSDeclareFunction]
  }
  
  @scala.inline
  def TSDeclareMethod(
    key: IdentifierKind | StringLiteralKind | NumericLiteralKind | ExpressionKind,
    params: js.Array[PatternKind],
    `type`: typings.astTypes.astTypesStrings.TSDeclareMethod
  ): typings.astTypes.namedTypesMod.namedTypes.TSDeclareMethod = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSDeclareMethod]
  }
  
  @scala.inline
  def TSEnumDeclaration(
    id: IdentifierKind,
    members: js.Array[TSEnumMemberKind],
    `type`: typings.astTypes.astTypesStrings.TSEnumDeclaration
  ): typings.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration]
  }
  
  @scala.inline
  def TSEnumMember(id: IdentifierKind | StringLiteralKind, `type`: typings.astTypes.astTypesStrings.TSEnumMember): typings.astTypes.namedTypesMod.namedTypes.TSEnumMember = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSEnumMember]
  }
  
  @scala.inline
  def TSExportAssignment(expression: ExpressionKind, `type`: typings.astTypes.astTypesStrings.TSExportAssignment): typings.astTypes.namedTypesMod.namedTypes.TSExportAssignment = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSExportAssignment]
  }
  
  @scala.inline
  def TSExpressionWithTypeArguments(
    expression: IdentifierKind | TSQualifiedNameKind,
    `type`: typings.astTypes.astTypesStrings.TSExpressionWithTypeArguments
  ): typings.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments]
  }
  
  @scala.inline
  def TSExternalModuleReference(expression: StringLiteralKind, `type`: typings.astTypes.astTypesStrings.TSExternalModuleReference): typings.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference]
  }
  
  @scala.inline
  def TSFunctionType(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typings.astTypes.astTypesStrings.TSFunctionType
  ): typings.astTypes.namedTypesMod.namedTypes.TSFunctionType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSFunctionType]
  }
  
  @scala.inline
  def TSImportEqualsDeclaration(
    id: IdentifierKind,
    moduleReference: IdentifierKind | TSQualifiedNameKind | TSExternalModuleReferenceKind,
    `type`: typings.astTypes.astTypesStrings.TSImportEqualsDeclaration
  ): typings.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], moduleReference = moduleReference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration]
  }
  
  @scala.inline
  def TSImportType(argument: StringLiteralKind, `type`: typings.astTypes.astTypesStrings.TSImportType): typings.astTypes.namedTypesMod.namedTypes.TSImportType = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSImportType]
  }
  
  @scala.inline
  def TSIndexSignature(parameters: js.Array[IdentifierKind], `type`: typings.astTypes.astTypesStrings.TSIndexSignature): typings.astTypes.namedTypesMod.namedTypes.TSIndexSignature = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSIndexSignature]
  }
  
  @scala.inline
  def TSIndexedAccessType(
    indexType: TSTypeKind,
    objectType: TSTypeKind,
    `type`: typings.astTypes.astTypesStrings.TSIndexedAccessType
  ): typings.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType]
  }
  
  @scala.inline
  def TSInferType(`type`: typings.astTypes.astTypesStrings.TSInferType, typeParameter: TSTypeParameterKind): typings.astTypes.namedTypesMod.namedTypes.TSInferType = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSInferType]
  }
  
  @scala.inline
  def TSInterfaceBody(
    body: js.Array[
      TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ],
    `type`: typings.astTypes.astTypesStrings.TSInterfaceBody
  ): typings.astTypes.namedTypesMod.namedTypes.TSInterfaceBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSInterfaceBody]
  }
  
  @scala.inline
  def TSInterfaceDeclaration(
    body: TSInterfaceBodyKind,
    id: IdentifierKind | TSQualifiedNameKind,
    `type`: typings.astTypes.astTypesStrings.TSInterfaceDeclaration
  ): typings.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration]
  }
  
  @scala.inline
  def TSIntersectionType(`type`: typings.astTypes.astTypesStrings.TSIntersectionType, types: js.Array[TSTypeKind]): typings.astTypes.namedTypesMod.namedTypes.TSIntersectionType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSIntersectionType]
  }
  
  @scala.inline
  def TSLiteralType(
    literal: NumericLiteralKind | StringLiteralKind | BooleanLiteralKind | TemplateLiteralKind | UnaryExpressionKind,
    `type`: typings.astTypes.astTypesStrings.TSLiteralType
  ): typings.astTypes.namedTypesMod.namedTypes.TSLiteralType = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSLiteralType]
  }
  
  @scala.inline
  def TSMappedType(`type`: typings.astTypes.astTypesStrings.TSMappedType, typeParameter: TSTypeParameterKind): typings.astTypes.namedTypesMod.namedTypes.TSMappedType = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSMappedType]
  }
  
  @scala.inline
  def TSMethodSignature(
    key: ExpressionKind,
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typings.astTypes.astTypesStrings.TSMethodSignature
  ): typings.astTypes.namedTypesMod.namedTypes.TSMethodSignature = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSMethodSignature]
  }
  
  @scala.inline
  def TSModuleBlock(body: js.Array[StatementKind], `type`: typings.astTypes.astTypesStrings.TSModuleBlock): typings.astTypes.namedTypesMod.namedTypes.TSModuleBlock = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSModuleBlock]
  }
  
  @scala.inline
  def TSModuleDeclaration(
    id: StringLiteralKind | IdentifierKind | TSQualifiedNameKind,
    `type`: typings.astTypes.astTypesStrings.TSModuleDeclaration
  ): typings.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration]
  }
  
  @scala.inline
  def TSNamedTupleMember(
    elementType: TSTypeKind,
    label: IdentifierKind,
    `type`: typings.astTypes.astTypesStrings.TSNamedTupleMember
  ): typings.astTypes.namedTypesMod.namedTypes.TSNamedTupleMember = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSNamedTupleMember]
  }
  
  @scala.inline
  def TSNamespaceExportDeclaration(id: IdentifierKind, `type`: typings.astTypes.astTypesStrings.TSNamespaceExportDeclaration): typings.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration]
  }
  
  @scala.inline
  def TSNeverKeyword(`type`: typings.astTypes.astTypesStrings.TSNeverKeyword): typings.astTypes.namedTypesMod.namedTypes.TSNeverKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSNeverKeyword]
  }
  
  @scala.inline
  def TSNonNullExpression(expression: ExpressionKind, `type`: typings.astTypes.astTypesStrings.TSNonNullExpression): typings.astTypes.namedTypesMod.namedTypes.TSNonNullExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSNonNullExpression]
  }
  
  @scala.inline
  def TSNullKeyword(`type`: typings.astTypes.astTypesStrings.TSNullKeyword): typings.astTypes.namedTypesMod.namedTypes.TSNullKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSNullKeyword]
  }
  
  @scala.inline
  def TSNumberKeyword(`type`: typings.astTypes.astTypesStrings.TSNumberKeyword): typings.astTypes.namedTypesMod.namedTypes.TSNumberKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSNumberKeyword]
  }
  
  @scala.inline
  def TSObjectKeyword(`type`: typings.astTypes.astTypesStrings.TSObjectKeyword): typings.astTypes.namedTypesMod.namedTypes.TSObjectKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSObjectKeyword]
  }
  
  @scala.inline
  def TSOptionalType(`type`: typings.astTypes.astTypesStrings.TSOptionalType, typeAnnotation: TSTypeKind): typings.astTypes.namedTypesMod.namedTypes.TSOptionalType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSOptionalType]
  }
  
  @scala.inline
  def TSParameterProperty(
    parameter: IdentifierKind | AssignmentPatternKind,
    `type`: typings.astTypes.astTypesStrings.TSParameterProperty
  ): typings.astTypes.namedTypesMod.namedTypes.TSParameterProperty = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSParameterProperty]
  }
  
  @scala.inline
  def TSParenthesizedType(`type`: typings.astTypes.astTypesStrings.TSParenthesizedType, typeAnnotation: TSTypeKind): typings.astTypes.namedTypesMod.namedTypes.TSParenthesizedType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSParenthesizedType]
  }
  
  @scala.inline
  def TSPropertySignature(key: ExpressionKind, `type`: typings.astTypes.astTypesStrings.TSPropertySignature): typings.astTypes.namedTypesMod.namedTypes.TSPropertySignature = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSPropertySignature]
  }
  
  @scala.inline
  def TSQualifiedName(
    left: IdentifierKind | TSQualifiedNameKind,
    right: IdentifierKind | TSQualifiedNameKind,
    `type`: typings.astTypes.astTypesStrings.TSQualifiedName
  ): typings.astTypes.namedTypesMod.namedTypes.TSQualifiedName = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSQualifiedName]
  }
  
  @scala.inline
  def TSRestType(`type`: typings.astTypes.astTypesStrings.TSRestType, typeAnnotation: TSTypeKind): typings.astTypes.namedTypesMod.namedTypes.TSRestType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSRestType]
  }
  
  @scala.inline
  def TSStringKeyword(`type`: typings.astTypes.astTypesStrings.TSStringKeyword): typings.astTypes.namedTypesMod.namedTypes.TSStringKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSStringKeyword]
  }
  
  @scala.inline
  def TSSymbolKeyword(`type`: typings.astTypes.astTypesStrings.TSSymbolKeyword): typings.astTypes.namedTypesMod.namedTypes.TSSymbolKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSSymbolKeyword]
  }
  
  @scala.inline
  def TSThisType(`type`: typings.astTypes.astTypesStrings.TSThisType): typings.astTypes.namedTypesMod.namedTypes.TSThisType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSThisType]
  }
  
  @scala.inline
  def TSTupleType(
    elementTypes: js.Array[TSTypeKind | TSNamedTupleMemberKind],
    `type`: typings.astTypes.astTypesStrings.TSTupleType
  ): typings.astTypes.namedTypesMod.namedTypes.TSTupleType = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTupleType]
  }
  
  @scala.inline
  def TSTypeAliasDeclaration(
    id: IdentifierKind,
    `type`: typings.astTypes.astTypesStrings.TSTypeAliasDeclaration,
    typeAnnotation: TSTypeKind
  ): typings.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration]
  }
  
  @scala.inline
  def TSTypeAnnotation(
    `type`: typings.astTypes.astTypesStrings.TSTypeAnnotation,
    typeAnnotation: TSTypeKind | TSTypeAnnotationKind
  ): typings.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation]
  }
  
  @scala.inline
  def TSTypeAssertion(
    expression: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.TSTypeAssertion,
    typeAnnotation: TSTypeKind
  ): typings.astTypes.namedTypesMod.namedTypes.TSTypeAssertion = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypeAssertion]
  }
  
  @scala.inline
  def TSTypeLiteral(
    members: js.Array[
      TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ],
    `type`: typings.astTypes.astTypesStrings.TSTypeLiteral
  ): typings.astTypes.namedTypesMod.namedTypes.TSTypeLiteral = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypeLiteral]
  }
  
  @scala.inline
  def TSTypeOperator(
    operator: String,
    `type`: typings.astTypes.astTypesStrings.TSTypeOperator,
    typeAnnotation: TSTypeKind
  ): typings.astTypes.namedTypesMod.namedTypes.TSTypeOperator = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypeOperator]
  }
  
  @scala.inline
  def TSTypeParameter(name: String, `type`: typings.astTypes.astTypesStrings.TSTypeParameter): typings.astTypes.namedTypesMod.namedTypes.TSTypeParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypeParameter]
  }
  
  @scala.inline
  def TSTypeParameterDeclaration(
    params: js.Array[TSTypeParameterKind],
    `type`: typings.astTypes.astTypesStrings.TSTypeParameterDeclaration
  ): typings.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration]
  }
  
  @scala.inline
  def TSTypeParameterInstantiation(
    params: js.Array[TSTypeKind],
    `type`: typings.astTypes.astTypesStrings.TSTypeParameterInstantiation
  ): typings.astTypes.namedTypesMod.namedTypes.TSTypeParameterInstantiation = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypeParameterInstantiation]
  }
  
  @scala.inline
  def TSTypePredicate(
    parameterName: IdentifierKind | TSThisTypeKind,
    `type`: typings.astTypes.astTypesStrings.TSTypePredicate
  ): typings.astTypes.namedTypesMod.namedTypes.TSTypePredicate = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypePredicate]
  }
  
  @scala.inline
  def TSTypeQuery(
    exprName: IdentifierKind | TSQualifiedNameKind | TSImportTypeKind,
    `type`: typings.astTypes.astTypesStrings.TSTypeQuery
  ): typings.astTypes.namedTypesMod.namedTypes.TSTypeQuery = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypeQuery]
  }
  
  @scala.inline
  def TSTypeReference(
    `type`: typings.astTypes.astTypesStrings.TSTypeReference,
    typeName: IdentifierKind | TSQualifiedNameKind
  ): typings.astTypes.namedTypesMod.namedTypes.TSTypeReference = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypeReference]
  }
  
  @scala.inline
  def TSUndefinedKeyword(`type`: typings.astTypes.astTypesStrings.TSUndefinedKeyword): typings.astTypes.namedTypesMod.namedTypes.TSUndefinedKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSUndefinedKeyword]
  }
  
  @scala.inline
  def TSUnionType(`type`: typings.astTypes.astTypesStrings.TSUnionType, types: js.Array[TSTypeKind]): typings.astTypes.namedTypesMod.namedTypes.TSUnionType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSUnionType]
  }
  
  @scala.inline
  def TSUnknownKeyword(`type`: typings.astTypes.astTypesStrings.TSUnknownKeyword): typings.astTypes.namedTypesMod.namedTypes.TSUnknownKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSUnknownKeyword]
  }
  
  @scala.inline
  def TSVoidKeyword(`type`: typings.astTypes.astTypesStrings.TSVoidKeyword): typings.astTypes.namedTypesMod.namedTypes.TSVoidKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSVoidKeyword]
  }
  
  @scala.inline
  def TaggedTemplateExpression(
    quasi: TemplateLiteralKind,
    tag: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.TaggedTemplateExpression
  ): typings.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression]
  }
  
  @scala.inline
  def TemplateElement(tail: Boolean, `type`: typings.astTypes.astTypesStrings.TemplateElement, value: Cooked): typings.astTypes.namedTypesMod.namedTypes.TemplateElement = {
    val __obj = js.Dynamic.literal(tail = tail.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TemplateElement]
  }
  
  @scala.inline
  def TemplateLiteral(
    expressions: js.Array[ExpressionKind],
    quasis: js.Array[TemplateElementKind],
    `type`: typings.astTypes.astTypesStrings.TemplateLiteral
  ): typings.astTypes.namedTypesMod.namedTypes.TemplateLiteral = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TemplateLiteral]
  }
  
  @scala.inline
  def ThisExpression(`type`: typings.astTypes.astTypesStrings.ThisExpression): typings.astTypes.namedTypesMod.namedTypes.ThisExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ThisExpression]
  }
  
  @scala.inline
  def ThisTypeAnnotation(`type`: typings.astTypes.astTypesStrings.ThisTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation]
  }
  
  @scala.inline
  def ThrowStatement(argument: ExpressionKind, `type`: typings.astTypes.astTypesStrings.ThrowStatement): typings.astTypes.namedTypesMod.namedTypes.ThrowStatement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ThrowStatement]
  }
  
  @scala.inline
  def TryStatement(block: BlockStatementKind, `type`: typings.astTypes.astTypesStrings.TryStatement): typings.astTypes.namedTypesMod.namedTypes.TryStatement = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TryStatement]
  }
  
  @scala.inline
  def TupleTypeAnnotation(`type`: typings.astTypes.astTypesStrings.TupleTypeAnnotation, types: js.Array[FlowTypeKind]): typings.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation]
  }
  
  @scala.inline
  def TypeAlias(id: IdentifierKind, right: FlowTypeKind, `type`: typings.astTypes.astTypesStrings.TypeAlias): typings.astTypes.namedTypesMod.namedTypes.TypeAlias = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TypeAlias]
  }
  
  @scala.inline
  def TypeAnnotation(`type`: typings.astTypes.astTypesStrings.TypeAnnotation, typeAnnotation: FlowTypeKind): typings.astTypes.namedTypesMod.namedTypes.TypeAnnotation = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TypeAnnotation]
  }
  
  @scala.inline
  def TypeCastExpression(
    expression: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.TypeCastExpression,
    typeAnnotation: TypeAnnotationKind
  ): typings.astTypes.namedTypesMod.namedTypes.TypeCastExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TypeCastExpression]
  }
  
  @scala.inline
  def TypeParameter(name: String, `type`: typings.astTypes.astTypesStrings.TypeParameter): typings.astTypes.namedTypesMod.namedTypes.TypeParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TypeParameter]
  }
  
  @scala.inline
  def TypeParameterDeclaration(
    params: js.Array[TypeParameterKind],
    `type`: typings.astTypes.astTypesStrings.TypeParameterDeclaration
  ): typings.astTypes.namedTypesMod.namedTypes.TypeParameterDeclaration = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TypeParameterDeclaration]
  }
  
  @scala.inline
  def TypeParameterInstantiation(
    params: js.Array[FlowTypeKind],
    `type`: typings.astTypes.astTypesStrings.TypeParameterInstantiation
  ): typings.astTypes.namedTypesMod.namedTypes.TypeParameterInstantiation = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TypeParameterInstantiation]
  }
  
  @scala.inline
  def TypeofTypeAnnotation(argument: FlowTypeKind, `type`: typings.astTypes.astTypesStrings.TypeofTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation]
  }
  
  @scala.inline
  def UnaryExpression(
    argument: ExpressionKind,
    operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete,
    `type`: typings.astTypes.astTypesStrings.UnaryExpression
  ): typings.astTypes.namedTypesMod.namedTypes.UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.UnaryExpression]
  }
  
  @scala.inline
  def UnionTypeAnnotation(`type`: typings.astTypes.astTypesStrings.UnionTypeAnnotation, types: js.Array[FlowTypeKind]): typings.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation]
  }
  
  @scala.inline
  def UpdateExpression(
    argument: ExpressionKind,
    operator: PlussignPlussign | `--`,
    prefix: Boolean,
    `type`: typings.astTypes.astTypesStrings.UpdateExpression
  ): typings.astTypes.namedTypesMod.namedTypes.UpdateExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.UpdateExpression]
  }
  
  @scala.inline
  def VariableDeclaration(
    declarations: js.Array[VariableDeclaratorKind | IdentifierKind],
    kind: `var` | let | const,
    `type`: typings.astTypes.astTypesStrings.VariableDeclaration
  ): typings.astTypes.namedTypesMod.namedTypes.VariableDeclaration = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.VariableDeclaration]
  }
  
  @scala.inline
  def VariableDeclarator(id: PatternKind, `type`: typings.astTypes.astTypesStrings.VariableDeclarator): typings.astTypes.namedTypesMod.namedTypes.VariableDeclarator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.VariableDeclarator]
  }
  
  @scala.inline
  def Variance(kind: plus | minus, `type`: typings.astTypes.astTypesStrings.Variance): typings.astTypes.namedTypesMod.namedTypes.Variance = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Variance]
  }
  
  @scala.inline
  def VoidTypeAnnotation(`type`: typings.astTypes.astTypesStrings.VoidTypeAnnotation): typings.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation]
  }
  
  @scala.inline
  def WhileStatement(body: StatementKind, test: ExpressionKind, `type`: typings.astTypes.astTypesStrings.WhileStatement): typings.astTypes.namedTypesMod.namedTypes.WhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.WhileStatement]
  }
  
  @scala.inline
  def WithStatement(
    body: StatementKind,
    `object`: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.WithStatement
  ): typings.astTypes.namedTypesMod.namedTypes.WithStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.WithStatement]
  }
  
  @scala.inline
  def YieldExpression(`type`: typings.astTypes.astTypesStrings.YieldExpression): typings.astTypes.namedTypesMod.namedTypes.YieldExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.YieldExpression]
  }
}
