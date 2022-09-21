package typings.angularCompilerCli

import typings.angularCompilerCli.babelCoreMod.PluginObj
import typings.angularCompilerCli.linkerPluginOptionsMod.LinkerPluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es2015LinkerPluginMod {
  
  @JSImport("@angular/compiler-cli/linker/babel/src/es2015_linker_plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEs2015LinkerPlugin(hasFileSystemLoggerOptions: LinkerPluginOptions): PluginObj = ^.asInstanceOf[js.Dynamic].applyDynamic("createEs2015LinkerPlugin")(hasFileSystemLoggerOptions.asInstanceOf[js.Any]).asInstanceOf[PluginObj]
}
