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
  
  inline def createCompilerHost(hasOptionsTsHost: Options): CompilerHost = ^.asInstanceOf[js.Dynamic].applyDynamic("createCompilerHost")(hasOptionsTsHost.asInstanceOf[js.Any]).asInstanceOf[CompilerHost]
  
  inline def createProgram(hasRootNamesOptionsHostOldProgram: Host): Program = ^.asInstanceOf[js.Dynamic].applyDynamic("createProgram")(hasRootNamesOptionsHostOldProgram.asInstanceOf[js.Any]).asInstanceOf[Program]
}
