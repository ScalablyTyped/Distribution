package typings.angularCli

import typings.angularCli.anon.Error
import typings.angularDevkitCore.loggerLoggerMod.LoggerApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicWorkflowMod {
  
  @JSImport("@angular/cli/src/command-builder/utilities/schematic-workflow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def subscribeToWorkflow(
    workflow: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeWorkflow */ Any,
    logger: LoggerApi
  ): Error = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribeToWorkflow")(workflow.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[Error]
}
