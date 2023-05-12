package typings.angularCompilerCli

import typings.angularCompilerCli.anon.PartialLinkerOptions
import typings.angularCompilerCli.linkerBabelSrcLinkerPluginOptionsMod.LinkerPluginOptions
import typings.babelCore.mod.ConfigAPI
import typings.babelCore.mod.PluginObj
import typings.babelCore.mod.PluginPass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerBabelMod {
  
  @JSImport("@angular/compiler-cli/linker/babel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(api: ConfigAPI, options: PartialLinkerOptions): PluginObj[PluginPass] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PluginObj[PluginPass]]
  
  inline def createEs2015LinkerPlugin(param0: LinkerPluginOptions): PluginObj[PluginPass] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEs2015LinkerPlugin")(param0.asInstanceOf[js.Any]).asInstanceOf[PluginObj[PluginPass]]
}
