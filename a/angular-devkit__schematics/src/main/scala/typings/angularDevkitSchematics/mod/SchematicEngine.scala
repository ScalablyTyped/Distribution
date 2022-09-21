package typings.angularDevkitSchematics.mod

import typings.angularDevkitSchematics.interfaceMod.EngineHost
import typings.angularDevkitSchematics.workflowInterfaceMod.Workflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular-devkit/schematics", "SchematicEngine")
@js.native
open class SchematicEngine[CollectionT /* <: js.Object */, SchematicT /* <: js.Object */] protected ()
  extends typings.angularDevkitSchematics.engineMod.SchematicEngine[CollectionT, SchematicT] {
  def this(_host: EngineHost[CollectionT, SchematicT]) = this()
  def this(_host: EngineHost[CollectionT, SchematicT], _workflow: Workflow) = this()
}
