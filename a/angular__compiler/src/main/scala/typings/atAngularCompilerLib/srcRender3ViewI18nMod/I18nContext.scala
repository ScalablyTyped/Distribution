package typings
package atAngularCompilerLib.srcRender3ViewI18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/i18n", "I18nContext")
@js.native
class I18nContext protected () extends js.Object {
  def this(index: scala.Double, templateIndex: scala.Double, ref: js.Any) = this()
  def this(index: scala.Double, templateIndex: scala.Null, ref: js.Any) = this()
  def this(index: scala.Double, templateIndex: scala.Double, ref: js.Any, level: scala.Double) = this()
  def this(index: scala.Double, templateIndex: scala.Null, ref: js.Any, level: scala.Double) = this()
  def this(index: scala.Double, templateIndex: scala.Double, ref: js.Any, level: scala.Double, uniqueIdGen: js.Function0[scala.Double]) = this()
  def this(index: scala.Double, templateIndex: scala.Null, ref: js.Any, level: scala.Double, uniqueIdGen: js.Function0[scala.Double]) = this()
  var append: js.Any = js.native
  var bindings: js.Any = js.native
  var content: js.Any = js.native
  var genTemplatePattern: js.Any = js.native
  var id: js.Any = js.native
  var index: js.Any = js.native
  var level: js.Any = js.native
  var ref: js.Any = js.native
  var templateIndex: js.Any = js.native
  var uniqueIdGen: js.UndefOr[js.Any] = js.native
  var wrap: js.Any = js.native
  def appendBinding(binding: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression): scala.Unit = js.native
  def appendElement(elementIndex: scala.Double): scala.Unit = js.native
  def appendElement(elementIndex: scala.Double, closed: scala.Boolean): scala.Unit = js.native
  def appendTemplate(index: scala.Double): scala.Unit = js.native
  def appendText(content: java.lang.String): scala.Unit = js.native
  def forkChildContext(index: scala.Double, templateIndex: scala.Double): I18nContext = js.native
  def getBindings(): stdLib.Set[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression] = js.native
  def getContent(): java.lang.String = js.native
  def getId(): scala.Double = js.native
  def getIndex(): scala.Double = js.native
  def getRef(): js.Any = js.native
  def getTemplateIndex(): scala.Double | scala.Null = js.native
  def isResolved(): scala.Boolean = js.native
  def isRoot(): scala.Boolean = js.native
  def reconcileChildContext(context: I18nContext): scala.Unit = js.native
}

