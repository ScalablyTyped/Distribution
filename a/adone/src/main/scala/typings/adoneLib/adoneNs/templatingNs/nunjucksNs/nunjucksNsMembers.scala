package typings
package adoneLib.adoneNs.templatingNs.nunjucksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.templating.nunjucks")
@js.native
object nunjucksNsMembers extends js.Object {
  def compile(src: java.lang.String): Template = js.native
  def compile(src: java.lang.String, env: Environment): Template = js.native
  def compile(src: java.lang.String, env: Environment, path: java.lang.String): Template = js.native
  def compile(src: java.lang.String, env: Environment, path: java.lang.String, eagerCompile: scala.Boolean): Template = js.native
  def configure(): Environment = js.native
  def configure(options: adoneLib.adoneNs.templatingNs.nunjucksNs.INs.ConfigureOptions): Environment = js.native
  def configure(path: java.lang.String): Environment = js.native
  def configure(path: java.lang.String, options: adoneLib.adoneNs.templatingNs.nunjucksNs.INs.ConfigureOptions): Environment = js.native
  def configure(path: js.Array[java.lang.String]): Environment = js.native
  def configure(
    path: js.Array[java.lang.String],
    options: adoneLib.adoneNs.templatingNs.nunjucksNs.INs.ConfigureOptions
  ): Environment = js.native
  def installJinjaCompat(): scala.Unit = js.native
  def render(name: java.lang.String): js.Promise[java.lang.String] = js.native
  def render(name: java.lang.String, context: js.Object): js.Promise[java.lang.String] = js.native
  def renderString(src: java.lang.String): js.Promise[java.lang.String] = js.native
  def renderString(src: java.lang.String, context: js.Object): js.Promise[java.lang.String] = js.native
  def renderStringSync(src: java.lang.String): java.lang.String = js.native
  def renderStringSync(src: java.lang.String, context: js.Object): java.lang.String = js.native
  def renderSync(name: java.lang.String): java.lang.String = js.native
  def renderSync(name: java.lang.String, context: js.Object): java.lang.String = js.native
}

