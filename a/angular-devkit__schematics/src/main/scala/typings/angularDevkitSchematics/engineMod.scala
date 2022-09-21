package typings.angularDevkitSchematics

import typings.angularDevkitSchematics.interfaceMod.Collection
import typings.angularDevkitSchematics.interfaceMod.CollectionDescription
import typings.angularDevkitSchematics.interfaceMod.Engine
import typings.angularDevkitSchematics.interfaceMod.EngineHost
import typings.angularDevkitSchematics.interfaceMod.RuleFactory
import typings.angularDevkitSchematics.interfaceMod.SchematicContext
import typings.angularDevkitSchematics.interfaceMod.SchematicDescription
import typings.angularDevkitSchematics.interfaceMod.TaskId
import typings.angularDevkitSchematics.workflowInterfaceMod.Workflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineMod {
  
  @JSImport("@angular-devkit/schematics/src/engine", "CircularCollectionException")
  @js.native
  open class CircularCollectionException protected ()
    extends typings.angularDevkitSchematics.engineEngineMod.CircularCollectionException {
    def this(name: String) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine", "CollectionImpl")
  @js.native
  open class CollectionImpl[CollectionT /* <: js.Object */, SchematicT /* <: js.Object */] protected ()
    extends typings.angularDevkitSchematics.engineEngineMod.CollectionImpl[CollectionT, SchematicT] {
    def this(
      _description: CollectionDescription[CollectionT],
      _engine: typings.angularDevkitSchematics.engineEngineMod.SchematicEngine[CollectionT, SchematicT]
    ) = this()
    def this(
      _description: CollectionDescription[CollectionT],
      _engine: typings.angularDevkitSchematics.engineEngineMod.SchematicEngine[CollectionT, SchematicT],
      baseDescriptions: js.Array[CollectionDescription[CollectionT]]
    ) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine", "InvalidSchematicsNameException")
  @js.native
  open class InvalidSchematicsNameException protected ()
    extends typings.angularDevkitSchematics.schematicMod.InvalidSchematicsNameException {
    def this(name: String) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine", "PrivateSchematicException")
  @js.native
  open class PrivateSchematicException protected ()
    extends typings.angularDevkitSchematics.engineEngineMod.PrivateSchematicException {
    def this(name: String, collection: typings.angularDevkitSchematics.anon.CollectionDescription) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine", "SchematicEngine")
  @js.native
  open class SchematicEngine[CollectionT /* <: js.Object */, SchematicT /* <: js.Object */] protected ()
    extends typings.angularDevkitSchematics.engineEngineMod.SchematicEngine[CollectionT, SchematicT] {
    def this(_host: EngineHost[CollectionT, SchematicT]) = this()
    def this(_host: EngineHost[CollectionT, SchematicT], _workflow: Workflow) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine", "SchematicEngineConflictingException")
  @js.native
  open class SchematicEngineConflictingException ()
    extends typings.angularDevkitSchematics.engineEngineMod.SchematicEngineConflictingException
  
  @JSImport("@angular-devkit/schematics/src/engine", "SchematicImpl")
  @js.native
  open class SchematicImpl[CollectionT /* <: js.Object */, SchematicT /* <: js.Object */] protected ()
    extends typings.angularDevkitSchematics.schematicMod.SchematicImpl[CollectionT, SchematicT] {
    def this(
      _description: SchematicDescription[CollectionT, SchematicT],
      _factory: RuleFactory[js.Object],
      _collection: Collection[CollectionT, SchematicT],
      _engine: Engine[CollectionT, SchematicT]
    ) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine", "TaskScheduler")
  @js.native
  open class TaskScheduler protected ()
    extends typings.angularDevkitSchematics.engineEngineMod.TaskScheduler {
    def this(_context: SchematicContext) = this()
  }
  /* static members */
  object TaskScheduler {
    
    @JSImport("@angular-devkit/schematics/src/engine", "TaskScheduler")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular-devkit/schematics/src/engine", "TaskScheduler._taskIdCounter")
    @js.native
    def _taskIdCounter: Any = js.native
    inline def _taskIdCounter_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_taskIdCounter")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular-devkit/schematics/src/engine", "UnknownCollectionException")
  @js.native
  open class UnknownCollectionException protected ()
    extends typings.angularDevkitSchematics.engineEngineMod.UnknownCollectionException {
    def this(name: String) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine", "UnknownSchematicException")
  @js.native
  open class UnknownSchematicException protected ()
    extends typings.angularDevkitSchematics.engineEngineMod.UnknownSchematicException {
    def this(name: String, collection: typings.angularDevkitSchematics.anon.CollectionDescription) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine", "UnknownTaskDependencyException")
  @js.native
  open class UnknownTaskDependencyException protected ()
    extends typings.angularDevkitSchematics.engineEngineMod.UnknownTaskDependencyException {
    def this(id: TaskId) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine", "UnknownUrlSourceProtocol")
  @js.native
  open class UnknownUrlSourceProtocol protected ()
    extends typings.angularDevkitSchematics.engineEngineMod.UnknownUrlSourceProtocol {
    def this(url: String) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine", "UnregisteredTaskException")
  @js.native
  open class UnregisteredTaskException protected ()
    extends typings.angularDevkitSchematics.engineEngineMod.UnregisteredTaskException {
    def this(name: String) = this()
    def this(name: String, schematic: typings.angularDevkitSchematics.anon.SchematicDescription) = this()
  }
}
