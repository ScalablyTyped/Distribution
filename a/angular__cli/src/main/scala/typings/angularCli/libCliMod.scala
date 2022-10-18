package typings.angularCli

import typings.angularCli.anon.CliArgs
import typings.angularCli.srcUtilitiesVersionMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCliMod {
  
  @JSImport("@angular/cli/lib/cli", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: CliArgs): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  
  @JSImport("@angular/cli/lib/cli", "VERSION")
  @js.native
  val VERSION: Version = js.native
}
