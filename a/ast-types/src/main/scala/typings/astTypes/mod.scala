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
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(builders, builtInTypes, defineMethod, eachField, finalize, getBuilderName, getFieldNames, getFieldValue, getSupertypeNames, NodePath, Path, PathVisitor, someField, Type, use, visit) */ object astNodesAreEquivalent {
    
    @scala.inline
    def apply(a: js.Any, b: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def apply(a: js.Any, b: js.Any, problemPath: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], problemPath.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("ast-types", "astNodesAreEquivalent")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def assert(a: js.Any, b: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object namedTypes {
    
    @JSImport("ast-types", "namedTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ast-types", "namedTypes.AnyTypeAnnotation")
    @js.native
    def AnyTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.AnyTypeAnnotation] = js.native
    @scala.inline
    def AnyTypeAnnotation_=(x: Type[AnyTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AnyTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ArrayExpression")
    @js.native
    def ArrayExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ArrayExpression] = js.native
    @scala.inline
    def ArrayExpression_=(x: Type[ArrayExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArrayExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ArrayPattern")
    @js.native
    def ArrayPattern: Type[typings.astTypes.namedTypesMod.namedTypes.ArrayPattern] = js.native
    @scala.inline
    def ArrayPattern_=(x: Type[ArrayPattern]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArrayPattern")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ArrayTypeAnnotation")
    @js.native
    def ArrayTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation] = js.native
    @scala.inline
    def ArrayTypeAnnotation_=(x: Type[ArrayTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArrayTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ArrowFunctionExpression")
    @js.native
    def ArrowFunctionExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ArrowFunctionExpression] = js.native
    @scala.inline
    def ArrowFunctionExpression_=(x: Type[ArrowFunctionExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArrowFunctionExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.AssignmentExpression")
    @js.native
    def AssignmentExpression: Type[typings.astTypes.namedTypesMod.namedTypes.AssignmentExpression] = js.native
    @scala.inline
    def AssignmentExpression_=(x: Type[AssignmentExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AssignmentExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.AssignmentPattern")
    @js.native
    def AssignmentPattern: Type[typings.astTypes.namedTypesMod.namedTypes.AssignmentPattern] = js.native
    @scala.inline
    def AssignmentPattern_=(x: Type[AssignmentPattern]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AssignmentPattern")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.AwaitExpression")
    @js.native
    def AwaitExpression: Type[typings.astTypes.namedTypesMod.namedTypes.AwaitExpression] = js.native
    @scala.inline
    def AwaitExpression_=(x: Type[AwaitExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AwaitExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.BigIntLiteral")
    @js.native
    def BigIntLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.BigIntLiteral] = js.native
    
    @JSImport("ast-types", "namedTypes.BigIntLiteralTypeAnnotation")
    @js.native
    def BigIntLiteralTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.BigIntLiteralTypeAnnotation] = js.native
    @scala.inline
    def BigIntLiteralTypeAnnotation_=(x: Type[BigIntLiteralTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BigIntLiteralTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def BigIntLiteral_=(x: Type[BigIntLiteral]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BigIntLiteral")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.BigIntTypeAnnotation")
    @js.native
    def BigIntTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.BigIntTypeAnnotation] = js.native
    @scala.inline
    def BigIntTypeAnnotation_=(x: Type[BigIntTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BigIntTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.BinaryExpression")
    @js.native
    def BinaryExpression: Type[typings.astTypes.namedTypesMod.namedTypes.BinaryExpression] = js.native
    @scala.inline
    def BinaryExpression_=(x: Type[BinaryExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BinaryExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.BindExpression")
    @js.native
    def BindExpression: Type[typings.astTypes.namedTypesMod.namedTypes.BindExpression] = js.native
    @scala.inline
    def BindExpression_=(x: Type[BindExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BindExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Block")
    @js.native
    def Block: Type[typings.astTypes.namedTypesMod.namedTypes.Block] = js.native
    
    @JSImport("ast-types", "namedTypes.BlockStatement")
    @js.native
    def BlockStatement: Type[typings.astTypes.namedTypesMod.namedTypes.BlockStatement] = js.native
    @scala.inline
    def BlockStatement_=(x: Type[BlockStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BlockStatement")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Block_=(x: Type[Block]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Block")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.BooleanLiteral")
    @js.native
    def BooleanLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.BooleanLiteral] = js.native
    
    @JSImport("ast-types", "namedTypes.BooleanLiteralTypeAnnotation")
    @js.native
    def BooleanLiteralTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.BooleanLiteralTypeAnnotation] = js.native
    @scala.inline
    def BooleanLiteralTypeAnnotation_=(x: Type[BooleanLiteralTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BooleanLiteralTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def BooleanLiteral_=(x: Type[BooleanLiteral]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BooleanLiteral")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.BooleanTypeAnnotation")
    @js.native
    def BooleanTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.BooleanTypeAnnotation] = js.native
    @scala.inline
    def BooleanTypeAnnotation_=(x: Type[BooleanTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BooleanTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.BreakStatement")
    @js.native
    def BreakStatement: Type[typings.astTypes.namedTypesMod.namedTypes.BreakStatement] = js.native
    @scala.inline
    def BreakStatement_=(x: Type[BreakStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BreakStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.CallExpression")
    @js.native
    def CallExpression: Type[typings.astTypes.namedTypesMod.namedTypes.CallExpression] = js.native
    @scala.inline
    def CallExpression_=(x: Type[CallExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CallExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.CatchClause")
    @js.native
    def CatchClause: Type[typings.astTypes.namedTypesMod.namedTypes.CatchClause] = js.native
    @scala.inline
    def CatchClause_=(x: Type[CatchClause]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CatchClause")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ChainElement")
    @js.native
    def ChainElement: Type[typings.astTypes.namedTypesMod.namedTypes.ChainElement] = js.native
    @scala.inline
    def ChainElement_=(x: Type[ChainElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ChainElement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ChainExpression")
    @js.native
    def ChainExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ChainExpression] = js.native
    @scala.inline
    def ChainExpression_=(x: Type[ChainExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ChainExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ClassBody")
    @js.native
    def ClassBody: Type[typings.astTypes.namedTypesMod.namedTypes.ClassBody] = js.native
    @scala.inline
    def ClassBody_=(x: Type[ClassBody]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClassBody")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ClassDeclaration")
    @js.native
    def ClassDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.ClassDeclaration] = js.native
    @scala.inline
    def ClassDeclaration_=(x: Type[ClassDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClassDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ClassExpression")
    @js.native
    def ClassExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ClassExpression] = js.native
    @scala.inline
    def ClassExpression_=(x: Type[ClassExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClassExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ClassImplements")
    @js.native
    def ClassImplements: Type[typings.astTypes.namedTypesMod.namedTypes.ClassImplements] = js.native
    @scala.inline
    def ClassImplements_=(x: Type[ClassImplements]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClassImplements")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ClassMethod")
    @js.native
    def ClassMethod: Type[typings.astTypes.namedTypesMod.namedTypes.ClassMethod] = js.native
    @scala.inline
    def ClassMethod_=(x: Type[ClassMethod]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClassMethod")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ClassPrivateMethod")
    @js.native
    def ClassPrivateMethod: Type[typings.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod] = js.native
    @scala.inline
    def ClassPrivateMethod_=(x: Type[ClassPrivateMethod]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClassPrivateMethod")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ClassPrivateProperty")
    @js.native
    def ClassPrivateProperty: Type[typings.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty] = js.native
    @scala.inline
    def ClassPrivateProperty_=(x: Type[ClassPrivateProperty]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClassPrivateProperty")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ClassProperty")
    @js.native
    def ClassProperty: Type[typings.astTypes.namedTypesMod.namedTypes.ClassProperty] = js.native
    
    @JSImport("ast-types", "namedTypes.ClassPropertyDefinition")
    @js.native
    def ClassPropertyDefinition: Type[typings.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition] = js.native
    @scala.inline
    def ClassPropertyDefinition_=(x: Type[ClassPropertyDefinition]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClassPropertyDefinition")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def ClassProperty_=(x: Type[ClassProperty]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClassProperty")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Comment")
    @js.native
    def Comment: Type[typings.astTypes.namedTypesMod.namedTypes.Comment] = js.native
    
    @JSImport("ast-types", "namedTypes.CommentBlock")
    @js.native
    def CommentBlock: Type[typings.astTypes.namedTypesMod.namedTypes.CommentBlock] = js.native
    @scala.inline
    def CommentBlock_=(x: Type[CommentBlock]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CommentBlock")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.CommentLine")
    @js.native
    def CommentLine: Type[typings.astTypes.namedTypesMod.namedTypes.CommentLine] = js.native
    @scala.inline
    def CommentLine_=(x: Type[CommentLine]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CommentLine")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Comment_=(x: Type[Comment]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Comment")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ComprehensionBlock")
    @js.native
    def ComprehensionBlock: Type[typings.astTypes.namedTypesMod.namedTypes.ComprehensionBlock] = js.native
    @scala.inline
    def ComprehensionBlock_=(x: Type[ComprehensionBlock]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ComprehensionBlock")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ComprehensionExpression")
    @js.native
    def ComprehensionExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ComprehensionExpression] = js.native
    @scala.inline
    def ComprehensionExpression_=(x: Type[ComprehensionExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ComprehensionExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ConditionalExpression")
    @js.native
    def ConditionalExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ConditionalExpression] = js.native
    @scala.inline
    def ConditionalExpression_=(x: Type[ConditionalExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConditionalExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ContinueStatement")
    @js.native
    def ContinueStatement: Type[typings.astTypes.namedTypesMod.namedTypes.ContinueStatement] = js.native
    @scala.inline
    def ContinueStatement_=(x: Type[ContinueStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ContinueStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.DebuggerStatement")
    @js.native
    def DebuggerStatement: Type[typings.astTypes.namedTypesMod.namedTypes.DebuggerStatement] = js.native
    @scala.inline
    def DebuggerStatement_=(x: Type[DebuggerStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DebuggerStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Declaration")
    @js.native
    def Declaration: Type[typings.astTypes.namedTypesMod.namedTypes.Declaration] = js.native
    @scala.inline
    def Declaration_=(x: Type[Declaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Declaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.DeclareClass")
    @js.native
    def DeclareClass: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareClass] = js.native
    @scala.inline
    def DeclareClass_=(x: Type[DeclareClass]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareClass")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.DeclareExportAllDeclaration")
    @js.native
    def DeclareExportAllDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareExportAllDeclaration] = js.native
    @scala.inline
    def DeclareExportAllDeclaration_=(x: Type[DeclareExportAllDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareExportAllDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.DeclareExportDeclaration")
    @js.native
    def DeclareExportDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareExportDeclaration] = js.native
    @scala.inline
    def DeclareExportDeclaration_=(x: Type[DeclareExportDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareExportDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.DeclareFunction")
    @js.native
    def DeclareFunction: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareFunction] = js.native
    @scala.inline
    def DeclareFunction_=(x: Type[DeclareFunction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareFunction")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.DeclareInterface")
    @js.native
    def DeclareInterface: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareInterface] = js.native
    @scala.inline
    def DeclareInterface_=(x: Type[DeclareInterface]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareInterface")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.DeclareModule")
    @js.native
    def DeclareModule: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareModule] = js.native
    
    @JSImport("ast-types", "namedTypes.DeclareModuleExports")
    @js.native
    def DeclareModuleExports: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareModuleExports] = js.native
    @scala.inline
    def DeclareModuleExports_=(x: Type[DeclareModuleExports]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareModuleExports")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def DeclareModule_=(x: Type[DeclareModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareModule")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.DeclareOpaqueType")
    @js.native
    def DeclareOpaqueType: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType] = js.native
    @scala.inline
    def DeclareOpaqueType_=(x: Type[DeclareOpaqueType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareOpaqueType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.DeclareTypeAlias")
    @js.native
    def DeclareTypeAlias: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias] = js.native
    @scala.inline
    def DeclareTypeAlias_=(x: Type[DeclareTypeAlias]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareTypeAlias")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.DeclareVariable")
    @js.native
    def DeclareVariable: Type[typings.astTypes.namedTypesMod.namedTypes.DeclareVariable] = js.native
    @scala.inline
    def DeclareVariable_=(x: Type[DeclareVariable]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclareVariable")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.DeclaredPredicate")
    @js.native
    def DeclaredPredicate: Type[typings.astTypes.namedTypesMod.namedTypes.DeclaredPredicate] = js.native
    @scala.inline
    def DeclaredPredicate_=(x: Type[DeclaredPredicate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DeclaredPredicate")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Decorator")
    @js.native
    def Decorator: Type[typings.astTypes.namedTypesMod.namedTypes.Decorator] = js.native
    @scala.inline
    def Decorator_=(x: Type[Decorator]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decorator")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Directive")
    @js.native
    def Directive: Type[typings.astTypes.namedTypesMod.namedTypes.Directive] = js.native
    
    @JSImport("ast-types", "namedTypes.DirectiveLiteral")
    @js.native
    def DirectiveLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.DirectiveLiteral] = js.native
    @scala.inline
    def DirectiveLiteral_=(x: Type[DirectiveLiteral]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DirectiveLiteral")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Directive_=(x: Type[Directive]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Directive")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.DoExpression")
    @js.native
    def DoExpression: Type[typings.astTypes.namedTypesMod.namedTypes.DoExpression] = js.native
    @scala.inline
    def DoExpression_=(x: Type[DoExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DoExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.DoWhileStatement")
    @js.native
    def DoWhileStatement: Type[typings.astTypes.namedTypesMod.namedTypes.DoWhileStatement] = js.native
    @scala.inline
    def DoWhileStatement_=(x: Type[DoWhileStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DoWhileStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.EmptyStatement")
    @js.native
    def EmptyStatement: Type[typings.astTypes.namedTypesMod.namedTypes.EmptyStatement] = js.native
    @scala.inline
    def EmptyStatement_=(x: Type[EmptyStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EmptyStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.EmptyTypeAnnotation")
    @js.native
    def EmptyTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.EmptyTypeAnnotation] = js.native
    @scala.inline
    def EmptyTypeAnnotation_=(x: Type[EmptyTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EmptyTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.EnumBooleanBody")
    @js.native
    def EnumBooleanBody: Type[typings.astTypes.namedTypesMod.namedTypes.EnumBooleanBody] = js.native
    @scala.inline
    def EnumBooleanBody_=(x: Type[EnumBooleanBody]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EnumBooleanBody")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.EnumBooleanMember")
    @js.native
    def EnumBooleanMember: Type[typings.astTypes.namedTypesMod.namedTypes.EnumBooleanMember] = js.native
    @scala.inline
    def EnumBooleanMember_=(x: Type[EnumBooleanMember]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EnumBooleanMember")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.EnumDeclaration")
    @js.native
    def EnumDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.EnumDeclaration] = js.native
    @scala.inline
    def EnumDeclaration_=(x: Type[EnumDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EnumDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.EnumDefaultedMember")
    @js.native
    def EnumDefaultedMember: Type[typings.astTypes.namedTypesMod.namedTypes.EnumDefaultedMember] = js.native
    @scala.inline
    def EnumDefaultedMember_=(x: Type[EnumDefaultedMember]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EnumDefaultedMember")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.EnumNumberBody")
    @js.native
    def EnumNumberBody: Type[typings.astTypes.namedTypesMod.namedTypes.EnumNumberBody] = js.native
    @scala.inline
    def EnumNumberBody_=(x: Type[EnumNumberBody]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EnumNumberBody")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.EnumNumberMember")
    @js.native
    def EnumNumberMember: Type[typings.astTypes.namedTypesMod.namedTypes.EnumNumberMember] = js.native
    @scala.inline
    def EnumNumberMember_=(x: Type[EnumNumberMember]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EnumNumberMember")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.EnumStringBody")
    @js.native
    def EnumStringBody: Type[typings.astTypes.namedTypesMod.namedTypes.EnumStringBody] = js.native
    @scala.inline
    def EnumStringBody_=(x: Type[EnumStringBody]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EnumStringBody")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.EnumStringMember")
    @js.native
    def EnumStringMember: Type[typings.astTypes.namedTypesMod.namedTypes.EnumStringMember] = js.native
    @scala.inline
    def EnumStringMember_=(x: Type[EnumStringMember]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EnumStringMember")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.EnumSymbolBody")
    @js.native
    def EnumSymbolBody: Type[typings.astTypes.namedTypesMod.namedTypes.EnumSymbolBody] = js.native
    @scala.inline
    def EnumSymbolBody_=(x: Type[EnumSymbolBody]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EnumSymbolBody")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ExistentialTypeParam")
    @js.native
    def ExistentialTypeParam: Type[typings.astTypes.namedTypesMod.namedTypes.ExistentialTypeParam] = js.native
    @scala.inline
    def ExistentialTypeParam_=(x: Type[ExistentialTypeParam]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExistentialTypeParam")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ExistsTypeAnnotation")
    @js.native
    def ExistsTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.ExistsTypeAnnotation] = js.native
    @scala.inline
    def ExistsTypeAnnotation_=(x: Type[ExistsTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExistsTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ExportAllDeclaration")
    @js.native
    def ExportAllDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.ExportAllDeclaration] = js.native
    @scala.inline
    def ExportAllDeclaration_=(x: Type[ExportAllDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExportAllDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ExportBatchSpecifier")
    @js.native
    def ExportBatchSpecifier: Type[typings.astTypes.namedTypesMod.namedTypes.ExportBatchSpecifier] = js.native
    @scala.inline
    def ExportBatchSpecifier_=(x: Type[ExportBatchSpecifier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExportBatchSpecifier")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ExportDeclaration")
    @js.native
    def ExportDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.ExportDeclaration] = js.native
    @scala.inline
    def ExportDeclaration_=(x: Type[ExportDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExportDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ExportDefaultDeclaration")
    @js.native
    def ExportDefaultDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.ExportDefaultDeclaration] = js.native
    @scala.inline
    def ExportDefaultDeclaration_=(x: Type[ExportDefaultDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExportDefaultDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ExportDefaultSpecifier")
    @js.native
    def ExportDefaultSpecifier: Type[typings.astTypes.namedTypesMod.namedTypes.ExportDefaultSpecifier] = js.native
    @scala.inline
    def ExportDefaultSpecifier_=(x: Type[ExportDefaultSpecifier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExportDefaultSpecifier")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ExportNamedDeclaration")
    @js.native
    def ExportNamedDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.ExportNamedDeclaration] = js.native
    @scala.inline
    def ExportNamedDeclaration_=(x: Type[ExportNamedDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExportNamedDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ExportNamespaceSpecifier")
    @js.native
    def ExportNamespaceSpecifier: Type[typings.astTypes.namedTypesMod.namedTypes.ExportNamespaceSpecifier] = js.native
    @scala.inline
    def ExportNamespaceSpecifier_=(x: Type[ExportNamespaceSpecifier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExportNamespaceSpecifier")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ExportSpecifier")
    @js.native
    def ExportSpecifier: Type[typings.astTypes.namedTypesMod.namedTypes.ExportSpecifier] = js.native
    @scala.inline
    def ExportSpecifier_=(x: Type[ExportSpecifier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExportSpecifier")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Expression")
    @js.native
    def Expression: Type[typings.astTypes.namedTypesMod.namedTypes.Expression] = js.native
    
    @JSImport("ast-types", "namedTypes.ExpressionStatement")
    @js.native
    def ExpressionStatement: Type[typings.astTypes.namedTypesMod.namedTypes.ExpressionStatement] = js.native
    @scala.inline
    def ExpressionStatement_=(x: Type[ExpressionStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExpressionStatement")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Expression_=(x: Type[Expression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Expression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.File")
    @js.native
    def File: Type[typings.astTypes.namedTypesMod.namedTypes.File] = js.native
    @scala.inline
    def File_=(x: Type[File]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("File")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Flow")
    @js.native
    def Flow: Type[typings.astTypes.namedTypesMod.namedTypes.Flow] = js.native
    
    @JSImport("ast-types", "namedTypes.FlowPredicate")
    @js.native
    def FlowPredicate: Type[typings.astTypes.namedTypesMod.namedTypes.FlowPredicate] = js.native
    @scala.inline
    def FlowPredicate_=(x: Type[FlowPredicate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FlowPredicate")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.FlowType")
    @js.native
    def FlowType: Type[typings.astTypes.namedTypesMod.namedTypes.FlowType] = js.native
    @scala.inline
    def FlowType_=(x: Type[FlowType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FlowType")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Flow_=(x: Type[Flow]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Flow")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ForAwaitStatement")
    @js.native
    def ForAwaitStatement: Type[typings.astTypes.namedTypesMod.namedTypes.ForAwaitStatement] = js.native
    @scala.inline
    def ForAwaitStatement_=(x: Type[ForAwaitStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ForAwaitStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ForInStatement")
    @js.native
    def ForInStatement: Type[typings.astTypes.namedTypesMod.namedTypes.ForInStatement] = js.native
    @scala.inline
    def ForInStatement_=(x: Type[ForInStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ForInStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ForOfStatement")
    @js.native
    def ForOfStatement: Type[typings.astTypes.namedTypesMod.namedTypes.ForOfStatement] = js.native
    @scala.inline
    def ForOfStatement_=(x: Type[ForOfStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ForOfStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ForStatement")
    @js.native
    def ForStatement: Type[typings.astTypes.namedTypesMod.namedTypes.ForStatement] = js.native
    @scala.inline
    def ForStatement_=(x: Type[ForStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ForStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Function")
    @js.native
    def Function: Type[typings.astTypes.namedTypesMod.namedTypes.Function] = js.native
    
    @JSImport("ast-types", "namedTypes.FunctionDeclaration")
    @js.native
    def FunctionDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.FunctionDeclaration] = js.native
    @scala.inline
    def FunctionDeclaration_=(x: Type[FunctionDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FunctionDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.FunctionExpression")
    @js.native
    def FunctionExpression: Type[typings.astTypes.namedTypesMod.namedTypes.FunctionExpression] = js.native
    @scala.inline
    def FunctionExpression_=(x: Type[FunctionExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FunctionExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.FunctionTypeAnnotation")
    @js.native
    def FunctionTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.FunctionTypeAnnotation] = js.native
    @scala.inline
    def FunctionTypeAnnotation_=(x: Type[FunctionTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FunctionTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.FunctionTypeParam")
    @js.native
    def FunctionTypeParam: Type[typings.astTypes.namedTypesMod.namedTypes.FunctionTypeParam] = js.native
    @scala.inline
    def FunctionTypeParam_=(x: Type[FunctionTypeParam]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FunctionTypeParam")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Function_=(x: Type[Function]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Function")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.GeneratorExpression")
    @js.native
    def GeneratorExpression: Type[typings.astTypes.namedTypesMod.namedTypes.GeneratorExpression] = js.native
    @scala.inline
    def GeneratorExpression_=(x: Type[GeneratorExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GeneratorExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.GenericTypeAnnotation")
    @js.native
    def GenericTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation] = js.native
    @scala.inline
    def GenericTypeAnnotation_=(x: Type[GenericTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GenericTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Identifier")
    @js.native
    def Identifier: Type[typings.astTypes.namedTypesMod.namedTypes.Identifier] = js.native
    @scala.inline
    def Identifier_=(x: Type[Identifier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Identifier")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.IfStatement")
    @js.native
    def IfStatement: Type[typings.astTypes.namedTypesMod.namedTypes.IfStatement] = js.native
    @scala.inline
    def IfStatement_=(x: Type[IfStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IfStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Import")
    @js.native
    def Import: Type[typings.astTypes.namedTypesMod.namedTypes.Import] = js.native
    
    @JSImport("ast-types", "namedTypes.ImportDeclaration")
    @js.native
    def ImportDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.ImportDeclaration] = js.native
    @scala.inline
    def ImportDeclaration_=(x: Type[ImportDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ImportDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ImportDefaultSpecifier")
    @js.native
    def ImportDefaultSpecifier: Type[typings.astTypes.namedTypesMod.namedTypes.ImportDefaultSpecifier] = js.native
    @scala.inline
    def ImportDefaultSpecifier_=(x: Type[ImportDefaultSpecifier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ImportDefaultSpecifier")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ImportExpression")
    @js.native
    def ImportExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ImportExpression] = js.native
    @scala.inline
    def ImportExpression_=(x: Type[ImportExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ImportExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ImportNamespaceSpecifier")
    @js.native
    def ImportNamespaceSpecifier: Type[typings.astTypes.namedTypesMod.namedTypes.ImportNamespaceSpecifier] = js.native
    @scala.inline
    def ImportNamespaceSpecifier_=(x: Type[ImportNamespaceSpecifier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ImportNamespaceSpecifier")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ImportSpecifier")
    @js.native
    def ImportSpecifier: Type[typings.astTypes.namedTypesMod.namedTypes.ImportSpecifier] = js.native
    @scala.inline
    def ImportSpecifier_=(x: Type[ImportSpecifier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ImportSpecifier")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Import_=(x: Type[Import]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Import")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.InferredPredicate")
    @js.native
    def InferredPredicate: Type[typings.astTypes.namedTypesMod.namedTypes.InferredPredicate] = js.native
    @scala.inline
    def InferredPredicate_=(x: Type[InferredPredicate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InferredPredicate")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.InterfaceDeclaration")
    @js.native
    def InterfaceDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration] = js.native
    @scala.inline
    def InterfaceDeclaration_=(x: Type[InterfaceDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InterfaceDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.InterfaceExtends")
    @js.native
    def InterfaceExtends: Type[typings.astTypes.namedTypesMod.namedTypes.InterfaceExtends] = js.native
    @scala.inline
    def InterfaceExtends_=(x: Type[InterfaceExtends]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InterfaceExtends")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.InterfaceTypeAnnotation")
    @js.native
    def InterfaceTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation] = js.native
    @scala.inline
    def InterfaceTypeAnnotation_=(x: Type[InterfaceTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InterfaceTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.InterpreterDirective")
    @js.native
    def InterpreterDirective: Type[typings.astTypes.namedTypesMod.namedTypes.InterpreterDirective] = js.native
    @scala.inline
    def InterpreterDirective_=(x: Type[InterpreterDirective]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InterpreterDirective")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.IntersectionTypeAnnotation")
    @js.native
    def IntersectionTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation] = js.native
    @scala.inline
    def IntersectionTypeAnnotation_=(x: Type[IntersectionTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IntersectionTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXAttribute")
    @js.native
    def JSXAttribute: Type[typings.astTypes.namedTypesMod.namedTypes.JSXAttribute] = js.native
    @scala.inline
    def JSXAttribute_=(x: Type[JSXAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXAttribute")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXClosingElement")
    @js.native
    def JSXClosingElement: Type[typings.astTypes.namedTypesMod.namedTypes.JSXClosingElement] = js.native
    @scala.inline
    def JSXClosingElement_=(x: Type[JSXClosingElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXClosingElement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXClosingFragment")
    @js.native
    def JSXClosingFragment: Type[typings.astTypes.namedTypesMod.namedTypes.JSXClosingFragment] = js.native
    @scala.inline
    def JSXClosingFragment_=(x: Type[JSXClosingFragment]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXClosingFragment")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXElement")
    @js.native
    def JSXElement: Type[typings.astTypes.namedTypesMod.namedTypes.JSXElement] = js.native
    @scala.inline
    def JSXElement_=(x: Type[JSXElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXElement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXEmptyExpression")
    @js.native
    def JSXEmptyExpression: Type[typings.astTypes.namedTypesMod.namedTypes.JSXEmptyExpression] = js.native
    @scala.inline
    def JSXEmptyExpression_=(x: Type[JSXEmptyExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXEmptyExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXExpressionContainer")
    @js.native
    def JSXExpressionContainer: Type[typings.astTypes.namedTypesMod.namedTypes.JSXExpressionContainer] = js.native
    @scala.inline
    def JSXExpressionContainer_=(x: Type[JSXExpressionContainer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXExpressionContainer")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXFragment")
    @js.native
    def JSXFragment: Type[typings.astTypes.namedTypesMod.namedTypes.JSXFragment] = js.native
    @scala.inline
    def JSXFragment_=(x: Type[JSXFragment]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXFragment")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXIdentifier")
    @js.native
    def JSXIdentifier: Type[typings.astTypes.namedTypesMod.namedTypes.JSXIdentifier] = js.native
    @scala.inline
    def JSXIdentifier_=(x: Type[JSXIdentifier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXIdentifier")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXMemberExpression")
    @js.native
    def JSXMemberExpression: Type[typings.astTypes.namedTypesMod.namedTypes.JSXMemberExpression] = js.native
    @scala.inline
    def JSXMemberExpression_=(x: Type[JSXMemberExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXMemberExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXNamespacedName")
    @js.native
    def JSXNamespacedName: Type[typings.astTypes.namedTypesMod.namedTypes.JSXNamespacedName] = js.native
    @scala.inline
    def JSXNamespacedName_=(x: Type[JSXNamespacedName]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXNamespacedName")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXOpeningElement")
    @js.native
    def JSXOpeningElement: Type[typings.astTypes.namedTypesMod.namedTypes.JSXOpeningElement] = js.native
    @scala.inline
    def JSXOpeningElement_=(x: Type[JSXOpeningElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXOpeningElement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXOpeningFragment")
    @js.native
    def JSXOpeningFragment: Type[typings.astTypes.namedTypesMod.namedTypes.JSXOpeningFragment] = js.native
    @scala.inline
    def JSXOpeningFragment_=(x: Type[JSXOpeningFragment]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXOpeningFragment")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXSpreadAttribute")
    @js.native
    def JSXSpreadAttribute: Type[typings.astTypes.namedTypesMod.namedTypes.JSXSpreadAttribute] = js.native
    @scala.inline
    def JSXSpreadAttribute_=(x: Type[JSXSpreadAttribute]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXSpreadAttribute")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXSpreadChild")
    @js.native
    def JSXSpreadChild: Type[typings.astTypes.namedTypesMod.namedTypes.JSXSpreadChild] = js.native
    @scala.inline
    def JSXSpreadChild_=(x: Type[JSXSpreadChild]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXSpreadChild")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.JSXText")
    @js.native
    def JSXText: Type[typings.astTypes.namedTypesMod.namedTypes.JSXText] = js.native
    @scala.inline
    def JSXText_=(x: Type[JSXText]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSXText")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.LabeledStatement")
    @js.native
    def LabeledStatement: Type[typings.astTypes.namedTypesMod.namedTypes.LabeledStatement] = js.native
    @scala.inline
    def LabeledStatement_=(x: Type[LabeledStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LabeledStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Line")
    @js.native
    def Line: Type[typings.astTypes.namedTypesMod.namedTypes.Line] = js.native
    @scala.inline
    def Line_=(x: Type[Line]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Line")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Literal")
    @js.native
    def Literal: Type[typings.astTypes.namedTypesMod.namedTypes.Literal] = js.native
    @scala.inline
    def Literal_=(x: Type[Literal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Literal")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.LogicalExpression")
    @js.native
    def LogicalExpression: Type[typings.astTypes.namedTypesMod.namedTypes.LogicalExpression] = js.native
    @scala.inline
    def LogicalExpression_=(x: Type[LogicalExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LogicalExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.MemberExpression")
    @js.native
    def MemberExpression: Type[typings.astTypes.namedTypesMod.namedTypes.MemberExpression] = js.native
    @scala.inline
    def MemberExpression_=(x: Type[MemberExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MemberExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.MemberTypeAnnotation")
    @js.native
    def MemberTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation] = js.native
    @scala.inline
    def MemberTypeAnnotation_=(x: Type[MemberTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MemberTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.MetaProperty")
    @js.native
    def MetaProperty: Type[typings.astTypes.namedTypesMod.namedTypes.MetaProperty] = js.native
    @scala.inline
    def MetaProperty_=(x: Type[MetaProperty]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MetaProperty")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.MethodDefinition")
    @js.native
    def MethodDefinition: Type[typings.astTypes.namedTypesMod.namedTypes.MethodDefinition] = js.native
    @scala.inline
    def MethodDefinition_=(x: Type[MethodDefinition]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MethodDefinition")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.MixedTypeAnnotation")
    @js.native
    def MixedTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.MixedTypeAnnotation] = js.native
    @scala.inline
    def MixedTypeAnnotation_=(x: Type[MixedTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MixedTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ModuleSpecifier")
    @js.native
    def ModuleSpecifier: Type[typings.astTypes.namedTypesMod.namedTypes.ModuleSpecifier] = js.native
    @scala.inline
    def ModuleSpecifier_=(x: Type[ModuleSpecifier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ModuleSpecifier")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.NewExpression")
    @js.native
    def NewExpression: Type[typings.astTypes.namedTypesMod.namedTypes.NewExpression] = js.native
    @scala.inline
    def NewExpression_=(x: Type[NewExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NewExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Node")
    @js.native
    def Node: Type[typings.astTypes.namedTypesMod.namedTypes.Node] = js.native
    @scala.inline
    def Node_=(x: Type[Node]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Node")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Noop")
    @js.native
    def Noop: Type[typings.astTypes.namedTypesMod.namedTypes.Noop] = js.native
    @scala.inline
    def Noop_=(x: Type[Noop]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Noop")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.NullLiteral")
    @js.native
    def NullLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.NullLiteral] = js.native
    
    @JSImport("ast-types", "namedTypes.NullLiteralTypeAnnotation")
    @js.native
    def NullLiteralTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.NullLiteralTypeAnnotation] = js.native
    @scala.inline
    def NullLiteralTypeAnnotation_=(x: Type[NullLiteralTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NullLiteralTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def NullLiteral_=(x: Type[NullLiteral]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NullLiteral")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.NullTypeAnnotation")
    @js.native
    def NullTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.NullTypeAnnotation] = js.native
    @scala.inline
    def NullTypeAnnotation_=(x: Type[NullTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NullTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.NullableTypeAnnotation")
    @js.native
    def NullableTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.NullableTypeAnnotation] = js.native
    @scala.inline
    def NullableTypeAnnotation_=(x: Type[NullableTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NullableTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.NumberLiteralTypeAnnotation")
    @js.native
    def NumberLiteralTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.NumberLiteralTypeAnnotation] = js.native
    @scala.inline
    def NumberLiteralTypeAnnotation_=(x: Type[NumberLiteralTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumberLiteralTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.NumberTypeAnnotation")
    @js.native
    def NumberTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.NumberTypeAnnotation] = js.native
    @scala.inline
    def NumberTypeAnnotation_=(x: Type[NumberTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumberTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.NumericLiteral")
    @js.native
    def NumericLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.NumericLiteral] = js.native
    
    @JSImport("ast-types", "namedTypes.NumericLiteralTypeAnnotation")
    @js.native
    def NumericLiteralTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.NumericLiteralTypeAnnotation] = js.native
    @scala.inline
    def NumericLiteralTypeAnnotation_=(x: Type[NumericLiteralTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumericLiteralTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def NumericLiteral_=(x: Type[NumericLiteral]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumericLiteral")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ObjectExpression")
    @js.native
    def ObjectExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectExpression] = js.native
    @scala.inline
    def ObjectExpression_=(x: Type[ObjectExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ObjectMethod")
    @js.native
    def ObjectMethod: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectMethod] = js.native
    @scala.inline
    def ObjectMethod_=(x: Type[ObjectMethod]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectMethod")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ObjectPattern")
    @js.native
    def ObjectPattern: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectPattern] = js.native
    @scala.inline
    def ObjectPattern_=(x: Type[ObjectPattern]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectPattern")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ObjectProperty")
    @js.native
    def ObjectProperty: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectProperty] = js.native
    @scala.inline
    def ObjectProperty_=(x: Type[ObjectProperty]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectProperty")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ObjectTypeAnnotation")
    @js.native
    def ObjectTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectTypeAnnotation] = js.native
    @scala.inline
    def ObjectTypeAnnotation_=(x: Type[ObjectTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ObjectTypeCallProperty")
    @js.native
    def ObjectTypeCallProperty: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectTypeCallProperty] = js.native
    @scala.inline
    def ObjectTypeCallProperty_=(x: Type[ObjectTypeCallProperty]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeCallProperty")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ObjectTypeIndexer")
    @js.native
    def ObjectTypeIndexer: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectTypeIndexer] = js.native
    @scala.inline
    def ObjectTypeIndexer_=(x: Type[ObjectTypeIndexer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeIndexer")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ObjectTypeInternalSlot")
    @js.native
    def ObjectTypeInternalSlot: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectTypeInternalSlot] = js.native
    @scala.inline
    def ObjectTypeInternalSlot_=(x: Type[ObjectTypeInternalSlot]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeInternalSlot")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ObjectTypeProperty")
    @js.native
    def ObjectTypeProperty: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectTypeProperty] = js.native
    @scala.inline
    def ObjectTypeProperty_=(x: Type[ObjectTypeProperty]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeProperty")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ObjectTypeSpreadProperty")
    @js.native
    def ObjectTypeSpreadProperty: Type[typings.astTypes.namedTypesMod.namedTypes.ObjectTypeSpreadProperty] = js.native
    @scala.inline
    def ObjectTypeSpreadProperty_=(x: Type[ObjectTypeSpreadProperty]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectTypeSpreadProperty")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.OpaqueType")
    @js.native
    def OpaqueType: Type[typings.astTypes.namedTypesMod.namedTypes.OpaqueType] = js.native
    @scala.inline
    def OpaqueType_=(x: Type[OpaqueType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OpaqueType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.OptionalCallExpression")
    @js.native
    def OptionalCallExpression: Type[typings.astTypes.namedTypesMod.namedTypes.OptionalCallExpression] = js.native
    @scala.inline
    def OptionalCallExpression_=(x: Type[OptionalCallExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OptionalCallExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.OptionalMemberExpression")
    @js.native
    def OptionalMemberExpression: Type[typings.astTypes.namedTypesMod.namedTypes.OptionalMemberExpression] = js.native
    @scala.inline
    def OptionalMemberExpression_=(x: Type[OptionalMemberExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OptionalMemberExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ParenthesizedExpression")
    @js.native
    def ParenthesizedExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ParenthesizedExpression] = js.native
    @scala.inline
    def ParenthesizedExpression_=(x: Type[ParenthesizedExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ParenthesizedExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Pattern")
    @js.native
    def Pattern: Type[typings.astTypes.namedTypesMod.namedTypes.Pattern] = js.native
    @scala.inline
    def Pattern_=(x: Type[Pattern]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pattern")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Position")
    @js.native
    def Position: Type[typings.astTypes.namedTypesMod.namedTypes.Position] = js.native
    @scala.inline
    def Position_=(x: Type[Position]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Position")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Printable")
    @js.native
    def Printable: Type[typings.astTypes.namedTypesMod.namedTypes.Printable] = js.native
    @scala.inline
    def Printable_=(x: Type[Printable]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Printable")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.PrivateName")
    @js.native
    def PrivateName: Type[typings.astTypes.namedTypesMod.namedTypes.PrivateName] = js.native
    @scala.inline
    def PrivateName_=(x: Type[PrivateName]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PrivateName")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Program")
    @js.native
    def Program: Type[typings.astTypes.namedTypesMod.namedTypes.Program] = js.native
    @scala.inline
    def Program_=(x: Type[Program]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Program")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Property")
    @js.native
    def Property: Type[typings.astTypes.namedTypesMod.namedTypes.Property] = js.native
    
    @JSImport("ast-types", "namedTypes.PropertyPattern")
    @js.native
    def PropertyPattern: Type[typings.astTypes.namedTypesMod.namedTypes.PropertyPattern] = js.native
    @scala.inline
    def PropertyPattern_=(x: Type[PropertyPattern]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PropertyPattern")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Property_=(x: Type[Property]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Property")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.QualifiedTypeIdentifier")
    @js.native
    def QualifiedTypeIdentifier: Type[typings.astTypes.namedTypesMod.namedTypes.QualifiedTypeIdentifier] = js.native
    @scala.inline
    def QualifiedTypeIdentifier_=(x: Type[QualifiedTypeIdentifier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QualifiedTypeIdentifier")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.RegExpLiteral")
    @js.native
    def RegExpLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.RegExpLiteral] = js.native
    @scala.inline
    def RegExpLiteral_=(x: Type[RegExpLiteral]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RegExpLiteral")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.RestElement")
    @js.native
    def RestElement: Type[typings.astTypes.namedTypesMod.namedTypes.RestElement] = js.native
    @scala.inline
    def RestElement_=(x: Type[RestElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RestElement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.RestProperty")
    @js.native
    def RestProperty: Type[typings.astTypes.namedTypesMod.namedTypes.RestProperty] = js.native
    @scala.inline
    def RestProperty_=(x: Type[RestProperty]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RestProperty")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ReturnStatement")
    @js.native
    def ReturnStatement: Type[typings.astTypes.namedTypesMod.namedTypes.ReturnStatement] = js.native
    @scala.inline
    def ReturnStatement_=(x: Type[ReturnStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReturnStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.SequenceExpression")
    @js.native
    def SequenceExpression: Type[typings.astTypes.namedTypesMod.namedTypes.SequenceExpression] = js.native
    @scala.inline
    def SequenceExpression_=(x: Type[SequenceExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SequenceExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.SourceLocation")
    @js.native
    def SourceLocation: Type[typings.astTypes.namedTypesMod.namedTypes.SourceLocation] = js.native
    @scala.inline
    def SourceLocation_=(x: Type[SourceLocation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SourceLocation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Specifier")
    @js.native
    def Specifier: Type[typings.astTypes.namedTypesMod.namedTypes.Specifier] = js.native
    @scala.inline
    def Specifier_=(x: Type[Specifier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Specifier")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.SpreadElement")
    @js.native
    def SpreadElement: Type[typings.astTypes.namedTypesMod.namedTypes.SpreadElement] = js.native
    
    @JSImport("ast-types", "namedTypes.SpreadElementPattern")
    @js.native
    def SpreadElementPattern: Type[typings.astTypes.namedTypesMod.namedTypes.SpreadElementPattern] = js.native
    @scala.inline
    def SpreadElementPattern_=(x: Type[SpreadElementPattern]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SpreadElementPattern")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def SpreadElement_=(x: Type[SpreadElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SpreadElement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.SpreadProperty")
    @js.native
    def SpreadProperty: Type[typings.astTypes.namedTypesMod.namedTypes.SpreadProperty] = js.native
    
    @JSImport("ast-types", "namedTypes.SpreadPropertyPattern")
    @js.native
    def SpreadPropertyPattern: Type[typings.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern] = js.native
    @scala.inline
    def SpreadPropertyPattern_=(x: Type[SpreadPropertyPattern]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SpreadPropertyPattern")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def SpreadProperty_=(x: Type[SpreadProperty]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SpreadProperty")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Statement")
    @js.native
    def Statement: Type[typings.astTypes.namedTypesMod.namedTypes.Statement] = js.native
    @scala.inline
    def Statement_=(x: Type[Statement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Statement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.StringLiteral")
    @js.native
    def StringLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.StringLiteral] = js.native
    
    @JSImport("ast-types", "namedTypes.StringLiteralTypeAnnotation")
    @js.native
    def StringLiteralTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.StringLiteralTypeAnnotation] = js.native
    @scala.inline
    def StringLiteralTypeAnnotation_=(x: Type[StringLiteralTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StringLiteralTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def StringLiteral_=(x: Type[StringLiteral]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StringLiteral")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.StringTypeAnnotation")
    @js.native
    def StringTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.StringTypeAnnotation] = js.native
    @scala.inline
    def StringTypeAnnotation_=(x: Type[StringTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StringTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Super")
    @js.native
    def Super: Type[typings.astTypes.namedTypesMod.namedTypes.Super] = js.native
    @scala.inline
    def Super_=(x: Type[Super]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Super")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.SwitchCase")
    @js.native
    def SwitchCase: Type[typings.astTypes.namedTypesMod.namedTypes.SwitchCase] = js.native
    @scala.inline
    def SwitchCase_=(x: Type[SwitchCase]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SwitchCase")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.SwitchStatement")
    @js.native
    def SwitchStatement: Type[typings.astTypes.namedTypesMod.namedTypes.SwitchStatement] = js.native
    @scala.inline
    def SwitchStatement_=(x: Type[SwitchStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SwitchStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.SymbolTypeAnnotation")
    @js.native
    def SymbolTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.SymbolTypeAnnotation] = js.native
    @scala.inline
    def SymbolTypeAnnotation_=(x: Type[SymbolTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SymbolTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSAnyKeyword")
    @js.native
    def TSAnyKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSAnyKeyword] = js.native
    @scala.inline
    def TSAnyKeyword_=(x: Type[TSAnyKeyword]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSAnyKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSArrayType")
    @js.native
    def TSArrayType: Type[typings.astTypes.namedTypesMod.namedTypes.TSArrayType] = js.native
    @scala.inline
    def TSArrayType_=(x: Type[TSArrayType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSArrayType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSAsExpression")
    @js.native
    def TSAsExpression: Type[typings.astTypes.namedTypesMod.namedTypes.TSAsExpression] = js.native
    @scala.inline
    def TSAsExpression_=(x: Type[TSAsExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSAsExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSBigIntKeyword")
    @js.native
    def TSBigIntKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSBigIntKeyword] = js.native
    @scala.inline
    def TSBigIntKeyword_=(x: Type[TSBigIntKeyword]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSBigIntKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSBooleanKeyword")
    @js.native
    def TSBooleanKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSBooleanKeyword] = js.native
    @scala.inline
    def TSBooleanKeyword_=(x: Type[TSBooleanKeyword]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSBooleanKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSCallSignatureDeclaration")
    @js.native
    def TSCallSignatureDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSCallSignatureDeclaration] = js.native
    @scala.inline
    def TSCallSignatureDeclaration_=(x: Type[TSCallSignatureDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSCallSignatureDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSConditionalType")
    @js.native
    def TSConditionalType: Type[typings.astTypes.namedTypesMod.namedTypes.TSConditionalType] = js.native
    @scala.inline
    def TSConditionalType_=(x: Type[TSConditionalType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSConditionalType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSConstructSignatureDeclaration")
    @js.native
    def TSConstructSignatureDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSConstructSignatureDeclaration] = js.native
    @scala.inline
    def TSConstructSignatureDeclaration_=(x: Type[TSConstructSignatureDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSConstructSignatureDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSConstructorType")
    @js.native
    def TSConstructorType: Type[typings.astTypes.namedTypesMod.namedTypes.TSConstructorType] = js.native
    @scala.inline
    def TSConstructorType_=(x: Type[TSConstructorType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSConstructorType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSDeclareFunction")
    @js.native
    def TSDeclareFunction: Type[typings.astTypes.namedTypesMod.namedTypes.TSDeclareFunction] = js.native
    @scala.inline
    def TSDeclareFunction_=(x: Type[TSDeclareFunction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSDeclareFunction")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSDeclareMethod")
    @js.native
    def TSDeclareMethod: Type[typings.astTypes.namedTypesMod.namedTypes.TSDeclareMethod] = js.native
    @scala.inline
    def TSDeclareMethod_=(x: Type[TSDeclareMethod]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSDeclareMethod")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSEnumDeclaration")
    @js.native
    def TSEnumDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSEnumDeclaration] = js.native
    @scala.inline
    def TSEnumDeclaration_=(x: Type[TSEnumDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSEnumDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSEnumMember")
    @js.native
    def TSEnumMember: Type[typings.astTypes.namedTypesMod.namedTypes.TSEnumMember] = js.native
    @scala.inline
    def TSEnumMember_=(x: Type[TSEnumMember]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSEnumMember")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSExportAssignment")
    @js.native
    def TSExportAssignment: Type[typings.astTypes.namedTypesMod.namedTypes.TSExportAssignment] = js.native
    @scala.inline
    def TSExportAssignment_=(x: Type[TSExportAssignment]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSExportAssignment")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSExpressionWithTypeArguments")
    @js.native
    def TSExpressionWithTypeArguments: Type[typings.astTypes.namedTypesMod.namedTypes.TSExpressionWithTypeArguments] = js.native
    @scala.inline
    def TSExpressionWithTypeArguments_=(x: Type[TSExpressionWithTypeArguments]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSExpressionWithTypeArguments")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSExternalModuleReference")
    @js.native
    def TSExternalModuleReference: Type[typings.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference] = js.native
    @scala.inline
    def TSExternalModuleReference_=(x: Type[TSExternalModuleReference]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSExternalModuleReference")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSFunctionType")
    @js.native
    def TSFunctionType: Type[typings.astTypes.namedTypesMod.namedTypes.TSFunctionType] = js.native
    @scala.inline
    def TSFunctionType_=(x: Type[TSFunctionType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSFunctionType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSHasOptionalTypeAnnotation")
    @js.native
    def TSHasOptionalTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeAnnotation] = js.native
    @scala.inline
    def TSHasOptionalTypeAnnotation_=(x: Type[TSHasOptionalTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSHasOptionalTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSHasOptionalTypeParameterInstantiation")
    @js.native
    def TSHasOptionalTypeParameterInstantiation: Type[
        typings.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeParameterInstantiation
      ] = js.native
    @scala.inline
    def TSHasOptionalTypeParameterInstantiation_=(x: Type[TSHasOptionalTypeParameterInstantiation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSHasOptionalTypeParameterInstantiation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSHasOptionalTypeParameters")
    @js.native
    def TSHasOptionalTypeParameters: Type[typings.astTypes.namedTypesMod.namedTypes.TSHasOptionalTypeParameters] = js.native
    @scala.inline
    def TSHasOptionalTypeParameters_=(x: Type[TSHasOptionalTypeParameters]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSHasOptionalTypeParameters")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSImportEqualsDeclaration")
    @js.native
    def TSImportEqualsDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration] = js.native
    @scala.inline
    def TSImportEqualsDeclaration_=(x: Type[TSImportEqualsDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSImportEqualsDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSImportType")
    @js.native
    def TSImportType: Type[typings.astTypes.namedTypesMod.namedTypes.TSImportType] = js.native
    @scala.inline
    def TSImportType_=(x: Type[TSImportType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSImportType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSIndexSignature")
    @js.native
    def TSIndexSignature: Type[typings.astTypes.namedTypesMod.namedTypes.TSIndexSignature] = js.native
    @scala.inline
    def TSIndexSignature_=(x: Type[TSIndexSignature]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSIndexSignature")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSIndexedAccessType")
    @js.native
    def TSIndexedAccessType: Type[typings.astTypes.namedTypesMod.namedTypes.TSIndexedAccessType] = js.native
    @scala.inline
    def TSIndexedAccessType_=(x: Type[TSIndexedAccessType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSIndexedAccessType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSInferType")
    @js.native
    def TSInferType: Type[typings.astTypes.namedTypesMod.namedTypes.TSInferType] = js.native
    @scala.inline
    def TSInferType_=(x: Type[TSInferType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSInferType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSInterfaceBody")
    @js.native
    def TSInterfaceBody: Type[typings.astTypes.namedTypesMod.namedTypes.TSInterfaceBody] = js.native
    @scala.inline
    def TSInterfaceBody_=(x: Type[TSInterfaceBody]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSInterfaceBody")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSInterfaceDeclaration")
    @js.native
    def TSInterfaceDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSInterfaceDeclaration] = js.native
    @scala.inline
    def TSInterfaceDeclaration_=(x: Type[TSInterfaceDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSInterfaceDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSIntersectionType")
    @js.native
    def TSIntersectionType: Type[typings.astTypes.namedTypesMod.namedTypes.TSIntersectionType] = js.native
    @scala.inline
    def TSIntersectionType_=(x: Type[TSIntersectionType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSIntersectionType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSLiteralType")
    @js.native
    def TSLiteralType: Type[typings.astTypes.namedTypesMod.namedTypes.TSLiteralType] = js.native
    @scala.inline
    def TSLiteralType_=(x: Type[TSLiteralType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSLiteralType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSMappedType")
    @js.native
    def TSMappedType: Type[typings.astTypes.namedTypesMod.namedTypes.TSMappedType] = js.native
    @scala.inline
    def TSMappedType_=(x: Type[TSMappedType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSMappedType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSMethodSignature")
    @js.native
    def TSMethodSignature: Type[typings.astTypes.namedTypesMod.namedTypes.TSMethodSignature] = js.native
    @scala.inline
    def TSMethodSignature_=(x: Type[TSMethodSignature]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSMethodSignature")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSModuleBlock")
    @js.native
    def TSModuleBlock: Type[typings.astTypes.namedTypesMod.namedTypes.TSModuleBlock] = js.native
    @scala.inline
    def TSModuleBlock_=(x: Type[TSModuleBlock]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSModuleBlock")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSModuleDeclaration")
    @js.native
    def TSModuleDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSModuleDeclaration] = js.native
    @scala.inline
    def TSModuleDeclaration_=(x: Type[TSModuleDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSModuleDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSNamedTupleMember")
    @js.native
    def TSNamedTupleMember: Type[typings.astTypes.namedTypesMod.namedTypes.TSNamedTupleMember] = js.native
    @scala.inline
    def TSNamedTupleMember_=(x: Type[TSNamedTupleMember]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSNamedTupleMember")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSNamespaceExportDeclaration")
    @js.native
    def TSNamespaceExportDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSNamespaceExportDeclaration] = js.native
    @scala.inline
    def TSNamespaceExportDeclaration_=(x: Type[TSNamespaceExportDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSNamespaceExportDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSNeverKeyword")
    @js.native
    def TSNeverKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSNeverKeyword] = js.native
    @scala.inline
    def TSNeverKeyword_=(x: Type[TSNeverKeyword]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSNeverKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSNonNullExpression")
    @js.native
    def TSNonNullExpression: Type[typings.astTypes.namedTypesMod.namedTypes.TSNonNullExpression] = js.native
    @scala.inline
    def TSNonNullExpression_=(x: Type[TSNonNullExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSNonNullExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSNullKeyword")
    @js.native
    def TSNullKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSNullKeyword] = js.native
    @scala.inline
    def TSNullKeyword_=(x: Type[TSNullKeyword]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSNullKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSNumberKeyword")
    @js.native
    def TSNumberKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSNumberKeyword] = js.native
    @scala.inline
    def TSNumberKeyword_=(x: Type[TSNumberKeyword]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSNumberKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSObjectKeyword")
    @js.native
    def TSObjectKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSObjectKeyword] = js.native
    @scala.inline
    def TSObjectKeyword_=(x: Type[TSObjectKeyword]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSObjectKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSOptionalType")
    @js.native
    def TSOptionalType: Type[typings.astTypes.namedTypesMod.namedTypes.TSOptionalType] = js.native
    @scala.inline
    def TSOptionalType_=(x: Type[TSOptionalType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSOptionalType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSParameterProperty")
    @js.native
    def TSParameterProperty: Type[typings.astTypes.namedTypesMod.namedTypes.TSParameterProperty] = js.native
    @scala.inline
    def TSParameterProperty_=(x: Type[TSParameterProperty]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSParameterProperty")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSParenthesizedType")
    @js.native
    def TSParenthesizedType: Type[typings.astTypes.namedTypesMod.namedTypes.TSParenthesizedType] = js.native
    @scala.inline
    def TSParenthesizedType_=(x: Type[TSParenthesizedType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSParenthesizedType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSPropertySignature")
    @js.native
    def TSPropertySignature: Type[typings.astTypes.namedTypesMod.namedTypes.TSPropertySignature] = js.native
    @scala.inline
    def TSPropertySignature_=(x: Type[TSPropertySignature]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSPropertySignature")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSQualifiedName")
    @js.native
    def TSQualifiedName: Type[typings.astTypes.namedTypesMod.namedTypes.TSQualifiedName] = js.native
    @scala.inline
    def TSQualifiedName_=(x: Type[TSQualifiedName]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSQualifiedName")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSRestType")
    @js.native
    def TSRestType: Type[typings.astTypes.namedTypesMod.namedTypes.TSRestType] = js.native
    @scala.inline
    def TSRestType_=(x: Type[TSRestType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSRestType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSStringKeyword")
    @js.native
    def TSStringKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSStringKeyword] = js.native
    @scala.inline
    def TSStringKeyword_=(x: Type[TSStringKeyword]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSStringKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSSymbolKeyword")
    @js.native
    def TSSymbolKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSSymbolKeyword] = js.native
    @scala.inline
    def TSSymbolKeyword_=(x: Type[TSSymbolKeyword]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSSymbolKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSThisType")
    @js.native
    def TSThisType: Type[typings.astTypes.namedTypesMod.namedTypes.TSThisType] = js.native
    @scala.inline
    def TSThisType_=(x: Type[TSThisType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSThisType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSTupleType")
    @js.native
    def TSTupleType: Type[typings.astTypes.namedTypesMod.namedTypes.TSTupleType] = js.native
    @scala.inline
    def TSTupleType_=(x: Type[TSTupleType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSTupleType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSType")
    @js.native
    def TSType: Type[typings.astTypes.namedTypesMod.namedTypes.TSType] = js.native
    
    @JSImport("ast-types", "namedTypes.TSTypeAliasDeclaration")
    @js.native
    def TSTypeAliasDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeAliasDeclaration] = js.native
    @scala.inline
    def TSTypeAliasDeclaration_=(x: Type[TSTypeAliasDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSTypeAliasDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSTypeAnnotation")
    @js.native
    def TSTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeAnnotation] = js.native
    @scala.inline
    def TSTypeAnnotation_=(x: Type[TSTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSTypeAssertion")
    @js.native
    def TSTypeAssertion: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeAssertion] = js.native
    @scala.inline
    def TSTypeAssertion_=(x: Type[TSTypeAssertion]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSTypeAssertion")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSTypeLiteral")
    @js.native
    def TSTypeLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeLiteral] = js.native
    @scala.inline
    def TSTypeLiteral_=(x: Type[TSTypeLiteral]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSTypeLiteral")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSTypeOperator")
    @js.native
    def TSTypeOperator: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeOperator] = js.native
    @scala.inline
    def TSTypeOperator_=(x: Type[TSTypeOperator]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSTypeOperator")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSTypeParameter")
    @js.native
    def TSTypeParameter: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeParameter] = js.native
    
    @JSImport("ast-types", "namedTypes.TSTypeParameterDeclaration")
    @js.native
    def TSTypeParameterDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeParameterDeclaration] = js.native
    @scala.inline
    def TSTypeParameterDeclaration_=(x: Type[TSTypeParameterDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSTypeParameterDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSTypeParameterInstantiation")
    @js.native
    def TSTypeParameterInstantiation: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeParameterInstantiation] = js.native
    @scala.inline
    def TSTypeParameterInstantiation_=(x: Type[TSTypeParameterInstantiation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSTypeParameterInstantiation")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def TSTypeParameter_=(x: Type[TSTypeParameter]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSTypeParameter")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSTypePredicate")
    @js.native
    def TSTypePredicate: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypePredicate] = js.native
    @scala.inline
    def TSTypePredicate_=(x: Type[TSTypePredicate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSTypePredicate")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSTypeQuery")
    @js.native
    def TSTypeQuery: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeQuery] = js.native
    @scala.inline
    def TSTypeQuery_=(x: Type[TSTypeQuery]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSTypeQuery")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSTypeReference")
    @js.native
    def TSTypeReference: Type[typings.astTypes.namedTypesMod.namedTypes.TSTypeReference] = js.native
    @scala.inline
    def TSTypeReference_=(x: Type[TSTypeReference]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSTypeReference")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def TSType_=(x: Type[TSType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSUndefinedKeyword")
    @js.native
    def TSUndefinedKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSUndefinedKeyword] = js.native
    @scala.inline
    def TSUndefinedKeyword_=(x: Type[TSUndefinedKeyword]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSUndefinedKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSUnionType")
    @js.native
    def TSUnionType: Type[typings.astTypes.namedTypesMod.namedTypes.TSUnionType] = js.native
    @scala.inline
    def TSUnionType_=(x: Type[TSUnionType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSUnionType")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSUnknownKeyword")
    @js.native
    def TSUnknownKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSUnknownKeyword] = js.native
    @scala.inline
    def TSUnknownKeyword_=(x: Type[TSUnknownKeyword]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSUnknownKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TSVoidKeyword")
    @js.native
    def TSVoidKeyword: Type[typings.astTypes.namedTypesMod.namedTypes.TSVoidKeyword] = js.native
    @scala.inline
    def TSVoidKeyword_=(x: Type[TSVoidKeyword]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSVoidKeyword")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TaggedTemplateExpression")
    @js.native
    def TaggedTemplateExpression: Type[typings.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression] = js.native
    @scala.inline
    def TaggedTemplateExpression_=(x: Type[TaggedTemplateExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TaggedTemplateExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TemplateElement")
    @js.native
    def TemplateElement: Type[typings.astTypes.namedTypesMod.namedTypes.TemplateElement] = js.native
    @scala.inline
    def TemplateElement_=(x: Type[TemplateElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TemplateElement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TemplateLiteral")
    @js.native
    def TemplateLiteral: Type[typings.astTypes.namedTypesMod.namedTypes.TemplateLiteral] = js.native
    @scala.inline
    def TemplateLiteral_=(x: Type[TemplateLiteral]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TemplateLiteral")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ThisExpression")
    @js.native
    def ThisExpression: Type[typings.astTypes.namedTypesMod.namedTypes.ThisExpression] = js.native
    @scala.inline
    def ThisExpression_=(x: Type[ThisExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ThisExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ThisTypeAnnotation")
    @js.native
    def ThisTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.ThisTypeAnnotation] = js.native
    @scala.inline
    def ThisTypeAnnotation_=(x: Type[ThisTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ThisTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.ThrowStatement")
    @js.native
    def ThrowStatement: Type[typings.astTypes.namedTypesMod.namedTypes.ThrowStatement] = js.native
    @scala.inline
    def ThrowStatement_=(x: Type[ThrowStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ThrowStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TryStatement")
    @js.native
    def TryStatement: Type[typings.astTypes.namedTypesMod.namedTypes.TryStatement] = js.native
    @scala.inline
    def TryStatement_=(x: Type[TryStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TryStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TupleTypeAnnotation")
    @js.native
    def TupleTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation] = js.native
    @scala.inline
    def TupleTypeAnnotation_=(x: Type[TupleTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TupleTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TypeAlias")
    @js.native
    def TypeAlias: Type[typings.astTypes.namedTypesMod.namedTypes.TypeAlias] = js.native
    @scala.inline
    def TypeAlias_=(x: Type[TypeAlias]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TypeAlias")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TypeAnnotation")
    @js.native
    def TypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.TypeAnnotation] = js.native
    @scala.inline
    def TypeAnnotation_=(x: Type[TypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TypeCastExpression")
    @js.native
    def TypeCastExpression: Type[typings.astTypes.namedTypesMod.namedTypes.TypeCastExpression] = js.native
    @scala.inline
    def TypeCastExpression_=(x: Type[TypeCastExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TypeCastExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TypeParameter")
    @js.native
    def TypeParameter: Type[typings.astTypes.namedTypesMod.namedTypes.TypeParameter] = js.native
    
    @JSImport("ast-types", "namedTypes.TypeParameterDeclaration")
    @js.native
    def TypeParameterDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.TypeParameterDeclaration] = js.native
    @scala.inline
    def TypeParameterDeclaration_=(x: Type[TypeParameterDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TypeParameterDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TypeParameterInstantiation")
    @js.native
    def TypeParameterInstantiation: Type[typings.astTypes.namedTypesMod.namedTypes.TypeParameterInstantiation] = js.native
    @scala.inline
    def TypeParameterInstantiation_=(x: Type[TypeParameterInstantiation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TypeParameterInstantiation")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def TypeParameter_=(x: Type[TypeParameter]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TypeParameter")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.TypeofTypeAnnotation")
    @js.native
    def TypeofTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.TypeofTypeAnnotation] = js.native
    @scala.inline
    def TypeofTypeAnnotation_=(x: Type[TypeofTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TypeofTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.UnaryExpression")
    @js.native
    def UnaryExpression: Type[typings.astTypes.namedTypesMod.namedTypes.UnaryExpression] = js.native
    @scala.inline
    def UnaryExpression_=(x: Type[UnaryExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.UnionTypeAnnotation")
    @js.native
    def UnionTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.UnionTypeAnnotation] = js.native
    @scala.inline
    def UnionTypeAnnotation_=(x: Type[UnionTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnionTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.UpdateExpression")
    @js.native
    def UpdateExpression: Type[typings.astTypes.namedTypesMod.namedTypes.UpdateExpression] = js.native
    @scala.inline
    def UpdateExpression_=(x: Type[UpdateExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UpdateExpression")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.VariableDeclaration")
    @js.native
    def VariableDeclaration: Type[typings.astTypes.namedTypesMod.namedTypes.VariableDeclaration] = js.native
    @scala.inline
    def VariableDeclaration_=(x: Type[VariableDeclaration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VariableDeclaration")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.VariableDeclarator")
    @js.native
    def VariableDeclarator: Type[typings.astTypes.namedTypesMod.namedTypes.VariableDeclarator] = js.native
    @scala.inline
    def VariableDeclarator_=(x: Type[VariableDeclarator]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VariableDeclarator")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.Variance")
    @js.native
    def Variance: Type[typings.astTypes.namedTypesMod.namedTypes.Variance] = js.native
    @scala.inline
    def Variance_=(x: Type[Variance]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Variance")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.VoidTypeAnnotation")
    @js.native
    def VoidTypeAnnotation: Type[typings.astTypes.namedTypesMod.namedTypes.VoidTypeAnnotation] = js.native
    @scala.inline
    def VoidTypeAnnotation_=(x: Type[VoidTypeAnnotation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VoidTypeAnnotation")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.WhileStatement")
    @js.native
    def WhileStatement: Type[typings.astTypes.namedTypesMod.namedTypes.WhileStatement] = js.native
    @scala.inline
    def WhileStatement_=(x: Type[WhileStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WhileStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.WithStatement")
    @js.native
    def WithStatement: Type[typings.astTypes.namedTypesMod.namedTypes.WithStatement] = js.native
    @scala.inline
    def WithStatement_=(x: Type[WithStatement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WithStatement")(x.asInstanceOf[js.Any])
    
    @JSImport("ast-types", "namedTypes.YieldExpression")
    @js.native
    def YieldExpression: Type[typings.astTypes.namedTypesMod.namedTypes.YieldExpression] = js.native
    @scala.inline
    def YieldExpression_=(x: Type[YieldExpression]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YieldExpression")(x.asInstanceOf[js.Any])
  }
}
