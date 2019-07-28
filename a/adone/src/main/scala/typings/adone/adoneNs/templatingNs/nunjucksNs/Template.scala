package typings.adone.adoneNs.templatingNs.nunjucksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.templating.nunjucks.Template")
@js.native
class Template protected () extends js.Object {
  def this(src: String) = this()
  def this(src: String, env: Environment) = this()
  def this(src: String, env: Environment, eagerCompile: Boolean) = this()
  def render(): String = js.native
  def render(context: js.Object): String = js.native
  def render(context: js.Object, callback: js.Function2[/* err */ js.Any, /* res */ String, _]): Unit = js.native
  @JSName("render")
  def render_Unit(): Unit = js.native
  @JSName("render")
  def render_Unit(context: js.Object): Unit = js.native
}

