package typings
package astDashTypesLib.genNamedTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ast-types/gen/namedTypes", "namedTypes")
@js.native
object namedTypesNs extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - File
    - Program
    - Identifier
    - BlockStatement
    - EmptyStatement
    - ExpressionStatement
    - IfStatement
    - LabeledStatement
    - BreakStatement
    - ContinueStatement
    - WithStatement
    - SwitchStatement
    - SwitchCase
    - ReturnStatement
    - ThrowStatement
    - TryStatement
    - CatchClause
    - WhileStatement
    - DoWhileStatement
    - ForStatement
    - VariableDeclaration
    - ForInStatement
    - DebuggerStatement
    - FunctionDeclaration
    - FunctionExpression
    - VariableDeclarator
    - ThisExpression
    - ArrayExpression
    - ObjectExpression
    - Property
    - Literal
    - SequenceExpression
    - UnaryExpression
    - BinaryExpression
    - AssignmentExpression
    - MemberExpression
    - UpdateExpression
    - LogicalExpression
    - ConditionalExpression
    - NewExpression
    - CallExpression
    - RestElement
    - TypeAnnotation
    - TSTypeAnnotation
    - SpreadElementPattern
    - ArrowFunctionExpression
    - ForOfStatement
    - YieldExpression
    - GeneratorExpression
    - ComprehensionBlock
    - ComprehensionExpression
    - ObjectProperty
    - PropertyPattern
    - ObjectPattern
    - ArrayPattern
    - MethodDefinition
    - SpreadElement
    - AssignmentPattern
    - ClassPropertyDefinition
    - ClassProperty
    - ClassBody
    - ClassDeclaration
    - ClassExpression
    - ImportSpecifier
    - ImportNamespaceSpecifier
    - ImportDefaultSpecifier
    - ImportDeclaration
    - TaggedTemplateExpression
    - TemplateLiteral
    - TemplateElement
    - SpreadProperty
    - SpreadPropertyPattern
    - AwaitExpression
    - JSXAttribute
    - JSXIdentifier
    - JSXNamespacedName
    - JSXExpressionContainer
    - JSXMemberExpression
    - JSXSpreadAttribute
    - JSXElement
    - JSXOpeningElement
    - JSXClosingElement
    - JSXFragment
    - JSXText
    - JSXOpeningFragment
    - JSXClosingFragment
    - JSXEmptyExpression
    - JSXSpreadChild
    - TypeParameterDeclaration
    - TSTypeParameterDeclaration
    - TypeParameterInstantiation
    - TSTypeParameterInstantiation
    - ClassImplements
    - TSExpressionWithTypeArguments
    - AnyTypeAnnotation
    - EmptyTypeAnnotation
    - MixedTypeAnnotation
    - VoidTypeAnnotation
    - NumberTypeAnnotation
    - NumberLiteralTypeAnnotation
    - NumericLiteralTypeAnnotation
    - StringTypeAnnotation
    - StringLiteralTypeAnnotation
    - BooleanTypeAnnotation
    - BooleanLiteralTypeAnnotation
    - NullableTypeAnnotation
    - NullLiteralTypeAnnotation
    - NullTypeAnnotation
    - ThisTypeAnnotation
    - ExistsTypeAnnotation
    - ExistentialTypeParam
    - FunctionTypeAnnotation
    - FunctionTypeParam
    - ArrayTypeAnnotation
    - ObjectTypeAnnotation
    - ObjectTypeProperty
    - ObjectTypeSpreadProperty
    - ObjectTypeIndexer
    - ObjectTypeCallProperty
    - ObjectTypeInternalSlot
    - Variance
    - QualifiedTypeIdentifier
    - GenericTypeAnnotation
    - MemberTypeAnnotation
    - UnionTypeAnnotation
    - IntersectionTypeAnnotation
    - TypeofTypeAnnotation
    - TypeParameter
    - InterfaceTypeAnnotation
    - InterfaceExtends
    - InterfaceDeclaration
    - DeclareInterface
    - TypeAlias
    - OpaqueType
    - DeclareTypeAlias
    - DeclareOpaqueType
    - TypeCastExpression
    - TupleTypeAnnotation
    - DeclareVariable
    - DeclareFunction
    - DeclareClass
    - DeclareModule
    - DeclareModuleExports
    - DeclareExportDeclaration
    - ExportSpecifier
    - ExportBatchSpecifier
    - DeclareExportAllDeclaration
    - InferredPredicate
    - DeclaredPredicate
    - ExportDeclaration
    - Block
    - Line
    - Noop
    - DoExpression
    - Super
    - BindExpression
    - Decorator
    - MetaProperty
    - ParenthesizedExpression
    - ExportDefaultDeclaration
    - ExportNamedDeclaration
    - ExportNamespaceSpecifier
    - ExportDefaultSpecifier
    - ExportAllDeclaration
    - CommentBlock
    - CommentLine
    - Directive
    - DirectiveLiteral
    - InterpreterDirective
    - StringLiteral
    - NumericLiteral
    - BigIntLiteral
    - NullLiteral
    - BooleanLiteral
    - RegExpLiteral
    - ObjectMethod
    - ClassPrivateProperty
    - ClassMethod
    - ClassPrivateMethod
    - PrivateName
    - RestProperty
    - ForAwaitStatement
    - Import
    - TSQualifiedName
    - TSTypeReference
    - TSAsExpression
    - TSNonNullExpression
    - TSAnyKeyword
    - TSBigIntKeyword
    - TSBooleanKeyword
    - TSNeverKeyword
    - TSNullKeyword
    - TSNumberKeyword
    - TSObjectKeyword
    - TSStringKeyword
    - TSSymbolKeyword
    - TSUndefinedKeyword
    - TSUnknownKeyword
    - TSVoidKeyword
    - TSThisType
    - TSArrayType
    - TSLiteralType
    - TSUnionType
    - TSIntersectionType
    - TSConditionalType
    - TSInferType
    - TSTypeParameter
    - TSParenthesizedType
    - TSFunctionType
    - TSConstructorType
    - TSDeclareFunction
    - TSDeclareMethod
    - TSMappedType
    - TSTupleType
    - TSRestType
    - TSOptionalType
    - TSIndexedAccessType
    - TSTypeOperator
    - TSIndexSignature
    - TSPropertySignature
    - TSMethodSignature
    - TSTypePredicate
    - TSCallSignatureDeclaration
    - TSConstructSignatureDeclaration
    - TSEnumMember
    - TSTypeQuery
    - TSImportType
    - TSTypeLiteral
    - TSTypeAssertion
    - TSEnumDeclaration
    - TSTypeAliasDeclaration
    - TSModuleBlock
    - TSModuleDeclaration
    - TSImportEqualsDeclaration
    - TSExternalModuleReference
    - TSExportAssignment
    - TSNamespaceExportDeclaration
    - TSInterfaceBody
    - TSInterfaceDeclaration
    - TSParameterProperty
    - OptionalMemberExpression
    - OptionalCallExpression
  */
  trait ASTNode extends js.Object
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait AnyTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.AnyTypeAnnotation
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait ArrayExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var elements: js.Array[
        astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.SpreadElementKind | astDashTypesLib.genKindsMod.RestElementKind | scala.Null
      ]
    var `type`: astDashTypesLib.astDashTypesLibStrings.ArrayExpression
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Pattern[P]} */ trait ArrayPattern
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PatternKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var elements: js.Array[
        astDashTypesLib.genKindsMod.PatternKind | astDashTypesLib.genKindsMod.SpreadElementKind | scala.Null
      ]
    var `type`: astDashTypesLib.astDashTypesLibStrings.ArrayPattern
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait ArrayTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var elementType: astDashTypesLib.genKindsMod.FlowTypeKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.ArrayTypeAnnotation
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Function, 'type' | 'id' | 'body' | 'generator'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Function[P]}
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait ArrowFunctionExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.FunctionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var body: astDashTypesLib.genKindsMod.BlockStatementKind | astDashTypesLib.genKindsMod.ExpressionKind
    var generator: js.UndefOr[astDashTypesLib.astDashTypesLibNumbers.`false`] = js.undefined
    var id: js.UndefOr[scala.Null] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.ArrowFunctionExpression
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait AssignmentExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var left: astDashTypesLib.genKindsMod.PatternKind | astDashTypesLib.genKindsMod.MemberExpressionKind
    var operator: astDashTypesLib.astDashTypesLibStrings.`=` | astDashTypesLib.astDashTypesLibStrings.`+=` | astDashTypesLib.astDashTypesLibStrings.`-=` | astDashTypesLib.astDashTypesLibStrings.`*=` | astDashTypesLib.astDashTypesLibStrings.`/=` | astDashTypesLib.astDashTypesLibStrings.`%=` | astDashTypesLib.astDashTypesLibStrings.`<<=` | astDashTypesLib.astDashTypesLibStrings.`>>=` | astDashTypesLib.astDashTypesLibStrings.`>>>=` | astDashTypesLib.astDashTypesLibStrings.`|=` | astDashTypesLib.astDashTypesLibStrings.`^=` | astDashTypesLib.astDashTypesLibStrings.`&=`
    var right: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.AssignmentExpression
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Pattern[P]} */ trait AssignmentPattern
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PatternKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var left: astDashTypesLib.genKindsMod.PatternKind
    var right: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.AssignmentPattern
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait AwaitExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var all: js.UndefOr[scala.Boolean] = js.undefined
    var argument: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
    var `type`: astDashTypesLib.astDashTypesLibStrings.AwaitExpression
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Literal, 'type' | 'value'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Literal[P]} */ trait BigIntLiteral
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.LiteralKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var extra: js.UndefOr[astDashTypesLib.Anon_RawRawValue] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.BigIntLiteral
    var value: java.lang.String | scala.Double
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait BinaryExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var left: astDashTypesLib.genKindsMod.ExpressionKind
    var operator: astDashTypesLib.astDashTypesLibStrings.`==` | astDashTypesLib.astDashTypesLibStrings.`!=` | astDashTypesLib.astDashTypesLibStrings.`===` | astDashTypesLib.astDashTypesLibStrings.`!==` | astDashTypesLib.astDashTypesLibStrings.`<` | astDashTypesLib.astDashTypesLibStrings.`<=` | astDashTypesLib.astDashTypesLibStrings.`>` | astDashTypesLib.astDashTypesLibStrings.`>=` | astDashTypesLib.astDashTypesLibStrings.`<<` | astDashTypesLib.astDashTypesLibStrings.`>>` | astDashTypesLib.astDashTypesLibStrings.`>>>` | astDashTypesLib.astDashTypesLibStrings.`+` | astDashTypesLib.astDashTypesLibStrings.`-` | astDashTypesLib.astDashTypesLibStrings.`*` | astDashTypesLib.astDashTypesLibStrings.`/` | astDashTypesLib.astDashTypesLibStrings.`%` | astDashTypesLib.astDashTypesLibStrings.`**` | astDashTypesLib.astDashTypesLibStrings.`&` | astDashTypesLib.astDashTypesLibStrings.`|` | astDashTypesLib.astDashTypesLibStrings.`_backtick^_backtick` | astDashTypesLib.astDashTypesLibStrings.in | astDashTypesLib.astDashTypesLibStrings.instanceof
    var right: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.BinaryExpression
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait BindExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var callee: astDashTypesLib.genKindsMod.ExpressionKind
    var `object`: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
    var `type`: astDashTypesLib.astDashTypesLibStrings.BindExpression
  }
  
  trait Block
    extends Comment
       with ASTNode
       with astDashTypesLib.genKindsMod.CommentKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.Block
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait BlockStatement
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var body: js.Array[astDashTypesLib.genKindsMod.StatementKind]
    var directives: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.DirectiveKind]] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.BlockStatement
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Literal, 'type' | 'value'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Literal[P]} */ trait BooleanLiteral
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.LiteralKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.BooleanLiteral
    var value: scala.Boolean
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait BooleanLiteralTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var raw: java.lang.String
    var `type`: astDashTypesLib.astDashTypesLibStrings.BooleanLiteralTypeAnnotation
    var value: scala.Boolean
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait BooleanTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.BooleanTypeAnnotation
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait BreakStatement
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var label: js.UndefOr[astDashTypesLib.genKindsMod.IdentifierKind | scala.Null] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.BreakStatement
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait CallExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.CallExpressionKind
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var arguments: js.Array[
        astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.SpreadElementKind
      ]
    var callee: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.CallExpression
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait CatchClause
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var body: astDashTypesLib.genKindsMod.BlockStatementKind
    var guard: js.UndefOr[astDashTypesLib.genKindsMod.ExpressionKind | scala.Null] = js.undefined
    var param: js.UndefOr[astDashTypesLib.genKindsMod.PatternKind | scala.Null] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.CatchClause
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait ClassBody
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var body: js.Array[
        astDashTypesLib.genKindsMod.MethodDefinitionKind | astDashTypesLib.genKindsMod.VariableDeclaratorKind | astDashTypesLib.genKindsMod.ClassPropertyDefinitionKind | astDashTypesLib.genKindsMod.ClassPropertyKind | astDashTypesLib.genKindsMod.ClassPrivatePropertyKind | astDashTypesLib.genKindsMod.ClassMethodKind | astDashTypesLib.genKindsMod.ClassPrivateMethodKind | astDashTypesLib.genKindsMod.TSDeclareMethodKind | astDashTypesLib.genKindsMod.TSCallSignatureDeclarationKind | astDashTypesLib.genKindsMod.TSConstructSignatureDeclarationKind | astDashTypesLib.genKindsMod.TSIndexSignatureKind | astDashTypesLib.genKindsMod.TSMethodSignatureKind | astDashTypesLib.genKindsMod.TSPropertySignatureKind
      ]
    var `type`: astDashTypesLib.astDashTypesLibStrings.ClassBody
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait ClassDeclaration
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var body: astDashTypesLib.genKindsMod.ClassBodyKind
    var id: astDashTypesLib.genKindsMod.IdentifierKind | scala.Null
    var implements: js.UndefOr[
        js.Array[
          astDashTypesLib.genKindsMod.ClassImplementsKind | astDashTypesLib.genKindsMod.TSExpressionWithTypeArgumentsKind
        ]
      ] = js.undefined
    var superClass: js.UndefOr[astDashTypesLib.genKindsMod.ExpressionKind | scala.Null] = js.undefined
    var superTypeParameters: js.UndefOr[
        astDashTypesLib.genKindsMod.TypeParameterInstantiationKind | astDashTypesLib.genKindsMod.TSTypeParameterInstantiationKind | scala.Null
      ] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.ClassDeclaration
    var typeParameters: js.UndefOr[
        astDashTypesLib.genKindsMod.TypeParameterDeclarationKind | astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind | scala.Null
      ] = js.undefined
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait ClassExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var body: astDashTypesLib.genKindsMod.ClassBodyKind
    var id: js.UndefOr[astDashTypesLib.genKindsMod.IdentifierKind | scala.Null] = js.undefined
    var implements: js.UndefOr[
        js.Array[
          astDashTypesLib.genKindsMod.ClassImplementsKind | astDashTypesLib.genKindsMod.TSExpressionWithTypeArgumentsKind
        ]
      ] = js.undefined
    var superClass: js.UndefOr[astDashTypesLib.genKindsMod.ExpressionKind | scala.Null] = js.undefined
    var superTypeParameters: js.UndefOr[
        astDashTypesLib.genKindsMod.TypeParameterInstantiationKind | astDashTypesLib.genKindsMod.TSTypeParameterInstantiationKind | scala.Null
      ] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.ClassExpression
    var typeParameters: js.UndefOr[
        astDashTypesLib.genKindsMod.TypeParameterDeclarationKind | astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind | scala.Null
      ] = js.undefined
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait ClassImplements
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var id: astDashTypesLib.genKindsMod.IdentifierKind
    var superClass: js.UndefOr[astDashTypesLib.genKindsMod.ExpressionKind | scala.Null] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.ClassImplements
    var typeParameters: js.UndefOr[astDashTypesLib.genKindsMod.TypeParameterInstantiationKind | scala.Null] = js.undefined
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]}
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Function, 'type' | 'body'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Function[P]} */ trait ClassMethod
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.FunctionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var `abstract`: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
    var access: js.UndefOr[
        astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected` | scala.Null
      ] = js.undefined
    var accessibility: js.UndefOr[
        astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected` | scala.Null
      ] = js.undefined
    var body: astDashTypesLib.genKindsMod.BlockStatementKind
    var computed: js.UndefOr[scala.Boolean] = js.undefined
    var decorators: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.DecoratorKind] | scala.Null] = js.undefined
    var key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind
    var kind: js.UndefOr[
        astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set | astDashTypesLib.astDashTypesLibStrings.method | astDashTypesLib.astDashTypesLibStrings.constructor
      ] = js.undefined
    var optional: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
    var static: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.ClassMethod
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]}
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Function, 'type' | 'body'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Function[P]} */ trait ClassPrivateMethod
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.FunctionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var `abstract`: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
    var access: js.UndefOr[
        astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected` | scala.Null
      ] = js.undefined
    var accessibility: js.UndefOr[
        astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected` | scala.Null
      ] = js.undefined
    var body: astDashTypesLib.genKindsMod.BlockStatementKind
    var computed: js.UndefOr[scala.Boolean] = js.undefined
    var decorators: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.DecoratorKind] | scala.Null] = js.undefined
    var key: astDashTypesLib.genKindsMod.PrivateNameKind
    var kind: js.UndefOr[
        astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set | astDashTypesLib.astDashTypesLibStrings.method | astDashTypesLib.astDashTypesLibStrings.constructor
      ] = js.undefined
    var optional: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
    var static: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.ClassPrivateMethod
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.ClassProperty, 'type' | 'key' | 'value'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.ClassProperty[P]} */ trait ClassPrivateProperty
    extends ASTNode
       with astDashTypesLib.genKindsMod.ClassPropertyKind
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var key: astDashTypesLib.genKindsMod.PrivateNameKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.ClassPrivateProperty
    var value: js.UndefOr[astDashTypesLib.genKindsMod.ExpressionKind | scala.Null] = js.undefined
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait ClassProperty
    extends ASTNode
       with astDashTypesLib.genKindsMod.ClassPropertyKind
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var access: js.UndefOr[
        astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected`
      ] = js.undefined
    var computed: js.UndefOr[scala.Boolean] = js.undefined
    var key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind
    var static: js.UndefOr[scala.Boolean] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.ClassProperty
    var typeAnnotation: js.UndefOr[
        astDashTypesLib.genKindsMod.TypeAnnotationKind | astDashTypesLib.genKindsMod.TSTypeAnnotationKind | scala.Null
      ] = js.undefined
    var value: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
    var variance: js.UndefOr[
        astDashTypesLib.genKindsMod.VarianceKind | astDashTypesLib.astDashTypesLibStrings.plus | astDashTypesLib.astDashTypesLibStrings.minus | scala.Null
      ] = js.undefined
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait ClassPropertyDefinition
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var definition: astDashTypesLib.genKindsMod.MethodDefinitionKind | astDashTypesLib.genKindsMod.VariableDeclaratorKind | astDashTypesLib.genKindsMod.ClassPropertyDefinitionKind | astDashTypesLib.genKindsMod.ClassPropertyKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.ClassPropertyDefinition
  }
  
  trait Comment extends Printable {
    var leading: js.UndefOr[scala.Boolean] = js.undefined
    var trailing: js.UndefOr[scala.Boolean] = js.undefined
    var value: java.lang.String
  }
  
  trait CommentBlock
    extends Comment
       with ASTNode
       with astDashTypesLib.genKindsMod.CommentKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.CommentBlock
  }
  
  trait CommentLine
    extends Comment
       with ASTNode
       with astDashTypesLib.genKindsMod.CommentKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.CommentLine
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait ComprehensionBlock
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var each: scala.Boolean
    var left: astDashTypesLib.genKindsMod.PatternKind
    var right: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.ComprehensionBlock
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait ComprehensionExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var blocks: js.Array[astDashTypesLib.genKindsMod.ComprehensionBlockKind]
    var body: astDashTypesLib.genKindsMod.ExpressionKind
    var filter: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
    var `type`: astDashTypesLib.astDashTypesLibStrings.ComprehensionExpression
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait ConditionalExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var alternate: astDashTypesLib.genKindsMod.ExpressionKind
    var consequent: astDashTypesLib.genKindsMod.ExpressionKind
    var test: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.ConditionalExpression
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait ContinueStatement
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var label: js.UndefOr[astDashTypesLib.genKindsMod.IdentifierKind | scala.Null] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.ContinueStatement
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait DebuggerStatement
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.DebuggerStatement
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.InterfaceDeclaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.InterfaceDeclaration[P]} */ trait DeclareClass
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.InterfaceDeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.DeclareClass
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait DeclareExportAllDeclaration
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var source: js.UndefOr[astDashTypesLib.genKindsMod.LiteralKind | scala.Null] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.DeclareExportAllDeclaration
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait DeclareExportDeclaration
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var declaration: astDashTypesLib.genKindsMod.DeclareVariableKind | astDashTypesLib.genKindsMod.DeclareFunctionKind | astDashTypesLib.genKindsMod.DeclareClassKind | astDashTypesLib.genKindsMod.FlowTypeKind | scala.Null
    var default: scala.Boolean
    var source: js.UndefOr[astDashTypesLib.genKindsMod.LiteralKind | scala.Null] = js.undefined
    var specifiers: js.UndefOr[
        js.Array[
          astDashTypesLib.genKindsMod.ExportSpecifierKind | astDashTypesLib.genKindsMod.ExportBatchSpecifierKind
        ]
      ] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.DeclareExportDeclaration
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait DeclareFunction
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var id: astDashTypesLib.genKindsMod.IdentifierKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.DeclareFunction
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.InterfaceDeclaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.InterfaceDeclaration[P]} */ trait DeclareInterface
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.InterfaceDeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.DeclareInterface
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait DeclareModule
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var body: astDashTypesLib.genKindsMod.BlockStatementKind
    var id: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.LiteralKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.DeclareModule
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait DeclareModuleExports
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.DeclareModuleExports
    var typeAnnotation: astDashTypesLib.genKindsMod.TypeAnnotationKind
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TypeAlias, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TypeAlias[P]} */ trait DeclareOpaqueType
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind
       with astDashTypesLib.genKindsMod.TypeAliasKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.DeclareOpaqueType
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TypeAlias, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TypeAlias[P]} */ trait DeclareTypeAlias
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind
       with astDashTypesLib.genKindsMod.TypeAliasKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.DeclareTypeAlias
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait DeclareVariable
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var id: astDashTypesLib.genKindsMod.IdentifierKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.DeclareVariable
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowPredicate, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowPredicate[P]} */ trait DeclaredPredicate
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowPredicateKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.DeclaredPredicate
    var value: astDashTypesLib.genKindsMod.ExpressionKind
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait Decorator
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var expression: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.Decorator
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait Directive
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.Directive
    var value: astDashTypesLib.genKindsMod.DirectiveLiteralKind
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]}
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait DirectiveLiteral
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.DirectiveLiteral
    var value: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait DoExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var body: js.Array[astDashTypesLib.genKindsMod.StatementKind]
    var `type`: astDashTypesLib.astDashTypesLibStrings.DoExpression
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait DoWhileStatement
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var body: astDashTypesLib.genKindsMod.StatementKind
    var test: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.DoWhileStatement
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait EmptyStatement
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.EmptyStatement
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait EmptyTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.EmptyTypeAnnotation
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait ExistentialTypeParam
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.ExistentialTypeParam
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait ExistsTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.ExistsTypeAnnotation
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait ExportAllDeclaration
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var exported: astDashTypesLib.genKindsMod.IdentifierKind | scala.Null
    var source: astDashTypesLib.genKindsMod.LiteralKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.ExportAllDeclaration
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Specifier, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Specifier[P]} */ trait ExportBatchSpecifier
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.SpecifierKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.ExportBatchSpecifier
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait ExportDeclaration
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var declaration: astDashTypesLib.genKindsMod.DeclarationKind | astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
    var default: scala.Boolean
    var source: js.UndefOr[astDashTypesLib.genKindsMod.LiteralKind | scala.Null] = js.undefined
    var specifiers: js.UndefOr[
        js.Array[
          astDashTypesLib.genKindsMod.ExportSpecifierKind | astDashTypesLib.genKindsMod.ExportBatchSpecifierKind
        ]
      ] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.ExportDeclaration
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait ExportDefaultDeclaration
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var declaration: astDashTypesLib.genKindsMod.DeclarationKind | astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.ExportDefaultDeclaration
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Specifier, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Specifier[P]} */ trait ExportDefaultSpecifier
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.SpecifierKind {
    var exported: astDashTypesLib.genKindsMod.IdentifierKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.ExportDefaultSpecifier
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait ExportNamedDeclaration
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var declaration: astDashTypesLib.genKindsMod.DeclarationKind | scala.Null
    var source: js.UndefOr[astDashTypesLib.genKindsMod.LiteralKind | scala.Null] = js.undefined
    var specifiers: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.ExportSpecifierKind]] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.ExportNamedDeclaration
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Specifier, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Specifier[P]} */ trait ExportNamespaceSpecifier
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.SpecifierKind {
    var exported: astDashTypesLib.genKindsMod.IdentifierKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.ExportNamespaceSpecifier
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.ModuleSpecifier, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.ModuleSpecifier[P]} */ trait ExportSpecifier
    extends ASTNode
       with astDashTypesLib.genKindsMod.ModuleSpecifierKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.SpecifierKind {
    var exported: astDashTypesLib.genKindsMod.IdentifierKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.ExportSpecifier
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait ExpressionStatement
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var expression: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.ExpressionStatement
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait File
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    var program: astDashTypesLib.genKindsMod.ProgramKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.File
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait ForAwaitStatement
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var body: astDashTypesLib.genKindsMod.StatementKind
    var left: astDashTypesLib.genKindsMod.VariableDeclarationKind | astDashTypesLib.genKindsMod.ExpressionKind
    var right: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.ForAwaitStatement
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait ForInStatement
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var body: astDashTypesLib.genKindsMod.StatementKind
    var left: astDashTypesLib.genKindsMod.VariableDeclarationKind | astDashTypesLib.genKindsMod.ExpressionKind
    var right: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.ForInStatement
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait ForOfStatement
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var body: astDashTypesLib.genKindsMod.StatementKind
    var left: astDashTypesLib.genKindsMod.VariableDeclarationKind | astDashTypesLib.genKindsMod.PatternKind
    var right: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.ForOfStatement
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait ForStatement
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var body: astDashTypesLib.genKindsMod.StatementKind
    var init: astDashTypesLib.genKindsMod.VariableDeclarationKind | astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
    var test: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
    var `type`: astDashTypesLib.astDashTypesLibStrings.ForStatement
    var update: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  }
  
  @js.native
  trait Function extends Node {
    var async: js.UndefOr[scala.Boolean] = js.native
    var body: astDashTypesLib.genKindsMod.BlockStatementKind = js.native
    var defaults: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.ExpressionKind | scala.Null]] = js.native
    var expression: js.UndefOr[scala.Boolean] = js.native
    var generator: js.UndefOr[scala.Boolean] = js.native
    var id: js.UndefOr[astDashTypesLib.genKindsMod.IdentifierKind | scala.Null] = js.native
    var params: js.Array[astDashTypesLib.genKindsMod.PatternKind] = js.native
    var rest: js.UndefOr[astDashTypesLib.genKindsMod.IdentifierKind | scala.Null] = js.native
    var returnType: js.UndefOr[
        astDashTypesLib.genKindsMod.TypeAnnotationKind | astDashTypesLib.genKindsMod.TSTypeAnnotationKind | scala.Null
      ] = js.native
    var typeParameters: js.UndefOr[
        astDashTypesLib.genKindsMod.TypeParameterDeclarationKind | astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind | scala.Null
      ] = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Function, 'type' | 'id'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Function[P]}
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait FunctionDeclaration
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.FunctionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var id: astDashTypesLib.genKindsMod.IdentifierKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.FunctionDeclaration
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Function, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Function[P]}
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait FunctionExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.FunctionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.FunctionExpression
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait FunctionTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var params: js.Array[astDashTypesLib.genKindsMod.FunctionTypeParamKind]
    var rest: astDashTypesLib.genKindsMod.FunctionTypeParamKind | scala.Null
    var returnType: astDashTypesLib.genKindsMod.FlowTypeKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.FunctionTypeAnnotation
    var typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind | scala.Null
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait FunctionTypeParam
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var name: astDashTypesLib.genKindsMod.IdentifierKind
    var optional: scala.Boolean
    var `type`: astDashTypesLib.astDashTypesLibStrings.FunctionTypeParam
    var typeAnnotation: astDashTypesLib.genKindsMod.FlowTypeKind
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait GeneratorExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var blocks: js.Array[astDashTypesLib.genKindsMod.ComprehensionBlockKind]
    var body: astDashTypesLib.genKindsMod.ExpressionKind
    var filter: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
    var `type`: astDashTypesLib.astDashTypesLibStrings.GeneratorExpression
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait GenericTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var id: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.QualifiedTypeIdentifierKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.GenericTypeAnnotation
    var typeParameters: astDashTypesLib.genKindsMod.TypeParameterInstantiationKind | scala.Null
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]}
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Pattern[P]} */ trait Identifier
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.IdentifierKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PatternKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var name: java.lang.String
    var optional: js.UndefOr[scala.Boolean] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.Identifier
    var typeAnnotation: js.UndefOr[
        astDashTypesLib.genKindsMod.TypeAnnotationKind | astDashTypesLib.genKindsMod.TSTypeAnnotationKind | scala.Null
      ] = js.undefined
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait IfStatement
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var alternate: js.UndefOr[astDashTypesLib.genKindsMod.StatementKind | scala.Null] = js.undefined
    var consequent: astDashTypesLib.genKindsMod.StatementKind
    var test: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.IfStatement
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait Import
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.Import
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait ImportDeclaration
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var importKind: js.UndefOr[
        astDashTypesLib.astDashTypesLibStrings.value | astDashTypesLib.astDashTypesLibStrings.`type`
      ] = js.undefined
    var source: astDashTypesLib.genKindsMod.LiteralKind
    var specifiers: js.UndefOr[
        js.Array[
          astDashTypesLib.genKindsMod.ImportSpecifierKind | astDashTypesLib.genKindsMod.ImportNamespaceSpecifierKind | astDashTypesLib.genKindsMod.ImportDefaultSpecifierKind
        ]
      ] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.ImportDeclaration
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.ModuleSpecifier, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.ModuleSpecifier[P]} */ trait ImportDefaultSpecifier
    extends ASTNode
       with astDashTypesLib.genKindsMod.ModuleSpecifierKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.SpecifierKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.ImportDefaultSpecifier
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.ModuleSpecifier, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.ModuleSpecifier[P]} */ trait ImportNamespaceSpecifier
    extends ASTNode
       with astDashTypesLib.genKindsMod.ModuleSpecifierKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.SpecifierKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.ImportNamespaceSpecifier
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.ModuleSpecifier, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.ModuleSpecifier[P]} */ trait ImportSpecifier
    extends ASTNode
       with astDashTypesLib.genKindsMod.ModuleSpecifierKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.SpecifierKind {
    var imported: astDashTypesLib.genKindsMod.IdentifierKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.ImportSpecifier
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowPredicate, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowPredicate[P]} */ trait InferredPredicate
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowPredicateKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.InferredPredicate
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait InterfaceDeclaration
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.InterfaceDeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var body: astDashTypesLib.genKindsMod.ObjectTypeAnnotationKind
    var `extends`: js.Array[astDashTypesLib.genKindsMod.InterfaceExtendsKind]
    var id: astDashTypesLib.genKindsMod.IdentifierKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.InterfaceDeclaration
    var typeParameters: js.UndefOr[astDashTypesLib.genKindsMod.TypeParameterDeclarationKind | scala.Null] = js.undefined
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait InterfaceExtends
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var id: astDashTypesLib.genKindsMod.IdentifierKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.InterfaceExtends
    var typeParameters: js.UndefOr[astDashTypesLib.genKindsMod.TypeParameterInstantiationKind | scala.Null] = js.undefined
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait InterfaceTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var body: astDashTypesLib.genKindsMod.ObjectTypeAnnotationKind
    var `extends`: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.InterfaceExtendsKind] | scala.Null] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.InterfaceTypeAnnotation
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait InterpreterDirective
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.InterpreterDirective
    var value: java.lang.String
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait IntersectionTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.IntersectionTypeAnnotation
    var types: js.Array[astDashTypesLib.genKindsMod.FlowTypeKind]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait JSXAttribute
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var name: astDashTypesLib.genKindsMod.JSXIdentifierKind | astDashTypesLib.genKindsMod.JSXNamespacedNameKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.JSXAttribute
    var value: js.UndefOr[
        astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.JSXExpressionContainerKind | scala.Null
      ] = js.undefined
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait JSXClosingElement
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var name: astDashTypesLib.genKindsMod.JSXIdentifierKind | astDashTypesLib.genKindsMod.JSXNamespacedNameKind | astDashTypesLib.genKindsMod.JSXMemberExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.JSXClosingElement
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait JSXClosingFragment
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.JSXClosingFragment
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait JSXElement
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var attributes: js.UndefOr[
        js.Array[
          astDashTypesLib.genKindsMod.JSXAttributeKind | astDashTypesLib.genKindsMod.JSXSpreadAttributeKind
        ]
      ] = js.undefined
    var children: js.UndefOr[
        js.Array[
          astDashTypesLib.genKindsMod.JSXElementKind | astDashTypesLib.genKindsMod.JSXExpressionContainerKind | astDashTypesLib.genKindsMod.JSXFragmentKind | astDashTypesLib.genKindsMod.JSXTextKind | astDashTypesLib.genKindsMod.LiteralKind
        ]
      ] = js.undefined
    var closingElement: js.UndefOr[astDashTypesLib.genKindsMod.JSXClosingElementKind | scala.Null] = js.undefined
    var name: js.UndefOr[
        astDashTypesLib.genKindsMod.JSXIdentifierKind | astDashTypesLib.genKindsMod.JSXNamespacedNameKind | astDashTypesLib.genKindsMod.JSXMemberExpressionKind
      ] = js.undefined
    var openingElement: astDashTypesLib.genKindsMod.JSXOpeningElementKind
    var selfClosing: js.UndefOr[scala.Boolean] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.JSXElement
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait JSXEmptyExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.JSXEmptyExpression
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait JSXExpressionContainer
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var expression: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.JSXExpressionContainer
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait JSXFragment
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var children: js.UndefOr[
        js.Array[
          astDashTypesLib.genKindsMod.JSXElementKind | astDashTypesLib.genKindsMod.JSXExpressionContainerKind | astDashTypesLib.genKindsMod.JSXFragmentKind | astDashTypesLib.genKindsMod.JSXTextKind | astDashTypesLib.genKindsMod.LiteralKind
        ]
      ] = js.undefined
    var closingElement: astDashTypesLib.genKindsMod.JSXClosingFragmentKind
    var openingElement: astDashTypesLib.genKindsMod.JSXOpeningFragmentKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.JSXFragment
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Identifier, 'type' | 'name'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Identifier[P]} */ trait JSXIdentifier
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.IdentifierKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PatternKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var name: java.lang.String
    var `type`: astDashTypesLib.astDashTypesLibStrings.JSXIdentifier
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.MemberExpression, 'type' | 'object' | 'property' | 'computed'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.MemberExpression[P]} */ trait JSXMemberExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.MemberExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var computed: js.UndefOr[scala.Boolean] = js.undefined
    var `object`: astDashTypesLib.genKindsMod.JSXIdentifierKind | astDashTypesLib.genKindsMod.JSXMemberExpressionKind
    var property: astDashTypesLib.genKindsMod.JSXIdentifierKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.JSXMemberExpression
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait JSXNamespacedName
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var name: astDashTypesLib.genKindsMod.JSXIdentifierKind
    var namespace: astDashTypesLib.genKindsMod.JSXIdentifierKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.JSXNamespacedName
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait JSXOpeningElement
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var attributes: js.UndefOr[
        js.Array[
          astDashTypesLib.genKindsMod.JSXAttributeKind | astDashTypesLib.genKindsMod.JSXSpreadAttributeKind
        ]
      ] = js.undefined
    var name: astDashTypesLib.genKindsMod.JSXIdentifierKind | astDashTypesLib.genKindsMod.JSXNamespacedNameKind | astDashTypesLib.genKindsMod.JSXMemberExpressionKind
    var selfClosing: js.UndefOr[scala.Boolean] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.JSXOpeningElement
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait JSXOpeningFragment
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.JSXOpeningFragment
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait JSXSpreadAttribute
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var argument: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.JSXSpreadAttribute
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait JSXSpreadChild
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var expression: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.JSXSpreadChild
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Literal, 'type' | 'value'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Literal[P]} */ trait JSXText
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.LiteralKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.JSXText
    var value: java.lang.String
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait LabeledStatement
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var body: astDashTypesLib.genKindsMod.StatementKind
    var label: astDashTypesLib.genKindsMod.IdentifierKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.LabeledStatement
  }
  
  trait Line
    extends Comment
       with ASTNode
       with astDashTypesLib.genKindsMod.CommentKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.Line
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait Literal
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.LiteralKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var regex: js.UndefOr[astDashTypesLib.Anon_Flags | scala.Null] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.Literal
    var value: java.lang.String | scala.Boolean | scala.Null | scala.Double | stdLib.RegExp
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait LogicalExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var left: astDashTypesLib.genKindsMod.ExpressionKind
    var operator: astDashTypesLib.astDashTypesLibStrings.`||` | astDashTypesLib.astDashTypesLibStrings.`&&` | astDashTypesLib.astDashTypesLibStrings.`??`
    var right: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.LogicalExpression
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait MemberExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.MemberExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var computed: js.UndefOr[scala.Boolean] = js.undefined
    var `object`: astDashTypesLib.genKindsMod.ExpressionKind
    var property: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.MemberExpression
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait MemberTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `object`: astDashTypesLib.genKindsMod.IdentifierKind
    var property: astDashTypesLib.genKindsMod.MemberTypeAnnotationKind | astDashTypesLib.genKindsMod.GenericTypeAnnotationKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.MemberTypeAnnotation
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait MetaProperty
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var meta: astDashTypesLib.genKindsMod.IdentifierKind
    var property: astDashTypesLib.genKindsMod.IdentifierKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.MetaProperty
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait MethodDefinition
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var computed: js.UndefOr[scala.Boolean] = js.undefined
    var decorators: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.DecoratorKind] | scala.Null] = js.undefined
    var key: astDashTypesLib.genKindsMod.ExpressionKind
    var kind: astDashTypesLib.astDashTypesLibStrings.constructor | astDashTypesLib.astDashTypesLibStrings.method | astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set
    var static: js.UndefOr[scala.Boolean] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.MethodDefinition
    var value: astDashTypesLib.genKindsMod.FunctionKind
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait MixedTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.MixedTypeAnnotation
  }
  
  trait ModuleSpecifier extends Node {
    var id: js.UndefOr[astDashTypesLib.genKindsMod.IdentifierKind | scala.Null] = js.undefined
    var local: js.UndefOr[astDashTypesLib.genKindsMod.IdentifierKind | scala.Null] = js.undefined
    var name: js.UndefOr[astDashTypesLib.genKindsMod.IdentifierKind | scala.Null] = js.undefined
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait NewExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var arguments: js.Array[
        astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.SpreadElementKind
      ]
    var callee: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.NewExpression
  }
  
  trait Node extends Printable {
    var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
    var `type`: java.lang.String
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait Noop
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.Noop
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Literal, 'type' | 'value'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Literal[P]} */ trait NullLiteral
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.LiteralKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.NullLiteral
    var value: js.UndefOr[scala.Null] = js.undefined
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait NullLiteralTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.NullLiteralTypeAnnotation
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait NullTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.NullTypeAnnotation
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait NullableTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.NullableTypeAnnotation
    var typeAnnotation: astDashTypesLib.genKindsMod.FlowTypeKind
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait NumberLiteralTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var raw: java.lang.String
    var `type`: astDashTypesLib.astDashTypesLibStrings.NumberLiteralTypeAnnotation
    var value: scala.Double
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait NumberTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.NumberTypeAnnotation
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Literal, 'type' | 'value'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Literal[P]} */ trait NumericLiteral
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.LiteralKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var extra: js.UndefOr[astDashTypesLib.Anon_Raw] = js.undefined
    var raw: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.NumericLiteral
    var value: scala.Double
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait NumericLiteralTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var raw: java.lang.String
    var `type`: astDashTypesLib.astDashTypesLibStrings.NumericLiteralTypeAnnotation
    var value: scala.Double
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait ObjectExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var properties: js.Array[
        astDashTypesLib.genKindsMod.PropertyKind | astDashTypesLib.genKindsMod.ObjectMethodKind | astDashTypesLib.genKindsMod.ObjectPropertyKind | astDashTypesLib.genKindsMod.SpreadPropertyKind | astDashTypesLib.genKindsMod.SpreadElementKind
      ]
    var `type`: astDashTypesLib.astDashTypesLibStrings.ObjectExpression
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]}
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Function, 'type' | 'params' | 'body' | 'generator' | 'async'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Function[P]} */ trait ObjectMethod
    extends ASTNode
       with astDashTypesLib.genKindsMod.FunctionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var accessibility: js.UndefOr[astDashTypesLib.genKindsMod.LiteralKind | scala.Null] = js.undefined
    var async: js.UndefOr[scala.Boolean] = js.undefined
    var body: astDashTypesLib.genKindsMod.BlockStatementKind
    var computed: js.UndefOr[scala.Boolean] = js.undefined
    var decorators: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.DecoratorKind] | scala.Null] = js.undefined
    var generator: js.UndefOr[scala.Boolean] = js.undefined
    var key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind
    var kind: astDashTypesLib.astDashTypesLibStrings.method | astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set
    var params: js.Array[astDashTypesLib.genKindsMod.PatternKind]
    var `type`: astDashTypesLib.astDashTypesLibStrings.ObjectMethod
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Pattern[P]} */ trait ObjectPattern
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PatternKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var decorators: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.DecoratorKind] | scala.Null] = js.undefined
    var properties: js.Array[
        astDashTypesLib.genKindsMod.PropertyKind | astDashTypesLib.genKindsMod.PropertyPatternKind | astDashTypesLib.genKindsMod.SpreadPropertyPatternKind | astDashTypesLib.genKindsMod.SpreadPropertyKind | astDashTypesLib.genKindsMod.ObjectPropertyKind | astDashTypesLib.genKindsMod.RestPropertyKind
      ]
    var `type`: astDashTypesLib.astDashTypesLibStrings.ObjectPattern
    var typeAnnotation: js.UndefOr[
        astDashTypesLib.genKindsMod.TypeAnnotationKind | astDashTypesLib.genKindsMod.TSTypeAnnotationKind | scala.Null
      ] = js.undefined
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait ObjectProperty
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var accessibility: js.UndefOr[astDashTypesLib.genKindsMod.LiteralKind | scala.Null] = js.undefined
    var computed: js.UndefOr[scala.Boolean] = js.undefined
    var key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind
    var shorthand: js.UndefOr[scala.Boolean] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.ObjectProperty
    var value: astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.PatternKind
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait ObjectTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var callProperties: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.ObjectTypeCallPropertyKind]] = js.undefined
    var exact: js.UndefOr[scala.Boolean] = js.undefined
    var indexers: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.ObjectTypeIndexerKind]] = js.undefined
    var inexact: js.UndefOr[scala.Boolean] = js.undefined
    var internalSlots: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.ObjectTypeInternalSlotKind]] = js.undefined
    var properties: js.Array[
        astDashTypesLib.genKindsMod.ObjectTypePropertyKind | astDashTypesLib.genKindsMod.ObjectTypeSpreadPropertyKind
      ]
    var `type`: astDashTypesLib.astDashTypesLibStrings.ObjectTypeAnnotation
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait ObjectTypeCallProperty
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var static: js.UndefOr[scala.Boolean] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.ObjectTypeCallProperty
    var value: astDashTypesLib.genKindsMod.FunctionTypeAnnotationKind
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait ObjectTypeIndexer
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var id: astDashTypesLib.genKindsMod.IdentifierKind
    var key: astDashTypesLib.genKindsMod.FlowTypeKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.ObjectTypeIndexer
    var value: astDashTypesLib.genKindsMod.FlowTypeKind
    var variance: js.UndefOr[
        astDashTypesLib.genKindsMod.VarianceKind | astDashTypesLib.astDashTypesLibStrings.plus | astDashTypesLib.astDashTypesLibStrings.minus | scala.Null
      ] = js.undefined
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait ObjectTypeInternalSlot
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var id: astDashTypesLib.genKindsMod.IdentifierKind
    var method: scala.Boolean
    var optional: scala.Boolean
    var static: scala.Boolean
    var `type`: astDashTypesLib.astDashTypesLibStrings.ObjectTypeInternalSlot
    var value: astDashTypesLib.genKindsMod.FlowTypeKind
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait ObjectTypeProperty
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind
    var optional: scala.Boolean
    var `type`: astDashTypesLib.astDashTypesLibStrings.ObjectTypeProperty
    var value: astDashTypesLib.genKindsMod.FlowTypeKind
    var variance: js.UndefOr[
        astDashTypesLib.genKindsMod.VarianceKind | astDashTypesLib.astDashTypesLibStrings.plus | astDashTypesLib.astDashTypesLibStrings.minus | scala.Null
      ] = js.undefined
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait ObjectTypeSpreadProperty
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var argument: astDashTypesLib.genKindsMod.FlowTypeKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.ObjectTypeSpreadProperty
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait OpaqueType
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var id: astDashTypesLib.genKindsMod.IdentifierKind
    var impltype: astDashTypesLib.genKindsMod.FlowTypeKind
    var supertype: astDashTypesLib.genKindsMod.FlowTypeKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.OpaqueType
    var typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind | scala.Null
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.CallExpression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.CallExpression[P]} */ trait OptionalCallExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.CallExpressionKind
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var optional: js.UndefOr[scala.Boolean] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.OptionalCallExpression
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.MemberExpression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.MemberExpression[P]} */ trait OptionalMemberExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.MemberExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var optional: js.UndefOr[scala.Boolean] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.OptionalMemberExpression
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait ParenthesizedExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var expression: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.ParenthesizedExpression
  }
  
  trait Position extends js.Object {
    var column: scala.Double
    var line: scala.Double
  }
  
  trait Printable extends js.Object {
    var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]}
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Pattern[P]} */ trait PrivateName
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PatternKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var id: astDashTypesLib.genKindsMod.IdentifierKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.PrivateName
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait Program
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var body: js.Array[astDashTypesLib.genKindsMod.StatementKind]
    var directives: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.DirectiveKind]] = js.undefined
    var interpreter: js.UndefOr[astDashTypesLib.genKindsMod.InterpreterDirectiveKind | scala.Null] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.Program
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait Property
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var computed: js.UndefOr[scala.Boolean] = js.undefined
    var decorators: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.DecoratorKind] | scala.Null] = js.undefined
    var key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind
    var kind: astDashTypesLib.astDashTypesLibStrings.init | astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set
    var method: js.UndefOr[scala.Boolean] = js.undefined
    var shorthand: js.UndefOr[scala.Boolean] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.Property
    var value: astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.PatternKind
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Pattern[P]} */ trait PropertyPattern
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PatternKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var computed: js.UndefOr[scala.Boolean] = js.undefined
    var key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind
    var pattern: astDashTypesLib.genKindsMod.PatternKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.PropertyPattern
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait QualifiedTypeIdentifier
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var id: astDashTypesLib.genKindsMod.IdentifierKind
    var qualification: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.QualifiedTypeIdentifierKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.QualifiedTypeIdentifier
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Literal, 'type' | 'value'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Literal[P]} */ trait RegExpLiteral
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.LiteralKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var flags: java.lang.String
    var pattern: java.lang.String
    var `type`: astDashTypesLib.astDashTypesLibStrings.RegExpLiteral
    var value: js.UndefOr[stdLib.RegExp] = js.undefined
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Pattern[P]} */ trait RestElement
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PatternKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var argument: astDashTypesLib.genKindsMod.PatternKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.RestElement
    var typeAnnotation: js.UndefOr[
        astDashTypesLib.genKindsMod.TypeAnnotationKind | astDashTypesLib.genKindsMod.TSTypeAnnotationKind | scala.Null
      ] = js.undefined
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait RestProperty
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var argument: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.RestProperty
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait ReturnStatement
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var argument: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
    var `type`: astDashTypesLib.astDashTypesLibStrings.ReturnStatement
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait SequenceExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var expressions: js.Array[astDashTypesLib.genKindsMod.ExpressionKind]
    var `type`: astDashTypesLib.astDashTypesLibStrings.SequenceExpression
  }
  
  trait SourceLocation extends js.Object {
    var end: astDashTypesLib.genKindsMod.PositionKind
    var source: js.UndefOr[java.lang.String | scala.Null] = js.undefined
    var start: astDashTypesLib.genKindsMod.PositionKind
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait SpreadElement
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var argument: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.SpreadElement
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Pattern[P]} */ trait SpreadElementPattern
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PatternKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var argument: astDashTypesLib.genKindsMod.PatternKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.SpreadElementPattern
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait SpreadProperty
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var argument: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.SpreadProperty
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Pattern[P]} */ trait SpreadPropertyPattern
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PatternKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var argument: astDashTypesLib.genKindsMod.PatternKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.SpreadPropertyPattern
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Literal, 'type' | 'value'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Literal[P]} */ trait StringLiteral
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.LiteralKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.StringLiteral
    var value: java.lang.String
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait StringLiteralTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var raw: java.lang.String
    var `type`: astDashTypesLib.astDashTypesLibStrings.StringLiteralTypeAnnotation
    var value: java.lang.String
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait StringTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.StringTypeAnnotation
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait Super
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.Super
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait SwitchCase
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var consequent: js.Array[astDashTypesLib.genKindsMod.StatementKind]
    var test: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
    var `type`: astDashTypesLib.astDashTypesLibStrings.SwitchCase
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait SwitchStatement
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var cases: js.Array[astDashTypesLib.genKindsMod.SwitchCaseKind]
    var discriminant: astDashTypesLib.genKindsMod.ExpressionKind
    var lexical: js.UndefOr[scala.Boolean] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.SwitchStatement
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSAnyKeyword
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSAnyKeyword
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSArrayType
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var elementType: astDashTypesLib.genKindsMod.TSTypeKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSArrayType
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]}
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Pattern[P]} */ trait TSAsExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PatternKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var expression: astDashTypesLib.genKindsMod.ExpressionKind
    var extra: js.UndefOr[astDashTypesLib.Anon_Parenthesized | scala.Null] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSAsExpression
    var typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSBigIntKeyword
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSBigIntKeyword
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSBooleanKeyword
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSBooleanKeyword
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TSCallSignatureDeclaration
    extends TSHasOptionalTypeParameters
       with TSHasOptionalTypeAnnotation
       with ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind
       with astDashTypesLib.genKindsMod.TSHasOptionalTypeAnnotationKind
       with astDashTypesLib.genKindsMod.TSHasOptionalTypeParametersKind {
    var parameters: js.Array[
        astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.RestElementKind | astDashTypesLib.genKindsMod.ArrayPatternKind | astDashTypesLib.genKindsMod.ObjectPatternKind
      ]
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSCallSignatureDeclaration
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSConditionalType
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var checkType: astDashTypesLib.genKindsMod.TSTypeKind
    var extendsType: astDashTypesLib.genKindsMod.TSTypeKind
    var falseType: astDashTypesLib.genKindsMod.TSTypeKind
    var trueType: astDashTypesLib.genKindsMod.TSTypeKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSConditionalType
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TSConstructSignatureDeclaration
    extends TSHasOptionalTypeParameters
       with TSHasOptionalTypeAnnotation
       with ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind
       with astDashTypesLib.genKindsMod.TSHasOptionalTypeAnnotationKind
       with astDashTypesLib.genKindsMod.TSHasOptionalTypeParametersKind {
    var parameters: js.Array[
        astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.RestElementKind | astDashTypesLib.genKindsMod.ArrayPatternKind | astDashTypesLib.genKindsMod.ObjectPatternKind
      ]
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSConstructSignatureDeclaration
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSConstructorType
    extends TSHasOptionalTypeParameters
       with TSHasOptionalTypeAnnotation
       with ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSHasOptionalTypeAnnotationKind
       with astDashTypesLib.genKindsMod.TSHasOptionalTypeParametersKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var parameters: js.Array[
        astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.RestElementKind | astDashTypesLib.genKindsMod.ArrayPatternKind | astDashTypesLib.genKindsMod.ObjectPatternKind
      ]
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSConstructorType
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TSDeclareFunction
    extends TSHasOptionalTypeParameters
       with ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind
       with astDashTypesLib.genKindsMod.TSHasOptionalTypeParametersKind {
    var async: js.UndefOr[scala.Boolean] = js.undefined
    var declare: js.UndefOr[scala.Boolean] = js.undefined
    var generator: js.UndefOr[scala.Boolean] = js.undefined
    var id: js.UndefOr[astDashTypesLib.genKindsMod.IdentifierKind | scala.Null] = js.undefined
    var params: js.Array[astDashTypesLib.genKindsMod.PatternKind]
    var returnType: js.UndefOr[
        astDashTypesLib.genKindsMod.TSTypeAnnotationKind | astDashTypesLib.genKindsMod.NoopKind | scala.Null
      ] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSDeclareFunction
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TSDeclareMethod
    extends TSHasOptionalTypeParameters
       with ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind
       with astDashTypesLib.genKindsMod.TSHasOptionalTypeParametersKind {
    var `abstract`: js.UndefOr[scala.Boolean] = js.undefined
    var access: js.UndefOr[
        astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected`
      ] = js.undefined
    var accessibility: js.UndefOr[
        astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected`
      ] = js.undefined
    var async: js.UndefOr[scala.Boolean] = js.undefined
    var computed: js.UndefOr[scala.Boolean] = js.undefined
    var decorators: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.DecoratorKind] | scala.Null] = js.undefined
    var generator: js.UndefOr[scala.Boolean] = js.undefined
    var key: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.StringLiteralKind | astDashTypesLib.genKindsMod.NumericLiteralKind | astDashTypesLib.genKindsMod.ExpressionKind
    var kind: js.UndefOr[
        astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set | astDashTypesLib.astDashTypesLibStrings.method | astDashTypesLib.astDashTypesLibStrings.constructor
      ] = js.undefined
    var optional: js.UndefOr[scala.Boolean] = js.undefined
    var params: js.Array[astDashTypesLib.genKindsMod.PatternKind]
    var returnType: js.UndefOr[
        astDashTypesLib.genKindsMod.TSTypeAnnotationKind | astDashTypesLib.genKindsMod.NoopKind | scala.Null
      ] = js.undefined
    var static: js.UndefOr[scala.Boolean] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSDeclareMethod
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TSEnumDeclaration
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var const: js.UndefOr[scala.Boolean] = js.undefined
    var declare: js.UndefOr[scala.Boolean] = js.undefined
    var id: astDashTypesLib.genKindsMod.IdentifierKind
    var initializer: js.UndefOr[astDashTypesLib.genKindsMod.ExpressionKind | scala.Null] = js.undefined
    var members: js.Array[astDashTypesLib.genKindsMod.TSEnumMemberKind]
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSEnumDeclaration
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait TSEnumMember
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var id: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.StringLiteralKind
    var initializer: js.UndefOr[astDashTypesLib.genKindsMod.ExpressionKind | scala.Null] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSEnumMember
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait TSExportAssignment
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var expression: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSExportAssignment
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSExpressionWithTypeArguments
    extends TSHasOptionalTypeParameterInstantiation
       with ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSHasOptionalTypeParameterInstantiationKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var expression: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSExpressionWithTypeArguments
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TSExternalModuleReference
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var expression: astDashTypesLib.genKindsMod.StringLiteralKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSExternalModuleReference
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSFunctionType
    extends TSHasOptionalTypeParameters
       with TSHasOptionalTypeAnnotation
       with ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSHasOptionalTypeAnnotationKind
       with astDashTypesLib.genKindsMod.TSHasOptionalTypeParametersKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var parameters: js.Array[
        astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.RestElementKind | astDashTypesLib.genKindsMod.ArrayPatternKind | astDashTypesLib.genKindsMod.ObjectPatternKind
      ]
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSFunctionType
  }
  
  trait TSHasOptionalTypeAnnotation extends js.Object {
    var typeAnnotation: js.UndefOr[astDashTypesLib.genKindsMod.TSTypeAnnotationKind | scala.Null] = js.undefined
  }
  
  trait TSHasOptionalTypeParameterInstantiation extends js.Object {
    var typeParameters: js.UndefOr[astDashTypesLib.genKindsMod.TSTypeParameterInstantiationKind | scala.Null] = js.undefined
  }
  
  trait TSHasOptionalTypeParameters extends js.Object {
    var typeParameters: js.UndefOr[astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind | scala.Null] = js.undefined
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TSImportEqualsDeclaration
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var id: astDashTypesLib.genKindsMod.IdentifierKind
    var isExport: js.UndefOr[scala.Boolean] = js.undefined
    var moduleReference: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind | astDashTypesLib.genKindsMod.TSExternalModuleReferenceKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSImportEqualsDeclaration
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSImportType
    extends TSHasOptionalTypeParameterInstantiation
       with ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSHasOptionalTypeParameterInstantiationKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var argument: astDashTypesLib.genKindsMod.StringLiteralKind
    var qualifier: js.UndefOr[
        astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind
      ] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSImportType
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TSIndexSignature
    extends TSHasOptionalTypeAnnotation
       with ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind
       with astDashTypesLib.genKindsMod.TSHasOptionalTypeAnnotationKind {
    var parameters: js.Array[astDashTypesLib.genKindsMod.IdentifierKind]
    var readonly: js.UndefOr[scala.Boolean] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSIndexSignature
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSIndexedAccessType
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var indexType: astDashTypesLib.genKindsMod.TSTypeKind
    var objectType: astDashTypesLib.genKindsMod.TSTypeKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSIndexedAccessType
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSInferType
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSInferType
    var typeParameter: astDashTypesLib.genKindsMod.TSTypeParameterKind
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait TSInterfaceBody
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var body: js.Array[
        astDashTypesLib.genKindsMod.TSCallSignatureDeclarationKind | astDashTypesLib.genKindsMod.TSConstructSignatureDeclarationKind | astDashTypesLib.genKindsMod.TSIndexSignatureKind | astDashTypesLib.genKindsMod.TSMethodSignatureKind | astDashTypesLib.genKindsMod.TSPropertySignatureKind
      ]
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSInterfaceBody
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TSInterfaceDeclaration
    extends TSHasOptionalTypeParameters
       with ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind
       with astDashTypesLib.genKindsMod.TSHasOptionalTypeParametersKind {
    var body: astDashTypesLib.genKindsMod.TSInterfaceBodyKind
    var declare: js.UndefOr[scala.Boolean] = js.undefined
    var `extends`: js.UndefOr[
        js.Array[astDashTypesLib.genKindsMod.TSExpressionWithTypeArgumentsKind] | scala.Null
      ] = js.undefined
    var id: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSInterfaceDeclaration
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSIntersectionType
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSIntersectionType
    var types: js.Array[astDashTypesLib.genKindsMod.TSTypeKind]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSLiteralType
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var literal: astDashTypesLib.genKindsMod.NumericLiteralKind | astDashTypesLib.genKindsMod.StringLiteralKind | astDashTypesLib.genKindsMod.BooleanLiteralKind | astDashTypesLib.genKindsMod.TemplateLiteralKind | astDashTypesLib.genKindsMod.UnaryExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSLiteralType
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSMappedType
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var optional: js.UndefOr[
        scala.Boolean | astDashTypesLib.astDashTypesLibStrings.`+` | astDashTypesLib.astDashTypesLibStrings.`-`
      ] = js.undefined
    var readonly: js.UndefOr[
        scala.Boolean | astDashTypesLib.astDashTypesLibStrings.`+` | astDashTypesLib.astDashTypesLibStrings.`-`
      ] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSMappedType
    var typeAnnotation: js.UndefOr[astDashTypesLib.genKindsMod.TSTypeKind | scala.Null] = js.undefined
    var typeParameter: astDashTypesLib.genKindsMod.TSTypeParameterKind
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TSMethodSignature
    extends TSHasOptionalTypeParameters
       with TSHasOptionalTypeAnnotation
       with ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind
       with astDashTypesLib.genKindsMod.TSHasOptionalTypeAnnotationKind
       with astDashTypesLib.genKindsMod.TSHasOptionalTypeParametersKind {
    var computed: js.UndefOr[scala.Boolean] = js.undefined
    var key: astDashTypesLib.genKindsMod.ExpressionKind
    var optional: js.UndefOr[scala.Boolean] = js.undefined
    var parameters: js.Array[
        astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.RestElementKind | astDashTypesLib.genKindsMod.ArrayPatternKind | astDashTypesLib.genKindsMod.ObjectPatternKind
      ]
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSMethodSignature
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait TSModuleBlock
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var body: js.Array[astDashTypesLib.genKindsMod.StatementKind]
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSModuleBlock
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TSModuleDeclaration
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var body: js.UndefOr[
        astDashTypesLib.genKindsMod.TSModuleBlockKind | astDashTypesLib.genKindsMod.TSModuleDeclarationKind | scala.Null
      ] = js.undefined
    var declare: js.UndefOr[scala.Boolean] = js.undefined
    var global: js.UndefOr[scala.Boolean] = js.undefined
    var id: astDashTypesLib.genKindsMod.StringLiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSModuleDeclaration
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TSNamespaceExportDeclaration
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var id: astDashTypesLib.genKindsMod.IdentifierKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSNamespaceExportDeclaration
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSNeverKeyword
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSNeverKeyword
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]}
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Pattern[P]} */ trait TSNonNullExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PatternKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var expression: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSNonNullExpression
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSNullKeyword
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSNullKeyword
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSNumberKeyword
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSNumberKeyword
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSObjectKeyword
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSObjectKeyword
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSOptionalType
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSOptionalType
    var typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Pattern[P]} */ trait TSParameterProperty
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PatternKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var accessibility: js.UndefOr[
        astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected`
      ] = js.undefined
    var parameter: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.AssignmentPatternKind
    var readonly: js.UndefOr[scala.Boolean] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSParameterProperty
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSParenthesizedType
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSParenthesizedType
    var typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TSPropertySignature
    extends TSHasOptionalTypeAnnotation
       with ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind
       with astDashTypesLib.genKindsMod.TSHasOptionalTypeAnnotationKind {
    var computed: js.UndefOr[scala.Boolean] = js.undefined
    var initializer: js.UndefOr[astDashTypesLib.genKindsMod.ExpressionKind | scala.Null] = js.undefined
    var key: astDashTypesLib.genKindsMod.ExpressionKind
    var optional: js.UndefOr[scala.Boolean] = js.undefined
    var readonly: js.UndefOr[scala.Boolean] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSPropertySignature
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait TSQualifiedName
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var left: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind
    var right: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSQualifiedName
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSRestType
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSRestType
    var typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSStringKeyword
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSStringKeyword
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSSymbolKeyword
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSSymbolKeyword
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSThisType
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSThisType
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSTupleType
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var elementTypes: js.Array[astDashTypesLib.genKindsMod.TSTypeKind]
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSTupleType
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TSTypeAliasDeclaration
    extends TSHasOptionalTypeParameters
       with ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind
       with astDashTypesLib.genKindsMod.TSHasOptionalTypeParametersKind {
    var declare: js.UndefOr[scala.Boolean] = js.undefined
    var id: astDashTypesLib.genKindsMod.IdentifierKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeAliasDeclaration
    var typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait TSTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeAnnotationKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeAnnotation
    var typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind | astDashTypesLib.genKindsMod.TSTypeAnnotationKind
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]}
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Pattern[P]} */ trait TSTypeAssertion
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PatternKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var expression: astDashTypesLib.genKindsMod.ExpressionKind
    var extra: js.UndefOr[astDashTypesLib.Anon_Parenthesized | scala.Null] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeAssertion
    var typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSTypeLiteral
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var members: js.Array[
        astDashTypesLib.genKindsMod.TSCallSignatureDeclarationKind | astDashTypesLib.genKindsMod.TSConstructSignatureDeclarationKind | astDashTypesLib.genKindsMod.TSIndexSignatureKind | astDashTypesLib.genKindsMod.TSMethodSignatureKind | astDashTypesLib.genKindsMod.TSPropertySignatureKind
      ]
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeLiteral
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSTypeOperator
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var operator: java.lang.String
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeOperator
    var typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Identifier, 'type' | 'name'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Identifier[P]} */ trait TSTypeParameter
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.IdentifierKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PatternKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var constraint: js.UndefOr[astDashTypesLib.genKindsMod.TSTypeKind] = js.undefined
    var default: js.UndefOr[astDashTypesLib.genKindsMod.TSTypeKind] = js.undefined
    var name: java.lang.String
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeParameter
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TSTypeParameterDeclaration
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var params: js.Array[astDashTypesLib.genKindsMod.TSTypeParameterKind]
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeParameterDeclaration
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait TSTypeParameterInstantiation
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var params: js.Array[astDashTypesLib.genKindsMod.TSTypeKind]
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeParameterInstantiation
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSTypeAnnotation, 'type' | 'typeAnnotation'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSTypeAnnotation[P]} */ trait TSTypePredicate
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeAnnotationKind {
    var parameterName: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSThisTypeKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSTypePredicate
    var typeAnnotation: astDashTypesLib.genKindsMod.TSTypeAnnotationKind
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSTypeQuery
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var exprName: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind | astDashTypesLib.genKindsMod.TSImportTypeKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeQuery
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSTypeReference
    extends TSHasOptionalTypeParameterInstantiation
       with ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSHasOptionalTypeParameterInstantiationKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeReference
    var typeName: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSUndefinedKeyword
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSUndefinedKeyword
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSUnionType
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSUnionType
    var types: js.Array[astDashTypesLib.genKindsMod.TSTypeKind]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSUnknownKeyword
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSUnknownKeyword
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSVoidKeyword
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.TSTypeKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.TSVoidKeyword
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait TaggedTemplateExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var quasi: astDashTypesLib.genKindsMod.TemplateLiteralKind
    var tag: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.TaggedTemplateExpression
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait TemplateElement
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var tail: scala.Boolean
    var `type`: astDashTypesLib.astDashTypesLibStrings.TemplateElement
    var value: astDashTypesLib.Anon_Cooked
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait TemplateLiteral
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var expressions: js.Array[astDashTypesLib.genKindsMod.ExpressionKind]
    var quasis: js.Array[astDashTypesLib.genKindsMod.TemplateElementKind]
    var `type`: astDashTypesLib.astDashTypesLibStrings.TemplateLiteral
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait ThisExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.ThisExpression
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait ThisTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.ThisTypeAnnotation
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait ThrowStatement
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var argument: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.ThrowStatement
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait TryStatement
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var block: astDashTypesLib.genKindsMod.BlockStatementKind
    var finalizer: js.UndefOr[astDashTypesLib.genKindsMod.BlockStatementKind | scala.Null] = js.undefined
    var guardedHandlers: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CatchClauseKind]] = js.undefined
    var handler: js.UndefOr[astDashTypesLib.genKindsMod.CatchClauseKind | scala.Null] = js.undefined
    var handlers: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CatchClauseKind]] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.TryStatement
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait TupleTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.TupleTypeAnnotation
    var types: js.Array[astDashTypesLib.genKindsMod.FlowTypeKind]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TypeAlias
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind
       with astDashTypesLib.genKindsMod.TypeAliasKind {
    var id: astDashTypesLib.genKindsMod.IdentifierKind
    var right: astDashTypesLib.genKindsMod.FlowTypeKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.TypeAlias
    var typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind | scala.Null
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait TypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.TypeAnnotation
    var typeAnnotation: astDashTypesLib.genKindsMod.FlowTypeKind
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait TypeCastExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var expression: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.TypeCastExpression
    var typeAnnotation: astDashTypesLib.genKindsMod.TypeAnnotationKind
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait TypeParameter
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var bound: js.UndefOr[astDashTypesLib.genKindsMod.TypeAnnotationKind | scala.Null] = js.undefined
    var name: java.lang.String
    var `type`: astDashTypesLib.astDashTypesLibStrings.TypeParameter
    var variance: js.UndefOr[
        astDashTypesLib.genKindsMod.VarianceKind | astDashTypesLib.astDashTypesLibStrings.plus | astDashTypesLib.astDashTypesLibStrings.minus | scala.Null
      ] = js.undefined
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait TypeParameterDeclaration
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var params: js.Array[astDashTypesLib.genKindsMod.TypeParameterKind]
    var `type`: astDashTypesLib.astDashTypesLibStrings.TypeParameterDeclaration
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait TypeParameterInstantiation
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var params: js.Array[astDashTypesLib.genKindsMod.FlowTypeKind]
    var `type`: astDashTypesLib.astDashTypesLibStrings.TypeParameterInstantiation
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait TypeofTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var argument: astDashTypesLib.genKindsMod.FlowTypeKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.TypeofTypeAnnotation
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait UnaryExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var argument: astDashTypesLib.genKindsMod.ExpressionKind
    var operator: astDashTypesLib.astDashTypesLibStrings.`-` | astDashTypesLib.astDashTypesLibStrings.`+` | astDashTypesLib.astDashTypesLibStrings.`!` | astDashTypesLib.astDashTypesLibStrings.`~` | astDashTypesLib.astDashTypesLibStrings.typeof | astDashTypesLib.astDashTypesLibStrings.void | astDashTypesLib.astDashTypesLibStrings.delete
    var prefix: js.UndefOr[scala.Boolean] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.UnaryExpression
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait UnionTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.UnionTypeAnnotation
    var types: js.Array[astDashTypesLib.genKindsMod.FlowTypeKind]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait UpdateExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var argument: astDashTypesLib.genKindsMod.ExpressionKind
    var operator: astDashTypesLib.astDashTypesLibStrings.`++` | astDashTypesLib.astDashTypesLibStrings.`--`
    var prefix: scala.Boolean
    var `type`: astDashTypesLib.astDashTypesLibStrings.UpdateExpression
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait VariableDeclaration
    extends ASTNode
       with astDashTypesLib.genKindsMod.DeclarationKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var declarations: js.Array[
        astDashTypesLib.genKindsMod.VariableDeclaratorKind | astDashTypesLib.genKindsMod.IdentifierKind
      ]
    var kind: astDashTypesLib.astDashTypesLibStrings.`var` | astDashTypesLib.astDashTypesLibStrings.let | astDashTypesLib.astDashTypesLibStrings.const
    var `type`: astDashTypesLib.astDashTypesLibStrings.VariableDeclaration
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait VariableDeclarator
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var id: astDashTypesLib.genKindsMod.PatternKind
    var init: js.UndefOr[astDashTypesLib.genKindsMod.ExpressionKind | scala.Null] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.VariableDeclarator
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait Variance
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var kind: astDashTypesLib.astDashTypesLibStrings.plus | astDashTypesLib.astDashTypesLibStrings.minus
    var `type`: astDashTypesLib.astDashTypesLibStrings.Variance
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.FlowType[P]} */ trait VoidTypeAnnotation
    extends ASTNode
       with astDashTypesLib.genKindsMod.FlowKind
       with astDashTypesLib.genKindsMod.FlowTypeKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var `type`: astDashTypesLib.astDashTypesLibStrings.VoidTypeAnnotation
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait WhileStatement
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var body: astDashTypesLib.genKindsMod.StatementKind
    var test: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.WhileStatement
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait WithStatement
    extends ASTNode
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind
       with astDashTypesLib.genKindsMod.StatementKind {
    var body: astDashTypesLib.genKindsMod.StatementKind
    var `object`: astDashTypesLib.genKindsMod.ExpressionKind
    var `type`: astDashTypesLib.astDashTypesLibStrings.WithStatement
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait YieldExpression
    extends ASTNode
       with astDashTypesLib.genKindsMod.ExpressionKind
       with astDashTypesLib.genKindsMod.NodeKind
       with astDashTypesLib.genKindsMod.PrintableKind {
    var argument: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
    var delegate: js.UndefOr[scala.Boolean] = js.undefined
    var `type`: astDashTypesLib.astDashTypesLibStrings.YieldExpression
  }
  
  var AnyTypeAnnotation: astDashTypesLib.libTypesMod.Type[AnyTypeAnnotation] = js.native
  var ArrayExpression: astDashTypesLib.libTypesMod.Type[ArrayExpression] = js.native
  var ArrayPattern: astDashTypesLib.libTypesMod.Type[ArrayPattern] = js.native
  var ArrayTypeAnnotation: astDashTypesLib.libTypesMod.Type[ArrayTypeAnnotation] = js.native
  var ArrowFunctionExpression: astDashTypesLib.libTypesMod.Type[ArrowFunctionExpression] = js.native
  var AssignmentExpression: astDashTypesLib.libTypesMod.Type[AssignmentExpression] = js.native
  var AssignmentPattern: astDashTypesLib.libTypesMod.Type[AssignmentPattern] = js.native
  var AwaitExpression: astDashTypesLib.libTypesMod.Type[AwaitExpression] = js.native
  var BigIntLiteral: astDashTypesLib.libTypesMod.Type[BigIntLiteral] = js.native
  var BinaryExpression: astDashTypesLib.libTypesMod.Type[BinaryExpression] = js.native
  var BindExpression: astDashTypesLib.libTypesMod.Type[BindExpression] = js.native
  var Block: astDashTypesLib.libTypesMod.Type[Block] = js.native
  var BlockStatement: astDashTypesLib.libTypesMod.Type[BlockStatement] = js.native
  var BooleanLiteral: astDashTypesLib.libTypesMod.Type[BooleanLiteral] = js.native
  var BooleanLiteralTypeAnnotation: astDashTypesLib.libTypesMod.Type[BooleanLiteralTypeAnnotation] = js.native
  var BooleanTypeAnnotation: astDashTypesLib.libTypesMod.Type[BooleanTypeAnnotation] = js.native
  var BreakStatement: astDashTypesLib.libTypesMod.Type[BreakStatement] = js.native
  var CallExpression: astDashTypesLib.libTypesMod.Type[CallExpression] = js.native
  var CatchClause: astDashTypesLib.libTypesMod.Type[CatchClause] = js.native
  var ClassBody: astDashTypesLib.libTypesMod.Type[ClassBody] = js.native
  var ClassDeclaration: astDashTypesLib.libTypesMod.Type[ClassDeclaration] = js.native
  var ClassExpression: astDashTypesLib.libTypesMod.Type[ClassExpression] = js.native
  var ClassImplements: astDashTypesLib.libTypesMod.Type[ClassImplements] = js.native
  var ClassMethod: astDashTypesLib.libTypesMod.Type[ClassMethod] = js.native
  var ClassPrivateMethod: astDashTypesLib.libTypesMod.Type[ClassPrivateMethod] = js.native
  var ClassPrivateProperty: astDashTypesLib.libTypesMod.Type[ClassPrivateProperty] = js.native
  var ClassProperty: astDashTypesLib.libTypesMod.Type[ClassProperty] = js.native
  var ClassPropertyDefinition: astDashTypesLib.libTypesMod.Type[ClassPropertyDefinition] = js.native
  var Comment: astDashTypesLib.libTypesMod.Type[Comment] = js.native
  var CommentBlock: astDashTypesLib.libTypesMod.Type[CommentBlock] = js.native
  var CommentLine: astDashTypesLib.libTypesMod.Type[CommentLine] = js.native
  var ComprehensionBlock: astDashTypesLib.libTypesMod.Type[ComprehensionBlock] = js.native
  var ComprehensionExpression: astDashTypesLib.libTypesMod.Type[ComprehensionExpression] = js.native
  var ConditionalExpression: astDashTypesLib.libTypesMod.Type[ConditionalExpression] = js.native
  var ContinueStatement: astDashTypesLib.libTypesMod.Type[ContinueStatement] = js.native
  var DebuggerStatement: astDashTypesLib.libTypesMod.Type[DebuggerStatement] = js.native
  var Declaration: astDashTypesLib.libTypesMod.Type[Declaration] = js.native
  var DeclareClass: astDashTypesLib.libTypesMod.Type[DeclareClass] = js.native
  var DeclareExportAllDeclaration: astDashTypesLib.libTypesMod.Type[DeclareExportAllDeclaration] = js.native
  var DeclareExportDeclaration: astDashTypesLib.libTypesMod.Type[DeclareExportDeclaration] = js.native
  var DeclareFunction: astDashTypesLib.libTypesMod.Type[DeclareFunction] = js.native
  var DeclareInterface: astDashTypesLib.libTypesMod.Type[DeclareInterface] = js.native
  var DeclareModule: astDashTypesLib.libTypesMod.Type[DeclareModule] = js.native
  var DeclareModuleExports: astDashTypesLib.libTypesMod.Type[DeclareModuleExports] = js.native
  var DeclareOpaqueType: astDashTypesLib.libTypesMod.Type[DeclareOpaqueType] = js.native
  var DeclareTypeAlias: astDashTypesLib.libTypesMod.Type[DeclareTypeAlias] = js.native
  var DeclareVariable: astDashTypesLib.libTypesMod.Type[DeclareVariable] = js.native
  var DeclaredPredicate: astDashTypesLib.libTypesMod.Type[DeclaredPredicate] = js.native
  var Decorator: astDashTypesLib.libTypesMod.Type[Decorator] = js.native
  var Directive: astDashTypesLib.libTypesMod.Type[Directive] = js.native
  var DirectiveLiteral: astDashTypesLib.libTypesMod.Type[DirectiveLiteral] = js.native
  var DoExpression: astDashTypesLib.libTypesMod.Type[DoExpression] = js.native
  var DoWhileStatement: astDashTypesLib.libTypesMod.Type[DoWhileStatement] = js.native
  var EmptyStatement: astDashTypesLib.libTypesMod.Type[EmptyStatement] = js.native
  var EmptyTypeAnnotation: astDashTypesLib.libTypesMod.Type[EmptyTypeAnnotation] = js.native
  var ExistentialTypeParam: astDashTypesLib.libTypesMod.Type[ExistentialTypeParam] = js.native
  var ExistsTypeAnnotation: astDashTypesLib.libTypesMod.Type[ExistsTypeAnnotation] = js.native
  var ExportAllDeclaration: astDashTypesLib.libTypesMod.Type[ExportAllDeclaration] = js.native
  var ExportBatchSpecifier: astDashTypesLib.libTypesMod.Type[ExportBatchSpecifier] = js.native
  var ExportDeclaration: astDashTypesLib.libTypesMod.Type[ExportDeclaration] = js.native
  var ExportDefaultDeclaration: astDashTypesLib.libTypesMod.Type[ExportDefaultDeclaration] = js.native
  var ExportDefaultSpecifier: astDashTypesLib.libTypesMod.Type[ExportDefaultSpecifier] = js.native
  var ExportNamedDeclaration: astDashTypesLib.libTypesMod.Type[ExportNamedDeclaration] = js.native
  var ExportNamespaceSpecifier: astDashTypesLib.libTypesMod.Type[ExportNamespaceSpecifier] = js.native
  var ExportSpecifier: astDashTypesLib.libTypesMod.Type[ExportSpecifier] = js.native
  var Expression: astDashTypesLib.libTypesMod.Type[Expression] = js.native
  var ExpressionStatement: astDashTypesLib.libTypesMod.Type[ExpressionStatement] = js.native
  var File: astDashTypesLib.libTypesMod.Type[File] = js.native
  var Flow: astDashTypesLib.libTypesMod.Type[Flow] = js.native
  var FlowPredicate: astDashTypesLib.libTypesMod.Type[FlowPredicate] = js.native
  var FlowType: astDashTypesLib.libTypesMod.Type[FlowType] = js.native
  var ForAwaitStatement: astDashTypesLib.libTypesMod.Type[ForAwaitStatement] = js.native
  var ForInStatement: astDashTypesLib.libTypesMod.Type[ForInStatement] = js.native
  var ForOfStatement: astDashTypesLib.libTypesMod.Type[ForOfStatement] = js.native
  var ForStatement: astDashTypesLib.libTypesMod.Type[ForStatement] = js.native
  var Function: astDashTypesLib.libTypesMod.Type[Function] = js.native
  var FunctionDeclaration: astDashTypesLib.libTypesMod.Type[FunctionDeclaration] = js.native
  var FunctionExpression: astDashTypesLib.libTypesMod.Type[FunctionExpression] = js.native
  var FunctionTypeAnnotation: astDashTypesLib.libTypesMod.Type[FunctionTypeAnnotation] = js.native
  var FunctionTypeParam: astDashTypesLib.libTypesMod.Type[FunctionTypeParam] = js.native
  var GeneratorExpression: astDashTypesLib.libTypesMod.Type[GeneratorExpression] = js.native
  var GenericTypeAnnotation: astDashTypesLib.libTypesMod.Type[GenericTypeAnnotation] = js.native
  var Identifier: astDashTypesLib.libTypesMod.Type[Identifier] = js.native
  var IfStatement: astDashTypesLib.libTypesMod.Type[IfStatement] = js.native
  var Import: astDashTypesLib.libTypesMod.Type[Import] = js.native
  var ImportDeclaration: astDashTypesLib.libTypesMod.Type[ImportDeclaration] = js.native
  var ImportDefaultSpecifier: astDashTypesLib.libTypesMod.Type[ImportDefaultSpecifier] = js.native
  var ImportNamespaceSpecifier: astDashTypesLib.libTypesMod.Type[ImportNamespaceSpecifier] = js.native
  var ImportSpecifier: astDashTypesLib.libTypesMod.Type[ImportSpecifier] = js.native
  var InferredPredicate: astDashTypesLib.libTypesMod.Type[InferredPredicate] = js.native
  var InterfaceDeclaration: astDashTypesLib.libTypesMod.Type[InterfaceDeclaration] = js.native
  var InterfaceExtends: astDashTypesLib.libTypesMod.Type[InterfaceExtends] = js.native
  var InterfaceTypeAnnotation: astDashTypesLib.libTypesMod.Type[InterfaceTypeAnnotation] = js.native
  var InterpreterDirective: astDashTypesLib.libTypesMod.Type[InterpreterDirective] = js.native
  var IntersectionTypeAnnotation: astDashTypesLib.libTypesMod.Type[IntersectionTypeAnnotation] = js.native
  var JSXAttribute: astDashTypesLib.libTypesMod.Type[JSXAttribute] = js.native
  var JSXClosingElement: astDashTypesLib.libTypesMod.Type[JSXClosingElement] = js.native
  var JSXClosingFragment: astDashTypesLib.libTypesMod.Type[JSXClosingFragment] = js.native
  var JSXElement: astDashTypesLib.libTypesMod.Type[JSXElement] = js.native
  var JSXEmptyExpression: astDashTypesLib.libTypesMod.Type[JSXEmptyExpression] = js.native
  var JSXExpressionContainer: astDashTypesLib.libTypesMod.Type[JSXExpressionContainer] = js.native
  var JSXFragment: astDashTypesLib.libTypesMod.Type[JSXFragment] = js.native
  var JSXIdentifier: astDashTypesLib.libTypesMod.Type[JSXIdentifier] = js.native
  var JSXMemberExpression: astDashTypesLib.libTypesMod.Type[JSXMemberExpression] = js.native
  var JSXNamespacedName: astDashTypesLib.libTypesMod.Type[JSXNamespacedName] = js.native
  var JSXOpeningElement: astDashTypesLib.libTypesMod.Type[JSXOpeningElement] = js.native
  var JSXOpeningFragment: astDashTypesLib.libTypesMod.Type[JSXOpeningFragment] = js.native
  var JSXSpreadAttribute: astDashTypesLib.libTypesMod.Type[JSXSpreadAttribute] = js.native
  var JSXSpreadChild: astDashTypesLib.libTypesMod.Type[JSXSpreadChild] = js.native
  var JSXText: astDashTypesLib.libTypesMod.Type[JSXText] = js.native
  var LabeledStatement: astDashTypesLib.libTypesMod.Type[LabeledStatement] = js.native
  var Line: astDashTypesLib.libTypesMod.Type[Line] = js.native
  var Literal: astDashTypesLib.libTypesMod.Type[Literal] = js.native
  var LogicalExpression: astDashTypesLib.libTypesMod.Type[LogicalExpression] = js.native
  var MemberExpression: astDashTypesLib.libTypesMod.Type[MemberExpression] = js.native
  var MemberTypeAnnotation: astDashTypesLib.libTypesMod.Type[MemberTypeAnnotation] = js.native
  var MetaProperty: astDashTypesLib.libTypesMod.Type[MetaProperty] = js.native
  var MethodDefinition: astDashTypesLib.libTypesMod.Type[MethodDefinition] = js.native
  var MixedTypeAnnotation: astDashTypesLib.libTypesMod.Type[MixedTypeAnnotation] = js.native
  var ModuleSpecifier: astDashTypesLib.libTypesMod.Type[ModuleSpecifier] = js.native
  var NewExpression: astDashTypesLib.libTypesMod.Type[NewExpression] = js.native
  var Node: astDashTypesLib.libTypesMod.Type[Node] = js.native
  var Noop: astDashTypesLib.libTypesMod.Type[Noop] = js.native
  var NullLiteral: astDashTypesLib.libTypesMod.Type[NullLiteral] = js.native
  var NullLiteralTypeAnnotation: astDashTypesLib.libTypesMod.Type[NullLiteralTypeAnnotation] = js.native
  var NullTypeAnnotation: astDashTypesLib.libTypesMod.Type[NullTypeAnnotation] = js.native
  var NullableTypeAnnotation: astDashTypesLib.libTypesMod.Type[NullableTypeAnnotation] = js.native
  var NumberLiteralTypeAnnotation: astDashTypesLib.libTypesMod.Type[NumberLiteralTypeAnnotation] = js.native
  var NumberTypeAnnotation: astDashTypesLib.libTypesMod.Type[NumberTypeAnnotation] = js.native
  var NumericLiteral: astDashTypesLib.libTypesMod.Type[NumericLiteral] = js.native
  var NumericLiteralTypeAnnotation: astDashTypesLib.libTypesMod.Type[NumericLiteralTypeAnnotation] = js.native
  var ObjectExpression: astDashTypesLib.libTypesMod.Type[ObjectExpression] = js.native
  var ObjectMethod: astDashTypesLib.libTypesMod.Type[ObjectMethod] = js.native
  var ObjectPattern: astDashTypesLib.libTypesMod.Type[ObjectPattern] = js.native
  var ObjectProperty: astDashTypesLib.libTypesMod.Type[ObjectProperty] = js.native
  var ObjectTypeAnnotation: astDashTypesLib.libTypesMod.Type[ObjectTypeAnnotation] = js.native
  var ObjectTypeCallProperty: astDashTypesLib.libTypesMod.Type[ObjectTypeCallProperty] = js.native
  var ObjectTypeIndexer: astDashTypesLib.libTypesMod.Type[ObjectTypeIndexer] = js.native
  var ObjectTypeInternalSlot: astDashTypesLib.libTypesMod.Type[ObjectTypeInternalSlot] = js.native
  var ObjectTypeProperty: astDashTypesLib.libTypesMod.Type[ObjectTypeProperty] = js.native
  var ObjectTypeSpreadProperty: astDashTypesLib.libTypesMod.Type[ObjectTypeSpreadProperty] = js.native
  var OpaqueType: astDashTypesLib.libTypesMod.Type[OpaqueType] = js.native
  var OptionalCallExpression: astDashTypesLib.libTypesMod.Type[OptionalCallExpression] = js.native
  var OptionalMemberExpression: astDashTypesLib.libTypesMod.Type[OptionalMemberExpression] = js.native
  var ParenthesizedExpression: astDashTypesLib.libTypesMod.Type[ParenthesizedExpression] = js.native
  var Pattern: astDashTypesLib.libTypesMod.Type[Pattern] = js.native
  var Position: astDashTypesLib.libTypesMod.Type[Position] = js.native
  var Printable: astDashTypesLib.libTypesMod.Type[Printable] = js.native
  var PrivateName: astDashTypesLib.libTypesMod.Type[PrivateName] = js.native
  var Program: astDashTypesLib.libTypesMod.Type[Program] = js.native
  var Property: astDashTypesLib.libTypesMod.Type[Property] = js.native
  var PropertyPattern: astDashTypesLib.libTypesMod.Type[PropertyPattern] = js.native
  var QualifiedTypeIdentifier: astDashTypesLib.libTypesMod.Type[QualifiedTypeIdentifier] = js.native
  var RegExpLiteral: astDashTypesLib.libTypesMod.Type[RegExpLiteral] = js.native
  var RestElement: astDashTypesLib.libTypesMod.Type[RestElement] = js.native
  var RestProperty: astDashTypesLib.libTypesMod.Type[RestProperty] = js.native
  var ReturnStatement: astDashTypesLib.libTypesMod.Type[ReturnStatement] = js.native
  var SequenceExpression: astDashTypesLib.libTypesMod.Type[SequenceExpression] = js.native
  var SourceLocation: astDashTypesLib.libTypesMod.Type[SourceLocation] = js.native
  var Specifier: astDashTypesLib.libTypesMod.Type[Specifier] = js.native
  var SpreadElement: astDashTypesLib.libTypesMod.Type[SpreadElement] = js.native
  var SpreadElementPattern: astDashTypesLib.libTypesMod.Type[SpreadElementPattern] = js.native
  var SpreadProperty: astDashTypesLib.libTypesMod.Type[SpreadProperty] = js.native
  var SpreadPropertyPattern: astDashTypesLib.libTypesMod.Type[SpreadPropertyPattern] = js.native
  var Statement: astDashTypesLib.libTypesMod.Type[Statement] = js.native
  var StringLiteral: astDashTypesLib.libTypesMod.Type[StringLiteral] = js.native
  var StringLiteralTypeAnnotation: astDashTypesLib.libTypesMod.Type[StringLiteralTypeAnnotation] = js.native
  var StringTypeAnnotation: astDashTypesLib.libTypesMod.Type[StringTypeAnnotation] = js.native
  var Super: astDashTypesLib.libTypesMod.Type[Super] = js.native
  var SwitchCase: astDashTypesLib.libTypesMod.Type[SwitchCase] = js.native
  var SwitchStatement: astDashTypesLib.libTypesMod.Type[SwitchStatement] = js.native
  var TSAnyKeyword: astDashTypesLib.libTypesMod.Type[TSAnyKeyword] = js.native
  var TSArrayType: astDashTypesLib.libTypesMod.Type[TSArrayType] = js.native
  var TSAsExpression: astDashTypesLib.libTypesMod.Type[TSAsExpression] = js.native
  var TSBigIntKeyword: astDashTypesLib.libTypesMod.Type[TSBigIntKeyword] = js.native
  var TSBooleanKeyword: astDashTypesLib.libTypesMod.Type[TSBooleanKeyword] = js.native
  var TSCallSignatureDeclaration: astDashTypesLib.libTypesMod.Type[TSCallSignatureDeclaration] = js.native
  var TSConditionalType: astDashTypesLib.libTypesMod.Type[TSConditionalType] = js.native
  var TSConstructSignatureDeclaration: astDashTypesLib.libTypesMod.Type[TSConstructSignatureDeclaration] = js.native
  var TSConstructorType: astDashTypesLib.libTypesMod.Type[TSConstructorType] = js.native
  var TSDeclareFunction: astDashTypesLib.libTypesMod.Type[TSDeclareFunction] = js.native
  var TSDeclareMethod: astDashTypesLib.libTypesMod.Type[TSDeclareMethod] = js.native
  var TSEnumDeclaration: astDashTypesLib.libTypesMod.Type[TSEnumDeclaration] = js.native
  var TSEnumMember: astDashTypesLib.libTypesMod.Type[TSEnumMember] = js.native
  var TSExportAssignment: astDashTypesLib.libTypesMod.Type[TSExportAssignment] = js.native
  var TSExpressionWithTypeArguments: astDashTypesLib.libTypesMod.Type[TSExpressionWithTypeArguments] = js.native
  var TSExternalModuleReference: astDashTypesLib.libTypesMod.Type[TSExternalModuleReference] = js.native
  var TSFunctionType: astDashTypesLib.libTypesMod.Type[TSFunctionType] = js.native
  var TSHasOptionalTypeAnnotation: astDashTypesLib.libTypesMod.Type[TSHasOptionalTypeAnnotation] = js.native
  var TSHasOptionalTypeParameterInstantiation: astDashTypesLib.libTypesMod.Type[TSHasOptionalTypeParameterInstantiation] = js.native
  var TSHasOptionalTypeParameters: astDashTypesLib.libTypesMod.Type[TSHasOptionalTypeParameters] = js.native
  var TSImportEqualsDeclaration: astDashTypesLib.libTypesMod.Type[TSImportEqualsDeclaration] = js.native
  var TSImportType: astDashTypesLib.libTypesMod.Type[TSImportType] = js.native
  var TSIndexSignature: astDashTypesLib.libTypesMod.Type[TSIndexSignature] = js.native
  var TSIndexedAccessType: astDashTypesLib.libTypesMod.Type[TSIndexedAccessType] = js.native
  var TSInferType: astDashTypesLib.libTypesMod.Type[TSInferType] = js.native
  var TSInterfaceBody: astDashTypesLib.libTypesMod.Type[TSInterfaceBody] = js.native
  var TSInterfaceDeclaration: astDashTypesLib.libTypesMod.Type[TSInterfaceDeclaration] = js.native
  var TSIntersectionType: astDashTypesLib.libTypesMod.Type[TSIntersectionType] = js.native
  var TSLiteralType: astDashTypesLib.libTypesMod.Type[TSLiteralType] = js.native
  var TSMappedType: astDashTypesLib.libTypesMod.Type[TSMappedType] = js.native
  var TSMethodSignature: astDashTypesLib.libTypesMod.Type[TSMethodSignature] = js.native
  var TSModuleBlock: astDashTypesLib.libTypesMod.Type[TSModuleBlock] = js.native
  var TSModuleDeclaration: astDashTypesLib.libTypesMod.Type[TSModuleDeclaration] = js.native
  var TSNamespaceExportDeclaration: astDashTypesLib.libTypesMod.Type[TSNamespaceExportDeclaration] = js.native
  var TSNeverKeyword: astDashTypesLib.libTypesMod.Type[TSNeverKeyword] = js.native
  var TSNonNullExpression: astDashTypesLib.libTypesMod.Type[TSNonNullExpression] = js.native
  var TSNullKeyword: astDashTypesLib.libTypesMod.Type[TSNullKeyword] = js.native
  var TSNumberKeyword: astDashTypesLib.libTypesMod.Type[TSNumberKeyword] = js.native
  var TSObjectKeyword: astDashTypesLib.libTypesMod.Type[TSObjectKeyword] = js.native
  var TSOptionalType: astDashTypesLib.libTypesMod.Type[TSOptionalType] = js.native
  var TSParameterProperty: astDashTypesLib.libTypesMod.Type[TSParameterProperty] = js.native
  var TSParenthesizedType: astDashTypesLib.libTypesMod.Type[TSParenthesizedType] = js.native
  var TSPropertySignature: astDashTypesLib.libTypesMod.Type[TSPropertySignature] = js.native
  var TSQualifiedName: astDashTypesLib.libTypesMod.Type[TSQualifiedName] = js.native
  var TSRestType: astDashTypesLib.libTypesMod.Type[TSRestType] = js.native
  var TSStringKeyword: astDashTypesLib.libTypesMod.Type[TSStringKeyword] = js.native
  var TSSymbolKeyword: astDashTypesLib.libTypesMod.Type[TSSymbolKeyword] = js.native
  var TSThisType: astDashTypesLib.libTypesMod.Type[TSThisType] = js.native
  var TSTupleType: astDashTypesLib.libTypesMod.Type[TSTupleType] = js.native
  var TSType: astDashTypesLib.libTypesMod.Type[TSType] = js.native
  var TSTypeAliasDeclaration: astDashTypesLib.libTypesMod.Type[TSTypeAliasDeclaration] = js.native
  var TSTypeAnnotation: astDashTypesLib.libTypesMod.Type[TSTypeAnnotation] = js.native
  var TSTypeAssertion: astDashTypesLib.libTypesMod.Type[TSTypeAssertion] = js.native
  var TSTypeLiteral: astDashTypesLib.libTypesMod.Type[TSTypeLiteral] = js.native
  var TSTypeOperator: astDashTypesLib.libTypesMod.Type[TSTypeOperator] = js.native
  var TSTypeParameter: astDashTypesLib.libTypesMod.Type[TSTypeParameter] = js.native
  var TSTypeParameterDeclaration: astDashTypesLib.libTypesMod.Type[TSTypeParameterDeclaration] = js.native
  var TSTypeParameterInstantiation: astDashTypesLib.libTypesMod.Type[TSTypeParameterInstantiation] = js.native
  var TSTypePredicate: astDashTypesLib.libTypesMod.Type[TSTypePredicate] = js.native
  var TSTypeQuery: astDashTypesLib.libTypesMod.Type[TSTypeQuery] = js.native
  var TSTypeReference: astDashTypesLib.libTypesMod.Type[TSTypeReference] = js.native
  var TSUndefinedKeyword: astDashTypesLib.libTypesMod.Type[TSUndefinedKeyword] = js.native
  var TSUnionType: astDashTypesLib.libTypesMod.Type[TSUnionType] = js.native
  var TSUnknownKeyword: astDashTypesLib.libTypesMod.Type[TSUnknownKeyword] = js.native
  var TSVoidKeyword: astDashTypesLib.libTypesMod.Type[TSVoidKeyword] = js.native
  var TaggedTemplateExpression: astDashTypesLib.libTypesMod.Type[TaggedTemplateExpression] = js.native
  var TemplateElement: astDashTypesLib.libTypesMod.Type[TemplateElement] = js.native
  var TemplateLiteral: astDashTypesLib.libTypesMod.Type[TemplateLiteral] = js.native
  var ThisExpression: astDashTypesLib.libTypesMod.Type[ThisExpression] = js.native
  var ThisTypeAnnotation: astDashTypesLib.libTypesMod.Type[ThisTypeAnnotation] = js.native
  var ThrowStatement: astDashTypesLib.libTypesMod.Type[ThrowStatement] = js.native
  var TryStatement: astDashTypesLib.libTypesMod.Type[TryStatement] = js.native
  var TupleTypeAnnotation: astDashTypesLib.libTypesMod.Type[TupleTypeAnnotation] = js.native
  var TypeAlias: astDashTypesLib.libTypesMod.Type[TypeAlias] = js.native
  var TypeAnnotation: astDashTypesLib.libTypesMod.Type[TypeAnnotation] = js.native
  var TypeCastExpression: astDashTypesLib.libTypesMod.Type[TypeCastExpression] = js.native
  var TypeParameter: astDashTypesLib.libTypesMod.Type[TypeParameter] = js.native
  var TypeParameterDeclaration: astDashTypesLib.libTypesMod.Type[TypeParameterDeclaration] = js.native
  var TypeParameterInstantiation: astDashTypesLib.libTypesMod.Type[TypeParameterInstantiation] = js.native
  var TypeofTypeAnnotation: astDashTypesLib.libTypesMod.Type[TypeofTypeAnnotation] = js.native
  var UnaryExpression: astDashTypesLib.libTypesMod.Type[UnaryExpression] = js.native
  var UnionTypeAnnotation: astDashTypesLib.libTypesMod.Type[UnionTypeAnnotation] = js.native
  var UpdateExpression: astDashTypesLib.libTypesMod.Type[UpdateExpression] = js.native
  var VariableDeclaration: astDashTypesLib.libTypesMod.Type[VariableDeclaration] = js.native
  var VariableDeclarator: astDashTypesLib.libTypesMod.Type[VariableDeclarator] = js.native
  var Variance: astDashTypesLib.libTypesMod.Type[Variance] = js.native
  var VoidTypeAnnotation: astDashTypesLib.libTypesMod.Type[VoidTypeAnnotation] = js.native
  var WhileStatement: astDashTypesLib.libTypesMod.Type[WhileStatement] = js.native
  var WithStatement: astDashTypesLib.libTypesMod.Type[WithStatement] = js.native
  var YieldExpression: astDashTypesLib.libTypesMod.Type[YieldExpression] = js.native
  type Declaration = Statement
  type Expression = Node
  type Flow = Node
  type FlowPredicate = Flow
  type FlowType = Flow
  type Pattern = Node
  type Specifier = Node
  type Statement = Node
  type TSType = Node
}

