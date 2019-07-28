package typings.adone.adoneNs.templatingNs.nunjucksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.templating.nunjucks.Loader")
@js.native
class Loader () extends js.Object {
  def emit(name: String, args: js.Any*): Unit = js.native
  def extend(toExtend: typings.adone.adoneNs.templatingNs.nunjucksNs.INs.Loader): typings.adone.adoneNs.templatingNs.nunjucksNs.INs.Loader = js.native
  def isRelative(filename: String): Boolean = js.native
  def on(name: String, func: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def resolve(from: String, to: String): String = js.native
}

