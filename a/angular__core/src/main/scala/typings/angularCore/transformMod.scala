package typings.angularCore

import typings.angularCore.updateRecorderMod.UpdateRecorder
import typings.typescript.mod.PropertyAssignment
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/migrations/initial-navigation/transform", JSImport.Namespace)
@js.native
object transformMod extends js.Object {
  
  @js.native
  class InitialNavigationTransform protected () extends js.Object {
    def this(typeChecker: TypeChecker, getUpdateRecorder: js.Function1[/* sf */ SourceFile, UpdateRecorder]) = this()
    
    var _updateNode: js.Any = js.native
    
    var getUpdateRecorder: js.Any = js.native
    
    /** Migrate an ExtraOptions#InitialNavigation expression to use the new options format. */
    def migrateAssignment(assignment: PropertyAssignment): Unit = js.native
    
    /** Migrate the ExtraOptions#InitialNavigation property assignments. */
    def migrateInitialNavigationAssignments(literals: js.Array[PropertyAssignment]): Unit = js.native
    
    var printer: js.Any = js.native
    
    var typeChecker: js.Any = js.native
  }
}
