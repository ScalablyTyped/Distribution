package typings.angularDevkitSchematics

import typings.angularDevkitCore.srcLoggerLoggerMod.LoggerApi
import typings.angularDevkitSchematics.anon.Extends
import typings.angularDevkitSchematics.anon.PartialExecutionOptions
import typings.angularDevkitSchematics.srcTreeInterfaceMod.FileEntry
import typings.angularDevkitSchematics.srcTreeInterfaceMod.MergeStrategy
import typings.angularDevkitSchematics.srcTreeInterfaceMod.Tree
import typings.angularDevkitSchematics.srcWorkflowInterfaceMod.Workflow
import typings.node.urlMod.Url
import typings.rxjs.mod.Observable_
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcEngineInterfaceMod {
  
  type AsyncFileOperator = js.Function1[/* tree */ FileEntry, Observable_[FileEntry | Null]]
  
  @js.native
  trait Collection[CollectionMetadataT /* <: js.Object */, SchematicMetadataT /* <: js.Object */] extends StObject {
    
    val baseDescriptions: js.UndefOr[js.Array[CollectionDescription[CollectionMetadataT]]] = js.native
    
    def createSchematic(name: String): Schematic[CollectionMetadataT, SchematicMetadataT] = js.native
    def createSchematic(name: String, allowPrivate: Boolean): Schematic[CollectionMetadataT, SchematicMetadataT] = js.native
    
    val description: CollectionDescription[CollectionMetadataT] = js.native
    
    def listSchematicNames(): js.Array[String] = js.native
    def listSchematicNames(includeHidden: Boolean): js.Array[String] = js.native
  }
  
  type CollectionDescription[CollectionMetadataT /* <: js.Object */] = CollectionMetadataT & Extends
  
  @js.native
  trait Engine[CollectionMetadataT /* <: js.Object */, SchematicMetadataT /* <: js.Object */] extends StObject {
    
    def createCollection(name: String): Collection[CollectionMetadataT, SchematicMetadataT] = js.native
    def createCollection(name: String, requester: Collection[CollectionMetadataT, SchematicMetadataT]): Collection[CollectionMetadataT, SchematicMetadataT] = js.native
    
    def createContext(schematic: Schematic[CollectionMetadataT, SchematicMetadataT]): TypedSchematicContext[CollectionMetadataT, SchematicMetadataT] = js.native
    def createContext(
      schematic: Schematic[CollectionMetadataT, SchematicMetadataT],
      parent: Unit,
      executionOptions: PartialExecutionOptions
    ): TypedSchematicContext[CollectionMetadataT, SchematicMetadataT] = js.native
    def createContext(
      schematic: Schematic[CollectionMetadataT, SchematicMetadataT],
      parent: Partial[TypedSchematicContext[CollectionMetadataT, SchematicMetadataT]]
    ): TypedSchematicContext[CollectionMetadataT, SchematicMetadataT] = js.native
    def createContext(
      schematic: Schematic[CollectionMetadataT, SchematicMetadataT],
      parent: Partial[TypedSchematicContext[CollectionMetadataT, SchematicMetadataT]],
      executionOptions: PartialExecutionOptions
    ): TypedSchematicContext[CollectionMetadataT, SchematicMetadataT] = js.native
    
    def createSchematic(name: String, collection: Collection[CollectionMetadataT, SchematicMetadataT]): Schematic[CollectionMetadataT, SchematicMetadataT] = js.native
    
    def createSourceFromUrl(url: Url, context: TypedSchematicContext[CollectionMetadataT, SchematicMetadataT]): Source = js.native
    
    val defaultMergeStrategy: MergeStrategy = js.native
    
    def executePostTasks(): Observable_[Unit] = js.native
    
    def transformOptions[OptionT /* <: js.Object */, ResultT /* <: js.Object */](schematic: Schematic[CollectionMetadataT, SchematicMetadataT], options: OptionT): Observable_[ResultT] = js.native
    def transformOptions[OptionT /* <: js.Object */, ResultT /* <: js.Object */](
      schematic: Schematic[CollectionMetadataT, SchematicMetadataT],
      options: OptionT,
      context: TypedSchematicContext[CollectionMetadataT, SchematicMetadataT]
    ): Observable_[ResultT] = js.native
    
    val workflow: Workflow | Null = js.native
  }
  
  @js.native
  trait EngineHost[CollectionMetadataT /* <: js.Object */, SchematicMetadataT /* <: js.Object */] extends StObject {
    
    def createCollectionDescription(name: String): CollectionDescription[CollectionMetadataT] = js.native
    def createCollectionDescription(name: String, requester: CollectionDescription[CollectionMetadataT]): CollectionDescription[CollectionMetadataT] = js.native
    
    def createSchematicDescription(name: String, collection: CollectionDescription[CollectionMetadataT]): (SchematicDescription[CollectionMetadataT, SchematicMetadataT]) | Null = js.native
    
    def createSourceFromUrl(url: Url, context: TypedSchematicContext[CollectionMetadataT, SchematicMetadataT]): Source | Null = js.native
    
    def createTaskExecutor(name: String): Observable_[TaskExecutor[js.Object]] = js.native
    
    val defaultMergeStrategy: js.UndefOr[MergeStrategy] = js.native
    
    def getSchematicRuleFactory[OptionT /* <: js.Object */](
      schematic: SchematicDescription[CollectionMetadataT, SchematicMetadataT],
      collection: CollectionDescription[CollectionMetadataT]
    ): RuleFactory[OptionT] = js.native
    
    def hasTaskExecutor(name: String): Boolean = js.native
    
    def listSchematicNames(collection: CollectionDescription[CollectionMetadataT]): js.Array[String] = js.native
    def listSchematicNames(collection: CollectionDescription[CollectionMetadataT], includeHidden: Boolean): js.Array[String] = js.native
    
    def transformContext(context: TypedSchematicContext[CollectionMetadataT, SchematicMetadataT]): (TypedSchematicContext[CollectionMetadataT, SchematicMetadataT]) | Unit = js.native
    
    def transformOptions[OptionT /* <: js.Object */, ResultT /* <: js.Object */](schematic: SchematicDescription[CollectionMetadataT, SchematicMetadataT], options: OptionT): Observable_[ResultT] = js.native
    def transformOptions[OptionT /* <: js.Object */, ResultT /* <: js.Object */](
      schematic: SchematicDescription[CollectionMetadataT, SchematicMetadataT],
      options: OptionT,
      context: TypedSchematicContext[CollectionMetadataT, SchematicMetadataT]
    ): Observable_[ResultT] = js.native
  }
  
  trait ExecutionOptions extends StObject {
    
    var interactive: Boolean
    
    var scope: String
  }
  object ExecutionOptions {
    
    inline def apply(interactive: Boolean, scope: String): ExecutionOptions = {
      val __obj = js.Dynamic.literal(interactive = interactive.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecutionOptions]
    }
    
    extension [Self <: ExecutionOptions](x: Self) {
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  type FileOperator = js.Function1[/* entry */ FileEntry, FileEntry | Null]
  
  @js.native
  trait Rule extends StObject {
    
    def apply(tree: Tree, context: SchematicContext): Tree | Observable_[Tree] | Rule | (js.Promise[Unit | Rule]) | Unit = js.native
  }
  
  @js.native
  trait RuleFactory[T /* <: js.Object */] extends StObject {
    
    def apply(options: T): Rule = js.native
  }
  
  @js.native
  trait Schematic[CollectionMetadataT /* <: js.Object */, SchematicMetadataT /* <: js.Object */] extends StObject {
    
    def call[OptionT /* <: js.Object */](options: OptionT, host: Observable_[Tree]): Observable_[Tree] = js.native
    def call[OptionT /* <: js.Object */](
      options: OptionT,
      host: Observable_[Tree],
      parentContext: Unit,
      executionOptions: PartialExecutionOptions
    ): Observable_[Tree] = js.native
    def call[OptionT /* <: js.Object */](
      options: OptionT,
      host: Observable_[Tree],
      parentContext: Partial[TypedSchematicContext[CollectionMetadataT, SchematicMetadataT]]
    ): Observable_[Tree] = js.native
    def call[OptionT /* <: js.Object */](
      options: OptionT,
      host: Observable_[Tree],
      parentContext: Partial[TypedSchematicContext[CollectionMetadataT, SchematicMetadataT]],
      executionOptions: PartialExecutionOptions
    ): Observable_[Tree] = js.native
    
    val collection: Collection[CollectionMetadataT, SchematicMetadataT] = js.native
    
    val description: SchematicDescription[CollectionMetadataT, SchematicMetadataT] = js.native
  }
  
  type SchematicContext = TypedSchematicContext[js.Object, js.Object]
  
  type SchematicDescription[CollectionMetadataT /* <: js.Object */, SchematicMetadataT /* <: js.Object */] = SchematicMetadataT & typings.angularDevkitSchematics.anon.Collection[CollectionMetadataT]
  
  type Source = js.Function1[/* context */ SchematicContext, Tree | Observable_[Tree]]
  
  trait TaskConfiguration[T] extends StObject {
    
    var dependencies: js.UndefOr[js.Array[TaskId]] = js.undefined
    
    var name: String
    
    var options: js.UndefOr[T] = js.undefined
  }
  object TaskConfiguration {
    
    inline def apply[T](name: String): TaskConfiguration[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskConfiguration[T]]
    }
    
    extension [Self <: TaskConfiguration[?], T](x: Self & TaskConfiguration[T]) {
      
      inline def setDependencies(value: js.Array[TaskId]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDependenciesVarargs(value: TaskId*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: T): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait TaskConfigurationGenerator[T] extends StObject {
    
    def toConfiguration(): TaskConfiguration[T]
  }
  object TaskConfigurationGenerator {
    
    inline def apply[T](toConfiguration: () => TaskConfiguration[T]): TaskConfigurationGenerator[T] = {
      val __obj = js.Dynamic.literal(toConfiguration = js.Any.fromFunction0(toConfiguration))
      __obj.asInstanceOf[TaskConfigurationGenerator[T]]
    }
    
    extension [Self <: TaskConfigurationGenerator[?], T](x: Self & TaskConfigurationGenerator[T]) {
      
      inline def setToConfiguration(value: () => TaskConfiguration[T]): Self = StObject.set(x, "toConfiguration", js.Any.fromFunction0(value))
    }
  }
  
  type TaskExecutor[T] = js.Function2[
    /* options */ js.UndefOr[T], 
    /* context */ SchematicContext, 
    js.Promise[Unit] | Observable_[Unit]
  ]
  
  @js.native
  trait TaskExecutorFactory[T] extends StObject {
    
    def create(): js.Promise[TaskExecutor[js.Object]] | Observable_[TaskExecutor[js.Object]] = js.native
    def create(options: T): js.Promise[TaskExecutor[js.Object]] | Observable_[TaskExecutor[js.Object]] = js.native
    
    val name: String = js.native
  }
  
  trait TaskId extends StObject {
    
    val id: Double
  }
  object TaskId {
    
    inline def apply(id: Double): TaskId = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskId]
    }
    
    extension [Self <: TaskId](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskInfo extends StObject {
    
    val configuration: TaskConfiguration[js.Object]
    
    val context: SchematicContext
    
    val id: Double
    
    val priority: Double
  }
  object TaskInfo {
    
    inline def apply(
      configuration: TaskConfiguration[js.Object],
      context: SchematicContext,
      id: Double,
      priority: Double
    ): TaskInfo = {
      val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskInfo]
    }
    
    extension [Self <: TaskInfo](x: Self) {
      
      inline def setConfiguration(value: TaskConfiguration[js.Object]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setContext(value: SchematicContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypedSchematicContext[CollectionMetadataT /* <: js.Object */, SchematicMetadataT /* <: js.Object */] extends StObject {
    
    def addTask[T /* <: js.Object */](task: TaskConfigurationGenerator[T]): TaskId = js.native
    def addTask[T /* <: js.Object */](task: TaskConfigurationGenerator[T], dependencies: js.Array[TaskId]): TaskId = js.native
    
    val debug: Boolean = js.native
    
    val engine: Engine[CollectionMetadataT, SchematicMetadataT] = js.native
    
    val interactive: Boolean = js.native
    
    val logger: LoggerApi = js.native
    
    val schematic: Schematic[CollectionMetadataT, SchematicMetadataT] = js.native
    
    val strategy: MergeStrategy = js.native
  }
}
