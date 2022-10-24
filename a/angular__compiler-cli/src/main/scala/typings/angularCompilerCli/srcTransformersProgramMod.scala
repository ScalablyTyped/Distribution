package typings.angularCompilerCli

import typings.angularCompilerCli.anon.Host
import typings.angularCompilerCli.srcTransformersApiMod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTransformersProgramMod {
  
  @JSImport("@angular/compiler-cli/src/transformers/program", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createProgram(param0: Host): Program = ^.asInstanceOf[js.Dynamic].applyDynamic("createProgram")(param0.asInstanceOf[js.Any]).asInstanceOf[Program]
}
