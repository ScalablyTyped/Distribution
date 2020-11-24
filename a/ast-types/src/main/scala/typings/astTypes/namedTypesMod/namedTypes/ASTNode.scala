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
trait ASTNode extends js.Object
object ASTNode {
  
  @scala.inline
  def InterpreterDirective(`type`: typings.astTypes.astTypesStrings.InterpreterDirective, value: String): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ClassExpression(body: ClassBodyKind, `type`: typings.astTypes.astTypesStrings.ClassExpression): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSSymbolKeyword(`type`: typings.astTypes.astTypesStrings.TSSymbolKeyword): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def BooleanLiteral(`type`: typings.astTypes.astTypesStrings.BooleanLiteral, value: Boolean): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def EnumNumberBody(
    explicitType: Boolean,
    members: js.Array[EnumNumberMemberKind],
    `type`: typings.astTypes.astTypesStrings.EnumNumberBody
  ): ASTNode = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def DebuggerStatement(`type`: typings.astTypes.astTypesStrings.DebuggerStatement): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def EnumBooleanMember(
    id: IdentifierKind,
    init: LiteralKind | Boolean,
    `type`: typings.astTypes.astTypesStrings.EnumBooleanMember
  ): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def FunctionTypeAnnotation(
    params: js.Array[FunctionTypeParamKind],
    returnType: FlowTypeKind,
    `type`: typings.astTypes.astTypesStrings.FunctionTypeAnnotation
  ): ASTNode = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def QualifiedTypeIdentifier(
    id: IdentifierKind,
    qualification: IdentifierKind | QualifiedTypeIdentifierKind,
    `type`: typings.astTypes.astTypesStrings.QualifiedTypeIdentifier
  ): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], qualification = qualification.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def VariableDeclaration(
    declarations: js.Array[VariableDeclaratorKind | IdentifierKind],
    kind: `var` | let | const,
    `type`: typings.astTypes.astTypesStrings.VariableDeclaration
  ): ASTNode = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def EnumDeclaration(
    body: EnumBooleanBodyKind | EnumNumberBodyKind | EnumStringBodyKind | EnumSymbolBodyKind,
    id: IdentifierKind,
    `type`: typings.astTypes.astTypesStrings.EnumDeclaration
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def FunctionExpression(
    body: BlockStatementKind,
    params: js.Array[PatternKind],
    `type`: typings.astTypes.astTypesStrings.FunctionExpression
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def DirectiveLiteral(`type`: typings.astTypes.astTypesStrings.DirectiveLiteral): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def DeclareFunction(id: IdentifierKind, `type`: typings.astTypes.astTypesStrings.DeclareFunction): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def RegExpLiteral(flags: String, pattern: String, `type`: typings.astTypes.astTypesStrings.RegExpLiteral): ASTNode = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def InterfaceExtends(id: IdentifierKind, `type`: typings.astTypes.astTypesStrings.InterfaceExtends): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def CatchClause(body: BlockStatementKind, `type`: typings.astTypes.astTypesStrings.CatchClause): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ClassBody(
    body: js.Array[
      MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind | ClassPrivatePropertyKind | ClassMethodKind | ClassPrivateMethodKind | TSDeclareMethodKind | TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ],
    `type`: typings.astTypes.astTypesStrings.ClassBody
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ExportDefaultDeclaration(
    declaration: DeclarationKind | ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.ExportDefaultDeclaration
  ): ASTNode = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ObjectMethod(
    body: BlockStatementKind,
    key: LiteralKind | IdentifierKind | ExpressionKind,
    kind: method | get | set,
    params: js.Array[PatternKind],
    `type`: typings.astTypes.astTypesStrings.ObjectMethod
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSTypePredicate(
    parameterName: IdentifierKind | TSThisTypeKind,
    `type`: typings.astTypes.astTypesStrings.TSTypePredicate
  ): ASTNode = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSConditionalType(
    checkType: TSTypeKind,
    extendsType: TSTypeKind,
    falseType: TSTypeKind,
    trueType: TSTypeKind,
    `type`: typings.astTypes.astTypesStrings.TSConditionalType
  ): ASTNode = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def NumberLiteralTypeAnnotation(raw: String, `type`: typings.astTypes.astTypesStrings.NumberLiteralTypeAnnotation, value: Double): ASTNode = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ObjectTypeInternalSlot(
    id: IdentifierKind,
    method: Boolean,
    optional: Boolean,
    static: Boolean,
    `type`: typings.astTypes.astTypesStrings.ObjectTypeInternalSlot,
    value: FlowTypeKind
  ): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def EmptyTypeAnnotation(`type`: typings.astTypes.astTypesStrings.EmptyTypeAnnotation): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def SpreadElement(argument: ExpressionKind, `type`: typings.astTypes.astTypesStrings.SpreadElement): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def BooleanTypeAnnotation(`type`: typings.astTypes.astTypesStrings.BooleanTypeAnnotation): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def InterfaceTypeAnnotation(body: ObjectTypeAnnotationKind, `type`: typings.astTypes.astTypesStrings.InterfaceTypeAnnotation): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def AwaitExpression(`type`: typings.astTypes.astTypesStrings.AwaitExpression): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def BreakStatement(`type`: typings.astTypes.astTypesStrings.BreakStatement): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def File(program: ProgramKind, `type`: typings.astTypes.astTypesStrings.File): ASTNode = {
    val __obj = js.Dynamic.literal(program = program.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ImportSpecifier(imported: IdentifierKind, `type`: typings.astTypes.astTypesStrings.ImportSpecifier): ASTNode = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def EnumNumberMember(id: IdentifierKind, init: LiteralKind, `type`: typings.astTypes.astTypesStrings.EnumNumberMember): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def DeclareClass(
    body: ObjectTypeAnnotationKind,
    `extends`: js.Array[InterfaceExtendsKind],
    id: IdentifierKind,
    `type`: typings.astTypes.astTypesStrings.DeclareClass
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def NumericLiteral(`type`: typings.astTypes.astTypesStrings.NumericLiteral, value: Double): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ObjectTypeCallProperty(`type`: typings.astTypes.astTypesStrings.ObjectTypeCallProperty, value: FunctionTypeAnnotationKind): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def OptionalMemberExpression(
    `object`: ExpressionKind,
    property: IdentifierKind | ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.OptionalMemberExpression
  ): ASTNode = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSTypeParameterDeclaration(
    params: js.Array[TSTypeParameterKind],
    `type`: typings.astTypes.astTypesStrings.TSTypeParameterDeclaration
  ): ASTNode = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def FunctionDeclaration(
    body: BlockStatementKind,
    params: js.Array[PatternKind],
    `type`: typings.astTypes.astTypesStrings.FunctionDeclaration
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def EnumDefaultedMember(id: IdentifierKind, `type`: typings.astTypes.astTypesStrings.EnumDefaultedMember): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSIntersectionType(`type`: typings.astTypes.astTypesStrings.TSIntersectionType, types: js.Array[TSTypeKind]): ASTNode = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSImportType(argument: StringLiteralKind, `type`: typings.astTypes.astTypesStrings.TSImportType): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TryStatement(block: BlockStatementKind, `type`: typings.astTypes.astTypesStrings.TryStatement): ASTNode = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def DeclaredPredicate(`type`: typings.astTypes.astTypesStrings.DeclaredPredicate, value: ExpressionKind): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def StringTypeAnnotation(`type`: typings.astTypes.astTypesStrings.StringTypeAnnotation): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def Directive(`type`: typings.astTypes.astTypesStrings.Directive, value: DirectiveLiteralKind): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def RestElement(argument: PatternKind, `type`: typings.astTypes.astTypesStrings.RestElement): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def BindExpression(callee: ExpressionKind, `type`: typings.astTypes.astTypesStrings.BindExpression): ASTNode = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def IfStatement(
    consequent: StatementKind,
    test: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.IfStatement
  ): ASTNode = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TypeofTypeAnnotation(argument: FlowTypeKind, `type`: typings.astTypes.astTypesStrings.TypeofTypeAnnotation): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ComprehensionExpression(
    blocks: js.Array[ComprehensionBlockKind],
    body: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.ComprehensionExpression
  ): ASTNode = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ObjectTypeSpreadProperty(argument: FlowTypeKind, `type`: typings.astTypes.astTypesStrings.ObjectTypeSpreadProperty): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ObjectProperty(
    key: LiteralKind | IdentifierKind | ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.ObjectProperty,
    value: ExpressionKind | PatternKind
  ): ASTNode = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TaggedTemplateExpression(
    quasi: TemplateLiteralKind,
    tag: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.TaggedTemplateExpression
  ): ASTNode = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ThrowStatement(argument: ExpressionKind, `type`: typings.astTypes.astTypesStrings.ThrowStatement): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSIndexedAccessType(
    indexType: TSTypeKind,
    objectType: TSTypeKind,
    `type`: typings.astTypes.astTypesStrings.TSIndexedAccessType
  ): ASTNode = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def Line(`type`: typings.astTypes.astTypesStrings.Line, value: String): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ForInStatement(
    body: StatementKind,
    left: VariableDeclarationKind | ExpressionKind,
    right: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.ForInStatement
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSTupleType(
    elementTypes: js.Array[TSTypeKind | TSNamedTupleMemberKind],
    `type`: typings.astTypes.astTypesStrings.TSTupleType
  ): ASTNode = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def EnumBooleanBody(
    explicitType: Boolean,
    members: js.Array[EnumBooleanMemberKind],
    `type`: typings.astTypes.astTypesStrings.EnumBooleanBody
  ): ASTNode = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def MemberTypeAnnotation(
    `object`: IdentifierKind,
    property: MemberTypeAnnotationKind | GenericTypeAnnotationKind,
    `type`: typings.astTypes.astTypesStrings.MemberTypeAnnotation
  ): ASTNode = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def Program(body: js.Array[StatementKind], `type`: typings.astTypes.astTypesStrings.Program): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSRestType(`type`: typings.astTypes.astTypesStrings.TSRestType, typeAnnotation: TSTypeKind): ASTNode = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ClassPropertyDefinition(
    definition: MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind,
    `type`: typings.astTypes.astTypesStrings.ClassPropertyDefinition
  ): ASTNode = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TypeCastExpression(
    expression: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.TypeCastExpression,
    typeAnnotation: TypeAnnotationKind
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ComprehensionBlock(
    each: Boolean,
    left: PatternKind,
    right: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.ComprehensionBlock
  ): ASTNode = {
    val __obj = js.Dynamic.literal(each = each.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSTypeAnnotation(
    `type`: typings.astTypes.astTypesStrings.TSTypeAnnotation,
    typeAnnotation: TSTypeKind | TSTypeAnnotationKind
  ): ASTNode = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSNamedTupleMember(
    elementType: TSTypeKind,
    label: IdentifierKind,
    `type`: typings.astTypes.astTypesStrings.TSNamedTupleMember
  ): ASTNode = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def JSXMemberExpression(
    `object`: JSXIdentifierKind | JSXMemberExpressionKind,
    property: JSXIdentifierKind,
    `type`: typings.astTypes.astTypesStrings.JSXMemberExpression
  ): ASTNode = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ExportAllDeclaration(source: LiteralKind, `type`: typings.astTypes.astTypesStrings.ExportAllDeclaration): ASTNode = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSObjectKeyword(`type`: typings.astTypes.astTypesStrings.TSObjectKeyword): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def SpreadPropertyPattern(argument: PatternKind, `type`: typings.astTypes.astTypesStrings.SpreadPropertyPattern): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def MethodDefinition(
    key: ExpressionKind,
    kind: constructor | method | get | set,
    `type`: typings.astTypes.astTypesStrings.MethodDefinition,
    value: FunctionKind
  ): ASTNode = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSTypeParameterInstantiation(
    params: js.Array[TSTypeKind],
    `type`: typings.astTypes.astTypesStrings.TSTypeParameterInstantiation
  ): ASTNode = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ChainExpression(expression: ChainElementKind, `type`: typings.astTypes.astTypesStrings.ChainExpression): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def VariableDeclarator(id: PatternKind, `type`: typings.astTypes.astTypesStrings.VariableDeclarator): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def NewExpression(
    arguments: js.Array[ExpressionKind | SpreadElementKind],
    callee: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.NewExpression
  ): ASTNode = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def VoidTypeAnnotation(`type`: typings.astTypes.astTypesStrings.VoidTypeAnnotation): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSThisType(`type`: typings.astTypes.astTypesStrings.TSThisType): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSDeclareMethod(
    key: IdentifierKind | StringLiteralKind | NumericLiteralKind | ExpressionKind,
    params: js.Array[PatternKind],
    `type`: typings.astTypes.astTypesStrings.TSDeclareMethod
  ): ASTNode = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ExistentialTypeParam(`type`: typings.astTypes.astTypesStrings.ExistentialTypeParam): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ObjectTypeIndexer(
    id: IdentifierKind,
    key: FlowTypeKind,
    `type`: typings.astTypes.astTypesStrings.ObjectTypeIndexer,
    value: FlowTypeKind
  ): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TypeParameterDeclaration(
    params: js.Array[TypeParameterKind],
    `type`: typings.astTypes.astTypesStrings.TypeParameterDeclaration
  ): ASTNode = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def AnyTypeAnnotation(`type`: typings.astTypes.astTypesStrings.AnyTypeAnnotation): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def DoExpression(body: js.Array[StatementKind], `type`: typings.astTypes.astTypesStrings.DoExpression): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSBooleanKeyword(`type`: typings.astTypes.astTypesStrings.TSBooleanKeyword): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSTypeLiteral(
    members: js.Array[
      TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ],
    `type`: typings.astTypes.astTypesStrings.TSTypeLiteral
  ): ASTNode = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def GeneratorExpression(
    blocks: js.Array[ComprehensionBlockKind],
    body: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.GeneratorExpression
  ): ASTNode = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSNeverKeyword(`type`: typings.astTypes.astTypesStrings.TSNeverKeyword): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def DeclareTypeAlias(id: IdentifierKind, right: FlowTypeKind, `type`: typings.astTypes.astTypesStrings.DeclareTypeAlias): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ArrayPattern(
    elements: js.Array[PatternKind | SpreadElementKind | Null],
    `type`: typings.astTypes.astTypesStrings.ArrayPattern
  ): ASTNode = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def NumberTypeAnnotation(`type`: typings.astTypes.astTypesStrings.NumberTypeAnnotation): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def DeclareOpaqueType(id: IdentifierKind, `type`: typings.astTypes.astTypesStrings.DeclareOpaqueType): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ExistsTypeAnnotation(`type`: typings.astTypes.astTypesStrings.ExistsTypeAnnotation): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ObjectExpression(
    properties: js.Array[
      PropertyKind | ObjectMethodKind | ObjectPropertyKind | SpreadPropertyKind | SpreadElementKind
    ],
    `type`: typings.astTypes.astTypesStrings.ObjectExpression
  ): ASTNode = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSTypeQuery(
    exprName: IdentifierKind | TSQualifiedNameKind | TSImportTypeKind,
    `type`: typings.astTypes.astTypesStrings.TSTypeQuery
  ): ASTNode = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ClassProperty(
    key: LiteralKind | IdentifierKind | ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.ClassProperty
  ): ASTNode = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSQualifiedName(
    left: IdentifierKind | TSQualifiedNameKind,
    right: IdentifierKind | TSQualifiedNameKind,
    `type`: typings.astTypes.astTypesStrings.TSQualifiedName
  ): ASTNode = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def BigIntLiteralTypeAnnotation(raw: String, `type`: typings.astTypes.astTypesStrings.BigIntLiteralTypeAnnotation, value: Null): ASTNode = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def JSXText(`type`: typings.astTypes.astTypesStrings.JSXText, value: String): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSIndexSignature(parameters: js.Array[IdentifierKind], `type`: typings.astTypes.astTypesStrings.TSIndexSignature): ASTNode = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ClassPrivateProperty(key: PrivateNameKind, `type`: typings.astTypes.astTypesStrings.ClassPrivateProperty): ASTNode = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def SpreadProperty(argument: ExpressionKind, `type`: typings.astTypes.astTypesStrings.SpreadProperty): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ExportBatchSpecifier(`type`: typings.astTypes.astTypesStrings.ExportBatchSpecifier): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def JSXSpreadChild(expression: ExpressionKind, `type`: typings.astTypes.astTypesStrings.JSXSpreadChild): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def JSXClosingFragment(`type`: typings.astTypes.astTypesStrings.JSXClosingFragment): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ParenthesizedExpression(expression: ExpressionKind, `type`: typings.astTypes.astTypesStrings.ParenthesizedExpression): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def AssignmentPattern(
    left: PatternKind,
    right: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.AssignmentPattern
  ): ASTNode = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSNullKeyword(`type`: typings.astTypes.astTypesStrings.TSNullKeyword): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def NullTypeAnnotation(`type`: typings.astTypes.astTypesStrings.NullTypeAnnotation): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ExpressionStatement(expression: ExpressionKind, `type`: typings.astTypes.astTypesStrings.ExpressionStatement): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def WithStatement(
    body: StatementKind,
    `object`: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.WithStatement
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSStringKeyword(`type`: typings.astTypes.astTypesStrings.TSStringKeyword): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ImportExpression(source: ExpressionKind, `type`: typings.astTypes.astTypesStrings.ImportExpression): ASTNode = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def JSXEmptyExpression(`type`: typings.astTypes.astTypesStrings.JSXEmptyExpression): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def SequenceExpression(expressions: js.Array[ExpressionKind], `type`: typings.astTypes.astTypesStrings.SequenceExpression): ASTNode = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ArrayExpression(
    elements: js.Array[ExpressionKind | SpreadElementKind | RestElementKind | Null],
    `type`: typings.astTypes.astTypesStrings.ArrayExpression
  ): ASTNode = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def JSXAttribute(
    name: JSXIdentifierKind | JSXNamespacedNameKind,
    `type`: typings.astTypes.astTypesStrings.JSXAttribute
  ): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TemplateElement(tail: Boolean, `type`: typings.astTypes.astTypesStrings.TemplateElement, value: Cooked): ASTNode = {
    val __obj = js.Dynamic.literal(tail = tail.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSPropertySignature(key: ExpressionKind, `type`: typings.astTypes.astTypesStrings.TSPropertySignature): ASTNode = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TypeAlias(id: IdentifierKind, right: FlowTypeKind, `type`: typings.astTypes.astTypesStrings.TypeAlias): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def DeclareModule(
    body: BlockStatementKind,
    id: IdentifierKind | LiteralKind,
    `type`: typings.astTypes.astTypesStrings.DeclareModule
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def Variance(kind: plus | minus, `type`: typings.astTypes.astTypesStrings.Variance): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSModuleDeclaration(
    id: StringLiteralKind | IdentifierKind | TSQualifiedNameKind,
    `type`: typings.astTypes.astTypesStrings.TSModuleDeclaration
  ): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def Block(`type`: typings.astTypes.astTypesStrings.Block, value: String): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def SpreadElementPattern(argument: PatternKind, `type`: typings.astTypes.astTypesStrings.SpreadElementPattern): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSNumberKeyword(`type`: typings.astTypes.astTypesStrings.TSNumberKeyword): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def JSXElement(openingElement: JSXOpeningElementKind, `type`: typings.astTypes.astTypesStrings.JSXElement): ASTNode = {
    val __obj = js.Dynamic.literal(openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSUndefinedKeyword(`type`: typings.astTypes.astTypesStrings.TSUndefinedKeyword): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSVoidKeyword(`type`: typings.astTypes.astTypesStrings.TSVoidKeyword): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def JSXNamespacedName(
    name: JSXIdentifierKind,
    namespace: JSXIdentifierKind,
    `type`: typings.astTypes.astTypesStrings.JSXNamespacedName
  ): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSArrayType(elementType: TSTypeKind, `type`: typings.astTypes.astTypesStrings.TSArrayType): ASTNode = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSTypeAliasDeclaration(
    id: IdentifierKind,
    `type`: typings.astTypes.astTypesStrings.TSTypeAliasDeclaration,
    typeAnnotation: TSTypeKind
  ): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def UpdateExpression(
    argument: ExpressionKind,
    operator: PlussignPlussign | `--`,
    prefix: Boolean,
    `type`: typings.astTypes.astTypesStrings.UpdateExpression
  ): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def Property(
    key: LiteralKind | IdentifierKind | ExpressionKind,
    kind: init | get | set,
    `type`: typings.astTypes.astTypesStrings.Property,
    value: ExpressionKind | PatternKind
  ): ASTNode = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def StringLiteralTypeAnnotation(raw: String, `type`: typings.astTypes.astTypesStrings.StringLiteralTypeAnnotation, value: String): ASTNode = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TypeParameterInstantiation(
    params: js.Array[FlowTypeKind],
    `type`: typings.astTypes.astTypesStrings.TypeParameterInstantiation
  ): ASTNode = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSConstructorType(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typings.astTypes.astTypesStrings.TSConstructorType
  ): ASTNode = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def JSXClosingElement(
    name: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind,
    `type`: typings.astTypes.astTypesStrings.JSXClosingElement
  ): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def JSXOpeningFragment(`type`: typings.astTypes.astTypesStrings.JSXOpeningFragment): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSCallSignatureDeclaration(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typings.astTypes.astTypesStrings.TSCallSignatureDeclaration
  ): ASTNode = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ImportDefaultSpecifier(`type`: typings.astTypes.astTypesStrings.ImportDefaultSpecifier): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def NullLiteralTypeAnnotation(`type`: typings.astTypes.astTypesStrings.NullLiteralTypeAnnotation): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSMappedType(`type`: typings.astTypes.astTypesStrings.TSMappedType, typeParameter: TSTypeParameterKind): ASTNode = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def DeclareModuleExports(`type`: typings.astTypes.astTypesStrings.DeclareModuleExports, typeAnnotation: TypeAnnotationKind): ASTNode = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSAnyKeyword(`type`: typings.astTypes.astTypesStrings.TSAnyKeyword): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSTypeReference(
    `type`: typings.astTypes.astTypesStrings.TSTypeReference,
    typeName: IdentifierKind | TSQualifiedNameKind
  ): ASTNode = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def InterfaceDeclaration(
    body: ObjectTypeAnnotationKind,
    `extends`: js.Array[InterfaceExtendsKind],
    id: IdentifierKind,
    `type`: typings.astTypes.astTypesStrings.InterfaceDeclaration
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def Literal(`type`: typings.astTypes.astTypesStrings.Literal): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSParenthesizedType(`type`: typings.astTypes.astTypesStrings.TSParenthesizedType, typeAnnotation: TSTypeKind): ASTNode = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def CommentLine(`type`: typings.astTypes.astTypesStrings.CommentLine, value: String): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ThisTypeAnnotation(`type`: typings.astTypes.astTypesStrings.ThisTypeAnnotation): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def Noop(`type`: typings.astTypes.astTypesStrings.Noop): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def OpaqueType(id: IdentifierKind, impltype: FlowTypeKind, `type`: typings.astTypes.astTypesStrings.OpaqueType): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ContinueStatement(`type`: typings.astTypes.astTypesStrings.ContinueStatement): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ArrayTypeAnnotation(elementType: FlowTypeKind, `type`: typings.astTypes.astTypesStrings.ArrayTypeAnnotation): ASTNode = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def YieldExpression(`type`: typings.astTypes.astTypesStrings.YieldExpression): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSLiteralType(
    literal: NumericLiteralKind | StringLiteralKind | BooleanLiteralKind | TemplateLiteralKind | UnaryExpressionKind,
    `type`: typings.astTypes.astTypesStrings.TSLiteralType
  ): ASTNode = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TypeParameter(name: String, `type`: typings.astTypes.astTypesStrings.TypeParameter): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSExportAssignment(expression: ExpressionKind, `type`: typings.astTypes.astTypesStrings.TSExportAssignment): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def JSXExpressionContainer(
    expression: ExpressionKind | JSXEmptyExpressionKind,
    `type`: typings.astTypes.astTypesStrings.JSXExpressionContainer
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def LabeledStatement(
    body: StatementKind,
    label: IdentifierKind,
    `type`: typings.astTypes.astTypesStrings.LabeledStatement
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ClassDeclaration(body: ClassBodyKind, `type`: typings.astTypes.astTypesStrings.ClassDeclaration): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSOptionalType(`type`: typings.astTypes.astTypesStrings.TSOptionalType, typeAnnotation: TSTypeKind): ASTNode = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ForAwaitStatement(
    body: StatementKind,
    left: VariableDeclarationKind | ExpressionKind,
    right: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.ForAwaitStatement
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSConstructSignatureDeclaration(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typings.astTypes.astTypesStrings.TSConstructSignatureDeclaration
  ): ASTNode = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ThisExpression(`type`: typings.astTypes.astTypesStrings.ThisExpression): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSInterfaceDeclaration(
    body: TSInterfaceBodyKind,
    id: IdentifierKind | TSQualifiedNameKind,
    `type`: typings.astTypes.astTypesStrings.TSInterfaceDeclaration
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def BigIntLiteral(`type`: typings.astTypes.astTypesStrings.BigIntLiteral, value: String | Double): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSAsExpression(
    expression: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.TSAsExpression,
    typeAnnotation: TSTypeKind
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def NullableTypeAnnotation(`type`: typings.astTypes.astTypesStrings.NullableTypeAnnotation, typeAnnotation: FlowTypeKind): ASTNode = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def UnionTypeAnnotation(`type`: typings.astTypes.astTypesStrings.UnionTypeAnnotation, types: js.Array[FlowTypeKind]): ASTNode = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def JSXOpeningElement(
    name: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind,
    `type`: typings.astTypes.astTypesStrings.JSXOpeningElement
  ): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def NumericLiteralTypeAnnotation(raw: String, `type`: typings.astTypes.astTypesStrings.NumericLiteralTypeAnnotation, value: Double): ASTNode = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ImportNamespaceSpecifier(`type`: typings.astTypes.astTypesStrings.ImportNamespaceSpecifier): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def JSXSpreadAttribute(argument: ExpressionKind, `type`: typings.astTypes.astTypesStrings.JSXSpreadAttribute): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ConditionalExpression(
    alternate: ExpressionKind,
    consequent: ExpressionKind,
    test: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.ConditionalExpression
  ): ASTNode = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def MetaProperty(
    meta: IdentifierKind,
    property: IdentifierKind,
    `type`: typings.astTypes.astTypesStrings.MetaProperty
  ): ASTNode = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def DoWhileStatement(
    body: StatementKind,
    test: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.DoWhileStatement
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def FunctionTypeParam(
    optional: Boolean,
    `type`: typings.astTypes.astTypesStrings.FunctionTypeParam,
    typeAnnotation: FlowTypeKind
  ): ASTNode = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSUnknownKeyword(`type`: typings.astTypes.astTypesStrings.TSUnknownKeyword): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ForOfStatement(
    body: StatementKind,
    left: VariableDeclarationKind | PatternKind,
    right: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.ForOfStatement
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ExportNamedDeclaration(`type`: typings.astTypes.astTypesStrings.ExportNamedDeclaration): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSExternalModuleReference(expression: StringLiteralKind, `type`: typings.astTypes.astTypesStrings.TSExternalModuleReference): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TypeAnnotation(`type`: typings.astTypes.astTypesStrings.TypeAnnotation, typeAnnotation: FlowTypeKind): ASTNode = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSNonNullExpression(expression: ExpressionKind, `type`: typings.astTypes.astTypesStrings.TSNonNullExpression): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def RestProperty(argument: ExpressionKind, `type`: typings.astTypes.astTypesStrings.RestProperty): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def BlockStatement(body: js.Array[StatementKind], `type`: typings.astTypes.astTypesStrings.BlockStatement): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ForStatement(body: StatementKind, `type`: typings.astTypes.astTypesStrings.ForStatement): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSMethodSignature(
    key: ExpressionKind,
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typings.astTypes.astTypesStrings.TSMethodSignature
  ): ASTNode = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def SwitchCase(consequent: js.Array[StatementKind], `type`: typings.astTypes.astTypesStrings.SwitchCase): ASTNode = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def JSXIdentifier(name: String, `type`: typings.astTypes.astTypesStrings.JSXIdentifier): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSUnionType(`type`: typings.astTypes.astTypesStrings.TSUnionType, types: js.Array[TSTypeKind]): ASTNode = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def NullLiteral(`type`: typings.astTypes.astTypesStrings.NullLiteral): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def Identifier(name: String, `type`: typings.astTypes.astTypesStrings.Identifier): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ObjectPattern(
    properties: js.Array[
      PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind
    ],
    `type`: typings.astTypes.astTypesStrings.ObjectPattern
  ): ASTNode = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ExportDeclaration(default: Boolean, `type`: typings.astTypes.astTypesStrings.ExportDeclaration): ASTNode = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def EnumSymbolBody(
    members: js.Array[EnumDefaultedMemberKind],
    `type`: typings.astTypes.astTypesStrings.EnumSymbolBody
  ): ASTNode = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSEnumMember(id: IdentifierKind | StringLiteralKind, `type`: typings.astTypes.astTypesStrings.TSEnumMember): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def UnaryExpression(
    argument: ExpressionKind,
    operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete,
    `type`: typings.astTypes.astTypesStrings.UnaryExpression
  ): ASTNode = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ObjectTypeAnnotation(
    properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind],
    `type`: typings.astTypes.astTypesStrings.ObjectTypeAnnotation
  ): ASTNode = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ExportNamespaceSpecifier(exported: IdentifierKind, `type`: typings.astTypes.astTypesStrings.ExportNamespaceSpecifier): ASTNode = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ClassPrivateMethod(
    body: BlockStatementKind,
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    `type`: typings.astTypes.astTypesStrings.ClassPrivateMethod
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def DeclareVariable(id: IdentifierKind, `type`: typings.astTypes.astTypesStrings.DeclareVariable): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ImportDeclaration(source: LiteralKind, `type`: typings.astTypes.astTypesStrings.ImportDeclaration): ASTNode = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def PropertyPattern(
    key: LiteralKind | IdentifierKind | ExpressionKind,
    pattern: PatternKind,
    `type`: typings.astTypes.astTypesStrings.PropertyPattern
  ): ASTNode = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSEnumDeclaration(
    id: IdentifierKind,
    members: js.Array[TSEnumMemberKind],
    `type`: typings.astTypes.astTypesStrings.TSEnumDeclaration
  ): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSParameterProperty(
    parameter: IdentifierKind | AssignmentPatternKind,
    `type`: typings.astTypes.astTypesStrings.TSParameterProperty
  ): ASTNode = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TupleTypeAnnotation(`type`: typings.astTypes.astTypesStrings.TupleTypeAnnotation, types: js.Array[FlowTypeKind]): ASTNode = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def BooleanLiteralTypeAnnotation(raw: String, `type`: typings.astTypes.astTypesStrings.BooleanLiteralTypeAnnotation, value: Boolean): ASTNode = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def CommentBlock(`type`: typings.astTypes.astTypesStrings.CommentBlock, value: String): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TemplateLiteral(
    expressions: js.Array[ExpressionKind],
    quasis: js.Array[TemplateElementKind],
    `type`: typings.astTypes.astTypesStrings.TemplateLiteral
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSImportEqualsDeclaration(
    id: IdentifierKind,
    moduleReference: IdentifierKind | TSQualifiedNameKind | TSExternalModuleReferenceKind,
    `type`: typings.astTypes.astTypesStrings.TSImportEqualsDeclaration
  ): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], moduleReference = moduleReference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def PrivateName(id: IdentifierKind, `type`: typings.astTypes.astTypesStrings.PrivateName): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ExportDefaultSpecifier(exported: IdentifierKind, `type`: typings.astTypes.astTypesStrings.ExportDefaultSpecifier): ASTNode = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ClassMethod(
    body: BlockStatementKind,
    key: LiteralKind | IdentifierKind | ExpressionKind,
    params: js.Array[PatternKind],
    `type`: typings.astTypes.astTypesStrings.ClassMethod
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSNamespaceExportDeclaration(id: IdentifierKind, `type`: typings.astTypes.astTypesStrings.TSNamespaceExportDeclaration): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSTypeAssertion(
    expression: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.TSTypeAssertion,
    typeAnnotation: TSTypeKind
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSInterfaceBody(
    body: js.Array[
      TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ],
    `type`: typings.astTypes.astTypesStrings.TSInterfaceBody
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def Super(`type`: typings.astTypes.astTypesStrings.Super): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def MixedTypeAnnotation(`type`: typings.astTypes.astTypesStrings.MixedTypeAnnotation): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def GenericTypeAnnotation(
    id: IdentifierKind | QualifiedTypeIdentifierKind,
    `type`: typings.astTypes.astTypesStrings.GenericTypeAnnotation
  ): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def DeclareInterface(
    body: ObjectTypeAnnotationKind,
    `extends`: js.Array[InterfaceExtendsKind],
    id: IdentifierKind,
    `type`: typings.astTypes.astTypesStrings.DeclareInterface
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def EnumStringMember(id: IdentifierKind, init: LiteralKind, `type`: typings.astTypes.astTypesStrings.EnumStringMember): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ReturnStatement(`type`: typings.astTypes.astTypesStrings.ReturnStatement): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def LogicalExpression(
    left: ExpressionKind,
    operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark,
    right: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.LogicalExpression
  ): ASTNode = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def BigIntTypeAnnotation(`type`: typings.astTypes.astTypesStrings.BigIntTypeAnnotation): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def EnumStringBody(
    explicitType: Boolean,
    members: js.Array[EnumDefaultedMemberKind | EnumStringMemberKind],
    `type`: typings.astTypes.astTypesStrings.EnumStringBody
  ): ASTNode = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSModuleBlock(body: js.Array[StatementKind], `type`: typings.astTypes.astTypesStrings.TSModuleBlock): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def OptionalCallExpression(
    arguments: js.Array[ExpressionKind | SpreadElementKind],
    callee: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.OptionalCallExpression
  ): ASTNode = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ObjectTypeProperty(
    key: LiteralKind | IdentifierKind,
    optional: Boolean,
    `type`: typings.astTypes.astTypesStrings.ObjectTypeProperty,
    value: FlowTypeKind
  ): ASTNode = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def JSXFragment(
    closingFragment: JSXClosingFragmentKind,
    openingFragment: JSXOpeningFragmentKind,
    `type`: typings.astTypes.astTypesStrings.JSXFragment
  ): ASTNode = {
    val __obj = js.Dynamic.literal(closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSBigIntKeyword(`type`: typings.astTypes.astTypesStrings.TSBigIntKeyword): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def DeclareExportDeclaration(default: Boolean, `type`: typings.astTypes.astTypesStrings.DeclareExportDeclaration): ASTNode = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def EmptyStatement(`type`: typings.astTypes.astTypesStrings.EmptyStatement): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def IntersectionTypeAnnotation(`type`: typings.astTypes.astTypesStrings.IntersectionTypeAnnotation, types: js.Array[FlowTypeKind]): ASTNode = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def Import(`type`: typings.astTypes.astTypesStrings.Import): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def StringLiteral(`type`: typings.astTypes.astTypesStrings.StringLiteral, value: String): ASTNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSFunctionType(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    `type`: typings.astTypes.astTypesStrings.TSFunctionType
  ): ASTNode = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ClassImplements(id: IdentifierKind, `type`: typings.astTypes.astTypesStrings.ClassImplements): ASTNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSTypeOperator(
    operator: String,
    `type`: typings.astTypes.astTypesStrings.TSTypeOperator,
    typeAnnotation: TSTypeKind
  ): ASTNode = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def BinaryExpression(
    left: ExpressionKind,
    operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | Ampersand | Verticalline | typings.astTypes.astTypesStrings.^  | in | instanceof | AsteriskAsterisk,
    right: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.BinaryExpression
  ): ASTNode = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def MemberExpression(
    `object`: ExpressionKind,
    property: IdentifierKind | ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.MemberExpression
  ): ASTNode = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def WhileStatement(body: StatementKind, test: ExpressionKind, `type`: typings.astTypes.astTypesStrings.WhileStatement): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def SwitchStatement(
    cases: js.Array[SwitchCaseKind],
    discriminant: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.SwitchStatement
  ): ASTNode = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def SymbolTypeAnnotation(`type`: typings.astTypes.astTypesStrings.SymbolTypeAnnotation): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def DeclareExportAllDeclaration(`type`: typings.astTypes.astTypesStrings.DeclareExportAllDeclaration): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def AssignmentExpression(
    left: PatternKind | MemberExpressionKind,
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign | AsteriskAsteriskEqualssign,
    right: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.AssignmentExpression
  ): ASTNode = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSDeclareFunction(params: js.Array[PatternKind], `type`: typings.astTypes.astTypesStrings.TSDeclareFunction): ASTNode = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ExportSpecifier(exported: IdentifierKind, `type`: typings.astTypes.astTypesStrings.ExportSpecifier): ASTNode = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def Decorator(expression: ExpressionKind, `type`: typings.astTypes.astTypesStrings.Decorator): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSExpressionWithTypeArguments(
    expression: IdentifierKind | TSQualifiedNameKind,
    `type`: typings.astTypes.astTypesStrings.TSExpressionWithTypeArguments
  ): ASTNode = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def CallExpression(
    arguments: js.Array[ExpressionKind | SpreadElementKind],
    callee: ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.CallExpression
  ): ASTNode = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSInferType(`type`: typings.astTypes.astTypesStrings.TSInferType, typeParameter: TSTypeParameterKind): ASTNode = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def InferredPredicate(`type`: typings.astTypes.astTypesStrings.InferredPredicate): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def TSTypeParameter(name: String, `type`: typings.astTypes.astTypesStrings.TSTypeParameter): ASTNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  
  @scala.inline
  def ArrowFunctionExpression(
    body: BlockStatementKind | ExpressionKind,
    params: js.Array[PatternKind],
    `type`: typings.astTypes.astTypesStrings.ArrowFunctionExpression
  ): ASTNode = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
}
