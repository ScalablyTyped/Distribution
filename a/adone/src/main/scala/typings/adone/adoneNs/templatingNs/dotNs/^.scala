package typings.adone.adoneNs.templatingNs.dotNs

import org.scalablytyped.runtime.StringDictionary
import typings.adone.adoneNs.templatingNs.dotNs.INs.ProcessOptions
import typings.adone.adoneNs.templatingNs.dotNs.INs.RenderFunction
import typings.adone.adoneNs.templatingNs.dotNs.INs.TemplateSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.templating.dot")
@js.native
object ^ extends js.Object {
  var templateSettings: TemplateSettings = js.native
  val version: String = js.native
  def compile(tmpl: String): RenderFunction = js.native
  def compile(tmpl: String, `def`: js.Object): RenderFunction = js.native
  def process(): StringDictionary[RenderFunction] = js.native
  def process(options: ProcessOptions): StringDictionary[RenderFunction] = js.native
  def template(tmpl: String): RenderFunction = js.native
  def template(tmpl: String, c: TemplateSettings): RenderFunction = js.native
  def template(tmpl: String, c: TemplateSettings, `def`: js.Object): RenderFunction = js.native
}

