package typings
package atAngularCompilerLib.srcRender3ViewI18nContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/i18n/context", "I18nContext")
@js.native
class I18nContext protected () extends js.Object {
  def this(index: scala.Double, ref: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr, level: scala.Double, templateIndex: scala.Double, meta: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.AST) = this()
  def this(index: scala.Double, ref: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr, level: scala.Double, templateIndex: scala.Null, meta: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.AST) = this()
  def this(index: scala.Double, ref: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr, level: scala.Double, templateIndex: scala.Double, meta: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.AST, registry: js.Any) = this()
  def this(index: scala.Double, ref: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr, level: scala.Double, templateIndex: scala.Null, meta: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.AST, registry: js.Any) = this()
  var _registry: js.Any = js.native
  var _unresolvedCtxCount: js.Any = js.native
  var appendTag: js.Any = js.native
  var bindings: stdLib.Set[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression] = js.native
  val icus: js.Any = js.native
  val id: scala.Double = js.native
  val index: scala.Double = js.native
  val isResolved: scala.Boolean = js.native
  val isRoot: scala.Boolean = js.native
  val level: scala.Double = js.native
  val meta: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.AST = js.native
  var placeholders: stdLib.Map[java.lang.String, js.Array[_]] = js.native
  val ref: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr = js.native
  var registry: js.UndefOr[js.Any] = js.native
  val templateIndex: scala.Double | scala.Null = js.native
  def appendBinding(binding: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression): scala.Unit = js.native
  def appendBoundText(node: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.AST): scala.Unit = js.native
  def appendElement(node: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.AST, index: scala.Double): scala.Unit = js.native
  def appendElement(
    node: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.AST,
    index: scala.Double,
    closed: scala.Boolean
  ): scala.Unit = js.native
  def appendIcu(name: java.lang.String, ref: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression): scala.Unit = js.native
  def appendTemplate(node: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.AST, index: scala.Double): scala.Unit = js.native
  /**
    * Generates an instance of a child context based on the root one,
    * when we enter a nested template within I18n section.
    *
    * @param index Instruction index of corresponding i18nStart, which initiates this context
    * @param templateIndex Instruction index of a template which this context belongs to
    * @param meta Meta information (id, meaning, description, etc) associated with this context
    *
    * @returns I18nContext instance
    */
  def forkChildContext(
    index: scala.Double,
    templateIndex: scala.Double,
    meta: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.AST
  ): I18nContext = js.native
  def getSerializedPlaceholders(): stdLib.Map[java.lang.String, js.Array[_]] = js.native
  /**
    * Reconciles child context into parent one once the end of the i18n block is reached (i18nEnd).
    *
    * @param context Child I18nContext instance to be reconciled with parent context.
    */
  def reconcileChildContext(context: I18nContext): scala.Unit = js.native
}

