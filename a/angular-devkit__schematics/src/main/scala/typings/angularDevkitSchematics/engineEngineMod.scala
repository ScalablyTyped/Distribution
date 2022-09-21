package typings.angularDevkitSchematics

import typings.angularDevkitCore.mod.BaseException
import typings.angularDevkitSchematics.anon.SchematicDescription
import typings.angularDevkitSchematics.interfaceMod.Collection
import typings.angularDevkitSchematics.interfaceMod.CollectionDescription
import typings.angularDevkitSchematics.interfaceMod.Engine
import typings.angularDevkitSchematics.interfaceMod.EngineHost
import typings.angularDevkitSchematics.interfaceMod.Schematic
import typings.angularDevkitSchematics.interfaceMod.SchematicContext
import typings.angularDevkitSchematics.interfaceMod.TaskConfiguration
import typings.angularDevkitSchematics.interfaceMod.TaskId
import typings.angularDevkitSchematics.treeInterfaceMod.MergeStrategy
import typings.angularDevkitSchematics.workflowInterfaceMod.Workflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineEngineMod {
  
  @JSImport("@angular-devkit/schematics/src/engine/engine", "CircularCollectionException")
  @js.native
  open class CircularCollectionException protected () extends BaseException {
    def this(name: String) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine/engine", "CollectionImpl")
  @js.native
  open class CollectionImpl[CollectionT /* <: js.Object */, SchematicT /* <: js.Object */] protected ()
    extends StObject
       with Collection[CollectionT, SchematicT] {
    def this(
      _description: CollectionDescription[CollectionT],
      _engine: SchematicEngine[CollectionT, SchematicT]
    ) = this()
    def this(
      _description: CollectionDescription[CollectionT],
      _engine: SchematicEngine[CollectionT, SchematicT],
      baseDescriptions: js.Array[CollectionDescription[CollectionT]]
    ) = this()
    
    /* private */ var _description: Any = js.native
    
    /* private */ var _engine: Any = js.native
    
    @JSName("description")
    def description_MCollectionImpl: CollectionDescription[CollectionT] = js.native
    
    def name: String = js.native
  }
  
  @JSImport("@angular-devkit/schematics/src/engine/engine", "PrivateSchematicException")
  @js.native
  open class PrivateSchematicException protected () extends BaseException {
    def this(name: String, collection: typings.angularDevkitSchematics.anon.CollectionDescription) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine/engine", "SchematicEngine")
  @js.native
  open class SchematicEngine[CollectionT /* <: js.Object */, SchematicT /* <: js.Object */] protected ()
    extends StObject
       with Engine[CollectionT, SchematicT] {
    def this(_host: EngineHost[CollectionT, SchematicT]) = this()
    def this(_host: EngineHost[CollectionT, SchematicT], _workflow: Workflow) = this()
    
    /* private */ var _collectionCache: Any = js.native
    
    /* private */ var _createCollectionDescription: Any = js.native
    
    /* private */ var _host: Any = js.native
    
    /* private */ var _schematicCache: Any = js.native
    
    /* private */ var _taskSchedulers: Any = js.native
    
    /* protected */ var _workflow: js.UndefOr[Workflow] = js.native
    
    def createSchematic(name: String, collection: Collection[CollectionT, SchematicT], allowPrivate: Boolean): Schematic[CollectionT, SchematicT] = js.native
    
    @JSName("defaultMergeStrategy")
    def defaultMergeStrategy_MSchematicEngine: MergeStrategy = js.native
    
    def listSchematicNames(collection: Collection[CollectionT, SchematicT]): js.Array[String] = js.native
    def listSchematicNames(collection: Collection[CollectionT, SchematicT], includeHidden: Boolean): js.Array[String] = js.native
    
    @JSName("workflow")
    def workflow_MSchematicEngine: Workflow | Null = js.native
  }
  
  @JSImport("@angular-devkit/schematics/src/engine/engine", "SchematicEngineConflictingException")
  @js.native
  open class SchematicEngineConflictingException () extends BaseException
  
  @JSImport("@angular-devkit/schematics/src/engine/engine", "TaskScheduler")
  @js.native
  open class TaskScheduler protected () extends StObject {
    def this(_context: SchematicContext) = this()
    
    /* private */ var _calculatePriority: Any = js.native
    
    /* private */ var _context: Any = js.native
    
    /* private */ var _mapDependencies: Any = js.native
    
    /* private */ var _queue: Any = js.native
    
    /* private */ var _taskIds: Any = js.native
    
    def schedule[T /* <: js.Object */](taskConfiguration: TaskConfiguration[T]): TaskId = js.native
  }
  /* static members */
  object TaskScheduler {
    
    @JSImport("@angular-devkit/schematics/src/engine/engine", "TaskScheduler")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular-devkit/schematics/src/engine/engine", "TaskScheduler._taskIdCounter")
    @js.native
    def _taskIdCounter: Any = js.native
    inline def _taskIdCounter_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_taskIdCounter")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular-devkit/schematics/src/engine/engine", "UnknownCollectionException")
  @js.native
  open class UnknownCollectionException protected () extends BaseException {
    def this(name: String) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine/engine", "UnknownSchematicException")
  @js.native
  open class UnknownSchematicException protected () extends BaseException {
    def this(name: String, collection: typings.angularDevkitSchematics.anon.CollectionDescription) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine/engine", "UnknownTaskDependencyException")
  @js.native
  open class UnknownTaskDependencyException protected () extends BaseException {
    def this(id: TaskId) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine/engine", "UnknownUrlSourceProtocol")
  @js.native
  open class UnknownUrlSourceProtocol protected () extends BaseException {
    def this(url: String) = this()
  }
  
  @JSImport("@angular-devkit/schematics/src/engine/engine", "UnregisteredTaskException")
  @js.native
  open class UnregisteredTaskException protected () extends BaseException {
    def this(name: String) = this()
    def this(name: String, schematic: SchematicDescription) = this()
  }
}
