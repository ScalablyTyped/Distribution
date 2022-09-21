package typings.angularCompilerCli

import typings.angularCompilerCli.apiMod.CreateCompileFn
import typings.angularCompilerCli.loggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workerMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/execution/cluster/worker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def startWorker(logger: Logger, createCompileFn: CreateCompileFn): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWorker")(logger.asInstanceOf[js.Any], createCompileFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
