package typings.astTypes.buildersMod

import org.scalablytyped.runtime.StringDictionary
import typings.astTypes.AnonCooked
import typings.astTypes.astTypesStrings.Ampersand
import typings.astTypes.astTypesStrings.AmpersandAmpersand
import typings.astTypes.astTypesStrings.AmpersandEqualssign
import typings.astTypes.astTypesStrings.Asterisk
import typings.astTypes.astTypesStrings.AsteriskAsterisk
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
import typings.astTypes.kindsMod.DeclareVariableKind
import typings.astTypes.kindsMod.DirectiveLiteralKind
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
import typings.astTypes.kindsMod.InterfaceExtendsKind
import typings.astTypes.kindsMod.JSXAttributeKind
import typings.astTypes.kindsMod.JSXClosingElementKind
import typings.astTypes.kindsMod.JSXClosingFragmentKind
import typings.astTypes.kindsMod.JSXElementKind
import typings.astTypes.kindsMod.JSXExpressionContainerKind
import typings.astTypes.kindsMod.JSXFragmentKind
import typings.astTypes.kindsMod.JSXIdentifierKind
import typings.astTypes.kindsMod.JSXMemberExpressionKind
import typings.astTypes.kindsMod.JSXNamespacedNameKind
import typings.astTypes.kindsMod.JSXOpeningElementKind
import typings.astTypes.kindsMod.JSXOpeningFragmentKind
import typings.astTypes.kindsMod.JSXSpreadAttributeKind
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
import typings.astTypes.kindsMod.TSPropertySignatureKind
import typings.astTypes.kindsMod.TSQualifiedNameKind
import typings.astTypes.kindsMod.TSThisTypeKind
import typings.astTypes.kindsMod.TSTypeAnnotationKind
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.kindsMod.TSTypeParameterInstantiationKind
import typings.astTypes.kindsMod.TSTypeParameterKind
import typings.astTypes.kindsMod.TemplateElementKind
import typings.astTypes.kindsMod.TemplateLiteralKind
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait builders
  extends /* builderName */ StringDictionary[js.Any] {
  @JSName("anyTypeAnnotation")
  var anyTypeAnnotation_Original: AnyTypeAnnotationBuilder = js.native
  @JSName("arrayExpression")
  var arrayExpression_Original: ArrayExpressionBuilder = js.native
  @JSName("arrayPattern")
  var arrayPattern_Original: ArrayPatternBuilder = js.native
  @JSName("arrayTypeAnnotation")
  var arrayTypeAnnotation_Original: ArrayTypeAnnotationBuilder = js.native
  @JSName("arrowFunctionExpression")
  var arrowFunctionExpression_Original: ArrowFunctionExpressionBuilder = js.native
  @JSName("assignmentExpression")
  var assignmentExpression_Original: AssignmentExpressionBuilder = js.native
  @JSName("assignmentPattern")
  var assignmentPattern_Original: AssignmentPatternBuilder = js.native
  @JSName("awaitExpression")
  var awaitExpression_Original: AwaitExpressionBuilder = js.native
  @JSName("bigIntLiteral")
  var bigIntLiteral_Original: BigIntLiteralBuilder = js.native
  @JSName("binaryExpression")
  var binaryExpression_Original: BinaryExpressionBuilder = js.native
  @JSName("bindExpression")
  var bindExpression_Original: BindExpressionBuilder = js.native
  @JSName("blockStatement")
  var blockStatement_Original: BlockStatementBuilder = js.native
  @JSName("block")
  var block_Original: BlockBuilder = js.native
  @JSName("booleanLiteralTypeAnnotation")
  var booleanLiteralTypeAnnotation_Original: BooleanLiteralTypeAnnotationBuilder = js.native
  @JSName("booleanLiteral")
  var booleanLiteral_Original: BooleanLiteralBuilder = js.native
  @JSName("booleanTypeAnnotation")
  var booleanTypeAnnotation_Original: BooleanTypeAnnotationBuilder = js.native
  @JSName("breakStatement")
  var breakStatement_Original: BreakStatementBuilder = js.native
  @JSName("callExpression")
  var callExpression_Original: CallExpressionBuilder = js.native
  @JSName("catchClause")
  var catchClause_Original: CatchClauseBuilder = js.native
  @JSName("classBody")
  var classBody_Original: ClassBodyBuilder = js.native
  @JSName("classDeclaration")
  var classDeclaration_Original: ClassDeclarationBuilder = js.native
  @JSName("classExpression")
  var classExpression_Original: ClassExpressionBuilder = js.native
  @JSName("classImplements")
  var classImplements_Original: ClassImplementsBuilder = js.native
  @JSName("classMethod")
  var classMethod_Original: ClassMethodBuilder = js.native
  @JSName("classPrivateMethod")
  var classPrivateMethod_Original: ClassPrivateMethodBuilder = js.native
  @JSName("classPrivateProperty")
  var classPrivateProperty_Original: ClassPrivatePropertyBuilder = js.native
  @JSName("classPropertyDefinition")
  var classPropertyDefinition_Original: ClassPropertyDefinitionBuilder = js.native
  @JSName("classProperty")
  var classProperty_Original: ClassPropertyBuilder = js.native
  @JSName("commentBlock")
  var commentBlock_Original: CommentBlockBuilder = js.native
  @JSName("commentLine")
  var commentLine_Original: CommentLineBuilder = js.native
  @JSName("comprehensionBlock")
  var comprehensionBlock_Original: ComprehensionBlockBuilder = js.native
  @JSName("comprehensionExpression")
  var comprehensionExpression_Original: ComprehensionExpressionBuilder = js.native
  @JSName("conditionalExpression")
  var conditionalExpression_Original: ConditionalExpressionBuilder = js.native
  @JSName("continueStatement")
  var continueStatement_Original: ContinueStatementBuilder = js.native
  @JSName("debuggerStatement")
  var debuggerStatement_Original: DebuggerStatementBuilder = js.native
  @JSName("declareClass")
  var declareClass_Original: DeclareClassBuilder = js.native
  @JSName("declareExportAllDeclaration")
  var declareExportAllDeclaration_Original: DeclareExportAllDeclarationBuilder = js.native
  @JSName("declareExportDeclaration")
  var declareExportDeclaration_Original: DeclareExportDeclarationBuilder = js.native
  @JSName("declareFunction")
  var declareFunction_Original: DeclareFunctionBuilder = js.native
  @JSName("declareInterface")
  var declareInterface_Original: DeclareInterfaceBuilder = js.native
  @JSName("declareModuleExports")
  var declareModuleExports_Original: DeclareModuleExportsBuilder = js.native
  @JSName("declareModule")
  var declareModule_Original: DeclareModuleBuilder = js.native
  @JSName("declareOpaqueType")
  var declareOpaqueType_Original: DeclareOpaqueTypeBuilder = js.native
  @JSName("declareTypeAlias")
  var declareTypeAlias_Original: DeclareTypeAliasBuilder = js.native
  @JSName("declareVariable")
  var declareVariable_Original: DeclareVariableBuilder = js.native
  @JSName("declaredPredicate")
  var declaredPredicate_Original: DeclaredPredicateBuilder = js.native
  @JSName("decorator")
  var decorator_Original: DecoratorBuilder = js.native
  @JSName("directiveLiteral")
  var directiveLiteral_Original: DirectiveLiteralBuilder = js.native
  @JSName("directive")
  var directive_Original: DirectiveBuilder = js.native
  @JSName("doExpression")
  var doExpression_Original: DoExpressionBuilder = js.native
  @JSName("doWhileStatement")
  var doWhileStatement_Original: DoWhileStatementBuilder = js.native
  @JSName("emptyStatement")
  var emptyStatement_Original: EmptyStatementBuilder = js.native
  @JSName("emptyTypeAnnotation")
  var emptyTypeAnnotation_Original: EmptyTypeAnnotationBuilder = js.native
  @JSName("existentialTypeParam")
  var existentialTypeParam_Original: ExistentialTypeParamBuilder = js.native
  @JSName("existsTypeAnnotation")
  var existsTypeAnnotation_Original: ExistsTypeAnnotationBuilder = js.native
  @JSName("exportAllDeclaration")
  var exportAllDeclaration_Original: ExportAllDeclarationBuilder = js.native
  @JSName("exportBatchSpecifier")
  var exportBatchSpecifier_Original: ExportBatchSpecifierBuilder = js.native
  @JSName("exportDeclaration")
  var exportDeclaration_Original: ExportDeclarationBuilder = js.native
  @JSName("exportDefaultDeclaration")
  var exportDefaultDeclaration_Original: ExportDefaultDeclarationBuilder = js.native
  @JSName("exportDefaultSpecifier")
  var exportDefaultSpecifier_Original: ExportDefaultSpecifierBuilder = js.native
  @JSName("exportNamedDeclaration")
  var exportNamedDeclaration_Original: ExportNamedDeclarationBuilder = js.native
  @JSName("exportNamespaceSpecifier")
  var exportNamespaceSpecifier_Original: ExportNamespaceSpecifierBuilder = js.native
  @JSName("exportSpecifier")
  var exportSpecifier_Original: ExportSpecifierBuilder = js.native
  @JSName("expressionStatement")
  var expressionStatement_Original: ExpressionStatementBuilder = js.native
  @JSName("file")
  var file_Original: FileBuilder = js.native
  @JSName("forAwaitStatement")
  var forAwaitStatement_Original: ForAwaitStatementBuilder = js.native
  @JSName("forInStatement")
  var forInStatement_Original: ForInStatementBuilder = js.native
  @JSName("forOfStatement")
  var forOfStatement_Original: ForOfStatementBuilder = js.native
  @JSName("forStatement")
  var forStatement_Original: ForStatementBuilder = js.native
  @JSName("functionDeclaration")
  var functionDeclaration_Original: FunctionDeclarationBuilder = js.native
  @JSName("functionExpression")
  var functionExpression_Original: FunctionExpressionBuilder = js.native
  @JSName("functionTypeAnnotation")
  var functionTypeAnnotation_Original: FunctionTypeAnnotationBuilder = js.native
  @JSName("functionTypeParam")
  var functionTypeParam_Original: FunctionTypeParamBuilder = js.native
  @JSName("generatorExpression")
  var generatorExpression_Original: GeneratorExpressionBuilder = js.native
  @JSName("genericTypeAnnotation")
  var genericTypeAnnotation_Original: GenericTypeAnnotationBuilder = js.native
  @JSName("identifier")
  var identifier_Original: IdentifierBuilder = js.native
  @JSName("ifStatement")
  var ifStatement_Original: IfStatementBuilder = js.native
  @JSName("importDeclaration")
  var importDeclaration_Original: ImportDeclarationBuilder = js.native
  @JSName("importDefaultSpecifier")
  var importDefaultSpecifier_Original: ImportDefaultSpecifierBuilder = js.native
  @JSName("importNamespaceSpecifier")
  var importNamespaceSpecifier_Original: ImportNamespaceSpecifierBuilder = js.native
  @JSName("importSpecifier")
  var importSpecifier_Original: ImportSpecifierBuilder = js.native
  @JSName("import")
  var import_Original: ImportBuilder = js.native
  @JSName("inferredPredicate")
  var inferredPredicate_Original: InferredPredicateBuilder = js.native
  @JSName("interfaceDeclaration")
  var interfaceDeclaration_Original: InterfaceDeclarationBuilder = js.native
  @JSName("interfaceExtends")
  var interfaceExtends_Original: InterfaceExtendsBuilder = js.native
  @JSName("interfaceTypeAnnotation")
  var interfaceTypeAnnotation_Original: InterfaceTypeAnnotationBuilder = js.native
  @JSName("interpreterDirective")
  var interpreterDirective_Original: InterpreterDirectiveBuilder = js.native
  @JSName("intersectionTypeAnnotation")
  var intersectionTypeAnnotation_Original: IntersectionTypeAnnotationBuilder = js.native
  @JSName("jsxAttribute")
  var jsxAttribute_Original: JSXAttributeBuilder = js.native
  @JSName("jsxClosingElement")
  var jsxClosingElement_Original: JSXClosingElementBuilder = js.native
  @JSName("jsxClosingFragment")
  var jsxClosingFragment_Original: JSXClosingFragmentBuilder = js.native
  @JSName("jsxElement")
  var jsxElement_Original: JSXElementBuilder = js.native
  @JSName("jsxEmptyExpression")
  var jsxEmptyExpression_Original: JSXEmptyExpressionBuilder = js.native
  @JSName("jsxExpressionContainer")
  var jsxExpressionContainer_Original: JSXExpressionContainerBuilder = js.native
  @JSName("jsxFragment")
  var jsxFragment_Original: JSXFragmentBuilder = js.native
  @JSName("jsxIdentifier")
  var jsxIdentifier_Original: JSXIdentifierBuilder = js.native
  @JSName("jsxMemberExpression")
  var jsxMemberExpression_Original: JSXMemberExpressionBuilder = js.native
  @JSName("jsxNamespacedName")
  var jsxNamespacedName_Original: JSXNamespacedNameBuilder = js.native
  @JSName("jsxOpeningElement")
  var jsxOpeningElement_Original: JSXOpeningElementBuilder = js.native
  @JSName("jsxOpeningFragment")
  var jsxOpeningFragment_Original: JSXOpeningFragmentBuilder = js.native
  @JSName("jsxSpreadAttribute")
  var jsxSpreadAttribute_Original: JSXSpreadAttributeBuilder = js.native
  @JSName("jsxSpreadChild")
  var jsxSpreadChild_Original: JSXSpreadChildBuilder = js.native
  @JSName("jsxText")
  var jsxText_Original: JSXTextBuilder = js.native
  @JSName("labeledStatement")
  var labeledStatement_Original: LabeledStatementBuilder = js.native
  @JSName("line")
  var line_Original: LineBuilder = js.native
  @JSName("literal")
  var literal_Original: LiteralBuilder = js.native
  @JSName("logicalExpression")
  var logicalExpression_Original: LogicalExpressionBuilder = js.native
  @JSName("memberExpression")
  var memberExpression_Original: MemberExpressionBuilder = js.native
  @JSName("memberTypeAnnotation")
  var memberTypeAnnotation_Original: MemberTypeAnnotationBuilder = js.native
  @JSName("metaProperty")
  var metaProperty_Original: MetaPropertyBuilder = js.native
  @JSName("methodDefinition")
  var methodDefinition_Original: MethodDefinitionBuilder = js.native
  @JSName("mixedTypeAnnotation")
  var mixedTypeAnnotation_Original: MixedTypeAnnotationBuilder = js.native
  @JSName("newExpression")
  var newExpression_Original: NewExpressionBuilder = js.native
  @JSName("noop")
  var noop_Original: NoopBuilder = js.native
  @JSName("nullLiteralTypeAnnotation")
  var nullLiteralTypeAnnotation_Original: NullLiteralTypeAnnotationBuilder = js.native
  @JSName("nullLiteral")
  var nullLiteral_Original: NullLiteralBuilder = js.native
  @JSName("nullTypeAnnotation")
  var nullTypeAnnotation_Original: NullTypeAnnotationBuilder = js.native
  @JSName("nullableTypeAnnotation")
  var nullableTypeAnnotation_Original: NullableTypeAnnotationBuilder = js.native
  @JSName("numberLiteralTypeAnnotation")
  var numberLiteralTypeAnnotation_Original: NumberLiteralTypeAnnotationBuilder = js.native
  @JSName("numberTypeAnnotation")
  var numberTypeAnnotation_Original: NumberTypeAnnotationBuilder = js.native
  @JSName("numericLiteralTypeAnnotation")
  var numericLiteralTypeAnnotation_Original: NumericLiteralTypeAnnotationBuilder = js.native
  @JSName("numericLiteral")
  var numericLiteral_Original: NumericLiteralBuilder = js.native
  @JSName("objectExpression")
  var objectExpression_Original: ObjectExpressionBuilder = js.native
  @JSName("objectMethod")
  var objectMethod_Original: ObjectMethodBuilder = js.native
  @JSName("objectPattern")
  var objectPattern_Original: ObjectPatternBuilder = js.native
  @JSName("objectProperty")
  var objectProperty_Original: ObjectPropertyBuilder = js.native
  @JSName("objectTypeAnnotation")
  var objectTypeAnnotation_Original: ObjectTypeAnnotationBuilder = js.native
  @JSName("objectTypeCallProperty")
  var objectTypeCallProperty_Original: ObjectTypeCallPropertyBuilder = js.native
  @JSName("objectTypeIndexer")
  var objectTypeIndexer_Original: ObjectTypeIndexerBuilder = js.native
  @JSName("objectTypeInternalSlot")
  var objectTypeInternalSlot_Original: ObjectTypeInternalSlotBuilder = js.native
  @JSName("objectTypeProperty")
  var objectTypeProperty_Original: ObjectTypePropertyBuilder = js.native
  @JSName("objectTypeSpreadProperty")
  var objectTypeSpreadProperty_Original: ObjectTypeSpreadPropertyBuilder = js.native
  @JSName("opaqueType")
  var opaqueType_Original: OpaqueTypeBuilder = js.native
  @JSName("optionalCallExpression")
  var optionalCallExpression_Original: OptionalCallExpressionBuilder = js.native
  @JSName("optionalMemberExpression")
  var optionalMemberExpression_Original: OptionalMemberExpressionBuilder = js.native
  @JSName("parenthesizedExpression")
  var parenthesizedExpression_Original: ParenthesizedExpressionBuilder = js.native
  @JSName("privateName")
  var privateName_Original: PrivateNameBuilder = js.native
  @JSName("program")
  var program_Original: ProgramBuilder = js.native
  @JSName("propertyPattern")
  var propertyPattern_Original: PropertyPatternBuilder = js.native
  @JSName("property")
  var property_Original: PropertyBuilder = js.native
  @JSName("qualifiedTypeIdentifier")
  var qualifiedTypeIdentifier_Original: QualifiedTypeIdentifierBuilder = js.native
  @JSName("regExpLiteral")
  var regExpLiteral_Original: RegExpLiteralBuilder = js.native
  @JSName("restElement")
  var restElement_Original: RestElementBuilder = js.native
  @JSName("restProperty")
  var restProperty_Original: RestPropertyBuilder = js.native
  @JSName("returnStatement")
  var returnStatement_Original: ReturnStatementBuilder = js.native
  @JSName("sequenceExpression")
  var sequenceExpression_Original: SequenceExpressionBuilder = js.native
  @JSName("spreadElementPattern")
  var spreadElementPattern_Original: SpreadElementPatternBuilder = js.native
  @JSName("spreadElement")
  var spreadElement_Original: SpreadElementBuilder = js.native
  @JSName("spreadPropertyPattern")
  var spreadPropertyPattern_Original: SpreadPropertyPatternBuilder = js.native
  @JSName("spreadProperty")
  var spreadProperty_Original: SpreadPropertyBuilder = js.native
  @JSName("stringLiteralTypeAnnotation")
  var stringLiteralTypeAnnotation_Original: StringLiteralTypeAnnotationBuilder = js.native
  @JSName("stringLiteral")
  var stringLiteral_Original: StringLiteralBuilder = js.native
  @JSName("stringTypeAnnotation")
  var stringTypeAnnotation_Original: StringTypeAnnotationBuilder = js.native
  @JSName("super")
  var super_Original: SuperBuilder = js.native
  @JSName("switchCase")
  var switchCase_Original: SwitchCaseBuilder = js.native
  @JSName("switchStatement")
  var switchStatement_Original: SwitchStatementBuilder = js.native
  @JSName("taggedTemplateExpression")
  var taggedTemplateExpression_Original: TaggedTemplateExpressionBuilder = js.native
  @JSName("templateElement")
  var templateElement_Original: TemplateElementBuilder = js.native
  @JSName("templateLiteral")
  var templateLiteral_Original: TemplateLiteralBuilder = js.native
  @JSName("thisExpression")
  var thisExpression_Original: ThisExpressionBuilder = js.native
  @JSName("thisTypeAnnotation")
  var thisTypeAnnotation_Original: ThisTypeAnnotationBuilder = js.native
  @JSName("throwStatement")
  var throwStatement_Original: ThrowStatementBuilder = js.native
  @JSName("tryStatement")
  var tryStatement_Original: TryStatementBuilder = js.native
  @JSName("tsAnyKeyword")
  var tsAnyKeyword_Original: TSAnyKeywordBuilder = js.native
  @JSName("tsArrayType")
  var tsArrayType_Original: TSArrayTypeBuilder = js.native
  @JSName("tsAsExpression")
  var tsAsExpression_Original: TSAsExpressionBuilder = js.native
  @JSName("tsBigIntKeyword")
  var tsBigIntKeyword_Original: TSBigIntKeywordBuilder = js.native
  @JSName("tsBooleanKeyword")
  var tsBooleanKeyword_Original: TSBooleanKeywordBuilder = js.native
  @JSName("tsCallSignatureDeclaration")
  var tsCallSignatureDeclaration_Original: TSCallSignatureDeclarationBuilder = js.native
  @JSName("tsConditionalType")
  var tsConditionalType_Original: TSConditionalTypeBuilder = js.native
  @JSName("tsConstructSignatureDeclaration")
  var tsConstructSignatureDeclaration_Original: TSConstructSignatureDeclarationBuilder = js.native
  @JSName("tsConstructorType")
  var tsConstructorType_Original: TSConstructorTypeBuilder = js.native
  @JSName("tsDeclareFunction")
  var tsDeclareFunction_Original: TSDeclareFunctionBuilder = js.native
  @JSName("tsDeclareMethod")
  var tsDeclareMethod_Original: TSDeclareMethodBuilder = js.native
  @JSName("tsEnumDeclaration")
  var tsEnumDeclaration_Original: TSEnumDeclarationBuilder = js.native
  @JSName("tsEnumMember")
  var tsEnumMember_Original: TSEnumMemberBuilder = js.native
  @JSName("tsExportAssignment")
  var tsExportAssignment_Original: TSExportAssignmentBuilder = js.native
  @JSName("tsExpressionWithTypeArguments")
  var tsExpressionWithTypeArguments_Original: TSExpressionWithTypeArgumentsBuilder = js.native
  @JSName("tsExternalModuleReference")
  var tsExternalModuleReference_Original: TSExternalModuleReferenceBuilder = js.native
  @JSName("tsFunctionType")
  var tsFunctionType_Original: TSFunctionTypeBuilder = js.native
  @JSName("tsImportEqualsDeclaration")
  var tsImportEqualsDeclaration_Original: TSImportEqualsDeclarationBuilder = js.native
  @JSName("tsImportType")
  var tsImportType_Original: TSImportTypeBuilder = js.native
  @JSName("tsIndexSignature")
  var tsIndexSignature_Original: TSIndexSignatureBuilder = js.native
  @JSName("tsIndexedAccessType")
  var tsIndexedAccessType_Original: TSIndexedAccessTypeBuilder = js.native
  @JSName("tsInferType")
  var tsInferType_Original: TSInferTypeBuilder = js.native
  @JSName("tsInterfaceBody")
  var tsInterfaceBody_Original: TSInterfaceBodyBuilder = js.native
  @JSName("tsInterfaceDeclaration")
  var tsInterfaceDeclaration_Original: TSInterfaceDeclarationBuilder = js.native
  @JSName("tsIntersectionType")
  var tsIntersectionType_Original: TSIntersectionTypeBuilder = js.native
  @JSName("tsLiteralType")
  var tsLiteralType_Original: TSLiteralTypeBuilder = js.native
  @JSName("tsMappedType")
  var tsMappedType_Original: TSMappedTypeBuilder = js.native
  @JSName("tsMethodSignature")
  var tsMethodSignature_Original: TSMethodSignatureBuilder = js.native
  @JSName("tsModuleBlock")
  var tsModuleBlock_Original: TSModuleBlockBuilder = js.native
  @JSName("tsModuleDeclaration")
  var tsModuleDeclaration_Original: TSModuleDeclarationBuilder = js.native
  @JSName("tsNamespaceExportDeclaration")
  var tsNamespaceExportDeclaration_Original: TSNamespaceExportDeclarationBuilder = js.native
  @JSName("tsNeverKeyword")
  var tsNeverKeyword_Original: TSNeverKeywordBuilder = js.native
  @JSName("tsNonNullExpression")
  var tsNonNullExpression_Original: TSNonNullExpressionBuilder = js.native
  @JSName("tsNullKeyword")
  var tsNullKeyword_Original: TSNullKeywordBuilder = js.native
  @JSName("tsNumberKeyword")
  var tsNumberKeyword_Original: TSNumberKeywordBuilder = js.native
  @JSName("tsObjectKeyword")
  var tsObjectKeyword_Original: TSObjectKeywordBuilder = js.native
  @JSName("tsOptionalType")
  var tsOptionalType_Original: TSOptionalTypeBuilder = js.native
  @JSName("tsParameterProperty")
  var tsParameterProperty_Original: TSParameterPropertyBuilder = js.native
  @JSName("tsParenthesizedType")
  var tsParenthesizedType_Original: TSParenthesizedTypeBuilder = js.native
  @JSName("tsPropertySignature")
  var tsPropertySignature_Original: TSPropertySignatureBuilder = js.native
  @JSName("tsQualifiedName")
  var tsQualifiedName_Original: TSQualifiedNameBuilder = js.native
  @JSName("tsRestType")
  var tsRestType_Original: TSRestTypeBuilder = js.native
  @JSName("tsStringKeyword")
  var tsStringKeyword_Original: TSStringKeywordBuilder = js.native
  @JSName("tsSymbolKeyword")
  var tsSymbolKeyword_Original: TSSymbolKeywordBuilder = js.native
  @JSName("tsThisType")
  var tsThisType_Original: TSThisTypeBuilder = js.native
  @JSName("tsTupleType")
  var tsTupleType_Original: TSTupleTypeBuilder = js.native
  @JSName("tsTypeAliasDeclaration")
  var tsTypeAliasDeclaration_Original: TSTypeAliasDeclarationBuilder = js.native
  @JSName("tsTypeAnnotation")
  var tsTypeAnnotation_Original: TSTypeAnnotationBuilder = js.native
  @JSName("tsTypeAssertion")
  var tsTypeAssertion_Original: TSTypeAssertionBuilder = js.native
  @JSName("tsTypeLiteral")
  var tsTypeLiteral_Original: TSTypeLiteralBuilder = js.native
  @JSName("tsTypeOperator")
  var tsTypeOperator_Original: TSTypeOperatorBuilder = js.native
  @JSName("tsTypeParameterDeclaration")
  var tsTypeParameterDeclaration_Original: TSTypeParameterDeclarationBuilder = js.native
  @JSName("tsTypeParameterInstantiation")
  var tsTypeParameterInstantiation_Original: TSTypeParameterInstantiationBuilder = js.native
  @JSName("tsTypeParameter")
  var tsTypeParameter_Original: TSTypeParameterBuilder = js.native
  @JSName("tsTypePredicate")
  var tsTypePredicate_Original: TSTypePredicateBuilder = js.native
  @JSName("tsTypeQuery")
  var tsTypeQuery_Original: TSTypeQueryBuilder = js.native
  @JSName("tsTypeReference")
  var tsTypeReference_Original: TSTypeReferenceBuilder = js.native
  @JSName("tsUndefinedKeyword")
  var tsUndefinedKeyword_Original: TSUndefinedKeywordBuilder = js.native
  @JSName("tsUnionType")
  var tsUnionType_Original: TSUnionTypeBuilder = js.native
  @JSName("tsUnknownKeyword")
  var tsUnknownKeyword_Original: TSUnknownKeywordBuilder = js.native
  @JSName("tsVoidKeyword")
  var tsVoidKeyword_Original: TSVoidKeywordBuilder = js.native
  @JSName("tupleTypeAnnotation")
  var tupleTypeAnnotation_Original: TupleTypeAnnotationBuilder = js.native
  @JSName("typeAlias")
  var typeAlias_Original: TypeAliasBuilder = js.native
  @JSName("typeAnnotation")
  var typeAnnotation_Original: TypeAnnotationBuilder = js.native
  @JSName("typeCastExpression")
  var typeCastExpression_Original: TypeCastExpressionBuilder = js.native
  @JSName("typeParameterDeclaration")
  var typeParameterDeclaration_Original: TypeParameterDeclarationBuilder = js.native
  @JSName("typeParameterInstantiation")
  var typeParameterInstantiation_Original: TypeParameterInstantiationBuilder = js.native
  @JSName("typeParameter")
  var typeParameter_Original: TypeParameterBuilder = js.native
  @JSName("typeofTypeAnnotation")
  var typeofTypeAnnotation_Original: TypeofTypeAnnotationBuilder = js.native
  @JSName("unaryExpression")
  var unaryExpression_Original: UnaryExpressionBuilder = js.native
  @JSName("unionTypeAnnotation")
  var unionTypeAnnotation_Original: UnionTypeAnnotationBuilder = js.native
  @JSName("updateExpression")
  var updateExpression_Original: UpdateExpressionBuilder = js.native
  @JSName("variableDeclaration")
  var variableDeclaration_Original: VariableDeclarationBuilder = js.native
  @JSName("variableDeclarator")
  var variableDeclarator_Original: VariableDeclaratorBuilder = js.native
  @JSName("variance")
  var variance_Original: VarianceBuilder = js.native
  @JSName("voidTypeAnnotation")
  var voidTypeAnnotation_Original: VoidTypeAnnotationBuilder = js.native
  @JSName("whileStatement")
  var whileStatement_Original: WhileStatementBuilder = js.native
  @JSName("withStatement")
  var withStatement_Original: WithStatementBuilder = js.native
  @JSName("yieldExpression")
  var yieldExpression_Original: YieldExpressionBuilder = js.native
  def anyTypeAnnotation(): AnyTypeAnnotation = js.native
  def arrayExpression(elements: js.Array[ExpressionKind | SpreadElementKind | RestElementKind | Null]): ArrayExpression = js.native
  def arrayPattern(elements: js.Array[PatternKind | SpreadElementKind | Null]): ArrayPattern = js.native
  def arrayTypeAnnotation(elementType: FlowTypeKind): ArrayTypeAnnotation = js.native
  def arrowFunctionExpression(params: js.Array[PatternKind], body: BlockStatementKind): ArrowFunctionExpression = js.native
  def arrowFunctionExpression(params: js.Array[PatternKind], body: BlockStatementKind, expression: Boolean): ArrowFunctionExpression = js.native
  def arrowFunctionExpression(params: js.Array[PatternKind], body: ExpressionKind): ArrowFunctionExpression = js.native
  def arrowFunctionExpression(params: js.Array[PatternKind], body: ExpressionKind, expression: Boolean): ArrowFunctionExpression = js.native
  def assignmentExpression(
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign,
    left: MemberExpressionKind,
    right: ExpressionKind
  ): AssignmentExpression = js.native
  def assignmentExpression(
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign,
    left: PatternKind,
    right: ExpressionKind
  ): AssignmentExpression = js.native
  def assignmentPattern(left: PatternKind, right: ExpressionKind): AssignmentPattern = js.native
  def awaitExpression(): AwaitExpression = js.native
  def awaitExpression(argument: Null, all: Boolean): AwaitExpression = js.native
  def awaitExpression(argument: ExpressionKind): AwaitExpression = js.native
  def awaitExpression(argument: ExpressionKind, all: Boolean): AwaitExpression = js.native
  def bigIntLiteral(value: String): BigIntLiteral = js.native
  def bigIntLiteral(value: Double): BigIntLiteral = js.native
  def binaryExpression(
    operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | AsteriskAsterisk | Ampersand | Verticalline | ^  | in | instanceof,
    left: ExpressionKind,
    right: ExpressionKind
  ): BinaryExpression = js.native
  def bindExpression(`object`: Null, callee: ExpressionKind): BindExpression = js.native
  def bindExpression(`object`: ExpressionKind, callee: ExpressionKind): BindExpression = js.native
  def block(value: String): Block = js.native
  def block(value: String, leading: Boolean): Block = js.native
  def block(value: String, leading: Boolean, trailing: Boolean): Block = js.native
  def blockStatement(body: js.Array[StatementKind]): BlockStatement = js.native
  def booleanLiteral(value: Boolean): BooleanLiteral = js.native
  def booleanLiteralTypeAnnotation(value: Boolean, raw: String): BooleanLiteralTypeAnnotation = js.native
  def booleanTypeAnnotation(): BooleanTypeAnnotation = js.native
  def breakStatement(): BreakStatement = js.native
  def breakStatement(label: IdentifierKind): BreakStatement = js.native
  def callExpression(callee: ExpressionKind, argumentsParam: js.Array[ExpressionKind | SpreadElementKind]): CallExpression = js.native
  def catchClause(param: js.UndefOr[scala.Nothing], guard: js.UndefOr[scala.Nothing], body: BlockStatementKind): CatchClause = js.native
  def catchClause(param: js.UndefOr[scala.Nothing], guard: Null, body: BlockStatementKind): CatchClause = js.native
  def catchClause(param: js.UndefOr[scala.Nothing], guard: ExpressionKind, body: BlockStatementKind): CatchClause = js.native
  def catchClause(param: Null, guard: js.UndefOr[scala.Nothing], body: BlockStatementKind): CatchClause = js.native
  def catchClause(param: Null, guard: Null, body: BlockStatementKind): CatchClause = js.native
  def catchClause(param: Null, guard: ExpressionKind, body: BlockStatementKind): CatchClause = js.native
  def catchClause(param: PatternKind, guard: js.UndefOr[scala.Nothing], body: BlockStatementKind): CatchClause = js.native
  def catchClause(param: PatternKind, guard: Null, body: BlockStatementKind): CatchClause = js.native
  def catchClause(param: PatternKind, guard: ExpressionKind, body: BlockStatementKind): CatchClause = js.native
  def classBody(
    body: js.Array[
      MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind | ClassPrivatePropertyKind | ClassMethodKind | ClassPrivateMethodKind | TSDeclareMethodKind | TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ]
  ): ClassBody = js.native
  def classDeclaration(id: Null, body: ClassBodyKind): ClassDeclaration = js.native
  def classDeclaration(id: Null, body: ClassBodyKind, superClass: ExpressionKind): ClassDeclaration = js.native
  def classDeclaration(id: IdentifierKind, body: ClassBodyKind): ClassDeclaration = js.native
  def classDeclaration(id: IdentifierKind, body: ClassBodyKind, superClass: ExpressionKind): ClassDeclaration = js.native
  def classExpression(id: js.UndefOr[scala.Nothing], body: ClassBodyKind): ClassExpression = js.native
  def classExpression(id: js.UndefOr[scala.Nothing], body: ClassBodyKind, superClass: ExpressionKind): ClassExpression = js.native
  def classExpression(id: Null, body: ClassBodyKind): ClassExpression = js.native
  def classExpression(id: Null, body: ClassBodyKind, superClass: ExpressionKind): ClassExpression = js.native
  def classExpression(id: IdentifierKind, body: ClassBodyKind): ClassExpression = js.native
  def classExpression(id: IdentifierKind, body: ClassBodyKind, superClass: ExpressionKind): ClassExpression = js.native
  def classImplements(id: IdentifierKind): ClassImplements = js.native
  def classMethod(
    kind: js.UndefOr[get | set | method | constructor],
    key: LiteralKind | IdentifierKind | ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind
  ): ClassMethod = js.native
  def classMethod(
    kind: js.UndefOr[get | set | method | constructor],
    key: LiteralKind | IdentifierKind | ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ClassMethod = js.native
  def classMethod(
    kind: js.UndefOr[get | set | method | constructor],
    key: LiteralKind | IdentifierKind | ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean,
    staticParam: Boolean
  ): ClassMethod = js.native
  def classPrivateMethod(key: PrivateNameKind, params: js.Array[PatternKind], body: BlockStatementKind): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_constructor(key: PrivateNameKind, params: js.Array[PatternKind], body: BlockStatementKind, kind: constructor): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_constructor(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: constructor,
    computed: Boolean
  ): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_constructor(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: constructor,
    computed: Boolean,
    staticParam: Boolean
  ): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_get(key: PrivateNameKind, params: js.Array[PatternKind], body: BlockStatementKind, kind: get): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_get(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: get,
    computed: Boolean
  ): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_get(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: get,
    computed: Boolean,
    staticParam: Boolean
  ): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_method(key: PrivateNameKind, params: js.Array[PatternKind], body: BlockStatementKind, kind: method): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_method(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: method,
    computed: Boolean
  ): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_method(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: method,
    computed: Boolean,
    staticParam: Boolean
  ): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_set(key: PrivateNameKind, params: js.Array[PatternKind], body: BlockStatementKind, kind: set): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_set(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: set,
    computed: Boolean
  ): ClassPrivateMethod = js.native
  @JSName("classPrivateMethod")
  def classPrivateMethod_set(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: set,
    computed: Boolean,
    staticParam: Boolean
  ): ClassPrivateMethod = js.native
  def classPrivateProperty(key: PrivateNameKind): ClassPrivateProperty = js.native
  def classPrivateProperty(key: PrivateNameKind, value: ExpressionKind): ClassPrivateProperty = js.native
  def classProperty(key: ExpressionKind): ClassProperty = js.native
  def classProperty(key: ExpressionKind, value: Null, typeAnnotation: Null, staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: ExpressionKind, value: Null, typeAnnotation: TSTypeAnnotationKind): ClassProperty = js.native
  def classProperty(key: ExpressionKind, value: Null, typeAnnotation: TSTypeAnnotationKind, staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: ExpressionKind, value: Null, typeAnnotation: TypeAnnotationKind): ClassProperty = js.native
  def classProperty(key: ExpressionKind, value: Null, typeAnnotation: TypeAnnotationKind, staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: ExpressionKind, value: ExpressionKind): ClassProperty = js.native
  def classProperty(key: ExpressionKind, value: ExpressionKind, typeAnnotation: Null, staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: ExpressionKind, value: ExpressionKind, typeAnnotation: TSTypeAnnotationKind): ClassProperty = js.native
  def classProperty(
    key: ExpressionKind,
    value: ExpressionKind,
    typeAnnotation: TSTypeAnnotationKind,
    staticParam: Boolean
  ): ClassProperty = js.native
  def classProperty(key: ExpressionKind, value: ExpressionKind, typeAnnotation: TypeAnnotationKind): ClassProperty = js.native
  def classProperty(
    key: ExpressionKind,
    value: ExpressionKind,
    typeAnnotation: TypeAnnotationKind,
    staticParam: Boolean
  ): ClassProperty = js.native
  def classProperty(key: IdentifierKind): ClassProperty = js.native
  def classProperty(key: IdentifierKind, value: Null, typeAnnotation: Null, staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: IdentifierKind, value: Null, typeAnnotation: TSTypeAnnotationKind): ClassProperty = js.native
  def classProperty(key: IdentifierKind, value: Null, typeAnnotation: TSTypeAnnotationKind, staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: IdentifierKind, value: Null, typeAnnotation: TypeAnnotationKind): ClassProperty = js.native
  def classProperty(key: IdentifierKind, value: Null, typeAnnotation: TypeAnnotationKind, staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: IdentifierKind, value: ExpressionKind): ClassProperty = js.native
  def classProperty(key: IdentifierKind, value: ExpressionKind, typeAnnotation: Null, staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: IdentifierKind, value: ExpressionKind, typeAnnotation: TSTypeAnnotationKind): ClassProperty = js.native
  def classProperty(
    key: IdentifierKind,
    value: ExpressionKind,
    typeAnnotation: TSTypeAnnotationKind,
    staticParam: Boolean
  ): ClassProperty = js.native
  def classProperty(key: IdentifierKind, value: ExpressionKind, typeAnnotation: TypeAnnotationKind): ClassProperty = js.native
  def classProperty(
    key: IdentifierKind,
    value: ExpressionKind,
    typeAnnotation: TypeAnnotationKind,
    staticParam: Boolean
  ): ClassProperty = js.native
  def classProperty(key: LiteralKind): ClassProperty = js.native
  def classProperty(key: LiteralKind, value: Null, typeAnnotation: Null, staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: LiteralKind, value: Null, typeAnnotation: TSTypeAnnotationKind): ClassProperty = js.native
  def classProperty(key: LiteralKind, value: Null, typeAnnotation: TSTypeAnnotationKind, staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: LiteralKind, value: Null, typeAnnotation: TypeAnnotationKind): ClassProperty = js.native
  def classProperty(key: LiteralKind, value: Null, typeAnnotation: TypeAnnotationKind, staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: LiteralKind, value: ExpressionKind): ClassProperty = js.native
  def classProperty(key: LiteralKind, value: ExpressionKind, typeAnnotation: Null, staticParam: Boolean): ClassProperty = js.native
  def classProperty(key: LiteralKind, value: ExpressionKind, typeAnnotation: TSTypeAnnotationKind): ClassProperty = js.native
  def classProperty(
    key: LiteralKind,
    value: ExpressionKind,
    typeAnnotation: TSTypeAnnotationKind,
    staticParam: Boolean
  ): ClassProperty = js.native
  def classProperty(key: LiteralKind, value: ExpressionKind, typeAnnotation: TypeAnnotationKind): ClassProperty = js.native
  def classProperty(key: LiteralKind, value: ExpressionKind, typeAnnotation: TypeAnnotationKind, staticParam: Boolean): ClassProperty = js.native
  def classPropertyDefinition(definition: ClassPropertyDefinitionKind): ClassPropertyDefinition = js.native
  def classPropertyDefinition(definition: ClassPropertyKind): ClassPropertyDefinition = js.native
  def classPropertyDefinition(definition: MethodDefinitionKind): ClassPropertyDefinition = js.native
  def classPropertyDefinition(definition: VariableDeclaratorKind): ClassPropertyDefinition = js.native
  def commentBlock(value: String): CommentBlock = js.native
  def commentBlock(value: String, leading: Boolean): CommentBlock = js.native
  def commentBlock(value: String, leading: Boolean, trailing: Boolean): CommentBlock = js.native
  def commentLine(value: String): CommentLine = js.native
  def commentLine(value: String, leading: Boolean): CommentLine = js.native
  def commentLine(value: String, leading: Boolean, trailing: Boolean): CommentLine = js.native
  def comprehensionBlock(left: PatternKind, right: ExpressionKind, each: Boolean): ComprehensionBlock = js.native
  def comprehensionExpression(body: ExpressionKind, blocks: js.Array[ComprehensionBlockKind]): ComprehensionExpression = js.native
  def comprehensionExpression(body: ExpressionKind, blocks: js.Array[ComprehensionBlockKind], filter: ExpressionKind): ComprehensionExpression = js.native
  def conditionalExpression(test: ExpressionKind, consequent: ExpressionKind, alternate: ExpressionKind): ConditionalExpression = js.native
  def continueStatement(): ContinueStatement = js.native
  def continueStatement(label: IdentifierKind): ContinueStatement = js.native
  def debuggerStatement(): DebuggerStatement = js.native
  def declareClass(id: IdentifierKind): DeclareClass = js.native
  def declareExportAllDeclaration(): DeclareExportAllDeclaration = js.native
  def declareExportAllDeclaration(source: LiteralKind): DeclareExportAllDeclaration = js.native
  def declareExportDeclaration(defaultParam: Boolean): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: Null,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: Null,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(defaultParam: Boolean, declaration: DeclareClassKind): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: DeclareClassKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: DeclareClassKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(defaultParam: Boolean, declaration: DeclareFunctionKind): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: DeclareFunctionKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: DeclareFunctionKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(defaultParam: Boolean, declaration: DeclareVariableKind): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: DeclareVariableKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: DeclareVariableKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(defaultParam: Boolean, declaration: FlowTypeKind): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: FlowTypeKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    defaultParam: Boolean,
    declaration: FlowTypeKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): DeclareExportDeclaration = js.native
  def declareFunction(id: IdentifierKind): DeclareFunction = js.native
  def declareInterface(id: IdentifierKind, body: ObjectTypeAnnotationKind, extendsParam: js.Array[InterfaceExtendsKind]): DeclareInterface = js.native
  def declareModule(id: IdentifierKind, body: BlockStatementKind): DeclareModule = js.native
  def declareModule(id: LiteralKind, body: BlockStatementKind): DeclareModule = js.native
  def declareModuleExports(typeAnnotation: TypeAnnotationKind): DeclareModuleExports = js.native
  def declareOpaqueType(id: IdentifierKind): DeclareOpaqueType = js.native
  def declareOpaqueType(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind): DeclareOpaqueType = js.native
  def declareTypeAlias(id: IdentifierKind, typeParameters: Null, right: FlowTypeKind): DeclareTypeAlias = js.native
  def declareTypeAlias(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind, right: FlowTypeKind): DeclareTypeAlias = js.native
  def declareVariable(id: IdentifierKind): DeclareVariable = js.native
  def declaredPredicate(value: ExpressionKind): DeclaredPredicate = js.native
  def decorator(expression: ExpressionKind): Decorator = js.native
  def directive(value: DirectiveLiteralKind): Directive = js.native
  def directiveLiteral(): DirectiveLiteral = js.native
  def directiveLiteral(value: String): DirectiveLiteral = js.native
  def doExpression(body: js.Array[StatementKind]): DoExpression = js.native
  def doWhileStatement(body: StatementKind, test: ExpressionKind): DoWhileStatement = js.native
  def emptyStatement(): EmptyStatement = js.native
  def emptyTypeAnnotation(): EmptyTypeAnnotation = js.native
  def existentialTypeParam(): ExistentialTypeParam = js.native
  def existsTypeAnnotation(): ExistsTypeAnnotation = js.native
  def exportAllDeclaration(exported: Null, source: LiteralKind): ExportAllDeclaration = js.native
  def exportAllDeclaration(exported: IdentifierKind, source: LiteralKind): ExportAllDeclaration = js.native
  def exportBatchSpecifier(): ExportBatchSpecifier = js.native
  def exportDeclaration(defaultParam: Boolean): ExportDeclaration = js.native
  def exportDeclaration(
    defaultParam: Boolean,
    declaration: Null,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): ExportDeclaration = js.native
  def exportDeclaration(
    defaultParam: Boolean,
    declaration: Null,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): ExportDeclaration = js.native
  def exportDeclaration(defaultParam: Boolean, declaration: DeclarationKind): ExportDeclaration = js.native
  def exportDeclaration(
    defaultParam: Boolean,
    declaration: DeclarationKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): ExportDeclaration = js.native
  def exportDeclaration(
    defaultParam: Boolean,
    declaration: DeclarationKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): ExportDeclaration = js.native
  def exportDeclaration(defaultParam: Boolean, declaration: ExpressionKind): ExportDeclaration = js.native
  def exportDeclaration(
    defaultParam: Boolean,
    declaration: ExpressionKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  ): ExportDeclaration = js.native
  def exportDeclaration(
    defaultParam: Boolean,
    declaration: ExpressionKind,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    source: LiteralKind
  ): ExportDeclaration = js.native
  def exportDefaultDeclaration(declaration: DeclarationKind): ExportDefaultDeclaration = js.native
  def exportDefaultDeclaration(declaration: ExpressionKind): ExportDefaultDeclaration = js.native
  def exportDefaultSpecifier(exported: IdentifierKind): ExportDefaultSpecifier = js.native
  def exportNamedDeclaration(): ExportNamedDeclaration = js.native
  def exportNamedDeclaration(declaration: Null, specifiers: js.Array[ExportSpecifierKind]): ExportNamedDeclaration = js.native
  def exportNamedDeclaration(declaration: Null, specifiers: js.Array[ExportSpecifierKind], source: LiteralKind): ExportNamedDeclaration = js.native
  def exportNamedDeclaration(declaration: DeclarationKind): ExportNamedDeclaration = js.native
  def exportNamedDeclaration(declaration: DeclarationKind, specifiers: js.Array[ExportSpecifierKind]): ExportNamedDeclaration = js.native
  def exportNamedDeclaration(declaration: DeclarationKind, specifiers: js.Array[ExportSpecifierKind], source: LiteralKind): ExportNamedDeclaration = js.native
  def exportNamespaceSpecifier(exported: IdentifierKind): ExportNamespaceSpecifier = js.native
  def exportSpecifier(local: js.UndefOr[scala.Nothing], exported: IdentifierKind): ExportSpecifier = js.native
  def exportSpecifier(local: Null, exported: IdentifierKind): ExportSpecifier = js.native
  def exportSpecifier(local: IdentifierKind, exported: IdentifierKind): ExportSpecifier = js.native
  def expressionStatement(expression: ExpressionKind): ExpressionStatement = js.native
  def file(program: ProgramKind): File = js.native
  def file(program: ProgramKind, name: String): File = js.native
  def forAwaitStatement(left: ExpressionKind, right: ExpressionKind, body: StatementKind): ForAwaitStatement = js.native
  def forAwaitStatement(left: VariableDeclarationKind, right: ExpressionKind, body: StatementKind): ForAwaitStatement = js.native
  def forInStatement(left: ExpressionKind, right: ExpressionKind, body: StatementKind): ForInStatement = js.native
  def forInStatement(left: VariableDeclarationKind, right: ExpressionKind, body: StatementKind): ForInStatement = js.native
  def forOfStatement(left: PatternKind, right: ExpressionKind, body: StatementKind): ForOfStatement = js.native
  def forOfStatement(left: VariableDeclarationKind, right: ExpressionKind, body: StatementKind): ForOfStatement = js.native
  def forStatement(init: Null, test: Null, update: Null, body: StatementKind): ForStatement = js.native
  def forStatement(init: Null, test: Null, update: ExpressionKind, body: StatementKind): ForStatement = js.native
  def forStatement(init: Null, test: ExpressionKind, update: Null, body: StatementKind): ForStatement = js.native
  def forStatement(init: Null, test: ExpressionKind, update: ExpressionKind, body: StatementKind): ForStatement = js.native
  def forStatement(init: ExpressionKind, test: Null, update: Null, body: StatementKind): ForStatement = js.native
  def forStatement(init: ExpressionKind, test: Null, update: ExpressionKind, body: StatementKind): ForStatement = js.native
  def forStatement(init: ExpressionKind, test: ExpressionKind, update: Null, body: StatementKind): ForStatement = js.native
  def forStatement(init: ExpressionKind, test: ExpressionKind, update: ExpressionKind, body: StatementKind): ForStatement = js.native
  def forStatement(init: VariableDeclarationKind, test: Null, update: Null, body: StatementKind): ForStatement = js.native
  def forStatement(init: VariableDeclarationKind, test: Null, update: ExpressionKind, body: StatementKind): ForStatement = js.native
  def forStatement(init: VariableDeclarationKind, test: ExpressionKind, update: Null, body: StatementKind): ForStatement = js.native
  def forStatement(init: VariableDeclarationKind, test: ExpressionKind, update: ExpressionKind, body: StatementKind): ForStatement = js.native
  def functionDeclaration(id: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): FunctionDeclaration = js.native
  def functionDeclaration(id: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind, generator: Boolean): FunctionDeclaration = js.native
  def functionDeclaration(
    id: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean,
    expression: Boolean
  ): FunctionDeclaration = js.native
  def functionExpression(id: js.UndefOr[scala.Nothing], params: js.Array[PatternKind], body: BlockStatementKind): FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean
  ): FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[scala.Nothing],
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean,
    expression: Boolean
  ): FunctionExpression = js.native
  def functionExpression(id: Null, params: js.Array[PatternKind], body: BlockStatementKind): FunctionExpression = js.native
  def functionExpression(id: Null, params: js.Array[PatternKind], body: BlockStatementKind, generator: Boolean): FunctionExpression = js.native
  def functionExpression(
    id: Null,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean,
    expression: Boolean
  ): FunctionExpression = js.native
  def functionExpression(id: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): FunctionExpression = js.native
  def functionExpression(id: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind, generator: Boolean): FunctionExpression = js.native
  def functionExpression(
    id: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    generator: Boolean,
    expression: Boolean
  ): FunctionExpression = js.native
  def functionTypeAnnotation(params: js.Array[FunctionTypeParamKind], returnType: FlowTypeKind): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    params: js.Array[FunctionTypeParamKind],
    returnType: FlowTypeKind,
    rest: Null,
    typeParameters: TypeParameterDeclarationKind
  ): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(params: js.Array[FunctionTypeParamKind], returnType: FlowTypeKind, rest: FunctionTypeParamKind): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    params: js.Array[FunctionTypeParamKind],
    returnType: FlowTypeKind,
    rest: FunctionTypeParamKind,
    typeParameters: TypeParameterDeclarationKind
  ): FunctionTypeAnnotation = js.native
  def functionTypeParam(name: IdentifierKind, typeAnnotation: FlowTypeKind, optional: Boolean): FunctionTypeParam = js.native
  def generatorExpression(body: ExpressionKind, blocks: js.Array[ComprehensionBlockKind]): GeneratorExpression = js.native
  def generatorExpression(body: ExpressionKind, blocks: js.Array[ComprehensionBlockKind], filter: ExpressionKind): GeneratorExpression = js.native
  def genericTypeAnnotation(id: IdentifierKind): GenericTypeAnnotation = js.native
  def genericTypeAnnotation(id: IdentifierKind, typeParameters: TypeParameterInstantiationKind): GenericTypeAnnotation = js.native
  def genericTypeAnnotation(id: QualifiedTypeIdentifierKind): GenericTypeAnnotation = js.native
  def genericTypeAnnotation(id: QualifiedTypeIdentifierKind, typeParameters: TypeParameterInstantiationKind): GenericTypeAnnotation = js.native
  def identifier(name: String): Identifier = js.native
  def ifStatement(test: ExpressionKind, consequent: StatementKind): IfStatement = js.native
  def ifStatement(test: ExpressionKind, consequent: StatementKind, alternate: StatementKind): IfStatement = js.native
  def `import`(): Import = js.native
  def importDeclaration(specifiers: js.UndefOr[scala.Nothing], source: LiteralKind): ImportDeclaration = js.native
  def importDeclaration(
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    source: LiteralKind
  ): ImportDeclaration = js.native
  @JSName("importDeclaration")
  def importDeclaration_type(specifiers: js.UndefOr[scala.Nothing], source: LiteralKind, importKind: `type`): ImportDeclaration = js.native
  @JSName("importDeclaration")
  def importDeclaration_type(
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    source: LiteralKind,
    importKind: `type`
  ): ImportDeclaration = js.native
  @JSName("importDeclaration")
  def importDeclaration_value(specifiers: js.UndefOr[scala.Nothing], source: LiteralKind, importKind: value): ImportDeclaration = js.native
  @JSName("importDeclaration")
  def importDeclaration_value(
    specifiers: js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind],
    source: LiteralKind,
    importKind: value
  ): ImportDeclaration = js.native
  def importDefaultSpecifier(): ImportDefaultSpecifier = js.native
  def importDefaultSpecifier(local: IdentifierKind): ImportDefaultSpecifier = js.native
  def importNamespaceSpecifier(): ImportNamespaceSpecifier = js.native
  def importNamespaceSpecifier(local: IdentifierKind): ImportNamespaceSpecifier = js.native
  def importSpecifier(imported: IdentifierKind): ImportSpecifier = js.native
  def importSpecifier(imported: IdentifierKind, local: IdentifierKind): ImportSpecifier = js.native
  def inferredPredicate(): InferredPredicate = js.native
  def interfaceDeclaration(id: IdentifierKind, body: ObjectTypeAnnotationKind, extendsParam: js.Array[InterfaceExtendsKind]): InterfaceDeclaration = js.native
  def interfaceExtends(id: IdentifierKind): InterfaceExtends = js.native
  def interfaceTypeAnnotation(body: ObjectTypeAnnotationKind): InterfaceTypeAnnotation = js.native
  def interfaceTypeAnnotation(body: ObjectTypeAnnotationKind, extendsParam: js.Array[InterfaceExtendsKind]): InterfaceTypeAnnotation = js.native
  def interpreterDirective(value: String): InterpreterDirective = js.native
  def intersectionTypeAnnotation(types: js.Array[FlowTypeKind]): IntersectionTypeAnnotation = js.native
  def jsxAttribute(name: JSXIdentifierKind): JSXAttribute = js.native
  def jsxAttribute(name: JSXIdentifierKind, value: JSXExpressionContainerKind): JSXAttribute = js.native
  def jsxAttribute(name: JSXIdentifierKind, value: LiteralKind): JSXAttribute = js.native
  def jsxAttribute(name: JSXNamespacedNameKind): JSXAttribute = js.native
  def jsxAttribute(name: JSXNamespacedNameKind, value: JSXExpressionContainerKind): JSXAttribute = js.native
  def jsxAttribute(name: JSXNamespacedNameKind, value: LiteralKind): JSXAttribute = js.native
  def jsxClosingElement(name: JSXIdentifierKind): JSXClosingElement = js.native
  def jsxClosingElement(name: JSXMemberExpressionKind): JSXClosingElement = js.native
  def jsxClosingElement(name: JSXNamespacedNameKind): JSXClosingElement = js.native
  def jsxClosingFragment(): JSXClosingFragment = js.native
  def jsxElement(openingElement: JSXOpeningElementKind): JSXElement = js.native
  def jsxElement(
    openingElement: JSXOpeningElementKind,
    closingElement: Null,
    children: js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ]
  ): JSXElement = js.native
  def jsxElement(openingElement: JSXOpeningElementKind, closingElement: JSXClosingElementKind): JSXElement = js.native
  def jsxElement(
    openingElement: JSXOpeningElementKind,
    closingElement: JSXClosingElementKind,
    children: js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ]
  ): JSXElement = js.native
  def jsxEmptyExpression(): JSXEmptyExpression = js.native
  def jsxExpressionContainer(expression: ExpressionKind): JSXExpressionContainer = js.native
  def jsxFragment(openingElement: JSXOpeningFragmentKind, closingElement: JSXClosingFragmentKind): JSXFragment = js.native
  def jsxFragment(
    openingElement: JSXOpeningFragmentKind,
    closingElement: JSXClosingFragmentKind,
    children: js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ]
  ): JSXFragment = js.native
  def jsxIdentifier(name: String): JSXIdentifier = js.native
  def jsxMemberExpression(`object`: JSXIdentifierKind, property: JSXIdentifierKind): JSXMemberExpression = js.native
  def jsxMemberExpression(`object`: JSXMemberExpressionKind, property: JSXIdentifierKind): JSXMemberExpression = js.native
  def jsxNamespacedName(namespace: JSXIdentifierKind, name: JSXIdentifierKind): JSXNamespacedName = js.native
  def jsxOpeningElement(name: JSXIdentifierKind): JSXOpeningElement = js.native
  def jsxOpeningElement(name: JSXIdentifierKind, attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind]): JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: JSXIdentifierKind,
    attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind],
    selfClosing: Boolean
  ): JSXOpeningElement = js.native
  def jsxOpeningElement(name: JSXMemberExpressionKind): JSXOpeningElement = js.native
  def jsxOpeningElement(name: JSXMemberExpressionKind, attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind]): JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: JSXMemberExpressionKind,
    attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind],
    selfClosing: Boolean
  ): JSXOpeningElement = js.native
  def jsxOpeningElement(name: JSXNamespacedNameKind): JSXOpeningElement = js.native
  def jsxOpeningElement(name: JSXNamespacedNameKind, attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind]): JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: JSXNamespacedNameKind,
    attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind],
    selfClosing: Boolean
  ): JSXOpeningElement = js.native
  def jsxOpeningFragment(): JSXOpeningFragment = js.native
  def jsxSpreadAttribute(argument: ExpressionKind): JSXSpreadAttribute = js.native
  def jsxSpreadChild(expression: ExpressionKind): JSXSpreadChild = js.native
  def jsxText(value: String): JSXText = js.native
  def labeledStatement(label: IdentifierKind, body: StatementKind): LabeledStatement = js.native
  def line(value: String): Line = js.native
  def line(value: String, leading: Boolean): Line = js.native
  def line(value: String, leading: Boolean, trailing: Boolean): Line = js.native
  def literal(): Literal = js.native
  def literal(value: String): Literal = js.native
  def literal(value: Boolean): Literal = js.native
  def literal(value: Double): Literal = js.native
  def literal(value: RegExp): Literal = js.native
  def logicalExpression(operator: AmpersandAmpersand, left: ExpressionKind, right: ExpressionKind): LogicalExpression = js.native
  def logicalExpression(operator: QuestionmarkQuestionmark, left: ExpressionKind, right: ExpressionKind): LogicalExpression = js.native
  def logicalExpression(operator: VerticallineVerticalline, left: ExpressionKind, right: ExpressionKind): LogicalExpression = js.native
  def memberExpression(`object`: ExpressionKind, property: ExpressionKind): MemberExpression = js.native
  def memberExpression(`object`: ExpressionKind, property: ExpressionKind, computed: Boolean): MemberExpression = js.native
  def memberExpression(`object`: ExpressionKind, property: IdentifierKind): MemberExpression = js.native
  def memberExpression(`object`: ExpressionKind, property: IdentifierKind, computed: Boolean): MemberExpression = js.native
  def memberTypeAnnotation(`object`: IdentifierKind, property: GenericTypeAnnotationKind): MemberTypeAnnotation = js.native
  def memberTypeAnnotation(`object`: IdentifierKind, property: MemberTypeAnnotationKind): MemberTypeAnnotation = js.native
  def metaProperty(meta: IdentifierKind, property: IdentifierKind): MetaProperty = js.native
  @JSName("methodDefinition")
  def methodDefinition_constructor(kind: constructor, key: ExpressionKind, value: FunctionKind): MethodDefinition = js.native
  @JSName("methodDefinition")
  def methodDefinition_constructor(kind: constructor, key: ExpressionKind, value: FunctionKind, staticParam: Boolean): MethodDefinition = js.native
  @JSName("methodDefinition")
  def methodDefinition_get(kind: get, key: ExpressionKind, value: FunctionKind): MethodDefinition = js.native
  @JSName("methodDefinition")
  def methodDefinition_get(kind: get, key: ExpressionKind, value: FunctionKind, staticParam: Boolean): MethodDefinition = js.native
  @JSName("methodDefinition")
  def methodDefinition_method(kind: method, key: ExpressionKind, value: FunctionKind): MethodDefinition = js.native
  @JSName("methodDefinition")
  def methodDefinition_method(kind: method, key: ExpressionKind, value: FunctionKind, staticParam: Boolean): MethodDefinition = js.native
  @JSName("methodDefinition")
  def methodDefinition_set(kind: set, key: ExpressionKind, value: FunctionKind): MethodDefinition = js.native
  @JSName("methodDefinition")
  def methodDefinition_set(kind: set, key: ExpressionKind, value: FunctionKind, staticParam: Boolean): MethodDefinition = js.native
  def mixedTypeAnnotation(): MixedTypeAnnotation = js.native
  def newExpression(callee: ExpressionKind, argumentsParam: js.Array[ExpressionKind | SpreadElementKind]): NewExpression = js.native
  def noop(): Noop = js.native
  def nullLiteral(): NullLiteral = js.native
  def nullLiteralTypeAnnotation(): NullLiteralTypeAnnotation = js.native
  def nullTypeAnnotation(): NullTypeAnnotation = js.native
  def nullableTypeAnnotation(typeAnnotation: FlowTypeKind): NullableTypeAnnotation = js.native
  def numberLiteralTypeAnnotation(value: Double, raw: String): NumberLiteralTypeAnnotation = js.native
  def numberTypeAnnotation(): NumberTypeAnnotation = js.native
  def numericLiteral(value: Double): NumericLiteral = js.native
  def numericLiteralTypeAnnotation(value: Double, raw: String): NumericLiteralTypeAnnotation = js.native
  def objectExpression(
    properties: js.Array[
      PropertyKind | ObjectMethodKind | ObjectPropertyKind | SpreadPropertyKind | SpreadElementKind
    ]
  ): ObjectExpression = js.native
  @JSName("objectMethod")
  def objectMethod_get(kind: get, key: ExpressionKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_get(
    kind: get,
    key: ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_get(kind: get, key: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_get(
    kind: get,
    key: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_get(kind: get, key: LiteralKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_get(
    kind: get,
    key: LiteralKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_method(kind: method, key: ExpressionKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_method(
    kind: method,
    key: ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_method(kind: method, key: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_method(
    kind: method,
    key: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_method(kind: method, key: LiteralKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_method(
    kind: method,
    key: LiteralKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_set(kind: set, key: ExpressionKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_set(
    kind: set,
    key: ExpressionKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_set(kind: set, key: IdentifierKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_set(
    kind: set,
    key: IdentifierKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_set(kind: set, key: LiteralKind, params: js.Array[PatternKind], body: BlockStatementKind): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_set(
    kind: set,
    key: LiteralKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    computed: Boolean
  ): ObjectMethod = js.native
  def objectPattern(
    properties: js.Array[
      PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind
    ]
  ): ObjectPattern = js.native
  def objectProperty(key: ExpressionKind, value: ExpressionKind): ObjectProperty = js.native
  def objectProperty(key: ExpressionKind, value: PatternKind): ObjectProperty = js.native
  def objectProperty(key: IdentifierKind, value: ExpressionKind): ObjectProperty = js.native
  def objectProperty(key: IdentifierKind, value: PatternKind): ObjectProperty = js.native
  def objectProperty(key: LiteralKind, value: ExpressionKind): ObjectProperty = js.native
  def objectProperty(key: LiteralKind, value: PatternKind): ObjectProperty = js.native
  def objectTypeAnnotation(properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind]): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind],
    indexers: js.Array[ObjectTypeIndexerKind]
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind],
    indexers: js.Array[ObjectTypeIndexerKind],
    callProperties: js.Array[ObjectTypeCallPropertyKind]
  ): ObjectTypeAnnotation = js.native
  def objectTypeCallProperty(value: FunctionTypeAnnotationKind): ObjectTypeCallProperty = js.native
  def objectTypeIndexer(id: IdentifierKind, key: FlowTypeKind, value: FlowTypeKind): ObjectTypeIndexer = js.native
  def objectTypeInternalSlot(id: IdentifierKind, value: FlowTypeKind, optional: Boolean, staticParam: Boolean, method: Boolean): ObjectTypeInternalSlot = js.native
  def objectTypeProperty(key: IdentifierKind, value: FlowTypeKind, optional: Boolean): ObjectTypeProperty = js.native
  def objectTypeProperty(key: LiteralKind, value: FlowTypeKind, optional: Boolean): ObjectTypeProperty = js.native
  def objectTypeSpreadProperty(argument: FlowTypeKind): ObjectTypeSpreadProperty = js.native
  def opaqueType(id: IdentifierKind, typeParameters: Null, impltype: FlowTypeKind, supertype: FlowTypeKind): OpaqueType = js.native
  def opaqueType(
    id: IdentifierKind,
    typeParameters: TypeParameterDeclarationKind,
    impltype: FlowTypeKind,
    supertype: FlowTypeKind
  ): OpaqueType = js.native
  def optionalCallExpression(callee: ExpressionKind, argumentsParam: js.Array[ExpressionKind | SpreadElementKind]): OptionalCallExpression = js.native
  def optionalCallExpression(
    callee: ExpressionKind,
    argumentsParam: js.Array[ExpressionKind | SpreadElementKind],
    optional: Boolean
  ): OptionalCallExpression = js.native
  def optionalMemberExpression(`object`: ExpressionKind, property: ExpressionKind): OptionalMemberExpression = js.native
  def optionalMemberExpression(`object`: ExpressionKind, property: ExpressionKind, computed: Boolean): OptionalMemberExpression = js.native
  def optionalMemberExpression(`object`: ExpressionKind, property: ExpressionKind, computed: Boolean, optional: Boolean): OptionalMemberExpression = js.native
  def optionalMemberExpression(`object`: ExpressionKind, property: IdentifierKind): OptionalMemberExpression = js.native
  def optionalMemberExpression(`object`: ExpressionKind, property: IdentifierKind, computed: Boolean): OptionalMemberExpression = js.native
  def optionalMemberExpression(`object`: ExpressionKind, property: IdentifierKind, computed: Boolean, optional: Boolean): OptionalMemberExpression = js.native
  def parenthesizedExpression(expression: ExpressionKind): ParenthesizedExpression = js.native
  def privateName(id: IdentifierKind): PrivateName = js.native
  def program(body: js.Array[StatementKind]): Program = js.native
  def propertyPattern(key: ExpressionKind, pattern: PatternKind): PropertyPattern = js.native
  def propertyPattern(key: IdentifierKind, pattern: PatternKind): PropertyPattern = js.native
  def propertyPattern(key: LiteralKind, pattern: PatternKind): PropertyPattern = js.native
  @JSName("property")
  def property_get(kind: get, key: ExpressionKind, value: ExpressionKind): Property = js.native
  @JSName("property")
  def property_get(kind: get, key: ExpressionKind, value: PatternKind): Property = js.native
  @JSName("property")
  def property_get(kind: get, key: IdentifierKind, value: ExpressionKind): Property = js.native
  @JSName("property")
  def property_get(kind: get, key: IdentifierKind, value: PatternKind): Property = js.native
  @JSName("property")
  def property_get(kind: get, key: LiteralKind, value: ExpressionKind): Property = js.native
  @JSName("property")
  def property_get(kind: get, key: LiteralKind, value: PatternKind): Property = js.native
  @JSName("property")
  def property_init(kind: init, key: ExpressionKind, value: ExpressionKind): Property = js.native
  @JSName("property")
  def property_init(kind: init, key: ExpressionKind, value: PatternKind): Property = js.native
  @JSName("property")
  def property_init(kind: init, key: IdentifierKind, value: ExpressionKind): Property = js.native
  @JSName("property")
  def property_init(kind: init, key: IdentifierKind, value: PatternKind): Property = js.native
  @JSName("property")
  def property_init(kind: init, key: LiteralKind, value: ExpressionKind): Property = js.native
  @JSName("property")
  def property_init(kind: init, key: LiteralKind, value: PatternKind): Property = js.native
  @JSName("property")
  def property_set(kind: set, key: ExpressionKind, value: ExpressionKind): Property = js.native
  @JSName("property")
  def property_set(kind: set, key: ExpressionKind, value: PatternKind): Property = js.native
  @JSName("property")
  def property_set(kind: set, key: IdentifierKind, value: ExpressionKind): Property = js.native
  @JSName("property")
  def property_set(kind: set, key: IdentifierKind, value: PatternKind): Property = js.native
  @JSName("property")
  def property_set(kind: set, key: LiteralKind, value: ExpressionKind): Property = js.native
  @JSName("property")
  def property_set(kind: set, key: LiteralKind, value: PatternKind): Property = js.native
  def qualifiedTypeIdentifier(qualification: IdentifierKind, id: IdentifierKind): QualifiedTypeIdentifier = js.native
  def qualifiedTypeIdentifier(qualification: QualifiedTypeIdentifierKind, id: IdentifierKind): QualifiedTypeIdentifier = js.native
  def regExpLiteral(pattern: String, flags: String): RegExpLiteral = js.native
  def restElement(argument: PatternKind): RestElement = js.native
  def restProperty(argument: ExpressionKind): RestProperty = js.native
  def returnStatement(): ReturnStatement = js.native
  def returnStatement(argument: ExpressionKind): ReturnStatement = js.native
  def sequenceExpression(expressions: js.Array[ExpressionKind]): SequenceExpression = js.native
  def spreadElement(argument: ExpressionKind): SpreadElement = js.native
  def spreadElementPattern(argument: PatternKind): SpreadElementPattern = js.native
  def spreadProperty(argument: ExpressionKind): SpreadProperty = js.native
  def spreadPropertyPattern(argument: PatternKind): SpreadPropertyPattern = js.native
  def stringLiteral(value: String): StringLiteral = js.native
  def stringLiteralTypeAnnotation(value: String, raw: String): StringLiteralTypeAnnotation = js.native
  def stringTypeAnnotation(): StringTypeAnnotation = js.native
  def `super`(): Super = js.native
  def switchCase(test: Null, consequent: js.Array[StatementKind]): SwitchCase = js.native
  def switchCase(test: ExpressionKind, consequent: js.Array[StatementKind]): SwitchCase = js.native
  def switchStatement(discriminant: ExpressionKind, cases: js.Array[SwitchCaseKind]): SwitchStatement = js.native
  def switchStatement(discriminant: ExpressionKind, cases: js.Array[SwitchCaseKind], lexical: Boolean): SwitchStatement = js.native
  def taggedTemplateExpression(tag: ExpressionKind, quasi: TemplateLiteralKind): TaggedTemplateExpression = js.native
  def templateElement(value: AnonCooked, tail: Boolean): TemplateElement = js.native
  def templateLiteral(quasis: js.Array[TemplateElementKind], expressions: js.Array[ExpressionKind]): TemplateLiteral = js.native
  def thisExpression(): ThisExpression = js.native
  def thisTypeAnnotation(): ThisTypeAnnotation = js.native
  def throwStatement(argument: ExpressionKind): ThrowStatement = js.native
  def tryStatement(block: BlockStatementKind): TryStatement = js.native
  def tryStatement(block: BlockStatementKind, handler: Null, finalizer: BlockStatementKind): TryStatement = js.native
  def tryStatement(block: BlockStatementKind, handler: CatchClauseKind): TryStatement = js.native
  def tryStatement(block: BlockStatementKind, handler: CatchClauseKind, finalizer: BlockStatementKind): TryStatement = js.native
  def tsAnyKeyword(): TSAnyKeyword = js.native
  def tsArrayType(elementType: TSTypeKind): TSArrayType = js.native
  def tsAsExpression(expression: ExpressionKind, typeAnnotation: TSTypeKind): TSAsExpression = js.native
  def tsBigIntKeyword(): TSBigIntKeyword = js.native
  def tsBooleanKeyword(): TSBooleanKeyword = js.native
  def tsCallSignatureDeclaration(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    typeAnnotation: TSTypeAnnotationKind
  ): TSCallSignatureDeclaration = js.native
  def tsConditionalType(checkType: TSTypeKind, extendsType: TSTypeKind, trueType: TSTypeKind, falseType: TSTypeKind): TSConditionalType = js.native
  def tsConstructSignatureDeclaration(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    typeAnnotation: TSTypeAnnotationKind
  ): TSConstructSignatureDeclaration = js.native
  def tsConstructorType(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): TSConstructorType = js.native
  def tsDeclareFunction(id: js.UndefOr[scala.Nothing], params: js.Array[PatternKind]): TSDeclareFunction = js.native
  def tsDeclareFunction(id: js.UndefOr[scala.Nothing], params: js.Array[PatternKind], returnType: NoopKind): TSDeclareFunction = js.native
  def tsDeclareFunction(id: js.UndefOr[scala.Nothing], params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareFunction = js.native
  def tsDeclareFunction(id: Null, params: js.Array[PatternKind]): TSDeclareFunction = js.native
  def tsDeclareFunction(id: Null, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareFunction = js.native
  def tsDeclareFunction(id: Null, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareFunction = js.native
  def tsDeclareFunction(id: IdentifierKind, params: js.Array[PatternKind]): TSDeclareFunction = js.native
  def tsDeclareFunction(id: IdentifierKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareFunction = js.native
  def tsDeclareFunction(id: IdentifierKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareFunction = js.native
  def tsDeclareMethod(key: ExpressionKind, params: js.Array[PatternKind]): TSDeclareMethod = js.native
  def tsDeclareMethod(key: ExpressionKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareMethod = js.native
  def tsDeclareMethod(key: ExpressionKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareMethod = js.native
  def tsDeclareMethod(key: IdentifierKind, params: js.Array[PatternKind]): TSDeclareMethod = js.native
  def tsDeclareMethod(key: IdentifierKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareMethod = js.native
  def tsDeclareMethod(key: IdentifierKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareMethod = js.native
  def tsDeclareMethod(key: NumericLiteralKind, params: js.Array[PatternKind]): TSDeclareMethod = js.native
  def tsDeclareMethod(key: NumericLiteralKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareMethod = js.native
  def tsDeclareMethod(key: NumericLiteralKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareMethod = js.native
  def tsDeclareMethod(key: StringLiteralKind, params: js.Array[PatternKind]): TSDeclareMethod = js.native
  def tsDeclareMethod(key: StringLiteralKind, params: js.Array[PatternKind], returnType: NoopKind): TSDeclareMethod = js.native
  def tsDeclareMethod(key: StringLiteralKind, params: js.Array[PatternKind], returnType: TSTypeAnnotationKind): TSDeclareMethod = js.native
  def tsEnumDeclaration(id: IdentifierKind, members: js.Array[TSEnumMemberKind]): TSEnumDeclaration = js.native
  def tsEnumMember(id: IdentifierKind): TSEnumMember = js.native
  def tsEnumMember(id: IdentifierKind, initializer: ExpressionKind): TSEnumMember = js.native
  def tsEnumMember(id: StringLiteralKind): TSEnumMember = js.native
  def tsEnumMember(id: StringLiteralKind, initializer: ExpressionKind): TSEnumMember = js.native
  def tsExportAssignment(expression: ExpressionKind): TSExportAssignment = js.native
  def tsExpressionWithTypeArguments(expression: IdentifierKind): TSExpressionWithTypeArguments = js.native
  def tsExpressionWithTypeArguments(expression: IdentifierKind, typeParameters: TSTypeParameterInstantiationKind): TSExpressionWithTypeArguments = js.native
  def tsExpressionWithTypeArguments(expression: TSQualifiedNameKind): TSExpressionWithTypeArguments = js.native
  def tsExpressionWithTypeArguments(expression: TSQualifiedNameKind, typeParameters: TSTypeParameterInstantiationKind): TSExpressionWithTypeArguments = js.native
  def tsExternalModuleReference(expression: StringLiteralKind): TSExternalModuleReference = js.native
  def tsFunctionType(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): TSFunctionType = js.native
  def tsImportEqualsDeclaration(id: IdentifierKind, moduleReference: IdentifierKind): TSImportEqualsDeclaration = js.native
  def tsImportEqualsDeclaration(id: IdentifierKind, moduleReference: TSExternalModuleReferenceKind): TSImportEqualsDeclaration = js.native
  def tsImportEqualsDeclaration(id: IdentifierKind, moduleReference: TSQualifiedNameKind): TSImportEqualsDeclaration = js.native
  def tsImportType(argument: StringLiteralKind): TSImportType = js.native
  def tsImportType(
    argument: StringLiteralKind,
    qualifier: js.UndefOr[scala.Nothing],
    typeParameters: TSTypeParameterInstantiationKind
  ): TSImportType = js.native
  def tsImportType(argument: StringLiteralKind, qualifier: IdentifierKind): TSImportType = js.native
  def tsImportType(
    argument: StringLiteralKind,
    qualifier: IdentifierKind,
    typeParameters: TSTypeParameterInstantiationKind
  ): TSImportType = js.native
  def tsImportType(argument: StringLiteralKind, qualifier: TSQualifiedNameKind): TSImportType = js.native
  def tsImportType(
    argument: StringLiteralKind,
    qualifier: TSQualifiedNameKind,
    typeParameters: TSTypeParameterInstantiationKind
  ): TSImportType = js.native
  def tsIndexSignature(parameters: js.Array[IdentifierKind]): TSIndexSignature = js.native
  def tsIndexSignature(parameters: js.Array[IdentifierKind], typeAnnotation: TSTypeAnnotationKind): TSIndexSignature = js.native
  def tsIndexedAccessType(objectType: TSTypeKind, indexType: TSTypeKind): TSIndexedAccessType = js.native
  def tsInferType(typeParameter: TSTypeParameterKind): TSInferType = js.native
  def tsInterfaceBody(
    body: js.Array[
      TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ]
  ): TSInterfaceBody = js.native
  def tsInterfaceDeclaration(id: IdentifierKind, body: TSInterfaceBodyKind): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(id: TSQualifiedNameKind, body: TSInterfaceBodyKind): TSInterfaceDeclaration = js.native
  def tsIntersectionType(types: js.Array[TSTypeKind]): TSIntersectionType = js.native
  def tsLiteralType(literal: BooleanLiteralKind): TSLiteralType = js.native
  def tsLiteralType(literal: NumericLiteralKind): TSLiteralType = js.native
  def tsLiteralType(literal: StringLiteralKind): TSLiteralType = js.native
  def tsLiteralType(literal: TemplateLiteralKind): TSLiteralType = js.native
  def tsLiteralType(literal: UnaryExpressionKind): TSLiteralType = js.native
  def tsMappedType(typeParameter: TSTypeParameterKind): TSMappedType = js.native
  def tsMappedType(typeParameter: TSTypeParameterKind, typeAnnotation: TSTypeKind): TSMappedType = js.native
  def tsMethodSignature(
    key: ExpressionKind,
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]
  ): TSMethodSignature = js.native
  def tsMethodSignature(
    key: ExpressionKind,
    parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind],
    typeAnnotation: TSTypeAnnotationKind
  ): TSMethodSignature = js.native
  def tsModuleBlock(body: js.Array[StatementKind]): TSModuleBlock = js.native
  def tsModuleDeclaration(id: IdentifierKind): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: IdentifierKind, body: TSModuleBlockKind): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: IdentifierKind, body: TSModuleDeclarationKind): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: StringLiteralKind): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: StringLiteralKind, body: TSModuleBlockKind): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: StringLiteralKind, body: TSModuleDeclarationKind): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: TSQualifiedNameKind): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: TSQualifiedNameKind, body: TSModuleBlockKind): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: TSQualifiedNameKind, body: TSModuleDeclarationKind): TSModuleDeclaration = js.native
  def tsNamespaceExportDeclaration(id: IdentifierKind): TSNamespaceExportDeclaration = js.native
  def tsNeverKeyword(): TSNeverKeyword = js.native
  def tsNonNullExpression(expression: ExpressionKind): TSNonNullExpression = js.native
  def tsNullKeyword(): TSNullKeyword = js.native
  def tsNumberKeyword(): TSNumberKeyword = js.native
  def tsObjectKeyword(): TSObjectKeyword = js.native
  def tsOptionalType(typeAnnotation: TSTypeKind): TSOptionalType = js.native
  def tsParameterProperty(parameter: AssignmentPatternKind): TSParameterProperty = js.native
  def tsParameterProperty(parameter: IdentifierKind): TSParameterProperty = js.native
  def tsParenthesizedType(typeAnnotation: TSTypeKind): TSParenthesizedType = js.native
  def tsPropertySignature(key: ExpressionKind): TSPropertySignature = js.native
  def tsPropertySignature(key: ExpressionKind, typeAnnotation: Null, optional: Boolean): TSPropertySignature = js.native
  def tsPropertySignature(key: ExpressionKind, typeAnnotation: TSTypeAnnotationKind): TSPropertySignature = js.native
  def tsPropertySignature(key: ExpressionKind, typeAnnotation: TSTypeAnnotationKind, optional: Boolean): TSPropertySignature = js.native
  def tsQualifiedName(left: IdentifierKind, right: IdentifierKind): TSQualifiedName = js.native
  def tsQualifiedName(left: IdentifierKind, right: TSQualifiedNameKind): TSQualifiedName = js.native
  def tsQualifiedName(left: TSQualifiedNameKind, right: IdentifierKind): TSQualifiedName = js.native
  def tsQualifiedName(left: TSQualifiedNameKind, right: TSQualifiedNameKind): TSQualifiedName = js.native
  def tsRestType(typeAnnotation: TSTypeKind): TSRestType = js.native
  def tsStringKeyword(): TSStringKeyword = js.native
  def tsSymbolKeyword(): TSSymbolKeyword = js.native
  def tsThisType(): TSThisType = js.native
  def tsTupleType(elementTypes: js.Array[TSTypeKind]): TSTupleType = js.native
  def tsTypeAliasDeclaration(id: IdentifierKind, typeAnnotation: TSTypeKind): TSTypeAliasDeclaration = js.native
  def tsTypeAnnotation(typeAnnotation: TSTypeAnnotationKind): TSTypeAnnotation = js.native
  def tsTypeAnnotation(typeAnnotation: TSTypeKind): TSTypeAnnotation = js.native
  def tsTypeAssertion(typeAnnotation: TSTypeKind, expression: ExpressionKind): TSTypeAssertion = js.native
  def tsTypeLiteral(
    members: js.Array[
      TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ]
  ): TSTypeLiteral = js.native
  def tsTypeOperator(operator: String): TSTypeOperator = js.native
  def tsTypeParameter(name: String): TSTypeParameter = js.native
  def tsTypeParameter(name: String, constraint: js.UndefOr[scala.Nothing], defaultParam: TSTypeKind): TSTypeParameter = js.native
  def tsTypeParameter(name: String, constraint: TSTypeKind): TSTypeParameter = js.native
  def tsTypeParameter(name: String, constraint: TSTypeKind, defaultParam: TSTypeKind): TSTypeParameter = js.native
  def tsTypeParameterDeclaration(params: js.Array[TSTypeParameterKind]): TSTypeParameterDeclaration = js.native
  def tsTypeParameterInstantiation(params: js.Array[TSTypeKind]): TSTypeParameterInstantiation = js.native
  def tsTypePredicate(parameterName: IdentifierKind, typeAnnotation: TSTypeAnnotationKind): TSTypePredicate = js.native
  def tsTypePredicate(parameterName: TSThisTypeKind, typeAnnotation: TSTypeAnnotationKind): TSTypePredicate = js.native
  def tsTypeQuery(exprName: IdentifierKind): TSTypeQuery = js.native
  def tsTypeQuery(exprName: TSImportTypeKind): TSTypeQuery = js.native
  def tsTypeQuery(exprName: TSQualifiedNameKind): TSTypeQuery = js.native
  def tsTypeReference(typeName: IdentifierKind): TSTypeReference = js.native
  def tsTypeReference(typeName: IdentifierKind, typeParameters: TSTypeParameterInstantiationKind): TSTypeReference = js.native
  def tsTypeReference(typeName: TSQualifiedNameKind): TSTypeReference = js.native
  def tsTypeReference(typeName: TSQualifiedNameKind, typeParameters: TSTypeParameterInstantiationKind): TSTypeReference = js.native
  def tsUndefinedKeyword(): TSUndefinedKeyword = js.native
  def tsUnionType(types: js.Array[TSTypeKind]): TSUnionType = js.native
  def tsUnknownKeyword(): TSUnknownKeyword = js.native
  def tsVoidKeyword(): TSVoidKeyword = js.native
  def tupleTypeAnnotation(types: js.Array[FlowTypeKind]): TupleTypeAnnotation = js.native
  def typeAlias(id: IdentifierKind, typeParameters: Null, right: FlowTypeKind): TypeAlias = js.native
  def typeAlias(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind, right: FlowTypeKind): TypeAlias = js.native
  def typeAnnotation(typeAnnotation: FlowTypeKind): TypeAnnotation = js.native
  def typeCastExpression(expression: ExpressionKind, typeAnnotation: TypeAnnotationKind): TypeCastExpression = js.native
  def typeParameter(name: String): TypeParameter = js.native
  def typeParameter(name: String, variance: Null, bound: TypeAnnotationKind): TypeParameter = js.native
  def typeParameter(name: String, variance: VarianceKind): TypeParameter = js.native
  def typeParameter(name: String, variance: VarianceKind, bound: TypeAnnotationKind): TypeParameter = js.native
  def typeParameterDeclaration(params: js.Array[TypeParameterKind]): TypeParameterDeclaration = js.native
  def typeParameterInstantiation(params: js.Array[FlowTypeKind]): TypeParameterInstantiation = js.native
  @JSName("typeParameter")
  def typeParameter_minus(name: String, variance: minus): TypeParameter = js.native
  @JSName("typeParameter")
  def typeParameter_minus(name: String, variance: minus, bound: TypeAnnotationKind): TypeParameter = js.native
  @JSName("typeParameter")
  def typeParameter_plus(name: String, variance: plus): TypeParameter = js.native
  @JSName("typeParameter")
  def typeParameter_plus(name: String, variance: plus, bound: TypeAnnotationKind): TypeParameter = js.native
  def typeofTypeAnnotation(argument: FlowTypeKind): TypeofTypeAnnotation = js.native
  def unaryExpression(operator: Exclamationmark, argument: ExpressionKind): UnaryExpression = js.native
  def unaryExpression(operator: Exclamationmark, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def unaryExpression(operator: Plussign, argument: ExpressionKind): UnaryExpression = js.native
  def unaryExpression(operator: Plussign, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def unaryExpression(operator: Tilde, argument: ExpressionKind): UnaryExpression = js.native
  def unaryExpression(operator: Tilde, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def unaryExpression(operator: `-_`, argument: ExpressionKind): UnaryExpression = js.native
  def unaryExpression(operator: `-_`, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_delete(operator: delete, argument: ExpressionKind): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_delete(operator: delete, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_typeof(operator: typeof, argument: ExpressionKind): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_typeof(operator: typeof, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_void(operator: void, argument: ExpressionKind): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_void(operator: void, argument: ExpressionKind, prefix: Boolean): UnaryExpression = js.native
  def unionTypeAnnotation(types: js.Array[FlowTypeKind]): UnionTypeAnnotation = js.native
  def updateExpression(operator: PlussignPlussign, argument: ExpressionKind, prefix: Boolean): UpdateExpression = js.native
  def updateExpression(operator: `--`, argument: ExpressionKind, prefix: Boolean): UpdateExpression = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_const(kind: const, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_let(kind: let, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_var(kind: `var`, declarations: js.Array[VariableDeclaratorKind | IdentifierKind]): VariableDeclaration = js.native
  def variableDeclarator(id: PatternKind): VariableDeclarator = js.native
  def variableDeclarator(id: PatternKind, init: ExpressionKind): VariableDeclarator = js.native
  @JSName("variance")
  def variance_minus(kind: minus): Variance = js.native
  @JSName("variance")
  def variance_plus(kind: plus): Variance = js.native
  def voidTypeAnnotation(): VoidTypeAnnotation = js.native
  def whileStatement(test: ExpressionKind, body: StatementKind): WhileStatement = js.native
  def withStatement(`object`: ExpressionKind, body: StatementKind): WithStatement = js.native
  def yieldExpression(): YieldExpression = js.native
  def yieldExpression(argument: Null, delegate: Boolean): YieldExpression = js.native
  def yieldExpression(argument: ExpressionKind): YieldExpression = js.native
  def yieldExpression(argument: ExpressionKind, delegate: Boolean): YieldExpression = js.native
}

