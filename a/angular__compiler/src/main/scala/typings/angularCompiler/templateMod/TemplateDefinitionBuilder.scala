package typings.angularCompiler.templateMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.constantPoolMod.ConstantPool
import typings.angularCompiler.contextMod.I18nContext
import typings.angularCompiler.expressionConverterMod.LocalResolver
import typings.angularCompiler.i18nAstMod.AST
import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.ExternalReference
import typings.angularCompiler.outputAstMod.FunctionExpr
import typings.angularCompiler.outputAstMod.ReadVarExpr
import typings.angularCompiler.outputAstMod.Statement
import typings.angularCompiler.r3AstMod.BoundAttribute
import typings.angularCompiler.r3AstMod.BoundEvent
import typings.angularCompiler.r3AstMod.BoundText
import typings.angularCompiler.r3AstMod.Content
import typings.angularCompiler.r3AstMod.Element
import typings.angularCompiler.r3AstMod.Icu
import typings.angularCompiler.r3AstMod.Node
import typings.angularCompiler.r3AstMod.Reference
import typings.angularCompiler.r3AstMod.Template
import typings.angularCompiler.r3AstMod.Text
import typings.angularCompiler.r3AstMod.TextAttribute
import typings.angularCompiler.r3AstMod.Variable
import typings.angularCompiler.r3AstMod.Visitor
import typings.angularCompiler.selectorMod.SelectorMatcher
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import typings.std.Map
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/template", "TemplateDefinitionBuilder")
@js.native
class TemplateDefinitionBuilder protected ()
  extends Visitor[Unit]
     with LocalResolver {
  def this(
    constantPool: ConstantPool,
    parentBindingScope: BindingScope,
    level: Double,
    contextName: String | Null,
    i18nContext: I18nContext | Null,
    templateIndex: Double | Null,
    templateName: String | Null,
    directiveMatcher: SelectorMatcher[_] | Null,
    directives: Set[Expression],
    pipeTypeByName: Map[String, Expression],
    pipes: Set[Expression],
    _namespace: ExternalReference,
    relativeContextFilePath: String,
    i18nUseExternalIds: Boolean
  ) = this()
  var _bindingContext: js.Any = js.native
  /**
    * This scope contains local variables declared in the update mode block of the template.
    * (e.g. refs and context vars in bindings)
    */
  var _bindingScope: js.Any = js.native
  var _bindingSlots: js.Any = js.native
  /**
    * List of callbacks to generate creation mode instructions. We store them here as we process
    * the template so bindings in listeners are resolved only once all nodes have been visited.
    * This ensures all local refs and context variables are available for matching.
    */
  var _creationCodeFns: js.Any = js.native
  var _dataIndex: js.Any = js.native
  var _implicitReceiverExpr: js.Any = js.native
  /**
    * Memorizes the last node index for which a select instruction has been generated.
    * We're initializing this to -1 to ensure the `select(0)` instruction is generated before any
    * relevant update instructions.
    */
  var _lastNodeIndexWithFlush: js.Any = js.native
  var _namespace: js.Any = js.native
  /**
    * List of callbacks to build nested templates. Nested templates must not be visited until
    * after the parent template has finished visiting all of its nodes. This ensures that all
    * local ref bindings in nested templates are able to find local ref values if the refs
    * are defined after the template declaration.
    */
  var _nestedTemplateFns: js.Any = js.native
  var _ngContentReservedSlots: js.Any = js.native
  var _ngContentSelectorsOffset: js.Any = js.native
  var _prefixCode: js.Any = js.native
  var _pureFunctionSlots: js.Any = js.native
  /** Temporary variable declarations generated from visiting pipes, literals, etc. */
  var _tempVariables: js.Any = js.native
  var _unsupported: js.Any = js.native
  /**
    * List of callbacks to generate update mode instructions. We store them here as we process
    * the template so bindings are resolved only once all nodes have been visited. This ensures
    * all local refs and context variables are available for matching.
    */
  var _updateCodeFns: js.Any = js.native
  var _valueConverter: js.Any = js.native
  var addSelectInstructionIfNecessary: js.Any = js.native
  var allocateBindingSlots: js.Any = js.native
  var allocateDataSlot: js.Any = js.native
  var allocatePureFunctionSlots: js.Any = js.native
  var bindingContext: js.Any = js.native
  var constantPool: js.Any = js.native
  var contextName: js.Any = js.native
  var convertExpressionBinding: js.Any = js.native
  var convertPropertyBinding: js.Any = js.native
  var creationInstruction: js.Any = js.native
  var directiveMatcher: js.Any = js.native
  var directives: js.Any = js.native
  var fileBasedI18nSuffix: js.Any = js.native
  /**
    * Gets an expression that refers to the implicit receiver. The implicit
    * receiver is always the root level context.
    */
  var getImplicitReceiverExpr: js.Any = js.native
  /**
    * Gets a list of argument expressions to pass to an update instruction expression. Also updates
    * the temp variables state with temp variables that were identified as needing to be created
    * while visiting the arguments.
    * @param value The original expression we will be resolving an arguments list from.
    */
  var getUpdateInstructionArguments: js.Any = js.native
  var i18n: js.Any = js.native
  var i18nContext: js.Any = js.native
  var i18nUseExternalIds: js.Any = js.native
  var instructionFn: js.Any = js.native
  var level: js.Any = js.native
  var matchDirectives: js.Any = js.native
  var pipeTypeByName: js.Any = js.native
  var pipes: js.Any = js.native
  var prepareListenerParameter: js.Any = js.native
  /**
    * Prepares all attribute expression values for the `TAttributes` array.
    *
    * The purpose of this function is to properly construct an attributes array that
    * is passed into the `elementStart` (or just `element`) functions. Because there
    * are many different types of attributes, the array needs to be constructed in a
    * special way so that `elementStart` can properly evaluate them.
    *
    * The format looks like this:
    *
    * ```
    * attrs = [prop, value, prop2, value2,
    *   CLASSES, class1, class2,
    *   STYLES, style1, value1, style2, value2,
    *   BINDINGS, name1, name2, name3,
    *   TEMPLATE, name4, name5, name6,
    *   I18N, name7, name8, ...]
    * ```
    *
    * Note that this function will fully ignore all synthetic (@foo) attribute values
    * because those values are intended to always be generated as property instructions.
    */
  var prepareNonRenderAttrs: js.Any = js.native
  var prepareRefsParameter: js.Any = js.native
  var processStylingInstruction: js.Any = js.native
  var relativeContextFilePath: js.Any = js.native
  var templateIndex: js.Any = js.native
  var templateName: js.Any = js.native
  var templatePropertyBindings: js.Any = js.native
  var toAttrsParam: js.Any = js.native
  var updateInstruction: js.Any = js.native
  var updateInstructionChain: js.Any = js.native
  def addNamespaceInstruction(nsInstruction: ExternalReference, element: Element): Unit = js.native
  def buildTemplateFunction(nodes: js.Array[Node], variables: js.Array[Variable]): FunctionExpr = js.native
  def buildTemplateFunction(nodes: js.Array[Node], variables: js.Array[Variable], ngContentSelectorsOffset: Double): FunctionExpr = js.native
  def buildTemplateFunction(nodes: js.Array[Node], variables: js.Array[Variable], ngContentSelectorsOffset: Double, i18n: AST): FunctionExpr = js.native
  def getConstCount(): Double = js.native
  /* CompleteClass */
  override def getLocal(name: String): Expression | Null = js.native
  def getNamespaceInstruction(): ExternalReference = js.native
  def getNamespaceInstruction(namespaceKey: String): ExternalReference = js.native
  def getNgContentSelectors(): Expression | Null = js.native
  def getVarCount(): Double = js.native
  def i18nAppendBindings(expressions: js.Array[typings.angularCompiler.astMod.AST]): Unit = js.native
  def i18nBindProps(props: StringDictionary[Text | BoundText]): StringDictionary[Expression] = js.native
  def i18nEnd(): Unit = js.native
  def i18nEnd(span: Null, selfClosing: Boolean): Unit = js.native
  def i18nEnd(span: ParseSourceSpan): Unit = js.native
  def i18nEnd(span: ParseSourceSpan, selfClosing: Boolean): Unit = js.native
  def i18nFormatPlaceholderNames(params: js.UndefOr[scala.Nothing], useCamelCase: Boolean): StringDictionary[Expression] = js.native
  def i18nFormatPlaceholderNames(params: StringDictionary[Expression], useCamelCase: Boolean): StringDictionary[Expression] = js.native
  def i18nGenerateClosureVar(messageId: String): ReadVarExpr = js.native
  def i18nStart(span: js.UndefOr[scala.Nothing], meta: AST): Unit = js.native
  def i18nStart(span: js.UndefOr[scala.Nothing], meta: AST, selfClosing: Boolean): Unit = js.native
  def i18nStart(span: Null, meta: AST): Unit = js.native
  def i18nStart(span: Null, meta: AST, selfClosing: Boolean): Unit = js.native
  def i18nStart(span: ParseSourceSpan, meta: AST): Unit = js.native
  def i18nStart(span: ParseSourceSpan, meta: AST, selfClosing: Boolean): Unit = js.native
  def i18nTranslate(message: Message): ReadVarExpr = js.native
  def i18nTranslate(message: Message, params: StringDictionary[Expression]): ReadVarExpr = js.native
  def i18nTranslate(message: Message, params: StringDictionary[Expression], ref: ReadVarExpr): ReadVarExpr = js.native
  def i18nTranslate(
    message: Message,
    params: StringDictionary[Expression],
    ref: ReadVarExpr,
    transformFn: js.Function1[/* raw */ ReadVarExpr, Expression]
  ): ReadVarExpr = js.native
  def i18nUpdateRef(context: I18nContext): Unit = js.native
  /**
    * Adds an update instruction for an interpolated property or attribute, such as
    * `prop="{{value}}"` or `attr.title="{{value}}"`
    */
  def interpolatedUpdateInstruction(
    instruction: ExternalReference,
    elementIndex: Double,
    attrName: String,
    input: BoundAttribute,
    value: js.Any,
    params: js.Array[_]
  ): Unit = js.native
  /* CompleteClass */
  override def notifyImplicitReceiverUse(): Unit = js.native
  def registerContextVariables(variable: Variable): Unit = js.native
  /* CompleteClass */
  override def visitBoundAttribute(attribute: BoundAttribute): Unit = js.native
  def visitBoundAttribute[T](arg: Expression): scala.Nothing = js.native
  def visitBoundAttribute[T](arg: Statement): scala.Nothing = js.native
  def visitBoundAttribute[T](arg: Node): scala.Nothing = js.native
  /* CompleteClass */
  override def visitBoundEvent(attribute: BoundEvent): Unit = js.native
  def visitBoundEvent[T](arg: Expression): scala.Nothing = js.native
  def visitBoundEvent[T](arg: Statement): scala.Nothing = js.native
  def visitBoundEvent[T](arg: Node): scala.Nothing = js.native
  /* CompleteClass */
  override def visitBoundText(text: BoundText): Unit = js.native
  /* CompleteClass */
  override def visitContent(content: Content): Unit = js.native
  /* CompleteClass */
  override def visitElement(element: Element): Unit = js.native
  /* CompleteClass */
  override def visitIcu(icu: Icu): Unit = js.native
  /* CompleteClass */
  override def visitReference(reference: Reference): Unit = js.native
  def visitReference[T](arg: Expression): scala.Nothing = js.native
  def visitReference[T](arg: Statement): scala.Nothing = js.native
  def visitReference[T](arg: Node): scala.Nothing = js.native
  /* CompleteClass */
  override def visitTemplate(template: Template): Unit = js.native
  /* CompleteClass */
  override def visitText(text: Text): Unit = js.native
  /* CompleteClass */
  override def visitTextAttribute(attribute: TextAttribute): Unit = js.native
  def visitTextAttribute[T](arg: Expression): scala.Nothing = js.native
  def visitTextAttribute[T](arg: Statement): scala.Nothing = js.native
  def visitTextAttribute[T](arg: Node): scala.Nothing = js.native
  /* CompleteClass */
  override def visitVariable(variable: Variable): Unit = js.native
  def visitVariable[T](arg: Expression): scala.Nothing = js.native
  def visitVariable[T](arg: Statement): scala.Nothing = js.native
  def visitVariable[T](arg: Node): scala.Nothing = js.native
}

