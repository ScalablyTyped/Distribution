package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/compiler_factory", JSImport.Namespace)
@js.native
object srcAotCompilerUnderscoreFactoryMod extends js.Object {
  def createAotCompiler(
    compilerHost: atAngularCompilerLib.srcAotCompilerUnderscoreHostMod.AotCompilerHost,
    options: atAngularCompilerLib.srcAotCompilerUnderscoreOptionsMod.AotCompilerOptions
  ): atAngularCompilerLib.Anon_Reflector = js.native
  def createAotCompiler(
    compilerHost: atAngularCompilerLib.srcAotCompilerUnderscoreHostMod.AotCompilerHost,
    options: atAngularCompilerLib.srcAotCompilerUnderscoreOptionsMod.AotCompilerOptions,
    errorCollector: js.Function2[/* error */ js.Any, /* type */ js.UndefOr[js.Any], scala.Unit]
  ): atAngularCompilerLib.Anon_Reflector = js.native
  def createAotUrlResolver(host: atAngularCompilerLib.Anon_ResourceNameToFileName): atAngularCompilerLib.srcUrlUnderscoreResolverMod.UrlResolver = js.native
}

