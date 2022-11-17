package typings.angularCompiler.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.anon.Key
import typings.angularCompiler.anon.TagName
import typings.angularCompiler.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def CUSTOM_ELEMENTS_SCHEMA: SchemaMetadata = ^.asInstanceOf[js.Dynamic].selectDynamic("CUSTOM_ELEMENTS_SCHEMA").asInstanceOf[SchemaMetadata]

inline def DEFAULT_INTERPOLATION_CONFIG: InterpolationConfig = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_INTERPOLATION_CONFIG").asInstanceOf[InterpolationConfig]

inline def DYNAMIC_TYPE: BuiltinType = ^.asInstanceOf[js.Dynamic].selectDynamic("DYNAMIC_TYPE").asInstanceOf[BuiltinType]

inline def EOF: Token = ^.asInstanceOf[js.Dynamic].selectDynamic("EOF").asInstanceOf[Token]

inline def NONE_TYPE: BuiltinType = ^.asInstanceOf[js.Dynamic].selectDynamic("NONE_TYPE").asInstanceOf[BuiltinType]

inline def NO_ERRORS_SCHEMA: SchemaMetadata = ^.asInstanceOf[js.Dynamic].selectDynamic("NO_ERRORS_SCHEMA").asInstanceOf[SchemaMetadata]

inline def STRING_TYPE: BuiltinType = ^.asInstanceOf[js.Dynamic].selectDynamic("STRING_TYPE").asInstanceOf[BuiltinType]

inline def VERSION_ : Version = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[Version]

inline def compileClassMetadata(metadata: R3ClassMetadata): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("compileClassMetadata")(metadata.asInstanceOf[js.Any]).asInstanceOf[Expression]

inline def compileComponentFromMetadata(
  meta: R3ComponentMetadata[R3TemplateDependency],
  constantPool: ConstantPool,
  bindingParser: BindingParser
): R3CompiledExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("compileComponentFromMetadata")(meta.asInstanceOf[js.Any], constantPool.asInstanceOf[js.Any], bindingParser.asInstanceOf[js.Any])).asInstanceOf[R3CompiledExpression]

inline def compileDeclareClassMetadata(metadata: R3ClassMetadata): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("compileDeclareClassMetadata")(metadata.asInstanceOf[js.Any]).asInstanceOf[Expression]

inline def compileDeclareComponentFromMetadata(
  meta: R3ComponentMetadata[R3TemplateDependencyMetadata],
  template: ParsedTemplate,
  additionalTemplateInfo: DeclareComponentTemplateInfo
): R3CompiledExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("compileDeclareComponentFromMetadata")(meta.asInstanceOf[js.Any], template.asInstanceOf[js.Any], additionalTemplateInfo.asInstanceOf[js.Any])).asInstanceOf[R3CompiledExpression]

inline def compileDeclareDirectiveFromMetadata(meta: R3DirectiveMetadata): R3CompiledExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("compileDeclareDirectiveFromMetadata")(meta.asInstanceOf[js.Any]).asInstanceOf[R3CompiledExpression]

inline def compileDeclareFactoryFunction(meta: R3FactoryMetadata): R3CompiledExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("compileDeclareFactoryFunction")(meta.asInstanceOf[js.Any]).asInstanceOf[R3CompiledExpression]

inline def compileDeclareInjectableFromMetadata(meta: R3InjectableMetadata): R3CompiledExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("compileDeclareInjectableFromMetadata")(meta.asInstanceOf[js.Any]).asInstanceOf[R3CompiledExpression]

inline def compileDeclareInjectorFromMetadata(meta: R3InjectorMetadata): R3CompiledExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("compileDeclareInjectorFromMetadata")(meta.asInstanceOf[js.Any]).asInstanceOf[R3CompiledExpression]

inline def compileDeclareNgModuleFromMetadata(meta: R3NgModuleMetadata): R3CompiledExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("compileDeclareNgModuleFromMetadata")(meta.asInstanceOf[js.Any]).asInstanceOf[R3CompiledExpression]

