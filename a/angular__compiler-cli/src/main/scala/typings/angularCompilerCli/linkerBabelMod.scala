package typings.angularCompilerCli

import typings.angularCompilerCli.anon.PartialLinkerOptions
import typings.angularCompilerCli.linkerBabelSrcBabelCoreMod.ConfigAPI
import typings.angularCompilerCli.linkerBabelSrcBabelCoreMod.PluginObj
import typings.angularCompilerCli.linkerBabelSrcLinkerPluginOptionsMod.LinkerPluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerBabelMod {
  
  @JSImport("@angular/compiler-cli/linker/babel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(api: ConfigAPI, options: PartialLinkerOptions): PluginObj = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PluginObj]
  
  inline def createEs2015LinkerPlugin(hasFileSystemLoggerOptions: LinkerPluginOptions): PluginObj = ^.asInstanceOf[js.Dynamic].applyDynamic("createEs2015LinkerPlugin")(hasFileSystemLoggerOptions.asInstanceOf[js.Any]).asInstanceOf[PluginObj]
}
