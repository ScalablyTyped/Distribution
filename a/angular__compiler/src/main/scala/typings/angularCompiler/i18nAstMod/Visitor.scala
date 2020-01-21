package typings.angularCompiler.i18nAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Visitor extends js.Object {
  def visitContainer(container: Container): js.Any = js.native
  def visitContainer(container: Container, context: js.Any): js.Any = js.native
  def visitIcu(icu: Icu): js.Any = js.native
  def visitIcu(icu: Icu, context: js.Any): js.Any = js.native
  def visitIcuPlaceholder(ph: IcuPlaceholder): js.Any = js.native
  def visitIcuPlaceholder(ph: IcuPlaceholder, context: js.Any): js.Any = js.native
  def visitPlaceholder(ph: Placeholder): js.Any = js.native
  def visitPlaceholder(ph: Placeholder, context: js.Any): js.Any = js.native
  def visitTagPlaceholder(ph: TagPlaceholder): js.Any = js.native
  def visitTagPlaceholder(ph: TagPlaceholder, context: js.Any): js.Any = js.native
  def visitText(text: Text): js.Any = js.native
  def visitText(text: Text, context: js.Any): js.Any = js.native
}

