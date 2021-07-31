package typings.astTypes.buildersMod

import org.scalablytyped.runtime.StringDictionary
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
import typings.astTypes.astTypesStrings.^
import typings.astTypes.astTypesStrings.`--`
import typings.astTypes.astTypesStrings.`-Equalssign`
import typings.astTypes.astTypesStrings.`-_`
import typings.astTypes.astTypesStrings.`^Equalssign`
import typings.astTypes.astTypesStrings.`type`
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
import typings.astTypes.astTypesStrings.value
import typings.astTypes.astTypesStrings.void
import typings.astTypes.kindsMod.ArrayPatternKind
import typings.astTypes.kindsMod.AssignmentPatternKind
import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.BooleanLiteralKind
import typings.astTypes.kindsMod.CatchClauseKind
import typings.astTypes.kindsMod.ChainElementKind
import typings.astTypes.kindsMod.ClassBodyKind
import typings.astTypes.kindsMod.ClassMethodKind
import typings.astTypes.kindsMod.ClassPrivateMethodKind
import typings.astTypes.kindsMod.ClassPrivatePropertyKind
import typings.astTypes.kindsMod.ClassPropertyDefinitionKind
import typings.astTypes.kindsMod.ClassPropertyKind
import typings.astTypes.kindsMod.ComprehensionBlockKind
import typings.astTypes.kindsMod.DeclarationKind
import typings.astTypes.kindsMod.DeclareClassKind
import typings.astTypes.kindsMod.DeclareFunctionKind
import typings.astTypes.kindsMod.DeclareOpaqueTypeKind
import typings.astTypes.kindsMod.DeclareVariableKind
import typings.astTypes.kindsMod.DirectiveLiteralKind
import typings.astTypes.kindsMod.EnumBooleanBodyKind
import typings.astTypes.kindsMod.EnumBooleanMemberKind
import typings.astTypes.kindsMod.EnumDefaultedMemberKind
import typings.astTypes.kindsMod.EnumNumberBodyKind
import typings.astTypes.kindsMod.EnumNumberMemberKind
import typings.astTypes.kindsMod.EnumStringBodyKind
import typings.astTypes.kindsMod.EnumStringMemberKind
import typings.astTypes.kindsMod.EnumSymbolBodyKind
import typings.astTypes.kindsMod.ExportBatchSpecifierKind
import typings.astTypes.kindsMod.ExportSpecifierKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.FunctionKind
import typings.astTypes.kindsMod.FunctionTypeAnnotationKind
import typings.astTypes.kindsMod.FunctionTypeParamKind
import typings.astTypes.kindsMod.GenericTypeAnnotationKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.ImportDefaultSpecifierKind
import typings.astTypes.kindsMod.ImportNamespaceSpecifierKind
import typings.astTypes.kindsMod.ImportSpecifierKind
import typings.astTypes.kindsMod.InterfaceDeclarationKind
import typings.astTypes.kindsMod.InterfaceExtendsKind
import typings.astTypes.kindsMod.JSXAttributeKind
import typings.astTypes.kindsMod.JSXClosingElementKind
import typings.astTypes.kindsMod.JSXClosingFragmentKind
import typings.astTypes.kindsMod.JSXElementKind
import typings.astTypes.kindsMod.JSXEmptyExpressionKind
import typings.astTypes.kindsMod.JSXExpressionContainerKind
import typings.astTypes.kindsMod.JSXFragmentKind
import typings.astTypes.kindsMod.JSXIdentifierKind
import typings.astTypes.kindsMod.JSXMemberExpressionKind
import typings.astTypes.kindsMod.JSXNamespacedNameKind
import typings.astTypes.kindsMod.JSXOpeningElementKind
import typings.astTypes.kindsMod.JSXOpeningFragmentKind
import typings.astTypes.kindsMod.JSXSpreadAttributeKind
import typings.astTypes.kindsMod.JSXSpreadChildKind
import typings.astTypes.kindsMod.JSXTextKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.kindsMod.MemberExpressionKind
import typings.astTypes.kindsMod.MemberTypeAnnotationKind
import typings.astTypes.kindsMod.MethodDefinitionKind
import typings.astTypes.kindsMod.NoopKind
import typings.astTypes.kindsMod.NumericLiteralKind
import typings.astTypes.kindsMod.ObjectMethodKind
import typings.astTypes.kindsMod.ObjectPatternKind
import typings.astTypes.kindsMod.ObjectPropertyKind
import typings.astTypes.kindsMod.ObjectTypeAnnotationKind
import typings.astTypes.kindsMod.ObjectTypeCallPropertyKind
import typings.astTypes.kindsMod.ObjectTypeIndexerKind
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
import typings.astTypes.kindsMod.TSModuleBlockKind
import typings.astTypes.kindsMod.TSModuleDeclarationKind
import typings.astTypes.kindsMod.TSNamedTupleMemberKind
import typings.astTypes.kindsMod.TSPropertySignatureKind
import typings.astTypes.kindsMod.TSQualifiedNameKind
import typings.astTypes.kindsMod.TSThisTypeKind
import typings.astTypes.kindsMod.TSTypeAnnotationKind
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.kindsMod.TSTypeParameterInstantiationKind
import typings.astTypes.kindsMod.TSTypeParameterKind
import typings.astTypes.kindsMod.TemplateElementKind
import typings.astTypes.kindsMod.TemplateLiteralKind
import typings.astTypes.kindsMod.TypeAliasKind
import typings.astTypes.kindsMod.TypeAnnotationKind
import typings.astTypes.kindsMod.TypeParameterDeclarationKind
import typings.astTypes.kindsMod.TypeParameterInstantiationKind
import typings.astTypes.kindsMod.TypeParameterKind
import typings.astTypes.kindsMod.UnaryExpressionKind
import typings.astTypes.kindsMod.VariableDeclarationKind
import typings.astTypes.kindsMod.VariableDeclaratorKind
import typings.astTypes.kindsMod.VarianceKind
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
import typings.astTypes.namedTypesMod.namedTypes.OpaqueType
import typings.astTypes.namedTypesMod.namedTypes.OptionalCallExpression
import typings.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression
import typings.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression
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
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait builders
  extends StObject
     with /* builderName */ StringDictionary[js.Any] {
  
  def anyTypeAnnotation(): AnyTypeAnnotation
  @JSName("anyTypeAnnotation")
  var anyTypeAnnotation_Original: AnyTypeAnnotationBuilder
  
  def arrayExpression(elements: js.Array[ExpressionKind | SpreadElementKind | RestElementKind | Null]): ArrayExpression
  @JSName("arrayExpression")
  var arrayExpression_Original: ArrayExpressionBuilder
  
  def arrayPattern(elements: js.Array[PatternKind | SpreadElementKind | Null]): ArrayPattern
  @JSName("arrayPattern")
  var arrayPattern_Original: ArrayPatternBuilder
  
  def arrayTypeAnnotation(elementType: FlowTypeKind): ArrayTypeAnnotation
  @JSName("arrayTypeAnnotation")
  var arrayTypeAnnotation_Original: ArrayTypeAnnotationBuilder
  
  def arrowFunctionExpression(params: js.Array[PatternKind], body: BlockStatementKind): ArrowFunctionExpression
  def arrowFunctionExpression(params: js.Array[PatternKind], body: BlockStatementKind, expression: Boolean): ArrowFunctionExpression
  def arrowFunctionExpression(params: js.Array[PatternKind], body: ExpressionKind): ArrowFunctionExpression
  def arrowFunctionExpression(params: js.Array[PatternKind], body: ExpressionKind, expression: Boolean): ArrowFunctionExpression
  @JSName("arrowFunctionExpression")
  var arrowFunctionExpression_Original: ArrowFunctionExpressionBuilder
  
  def assignmentExpression(operator: AmpersandEqualssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression
  def assignmentExpression(operator: AmpersandEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression
  def assignmentExpression(operator: AsteriskAsteriskEqualssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression
  def assignmentExpression(operator: AsteriskAsteriskEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression
  def assignmentExpression(operator: AsteriskEqualssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression
  def assignmentExpression(operator: AsteriskEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression
  def assignmentExpression(operator: Equalssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression
  def assignmentExpression(operator: Equalssign, left: PatternKind, right: ExpressionKind): AssignmentExpression
  def assignmentExpression(
    operator: GreaterthansignGreaterthansignEqualssign,
    left: MemberExpressionKind,
    right: ExpressionKind
  ): AssignmentExpression
  def assignmentExpression(operator: GreaterthansignGreaterthansignEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression
  def assignmentExpression(
    operator: GreaterthansignGreaterthansignGreaterthansignEqualssign,
    left: MemberExpressionKind,
    right: ExpressionKind
  ): AssignmentExpression
  def assignmentExpression(
    operator: GreaterthansignGreaterthansignGreaterthansignEqualssign,
    left: PatternKind,
    right: ExpressionKind
  ): AssignmentExpression
  def assignmentExpression(operator: LessthansignLessthansignEqualssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression
  def assignmentExpression(operator: LessthansignLessthansignEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression
  def assignmentExpression(operator: PercentsignEqualssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression
  def assignmentExpression(operator: PercentsignEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression
  def assignmentExpression(operator: PlussignEqualssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression
  def assignmentExpression(operator: PlussignEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression
  def assignmentExpression(operator: SlashEqualssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression
  def assignmentExpression(operator: SlashEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression
  def assignmentExpression(operator: VerticallineEqualssign, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression
  def assignmentExpression(operator: VerticallineEqualssign, left: PatternKind, right: ExpressionKind): AssignmentExpression
  def assignmentExpression(operator: `-Equalssign`, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression
  def assignmentExpression(operator: `-Equalssign`, left: PatternKind, right: ExpressionKind): AssignmentExpression
  def assignmentExpression(operator: `^Equalssign`, left: MemberExpressionKind, right: ExpressionKind): AssignmentExpression
  def assignmentExpression(operator: `^Equalssign`, left: PatternKind, right: ExpressionKind): AssignmentExpression
  @JSName("assignmentExpression")
  var assignmentExpression_Original: AssignmentExpressionBuilder
  
  def assignmentPattern(left: PatternKind, right: ExpressionKind): AssignmentPattern
  @JSName("assignmentPattern")
  var assignmentPattern_Original: AssignmentPatternBuilder
  
  def awaitExpression(): AwaitExpression
  def awaitExpression(argument: Null, all: Boolean): AwaitExpression
  def awaitExpression(argument: ExpressionKind): AwaitExpression
  def awaitExpression(argument: ExpressionKind, all: Boolean): AwaitExpression
  @JSName("awaitExpression")
  var awaitExpression_Original: AwaitExpressionBuilder
  
  def bigIntLiteral(value: String): BigIntLiteral
  def bigIntLiteral(value: Double): BigIntLiteral
  
  def bigIntLiteralTypeAnnotation(value: Null, raw: String): BigIntLiteralTypeAnnotation
  @JSName("bigIntLiteralTypeAnnotation")
  var bigIntLiteralTypeAnnotation_Original: BigIntLiteralTypeAnnotationBuilder
  
  @JSName("bigIntLiteral")
  var bigIntLiteral_Original: BigIntLiteralBuilder
  
  def bigIntTypeAnnotation(): BigIntTypeAnnotation
  @JSName("bigIntTypeAnnotation")
  var bigIntTypeAnnotation_Original: BigIntTypeAnnotationBuilder
  
  def binaryExpression(operator: Ampersand, left: ExpressionKind, right: ExpressionKind): BinaryExpression
  def binaryExpression(operator: AsteriskAsterisk, left: ExpressionKind, right: ExpressionKind): BinaryExpression
  def binaryExpression(operator: Asterisk, left: ExpressionKind, right: ExpressionKind): BinaryExpression
  def binaryExpression(operator: EqualssignEqualssignEqualssign, left: ExpressionKind, right: ExpressionKind): BinaryExpression
  def binaryExpression(operator: EqualssignEqualssign, left: ExpressionKind, right: ExpressionKind): BinaryExpression
  def binaryExpression(operator: ExclamationmarkEqualssignEqualssign, left: ExpressionKind, right: ExpressionKind): BinaryExpression
  def binaryExpression(operator: ExclamationmarkEqualssign, left: ExpressionKind, right: ExpressionKind): BinaryExpression
  def binaryExpression(operator: GreaterthansignEqualssign, left: ExpressionKind, right: ExpressionKind): BinaryExpression
  def binaryExpression(
    operator: GreaterthansignGreaterthansignGreaterthansign,
    left: ExpressionKind,
    right: ExpressionKind
  ): BinaryExpression
  def binaryExpression(operator: GreaterthansignGreaterthansign, left: ExpressionKind, right: ExpressionKind): BinaryExpression
  def binaryExpression(operator: Greaterthansign, left: ExpressionKind, right: ExpressionKind): BinaryExpression
  def binaryExpression(operator: LessthansignEqualssign, left: ExpressionKind, right: ExpressionKind): BinaryExpression
  def binaryExpression(operator: LessthansignLessthansign, left: ExpressionKind, right: ExpressionKind): BinaryExpression
  def binaryExpression(operator: Lessthansign, left: ExpressionKind, right: ExpressionKind): BinaryExpression
  def binaryExpression(operator: Percentsign, left: ExpressionKind, right: ExpressionKind): BinaryExpression
  def binaryExpression(operator: Plussign, left: ExpressionKind, right: ExpressionKind): BinaryExpression
  def binaryExpression(operator: Slash, left: ExpressionKind, right: ExpressionKind): BinaryExpression
  def binaryExpression(operator: Verticalline, left: ExpressionKind, right: ExpressionKind): BinaryExpression
  def binaryExpression(operator: ^, left: ExpressionKind, right: ExpressionKind): BinaryExpression
  def binaryExpression(operator: `-_`, left: ExpressionKind, right: ExpressionKind): BinaryExpression
  @JSName("binaryExpression")
  var binaryExpression_Original: BinaryExpressionBuilder
  @JSName("binaryExpression")
  def binaryExpression_in(operator: in, left: ExpressionKind, right: ExpressionKind): BinaryExpression
  @JSName("binaryExpression")
  def binaryExpression_instanceof(operator: instanceof, left: ExpressionKind, right: ExpressionKind): BinaryExpression
  
  def bindExpression(`object`: Null, callee: ExpressionKind): BindExpression
  def bindExpression(`object`: ExpressionKind, callee: ExpressionKind): BindExpression
  @JSName("bindExpression")
  var bindExpression_Original: BindExpressionBuilder
  
  def block(value: String): Block
  def block(value: String, leading: Boolean): Block
  def block(value: String, leading: Boolean, trailing: Boolean): Block
  def block(value: String, leading: Unit, trailing: Boolean): Block
  
  def blockStatement(body: js.Array[StatementKind]): BlockStatement
  @JSName("blockStatement")
  var blockStatement_Original: BlockStatementBuilder
  
  @JSName("block")
  var block_Original: BlockBuilder
  
  def booleanLiteral(value: Boolean): BooleanLiteral
  
  def booleanLiteralTypeAnnotation(value: Boolean, raw: String): BooleanLiteralTypeAnnotation
  @JSName("booleanLiteralTypeAnnotation")
  var booleanLiteralTypeAnnotation_Original: BooleanLiteralTypeAnnotationBuilder
  
  @JSName("booleanLiteral")
  var booleanLiteral_Original: BooleanLiteralBuilder
  
  def booleanTypeAnnotation(): BooleanTypeAnnotation
  @JSName("booleanTypeAnnotation")
  var booleanTypeAnnotation_Original: BooleanTypeAnnotationBuilder
  
  def breakStatement(): BreakStatement
  def breakStatement(label: IdentifierKind): BreakStatement
  @JSName("breakStatement")
  var breakStatement_Original: BreakStatementBuilder
  
  def callExpression(callee: ExpressionKind, argumentsParam: js.Array[ExpressionKind | SpreadElementKind]): CallExpression
  @JSName("callExpression")
  var callExpression_Original: CallExpressionBuilder
  
  def catchClause(param: Null, guard: Null, body: BlockStatementKind): CatchClause
  def catchClause(param: Null, guard: Unit, body: BlockStatementKind): CatchClause
  def catchClause(param: Null, guard: ExpressionKind, body: BlockStatementKind): CatchClause
  def catchClause(param: Unit, guard: Null, body: BlockStatementKind): CatchClause
  def catchClause(param: Unit, guard: Unit, body: BlockStatementKind): CatchClause
  def catchClause(param: Unit, guard: ExpressionKind, body: BlockStatementKind): CatchClause
  def catchClause(param: PatternKind, guard: Null, body: BlockStatementKind): CatchClause
  def catchClause(param: PatternKind, guard: Unit, body: BlockStatementKind): CatchClause
  def catchClause(param: PatternKind, guard: ExpressionKind, body: BlockStatementKind): CatchClause
  @JSName("catchClause")
  var catchClause_Original: CatchClauseBuilder
  
  def chainExpression(expression: ChainElementKind): ChainExpression
  @JSName("chainExpression")
  var chainExpression_Original: ChainExpressionBuilder
  
  def classBody(
    body: js.Array[
      MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind | ClassPrivatePropertyKind | ClassMethodKind | ClassPrivateMethodKind | TSDeclareMethodKind | TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ]
  ): ClassBody
  @JSName("classBody")
  var classBody_Original: ClassBodyBuilder
  
  def classDeclaration(id: Null, body: ClassBodyKind): ClassDeclaration
  def classDeclaration(id: Null, body: ClassBodyKind, superClass: ExpressionKind): ClassDeclaration
  def classDeclaration(id: IdentifierKind, body: ClassBodyKind): ClassDeclaration
  def classDeclaration(id: IdentifierKind, body: ClassBodyKind, superClass: ExpressionKind): ClassDeclaration
  @JSName("classDeclaration")
  var classDeclaration_Original: ClassDeclarationBuilder
  
  def classExpression(id: Null, body: ClassBodyKind): ClassExpression
  def classExpression(id: Null, body: ClassBodyKind, superClass: ExpressionKind): ClassExpression
  def classExpression(id: Unit, body: ClassBodyKind): ClassExpression
  def classExpression(id: Unit, body: ClassBodyKind, superClass: ExpressionKind): ClassExpression
  def classExpression(id: IdentifierKind, body: ClassBodyKind): ClassExpression
  def classExpression(id: IdentifierKind, body: ClassBodyKind, superClass: ExpressionKind): ClassExpression
  @JSName("classExpression")
  var classExpression_Original: ClassExpressionBuilder
  
  def classImplements(id: IdentifierKind): ClassImplements
  @JSName("classImplements")
  var classImplements_Original: ClassImplementsBuilder
  
  def classMethod(
    kind: js.UndefOr[get | set | method | constructor],
    key: LiteralKind | IdentifierKind | ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: js.UndefOr[Boolean],
    staticParam: js.UndefOr[Boolean | Null]
  ): ClassMethod
  @JSName("classMethod")
  var classMethod_Original: ClassMethodBuilder
  
  def classPrivateMethod(key: PrivateNameKind, params: js.Array[PatternKind], body: BlockStatementKind): ClassPrivateMethod
  def classPrivateMethod(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: Unit,
    computed: Boolean
  ): ClassPrivateMethod
  def classPrivateMethod(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: Unit,
    computed: Boolean,
    staticParam: Boolean
  ): ClassPrivateMethod
  def classPrivateMethod(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: Unit,
    computed: Unit,
    staticParam: Boolean
  ): ClassPrivateMethod
  @JSName("classPrivateMethod")
  var classPrivateMethod_Original: ClassPrivateMethodBuilder
  @JSName("classPrivateMethod")
  def classPrivateMethod_constructor(key: PrivateNameKind, params: js.Array[PatternKind], body: BlockStatementKind, kind: constructor): ClassPrivateMethod
  @JSName("classPrivateMethod")
  def classPrivateMethod_constructor(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: constructor,
    computed: Boolean
  ): ClassPrivateMethod
  @JSName("classPrivateMethod")
  def classPrivateMethod_constructor(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: constructor,
    computed: Boolean,
    staticParam: Boolean
  ): ClassPrivateMethod
  @JSName("classPrivateMethod")
  def classPrivateMethod_constructor(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: constructor,
    computed: Unit,
    staticParam: Boolean
  ): ClassPrivateMethod
  @JSName("classPrivateMethod")
  def classPrivateMethod_get(key: PrivateNameKind, params: js.Array[PatternKind], body: BlockStatementKind, kind: get): ClassPrivateMethod
  @JSName("classPrivateMethod")
  def classPrivateMethod_get(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: get,
    computed: Boolean
  ): ClassPrivateMethod
  @JSName("classPrivateMethod")
  def classPrivateMethod_get(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: get,
    computed: Boolean,
    staticParam: Boolean
  ): ClassPrivateMethod
  @JSName("classPrivateMethod")
  def classPrivateMethod_get(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: get,
    computed: Unit,
    staticParam: Boolean
  ): ClassPrivateMethod
  @JSName("classPrivateMethod")
  def classPrivateMethod_method(key: PrivateNameKind, params: js.Array[PatternKind], body: BlockStatementKind, kind: method): ClassPrivateMethod
  @JSName("classPrivateMethod")
  def classPrivateMethod_method(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: method,
    computed: Boolean
  ): ClassPrivateMethod
  @JSName("classPrivateMethod")
  def classPrivateMethod_method(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: method,
    computed: Boolean,
    staticParam: Boolean
  ): ClassPrivateMethod
  @JSName("classPrivateMethod")
  def classPrivateMethod_method(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: method,
    computed: Unit,
    staticParam: Boolean
  ): ClassPrivateMethod
  @JSName("classPrivateMethod")
  def classPrivateMethod_set(key: PrivateNameKind, params: js.Array[PatternKind], body: BlockStatementKind, kind: set): ClassPrivateMethod
  @JSName("classPrivateMethod")
  def classPrivateMethod_set(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: set,
    computed: Boolean
  ): ClassPrivateMethod
  @JSName("classPrivateMethod")
  def classPrivateMethod_set(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: set,
    computed: Boolean,
    staticParam: Boolean
  ): ClassPrivateMethod
  @JSName("classPrivateMethod")
  def classPrivateMethod_set(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: set,
    computed: Unit,
    staticParam: Boolean
  ): ClassPrivateMethod
  
  def classPrivateProperty(key: PrivateNameKind): ClassPrivateProperty
  def classPrivateProperty(key: PrivateNameKind, value: ExpressionKind): ClassPrivateProperty
  @JSName("classPrivateProperty")
  var classPrivateProperty_Original: ClassPrivatePropertyBuilder
  
  def classProperty(key: ExpressionKind): ClassProperty
  def classProperty(key: ExpressionKind, value: Null, typeAnnotation: Null, staticParam: Boolean): ClassProperty
  def classProperty(key: ExpressionKind, value: Null, typeAnnotation: Unit, staticParam: Boolean): ClassProperty
  def classProperty(key: ExpressionKind, value: Null, typeAnnotation: TSTypeAnnotationKind): ClassProperty
  def classProperty(key: ExpressionKind, value: Null, typeAnnotation: TSTypeAnnotationKind, staticParam: Boolean): ClassProperty
  def classProperty(key: ExpressionKind, value: Null, typeAnnotation: TypeAnnotationKind): ClassProperty
  def classProperty(key: ExpressionKind, value: Null, typeAnnotation: TypeAnnotationKind, staticParam: Boolean): ClassProperty
  def classProperty(key: ExpressionKind, value: ExpressionKind): ClassProperty
  def classProperty(key: ExpressionKind, value: ExpressionKind, typeAnnotation: Null, staticParam: Boolean): ClassProperty
  def classProperty(key: ExpressionKind, value: ExpressionKind, typeAnnotation: Unit, staticParam: Boolean): ClassProperty
  def classProperty(key: ExpressionKind, value: ExpressionKind, typeAnnotation: TSTypeAnnotationKind): ClassProperty
  def classProperty(
    key: ExpressionKind,
    value: ExpressionKind,
    typeAnnotation: TSTypeAnnotationKind,
    staticParam: Boolean
  ): ClassProperty
  def classProperty(key: ExpressionKind, value: ExpressionKind, typeAnnotation: TypeAnnotationKind): ClassProperty
  def classProperty(
    key: ExpressionKind,
    value: ExpressionKind,
    typeAnnotation: TypeAnnotationKind,
    staticParam: Boolean
  ): ClassProperty
  def classProperty(key: IdentifierKind): ClassProperty
  def classProperty(key: IdentifierKind, value: Null, typeAnnotation: Null, staticParam: Boolean): ClassProperty
  def classProperty(key: IdentifierKind, value: Null, typeAnnotation: Unit, staticParam: Boolean): ClassProperty
  def classProperty(key: IdentifierKind, value: Null, typeAnnotation: TSTypeAnnotationKind): ClassProperty
  def classProperty(key: IdentifierKind, value: Null, typeAnnotation: TSTypeAnnotationKind, staticParam: Boolean): ClassProperty
  def classProperty(key: IdentifierKind, value: Null, typeAnnotation: TypeAnnotationKind): ClassProperty
  def classProperty(key: IdentifierKind, value: Null, typeAnnotation: TypeAnnotationKind, staticParam: Boolean): ClassProperty
  def classProperty(key: IdentifierKind, value: ExpressionKind): ClassProperty
  def classProperty(key: IdentifierKind, value: ExpressionKind, typeAnnotation: Null, staticParam: Boolean): ClassProperty
  def classProperty(key: IdentifierKind, value: ExpressionKind, typeAnnotation: Unit, staticParam: Boolean): ClassProperty
  def classProperty(key: IdentifierKind, value: ExpressionKind, typeAnnotation: TSTypeAnnotationKind): ClassProperty
  def classProperty(
    key: IdentifierKind,
    value: ExpressionKind,
    typeAnnotation: TSTypeAnnotationKind,
    staticParam: Boolean
  ): ClassProperty
  def classProperty(key: IdentifierKind, value: ExpressionKind, typeAnnotation: TypeAnnotationKind): ClassProperty
  def classProperty(
    key: IdentifierKind,
    value: ExpressionKind,
    typeAnnotation: TypeAnnotationKind,
    staticParam: Boolean
  ): ClassProperty
  def classProperty(key: LiteralKind): ClassProperty
  def classProperty(key: LiteralKind, value: Null, typeAnnotation: Null, staticParam: Boolean): ClassProperty
  def classProperty(key: LiteralKind, value: Null, typeAnnotation: Unit, staticParam: Boolean): ClassProperty
  def classProperty(key: LiteralKind, value: Null, typeAnnotation: TSTypeAnnotationKind): ClassProperty
  def classProperty(key: LiteralKind, value: Null, typeAnnotation: TSTypeAnnotationKind, staticParam: Boolean): ClassProperty
  def classProperty(key: LiteralKind, value: Null, typeAnnotation: TypeAnnotationKind): ClassProperty
  def classProperty(key: LiteralKind, value: Null, typeAnnotation: TypeAnnotationKind, staticParam: Boolean): ClassProperty
  def classProperty(key: LiteralKind, value: ExpressionKind): ClassProperty
  def classProperty(key: LiteralKind, value: ExpressionKind, typeAnnotation: Null, staticParam: Boolean): ClassProperty
  def classProperty(key: LiteralKind, value: ExpressionKind, typeAnnotation: Unit, staticParam: Boolean): ClassProperty
  def classProperty(key: LiteralKind, value: ExpressionKind, typeAnnotation: TSTypeAnnotationKind): ClassProperty
  def classProperty(
    key: LiteralKind,
    value: ExpressionKind,
    typeAnnotation: TSTypeAnnotationKind,
    staticParam: Boolean
  ): ClassProperty
  def classProperty(key: LiteralKind, value: ExpressionKind, typeAnnotation: TypeAnnotationKind): ClassProperty
  def classProperty(key: LiteralKind, value: ExpressionKind, typeAnnotation: TypeAnnotationKind, staticParam: Boolean): ClassProperty
  
  def classPropertyDefinition(definition: ClassPropertyDefinitionKind): ClassPropertyDefinition
  def classPropertyDefinition(definition: ClassPropertyKind): ClassPropertyDefinition
  def classPropertyDefinition(definition: MethodDefinitionKind): ClassPropertyDefinition
  def classPropertyDefinition(definition: VariableDeclaratorKind): ClassPropertyDefinition
  @JSName("classPropertyDefinition")
  var classPropertyDefinition_Original: ClassPropertyDefinitionBuilder
  
  @JSName("classProperty")
  var classProperty_Original: ClassPropertyBuilder
  
  def commentBlock(value: String): CommentBlock
  def commentBlock(value: String, leading: Boolean): CommentBlock
  def commentBlock(value: String, leading: Boolean, trailing: Boolean): CommentBlock
  def commentBlock(value: String, leading: Unit, trailing: Boolean): CommentBlock
  @JSName("commentBlock")
  var commentBlock_Original: CommentBlockBuilder
  
  def commentLine(value: String): CommentLine
  def commentLine(value: String, leading: Boolean): CommentLine
  def commentLine(value: String, leading: Boolean, trailing: Boolean): CommentLine
  def commentLine(value: String, leading: Unit, trailing: Boolean): CommentLine
  @JSName("commentLine")
  var commentLine_Original: CommentLineBuilder
  
  def comprehensionBlock(left: PatternKind, right: ExpressionKind, each: Boolean): ComprehensionBlock
  @JSName("comprehensionBlock")
  var comprehensionBlock_Original: ComprehensionBlockBuilder
  
  def comprehensionExpression(body: ExpressionKind, blocks: js.Array[ComprehensionBlockKind]): ComprehensionExpression
  def comprehensionExpression(body: ExpressionKind, blocks: js.Array[ComprehensionBlockKind], filter: ExpressionKind): ComprehensionExpression
  @JSName("comprehensionExpression")
  var comprehensionExpression_Original: ComprehensionExpressionBuilder
  
  def conditionalExpression(test: ExpressionKind, consequent: ExpressionKind, alternate: ExpressionKind): ConditionalExpression
  @JSName("conditionalExpression")
  var conditionalExpression_Original: ConditionalExpressionBuilder
  
  def continueStatement(): ContinueStatement
  def continueStatement(label: IdentifierKind): ContinueStatement
  @JSName("continueStatement")
  var continueStatement_Original: ContinueStatementBuilder
  
  def debuggerStatement(): DebuggerStatement
  @JSName("debuggerStatement")
  var debuggerStatement_Original: DebuggerStatementBuilder
  
  def declareClass(id: IdentifierKind): DeclareClass
  @JSName("declareClass")
  var declareClass_Original: DeclareClassBuilder
  
  def declareExportAllDeclaration(): DeclareExportAllDeclaration
  def declareExportAllDeclaration(source: LiteralKind): DeclareExportAllDeclaration
  @JSName("declareExportAllDeclaration")
  var declareExportAllDeclaration_Original: DeclareExportAllDeclarationBuilder
  
  def declareExportDeclaration(defaultParam: Boolean): DeclareExportDeclaration
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: Null,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: Null,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration
  def declareExportDeclaration(defaultParam: Boolean, declaration: Null, specifiers: Unit, source: LiteralKind): DeclareExportDeclaration
  def declareExportDeclaration(defaultParam: Boolean, declaration: DeclareClassKind): DeclareExportDeclaration
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: DeclareClassKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: DeclareClassKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration
  def declareExportDeclaration(defaultParam: Boolean, declaration: DeclareClassKind, specifiers: Unit, source: LiteralKind): DeclareExportDeclaration
  def declareExportDeclaration(defaultParam: Boolean, declaration: DeclareFunctionKind): DeclareExportDeclaration
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: DeclareFunctionKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: DeclareFunctionKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration
  def declareExportDeclaration(defaultParam: Boolean, declaration: DeclareFunctionKind, specifiers: Unit, source: LiteralKind): DeclareExportDeclaration
  def declareExportDeclaration(defaultParam: Boolean, declaration: DeclareOpaqueTypeKind): DeclareExportDeclaration
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: DeclareOpaqueTypeKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: DeclareOpaqueTypeKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration
  def declareExportDeclaration(defaultParam: Boolean, declaration: DeclareOpaqueTypeKind, specifiers: Unit, source: LiteralKind): DeclareExportDeclaration
  def declareExportDeclaration(defaultParam: Boolean, declaration: DeclareVariableKind): DeclareExportDeclaration
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: DeclareVariableKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: DeclareVariableKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration
  def declareExportDeclaration(defaultParam: Boolean, declaration: DeclareVariableKind, specifiers: Unit, source: LiteralKind): DeclareExportDeclaration
  def declareExportDeclaration(defaultParam: Boolean, declaration: FlowTypeKind): DeclareExportDeclaration
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: FlowTypeKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: FlowTypeKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration
  def declareExportDeclaration(defaultParam: Boolean, declaration: FlowTypeKind, specifiers: Unit, source: LiteralKind): DeclareExportDeclaration
  def declareExportDeclaration(defaultParam: Boolean, declaration: InterfaceDeclarationKind): DeclareExportDeclaration
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: InterfaceDeclarationKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: InterfaceDeclarationKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: InterfaceDeclarationKind,
    specifiers: Unit,
    source: LiteralKind
  ): DeclareExportDeclaration
  def declareExportDeclaration(defaultParam: Boolean, declaration: TypeAliasKind): DeclareExportDeclaration
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: TypeAliasKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: TypeAliasKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration
  def declareExportDeclaration(defaultParam: Boolean, declaration: TypeAliasKind, specifiers: Unit, source: LiteralKind): DeclareExportDeclaration
  @JSName("declareExportDeclaration")
  var declareExportDeclaration_Original: DeclareExportDeclarationBuilder
  
  def declareFunction(id: IdentifierKind): DeclareFunction
  @JSName("declareFunction")
  var declareFunction_Original: DeclareFunctionBuilder
  
  def declareInterface(id: IdentifierKind, body: ObjectTypeAnnotationKind, extendsParam: js.Array[InterfaceExtendsKind]): DeclareInterface
  @JSName("declareInterface")
  var declareInterface_Original: DeclareInterfaceBuilder
  
  def declareModule(id: IdentifierKind, body: BlockStatementKind): DeclareModule
  def declareModule(id: LiteralKind, body: BlockStatementKind): DeclareModule
  
  def declareModuleExports(typeAnnotation: TypeAnnotationKind): DeclareModuleExports
  @JSName("declareModuleExports")
  var declareModuleExports_Original: DeclareModuleExportsBuilder
  
  @JSName("declareModule")
  var declareModule_Original: DeclareModuleBuilder
  
  def declareOpaqueType(id: IdentifierKind): DeclareOpaqueType
  def declareOpaqueType(id: IdentifierKind, typeParameters: Null, supertype: FlowTypeKind): DeclareOpaqueType
  def declareOpaqueType(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind): DeclareOpaqueType
  def declareOpaqueType(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind, supertype: FlowTypeKind): DeclareOpaqueType
  @JSName("declareOpaqueType")
  var declareOpaqueType_Original: DeclareOpaqueTypeBuilder
  
  def declareTypeAlias(id: IdentifierKind, typeParameters: Null, right: FlowTypeKind): DeclareTypeAlias
  def declareTypeAlias(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind, right: FlowTypeKind): DeclareTypeAlias
  @JSName("declareTypeAlias")
  var declareTypeAlias_Original: DeclareTypeAliasBuilder
  
  def declareVariable(id: IdentifierKind): DeclareVariable
  @JSName("declareVariable")
  var declareVariable_Original: DeclareVariableBuilder
  
  def declaredPredicate(value: ExpressionKind): DeclaredPredicate
  @JSName("declaredPredicate")
  var declaredPredicate_Original: DeclaredPredicateBuilder
  
  def decorator(expression: ExpressionKind): Decorator
  @JSName("decorator")
  var decorator_Original: DecoratorBuilder
  
  def directive(value: DirectiveLiteralKind): Directive
  
  def directiveLiteral(): DirectiveLiteral
  def directiveLiteral(value: String): DirectiveLiteral
  @JSName("directiveLiteral")
  var directiveLiteral_Original: DirectiveLiteralBuilder
  
  @JSName("directive")
  var directive_Original: DirectiveBuilder
  
  def doExpression(body: js.Array[StatementKind]): DoExpression
  @JSName("doExpression")
  var doExpression_Original: DoExpressionBuilder
  
  def doWhileStatement(body: StatementKind, test: ExpressionKind): DoWhileStatement
  @JSName("doWhileStatement")
  var doWhileStatement_Original: DoWhileStatementBuilder
  
  def emptyStatement(): EmptyStatement
  @JSName("emptyStatement")
  var emptyStatement_Original: EmptyStatementBuilder
  
  def emptyTypeAnnotation(): EmptyTypeAnnotation
  @JSName("emptyTypeAnnotation")
  var emptyTypeAnnotation_Original: EmptyTypeAnnotationBuilder
  
  def enumBooleanBody(members: js.Array[EnumBooleanMemberKind], explicitType: Boolean): EnumBooleanBody
  @JSName("enumBooleanBody")
  var enumBooleanBody_Original: EnumBooleanBodyBuilder
  
  def enumBooleanMember(id: IdentifierKind, init: Boolean): EnumBooleanMember
  def enumBooleanMember(id: IdentifierKind, init: LiteralKind): EnumBooleanMember
  @JSName("enumBooleanMember")
  var enumBooleanMember_Original: EnumBooleanMemberBuilder
  
  def enumDeclaration(id: IdentifierKind, body: EnumBooleanBodyKind): EnumDeclaration
  def enumDeclaration(id: IdentifierKind, body: EnumNumberBodyKind): EnumDeclaration
  def enumDeclaration(id: IdentifierKind, body: EnumStringBodyKind): EnumDeclaration
  def enumDeclaration(id: IdentifierKind, body: EnumSymbolBodyKind): EnumDeclaration
  @JSName("enumDeclaration")
  var enumDeclaration_Original: EnumDeclarationBuilder
  
  def enumDefaultedMember(id: IdentifierKind): EnumDefaultedMember
  @JSName("enumDefaultedMember")
  var enumDefaultedMember_Original: EnumDefaultedMemberBuilder
  
  def enumNumberBody(members: js.Array[EnumNumberMemberKind], explicitType: Boolean): EnumNumberBody
  @JSName("enumNumberBody")
  var enumNumberBody_Original: EnumNumberBodyBuilder
  
  def enumNumberMember(id: IdentifierKind, init: LiteralKind): EnumNumberMember
  @JSName("enumNumberMember")
  var enumNumberMember_Original: EnumNumberMemberBuilder
  
  def enumStringBody(members: js.Array[EnumDefaultedMemberKind | EnumStringMemberKind], explicitType: Boolean): EnumStringBody
  @JSName("enumStringBody")
  var enumStringBody_Original: EnumStringBodyBuilder
  
  def enumStringMember(id: IdentifierKind, init: LiteralKind): EnumStringMember
  @JSName("enumStringMember")
  var enumStringMember_Original: EnumStringMemberBuilder
  
  def enumSymbolBody(members: js.Array[EnumDefaultedMemberKind]): EnumSymbolBody
  @JSName("enumSymbolBody")
  var enumSymbolBody_Original: EnumSymbolBodyBuilder
  
  def existentialTypeParam(): ExistentialTypeParam
  @JSName("existentialTypeParam")
  var existentialTypeParam_Original: ExistentialTypeParamBuilder
  
  def existsTypeAnnotation(): ExistsTypeAnnotation
  @JSName("existsTypeAnnotation")
  var existsTypeAnnotation_Original: ExistsTypeAnnotationBuilder
  
  def exportAllDeclaration(source: LiteralKind): ExportAllDeclaration
  def exportAllDeclaration(source: LiteralKind, exported: IdentifierKind): ExportAllDeclaration
  @JSName("exportAllDeclaration")
  var exportAllDeclaration_Original: ExportAllDeclarationBuilder
  
  def exportBatchSpecifier(): ExportBatchSpecifier
  @JSName("exportBatchSpecifier")
  var exportBatchSpecifier_Original: ExportBatchSpecifierBuilder
  
  def exportDeclaration(defaultParam: Boolean): ExportDeclaration
  def exportDeclaration(
    defaultParam: Boolean,
    declaration: Null,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): ExportDeclaration
  def exportDeclaration(
    defaultParam: Boolean,
    declaration: Null,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): ExportDeclaration
  def exportDeclaration(defaultParam: Boolean, declaration: Null, specifiers: Unit, source: LiteralKind): ExportDeclaration
  def exportDeclaration(defaultParam: Boolean, declaration: DeclarationKind): ExportDeclaration
  def exportDeclaration(
    defaultParam: Boolean,
    declaration: DeclarationKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): ExportDeclaration
  def exportDeclaration(
    defaultParam: Boolean,
    declaration: DeclarationKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): ExportDeclaration
  def exportDeclaration(defaultParam: Boolean, declaration: DeclarationKind, specifiers: Unit, source: LiteralKind): ExportDeclaration
  def exportDeclaration(defaultParam: Boolean, declaration: ExpressionKind): ExportDeclaration
  def exportDeclaration(
    defaultParam: Boolean,
    declaration: ExpressionKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): ExportDeclaration
  def exportDeclaration(
    defaultParam: Boolean,
    declaration: ExpressionKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): ExportDeclaration
  def exportDeclaration(defaultParam: Boolean, declaration: ExpressionKind, specifiers: Unit, source: LiteralKind): ExportDeclaration
  @JSName("exportDeclaration")
  var exportDeclaration_Original: ExportDeclarationBuilder
  
  def exportDefaultDeclaration(declaration: DeclarationKind): ExportDefaultDeclaration
  def exportDefaultDeclaration(declaration: ExpressionKind): ExportDefaultDeclaration
  @JSName("exportDefaultDeclaration")
  var exportDefaultDeclaration_Original: ExportDefaultDeclarationBuilder
  
  def exportDefaultSpecifier(exported: IdentifierKind): ExportDefaultSpecifier
  @JSName("exportDefaultSpecifier")
  var exportDefaultSpecifier_Original: ExportDefaultSpecifierBuilder
  
  def exportNamedDeclaration(): ExportNamedDeclaration
  def exportNamedDeclaration(declaration: Null, specifiers: js.Array[ExportSpecifierKind]): ExportNamedDeclaration
  def exportNamedDeclaration(declaration: Null, specifiers: js.Array[ExportSpecifierKind], source: LiteralKind): ExportNamedDeclaration
  def exportNamedDeclaration(declaration: Null, specifiers: Unit, source: LiteralKind): ExportNamedDeclaration
  def exportNamedDeclaration(declaration: DeclarationKind): ExportNamedDeclaration
  def exportNamedDeclaration(declaration: DeclarationKind, specifiers: js.Array[ExportSpecifierKind]): ExportNamedDeclaration
  def exportNamedDeclaration(declaration: DeclarationKind, specifiers: js.Array[ExportSpecifierKind], source: LiteralKind): ExportNamedDeclaration
  def exportNamedDeclaration(declaration: DeclarationKind, specifiers: Unit, source: LiteralKind): ExportNamedDeclaration
  @JSName("exportNamedDeclaration")
  var exportNamedDeclaration_Original: ExportNamedDeclarationBuilder
  
  def exportNamespaceSpecifier(exported: IdentifierKind): ExportNamespaceSpecifier
  @JSName("exportNamespaceSpecifier")
  var exportNamespaceSpecifier_Original: ExportNamespaceSpecifierBuilder
  
  def exportSpecifier(): ExportSpecifier
  def exportSpecifier(id: Null, name: IdentifierKind): ExportSpecifier
  def exportSpecifier(id: Unit, name: IdentifierKind): ExportSpecifier
  def exportSpecifier(id: IdentifierKind): ExportSpecifier
  def exportSpecifier(id: IdentifierKind, name: IdentifierKind): ExportSpecifier
  @JSName("exportSpecifier")
  var exportSpecifier_Original: ExportSpecifierBuilder
  
  def expressionStatement(expression: ExpressionKind): ExpressionStatement
  @JSName("expressionStatement")
  var expressionStatement_Original: ExpressionStatementBuilder
  
  def file(program: ProgramKind): File
  def file(program: ProgramKind, name: String): File
  @JSName("file")
  var file_Original: FileBuilder
  
  def forAwaitStatement(left: ExpressionKind, right: ExpressionKind, body: StatementKind): ForAwaitStatement
  def forAwaitStatement(left: VariableDeclarationKind, right: ExpressionKind, body: StatementKind): ForAwaitStatement
  @JSName("forAwaitStatement")
  var forAwaitStatement_Original: ForAwaitStatementBuilder
  
  def forInStatement(left: ExpressionKind, right: ExpressionKind, body: StatementKind): ForInStatement
  def forInStatement(left: VariableDeclarationKind, right: ExpressionKind, body: StatementKind): ForInStatement
  @JSName("forInStatement")
  var forInStatement_Original: ForInStatementBuilder
  
  def forOfStatement(left: PatternKind, right: ExpressionKind, body: StatementKind): ForOfStatement
  def forOfStatement(left: VariableDeclarationKind, right: ExpressionKind, body: StatementKind): ForOfStatement
  @JSName("forOfStatement")
  var forOfStatement_Original: ForOfStatementBuilder
  
  def forStatement(init: Null, test: Null, update: Null, body: StatementKind): ForStatement
  def forStatement(init: Null, test: Null, update: ExpressionKind, body: StatementKind): ForStatement
  def forStatement(init: Null, test: ExpressionKind, update: Null, body: StatementKind): ForStatement
  def forStatement(init: Null, test: ExpressionKind, update: ExpressionKind, body: StatementKind): ForStatement
  def forStatement(init: ExpressionKind, test: Null, update: Null, body: StatementKind): ForStatement
  def forStatement(init: ExpressionKind, test: Null, update: ExpressionKind, body: StatementKind): ForStatement
  def forStatement(init: ExpressionKind, test: ExpressionKind, update: Null, body: StatementKind): ForStatement
  def forStatement(init: ExpressionKind, test: ExpressionKind, update: ExpressionKind, body: StatementKind): ForStatement
  def forStatement(init: VariableDeclarationKind, test: Null, update: Null, body: StatementKind): ForStatement
  def forStatement(init: VariableDeclarationKind, test: Null, update: ExpressionKind, body: StatementKind): ForStatement
  def forStatement(init: VariableDeclarationKind, test: ExpressionKind, update: Null, body: StatementKind): ForStatement
  def forStatement(init: VariableDeclarationKind, test: ExpressionKind, update: ExpressionKind, body: StatementKind): ForStatement
  @JSName("forStatement")
  var forStatement_Original: ForStatementBuilder
  
  def functionDeclaration(id: Null, params: js.Array[PatternKind], body: BlockStatementKind): FunctionDeclaration
  def functionDeclaration(id: Null, params: js.Array[PatternKind], body: BlockStatementKind, generator: Boolean): FunctionDeclaration
  def functionDeclaration(
    id: Null,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean,
    expression: Boolean
  ): FunctionDeclaration
  def functionDeclaration(
    id: Null,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Unit,
    expression: Boolean
  ): FunctionDeclaration
  def functionDeclaration(id: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): FunctionDeclaration
  def functionDeclaration(id: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind, generator: Boolean): FunctionDeclaration
  def functionDeclaration(
    id: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean,
    expression: Boolean
  ): FunctionDeclaration
  def functionDeclaration(
    id: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Unit,
    expression: Boolean
  ): FunctionDeclaration
  @JSName("functionDeclaration")
  var functionDeclaration_Original: FunctionDeclarationBuilder
  
  def functionExpression(id: Null, params: js.Array[PatternKind], body: BlockStatementKind): FunctionExpression
  def functionExpression(id: Null, params: js.Array[PatternKind], body: BlockStatementKind, generator: Boolean): FunctionExpression
  def functionExpression(
    id: Null,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean,
    expression: Boolean
  ): FunctionExpression
  def functionExpression(
    id: Null,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Unit,
    expression: Boolean
  ): FunctionExpression
  def functionExpression(id: Unit, params: js.Array[PatternKind], body: BlockStatementKind): FunctionExpression
  def functionExpression(id: Unit, params: js.Array[PatternKind], body: BlockStatementKind, generator: Boolean): FunctionExpression
  def functionExpression(
    id: Unit,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean,
    expression: Boolean
  ): FunctionExpression
  def functionExpression(
    id: Unit,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Unit,
    expression: Boolean
  ): FunctionExpression
  def functionExpression(id: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): FunctionExpression
  def functionExpression(id: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind, generator: Boolean): FunctionExpression
  def functionExpression(
    id: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean,
    expression: Boolean
  ): FunctionExpression
  def functionExpression(
    id: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Unit,
    expression: Boolean
  ): FunctionExpression
  @JSName("functionExpression")
  var functionExpression_Original: FunctionExpressionBuilder
  
  def functionTypeAnnotation(params: js.Array[FunctionTypeParamKind], returnType: FlowTypeKind): FunctionTypeAnnotation
  def functionTypeAnnotation(
    params: js.Array[FunctionTypeParamKind],
    returnType: FlowTypeKind,
    rest: Null,
    typeParameters: TypeParameterDeclarationKind
  ): FunctionTypeAnnotation
  def functionTypeAnnotation(params: js.Array[FunctionTypeParamKind], returnType: FlowTypeKind, rest: FunctionTypeParamKind): FunctionTypeAnnotation
  def functionTypeAnnotation(
    params: js.Array[FunctionTypeParamKind],
    returnType: FlowTypeKind,
    rest: FunctionTypeParamKind,
    typeParameters: TypeParameterDeclarationKind
  ): FunctionTypeAnnotation
  @JSName("functionTypeAnnotation")
  var functionTypeAnnotation_Original: FunctionTypeAnnotationBuilder
  
  def functionTypeParam(name: Null, typeAnnotation: FlowTypeKind, optional: Boolean): FunctionTypeParam
  def functionTypeParam(name: IdentifierKind, typeAnnotation: FlowTypeKind, optional: Boolean): FunctionTypeParam
  @JSName("functionTypeParam")
  var functionTypeParam_Original: FunctionTypeParamBuilder
  
  def generatorExpression(body: ExpressionKind, blocks: js.Array[ComprehensionBlockKind]): GeneratorExpression
  def generatorExpression(body: ExpressionKind, blocks: js.Array[ComprehensionBlockKind], filter: ExpressionKind): GeneratorExpression
  @JSName("generatorExpression")
  var generatorExpression_Original: GeneratorExpressionBuilder
  
  def genericTypeAnnotation(id: IdentifierKind): GenericTypeAnnotation
  def genericTypeAnnotation(id: IdentifierKind, typeParameters: TypeParameterInstantiationKind): GenericTypeAnnotation
  def genericTypeAnnotation(id: QualifiedTypeIdentifierKind): GenericTypeAnnotation
  def genericTypeAnnotation(id: QualifiedTypeIdentifierKind, typeParameters: TypeParameterInstantiationKind): GenericTypeAnnotation
  @JSName("genericTypeAnnotation")
  var genericTypeAnnotation_Original: GenericTypeAnnotationBuilder
  
  def identifier(name: String): Identifier
  @JSName("identifier")
  var identifier_Original: IdentifierBuilder
  
  def ifStatement(test: ExpressionKind, consequent: StatementKind): IfStatement
  def ifStatement(test: ExpressionKind, consequent: StatementKind, alternate: StatementKind): IfStatement
  @JSName("ifStatement")
  var ifStatement_Original: IfStatementBuilder
  
  def `import`(): Import
  
  def importDeclaration(
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    source: LiteralKind
  ): ImportDeclaration
  def importDeclaration(specifiers: Unit, source: LiteralKind): ImportDeclaration
  @JSName("importDeclaration")
  var importDeclaration_Original: ImportDeclarationBuilder
  @JSName("importDeclaration")
  def importDeclaration_type(
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    source: LiteralKind,
    importKind: `type`
  ): ImportDeclaration
  @JSName("importDeclaration")
  def importDeclaration_type(specifiers: Unit, source: LiteralKind, importKind: `type`): ImportDeclaration
  @JSName("importDeclaration")
  def importDeclaration_typeof(
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    source: LiteralKind,
    importKind: typeof
  ): ImportDeclaration
  @JSName("importDeclaration")
  def importDeclaration_typeof(specifiers: Unit, source: LiteralKind, importKind: typeof): ImportDeclaration
  @JSName("importDeclaration")
  def importDeclaration_value(
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    source: LiteralKind,
    importKind: value
  ): ImportDeclaration
  @JSName("importDeclaration")
  def importDeclaration_value(specifiers: Unit, source: LiteralKind, importKind: value): ImportDeclaration
  
  def importDefaultSpecifier(): ImportDefaultSpecifier
  def importDefaultSpecifier(local: IdentifierKind): ImportDefaultSpecifier
  @JSName("importDefaultSpecifier")
  var importDefaultSpecifier_Original: ImportDefaultSpecifierBuilder
  
  def importExpression(source: ExpressionKind): ImportExpression
  @JSName("importExpression")
  var importExpression_Original: ImportExpressionBuilder
  
  def importNamespaceSpecifier(): ImportNamespaceSpecifier
  def importNamespaceSpecifier(local: IdentifierKind): ImportNamespaceSpecifier
  @JSName("importNamespaceSpecifier")
  var importNamespaceSpecifier_Original: ImportNamespaceSpecifierBuilder
  
  def importSpecifier(imported: IdentifierKind): ImportSpecifier
  def importSpecifier(imported: IdentifierKind, local: IdentifierKind): ImportSpecifier
  @JSName("importSpecifier")
  var importSpecifier_Original: ImportSpecifierBuilder
  
  @JSName("import")
  var import_Original: ImportBuilder
  
  def inferredPredicate(): InferredPredicate
  @JSName("inferredPredicate")
  var inferredPredicate_Original: InferredPredicateBuilder
  
  def interfaceDeclaration(id: IdentifierKind, body: ObjectTypeAnnotationKind, extendsParam: js.Array[InterfaceExtendsKind]): InterfaceDeclaration
  @JSName("interfaceDeclaration")
  var interfaceDeclaration_Original: InterfaceDeclarationBuilder
  
  def interfaceExtends(id: IdentifierKind): InterfaceExtends
  @JSName("interfaceExtends")
  var interfaceExtends_Original: InterfaceExtendsBuilder
  
  def interfaceTypeAnnotation(body: ObjectTypeAnnotationKind): InterfaceTypeAnnotation
  def interfaceTypeAnnotation(body: ObjectTypeAnnotationKind, extendsParam: js.Array[InterfaceExtendsKind]): InterfaceTypeAnnotation
  @JSName("interfaceTypeAnnotation")
  var interfaceTypeAnnotation_Original: InterfaceTypeAnnotationBuilder
  
  def interpreterDirective(value: String): InterpreterDirective
  @JSName("interpreterDirective")
  var interpreterDirective_Original: InterpreterDirectiveBuilder
  
  def intersectionTypeAnnotation(types: js.Array[FlowTypeKind]): IntersectionTypeAnnotation
  @JSName("intersectionTypeAnnotation")
  var intersectionTypeAnnotation_Original: IntersectionTypeAnnotationBuilder
  
  def jsxAttribute(name: JSXIdentifierKind): JSXAttribute
  def jsxAttribute(name: JSXIdentifierKind, value: JSXElementKind): JSXAttribute
  def jsxAttribute(name: JSXIdentifierKind, value: JSXExpressionContainerKind): JSXAttribute
  def jsxAttribute(name: JSXIdentifierKind, value: JSXFragmentKind): JSXAttribute
  def jsxAttribute(name: JSXIdentifierKind, value: LiteralKind): JSXAttribute
  def jsxAttribute(name: JSXNamespacedNameKind): JSXAttribute
  def jsxAttribute(name: JSXNamespacedNameKind, value: JSXElementKind): JSXAttribute
  def jsxAttribute(name: JSXNamespacedNameKind, value: JSXExpressionContainerKind): JSXAttribute
  def jsxAttribute(name: JSXNamespacedNameKind, value: JSXFragmentKind): JSXAttribute
  def jsxAttribute(name: JSXNamespacedNameKind, value: LiteralKind): JSXAttribute
  @JSName("jsxAttribute")
  var jsxAttribute_Original: JSXAttributeBuilder
  
  def jsxClosingElement(name: JSXIdentifierKind): JSXClosingElement
  def jsxClosingElement(name: JSXMemberExpressionKind): JSXClosingElement
  def jsxClosingElement(name: JSXNamespacedNameKind): JSXClosingElement
  @JSName("jsxClosingElement")
  var jsxClosingElement_Original: JSXClosingElementBuilder
  
  def jsxClosingFragment(): JSXClosingFragment
  @JSName("jsxClosingFragment")
  var jsxClosingFragment_Original: JSXClosingFragmentBuilder
  
  def jsxElement(openingElement: JSXOpeningElementKind): JSXElement
  def jsxElement(
    openingElement: JSXOpeningElementKind,
    closingElement: Null,
    children: js.Array[
      JSXTextKind | JSXExpressionContainerKind | JSXSpreadChildKind | JSXElementKind | JSXFragmentKind | LiteralKind
    ]
  ): JSXElement
  def jsxElement(
    openingElement: JSXOpeningElementKind,
    closingElement: Unit,
    children: js.Array[
      JSXTextKind | JSXExpressionContainerKind | JSXSpreadChildKind | JSXElementKind | JSXFragmentKind | LiteralKind
    ]
  ): JSXElement
  def jsxElement(openingElement: JSXOpeningElementKind, closingElement: JSXClosingElementKind): JSXElement
  def jsxElement(
    openingElement: JSXOpeningElementKind,
    closingElement: JSXClosingElementKind,
    children: js.Array[
      JSXTextKind | JSXExpressionContainerKind | JSXSpreadChildKind | JSXElementKind | JSXFragmentKind | LiteralKind
    ]
  ): JSXElement
  @JSName("jsxElement")
  var jsxElement_Original: JSXElementBuilder
  
  def jsxEmptyExpression(): JSXEmptyExpression
  @JSName("jsxEmptyExpression")
  var jsxEmptyExpression_Original: JSXEmptyExpressionBuilder
  
  def jsxExpressionContainer(expression: ExpressionKind): JSXExpressionContainer
  def jsxExpressionContainer(expression: JSXEmptyExpressionKind): JSXExpressionContainer
  @JSName("jsxExpressionContainer")
  var jsxExpressionContainer_Original: JSXExpressionContainerBuilder
  
  def jsxFragment(openingFragment: JSXOpeningFragmentKind, closingFragment: JSXClosingFragmentKind): JSXFragment
  def jsxFragment(
    openingFragment: JSXOpeningFragmentKind,
    closingFragment: JSXClosingFragmentKind,
    children: js.Array[
      JSXTextKind | JSXExpressionContainerKind | JSXSpreadChildKind | JSXElementKind | JSXFragmentKind | LiteralKind
    ]
  ): JSXFragment
  @JSName("jsxFragment")
  var jsxFragment_Original: JSXFragmentBuilder
  
  def jsxIdentifier(name: String): JSXIdentifier
  @JSName("jsxIdentifier")
  var jsxIdentifier_Original: JSXIdentifierBuilder
  
  def jsxMemberExpression(`object`: JSXIdentifierKind, property: JSXIdentifierKind): JSXMemberExpression
  def jsxMemberExpression(`object`: JSXMemberExpressionKind, property: JSXIdentifierKind): JSXMemberExpression
  @JSName("jsxMemberExpression")
  var jsxMemberExpression_Original: JSXMemberExpressionBuilder
  
  def jsxNamespacedName(namespace: JSXIdentifierKind, name: JSXIdentifierKind): JSXNamespacedName
  @JSName("jsxNamespacedName")
  var jsxNamespacedName_Original: JSXNamespacedNameBuilder
  
  def jsxOpeningElement(name: JSXIdentifierKind): JSXOpeningElement
  def jsxOpeningElement(name: JSXIdentifierKind, attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind]): JSXOpeningElement
  def jsxOpeningElement(
    name: JSXIdentifierKind,
    attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind],
    selfClosing: Boolean
  ): JSXOpeningElement
  def jsxOpeningElement(name: JSXIdentifierKind, attributes: Unit, selfClosing: Boolean): JSXOpeningElement
  def jsxOpeningElement(name: JSXMemberExpressionKind): JSXOpeningElement
  def jsxOpeningElement(name: JSXMemberExpressionKind, attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind]): JSXOpeningElement
  def jsxOpeningElement(
    name: JSXMemberExpressionKind,
    attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind],
    selfClosing: Boolean
  ): JSXOpeningElement
  def jsxOpeningElement(name: JSXMemberExpressionKind, attributes: Unit, selfClosing: Boolean): JSXOpeningElement
  def jsxOpeningElement(name: JSXNamespacedNameKind): JSXOpeningElement
  def jsxOpeningElement(name: JSXNamespacedNameKind, attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind]): JSXOpeningElement
  def jsxOpeningElement(
    name: JSXNamespacedNameKind,
    attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind],
    selfClosing: Boolean
  ): JSXOpeningElement
  def jsxOpeningElement(name: JSXNamespacedNameKind, attributes: Unit, selfClosing: Boolean): JSXOpeningElement
  @JSName("jsxOpeningElement")
  var jsxOpeningElement_Original: JSXOpeningElementBuilder
  
  def jsxOpeningFragment(): JSXOpeningFragment
  @JSName("jsxOpeningFragment")
  var jsxOpeningFragment_Original: JSXOpeningFragmentBuilder
  
  def jsxSpreadAttribute(argument: ExpressionKind): JSXSpreadAttribute
  @JSName("jsxSpreadAttribute")
  var jsxSpreadAttribute_Original: JSXSpreadAttributeBuilder
  
  def jsxSpreadChild(expression: ExpressionKind): JSXSpreadChild
  @JSName("jsxSpreadChild")
  var jsxSpreadChild_Original: JSXSpreadChildBuilder
  
  def jsxText(value: String): JSXText
  def jsxText(value: String, raw: String): JSXText
  @JSName("jsxText")
  var jsxText_Original: JSXTextBuilder
  
  def labeledStatement(label: IdentifierKind, body: StatementKind): LabeledStatement
  @JSName("labeledStatement")
  var labeledStatement_Original: LabeledStatementBuilder
  
  def line(value: String): Line
  def line(value: String, leading: Boolean): Line
  def line(value: String, leading: Boolean, trailing: Boolean): Line
  def line(value: String, leading: Unit, trailing: Boolean): Line
  @JSName("line")
  var line_Original: LineBuilder
  
  def literal(): Literal
  def literal(value: String): Literal
  def literal(value: Boolean): Literal
  def literal(value: Double): Literal
  def literal(value: RegExp): Literal
  @JSName("literal")
  var literal_Original: LiteralBuilder
  
  def logicalExpression(operator: AmpersandAmpersand, left: ExpressionKind, right: ExpressionKind): LogicalExpression
  def logicalExpression(operator: QuestionmarkQuestionmark, left: ExpressionKind, right: ExpressionKind): LogicalExpression
  def logicalExpression(operator: VerticallineVerticalline, left: ExpressionKind, right: ExpressionKind): LogicalExpression
  @JSName("logicalExpression")
  var logicalExpression_Original: LogicalExpressionBuilder
  
  def memberExpression(`object`: ExpressionKind, property: ExpressionKind): MemberExpression
  def memberExpression(`object`: ExpressionKind, property: ExpressionKind, computed: Boolean): MemberExpression
  def memberExpression(`object`: ExpressionKind, property: IdentifierKind): MemberExpression
  def memberExpression(`object`: ExpressionKind, property: IdentifierKind, computed: Boolean): MemberExpression
  @JSName("memberExpression")
  var memberExpression_Original: MemberExpressionBuilder
  
  def memberTypeAnnotation(`object`: IdentifierKind, property: GenericTypeAnnotationKind): MemberTypeAnnotation
  def memberTypeAnnotation(`object`: IdentifierKind, property: MemberTypeAnnotationKind): MemberTypeAnnotation
  @JSName("memberTypeAnnotation")
  var memberTypeAnnotation_Original: MemberTypeAnnotationBuilder
  
  def metaProperty(meta: IdentifierKind, property: IdentifierKind): MetaProperty
  @JSName("metaProperty")
  var metaProperty_Original: MetaPropertyBuilder
  
  @JSName("methodDefinition")
  var methodDefinition_Original: MethodDefinitionBuilder
  @JSName("methodDefinition")
  def methodDefinition_constructor(kind: constructor, key: ExpressionKind, value: FunctionKind): MethodDefinition
  @JSName("methodDefinition")
  def methodDefinition_constructor(kind: constructor, key: ExpressionKind, value: FunctionKind, staticParam: Boolean): MethodDefinition
  @JSName("methodDefinition")
  def methodDefinition_get(kind: get, key: ExpressionKind, value: FunctionKind): MethodDefinition
  @JSName("methodDefinition")
  def methodDefinition_get(kind: get, key: ExpressionKind, value: FunctionKind, staticParam: Boolean): MethodDefinition
  @JSName("methodDefinition")
  def methodDefinition_method(kind: method, key: ExpressionKind, value: FunctionKind): MethodDefinition
  @JSName("methodDefinition")
  def methodDefinition_method(kind: method, key: ExpressionKind, value: FunctionKind, staticParam: Boolean): MethodDefinition
  @JSName("methodDefinition")
  def methodDefinition_set(kind: set, key: ExpressionKind, value: FunctionKind): MethodDefinition
  @JSName("methodDefinition")
  def methodDefinition_set(kind: set, key: ExpressionKind, value: FunctionKind, staticParam: Boolean): MethodDefinition
  
  def mixedTypeAnnotation(): MixedTypeAnnotation
  @JSName("mixedTypeAnnotation")
  var mixedTypeAnnotation_Original: MixedTypeAnnotationBuilder
  
  def newExpression(callee: ExpressionKind, argumentsParam: js.Array[ExpressionKind | SpreadElementKind]): NewExpression
  @JSName("newExpression")
  var newExpression_Original: NewExpressionBuilder
  
  def noop(): Noop
  @JSName("noop")
  var noop_Original: NoopBuilder
  
  def nullLiteral(): NullLiteral
  
  def nullLiteralTypeAnnotation(): NullLiteralTypeAnnotation
  @JSName("nullLiteralTypeAnnotation")
  var nullLiteralTypeAnnotation_Original: NullLiteralTypeAnnotationBuilder
  
  @JSName("nullLiteral")
  var nullLiteral_Original: NullLiteralBuilder
  
  def nullTypeAnnotation(): NullTypeAnnotation
  @JSName("nullTypeAnnotation")
  var nullTypeAnnotation_Original: NullTypeAnnotationBuilder
  
  def nullableTypeAnnotation(typeAnnotation: FlowTypeKind): NullableTypeAnnotation
  @JSName("nullableTypeAnnotation")
  var nullableTypeAnnotation_Original: NullableTypeAnnotationBuilder
  
  def numberLiteralTypeAnnotation(value: Double, raw: String): NumberLiteralTypeAnnotation
  @JSName("numberLiteralTypeAnnotation")
  var numberLiteralTypeAnnotation_Original: NumberLiteralTypeAnnotationBuilder
  
  def numberTypeAnnotation(): NumberTypeAnnotation
  @JSName("numberTypeAnnotation")
  var numberTypeAnnotation_Original: NumberTypeAnnotationBuilder
  
  def numericLiteral(value: Double): NumericLiteral
  
  def numericLiteralTypeAnnotation(value: Double, raw: String): NumericLiteralTypeAnnotation
  @JSName("numericLiteralTypeAnnotation")
  var numericLiteralTypeAnnotation_Original: NumericLiteralTypeAnnotationBuilder
  
  @JSName("numericLiteral")
  var numericLiteral_Original: NumericLiteralBuilder
  
  def objectExpression(
    properties: js.Array[
      PropertyKind | ObjectMethodKind | ObjectPropertyKind | SpreadPropertyKind | SpreadElementKind
    ]
  ): ObjectExpression
  @JSName("objectExpression")
  var objectExpression_Original: ObjectExpressionBuilder
  
  @JSName("objectMethod")
  var objectMethod_Original: ObjectMethodBuilder
  @JSName("objectMethod")
  def objectMethod_get(kind: get, key: ExpressionKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod
  @JSName("objectMethod")
  def objectMethod_get(
    kind: get,
    key: ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod
  @JSName("objectMethod")
  def objectMethod_get(kind: get, key: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod
  @JSName("objectMethod")
  def objectMethod_get(
    kind: get,
    key: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod
  @JSName("objectMethod")
  def objectMethod_get(kind: get, key: LiteralKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod
  @JSName("objectMethod")
  def objectMethod_get(
    kind: get,
    key: LiteralKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod
  @JSName("objectMethod")
  def objectMethod_method(kind: method, key: ExpressionKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod
  @JSName("objectMethod")
  def objectMethod_method(
    kind: method,
    key: ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod
  @JSName("objectMethod")
  def objectMethod_method(kind: method, key: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod
  @JSName("objectMethod")
  def objectMethod_method(
    kind: method,
    key: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod
  @JSName("objectMethod")
  def objectMethod_method(kind: method, key: LiteralKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod
  @JSName("objectMethod")
  def objectMethod_method(
    kind: method,
    key: LiteralKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod
  @JSName("objectMethod")
  def objectMethod_set(kind: set, key: ExpressionKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod
  @JSName("objectMethod")
  def objectMethod_set(
    kind: set,
    key: ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod
  @JSName("objectMethod")
  def objectMethod_set(kind: set, key: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod
  @JSName("objectMethod")
  def objectMethod_set(
    kind: set,
    key: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod
  @JSName("objectMethod")
  def objectMethod_set(kind: set, key: LiteralKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod
  @JSName("objectMethod")
  def objectMethod_set(
    kind: set,
    key: LiteralKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod
  
  def objectPattern(
    properties: js.Array[
      PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind
    ]
  ): ObjectPattern
  @JSName("objectPattern")
  var objectPattern_Original: ObjectPatternBuilder
  
  def objectProperty(key: ExpressionKind, value: ExpressionKind): ObjectProperty
  def objectProperty(key: ExpressionKind, value: PatternKind): ObjectProperty
  def objectProperty(key: IdentifierKind, value: ExpressionKind): ObjectProperty
  def objectProperty(key: IdentifierKind, value: PatternKind): ObjectProperty
  def objectProperty(key: LiteralKind, value: ExpressionKind): ObjectProperty
  def objectProperty(key: LiteralKind, value: PatternKind): ObjectProperty
  @JSName("objectProperty")
  var objectProperty_Original: ObjectPropertyBuilder
  
  def objectTypeAnnotation(properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind]): ObjectTypeAnnotation
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind],
    indexers: js.Array[ObjectTypeIndexerKind]
  ): ObjectTypeAnnotation
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind],
    indexers: js.Array[ObjectTypeIndexerKind],
    callProperties: js.Array[ObjectTypeCallPropertyKind]
  ): ObjectTypeAnnotation
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind],
    indexers: Unit,
    callProperties: js.Array[ObjectTypeCallPropertyKind]
  ): ObjectTypeAnnotation
  @JSName("objectTypeAnnotation")
  var objectTypeAnnotation_Original: ObjectTypeAnnotationBuilder
  
  def objectTypeCallProperty(value: FunctionTypeAnnotationKind): ObjectTypeCallProperty
  @JSName("objectTypeCallProperty")
  var objectTypeCallProperty_Original: ObjectTypeCallPropertyBuilder
  
  def objectTypeIndexer(id: IdentifierKind, key: FlowTypeKind, value: FlowTypeKind): ObjectTypeIndexer
  @JSName("objectTypeIndexer")
  var objectTypeIndexer_Original: ObjectTypeIndexerBuilder
  
  def objectTypeInternalSlot(id: IdentifierKind, value: FlowTypeKind, optional: Boolean, staticParam: Boolean, method: Boolean): ObjectTypeInternalSlot
  @JSName("objectTypeInternalSlot")
  var objectTypeInternalSlot_Original: ObjectTypeInternalSlotBuilder
  
  def objectTypeProperty(key: IdentifierKind, value: FlowTypeKind, optional: Boolean): ObjectTypeProperty
  def objectTypeProperty(key: LiteralKind, value: FlowTypeKind, optional: Boolean): ObjectTypeProperty
  @JSName("objectTypeProperty")
  var objectTypeProperty_Original: ObjectTypePropertyBuilder
  
  def objectTypeSpreadProperty(argument: FlowTypeKind): ObjectTypeSpreadProperty
  @JSName("objectTypeSpreadProperty")
  var objectTypeSpreadProperty_Original: ObjectTypeSpreadPropertyBuilder
  
  def opaqueType(id: IdentifierKind, typeParameters: Null, impltype: FlowTypeKind): OpaqueType
  def opaqueType(id: IdentifierKind, typeParameters: Null, impltype: FlowTypeKind, supertype: FlowTypeKind): OpaqueType
  def opaqueType(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind, impltype: FlowTypeKind): OpaqueType
  def opaqueType(
    id: IdentifierKind,
    typeParameters: TypeParameterDeclarationKind,
    impltype: FlowTypeKind,
    supertype: FlowTypeKind
  ): OpaqueType
  @JSName("opaqueType")
  var opaqueType_Original: OpaqueTypeBuilder
  
  def optionalCallExpression(callee: ExpressionKind, argumentsParam: js.Array[ExpressionKind | SpreadElementKind]): OptionalCallExpression
  def optionalCallExpression(
    callee: ExpressionKind,
    argumentsParam: js.Array[ExpressionKind | SpreadElementKind],
    optional: Boolean
  ): OptionalCallExpression
  @JSName("optionalCallExpression")
  var optionalCallExpression_Original: OptionalCallExpressionBuilder
  
  def optionalMemberExpression(`object`: ExpressionKind, property: ExpressionKind): OptionalMemberExpression
  def optionalMemberExpression(`object`: ExpressionKind, property: ExpressionKind, computed: Boolean): OptionalMemberExpression
  def optionalMemberExpression(`object`: ExpressionKind, property: ExpressionKind, computed: Boolean, optional: Boolean): OptionalMemberExpression
  def optionalMemberExpression(`object`: ExpressionKind, property: ExpressionKind, computed: Unit, optional: Boolean): OptionalMemberExpression
  def optionalMemberExpression(`object`: ExpressionKind, property: IdentifierKind): OptionalMemberExpression
  def optionalMemberExpression(`object`: ExpressionKind, property: IdentifierKind, computed: Boolean): OptionalMemberExpression
  def optionalMemberExpression(`object`: ExpressionKind, property: IdentifierKind, computed: Boolean, optional: Boolean): OptionalMemberExpression
  def optionalMemberExpression(`object`: ExpressionKind, property: IdentifierKind, computed: Unit, optional: Boolean): OptionalMemberExpression
  @JSName("optionalMemberExpression")
  var optionalMemberExpression_Original: OptionalMemberExpressionBuilder
  
  def parenthesizedExpression(expression: ExpressionKind): ParenthesizedExpression
  @JSName("parenthesizedExpression")
  var parenthesizedExpression_Original: ParenthesizedExpressionBuilder
  
  def privateName(id: IdentifierKind): PrivateName
  @JSName("privateName")
  var privateName_Original: PrivateNameBuilder
  
  def program(body: js.Array[StatementKind]): Program
  @JSName("program")
  var program_Original: ProgramBuilder
  
  def propertyPattern(key: ExpressionKind, pattern: PatternKind): PropertyPattern
  def propertyPattern(key: IdentifierKind, pattern: PatternKind): PropertyPattern
  def propertyPattern(key: LiteralKind, pattern: PatternKind): PropertyPattern
  @JSName("propertyPattern")
  var propertyPattern_Original: PropertyPatternBuilder
  
  @JSName("property")
  var property_Original: PropertyBuilder
  @JSName("property")
  def property_get(kind: get, key: ExpressionKind, value: ExpressionKind): Property
  @JSName("property")
  def property_get(kind: get, key: ExpressionKind, value: PatternKind): Property
  @JSName("property")
  def property_get(kind: get, key: IdentifierKind, value: ExpressionKind): Property
  @JSName("property")
  def property_get(kind: get, key: IdentifierKind, value: PatternKind): Property
  @JSName("property")
  def property_get(kind: get, key: LiteralKind, value: ExpressionKind): Property
  @JSName("property")
  def property_get(kind: get, key: LiteralKind, value: PatternKind): Property
  @JSName("property")
  def property_init(kind: init, key: ExpressionKind, value: ExpressionKind): Property
  @JSName("property")
  def property_init(kind: init, key: ExpressionKind, value: PatternKind): Property
  @JSName("property")
  def property_init(kind: init, key: IdentifierKind, value: ExpressionKind): Property
  @JSName("property")
  def property_init(kind: init, key: IdentifierKind, value: PatternKind): Property
  @JSName("property")
  def property_init(kind: init, key: LiteralKind, value: ExpressionKind): Property
  @JSName("property")
  def property_init(kind: init, key: LiteralKind, value: PatternKind): Property
  @JSName("property")
  def property_set(kind: set, key: ExpressionKind, value: ExpressionKind): Property
  @JSName("property")
  def property_set(kind: set, key: ExpressionKind, value: PatternKind): Property
  @JSName("property")
  def property_set(kind: set, key: IdentifierKind, value: ExpressionKind): Property
  @JSName("property")
  def property_set(kind: set, key: IdentifierKind, value: PatternKind): Property
  @JSName("property")
  def property_set(kind: set, key: LiteralKind, value: ExpressionKind): Property
  @JSName("property")
  def property_set(kind: set, key: LiteralKind, value: PatternKind): Property
  
  def qualifiedTypeIdentifier(qualification: IdentifierKind, id: IdentifierKind): QualifiedTypeIdentifier
  def qualifiedTypeIdentifier(qualification: QualifiedTypeIdentifierKind, id: IdentifierKind): QualifiedTypeIdentifier
  @JSName("qualifiedTypeIdentifier")
  var qualifiedTypeIdentifier_Original: QualifiedTypeIdentifierBuilder
  
  def regExpLiteral(pattern: String, flags: String): RegExpLiteral
  @JSName("regExpLiteral")
  var regExpLiteral_Original: RegExpLiteralBuilder
  
  def restElement(argument: PatternKind): RestElement
  @JSName("restElement")
  var restElement_Original: RestElementBuilder
  
  def restProperty(argument: ExpressionKind): RestProperty
  @JSName("restProperty")
  var restProperty_Original: RestPropertyBuilder
  
  def returnStatement(): ReturnStatement
  def returnStatement(argument: ExpressionKind): ReturnStatement
  @JSName("returnStatement")
  var returnStatement_Original: ReturnStatementBuilder
  
  def sequenceExpression(expressions: js.Array[ExpressionKind]): SequenceExpression
  @JSName("sequenceExpression")
  var sequenceExpression_Original: SequenceExpressionBuilder
  
  def spreadElement(argument: ExpressionKind): SpreadElement
  
  def spreadElementPattern(argument: PatternKind): SpreadElementPattern
  @JSName("spreadElementPattern")
  var spreadElementPattern_Original: SpreadElementPatternBuilder
  
  @JSName("spreadElement")
  var spreadElement_Original: SpreadElementBuilder
  
  def spreadProperty(argument: ExpressionKind): SpreadProperty
  
  def spreadPropertyPattern(argument: PatternKind): SpreadPropertyPattern
  @JSName("spreadPropertyPattern")
  var spreadPropertyPattern_Original: SpreadPropertyPatternBuilder
  
  @JSName("spreadProperty")
  var spreadProperty_Original: SpreadPropertyBuilder
  
  def stringLiteral(value: String): StringLiteral
  
  def stringLiteralTypeAnnotation(value: String, raw: String): StringLiteralTypeAnnotation
  @JSName("stringLiteralTypeAnnotation")
  var stringLiteralTypeAnnotation_Original: StringLiteralTypeAnnotationBuilder
  
  @JSName("stringLiteral")
  var stringLiteral_Original: StringLiteralBuilder
  
  def stringTypeAnnotation(): StringTypeAnnotation
  @JSName("stringTypeAnnotation")
  var stringTypeAnnotation_Original: StringTypeAnnotationBuilder
  
  def `super`(): Super
  @JSName("super")
  var super_Original: SuperBuilder
  
  def switchCase(test: Null, consequent: js.Array[StatementKind]): SwitchCase
  def switchCase(test: ExpressionKind, consequent: js.Array[StatementKind]): SwitchCase
  @JSName("switchCase")
  var switchCase_Original: SwitchCaseBuilder
  
  def switchStatement(discriminant: ExpressionKind, cases: js.Array[SwitchCaseKind]): SwitchStatement
  def switchStatement(discriminant: ExpressionKind, cases: js.Array[SwitchCaseKind], lexical: Boolean): SwitchStatement
  @JSName("switchStatement")
  var switchStatement_Original: SwitchStatementBuilder
  
  def symbolTypeAnnotation(): SymbolTypeAnnotation
  @JSName("symbolTypeAnnotation")
  var symbolTypeAnnotation_Original: SymbolTypeAnnotationBuilder
  
  def taggedTemplateExpression(tag: ExpressionKind, quasi: TemplateLiteralKind): TaggedTemplateExpression
  @JSName("taggedTemplateExpression")
  var taggedTemplateExpression_Original: TaggedTemplateExpressionBuilder
  
  def templateElement(value: Cooked, tail: Boolean): TemplateElement
  @JSName("templateElement")
  var templateElement_Original: TemplateElementBuilder
  
  def templateLiteral(quasis: js.Array[TemplateElementKind], expressions: js.Array[ExpressionKind]): TemplateLiteral
  @JSName("templateLiteral")
  var templateLiteral_Original: TemplateLiteralBuilder
  
  def thisExpression(): ThisExpression
  @JSName("thisExpression")
  var thisExpression_Original: ThisExpressionBuilder
  
  def thisTypeAnnotation(): ThisTypeAnnotation
  @JSName("thisTypeAnnotation")
  var thisTypeAnnotation_Original: ThisTypeAnnotationBuilder
  
  def throwStatement(argument: ExpressionKind): ThrowStatement
  @JSName("throwStatement")
  var throwStatement_Original: ThrowStatementBuilder
  
  def tryStatement(block: BlockStatementKind): TryStatement
  def tryStatement(block: BlockStatementKind, handler: Null, finalizer: BlockStatementKind): TryStatement
  def tryStatement(block: BlockStatementKind, handler: Unit, finalizer: BlockStatementKind): TryStatement
  def tryStatement(block: BlockStatementKind, handler: CatchClauseKind): TryStatement
  def tryStatement(block: BlockStatementKind, handler: CatchClauseKind, finalizer: BlockStatementKind): TryStatement
  @JSName("tryStatement")
  var tryStatement_Original: TryStatementBuilder
  
  def tsAnyKeyword(): TSAnyKeyword
  @JSName("tsAnyKeyword")
  var tsAnyKeyword_Original: TSAnyKeywordBuilder
  
  def tsArrayType(elementType: TSTypeKind): TSArrayType
  @JSName("tsArrayType")
  var tsArrayType_Original: TSArrayTypeBuilder
  
  def tsAsExpression(expression: ExpressionKind, typeAnnotation: TSTypeKind): TSAsExpression
  @JSName("tsAsExpression")
  var tsAsExpression_Original: TSAsExpressionBuilder
  
  def tsBigIntKeyword(): TSBigIntKeyword
  @JSName("tsBigIntKeyword")
  var tsBigIntKeyword_Original: TSBigIntKeywordBuilder
  
  def tsBooleanKeyword(): TSBooleanKeyword
  @JSName("tsBooleanKeyword")
  var tsBooleanKeyword_Original: TSBooleanKeywordBuilder
  
  def tsCallSignatureDeclaration(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): TSCallSignatureDeclaration
  def tsCallSignatureDeclaration(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    typeAnnotation: TSTypeAnnotationKind
  ): TSCallSignatureDeclaration
  @JSName("tsCallSignatureDeclaration")
  var tsCallSignatureDeclaration_Original: TSCallSignatureDeclarationBuilder
  
  def tsConditionalType(checkType: TSTypeKind, extendsType: TSTypeKind, trueType: TSTypeKind, falseType: TSTypeKind): TSConditionalType
  @JSName("tsConditionalType")
  var tsConditionalType_Original: TSConditionalTypeBuilder
  
  def tsConstructSignatureDeclaration(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): TSConstructSignatureDeclaration
  def tsConstructSignatureDeclaration(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    typeAnnotation: TSTypeAnnotationKind
  ): TSConstructSignatureDeclaration
  @JSName("tsConstructSignatureDeclaration")
  var tsConstructSignatureDeclaration_Original: TSConstructSignatureDeclarationBuilder
  
  def tsConstructorType(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): TSConstructorType
  @JSName("tsConstructorType")
  var tsConstructorType_Original: TSConstructorTypeBuilder
  
  def tsDeclareFunction(id: Null, params: js.Array[PatternKind]): TSDeclareFunction
  def tsDeclareFunction(id: Null, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareFunction
  def tsDeclareFunction(id: Null, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareFunction
  def tsDeclareFunction(id: Unit, params: js.Array[PatternKind]): TSDeclareFunction
  def tsDeclareFunction(id: Unit, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareFunction
  def tsDeclareFunction(id: Unit, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareFunction
  def tsDeclareFunction(id: IdentifierKind, params: js.Array[PatternKind]): TSDeclareFunction
  def tsDeclareFunction(id: IdentifierKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareFunction
  def tsDeclareFunction(id: IdentifierKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareFunction
  @JSName("tsDeclareFunction")
  var tsDeclareFunction_Original: TSDeclareFunctionBuilder
  
  def tsDeclareMethod(key: ExpressionKind, params: js.Array[PatternKind]): TSDeclareMethod
  def tsDeclareMethod(key: ExpressionKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareMethod
  def tsDeclareMethod(key: ExpressionKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareMethod
  def tsDeclareMethod(key: IdentifierKind, params: js.Array[PatternKind]): TSDeclareMethod
  def tsDeclareMethod(key: IdentifierKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareMethod
  def tsDeclareMethod(key: IdentifierKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareMethod
  def tsDeclareMethod(key: NumericLiteralKind, params: js.Array[PatternKind]): TSDeclareMethod
  def tsDeclareMethod(key: NumericLiteralKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareMethod
  def tsDeclareMethod(key: NumericLiteralKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareMethod
  def tsDeclareMethod(key: StringLiteralKind, params: js.Array[PatternKind]): TSDeclareMethod
  def tsDeclareMethod(key: StringLiteralKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareMethod
  def tsDeclareMethod(key: StringLiteralKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareMethod
  @JSName("tsDeclareMethod")
  var tsDeclareMethod_Original: TSDeclareMethodBuilder
  
  def tsEnumDeclaration(id: IdentifierKind, members: js.Array[TSEnumMemberKind]): TSEnumDeclaration
  @JSName("tsEnumDeclaration")
  var tsEnumDeclaration_Original: TSEnumDeclarationBuilder
  
  def tsEnumMember(id: IdentifierKind): TSEnumMember
  def tsEnumMember(id: IdentifierKind, initializer: ExpressionKind): TSEnumMember
  def tsEnumMember(id: StringLiteralKind): TSEnumMember
  def tsEnumMember(id: StringLiteralKind, initializer: ExpressionKind): TSEnumMember
  @JSName("tsEnumMember")
  var tsEnumMember_Original: TSEnumMemberBuilder
  
  def tsExportAssignment(expression: ExpressionKind): TSExportAssignment
  @JSName("tsExportAssignment")
  var tsExportAssignment_Original: TSExportAssignmentBuilder
  
  def tsExpressionWithTypeArguments(expression: IdentifierKind): TSExpressionWithTypeArguments
  def tsExpressionWithTypeArguments(expression: IdentifierKind, typeParameters: TSTypeParameterInstantiationKind): TSExpressionWithTypeArguments
  def tsExpressionWithTypeArguments(expression: TSQualifiedNameKind): TSExpressionWithTypeArguments
  def tsExpressionWithTypeArguments(expression: TSQualifiedNameKind, typeParameters: TSTypeParameterInstantiationKind): TSExpressionWithTypeArguments
  @JSName("tsExpressionWithTypeArguments")
  var tsExpressionWithTypeArguments_Original: TSExpressionWithTypeArgumentsBuilder
  
  def tsExternalModuleReference(expression: StringLiteralKind): TSExternalModuleReference
  @JSName("tsExternalModuleReference")
  var tsExternalModuleReference_Original: TSExternalModuleReferenceBuilder
  
  def tsFunctionType(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): TSFunctionType
  @JSName("tsFunctionType")
  var tsFunctionType_Original: TSFunctionTypeBuilder
  
  def tsImportEqualsDeclaration(id: IdentifierKind, moduleReference: IdentifierKind): TSImportEqualsDeclaration
  def tsImportEqualsDeclaration(id: IdentifierKind, moduleReference: TSExternalModuleReferenceKind): TSImportEqualsDeclaration
  def tsImportEqualsDeclaration(id: IdentifierKind, moduleReference: TSQualifiedNameKind): TSImportEqualsDeclaration
  @JSName("tsImportEqualsDeclaration")
  var tsImportEqualsDeclaration_Original: TSImportEqualsDeclarationBuilder
  
  def tsImportType(argument: StringLiteralKind): TSImportType
  def tsImportType(argument: StringLiteralKind, qualifier: Unit, typeParameters: TSTypeParameterInstantiationKind): TSImportType
  def tsImportType(argument: StringLiteralKind, qualifier: IdentifierKind): TSImportType
  def tsImportType(
    argument: StringLiteralKind,
    qualifier: IdentifierKind,
    typeParameters: TSTypeParameterInstantiationKind
  ): TSImportType
  def tsImportType(argument: StringLiteralKind, qualifier: TSQualifiedNameKind): TSImportType
  def tsImportType(
    argument: StringLiteralKind,
    qualifier: TSQualifiedNameKind,
    typeParameters: TSTypeParameterInstantiationKind
  ): TSImportType
  @JSName("tsImportType")
  var tsImportType_Original: TSImportTypeBuilder
  
  def tsIndexSignature(parameters: js.Array[IdentifierKind]): TSIndexSignature
  def tsIndexSignature(parameters: js.Array[IdentifierKind], typeAnnotation: TSTypeAnnotationKind): TSIndexSignature
  @JSName("tsIndexSignature")
  var tsIndexSignature_Original: TSIndexSignatureBuilder
  
  def tsIndexedAccessType(objectType: TSTypeKind, indexType: TSTypeKind): TSIndexedAccessType
  @JSName("tsIndexedAccessType")
  var tsIndexedAccessType_Original: TSIndexedAccessTypeBuilder
  
  def tsInferType(typeParameter: TSTypeParameterKind): TSInferType
  @JSName("tsInferType")
  var tsInferType_Original: TSInferTypeBuilder
  
  def tsInterfaceBody(
    body: js.Array[
      TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ]
  ): TSInterfaceBody
  @JSName("tsInterfaceBody")
  var tsInterfaceBody_Original: TSInterfaceBodyBuilder
  
  def tsInterfaceDeclaration(id: IdentifierKind, body: TSInterfaceBodyKind): TSInterfaceDeclaration
  def tsInterfaceDeclaration(id: TSQualifiedNameKind, body: TSInterfaceBodyKind): TSInterfaceDeclaration
  @JSName("tsInterfaceDeclaration")
  var tsInterfaceDeclaration_Original: TSInterfaceDeclarationBuilder
  
  def tsIntersectionType(types: js.Array[TSTypeKind]): TSIntersectionType
  @JSName("tsIntersectionType")
  var tsIntersectionType_Original: TSIntersectionTypeBuilder
  
  def tsLiteralType(literal: BooleanLiteralKind): TSLiteralType
  def tsLiteralType(literal: NumericLiteralKind): TSLiteralType
  def tsLiteralType(literal: StringLiteralKind): TSLiteralType
  def tsLiteralType(literal: TemplateLiteralKind): TSLiteralType
  def tsLiteralType(literal: UnaryExpressionKind): TSLiteralType
  @JSName("tsLiteralType")
  var tsLiteralType_Original: TSLiteralTypeBuilder
  
  def tsMappedType(typeParameter: TSTypeParameterKind): TSMappedType
  def tsMappedType(typeParameter: TSTypeParameterKind, typeAnnotation: TSTypeKind): TSMappedType
  @JSName("tsMappedType")
  var tsMappedType_Original: TSMappedTypeBuilder
  
  def tsMethodSignature(
    key: ExpressionKind,
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]
  ): TSMethodSignature
  def tsMethodSignature(
    key: ExpressionKind,
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    typeAnnotation: TSTypeAnnotationKind
  ): TSMethodSignature
  @JSName("tsMethodSignature")
  var tsMethodSignature_Original: TSMethodSignatureBuilder
  
  def tsModuleBlock(body: js.Array[StatementKind]): TSModuleBlock
  @JSName("tsModuleBlock")
  var tsModuleBlock_Original: TSModuleBlockBuilder
  
  def tsModuleDeclaration(id: IdentifierKind): TSModuleDeclaration
  def tsModuleDeclaration(id: IdentifierKind, body: TSModuleBlockKind): TSModuleDeclaration
  def tsModuleDeclaration(id: IdentifierKind, body: TSModuleDeclarationKind): TSModuleDeclaration
  def tsModuleDeclaration(id: StringLiteralKind): TSModuleDeclaration
  def tsModuleDeclaration(id: StringLiteralKind, body: TSModuleBlockKind): TSModuleDeclaration
  def tsModuleDeclaration(id: StringLiteralKind, body: TSModuleDeclarationKind): TSModuleDeclaration
  def tsModuleDeclaration(id: TSQualifiedNameKind): TSModuleDeclaration
  def tsModuleDeclaration(id: TSQualifiedNameKind, body: TSModuleBlockKind): TSModuleDeclaration
  def tsModuleDeclaration(id: TSQualifiedNameKind, body: TSModuleDeclarationKind): TSModuleDeclaration
  @JSName("tsModuleDeclaration")
  var tsModuleDeclaration_Original: TSModuleDeclarationBuilder
  
  def tsNamedTupleMember(label: IdentifierKind, elementType: TSTypeKind): TSNamedTupleMember
  def tsNamedTupleMember(label: IdentifierKind, elementType: TSTypeKind, optional: Boolean): TSNamedTupleMember
  @JSName("tsNamedTupleMember")
  var tsNamedTupleMember_Original: TSNamedTupleMemberBuilder
  
  def tsNamespaceExportDeclaration(id: IdentifierKind): TSNamespaceExportDeclaration
  @JSName("tsNamespaceExportDeclaration")
  var tsNamespaceExportDeclaration_Original: TSNamespaceExportDeclarationBuilder
  
  def tsNeverKeyword(): TSNeverKeyword
  @JSName("tsNeverKeyword")
  var tsNeverKeyword_Original: TSNeverKeywordBuilder
  
  def tsNonNullExpression(expression: ExpressionKind): TSNonNullExpression
  @JSName("tsNonNullExpression")
  var tsNonNullExpression_Original: TSNonNullExpressionBuilder
  
  def tsNullKeyword(): TSNullKeyword
  @JSName("tsNullKeyword")
  var tsNullKeyword_Original: TSNullKeywordBuilder
  
  def tsNumberKeyword(): TSNumberKeyword
  @JSName("tsNumberKeyword")
  var tsNumberKeyword_Original: TSNumberKeywordBuilder
  
  def tsObjectKeyword(): TSObjectKeyword
  @JSName("tsObjectKeyword")
  var tsObjectKeyword_Original: TSObjectKeywordBuilder
  
  def tsOptionalType(typeAnnotation: TSTypeKind): TSOptionalType
  @JSName("tsOptionalType")
  var tsOptionalType_Original: TSOptionalTypeBuilder
  
  def tsParameterProperty(parameter: AssignmentPatternKind): TSParameterProperty
  def tsParameterProperty(parameter: IdentifierKind): TSParameterProperty
  @JSName("tsParameterProperty")
  var tsParameterProperty_Original: TSParameterPropertyBuilder
  
  def tsParenthesizedType(typeAnnotation: TSTypeKind): TSParenthesizedType
  @JSName("tsParenthesizedType")
  var tsParenthesizedType_Original: TSParenthesizedTypeBuilder
  
  def tsPropertySignature(key: ExpressionKind): TSPropertySignature
  def tsPropertySignature(key: ExpressionKind, typeAnnotation: Null, optional: Boolean): TSPropertySignature
  def tsPropertySignature(key: ExpressionKind, typeAnnotation: Unit, optional: Boolean): TSPropertySignature
  def tsPropertySignature(key: ExpressionKind, typeAnnotation: TSTypeAnnotationKind): TSPropertySignature
  def tsPropertySignature(key: ExpressionKind, typeAnnotation: TSTypeAnnotationKind, optional: Boolean): TSPropertySignature
  @JSName("tsPropertySignature")
  var tsPropertySignature_Original: TSPropertySignatureBuilder
  
  def tsQualifiedName(left: IdentifierKind, right: IdentifierKind): TSQualifiedName
  def tsQualifiedName(left: IdentifierKind, right: TSQualifiedNameKind): TSQualifiedName
  def tsQualifiedName(left: TSQualifiedNameKind, right: IdentifierKind): TSQualifiedName
  def tsQualifiedName(left: TSQualifiedNameKind, right: TSQualifiedNameKind): TSQualifiedName
  @JSName("tsQualifiedName")
  var tsQualifiedName_Original: TSQualifiedNameBuilder
  
  def tsRestType(typeAnnotation: TSTypeKind): TSRestType
  @JSName("tsRestType")
  var tsRestType_Original: TSRestTypeBuilder
  
  def tsStringKeyword(): TSStringKeyword
  @JSName("tsStringKeyword")
  var tsStringKeyword_Original: TSStringKeywordBuilder
  
  def tsSymbolKeyword(): TSSymbolKeyword
  @JSName("tsSymbolKeyword")
  var tsSymbolKeyword_Original: TSSymbolKeywordBuilder
  
  def tsThisType(): TSThisType
  @JSName("tsThisType")
  var tsThisType_Original: TSThisTypeBuilder
  
  def tsTupleType(elementTypes: js.Array[TSTypeKind | TSNamedTupleMemberKind]): TSTupleType
  @JSName("tsTupleType")
  var tsTupleType_Original: TSTupleTypeBuilder
  
  def tsTypeAliasDeclaration(id: IdentifierKind, typeAnnotation: TSTypeKind): TSTypeAliasDeclaration
  @JSName("tsTypeAliasDeclaration")
  var tsTypeAliasDeclaration_Original: TSTypeAliasDeclarationBuilder
  
  def tsTypeAnnotation(typeAnnotation: TSTypeAnnotationKind): TSTypeAnnotation
  def tsTypeAnnotation(typeAnnotation: TSTypeKind): TSTypeAnnotation
  @JSName("tsTypeAnnotation")
  var tsTypeAnnotation_Original: TSTypeAnnotationBuilder
  
  def tsTypeAssertion(typeAnnotation: TSTypeKind, expression: ExpressionKind): TSTypeAssertion
  @JSName("tsTypeAssertion")
  var tsTypeAssertion_Original: TSTypeAssertionBuilder
  
  def tsTypeLiteral(
    members: js.Array[
      TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ]
  ): TSTypeLiteral
  @JSName("tsTypeLiteral")
  var tsTypeLiteral_Original: TSTypeLiteralBuilder
  
  def tsTypeOperator(operator: String): TSTypeOperator
  @JSName("tsTypeOperator")
  var tsTypeOperator_Original: TSTypeOperatorBuilder
  
  def tsTypeParameter(name: String): TSTypeParameter
  def tsTypeParameter(name: String, constraint: Unit, defaultParam: TSTypeKind): TSTypeParameter
  def tsTypeParameter(name: String, constraint: TSTypeKind): TSTypeParameter
  def tsTypeParameter(name: String, constraint: TSTypeKind, defaultParam: TSTypeKind): TSTypeParameter
  
  def tsTypeParameterDeclaration(params: js.Array[TSTypeParameterKind]): TSTypeParameterDeclaration
  @JSName("tsTypeParameterDeclaration")
  var tsTypeParameterDeclaration_Original: TSTypeParameterDeclarationBuilder
  
  def tsTypeParameterInstantiation(params: js.Array[TSTypeKind]): TSTypeParameterInstantiation
  @JSName("tsTypeParameterInstantiation")
  var tsTypeParameterInstantiation_Original: TSTypeParameterInstantiationBuilder
  
  @JSName("tsTypeParameter")
  var tsTypeParameter_Original: TSTypeParameterBuilder
  
  def tsTypePredicate(parameterName: IdentifierKind): TSTypePredicate
  def tsTypePredicate(parameterName: IdentifierKind, typeAnnotation: Null, asserts: Boolean): TSTypePredicate
  def tsTypePredicate(parameterName: IdentifierKind, typeAnnotation: Unit, asserts: Boolean): TSTypePredicate
  def tsTypePredicate(parameterName: IdentifierKind, typeAnnotation: TSTypeAnnotationKind): TSTypePredicate
  def tsTypePredicate(parameterName: IdentifierKind, typeAnnotation: TSTypeAnnotationKind, asserts: Boolean): TSTypePredicate
  def tsTypePredicate(parameterName: TSThisTypeKind): TSTypePredicate
  def tsTypePredicate(parameterName: TSThisTypeKind, typeAnnotation: Null, asserts: Boolean): TSTypePredicate
  def tsTypePredicate(parameterName: TSThisTypeKind, typeAnnotation: Unit, asserts: Boolean): TSTypePredicate
  def tsTypePredicate(parameterName: TSThisTypeKind, typeAnnotation: TSTypeAnnotationKind): TSTypePredicate
  def tsTypePredicate(parameterName: TSThisTypeKind, typeAnnotation: TSTypeAnnotationKind, asserts: Boolean): TSTypePredicate
  @JSName("tsTypePredicate")
  var tsTypePredicate_Original: TSTypePredicateBuilder
  
  def tsTypeQuery(exprName: IdentifierKind): TSTypeQuery
  def tsTypeQuery(exprName: TSImportTypeKind): TSTypeQuery
  def tsTypeQuery(exprName: TSQualifiedNameKind): TSTypeQuery
  @JSName("tsTypeQuery")
  var tsTypeQuery_Original: TSTypeQueryBuilder
  
  def tsTypeReference(typeName: IdentifierKind): TSTypeReference
  def tsTypeReference(typeName: IdentifierKind, typeParameters: TSTypeParameterInstantiationKind): TSTypeReference
  def tsTypeReference(typeName: TSQualifiedNameKind): TSTypeReference
  def tsTypeReference(typeName: TSQualifiedNameKind, typeParameters: TSTypeParameterInstantiationKind): TSTypeReference
  @JSName("tsTypeReference")
  var tsTypeReference_Original: TSTypeReferenceBuilder
  
  def tsUndefinedKeyword(): TSUndefinedKeyword
  @JSName("tsUndefinedKeyword")
  var tsUndefinedKeyword_Original: TSUndefinedKeywordBuilder
  
  def tsUnionType(types: js.Array[TSTypeKind]): TSUnionType
  @JSName("tsUnionType")
  var tsUnionType_Original: TSUnionTypeBuilder
  
  def tsUnknownKeyword(): TSUnknownKeyword
  @JSName("tsUnknownKeyword")
  var tsUnknownKeyword_Original: TSUnknownKeywordBuilder
  
  def tsVoidKeyword(): TSVoidKeyword
  @JSName("tsVoidKeyword")
  var tsVoidKeyword_Original: TSVoidKeywordBuilder
  
  def tupleTypeAnnotation(types: js.Array[FlowTypeKind]): TupleTypeAnnotation
  @JSName("tupleTypeAnnotation")
  var tupleTypeAnnotation_Original: TupleTypeAnnotationBuilder
  
  def typeAlias(id: IdentifierKind, typeParameters: Null, right: FlowTypeKind): TypeAlias
  def typeAlias(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind, right: FlowTypeKind): TypeAlias
  @JSName("typeAlias")
  var typeAlias_Original: TypeAliasBuilder
  
  def typeAnnotation(typeAnnotation: FlowTypeKind): TypeAnnotation
  @JSName("typeAnnotation")
  var typeAnnotation_Original: TypeAnnotationBuilder
  
  def typeCastExpression(expression: ExpressionKind, typeAnnotation: TypeAnnotationKind): TypeCastExpression
  @JSName("typeCastExpression")
  var typeCastExpression_Original: TypeCastExpressionBuilder
  
  def typeParameter(name: String): TypeParameter
  def typeParameter(name: String, variance: Null, bound: Null, defaultParam: FlowTypeKind): TypeParameter
  def typeParameter(name: String, variance: Null, bound: Unit, defaultParam: FlowTypeKind): TypeParameter
  def typeParameter(name: String, variance: Null, bound: TypeAnnotationKind): TypeParameter
  def typeParameter(name: String, variance: Null, bound: TypeAnnotationKind, defaultParam: FlowTypeKind): TypeParameter
  def typeParameter(name: String, variance: Unit, bound: Null, defaultParam: FlowTypeKind): TypeParameter
  def typeParameter(name: String, variance: Unit, bound: Unit, defaultParam: FlowTypeKind): TypeParameter
  def typeParameter(name: String, variance: Unit, bound: TypeAnnotationKind): TypeParameter
  def typeParameter(name: String, variance: Unit, bound: TypeAnnotationKind, defaultParam: FlowTypeKind): TypeParameter
  def typeParameter(name: String, variance: VarianceKind): TypeParameter
  def typeParameter(name: String, variance: VarianceKind, bound: Null, defaultParam: FlowTypeKind): TypeParameter
  def typeParameter(name: String, variance: VarianceKind, bound: Unit, defaultParam: FlowTypeKind): TypeParameter
  def typeParameter(name: String, variance: VarianceKind, bound: TypeAnnotationKind): TypeParameter
  def typeParameter(name: String, variance: VarianceKind, bound: TypeAnnotationKind, defaultParam: FlowTypeKind): TypeParameter
  
  def typeParameterDeclaration(params: js.Array[TypeParameterKind]): TypeParameterDeclaration
  @JSName("typeParameterDeclaration")
  var typeParameterDeclaration_Original: TypeParameterDeclarationBuilder
  
  def typeParameterInstantiation(params: js.Array[FlowTypeKind]): TypeParameterInstantiation
  @JSName("typeParameterInstantiation")
  var typeParameterInstantiation_Original: TypeParameterInstantiationBuilder
  
  @JSName("typeParameter")
  var typeParameter_Original: TypeParameterBuilder
  @JSName("typeParameter")
  def typeParameter_minus(name: String, variance: minus): TypeParameter
  @JSName("typeParameter")
  def typeParameter_minus(name: String, variance: minus, bound: Null, defaultParam: FlowTypeKind): TypeParameter
  @JSName("typeParameter")
  def typeParameter_minus(name: String, variance: minus, bound: Unit, defaultParam: FlowTypeKind): TypeParameter
  @JSName("typeParameter")
  def typeParameter_minus(name: String, variance: minus, bound: TypeAnnotationKind): TypeParameter
  @JSName("typeParameter")
  def typeParameter_minus(name: String, variance: minus, bound: TypeAnnotationKind, defaultParam: FlowTypeKind): TypeParameter
  @JSName("typeParameter")
  def typeParameter_plus(name: String, variance: plus): TypeParameter
  @JSName("typeParameter")
  def typeParameter_plus(name: String, variance: plus, bound: Null, defaultParam: FlowTypeKind): TypeParameter
  @JSName("typeParameter")
  def typeParameter_plus(name: String, variance: plus, bound: Unit, defaultParam: FlowTypeKind): TypeParameter
  @JSName("typeParameter")
  def typeParameter_plus(name: String, variance: plus, bound: TypeAnnotationKind): TypeParameter
  @JSName("typeParameter")
  def typeParameter_plus(name: String, variance: plus, bound: TypeAnnotationKind, defaultParam: FlowTypeKind): TypeParameter
  
  def typeofTypeAnnotation(argument: FlowTypeKind): TypeofTypeAnnotation
  @JSName("typeofTypeAnnotation")
  var typeofTypeAnnotation_Original: TypeofTypeAnnotationBuilder
  
  def unaryExpression(operator: Exclamationmark, argument: ExpressionKind): UnaryExpression
  def unaryExpression(operator: Exclamationmark, argument: ExpressionKind, prefix: Boolean): UnaryExpression
  def unaryExpression(operator: Plussign, argument: ExpressionKind): UnaryExpression
  def unaryExpression(operator: Plussign, argument: ExpressionKind, prefix: Boolean): UnaryExpression
  def unaryExpression(operator: Tilde, argument: ExpressionKind): UnaryExpression
  def unaryExpression(operator: Tilde, argument: ExpressionKind, prefix: Boolean): UnaryExpression
  def unaryExpression(operator: `-_`, argument: ExpressionKind): UnaryExpression
  def unaryExpression(operator: `-_`, argument: ExpressionKind, prefix: Boolean): UnaryExpression
  @JSName("unaryExpression")
  var unaryExpression_Original: UnaryExpressionBuilder
  @JSName("unaryExpression")
  def unaryExpression_delete(operator: delete, argument: ExpressionKind): UnaryExpression
  @JSName("unaryExpression")
  def unaryExpression_delete(operator: delete, argument: ExpressionKind, prefix: Boolean): UnaryExpression
  @JSName("unaryExpression")
  def unaryExpression_typeof(operator: typeof, argument: ExpressionKind): UnaryExpression
  @JSName("unaryExpression")
  def unaryExpression_typeof(operator: typeof, argument: ExpressionKind, prefix: Boolean): UnaryExpression
  @JSName("unaryExpression")
  def unaryExpression_void(operator: void, argument: ExpressionKind): UnaryExpression
  @JSName("unaryExpression")
  def unaryExpression_void(operator: void, argument: ExpressionKind, prefix: Boolean): UnaryExpression
  
  def unionTypeAnnotation(types: js.Array[FlowTypeKind]): UnionTypeAnnotation
  @JSName("unionTypeAnnotation")
  var unionTypeAnnotation_Original: UnionTypeAnnotationBuilder
  
  def updateExpression(operator: PlussignPlussign, argument: ExpressionKind, prefix: Boolean): UpdateExpression
  def updateExpression(operator: `--`, argument: ExpressionKind, prefix: Boolean): UpdateExpression
  @JSName("updateExpression")
  var updateExpression_Original: UpdateExpressionBuilder
  
  @JSName("variableDeclaration")
  var variableDeclaration_Original: VariableDeclarationBuilder
  @JSName("variableDeclaration")
  def variableDeclaration_const(kind: const, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration
  @JSName("variableDeclaration")
  def variableDeclaration_let(kind: let, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration
  @JSName("variableDeclaration")
  def variableDeclaration_var(kind: `var`, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration
  
  def variableDeclarator(id: PatternKind): VariableDeclarator
  def variableDeclarator(id: PatternKind, init: ExpressionKind): VariableDeclarator
  @JSName("variableDeclarator")
  var variableDeclarator_Original: VariableDeclaratorBuilder
  
  @JSName("variance")
  var variance_Original: VarianceBuilder
  @JSName("variance")
  def variance_minus(kind: minus): Variance
  @JSName("variance")
  def variance_plus(kind: plus): Variance
  
  def voidTypeAnnotation(): VoidTypeAnnotation
  @JSName("voidTypeAnnotation")
  var voidTypeAnnotation_Original: VoidTypeAnnotationBuilder
  
  def whileStatement(test: ExpressionKind, body: StatementKind): WhileStatement
  @JSName("whileStatement")
  var whileStatement_Original: WhileStatementBuilder
  
  def withStatement(`object`: ExpressionKind, body: StatementKind): WithStatement
  @JSName("withStatement")
  var withStatement_Original: WithStatementBuilder
  
  def yieldExpression(): YieldExpression
  def yieldExpression(argument: Null, delegate: Boolean): YieldExpression
  def yieldExpression(argument: ExpressionKind): YieldExpression
  def yieldExpression(argument: ExpressionKind, delegate: Boolean): YieldExpression
  @JSName("yieldExpression")
  var yieldExpression_Original: YieldExpressionBuilder
}
object builders {
  
  @scala.inline
  def apply(
    Object: js.Object,
    anyTypeAnnotation: AnyTypeAnnotationBuilder,
    arrayExpression: ArrayExpressionBuilder,
    arrayPattern: ArrayPatternBuilder,
    arrayTypeAnnotation: ArrayTypeAnnotationBuilder,
    arrowFunctionExpression: ArrowFunctionExpressionBuilder,
    assignmentExpression: AssignmentExpressionBuilder,
    assignmentPattern: AssignmentPatternBuilder,
    awaitExpression: AwaitExpressionBuilder,
    bigIntLiteral: BigIntLiteralBuilder,
    bigIntLiteralTypeAnnotation: BigIntLiteralTypeAnnotationBuilder,
    bigIntTypeAnnotation: BigIntTypeAnnotationBuilder,
    binaryExpression: BinaryExpressionBuilder,
    bindExpression: BindExpressionBuilder,
    block: BlockBuilder,
    blockStatement: BlockStatementBuilder,
    booleanLiteral: BooleanLiteralBuilder,
    booleanLiteralTypeAnnotation: BooleanLiteralTypeAnnotationBuilder,
    booleanTypeAnnotation: BooleanTypeAnnotationBuilder,
    breakStatement: BreakStatementBuilder,
    callExpression: CallExpressionBuilder,
    catchClause: CatchClauseBuilder,
    chainExpression: ChainExpressionBuilder,
    classBody: ClassBodyBuilder,
    classDeclaration: ClassDeclarationBuilder,
    classExpression: ClassExpressionBuilder,
    classImplements: ClassImplementsBuilder,
    classMethod: ClassMethodBuilder,
    classPrivateMethod: ClassPrivateMethodBuilder,
    classPrivateProperty: ClassPrivatePropertyBuilder,
    classProperty: ClassPropertyBuilder,
    classPropertyDefinition: ClassPropertyDefinitionBuilder,
    commentBlock: CommentBlockBuilder,
    commentLine: CommentLineBuilder,
    comprehensionBlock: ComprehensionBlockBuilder,
    comprehensionExpression: ComprehensionExpressionBuilder,
    conditionalExpression: ConditionalExpressionBuilder,
    continueStatement: ContinueStatementBuilder,
    debuggerStatement: DebuggerStatementBuilder,
    declareClass: DeclareClassBuilder,
    declareExportAllDeclaration: DeclareExportAllDeclarationBuilder,
    declareExportDeclaration: DeclareExportDeclarationBuilder,
    declareFunction: DeclareFunctionBuilder,
    declareInterface: DeclareInterfaceBuilder,
    declareModule: DeclareModuleBuilder,
    declareModuleExports: DeclareModuleExportsBuilder,
    declareOpaqueType: DeclareOpaqueTypeBuilder,
    declareTypeAlias: DeclareTypeAliasBuilder,
    declareVariable: DeclareVariableBuilder,
    declaredPredicate: DeclaredPredicateBuilder,
    decorator: DecoratorBuilder,
    directive: DirectiveBuilder,
    directiveLiteral: DirectiveLiteralBuilder,
    doExpression: DoExpressionBuilder,
    doWhileStatement: DoWhileStatementBuilder,
    emptyStatement: EmptyStatementBuilder,
    emptyTypeAnnotation: EmptyTypeAnnotationBuilder,
    enumBooleanBody: EnumBooleanBodyBuilder,
    enumBooleanMember: EnumBooleanMemberBuilder,
    enumDeclaration: EnumDeclarationBuilder,
    enumDefaultedMember: EnumDefaultedMemberBuilder,
    enumNumberBody: EnumNumberBodyBuilder,
    enumNumberMember: EnumNumberMemberBuilder,
    enumStringBody: EnumStringBodyBuilder,
    enumStringMember: EnumStringMemberBuilder,
    enumSymbolBody: EnumSymbolBodyBuilder,
    existentialTypeParam: ExistentialTypeParamBuilder,
    existsTypeAnnotation: ExistsTypeAnnotationBuilder,
    exportAllDeclaration: ExportAllDeclarationBuilder,
    exportBatchSpecifier: ExportBatchSpecifierBuilder,
    exportDeclaration: ExportDeclarationBuilder,
    exportDefaultDeclaration: ExportDefaultDeclarationBuilder,
    exportDefaultSpecifier: ExportDefaultSpecifierBuilder,
    exportNamedDeclaration: ExportNamedDeclarationBuilder,
    exportNamespaceSpecifier: ExportNamespaceSpecifierBuilder,
    exportSpecifier: ExportSpecifierBuilder,
    expressionStatement: ExpressionStatementBuilder,
    file: FileBuilder,
    forAwaitStatement: ForAwaitStatementBuilder,
    forInStatement: ForInStatementBuilder,
    forOfStatement: ForOfStatementBuilder,
    forStatement: ForStatementBuilder,
    functionDeclaration: FunctionDeclarationBuilder,
    functionExpression: FunctionExpressionBuilder,
    functionTypeAnnotation: FunctionTypeAnnotationBuilder,
    functionTypeParam: FunctionTypeParamBuilder,
    generatorExpression: GeneratorExpressionBuilder,
    genericTypeAnnotation: GenericTypeAnnotationBuilder,
    identifier: IdentifierBuilder,
    ifStatement: IfStatementBuilder,
    `import`: ImportBuilder,
    importDeclaration: ImportDeclarationBuilder,
    importDefaultSpecifier: ImportDefaultSpecifierBuilder,
    importExpression: ImportExpressionBuilder,
    importNamespaceSpecifier: ImportNamespaceSpecifierBuilder,
    importSpecifier: ImportSpecifierBuilder,
    inferredPredicate: InferredPredicateBuilder,
    interfaceDeclaration: InterfaceDeclarationBuilder,
    interfaceExtends: InterfaceExtendsBuilder,
    interfaceTypeAnnotation: InterfaceTypeAnnotationBuilder,
    interpreterDirective: InterpreterDirectiveBuilder,
    intersectionTypeAnnotation: IntersectionTypeAnnotationBuilder,
    jsxAttribute: JSXAttributeBuilder,
    jsxClosingElement: JSXClosingElementBuilder,
    jsxClosingFragment: JSXClosingFragmentBuilder,
    jsxElement: JSXElementBuilder,
    jsxEmptyExpression: JSXEmptyExpressionBuilder,
    jsxExpressionContainer: JSXExpressionContainerBuilder,
    jsxFragment: JSXFragmentBuilder,
    jsxIdentifier: JSXIdentifierBuilder,
    jsxMemberExpression: JSXMemberExpressionBuilder,
    jsxNamespacedName: JSXNamespacedNameBuilder,
    jsxOpeningElement: JSXOpeningElementBuilder,
    jsxOpeningFragment: JSXOpeningFragmentBuilder,
    jsxSpreadAttribute: JSXSpreadAttributeBuilder,
    jsxSpreadChild: JSXSpreadChildBuilder,
    jsxText: JSXTextBuilder,
    labeledStatement: LabeledStatementBuilder,
    line: LineBuilder,
    literal: LiteralBuilder,
    logicalExpression: LogicalExpressionBuilder,
    memberExpression: MemberExpressionBuilder,
    memberTypeAnnotation: MemberTypeAnnotationBuilder,
    metaProperty: MetaPropertyBuilder,
    methodDefinition: MethodDefinitionBuilder,
    mixedTypeAnnotation: MixedTypeAnnotationBuilder,
    newExpression: NewExpressionBuilder,
    noop: NoopBuilder,
    nullLiteral: NullLiteralBuilder,
    nullLiteralTypeAnnotation: NullLiteralTypeAnnotationBuilder,
    nullTypeAnnotation: NullTypeAnnotationBuilder,
    nullableTypeAnnotation: NullableTypeAnnotationBuilder,
    numberLiteralTypeAnnotation: NumberLiteralTypeAnnotationBuilder,
    numberTypeAnnotation: NumberTypeAnnotationBuilder,
    numericLiteral: NumericLiteralBuilder,
    numericLiteralTypeAnnotation: NumericLiteralTypeAnnotationBuilder,
    objectExpression: ObjectExpressionBuilder,
    objectMethod: ObjectMethodBuilder,
    objectPattern: ObjectPatternBuilder,
    objectProperty: ObjectPropertyBuilder,
    objectTypeAnnotation: ObjectTypeAnnotationBuilder,
    objectTypeCallProperty: ObjectTypeCallPropertyBuilder,
    objectTypeIndexer: ObjectTypeIndexerBuilder,
    objectTypeInternalSlot: ObjectTypeInternalSlotBuilder,
    objectTypeProperty: ObjectTypePropertyBuilder,
    objectTypeSpreadProperty: ObjectTypeSpreadPropertyBuilder,
    opaqueType: OpaqueTypeBuilder,
    optionalCallExpression: OptionalCallExpressionBuilder,
    optionalMemberExpression: OptionalMemberExpressionBuilder,
    parenthesizedExpression: ParenthesizedExpressionBuilder,
    privateName: PrivateNameBuilder,
    program: ProgramBuilder,
    property: PropertyBuilder,
    propertyPattern: PropertyPatternBuilder,
    qualifiedTypeIdentifier: QualifiedTypeIdentifierBuilder,
    regExpLiteral: RegExpLiteralBuilder,
    restElement: RestElementBuilder,
    restProperty: RestPropertyBuilder,
    returnStatement: ReturnStatementBuilder,
    sequenceExpression: SequenceExpressionBuilder,
    spreadElement: SpreadElementBuilder,
    spreadElementPattern: SpreadElementPatternBuilder,
    spreadProperty: SpreadPropertyBuilder,
    spreadPropertyPattern: SpreadPropertyPatternBuilder,
    stringLiteral: StringLiteralBuilder,
    stringLiteralTypeAnnotation: StringLiteralTypeAnnotationBuilder,
    stringTypeAnnotation: StringTypeAnnotationBuilder,
    `super`: SuperBuilder,
    switchCase: SwitchCaseBuilder,
    switchStatement: SwitchStatementBuilder,
    symbolTypeAnnotation: SymbolTypeAnnotationBuilder,
    taggedTemplateExpression: TaggedTemplateExpressionBuilder,
    templateElement: TemplateElementBuilder,
    templateLiteral: TemplateLiteralBuilder,
    thisExpression: ThisExpressionBuilder,
    thisTypeAnnotation: ThisTypeAnnotationBuilder,
    throwStatement: ThrowStatementBuilder,
    tryStatement: TryStatementBuilder,
    tsAnyKeyword: TSAnyKeywordBuilder,
    tsArrayType: TSArrayTypeBuilder,
    tsAsExpression: TSAsExpressionBuilder,
    tsBigIntKeyword: TSBigIntKeywordBuilder,
    tsBooleanKeyword: TSBooleanKeywordBuilder,
    tsCallSignatureDeclaration: TSCallSignatureDeclarationBuilder,
    tsConditionalType: TSConditionalTypeBuilder,
    tsConstructSignatureDeclaration: TSConstructSignatureDeclarationBuilder,
    tsConstructorType: TSConstructorTypeBuilder,
    tsDeclareFunction: TSDeclareFunctionBuilder,
    tsDeclareMethod: TSDeclareMethodBuilder,
    tsEnumDeclaration: TSEnumDeclarationBuilder,
    tsEnumMember: TSEnumMemberBuilder,
    tsExportAssignment: TSExportAssignmentBuilder,
    tsExpressionWithTypeArguments: TSExpressionWithTypeArgumentsBuilder,
    tsExternalModuleReference: TSExternalModuleReferenceBuilder,
    tsFunctionType: TSFunctionTypeBuilder,
    tsImportEqualsDeclaration: TSImportEqualsDeclarationBuilder,
    tsImportType: TSImportTypeBuilder,
    tsIndexSignature: TSIndexSignatureBuilder,
    tsIndexedAccessType: TSIndexedAccessTypeBuilder,
    tsInferType: TSInferTypeBuilder,
    tsInterfaceBody: TSInterfaceBodyBuilder,
    tsInterfaceDeclaration: TSInterfaceDeclarationBuilder,
    tsIntersectionType: TSIntersectionTypeBuilder,
    tsLiteralType: TSLiteralTypeBuilder,
    tsMappedType: TSMappedTypeBuilder,
    tsMethodSignature: TSMethodSignatureBuilder,
    tsModuleBlock: TSModuleBlockBuilder,
    tsModuleDeclaration: TSModuleDeclarationBuilder,
    tsNamedTupleMember: TSNamedTupleMemberBuilder,
    tsNamespaceExportDeclaration: TSNamespaceExportDeclarationBuilder,
    tsNeverKeyword: TSNeverKeywordBuilder,
    tsNonNullExpression: TSNonNullExpressionBuilder,
    tsNullKeyword: TSNullKeywordBuilder,
    tsNumberKeyword: TSNumberKeywordBuilder,
    tsObjectKeyword: TSObjectKeywordBuilder,
    tsOptionalType: TSOptionalTypeBuilder,
    tsParameterProperty: TSParameterPropertyBuilder,
    tsParenthesizedType: TSParenthesizedTypeBuilder,
    tsPropertySignature: TSPropertySignatureBuilder,
    tsQualifiedName: TSQualifiedNameBuilder,
    tsRestType: TSRestTypeBuilder,
    tsStringKeyword: TSStringKeywordBuilder,
    tsSymbolKeyword: TSSymbolKeywordBuilder,
    tsThisType: TSThisTypeBuilder,
    tsTupleType: TSTupleTypeBuilder,
    tsTypeAliasDeclaration: TSTypeAliasDeclarationBuilder,
    tsTypeAnnotation: TSTypeAnnotationBuilder,
    tsTypeAssertion: TSTypeAssertionBuilder,
    tsTypeLiteral: TSTypeLiteralBuilder,
    tsTypeOperator: TSTypeOperatorBuilder,
    tsTypeParameter: TSTypeParameterBuilder,
    tsTypeParameterDeclaration: TSTypeParameterDeclarationBuilder,
    tsTypeParameterInstantiation: TSTypeParameterInstantiationBuilder,
    tsTypePredicate: TSTypePredicateBuilder,
    tsTypeQuery: TSTypeQueryBuilder,
    tsTypeReference: TSTypeReferenceBuilder,
    tsUndefinedKeyword: TSUndefinedKeywordBuilder,
    tsUnionType: TSUnionTypeBuilder,
    tsUnknownKeyword: TSUnknownKeywordBuilder,
    tsVoidKeyword: TSVoidKeywordBuilder,
    tupleTypeAnnotation: TupleTypeAnnotationBuilder,
    typeAlias: TypeAliasBuilder,
    typeAnnotation: TypeAnnotationBuilder,
    typeCastExpression: TypeCastExpressionBuilder,
    typeParameter: TypeParameterBuilder,
    typeParameterDeclaration: TypeParameterDeclarationBuilder,
    typeParameterInstantiation: TypeParameterInstantiationBuilder,
    typeofTypeAnnotation: TypeofTypeAnnotationBuilder,
    unaryExpression: UnaryExpressionBuilder,
    unionTypeAnnotation: UnionTypeAnnotationBuilder,
    updateExpression: UpdateExpressionBuilder,
    variableDeclaration: VariableDeclarationBuilder,
    variableDeclarator: VariableDeclaratorBuilder,
    variance: VarianceBuilder
  ): builders = {
    val __obj = js.Dynamic.literal(anyTypeAnnotation = anyTypeAnnotation.asInstanceOf[js.Any], arrayExpression = arrayExpression.asInstanceOf[js.Any], arrayPattern = arrayPattern.asInstanceOf[js.Any], arrayTypeAnnotation = arrayTypeAnnotation.asInstanceOf[js.Any], arrowFunctionExpression = arrowFunctionExpression.asInstanceOf[js.Any], assignmentExpression = assignmentExpression.asInstanceOf[js.Any], assignmentPattern = assignmentPattern.asInstanceOf[js.Any], awaitExpression = awaitExpression.asInstanceOf[js.Any], bigIntLiteral = bigIntLiteral.asInstanceOf[js.Any], bigIntLiteralTypeAnnotation = bigIntLiteralTypeAnnotation.asInstanceOf[js.Any], bigIntTypeAnnotation = bigIntTypeAnnotation.asInstanceOf[js.Any], binaryExpression = binaryExpression.asInstanceOf[js.Any], bindExpression = bindExpression.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], blockStatement = blockStatement.asInstanceOf[js.Any], booleanLiteral = booleanLiteral.asInstanceOf[js.Any], booleanLiteralTypeAnnotation = booleanLiteralTypeAnnotation.asInstanceOf[js.Any], booleanTypeAnnotation = booleanTypeAnnotation.asInstanceOf[js.Any], breakStatement = breakStatement.asInstanceOf[js.Any], callExpression = callExpression.asInstanceOf[js.Any], catchClause = catchClause.asInstanceOf[js.Any], chainExpression = chainExpression.asInstanceOf[js.Any], classBody = classBody.asInstanceOf[js.Any], classDeclaration = classDeclaration.asInstanceOf[js.Any], classExpression = classExpression.asInstanceOf[js.Any], classImplements = classImplements.asInstanceOf[js.Any], classMethod = classMethod.asInstanceOf[js.Any], classPrivateMethod = classPrivateMethod.asInstanceOf[js.Any], classPrivateProperty = classPrivateProperty.asInstanceOf[js.Any], classProperty = classProperty.asInstanceOf[js.Any], classPropertyDefinition = classPropertyDefinition.asInstanceOf[js.Any], commentBlock = commentBlock.asInstanceOf[js.Any], commentLine = commentLine.asInstanceOf[js.Any], comprehensionBlock = comprehensionBlock.asInstanceOf[js.Any], comprehensionExpression = comprehensionExpression.asInstanceOf[js.Any], conditionalExpression = conditionalExpression.asInstanceOf[js.Any], continueStatement = continueStatement.asInstanceOf[js.Any], debuggerStatement = debuggerStatement.asInstanceOf[js.Any], declareClass = declareClass.asInstanceOf[js.Any], declareExportAllDeclaration = declareExportAllDeclaration.asInstanceOf[js.Any], declareExportDeclaration = declareExportDeclaration.asInstanceOf[js.Any], declareFunction = declareFunction.asInstanceOf[js.Any], declareInterface = declareInterface.asInstanceOf[js.Any], declareModule = declareModule.asInstanceOf[js.Any], declareModuleExports = declareModuleExports.asInstanceOf[js.Any], declareOpaqueType = declareOpaqueType.asInstanceOf[js.Any], declareTypeAlias = declareTypeAlias.asInstanceOf[js.Any], declareVariable = declareVariable.asInstanceOf[js.Any], declaredPredicate = declaredPredicate.asInstanceOf[js.Any], decorator = decorator.asInstanceOf[js.Any], directive = directive.asInstanceOf[js.Any], directiveLiteral = directiveLiteral.asInstanceOf[js.Any], doExpression = doExpression.asInstanceOf[js.Any], doWhileStatement = doWhileStatement.asInstanceOf[js.Any], emptyStatement = emptyStatement.asInstanceOf[js.Any], emptyTypeAnnotation = emptyTypeAnnotation.asInstanceOf[js.Any], enumBooleanBody = enumBooleanBody.asInstanceOf[js.Any], enumBooleanMember = enumBooleanMember.asInstanceOf[js.Any], enumDeclaration = enumDeclaration.asInstanceOf[js.Any], enumDefaultedMember = enumDefaultedMember.asInstanceOf[js.Any], enumNumberBody = enumNumberBody.asInstanceOf[js.Any], enumNumberMember = enumNumberMember.asInstanceOf[js.Any], enumStringBody = enumStringBody.asInstanceOf[js.Any], enumStringMember = enumStringMember.asInstanceOf[js.Any], enumSymbolBody = enumSymbolBody.asInstanceOf[js.Any], existentialTypeParam = existentialTypeParam.asInstanceOf[js.Any], existsTypeAnnotation = existsTypeAnnotation.asInstanceOf[js.Any], exportAllDeclaration = exportAllDeclaration.asInstanceOf[js.Any], exportBatchSpecifier = exportBatchSpecifier.asInstanceOf[js.Any], exportDeclaration = exportDeclaration.asInstanceOf[js.Any], exportDefaultDeclaration = exportDefaultDeclaration.asInstanceOf[js.Any], exportDefaultSpecifier = exportDefaultSpecifier.asInstanceOf[js.Any], exportNamedDeclaration = exportNamedDeclaration.asInstanceOf[js.Any], exportNamespaceSpecifier = exportNamespaceSpecifier.asInstanceOf[js.Any], exportSpecifier = exportSpecifier.asInstanceOf[js.Any], expressionStatement = expressionStatement.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], forAwaitStatement = forAwaitStatement.asInstanceOf[js.Any], forInStatement = forInStatement.asInstanceOf[js.Any], forOfStatement = forOfStatement.asInstanceOf[js.Any], forStatement = forStatement.asInstanceOf[js.Any], functionDeclaration = functionDeclaration.asInstanceOf[js.Any], functionExpression = functionExpression.asInstanceOf[js.Any], functionTypeAnnotation = functionTypeAnnotation.asInstanceOf[js.Any], functionTypeParam = functionTypeParam.asInstanceOf[js.Any], generatorExpression = generatorExpression.asInstanceOf[js.Any], genericTypeAnnotation = genericTypeAnnotation.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], ifStatement = ifStatement.asInstanceOf[js.Any], importDeclaration = importDeclaration.asInstanceOf[js.Any], importDefaultSpecifier = importDefaultSpecifier.asInstanceOf[js.Any], importExpression = importExpression.asInstanceOf[js.Any], importNamespaceSpecifier = importNamespaceSpecifier.asInstanceOf[js.Any], importSpecifier = importSpecifier.asInstanceOf[js.Any], inferredPredicate = inferredPredicate.asInstanceOf[js.Any], interfaceDeclaration = interfaceDeclaration.asInstanceOf[js.Any], interfaceExtends = interfaceExtends.asInstanceOf[js.Any], interfaceTypeAnnotation = interfaceTypeAnnotation.asInstanceOf[js.Any], interpreterDirective = interpreterDirective.asInstanceOf[js.Any], intersectionTypeAnnotation = intersectionTypeAnnotation.asInstanceOf[js.Any], jsxAttribute = jsxAttribute.asInstanceOf[js.Any], jsxClosingElement = jsxClosingElement.asInstanceOf[js.Any], jsxClosingFragment = jsxClosingFragment.asInstanceOf[js.Any], jsxElement = jsxElement.asInstanceOf[js.Any], jsxEmptyExpression = jsxEmptyExpression.asInstanceOf[js.Any], jsxExpressionContainer = jsxExpressionContainer.asInstanceOf[js.Any], jsxFragment = jsxFragment.asInstanceOf[js.Any], jsxIdentifier = jsxIdentifier.asInstanceOf[js.Any], jsxMemberExpression = jsxMemberExpression.asInstanceOf[js.Any], jsxNamespacedName = jsxNamespacedName.asInstanceOf[js.Any], jsxOpeningElement = jsxOpeningElement.asInstanceOf[js.Any], jsxOpeningFragment = jsxOpeningFragment.asInstanceOf[js.Any], jsxSpreadAttribute = jsxSpreadAttribute.asInstanceOf[js.Any], jsxSpreadChild = jsxSpreadChild.asInstanceOf[js.Any], jsxText = jsxText.asInstanceOf[js.Any], labeledStatement = labeledStatement.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], literal = literal.asInstanceOf[js.Any], logicalExpression = logicalExpression.asInstanceOf[js.Any], memberExpression = memberExpression.asInstanceOf[js.Any], memberTypeAnnotation = memberTypeAnnotation.asInstanceOf[js.Any], metaProperty = metaProperty.asInstanceOf[js.Any], methodDefinition = methodDefinition.asInstanceOf[js.Any], mixedTypeAnnotation = mixedTypeAnnotation.asInstanceOf[js.Any], newExpression = newExpression.asInstanceOf[js.Any], noop = noop.asInstanceOf[js.Any], nullLiteral = nullLiteral.asInstanceOf[js.Any], nullLiteralTypeAnnotation = nullLiteralTypeAnnotation.asInstanceOf[js.Any], nullTypeAnnotation = nullTypeAnnotation.asInstanceOf[js.Any], nullableTypeAnnotation = nullableTypeAnnotation.asInstanceOf[js.Any], numberLiteralTypeAnnotation = numberLiteralTypeAnnotation.asInstanceOf[js.Any], numberTypeAnnotation = numberTypeAnnotation.asInstanceOf[js.Any], numericLiteral = numericLiteral.asInstanceOf[js.Any], numericLiteralTypeAnnotation = numericLiteralTypeAnnotation.asInstanceOf[js.Any], objectExpression = objectExpression.asInstanceOf[js.Any], objectMethod = objectMethod.asInstanceOf[js.Any], objectPattern = objectPattern.asInstanceOf[js.Any], objectProperty = objectProperty.asInstanceOf[js.Any], objectTypeAnnotation = objectTypeAnnotation.asInstanceOf[js.Any], objectTypeCallProperty = objectTypeCallProperty.asInstanceOf[js.Any], objectTypeIndexer = objectTypeIndexer.asInstanceOf[js.Any], objectTypeInternalSlot = objectTypeInternalSlot.asInstanceOf[js.Any], objectTypeProperty = objectTypeProperty.asInstanceOf[js.Any], objectTypeSpreadProperty = objectTypeSpreadProperty.asInstanceOf[js.Any], opaqueType = opaqueType.asInstanceOf[js.Any], optionalCallExpression = optionalCallExpression.asInstanceOf[js.Any], optionalMemberExpression = optionalMemberExpression.asInstanceOf[js.Any], parenthesizedExpression = parenthesizedExpression.asInstanceOf[js.Any], privateName = privateName.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], propertyPattern = propertyPattern.asInstanceOf[js.Any], qualifiedTypeIdentifier = qualifiedTypeIdentifier.asInstanceOf[js.Any], regExpLiteral = regExpLiteral.asInstanceOf[js.Any], restElement = restElement.asInstanceOf[js.Any], restProperty = restProperty.asInstanceOf[js.Any], returnStatement = returnStatement.asInstanceOf[js.Any], sequenceExpression = sequenceExpression.asInstanceOf[js.Any], spreadElement = spreadElement.asInstanceOf[js.Any], spreadElementPattern = spreadElementPattern.asInstanceOf[js.Any], spreadProperty = spreadProperty.asInstanceOf[js.Any], spreadPropertyPattern = spreadPropertyPattern.asInstanceOf[js.Any], stringLiteral = stringLiteral.asInstanceOf[js.Any], stringLiteralTypeAnnotation = stringLiteralTypeAnnotation.asInstanceOf[js.Any], stringTypeAnnotation = stringTypeAnnotation.asInstanceOf[js.Any], switchCase = switchCase.asInstanceOf[js.Any], switchStatement = switchStatement.asInstanceOf[js.Any], symbolTypeAnnotation = symbolTypeAnnotation.asInstanceOf[js.Any], taggedTemplateExpression = taggedTemplateExpression.asInstanceOf[js.Any], templateElement = templateElement.asInstanceOf[js.Any], templateLiteral = templateLiteral.asInstanceOf[js.Any], thisExpression = thisExpression.asInstanceOf[js.Any], thisTypeAnnotation = thisTypeAnnotation.asInstanceOf[js.Any], throwStatement = throwStatement.asInstanceOf[js.Any], tryStatement = tryStatement.asInstanceOf[js.Any], tsAnyKeyword = tsAnyKeyword.asInstanceOf[js.Any], tsArrayType = tsArrayType.asInstanceOf[js.Any], tsAsExpression = tsAsExpression.asInstanceOf[js.Any], tsBigIntKeyword = tsBigIntKeyword.asInstanceOf[js.Any], tsBooleanKeyword = tsBooleanKeyword.asInstanceOf[js.Any], tsCallSignatureDeclaration = tsCallSignatureDeclaration.asInstanceOf[js.Any], tsConditionalType = tsConditionalType.asInstanceOf[js.Any], tsConstructSignatureDeclaration = tsConstructSignatureDeclaration.asInstanceOf[js.Any], tsConstructorType = tsConstructorType.asInstanceOf[js.Any], tsDeclareFunction = tsDeclareFunction.asInstanceOf[js.Any], tsDeclareMethod = tsDeclareMethod.asInstanceOf[js.Any], tsEnumDeclaration = tsEnumDeclaration.asInstanceOf[js.Any], tsEnumMember = tsEnumMember.asInstanceOf[js.Any], tsExportAssignment = tsExportAssignment.asInstanceOf[js.Any], tsExpressionWithTypeArguments = tsExpressionWithTypeArguments.asInstanceOf[js.Any], tsExternalModuleReference = tsExternalModuleReference.asInstanceOf[js.Any], tsFunctionType = tsFunctionType.asInstanceOf[js.Any], tsImportEqualsDeclaration = tsImportEqualsDeclaration.asInstanceOf[js.Any], tsImportType = tsImportType.asInstanceOf[js.Any], tsIndexSignature = tsIndexSignature.asInstanceOf[js.Any], tsIndexedAccessType = tsIndexedAccessType.asInstanceOf[js.Any], tsInferType = tsInferType.asInstanceOf[js.Any], tsInterfaceBody = tsInterfaceBody.asInstanceOf[js.Any], tsInterfaceDeclaration = tsInterfaceDeclaration.asInstanceOf[js.Any], tsIntersectionType = tsIntersectionType.asInstanceOf[js.Any], tsLiteralType = tsLiteralType.asInstanceOf[js.Any], tsMappedType = tsMappedType.asInstanceOf[js.Any], tsMethodSignature = tsMethodSignature.asInstanceOf[js.Any], tsModuleBlock = tsModuleBlock.asInstanceOf[js.Any], tsModuleDeclaration = tsModuleDeclaration.asInstanceOf[js.Any], tsNamedTupleMember = tsNamedTupleMember.asInstanceOf[js.Any], tsNamespaceExportDeclaration = tsNamespaceExportDeclaration.asInstanceOf[js.Any], tsNeverKeyword = tsNeverKeyword.asInstanceOf[js.Any], tsNonNullExpression = tsNonNullExpression.asInstanceOf[js.Any], tsNullKeyword = tsNullKeyword.asInstanceOf[js.Any], tsNumberKeyword = tsNumberKeyword.asInstanceOf[js.Any], tsObjectKeyword = tsObjectKeyword.asInstanceOf[js.Any], tsOptionalType = tsOptionalType.asInstanceOf[js.Any], tsParameterProperty = tsParameterProperty.asInstanceOf[js.Any], tsParenthesizedType = tsParenthesizedType.asInstanceOf[js.Any], tsPropertySignature = tsPropertySignature.asInstanceOf[js.Any], tsQualifiedName = tsQualifiedName.asInstanceOf[js.Any], tsRestType = tsRestType.asInstanceOf[js.Any], tsStringKeyword = tsStringKeyword.asInstanceOf[js.Any], tsSymbolKeyword = tsSymbolKeyword.asInstanceOf[js.Any], tsThisType = tsThisType.asInstanceOf[js.Any], tsTupleType = tsTupleType.asInstanceOf[js.Any], tsTypeAliasDeclaration = tsTypeAliasDeclaration.asInstanceOf[js.Any], tsTypeAnnotation = tsTypeAnnotation.asInstanceOf[js.Any], tsTypeAssertion = tsTypeAssertion.asInstanceOf[js.Any], tsTypeLiteral = tsTypeLiteral.asInstanceOf[js.Any], tsTypeOperator = tsTypeOperator.asInstanceOf[js.Any], tsTypeParameter = tsTypeParameter.asInstanceOf[js.Any], tsTypeParameterDeclaration = tsTypeParameterDeclaration.asInstanceOf[js.Any], tsTypeParameterInstantiation = tsTypeParameterInstantiation.asInstanceOf[js.Any], tsTypePredicate = tsTypePredicate.asInstanceOf[js.Any], tsTypeQuery = tsTypeQuery.asInstanceOf[js.Any], tsTypeReference = tsTypeReference.asInstanceOf[js.Any], tsUndefinedKeyword = tsUndefinedKeyword.asInstanceOf[js.Any], tsUnionType = tsUnionType.asInstanceOf[js.Any], tsUnknownKeyword = tsUnknownKeyword.asInstanceOf[js.Any], tsVoidKeyword = tsVoidKeyword.asInstanceOf[js.Any], tupleTypeAnnotation = tupleTypeAnnotation.asInstanceOf[js.Any], typeAlias = typeAlias.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], typeCastExpression = typeCastExpression.asInstanceOf[js.Any], typeParameter = typeParameter.asInstanceOf[js.Any], typeParameterDeclaration = typeParameterDeclaration.asInstanceOf[js.Any], typeParameterInstantiation = typeParameterInstantiation.asInstanceOf[js.Any], typeofTypeAnnotation = typeofTypeAnnotation.asInstanceOf[js.Any], unaryExpression = unaryExpression.asInstanceOf[js.Any], unionTypeAnnotation = unionTypeAnnotation.asInstanceOf[js.Any], updateExpression = updateExpression.asInstanceOf[js.Any], variableDeclaration = variableDeclaration.asInstanceOf[js.Any], variableDeclarator = variableDeclarator.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, Object)
    __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    __obj.updateDynamic("super")(`super`.asInstanceOf[js.Any])
    __obj.asInstanceOf[builders]
  }
  
  @scala.inline
  implicit class buildersMutableBuilder[Self <: builders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnyTypeAnnotation(value: AnyTypeAnnotationBuilder): Self = StObject.set(x, "anyTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayExpression(value: ArrayExpressionBuilder): Self = StObject.set(x, "arrayExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayPattern(value: ArrayPatternBuilder): Self = StObject.set(x, "arrayPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayTypeAnnotation(value: ArrayTypeAnnotationBuilder): Self = StObject.set(x, "arrayTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowFunctionExpression(value: ArrowFunctionExpressionBuilder): Self = StObject.set(x, "arrowFunctionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentExpression(value: AssignmentExpressionBuilder): Self = StObject.set(x, "assignmentExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentPattern(value: AssignmentPatternBuilder): Self = StObject.set(x, "assignmentPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwaitExpression(value: AwaitExpressionBuilder): Self = StObject.set(x, "awaitExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigIntLiteral(value: BigIntLiteralBuilder): Self = StObject.set(x, "bigIntLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigIntLiteralTypeAnnotation(value: BigIntLiteralTypeAnnotationBuilder): Self = StObject.set(x, "bigIntLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBigIntTypeAnnotation(value: BigIntTypeAnnotationBuilder): Self = StObject.set(x, "bigIntTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryExpression(value: BinaryExpressionBuilder): Self = StObject.set(x, "binaryExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindExpression(value: BindExpressionBuilder): Self = StObject.set(x, "bindExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlock(value: BlockBuilder): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockStatement(value: BlockStatementBuilder): Self = StObject.set(x, "blockStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanLiteral(value: BooleanLiteralBuilder): Self = StObject.set(x, "booleanLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanLiteralTypeAnnotation(value: BooleanLiteralTypeAnnotationBuilder): Self = StObject.set(x, "booleanLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanTypeAnnotation(value: BooleanTypeAnnotationBuilder): Self = StObject.set(x, "booleanTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakStatement(value: BreakStatementBuilder): Self = StObject.set(x, "breakStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallExpression(value: CallExpressionBuilder): Self = StObject.set(x, "callExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatchClause(value: CatchClauseBuilder): Self = StObject.set(x, "catchClause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChainExpression(value: ChainExpressionBuilder): Self = StObject.set(x, "chainExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassBody(value: ClassBodyBuilder): Self = StObject.set(x, "classBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassDeclaration(value: ClassDeclarationBuilder): Self = StObject.set(x, "classDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassExpression(value: ClassExpressionBuilder): Self = StObject.set(x, "classExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassImplements(value: ClassImplementsBuilder): Self = StObject.set(x, "classImplements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassMethod(value: ClassMethodBuilder): Self = StObject.set(x, "classMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassPrivateMethod(value: ClassPrivateMethodBuilder): Self = StObject.set(x, "classPrivateMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassPrivateProperty(value: ClassPrivatePropertyBuilder): Self = StObject.set(x, "classPrivateProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassProperty(value: ClassPropertyBuilder): Self = StObject.set(x, "classProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassPropertyDefinition(value: ClassPropertyDefinitionBuilder): Self = StObject.set(x, "classPropertyDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentBlock(value: CommentBlockBuilder): Self = StObject.set(x, "commentBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentLine(value: CommentLineBuilder): Self = StObject.set(x, "commentLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComprehensionBlock(value: ComprehensionBlockBuilder): Self = StObject.set(x, "comprehensionBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComprehensionExpression(value: ComprehensionExpressionBuilder): Self = StObject.set(x, "comprehensionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalExpression(value: ConditionalExpressionBuilder): Self = StObject.set(x, "conditionalExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueStatement(value: ContinueStatementBuilder): Self = StObject.set(x, "continueStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggerStatement(value: DebuggerStatementBuilder): Self = StObject.set(x, "debuggerStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareClass(value: DeclareClassBuilder): Self = StObject.set(x, "declareClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareExportAllDeclaration(value: DeclareExportAllDeclarationBuilder): Self = StObject.set(x, "declareExportAllDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareExportDeclaration(value: DeclareExportDeclarationBuilder): Self = StObject.set(x, "declareExportDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareFunction(value: DeclareFunctionBuilder): Self = StObject.set(x, "declareFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareInterface(value: DeclareInterfaceBuilder): Self = StObject.set(x, "declareInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareModule(value: DeclareModuleBuilder): Self = StObject.set(x, "declareModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareModuleExports(value: DeclareModuleExportsBuilder): Self = StObject.set(x, "declareModuleExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareOpaqueType(value: DeclareOpaqueTypeBuilder): Self = StObject.set(x, "declareOpaqueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareTypeAlias(value: DeclareTypeAliasBuilder): Self = StObject.set(x, "declareTypeAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareVariable(value: DeclareVariableBuilder): Self = StObject.set(x, "declareVariable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclaredPredicate(value: DeclaredPredicateBuilder): Self = StObject.set(x, "declaredPredicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecorator(value: DecoratorBuilder): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirective(value: DirectiveBuilder): Self = StObject.set(x, "directive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectiveLiteral(value: DirectiveLiteralBuilder): Self = StObject.set(x, "directiveLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoExpression(value: DoExpressionBuilder): Self = StObject.set(x, "doExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoWhileStatement(value: DoWhileStatementBuilder): Self = StObject.set(x, "doWhileStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyStatement(value: EmptyStatementBuilder): Self = StObject.set(x, "emptyStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyTypeAnnotation(value: EmptyTypeAnnotationBuilder): Self = StObject.set(x, "emptyTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumBooleanBody(value: EnumBooleanBodyBuilder): Self = StObject.set(x, "enumBooleanBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumBooleanMember(value: EnumBooleanMemberBuilder): Self = StObject.set(x, "enumBooleanMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumDeclaration(value: EnumDeclarationBuilder): Self = StObject.set(x, "enumDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumDefaultedMember(value: EnumDefaultedMemberBuilder): Self = StObject.set(x, "enumDefaultedMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumNumberBody(value: EnumNumberBodyBuilder): Self = StObject.set(x, "enumNumberBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumNumberMember(value: EnumNumberMemberBuilder): Self = StObject.set(x, "enumNumberMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumStringBody(value: EnumStringBodyBuilder): Self = StObject.set(x, "enumStringBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumStringMember(value: EnumStringMemberBuilder): Self = StObject.set(x, "enumStringMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumSymbolBody(value: EnumSymbolBodyBuilder): Self = StObject.set(x, "enumSymbolBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExistentialTypeParam(value: ExistentialTypeParamBuilder): Self = StObject.set(x, "existentialTypeParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExistsTypeAnnotation(value: ExistsTypeAnnotationBuilder): Self = StObject.set(x, "existsTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportAllDeclaration(value: ExportAllDeclarationBuilder): Self = StObject.set(x, "exportAllDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportBatchSpecifier(value: ExportBatchSpecifierBuilder): Self = StObject.set(x, "exportBatchSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportDeclaration(value: ExportDeclarationBuilder): Self = StObject.set(x, "exportDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportDefaultDeclaration(value: ExportDefaultDeclarationBuilder): Self = StObject.set(x, "exportDefaultDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportDefaultSpecifier(value: ExportDefaultSpecifierBuilder): Self = StObject.set(x, "exportDefaultSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportNamedDeclaration(value: ExportNamedDeclarationBuilder): Self = StObject.set(x, "exportNamedDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportNamespaceSpecifier(value: ExportNamespaceSpecifierBuilder): Self = StObject.set(x, "exportNamespaceSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportSpecifier(value: ExportSpecifierBuilder): Self = StObject.set(x, "exportSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionStatement(value: ExpressionStatementBuilder): Self = StObject.set(x, "expressionStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: FileBuilder): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForAwaitStatement(value: ForAwaitStatementBuilder): Self = StObject.set(x, "forAwaitStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForInStatement(value: ForInStatementBuilder): Self = StObject.set(x, "forInStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForOfStatement(value: ForOfStatementBuilder): Self = StObject.set(x, "forOfStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForStatement(value: ForStatementBuilder): Self = StObject.set(x, "forStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionDeclaration(value: FunctionDeclarationBuilder): Self = StObject.set(x, "functionDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionExpression(value: FunctionExpressionBuilder): Self = StObject.set(x, "functionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionTypeAnnotation(value: FunctionTypeAnnotationBuilder): Self = StObject.set(x, "functionTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionTypeParam(value: FunctionTypeParamBuilder): Self = StObject.set(x, "functionTypeParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratorExpression(value: GeneratorExpressionBuilder): Self = StObject.set(x, "generatorExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenericTypeAnnotation(value: GenericTypeAnnotationBuilder): Self = StObject.set(x, "genericTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: IdentifierBuilder): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfStatement(value: IfStatementBuilder): Self = StObject.set(x, "ifStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImport(value: ImportBuilder): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportDeclaration(value: ImportDeclarationBuilder): Self = StObject.set(x, "importDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportDefaultSpecifier(value: ImportDefaultSpecifierBuilder): Self = StObject.set(x, "importDefaultSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportExpression(value: ImportExpressionBuilder): Self = StObject.set(x, "importExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportNamespaceSpecifier(value: ImportNamespaceSpecifierBuilder): Self = StObject.set(x, "importNamespaceSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportSpecifier(value: ImportSpecifierBuilder): Self = StObject.set(x, "importSpecifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInferredPredicate(value: InferredPredicateBuilder): Self = StObject.set(x, "inferredPredicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceDeclaration(value: InterfaceDeclarationBuilder): Self = StObject.set(x, "interfaceDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceExtends(value: InterfaceExtendsBuilder): Self = StObject.set(x, "interfaceExtends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceTypeAnnotation(value: InterfaceTypeAnnotationBuilder): Self = StObject.set(x, "interfaceTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpreterDirective(value: InterpreterDirectiveBuilder): Self = StObject.set(x, "interpreterDirective", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectionTypeAnnotation(value: IntersectionTypeAnnotationBuilder): Self = StObject.set(x, "intersectionTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsxAttribute(value: JSXAttributeBuilder): Self = StObject.set(x, "jsxAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsxClosingElement(value: JSXClosingElementBuilder): Self = StObject.set(x, "jsxClosingElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsxClosingFragment(value: JSXClosingFragmentBuilder): Self = StObject.set(x, "jsxClosingFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsxElement(value: JSXElementBuilder): Self = StObject.set(x, "jsxElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsxEmptyExpression(value: JSXEmptyExpressionBuilder): Self = StObject.set(x, "jsxEmptyExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsxExpressionContainer(value: JSXExpressionContainerBuilder): Self = StObject.set(x, "jsxExpressionContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsxFragment(value: JSXFragmentBuilder): Self = StObject.set(x, "jsxFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsxIdentifier(value: JSXIdentifierBuilder): Self = StObject.set(x, "jsxIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsxMemberExpression(value: JSXMemberExpressionBuilder): Self = StObject.set(x, "jsxMemberExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsxNamespacedName(value: JSXNamespacedNameBuilder): Self = StObject.set(x, "jsxNamespacedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsxOpeningElement(value: JSXOpeningElementBuilder): Self = StObject.set(x, "jsxOpeningElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsxOpeningFragment(value: JSXOpeningFragmentBuilder): Self = StObject.set(x, "jsxOpeningFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsxSpreadAttribute(value: JSXSpreadAttributeBuilder): Self = StObject.set(x, "jsxSpreadAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsxSpreadChild(value: JSXSpreadChildBuilder): Self = StObject.set(x, "jsxSpreadChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsxText(value: JSXTextBuilder): Self = StObject.set(x, "jsxText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabeledStatement(value: LabeledStatementBuilder): Self = StObject.set(x, "labeledStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: LineBuilder): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiteral(value: LiteralBuilder): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalExpression(value: LogicalExpressionBuilder): Self = StObject.set(x, "logicalExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberExpression(value: MemberExpressionBuilder): Self = StObject.set(x, "memberExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberTypeAnnotation(value: MemberTypeAnnotationBuilder): Self = StObject.set(x, "memberTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaProperty(value: MetaPropertyBuilder): Self = StObject.set(x, "metaProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodDefinition(value: MethodDefinitionBuilder): Self = StObject.set(x, "methodDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixedTypeAnnotation(value: MixedTypeAnnotationBuilder): Self = StObject.set(x, "mixedTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewExpression(value: NewExpressionBuilder): Self = StObject.set(x, "newExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoop(value: NoopBuilder): Self = StObject.set(x, "noop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullLiteral(value: NullLiteralBuilder): Self = StObject.set(x, "nullLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullLiteralTypeAnnotation(value: NullLiteralTypeAnnotationBuilder): Self = StObject.set(x, "nullLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullTypeAnnotation(value: NullTypeAnnotationBuilder): Self = StObject.set(x, "nullTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullableTypeAnnotation(value: NullableTypeAnnotationBuilder): Self = StObject.set(x, "nullableTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberLiteralTypeAnnotation(value: NumberLiteralTypeAnnotationBuilder): Self = StObject.set(x, "numberLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberTypeAnnotation(value: NumberTypeAnnotationBuilder): Self = StObject.set(x, "numberTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericLiteral(value: NumericLiteralBuilder): Self = StObject.set(x, "numericLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericLiteralTypeAnnotation(value: NumericLiteralTypeAnnotationBuilder): Self = StObject.set(x, "numericLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectExpression(value: ObjectExpressionBuilder): Self = StObject.set(x, "objectExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectMethod(value: ObjectMethodBuilder): Self = StObject.set(x, "objectMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectPattern(value: ObjectPatternBuilder): Self = StObject.set(x, "objectPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectProperty(value: ObjectPropertyBuilder): Self = StObject.set(x, "objectProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeAnnotation(value: ObjectTypeAnnotationBuilder): Self = StObject.set(x, "objectTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeCallProperty(value: ObjectTypeCallPropertyBuilder): Self = StObject.set(x, "objectTypeCallProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeIndexer(value: ObjectTypeIndexerBuilder): Self = StObject.set(x, "objectTypeIndexer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeInternalSlot(value: ObjectTypeInternalSlotBuilder): Self = StObject.set(x, "objectTypeInternalSlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeProperty(value: ObjectTypePropertyBuilder): Self = StObject.set(x, "objectTypeProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeSpreadProperty(value: ObjectTypeSpreadPropertyBuilder): Self = StObject.set(x, "objectTypeSpreadProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpaqueType(value: OpaqueTypeBuilder): Self = StObject.set(x, "opaqueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalCallExpression(value: OptionalCallExpressionBuilder): Self = StObject.set(x, "optionalCallExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalMemberExpression(value: OptionalMemberExpressionBuilder): Self = StObject.set(x, "optionalMemberExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParenthesizedExpression(value: ParenthesizedExpressionBuilder): Self = StObject.set(x, "parenthesizedExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateName(value: PrivateNameBuilder): Self = StObject.set(x, "privateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgram(value: ProgramBuilder): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: PropertyBuilder): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyPattern(value: PropertyPatternBuilder): Self = StObject.set(x, "propertyPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifiedTypeIdentifier(value: QualifiedTypeIdentifierBuilder): Self = StObject.set(x, "qualifiedTypeIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegExpLiteral(value: RegExpLiteralBuilder): Self = StObject.set(x, "regExpLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestElement(value: RestElementBuilder): Self = StObject.set(x, "restElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestProperty(value: RestPropertyBuilder): Self = StObject.set(x, "restProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnStatement(value: ReturnStatementBuilder): Self = StObject.set(x, "returnStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceExpression(value: SequenceExpressionBuilder): Self = StObject.set(x, "sequenceExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadElement(value: SpreadElementBuilder): Self = StObject.set(x, "spreadElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadElementPattern(value: SpreadElementPatternBuilder): Self = StObject.set(x, "spreadElementPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadProperty(value: SpreadPropertyBuilder): Self = StObject.set(x, "spreadProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadPropertyPattern(value: SpreadPropertyPatternBuilder): Self = StObject.set(x, "spreadPropertyPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringLiteral(value: StringLiteralBuilder): Self = StObject.set(x, "stringLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringLiteralTypeAnnotation(value: StringLiteralTypeAnnotationBuilder): Self = StObject.set(x, "stringLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringTypeAnnotation(value: StringTypeAnnotationBuilder): Self = StObject.set(x, "stringTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuper(value: SuperBuilder): Self = StObject.set(x, "super", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchCase(value: SwitchCaseBuilder): Self = StObject.set(x, "switchCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchStatement(value: SwitchStatementBuilder): Self = StObject.set(x, "switchStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolTypeAnnotation(value: SymbolTypeAnnotationBuilder): Self = StObject.set(x, "symbolTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaggedTemplateExpression(value: TaggedTemplateExpressionBuilder): Self = StObject.set(x, "taggedTemplateExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateElement(value: TemplateElementBuilder): Self = StObject.set(x, "templateElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateLiteral(value: TemplateLiteralBuilder): Self = StObject.set(x, "templateLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThisExpression(value: ThisExpressionBuilder): Self = StObject.set(x, "thisExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThisTypeAnnotation(value: ThisTypeAnnotationBuilder): Self = StObject.set(x, "thisTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowStatement(value: ThrowStatementBuilder): Self = StObject.set(x, "throwStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryStatement(value: TryStatementBuilder): Self = StObject.set(x, "tryStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsAnyKeyword(value: TSAnyKeywordBuilder): Self = StObject.set(x, "tsAnyKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsArrayType(value: TSArrayTypeBuilder): Self = StObject.set(x, "tsArrayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsAsExpression(value: TSAsExpressionBuilder): Self = StObject.set(x, "tsAsExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsBigIntKeyword(value: TSBigIntKeywordBuilder): Self = StObject.set(x, "tsBigIntKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsBooleanKeyword(value: TSBooleanKeywordBuilder): Self = StObject.set(x, "tsBooleanKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsCallSignatureDeclaration(value: TSCallSignatureDeclarationBuilder): Self = StObject.set(x, "tsCallSignatureDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsConditionalType(value: TSConditionalTypeBuilder): Self = StObject.set(x, "tsConditionalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsConstructSignatureDeclaration(value: TSConstructSignatureDeclarationBuilder): Self = StObject.set(x, "tsConstructSignatureDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsConstructorType(value: TSConstructorTypeBuilder): Self = StObject.set(x, "tsConstructorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsDeclareFunction(value: TSDeclareFunctionBuilder): Self = StObject.set(x, "tsDeclareFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsDeclareMethod(value: TSDeclareMethodBuilder): Self = StObject.set(x, "tsDeclareMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsEnumDeclaration(value: TSEnumDeclarationBuilder): Self = StObject.set(x, "tsEnumDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsEnumMember(value: TSEnumMemberBuilder): Self = StObject.set(x, "tsEnumMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsExportAssignment(value: TSExportAssignmentBuilder): Self = StObject.set(x, "tsExportAssignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsExpressionWithTypeArguments(value: TSExpressionWithTypeArgumentsBuilder): Self = StObject.set(x, "tsExpressionWithTypeArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsExternalModuleReference(value: TSExternalModuleReferenceBuilder): Self = StObject.set(x, "tsExternalModuleReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsFunctionType(value: TSFunctionTypeBuilder): Self = StObject.set(x, "tsFunctionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsImportEqualsDeclaration(value: TSImportEqualsDeclarationBuilder): Self = StObject.set(x, "tsImportEqualsDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsImportType(value: TSImportTypeBuilder): Self = StObject.set(x, "tsImportType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsIndexSignature(value: TSIndexSignatureBuilder): Self = StObject.set(x, "tsIndexSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsIndexedAccessType(value: TSIndexedAccessTypeBuilder): Self = StObject.set(x, "tsIndexedAccessType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsInferType(value: TSInferTypeBuilder): Self = StObject.set(x, "tsInferType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsInterfaceBody(value: TSInterfaceBodyBuilder): Self = StObject.set(x, "tsInterfaceBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsInterfaceDeclaration(value: TSInterfaceDeclarationBuilder): Self = StObject.set(x, "tsInterfaceDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsIntersectionType(value: TSIntersectionTypeBuilder): Self = StObject.set(x, "tsIntersectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsLiteralType(value: TSLiteralTypeBuilder): Self = StObject.set(x, "tsLiteralType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsMappedType(value: TSMappedTypeBuilder): Self = StObject.set(x, "tsMappedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsMethodSignature(value: TSMethodSignatureBuilder): Self = StObject.set(x, "tsMethodSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsModuleBlock(value: TSModuleBlockBuilder): Self = StObject.set(x, "tsModuleBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsModuleDeclaration(value: TSModuleDeclarationBuilder): Self = StObject.set(x, "tsModuleDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsNamedTupleMember(value: TSNamedTupleMemberBuilder): Self = StObject.set(x, "tsNamedTupleMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsNamespaceExportDeclaration(value: TSNamespaceExportDeclarationBuilder): Self = StObject.set(x, "tsNamespaceExportDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsNeverKeyword(value: TSNeverKeywordBuilder): Self = StObject.set(x, "tsNeverKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsNonNullExpression(value: TSNonNullExpressionBuilder): Self = StObject.set(x, "tsNonNullExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsNullKeyword(value: TSNullKeywordBuilder): Self = StObject.set(x, "tsNullKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsNumberKeyword(value: TSNumberKeywordBuilder): Self = StObject.set(x, "tsNumberKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsObjectKeyword(value: TSObjectKeywordBuilder): Self = StObject.set(x, "tsObjectKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsOptionalType(value: TSOptionalTypeBuilder): Self = StObject.set(x, "tsOptionalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsParameterProperty(value: TSParameterPropertyBuilder): Self = StObject.set(x, "tsParameterProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsParenthesizedType(value: TSParenthesizedTypeBuilder): Self = StObject.set(x, "tsParenthesizedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsPropertySignature(value: TSPropertySignatureBuilder): Self = StObject.set(x, "tsPropertySignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsQualifiedName(value: TSQualifiedNameBuilder): Self = StObject.set(x, "tsQualifiedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsRestType(value: TSRestTypeBuilder): Self = StObject.set(x, "tsRestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsStringKeyword(value: TSStringKeywordBuilder): Self = StObject.set(x, "tsStringKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsSymbolKeyword(value: TSSymbolKeywordBuilder): Self = StObject.set(x, "tsSymbolKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsThisType(value: TSThisTypeBuilder): Self = StObject.set(x, "tsThisType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsTupleType(value: TSTupleTypeBuilder): Self = StObject.set(x, "tsTupleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsTypeAliasDeclaration(value: TSTypeAliasDeclarationBuilder): Self = StObject.set(x, "tsTypeAliasDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsTypeAnnotation(value: TSTypeAnnotationBuilder): Self = StObject.set(x, "tsTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsTypeAssertion(value: TSTypeAssertionBuilder): Self = StObject.set(x, "tsTypeAssertion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsTypeLiteral(value: TSTypeLiteralBuilder): Self = StObject.set(x, "tsTypeLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsTypeOperator(value: TSTypeOperatorBuilder): Self = StObject.set(x, "tsTypeOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsTypeParameter(value: TSTypeParameterBuilder): Self = StObject.set(x, "tsTypeParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsTypeParameterDeclaration(value: TSTypeParameterDeclarationBuilder): Self = StObject.set(x, "tsTypeParameterDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsTypeParameterInstantiation(value: TSTypeParameterInstantiationBuilder): Self = StObject.set(x, "tsTypeParameterInstantiation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsTypePredicate(value: TSTypePredicateBuilder): Self = StObject.set(x, "tsTypePredicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsTypeQuery(value: TSTypeQueryBuilder): Self = StObject.set(x, "tsTypeQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsTypeReference(value: TSTypeReferenceBuilder): Self = StObject.set(x, "tsTypeReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsUndefinedKeyword(value: TSUndefinedKeywordBuilder): Self = StObject.set(x, "tsUndefinedKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsUnionType(value: TSUnionTypeBuilder): Self = StObject.set(x, "tsUnionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsUnknownKeyword(value: TSUnknownKeywordBuilder): Self = StObject.set(x, "tsUnknownKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsVoidKeyword(value: TSVoidKeywordBuilder): Self = StObject.set(x, "tsVoidKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTupleTypeAnnotation(value: TupleTypeAnnotationBuilder): Self = StObject.set(x, "tupleTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAlias(value: TypeAliasBuilder): Self = StObject.set(x, "typeAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotationBuilder): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeCastExpression(value: TypeCastExpressionBuilder): Self = StObject.set(x, "typeCastExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameter(value: TypeParameterBuilder): Self = StObject.set(x, "typeParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameterDeclaration(value: TypeParameterDeclarationBuilder): Self = StObject.set(x, "typeParameterDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameterInstantiation(value: TypeParameterInstantiationBuilder): Self = StObject.set(x, "typeParameterInstantiation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeofTypeAnnotation(value: TypeofTypeAnnotationBuilder): Self = StObject.set(x, "typeofTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnaryExpression(value: UnaryExpressionBuilder): Self = StObject.set(x, "unaryExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnionTypeAnnotation(value: UnionTypeAnnotationBuilder): Self = StObject.set(x, "unionTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateExpression(value: UpdateExpressionBuilder): Self = StObject.set(x, "updateExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableDeclaration(value: VariableDeclarationBuilder): Self = StObject.set(x, "variableDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableDeclarator(value: VariableDeclaratorBuilder): Self = StObject.set(x, "variableDeclarator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariance(value: VarianceBuilder): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoidTypeAnnotation(value: VoidTypeAnnotationBuilder): Self = StObject.set(x, "voidTypeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhileStatement(value: WhileStatementBuilder): Self = StObject.set(x, "whileStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithStatement(value: WithStatementBuilder): Self = StObject.set(x, "withStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYieldExpression(value: YieldExpressionBuilder): Self = StObject.set(x, "yieldExpression", value.asInstanceOf[js.Any])
  }
}
