package typings.angularCompiler

import typings.angularCompiler.anon.Compiler
import typings.angularCompiler.anon.ResourceNameToFileName
import typings.angularCompiler.compilerHostMod.AotCompilerHost
import typings.angularCompiler.compilerOptionsMod.AotCompilerOptions
import typings.angularCompiler.urlResolverMod.UrlResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/aot/compiler_factory", JSImport.Namespace)
@js.native
object compilerFactoryMod extends js.Object {
  def createAotCompiler(compilerHost: AotCompilerHost, options: AotCompilerOptions): Compiler = js.native
  def createAotCompiler(
    compilerHost: AotCompilerHost,
    options: AotCompilerOptions,
    errorCollector: js.Function2[/* error */ js.Any, /* type */ js.UndefOr[js.Any], Unit]
  ): Compiler = js.native
  def createAotUrlResolver(host: ResourceNameToFileName): UrlResolver = js.native
}

