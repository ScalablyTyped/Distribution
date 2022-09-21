package typings.angularDevkitSchematics.mod

import typings.angularDevkitSchematics.workflowBaseMod.BaseWorkflowOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workflow {
  
  @JSImport("@angular-devkit/schematics", "workflow.BaseWorkflow")
  @js.native
  abstract class BaseWorkflow protected ()
    extends typings.angularDevkitSchematics.workflowMod.BaseWorkflow {
    def this(options: BaseWorkflowOptions) = this()
  }
}
