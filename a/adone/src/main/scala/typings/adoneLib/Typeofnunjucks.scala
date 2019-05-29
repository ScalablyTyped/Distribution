package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofnunjucks extends js.Object {
  var Environment: org.scalablytyped.runtime.Instantiable2[
    js.UndefOr[
      adoneLib.adoneNs.templatingNs.nunjucksNs.INs.Loader | js.Array[adoneLib.adoneNs.templatingNs.nunjucksNs.INs.Loader] | scala.Null
    ], 
    js.UndefOr[/* opts */ adoneLib.adoneNs.templatingNs.nunjucksNs.INs.EnvironmentOptions], 
    adoneLib.adoneNs.templatingNs.nunjucksNs.Environment
  ] = js.native
  var FileSystemLoader: org.scalablytyped.runtime.Instantiable2[
    js.UndefOr[java.lang.String | js.Array[java.lang.String]], 
    js.UndefOr[/* opts */ adoneLib.adoneNs.templatingNs.nunjucksNs.INs.FileSystemLoaderOptions], 
    adoneLib.adoneNs.templatingNs.nunjucksNs.FileSystemLoader
  ] = js.native
  val INs: js.Any = js.native
  var Loader: org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.templatingNs.nunjucksNs.Loader] = js.native
  var PrecompiledLoader: org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.templatingNs.nunjucksNs.PrecompiledLoader] = js.native
  var Template: org.scalablytyped.runtime.Instantiable3[
    /* src */ java.lang.String, 
    js.UndefOr[/* env */ adoneLib.adoneNs.templatingNs.nunjucksNs.Environment], 
    js.UndefOr[/* eagerCompile */ scala.Boolean], 
    adoneLib.adoneNs.templatingNs.nunjucksNs.Template
  ] = js.native
  def compile(src: java.lang.String): adoneLib.adoneNs.templatingNs.nunjucksNs.Template = js.native
  def compile(src: java.lang.String, env: adoneLib.adoneNs.templatingNs.nunjucksNs.Environment): adoneLib.adoneNs.templatingNs.nunjucksNs.Template = js.native
  def compile(
    src: java.lang.String,
    env: adoneLib.adoneNs.templatingNs.nunjucksNs.Environment,
    path: java.lang.String
  ): adoneLib.adoneNs.templatingNs.nunjucksNs.Template = js.native
  def compile(
    src: java.lang.String,
    env: adoneLib.adoneNs.templatingNs.nunjucksNs.Environment,
    path: java.lang.String,
    eagerCompile: scala.Boolean
  ): adoneLib.adoneNs.templatingNs.nunjucksNs.Template = js.native
  def configure(): adoneLib.adoneNs.templatingNs.nunjucksNs.Environment = js.native
  def configure(options: adoneLib.adoneNs.templatingNs.nunjucksNs.INs.ConfigureOptions): adoneLib.adoneNs.templatingNs.nunjucksNs.Environment = js.native
  def configure(path: java.lang.String): adoneLib.adoneNs.templatingNs.nunjucksNs.Environment = js.native
  def configure(path: java.lang.String, options: adoneLib.adoneNs.templatingNs.nunjucksNs.INs.ConfigureOptions): adoneLib.adoneNs.templatingNs.nunjucksNs.Environment = js.native
  def configure(path: js.Array[java.lang.String]): adoneLib.adoneNs.templatingNs.nunjucksNs.Environment = js.native
  def configure(
    path: js.Array[java.lang.String],
    options: adoneLib.adoneNs.templatingNs.nunjucksNs.INs.ConfigureOptions
  ): adoneLib.adoneNs.templatingNs.nunjucksNs.Environment = js.native
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

