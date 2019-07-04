package typings
package atAngularCompilerLib.srcRender3ViewTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/template", "TemplateDefinitionBuilder")
@js.native
class TemplateDefinitionBuilder protected ()
  extends atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Visitor[scala.Unit]
     with atAngularCompilerLib.srcCompilerUnderscoreUtilExpressionUnderscoreConverterMod.LocalResolver {
  def this(constantPool: atAngularCompilerLib.srcConstantUnderscorePoolMod.ConstantPool, parentBindingScope: BindingScope, level: scala.Double, contextName: java.lang.String | scala.Null, i18nContext: atAngularCompilerLib.srcRender3ViewI18nContextMod.I18nContext | scala.Null, templateIndex: scala.Double | scala.Null, templateName: java.lang.String | scala.Null, directiveMatcher: atAngularCompilerLib.srcSelectorMod.SelectorMatcher[_] | scala.Null, directives: stdLib.Set[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression], pipeTypeByName: stdLib.Map[java.lang.String, atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression], pipes: stdLib.Set[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression], _namespace: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalReference, relativeContextFilePath: java.lang.String, i18nUseExternalIds: scala.Boolean) = this()
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
  def addNamespaceInstruction(
    nsInstruction: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalReference,
    element: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Element
  ): scala.Unit = js.native
  def buildTemplateFunction(
    nodes: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Node],
    variables: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Variable]
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.FunctionExpr = js.native
  def buildTemplateFunction(
    nodes: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Node],
    variables: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Variable],
    ngContentSelectorsOffset: scala.Double
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.FunctionExpr = js.native
  def buildTemplateFunction(
    nodes: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Node],
    variables: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Variable],
    ngContentSelectorsOffset: scala.Double,
    i18n: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.AST
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.FunctionExpr = js.native
  def getConstCount(): scala.Double = js.native
  /* CompleteClass */
  override def getLocal(name: java.lang.String): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression | scala.Null = js.native
  def getNamespaceInstruction(): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalReference = js.native
  def getNamespaceInstruction(namespaceKey: java.lang.String): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalReference = js.native
  def getNgContentSelectors(): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression | scala.Null = js.native
  def getVarCount(): scala.Double = js.native
  def i18nAppendBindings(expressions: js.Array[atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST]): scala.Unit = js.native
  def i18nBindProps(
    props: org.scalablytyped.runtime.StringDictionary[
      atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Text | atAngularCompilerLib.srcRender3R3UnderscoreAstMod.BoundText
    ]
  ): org.scalablytyped.runtime.StringDictionary[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression] = js.native
  def i18nEnd(): scala.Unit = js.native
  def i18nEnd(span: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan): scala.Unit = js.native
  def i18nEnd(span: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, selfClosing: scala.Boolean): scala.Unit = js.native
  def i18nEnd(span: scala.Null, selfClosing: scala.Boolean): scala.Unit = js.native
  def i18nGenerateClosureVar(messageId: java.lang.String): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr = js.native
  def i18nStart(span: js.UndefOr[scala.Nothing], meta: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.AST): scala.Unit = js.native
  def i18nStart(
    span: js.UndefOr[scala.Nothing],
    meta: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.AST,
    selfClosing: scala.Boolean
  ): scala.Unit = js.native
  def i18nStart(
    span: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan,
    meta: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.AST
  ): scala.Unit = js.native
  def i18nStart(
    span: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan,
    meta: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.AST,
    selfClosing: scala.Boolean
  ): scala.Unit = js.native
  def i18nStart(span: scala.Null, meta: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.AST): scala.Unit = js.native
  def i18nStart(
    span: scala.Null,
    meta: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.AST,
    selfClosing: scala.Boolean
  ): scala.Unit = js.native
  def i18nTranslate(message: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Message): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr = js.native
  def i18nTranslate(
    message: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Message,
    params: org.scalablytyped.runtime.StringDictionary[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression]
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr = js.native
  def i18nTranslate(
    message: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Message,
    params: org.scalablytyped.runtime.StringDictionary[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression],
    ref: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr = js.native
  def i18nTranslate(
    message: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Message,
    params: org.scalablytyped.runtime.StringDictionary[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression],
    ref: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr,
    transformFn: js.Function1[
      /* raw */ atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr, 
      atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
    ]
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr = js.native
  def i18nUpdateRef(context: atAngularCompilerLib.srcRender3ViewI18nContextMod.I18nContext): scala.Unit = js.native
  /**
    * Adds an update instruction for an interpolated property or attribute, such as
    * `prop="{{value}}"` or `attr.title="{{value}}"`
    */
  def interpolatedUpdateInstruction(
    instruction: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalReference,
    elementIndex: scala.Double,
    attrName: java.lang.String,
    input: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.BoundAttribute,
    value: js.Any,
    params: js.Array[_]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def notifyImplicitReceiverUse(): scala.Unit = js.native
  def registerContextVariables(variable: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Variable): scala.Unit = js.native
  /* CompleteClass */
  override def visitBoundAttribute(attribute: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.BoundAttribute): scala.Unit = js.native
  def visitBoundAttribute[T](arg: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression): scala.Nothing = js.native
  def visitBoundAttribute[T](arg: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement): scala.Nothing = js.native
  def visitBoundAttribute[T](arg: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Node): scala.Nothing = js.native
  /* CompleteClass */
  override def visitBoundEvent(attribute: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.BoundEvent): scala.Unit = js.native
  def visitBoundEvent[T](arg: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression): scala.Nothing = js.native
  def visitBoundEvent[T](arg: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement): scala.Nothing = js.native
  def visitBoundEvent[T](arg: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Node): scala.Nothing = js.native
  /* CompleteClass */
  override def visitBoundText(text: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.BoundText): scala.Unit = js.native
  /* CompleteClass */
  override def visitContent(content: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Content): scala.Unit = js.native
  /* CompleteClass */
  override def visitElement(element: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Element): scala.Unit = js.native
  /* CompleteClass */
  override def visitIcu(icu: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Icu): scala.Unit = js.native
  /* CompleteClass */
  override def visitReference(reference: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Reference): scala.Unit = js.native
  def visitReference[T](arg: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression): scala.Nothing = js.native
  def visitReference[T](arg: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement): scala.Nothing = js.native
  def visitReference[T](arg: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Node): scala.Nothing = js.native
  /* CompleteClass */
  override def visitTemplate(template: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Template): scala.Unit = js.native
  /* CompleteClass */
  override def visitText(text: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Text): scala.Unit = js.native
  /* CompleteClass */
  override def visitTextAttribute(attribute: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.TextAttribute): scala.Unit = js.native
  def visitTextAttribute[T](arg: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression): scala.Nothing = js.native
  def visitTextAttribute[T](arg: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement): scala.Nothing = js.native
  def visitTextAttribute[T](arg: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Node): scala.Nothing = js.native
  /* CompleteClass */
  override def visitVariable(variable: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Variable): scala.Unit = js.native
  def visitVariable[T](arg: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression): scala.Nothing = js.native
  def visitVariable[T](arg: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement): scala.Nothing = js.native
  def visitVariable[T](arg: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Node): scala.Nothing = js.native
}

