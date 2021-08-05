package typings.angularCompiler

import typings.angularCompiler.anon.Compiler
import typings.angularCompiler.anon.ResourceNameToFileName
import typings.angularCompiler.compilerHostMod.AotCompilerHost
import typings.angularCompiler.compilerOptionsMod.AotCompilerOptions
import typings.angularCompiler.urlResolverMod.UrlResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compilerFactoryMod {
  
  @JSImport("@angular/compiler/src/aot/compiler_factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAotCompiler(compilerHost: AotCompilerHost, options: AotCompilerOptions): Compiler = (^.asInstanceOf[js.Dynamic].applyDynamic("createAotCompiler")(compilerHost.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Compiler]
  inline def createAotCompiler(
    compilerHost: AotCompilerHost,
    options: AotCompilerOptions,
    errorCollector: js.Function2[/* error */ js.Any, /* type */ js.UndefOr[js.Any], Unit]
  ): Compiler = (^.asInstanceOf[js.Dynamic].applyDynamic("createAotCompiler")(compilerHost.asInstanceOf[js.Any], options.asInstanceOf[js.Any], errorCollector.asInstanceOf[js.Any])).asInstanceOf[Compiler]
  
  inline def createAotUrlResolver(host: ResourceNameToFileName): UrlResolver = ^.asInstanceOf[js.Dynamic].applyDynamic("createAotUrlResolver")(host.asInstanceOf[js.Any]).asInstanceOf[UrlResolver]
}
