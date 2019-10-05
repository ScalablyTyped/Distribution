package typings.atAngularCompiler

import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.AST
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ReadVarExpr
import typings.atAngularCompiler.srcRender3ViewI18nContextMod.I18nContext
import typings.std.Map
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/i18n/context", JSImport.Namespace)
@js.native
object srcRender3ViewI18nContextMod extends js.Object {
  @js.native
  class I18nContext protected () extends js.Object {
    def this(index: Double, ref: ReadVarExpr, level: Double, templateIndex: Double, meta: AST) = this()
    def this(index: Double, ref: ReadVarExpr, level: Double, templateIndex: Null, meta: AST) = this()
    def this(index: Double, ref: ReadVarExpr, level: Double, templateIndex: Double, meta: AST, registry: js.Any) = this()
    def this(index: Double, ref: ReadVarExpr, level: Double, templateIndex: Null, meta: AST, registry: js.Any) = this()
    var _registry: js.Any = js.native
    var _unresolvedCtxCount: js.Any = js.native
    var appendTag: js.Any = js.native
    var bindings: Set[typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST] = js.native
    val icus: js.Any = js.native
    val id: Double = js.native
    val index: Double = js.native
    var isEmitted: Boolean = js.native
    val isResolved: Boolean = js.native
    val isRoot: Boolean = js.native
    val level: Double = js.native
    val meta: AST = js.native
    var placeholders: Map[String, js.Array[_]] = js.native
    val ref: ReadVarExpr = js.native
    var registry: js.UndefOr[js.Any] = js.native
    val templateIndex: Double | Null = js.native
    def appendBinding(binding: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST): Unit = js.native
    def appendBoundText(node: AST): Unit = js.native
    def appendElement(node: AST, index: Double): Unit = js.native
    def appendElement(node: AST, index: Double, closed: Boolean): Unit = js.native
    def appendIcu(name: String, ref: Expression): Unit = js.native
    def appendProjection(node: AST, index: Double): Unit = js.native
    def appendTemplate(node: AST, index: Double): Unit = js.native
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
    def forkChildContext(index: Double, templateIndex: Double, meta: AST): I18nContext = js.native
    def getSerializedPlaceholders(): Map[String, js.Array[_]] = js.native
    /**
      * Reconciles child context into parent one once the end of the i18n block is reached (i18nEnd).
      *
      * @param context Child I18nContext instance to be reconciled with parent context.
      */
    def reconcileChildContext(context: I18nContext): Unit = js.native
  }
  
}

