package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofdot extends js.Object {
  val INs: js.Any = js.native
  var templateSettings: adoneLib.adoneNs.templatingNs.dotNs.INs.TemplateSettings = js.native
  val version: java.lang.String = js.native
  def compile(tmpl: java.lang.String): adoneLib.adoneNs.templatingNs.dotNs.INs.RenderFunction = js.native
  def compile(tmpl: java.lang.String, `def`: js.Object): adoneLib.adoneNs.templatingNs.dotNs.INs.RenderFunction = js.native
  def process(): org.scalablytyped.runtime.StringDictionary[adoneLib.adoneNs.templatingNs.dotNs.INs.RenderFunction] = js.native
  def process(options: adoneLib.adoneNs.templatingNs.dotNs.INs.ProcessOptions): org.scalablytyped.runtime.StringDictionary[adoneLib.adoneNs.templatingNs.dotNs.INs.RenderFunction] = js.native
  def template(tmpl: java.lang.String): adoneLib.adoneNs.templatingNs.dotNs.INs.RenderFunction = js.native
  def template(tmpl: java.lang.String, c: adoneLib.adoneNs.templatingNs.dotNs.INs.TemplateSettings): adoneLib.adoneNs.templatingNs.dotNs.INs.RenderFunction = js.native
  def template(
    tmpl: java.lang.String,
    c: adoneLib.adoneNs.templatingNs.dotNs.INs.TemplateSettings,
    `def`: js.Object
  ): adoneLib.adoneNs.templatingNs.dotNs.INs.RenderFunction = js.native
}

