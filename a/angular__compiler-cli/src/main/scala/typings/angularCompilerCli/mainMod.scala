package typings.angularCompilerCli

import typings.angularCompilerCli.ngccOptionsMod.AsyncNgccOptions
import typings.angularCompilerCli.ngccOptionsMod.SyncNgccOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mainMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/main", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mainNgcc(options: AsyncNgccOptions): Unit | js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mainNgcc")(options.asInstanceOf[js.Any]).asInstanceOf[Unit | js.Promise[Unit]]
  inline def mainNgcc(options: SyncNgccOptions): Unit | js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mainNgcc")(options.asInstanceOf[js.Any]).asInstanceOf[Unit | js.Promise[Unit]]
}
