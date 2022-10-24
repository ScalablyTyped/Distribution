package typings.angularCompilerCli

import typings.angularCompilerCli.anon.Host
import typings.angularCompilerCli.anon.Options
import typings.angularCompilerCli.srcTransformersApiMod.CompilerHost
import typings.angularCompilerCli.srcTransformersApiMod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTransformersEntryPointsMod {
  
  @JSImport("@angular/compiler-cli/src/transformers/entry_points", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCompilerHost(param0: Options): CompilerHost = ^.asInstanceOf[js.Dynamic].applyDynamic("createCompilerHost")(param0.asInstanceOf[js.Any]).asInstanceOf[CompilerHost]
  
  inline def createProgram(param0: Host): Program = ^.asInstanceOf[js.Dynamic].applyDynamic("createProgram")(param0.asInstanceOf[js.Any]).asInstanceOf[Program]
}