inline def compileDeclarePipeFromMetadata(meta: R3PipeMetadata): R3CompiledExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("compileDeclarePipeFromMetadata")(meta.asInstanceOf[js.Any]).asInstanceOf[R3CompiledExpression]

inline def compileDirectiveFromMetadata(meta: R3DirectiveMetadata, constantPool: ConstantPool, bindingParser: BindingParser): R3CompiledExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("compileDirectiveFromMetadata")(meta.asInstanceOf[js.Any], constantPool.asInstanceOf[js.Any], bindingParser.asInstanceOf[js.Any])).asInstanceOf[R3CompiledExpression]

inline def compileFactoryFunction(meta: R3FactoryMetadata): R3CompiledExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("compileFactoryFunction")(meta.asInstanceOf[js.Any]).asInstanceOf[R3CompiledExpression]

inline def compileInjectable(meta: R3InjectableMetadata, resolveForwardRefs: Boolean): R3CompiledExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("compileInjectable")(meta.asInstanceOf[js.Any], resolveForwardRefs.asInstanceOf[js.Any])).asInstanceOf[R3CompiledExpression]

inline def compileInjector(meta: R3InjectorMetadata): R3CompiledExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("compileInjector")(meta.asInstanceOf[js.Any]).asInstanceOf[R3CompiledExpression]

inline def compileNgModule(meta: R3NgModuleMetadata): R3CompiledExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("compileNgModule")(meta.asInstanceOf[js.Any]).asInstanceOf[R3CompiledExpression]

inline def compilePipeFromMetadata(metadata: R3PipeMetadata): R3CompiledExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("compilePipeFromMetadata")(metadata.asInstanceOf[js.Any]).asInstanceOf[R3CompiledExpression]

