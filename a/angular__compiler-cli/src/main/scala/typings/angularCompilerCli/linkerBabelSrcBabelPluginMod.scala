package typings.angularCompilerCli

import typings.angularCompilerCli.anon.PartialLinkerOptions
import typings.angularCompilerCli.linkerBabelSrcBabelCoreMod.ConfigAPI
import typings.angularCompilerCli.linkerBabelSrcBabelCoreMod.PluginObj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerBabelSrcBabelPluginMod {
  
  @JSImport("@angular/compiler-cli/linker/babel/src/babel_plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultLinkerPlugin(api: ConfigAPI, options: PartialLinkerOptions): PluginObj = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultLinkerPlugin")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PluginObj]
}
