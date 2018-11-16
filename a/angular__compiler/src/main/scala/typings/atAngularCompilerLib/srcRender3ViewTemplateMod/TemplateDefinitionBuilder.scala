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
  def this(constantPool: atAngularCompilerLib.srcConstantUnderscorePoolMod.ConstantPool, parentBindingScope: BindingScope, level: scala.Double, contextName: java.lang.String | scala.Null, i18nContext: atAngularCompilerLib.srcRender3ViewI18nMod.I18nContext | scala.Null, templateIndex: scala.Double | scala.Null, templateName: java.lang.String | scala.Null, viewQueries: js.Array[atAngularCompilerLib.srcRender3ViewApiMod.R3QueryMetadata], directiveMatcher: atAngularCompilerLib.srcSelectorMod.SelectorMatcher[_] | scala.Null, directives: stdLib.Set[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression], pipeTypeByName: stdLib.Map[java.lang.String, atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression], pipes: stdLib.Set[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression], _namespace: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalReference, relativeContextFilePath: java.lang.String) = this()
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
  var _namespace: js.Any = js.native
  /**
       * List of callbacks to build nested templates. Nested templates must not be visited until
       * after the parent template has finished visiting all of its nodes. This ensures that all
       * local ref bindings in nested templates are able to find local ref values if the refs
       * are defined after the template declaration.
       */
  var _nestedTemplateFns: js.Any = js.native
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
  var i18n: js.Any = js.native
  var i18nContext: js.Any = js.native
  var instructionFn: js.Any = js.native
  var level: js.Any = js.native
  var matchDirectives: js.Any = js.native
  var pipeTypeByName: js.Any = js.native
  var pipes: js.Any = js.native
  var prepareListenerParameter: js.Any = js.native
  var prepareRefsParameter: js.Any = js.native
  var prepareSyntheticAndSelectOnlyAttrs: js.Any = js.native
  var relativeContextFilePath: js.Any = js.native
  var templateIndex: js.Any = js.native
  var templateName: js.Any = js.native
  var toAttrsParam: js.Any = js.native
  var updateInstruction: js.Any = js.native
  var viewQueries: js.Any = js.native
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
    hasNgContent: scala.Boolean
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.FunctionExpr = js.native
  def buildTemplateFunction(
    nodes: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Node],
    variables: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Variable],
    hasNgContent: scala.Boolean,
    ngContentSelectors: js.Array[java.lang.String]
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.FunctionExpr = js.native
  def getConstCount(): scala.Double = js.native
  /* CompleteClass */
  override def getLocal(name: java.lang.String): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression | scala.Null = js.native
  def getNamespaceInstruction(): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalReference = js.native
  def getNamespaceInstruction(namespaceKey: java.lang.String): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalReference = js.native
  def getVarCount(): scala.Double = js.native
  def i18nAllocateRef(): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr = js.native
  def i18nAppendTranslationMeta(): scala.Unit = js.native
  def i18nAppendTranslationMeta(meta: java.lang.String): scala.Unit = js.native
  def i18nEnd(): scala.Unit = js.native
  def i18nEnd(span: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan): scala.Unit = js.native
  def i18nStart(): scala.Unit = js.native
  def i18nStart(span: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan): scala.Unit = js.native
  def i18nStart(span: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, meta: java.lang.String): scala.Unit = js.native
  def i18nStart(span: scala.Null, meta: java.lang.String): scala.Unit = js.native
  def i18nTranslate(label: java.lang.String): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = js.native
  def i18nTranslate(label: java.lang.String, meta: java.lang.String): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = js.native
  def i18nUpdateRef(context: atAngularCompilerLib.srcRender3ViewI18nMod.I18nContext): scala.Unit = js.native
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