inline def computeMsgId(msg: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMsgId")(msg.asInstanceOf[js.Any]).asInstanceOf[String]
inline def computeMsgId(msg: String, meaning: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeMsgId")(msg.asInstanceOf[js.Any], meaning.asInstanceOf[js.Any])).asInstanceOf[String]

inline def createInjectableType(meta: R3InjectableMetadata): ExpressionType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInjectableType")(meta.asInstanceOf[js.Any]).asInstanceOf[ExpressionType]

inline def createMayBeForwardRefExpression[T /* <: Expression */](expression: T, forwardRef: ForwardRefHandling): MaybeForwardRefExpression[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMayBeForwardRefExpression")(expression.asInstanceOf[js.Any], forwardRef.asInstanceOf[js.Any])).asInstanceOf[MaybeForwardRefExpression[T]]

inline def devOnlyGuardedExpression(expr: Expression): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("devOnlyGuardedExpression")(expr.asInstanceOf[js.Any]).asInstanceOf[Expression]

inline def emitDistinctChangesOnlyDefaultValue: /* true */ Boolean = ^.asInstanceOf[js.Dynamic].selectDynamic("emitDistinctChangesOnlyDefaultValue").asInstanceOf[/* true */ Boolean]

inline def getHtmlTagDefinition(tagName: String): HtmlTagDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("getHtmlTagDefinition")(tagName.asInstanceOf[js.Any]).asInstanceOf[HtmlTagDefinition]

inline def getNsPrefix(fullName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNsPrefix")(fullName.asInstanceOf[js.Any]).asInstanceOf[String]
inline def getNsPrefix(fullName: Null): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNsPrefix")(fullName.asInstanceOf[js.Any]).asInstanceOf[Null]

inline def getSafePropertyAccessString(accessor: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSafePropertyAccessString")(accessor.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]

inline def identifierName(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("identifierName")().asInstanceOf[String | Null]
inline def identifierName(compileIdentifier: CompileIdentifierMetadata): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("identifierName")(compileIdentifier.asInstanceOf[js.Any]).asInstanceOf[String | Null]

inline def isIdentifier(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifier")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isNgContainer(tagName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNgContainer")(tagName.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isNgContent(tagName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNgContent")(tagName.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isNgTemplate(tagName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNgTemplate")(tagName.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def jsDocComment(): JSDocComment_ = ^.asInstanceOf[js.Dynamic].applyDynamic("jsDocComment")().asInstanceOf[JSDocComment_]
inline def jsDocComment(tags: js.Array[JSDocTag]): JSDocComment_ = ^.asInstanceOf[js.Dynamic].applyDynamic("jsDocComment")(tags.asInstanceOf[js.Any]).asInstanceOf[JSDocComment_]

inline def leadingComment(text: String): LeadingComment_ = ^.asInstanceOf[js.Dynamic].applyDynamic("leadingComment")(text.asInstanceOf[js.Any]).asInstanceOf[LeadingComment_]
inline def leadingComment(text: String, multiline: Boolean): LeadingComment_ = (^.asInstanceOf[js.Dynamic].applyDynamic("leadingComment")(text.asInstanceOf[js.Any], multiline.asInstanceOf[js.Any])).asInstanceOf[LeadingComment_]
inline def leadingComment(text: String, multiline: Boolean, trailingNewline: Boolean): LeadingComment_ = (^.asInstanceOf[js.Dynamic].applyDynamic("leadingComment")(text.asInstanceOf[js.Any], multiline.asInstanceOf[js.Any], trailingNewline.asInstanceOf[js.Any])).asInstanceOf[LeadingComment_]
inline def leadingComment(text: String, multiline: Unit, trailingNewline: Boolean): LeadingComment_ = (^.asInstanceOf[js.Dynamic].applyDynamic("leadingComment")(text.asInstanceOf[js.Any], multiline.asInstanceOf[js.Any], trailingNewline.asInstanceOf[js.Any])).asInstanceOf[LeadingComment_]

inline def literalMap(values: js.Array[Key]): LiteralMapExpr = ^.asInstanceOf[js.Dynamic].applyDynamic("literalMap")(values.asInstanceOf[js.Any]).asInstanceOf[LiteralMapExpr]
inline def literalMap(values: js.Array[Key], `type`: MapType): LiteralMapExpr = (^.asInstanceOf[js.Dynamic].applyDynamic("literalMap")(values.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[LiteralMapExpr]

inline def makeBindingParser(): BindingParser = ^.asInstanceOf[js.Dynamic].applyDynamic("makeBindingParser")().asInstanceOf[BindingParser]
inline def makeBindingParser(interpolationConfig: InterpolationConfig): BindingParser = ^.asInstanceOf[js.Dynamic].applyDynamic("makeBindingParser")(interpolationConfig.asInstanceOf[js.Any]).asInstanceOf[BindingParser]

inline def mergeNsAndName(prefix: String, localName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeNsAndName")(prefix.asInstanceOf[js.Any], localName.asInstanceOf[js.Any])).asInstanceOf[String]

inline def parseHostBindings(host: StringDictionary[String | Expression]): ParsedHostBindings = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHostBindings")(host.asInstanceOf[js.Any]).asInstanceOf[ParsedHostBindings]

inline def parseTemplate(template: String, templateUrl: String): ParsedTemplate = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTemplate")(template.asInstanceOf[js.Any], templateUrl.asInstanceOf[js.Any])).asInstanceOf[ParsedTemplate]
inline def parseTemplate(template: String, templateUrl: String, options: ParseTemplateOptions): ParsedTemplate = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTemplate")(template.asInstanceOf[js.Any], templateUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedTemplate]

inline def preserveWhitespacesDefault(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("preserveWhitespacesDefault")().asInstanceOf[Boolean]
inline def preserveWhitespacesDefault(preserveWhitespacesOption: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("preserveWhitespacesDefault")(preserveWhitespacesOption.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def preserveWhitespacesDefault(preserveWhitespacesOption: Boolean, defaultSetting: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("preserveWhitespacesDefault")(preserveWhitespacesOption.asInstanceOf[js.Any], defaultSetting.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def preserveWhitespacesDefault(preserveWhitespacesOption: Null, defaultSetting: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("preserveWhitespacesDefault")(preserveWhitespacesOption.asInstanceOf[js.Any], defaultSetting.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def publishFacade(global: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("publishFacade")(global.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def r3JitTypeSourceSpan(kind: String, typeName: String, sourceUrl: String): ParseSourceSpan = (^.asInstanceOf[js.Dynamic].applyDynamic("r3JitTypeSourceSpan")(kind.asInstanceOf[js.Any], typeName.asInstanceOf[js.Any], sourceUrl.asInstanceOf[js.Any])).asInstanceOf[ParseSourceSpan]

inline def sanitizeIdentifier(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeIdentifier")(name.asInstanceOf[js.Any]).asInstanceOf[String]

inline def splitNsName(elementName: String): js.Tuple2[String | Null, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitNsName")(elementName.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String | Null, String]]

inline def verifyHostBindings(bindings: ParsedHostBindings, sourceSpan: ParseSourceSpan): js.Array[ParseError] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyHostBindings")(bindings.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any])).asInstanceOf[js.Array[ParseError]]

inline def visitAll(visitor: Visitor, nodes: js.Array[Node2]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitAll")(visitor.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
inline def visitAll(visitor: Visitor, nodes: js.Array[Node2], context: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitAll")(visitor.asInstanceOf[js.Any], nodes.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]

/**
  * A set of marker values to be used in the attributes arrays. These markers indicate that some
  * items are not regular attributes and the processing should be adapted accordingly.
  */
type AttributeMarker = 0 | 1 | 2 | 3 | 4 | 5 | 6

type BindingType = 0 | 1 | 2 | 3 | 4

type CompileClassMetadataFn = js.Function1[/* metadata */ R3ClassMetadata, Expression]

type DeclarationListEmitMode = 0 | 1 | 2

type ForwardRefHandling = 0 | 1 | 2

type HostListeners = StringDictionary[String]

type HostProperties = StringDictionary[String]

/**
  * Each HTML node that is affect by an i18n tag will also have an `i18n` property that is of type
  * `I18nMeta`.
  * This information is either a `Message`, which indicates it is the root of an i18n message, or a
  * `Node`, which indicates is it part of a containing `Message`.
  */
type I18nMeta2 = Message | Node3

/**
  * Injection flags for DI.
  */
type InjectFlags = 0 | 1 | 2 | 4 | 8

type InterpolatedAttributeToken = AttributeValueTextToken | AttributeValueInterpolationToken | EncodedEntityToken

type InterpolatedTextToken = TextToken | InterpolationToken | EncodedEntityToken

type JSDocTag = TagName | typings.angularCompiler.anon.Text

type JSDocTagName = "desc" | "id" | "meaning" | "suppress"

type MessagePiece = LiteralPiece | PlaceholderPiece

type Node2 = Attribute | Comment2 | Element2 | Expansion | ExpansionCase | Text2

type ParseFlags = 0 | 1 | 2

type ParsedEventType = 0 | 1

type R3CssSelector = js.Array[String | SelectorFlags]

type R3CssSelectorList = js.Array[R3CssSelector]

type R3DeclareTemplateDependencyMetadata = R3DeclareDirectiveDependencyMetadata | R3DeclarePipeDependencyMetadata | R3DeclareNgModuleDependencyMetadata

type R3FactoryMetadata = R3ConstructorFactoryMetadata | R3DelegatedFnOrClassMetadata | R3ExpressionFactoryMetadata

type R3TemplateDependencyMetadata = R3DirectiveDependencyMetadata | R3PipeDependencyMetadata | R3NgModuleDependencyMetadata

/**
  * Flags passed into template functions to determine which blocks (i.e. creation, update)
  * should be executed.
  *
  * Typically, a template runs both the creation block and the update block on initialization and
  * subsequent runs only execute the update block. However, dynamically created views require that
  * the creation block be executed separately from the update block (for backwards compat).
  */
type RenderFlags = 1 | 2

/**
  * Flags used to generate R3-style CSS Selectors. They are pasted from
  * core/src/render3/projection.ts because they cannot be referenced directly.
  */
type SelectorFlags = 1 | 2 | 4 | 8

type TemplateBinding = VariableBinding | ExpressionBinding

type TokenType2 = 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 | 21 | 22 | 23 | 24
