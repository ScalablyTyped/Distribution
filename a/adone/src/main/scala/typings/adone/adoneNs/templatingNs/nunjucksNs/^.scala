package typings.adone.adoneNs.templatingNs.nunjucksNs

import typings.adone.adoneNs.templatingNs.nunjucksNs.INs.ConfigureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.templating.nunjucks")
@js.native
object ^ extends js.Object {
  def compile(src: String): Template = js.native
  def compile(src: String, env: Environment): Template = js.native
  def compile(src: String, env: Environment, path: String): Template = js.native
  def compile(src: String, env: Environment, path: String, eagerCompile: Boolean): Template = js.native
  def configure(): Environment = js.native
  def configure(options: ConfigureOptions): Environment = js.native
  def configure(path: String): Environment = js.native
  def configure(path: String, options: ConfigureOptions): Environment = js.native
  def configure(path: js.Array[String]): Environment = js.native
  def configure(path: js.Array[String], options: ConfigureOptions): Environment = js.native
  def installJinjaCompat(): Unit = js.native
  def render(name: String): js.Promise[String] = js.native
  def render(name: String, context: js.Object): js.Promise[String] = js.native
  def renderString(src: String): js.Promise[String] = js.native
  def renderString(src: String, context: js.Object): js.Promise[String] = js.native
  def renderStringSync(src: String): String = js.native
  def renderStringSync(src: String, context: js.Object): String = js.native
  def renderSync(name: String): String = js.native
  def renderSync(name: String, context: js.Object): String = js.native
}

