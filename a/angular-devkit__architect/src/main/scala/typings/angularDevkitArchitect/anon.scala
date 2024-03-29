package typings.angularDevkitArchitect

import typings.angularDevkitArchitect.srcApiMod.BuilderInfo
import typings.angularDevkitArchitect.srcApiMod.Target
import typings.angularDevkitArchitect.srcApiMod.TypedBuilderProgress
import typings.angularDevkitArchitect.srcJobsApiMod.JobName
import typings.angularDevkitArchitect.srcJobsApiMod.Scheduler
import typings.angularDevkitArchitect.srcJobsTypesMod.DeepReadonly
import typings.angularDevkitArchitect.srcProgressSchemaMod.State.Running
import typings.angularDevkitArchitect.srcProgressSchemaMod.State.Stopped
import typings.angularDevkitArchitect.srcProgressSchemaMod.State.Waiting
import typings.angularDevkitCore.srcJsonSchemaSchemaMod.JsonSchema
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typings.angularDevkitCore.srcLoggerLoggerMod.LoggerApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Builder extends StObject {
    
    var builder: BuilderInfo
    
    var target: js.UndefOr[Target] = js.undefined
  }
  object Builder {
    
    inline def apply(builder: BuilderInfo): Builder = {
      val __obj = js.Dynamic.literal(builder = builder.asInstanceOf[js.Any])
      __obj.asInstanceOf[Builder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Builder] (val x: Self) extends AnyVal {
      
      inline def setBuilder(value: BuilderInfo): Self = StObject.set(x, "builder", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait Current
    extends StObject
       with TypedBuilderProgress {
    
    var current: Double
    
    var state: Running
    
    var status: js.UndefOr[String] = js.undefined
    
    var total: js.UndefOr[Double] = js.undefined
  }
  object Current {
    
    inline def apply(current: Double, state: Running): Current = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Current]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Current] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setState(value: Running): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
  
  trait CurrentDirectory extends StObject {
    
    var currentDirectory: String | js.Promise[String]
    
    var logger: LoggerApi
    
    var scheduler: Scheduler[JsonValue, JsonValue, JsonValue]
    
    var target: js.UndefOr[Target] = js.undefined
    
    var workspaceRoot: String | js.Promise[String]
  }
  object CurrentDirectory {
    
    inline def apply(
      currentDirectory: String | js.Promise[String],
      logger: LoggerApi,
      scheduler: Scheduler[JsonValue, JsonValue, JsonValue],
      workspaceRoot: String | js.Promise[String]
    ): CurrentDirectory = {
      val __obj = js.Dynamic.literal(currentDirectory = currentDirectory.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], scheduler = scheduler.asInstanceOf[js.Any], workspaceRoot = workspaceRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentDirectory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CurrentDirectory] (val x: Self) extends AnyVal {
      
      inline def setCurrentDirectory(value: String | js.Promise[String]): Self = StObject.set(x, "currentDirectory", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: LoggerApi): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setScheduler(value: Scheduler[JsonValue, JsonValue, JsonValue]): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setWorkspaceRoot(value: String | js.Promise[String]): Self = StObject.set(x, "workspaceRoot", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error
    extends StObject
       with TypedBuilderProgress {
    
    var error: JsonValue
    
    var state: typings.angularDevkitArchitect.srcProgressSchemaMod.State.Error
  }
  object Error {
    
    inline def apply(state: typings.angularDevkitArchitect.srcProgressSchemaMod.State.Error): Error = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], error = null)
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      inline def setError(value: JsonValue): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setState(value: typings.angularDevkitArchitect.srcProgressSchemaMod.State.Error): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait Logger extends StObject {
    
    var currentDirectory: String | js.Promise[String]
    
    var logger: LoggerApi
    
    var scheduler: Scheduler[JsonValue, JsonValue, JsonValue]
    
    var workspaceRoot: String | js.Promise[String]
  }
  object Logger {
    
    inline def apply(
      currentDirectory: String | js.Promise[String],
      logger: LoggerApi,
      scheduler: Scheduler[JsonValue, JsonValue, JsonValue],
      workspaceRoot: String | js.Promise[String]
    ): Logger = {
      val __obj = js.Dynamic.literal(currentDirectory = currentDirectory.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], scheduler = scheduler.asInstanceOf[js.Any], workspaceRoot = workspaceRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      inline def setCurrentDirectory(value: String | js.Promise[String]): Self = StObject.set(x, "currentDirectory", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: LoggerApi): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setScheduler(value: Scheduler[JsonValue, JsonValue, JsonValue]): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceRoot(value: String | js.Promise[String]): Self = StObject.set(x, "workspaceRoot", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@angular-devkit/architect.@angular-devkit/architect/src/jobs/api.JobDescription> */
  trait PartialJobDescription extends StObject {
    
    var argument: js.UndefOr[DeepReadonly[JsonSchema]] = js.undefined
    
    var input: js.UndefOr[DeepReadonly[JsonSchema]] = js.undefined
    
    var name: js.UndefOr[JobName] = js.undefined
    
    var output: js.UndefOr[DeepReadonly[JsonSchema]] = js.undefined
  }
  object PartialJobDescription {
    
    inline def apply(): PartialJobDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialJobDescription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialJobDescription] (val x: Self) extends AnyVal {
      
      inline def setArgument(value: DeepReadonly[JsonSchema]): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
      
      inline def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
      
      inline def setInput(value: DeepReadonly[JsonSchema]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setName(value: JobName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOutput(value: DeepReadonly[JsonSchema]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Readonly<@angular-devkit/architect.@angular-devkit/architect/src/jobs/api.JobDescription>> */
  trait PartialReadonlyJobDescrip extends StObject {
    
    var argument: js.UndefOr[DeepReadonly[JsonSchema]] = js.undefined
    
    var input: js.UndefOr[DeepReadonly[JsonSchema]] = js.undefined
    
    var name: js.UndefOr[JobName] = js.undefined
    
    var output: js.UndefOr[DeepReadonly[JsonSchema]] = js.undefined
  }
  object PartialReadonlyJobDescrip {
    
    inline def apply(): PartialReadonlyJobDescrip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialReadonlyJobDescrip]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialReadonlyJobDescrip] (val x: Self) extends AnyVal {
      
      inline def setArgument(value: DeepReadonly[JsonSchema]): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
      
      inline def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
      
      inline def setInput(value: DeepReadonly[JsonSchema]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setName(value: JobName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOutput(value: DeepReadonly[JsonSchema]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@angular-devkit/architect.@angular-devkit/architect/src/jobs/types.Readwrite<@angular-devkit/architect.@angular-devkit/architect/src/jobs/api.JobDescription>> */
  trait PartialReadwriteJobDescri extends StObject {
    
    var argument: js.UndefOr[DeepReadonly[JsonSchema]] = js.undefined
    
    var input: js.UndefOr[DeepReadonly[JsonSchema]] = js.undefined
    
    var name: js.UndefOr[JobName] = js.undefined
    
    var output: js.UndefOr[DeepReadonly[JsonSchema]] = js.undefined
  }
  object PartialReadwriteJobDescri {
    
    inline def apply(): PartialReadwriteJobDescri = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialReadwriteJobDescri]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialReadwriteJobDescri] (val x: Self) extends AnyVal {
      
      inline def setArgument(value: DeepReadonly[JsonSchema]): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
      
      inline def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
      
      inline def setInput(value: DeepReadonly[JsonSchema]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setName(value: JobName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOutput(value: DeepReadonly[JsonSchema]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    }
  }
  
  /* Inlined @angular-devkit/architect.@angular-devkit/architect/src/jobs/simple-registry.RegisterJobOptions & {  name :string} */
  trait RegisterJobOptionsnamestr extends StObject {
    
    var argument: js.UndefOr[DeepReadonly[JsonSchema]] = js.undefined
    
    var input: js.UndefOr[DeepReadonly[JsonSchema]] = js.undefined
    
    var name: js.UndefOr[JobName] = js.undefined
    
    var output: js.UndefOr[DeepReadonly[JsonSchema]] = js.undefined
  }
  object RegisterJobOptionsnamestr {
    
    inline def apply(): RegisterJobOptionsnamestr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegisterJobOptionsnamestr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegisterJobOptionsnamestr] (val x: Self) extends AnyVal {
      
      inline def setArgument(value: DeepReadonly[JsonSchema]): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
      
      inline def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
      
      inline def setInput(value: DeepReadonly[JsonSchema]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setName(value: JobName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOutput(value: DeepReadonly[JsonSchema]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    }
  }
  
  trait State
    extends StObject
       with TypedBuilderProgress {
    
    var state: Stopped
  }
  object State {
    
    inline def apply(state: Stopped): State = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setState(value: Stopped): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait Status
    extends StObject
       with TypedBuilderProgress {
    
    var state: Waiting
    
    var status: js.UndefOr[String] = js.undefined
  }
  object Status {
    
    inline def apply(state: Waiting): Status = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Status]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
      
      inline def setState(value: Waiting): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
