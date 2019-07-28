package typings.adone

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.adone.adoneNs.templatingNs.nunjucksNs.Environment
import typings.adone.adoneNs.templatingNs.nunjucksNs.INs.ConfigureOptions
import typings.adone.adoneNs.templatingNs.nunjucksNs.INs.EnvironmentOptions
import typings.adone.adoneNs.templatingNs.nunjucksNs.INs.FileSystemLoaderOptions
import typings.adone.adoneNs.templatingNs.nunjucksNs.INs.Loader
import typings.adone.adoneNs.templatingNs.nunjucksNs.Template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofnunjucks extends js.Object {
  var Environment: Instantiable2[
    js.UndefOr[Loader | js.Array[Loader] | Null], 
    js.UndefOr[/* opts */ EnvironmentOptions], 
    typings.adone.adoneNs.templatingNs.nunjucksNs.Environment
  ] = js.native
  var FileSystemLoader: Instantiable2[
    js.UndefOr[String | js.Array[String]], 
    js.UndefOr[/* opts */ FileSystemLoaderOptions], 
    typings.adone.adoneNs.templatingNs.nunjucksNs.FileSystemLoader
  ] = js.native
  val INs: js.Any = js.native
  var Loader: Instantiable0[typings.adone.adoneNs.templatingNs.nunjucksNs.Loader] = js.native
  var PrecompiledLoader: Instantiable0[typings.adone.adoneNs.templatingNs.nunjucksNs.PrecompiledLoader] = js.native
  var Template: Instantiable3[
    /* src */ String, 
    js.UndefOr[/* env */ Environment], 
    js.UndefOr[/* eagerCompile */ Boolean], 
    typings.adone.adoneNs.templatingNs.nunjucksNs.Template
  ] = js.native
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

