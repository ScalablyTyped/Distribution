package typings.atAngularCompiler.atAngularCompilerMod

import typings.atAngularCompiler.Anon_Compiler
import typings.atAngularCompiler.srcAotCompilerUnderscoreHostMod.AotCompilerHost
import typings.atAngularCompiler.srcAotCompilerUnderscoreOptionsMod.AotCompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "createAotCompiler")
@js.native
object createAotCompiler extends js.Object {
  def apply(compilerHost: AotCompilerHost, options: AotCompilerOptions): Anon_Compiler = js.native
  def apply(
    compilerHost: AotCompilerHost,
    options: AotCompilerOptions,
    errorCollector: js.Function2[/* error */ js.Any, /* type */ js.UndefOr[js.Any], Unit]
  ): Anon_Compiler = js.native
}

