package typings.angularDevkitArchitect

import org.scalablytyped.runtime.StringDictionary
import typings.angularDevkitArchitect.anon.Builder
import typings.angularDevkitArchitect.srcInputSchemaMod.Schema
import typings.angularDevkitArchitect.srcProgressSchemaMod.State
import typings.angularDevkitArchitect.srcProgressSchemaMod.State.Running
import typings.angularDevkitArchitect.srcProgressSchemaMod.State.Stopped
import typings.angularDevkitArchitect.srcProgressSchemaMod.State.Waiting
import typings.angularDevkitCore.mod.logging.Logger
import typings.angularDevkitCore.srcAnalyticsApiMod.Analytics
import typings.angularDevkitCore.srcExperimentalJobsApiMod.Registry
import typings.angularDevkitCore.srcJsonSchemaSchemaMod.JsonSchema
import typings.angularDevkitCore.srcJsonUtilsMod.JsonObject
import typings.angularDevkitCore.srcLoggerLoggerMod.LoggerApi
import typings.rxjs.distTypesInternalTypesMod.SubscribableOrPromise
import typings.rxjs.mod.Observable_
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcApiMod {
  
  @JSImport("@angular-devkit/architect/src/api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/architect/src/api", "BuilderProgressState")
  @js.native
  object BuilderProgressState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[State & String] = js.native
    
    /* "error" */ val Error: typings.angularDevkitArchitect.srcProgressSchemaMod.State.Error & String = js.native
    
    /* "running" */ val Running: typings.angularDevkitArchitect.srcProgressSchemaMod.State.Running & String = js.native
    
    /* "stopped" */ val Stopped: typings.angularDevkitArchitect.srcProgressSchemaMod.State.Stopped & String = js.native
    
    /* "waiting" */ val Waiting: typings.angularDevkitArchitect.srcProgressSchemaMod.State.Waiting & String = js.native
  }
  
  inline def fromAsyncIterable[T](iterable: AsyncIterable[T]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAsyncIterable")(iterable.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  
  inline def isBuilderOutput(obj: Any): /* is @angular-devkit/architect.@angular-devkit/architect/src/api.BuilderOutput */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuilderOutput")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @angular-devkit/architect.@angular-devkit/architect/src/api.BuilderOutput */ Boolean]
  
  inline def scheduleTargetAndForget(context: BuilderContext, target: Target): Observable_[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleTargetAndForget")(context.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuilderOutput]]
  inline def scheduleTargetAndForget(context: BuilderContext, target: Target, overrides: Unit, scheduleOptions: ScheduleOptions): Observable_[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleTargetAndForget")(context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], scheduleOptions.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuilderOutput]]
  inline def scheduleTargetAndForget(context: BuilderContext, target: Target, overrides: JsonObject): Observable_[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleTargetAndForget")(context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuilderOutput]]
  inline def scheduleTargetAndForget(context: BuilderContext, target: Target, overrides: JsonObject, scheduleOptions: ScheduleOptions): Observable_[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleTargetAndForget")(context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], scheduleOptions.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuilderOutput]]
  
  inline def targetFromTargetString(str: String): Target = ^.asInstanceOf[js.Dynamic].applyDynamic("targetFromTargetString")(str.asInstanceOf[js.Any]).asInstanceOf[Target]
  
  inline def targetStringFromTarget(hasProjectTargetConfiguration: Target): String = ^.asInstanceOf[js.Dynamic].applyDynamic("targetStringFromTarget")(hasProjectTargetConfiguration.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @js.native
  trait BuilderContext extends StObject {
    
    /**
      * Add teardown logic to this Context, so that when it's being stopped it will execute teardown.
      */
    def addTeardown(teardown: js.Function0[js.Promise[Unit] | Unit]): Unit = js.native
    
    /**
      * API to report analytics. This might be undefined if the feature is unsupported. This might
      * not be undefined, but the backend could also not report anything.
      */
    val analytics: Analytics = js.native
    
    /**
      * The builder info that called your function. Since the builder info is from the builder.json
      * (or the host), it could contain information that is different than expected.
      */
    var builder: BuilderInfo = js.native
    
    /**
      * The current directory the user is in. This could be outside the workspace root. This is a
      * system path and will not be normalized; ie. on Windows it will starts with `C:\\` (or
      * whatever drive).
      */
    var currentDirectory: String = js.native
    
    /**
      * Resolves and return a builder name. The exact format of the name is up to the host,
      * so it should not be parsed to gather information (it's free form). This string can be
      * used to validate options or schedule a builder directly.
      * @param target The target to resolve the builder name.
      */
    def getBuilderNameForTarget(target: Target): js.Promise[String] = js.native
    
    def getProjectMetadata(projectName: String): js.Promise[JsonObject] = js.native
    def getProjectMetadata(target: Target): js.Promise[JsonObject] = js.native
    
    /**
      * Resolve and return options for a specified target. If the target isn't defined in the
      * workspace this will reject the promise. This object will be read directly from the workspace
      * but not validated against the builder of the target.
      * @param target The target to resolve the options of.
      * @return A non-validated object resolved from the workspace.
      */
    def getTargetOptions(target: Target): js.Promise[JsonObject] = js.native
    
    /**
      * Unique amongst contexts. Contexts instances are not guaranteed to be the same (but it could
      * be the same context), and all the fields in a context could be the same, yet the builder's
      * context could be different. This is the same ID as the corresponding run.
      */
    var id: Double = js.native
    
    /**
      * A logger that appends messages to a log. This could be a separate interface or completely
      * ignored. `console.log` could also be completely ignored.
      */
    var logger: LoggerApi = js.native
    
    /**
      * Update the progress for this builder run.
      * @param current The current progress. This will be between 0 and total.
      * @param total A new total to set. By default at the start of a run this is 1. If omitted it
      *     will use the same value as the last total.
      * @param status Update the status string. If omitted the status string is not modified.
      */
    def reportProgress(current: Double): Unit = js.native
    def reportProgress(current: Double, total: Double): Unit = js.native
    def reportProgress(current: Double, total: Double, status: String): Unit = js.native
    def reportProgress(current: Double, total: Unit, status: String): Unit = js.native
    
    /**
      * Set the builder to running. This should be used if an external event triggered a re-run,
      * e.g. a file watched was changed.
      */
    def reportRunning(): Unit = js.native
    
    /**
      * Update the status string shown on the interface.
      * @param status The status to set it to. An empty string can be used to remove the status.
      */
    def reportStatus(status: String): Unit = js.native
    
    /**
      * Schedule a builder by its name. This can be the same builder that is being executed.
      * @param builderName The name of the builder, ie. its `packageName:builderName` tuple.
      * @param options All options to use for the builder (by default empty object). There is no
      *     additional options added, e.g. from the workspace.
      * @param scheduleOptions Additional optional scheduling options.
      * @return A promise of a run. It will resolve when all the members of the run are available.
      */
    def scheduleBuilder(builderName: String): js.Promise[BuilderRun] = js.native
    def scheduleBuilder(builderName: String, options: Unit, scheduleOptions: ScheduleOptions): js.Promise[BuilderRun] = js.native
    def scheduleBuilder(builderName: String, options: JsonObject): js.Promise[BuilderRun] = js.native
    def scheduleBuilder(builderName: String, options: JsonObject, scheduleOptions: ScheduleOptions): js.Promise[BuilderRun] = js.native
    
    /**
      * Schedule a target in the same workspace. This can be the same target that is being executed
      * right now, but targets of the same name are serialized.
      * Running the same target and waiting for it to end will result in a deadlocking scenario.
      * Targets are considered the same if the project, the target AND the configuration are the same.
      * @param target The target to schedule.
      * @param overrides A set of options to override the workspace set of options.
      * @param scheduleOptions Additional optional scheduling options.
      * @return A promise of a run. It will resolve when all the members of the run are available.
      */
    def scheduleTarget(target: Target): js.Promise[BuilderRun] = js.native
    def scheduleTarget(target: Target, overrides: Unit, scheduleOptions: ScheduleOptions): js.Promise[BuilderRun] = js.native
    def scheduleTarget(target: Target, overrides: JsonObject): js.Promise[BuilderRun] = js.native
    def scheduleTarget(target: Target, overrides: JsonObject, scheduleOptions: ScheduleOptions): js.Promise[BuilderRun] = js.native
    
    /**
      * The target that was used to run this builder.
      * Target is optional if a builder was ran using `scheduleBuilder()`.
      */
    var target: js.UndefOr[Target] = js.native
    
    /**
      * Validates the options against a builder schema. This uses the same methods as the
      * scheduleTarget and scheduleBrowser methods to validate and apply defaults to the options.
      * It can be generically typed, if you know which interface it is supposed to validate against.
      * @param options A generic option object to validate.
      * @param builderName The name of a builder to use. This can be gotten for a target by using the
      *                    getBuilderForTarget() method on the context.
      */
    def validateOptions[T /* <: JsonObject */](options: JsonObject, builderName: String): js.Promise[T] = js.native
    
    /**
      * The absolute workspace root of this run. This is a system path and will not be normalized;
      * ie. on Windows it will starts with `C:\\` (or whatever drive).
      */
    var workspaceRoot: String = js.native
  }
  
  type BuilderHandlerFn[A] = js.Function2[/* input */ A, /* context */ BuilderContext, BuilderOutputLike]
  
  trait BuilderInfo
    extends StObject
       with JsonObject {
    
    var builderName: String
    
    var description: String
    
    var optionSchema: JsonSchema
  }
  object BuilderInfo {
    
    inline def apply(builderName: String, description: String, optionSchema: JsonSchema): BuilderInfo = {
      val __obj = js.Dynamic.literal(builderName = builderName.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], optionSchema = optionSchema.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuilderInfo]
    }
    
    extension [Self <: BuilderInfo](x: Self) {
      
      inline def setBuilderName(value: String): Self = StObject.set(x, "builderName", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setOptionSchema(value: JsonSchema): Self = StObject.set(x, "optionSchema", value.asInstanceOf[js.Any])
    }
  }
  
  trait BuilderInput
    extends StObject
       with JsonObject
       with Schema
  object BuilderInput {
    
    inline def apply(currentDirectory: String, id: Double, info: StringDictionary[Any], workspaceRoot: String): BuilderInput = {
      val __obj = js.Dynamic.literal(currentDirectory = currentDirectory.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], workspaceRoot = workspaceRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuilderInput]
    }
  }
  
  trait BuilderOutput
    extends StObject
       with JsonObject
       with typings.angularDevkitArchitect.srcOutputSchemaMod.Schema
  object BuilderOutput {
    
    inline def apply(success: Boolean): BuilderOutput = {
      val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuilderOutput]
    }
  }
  
  type BuilderOutputLike = AsyncIterable[BuilderOutput] | SubscribableOrPromise[BuilderOutput] | BuilderOutput
  
  type BuilderProgress = JsonObject & typings.angularDevkitArchitect.srcProgressSchemaMod.Schema & TypedBuilderProgress
  
  type BuilderProgressReport = BuilderProgress & Builder
  
  type BuilderRegistry = Registry[JsonObject, BuilderInput, BuilderOutput]
  
  trait BuilderRun extends StObject {
    
    /**
      * Unique amongst runs. This is the same ID as the context generated for the run. It can be
      * used to identify multiple unique runs. There is no guarantee that a run is a single output;
      * a builder can rebuild on its own and will generate multiple outputs.
      */
    var id: Double
    
    /**
      * The builder information.
      */
    var info: BuilderInfo
    
    /**
      * The output(s) from the builder. A builder can have multiple outputs.
      * This always replay the last output when subscribed.
      */
    var output: Observable_[BuilderOutput]
    
    /**
      * The progress report. A progress also contains an ID, which can be different than this run's
      * ID (if the builder calls scheduleBuilder or scheduleTarget).
      * This will always replay the last progress on new subscriptions.
      */
    var progress: Observable_[BuilderProgressReport]
    
    /**
      * The next output from a builder. This is recommended when scheduling a builder and only being
      * interested in the result of that single run, not of a watch-mode builder.
      */
    var result: js.Promise[BuilderOutput]
    
    /**
      * Stop the builder from running. Returns a promise that resolves when the builder is stopped.
      * Some builders might not handle stopping properly and should have a timeout here.
      */
    def stop(): js.Promise[Unit]
  }
  object BuilderRun {
    
    inline def apply(
      id: Double,
      info: BuilderInfo,
      output: Observable_[BuilderOutput],
      progress: Observable_[BuilderProgressReport],
      result: js.Promise[BuilderOutput],
      stop: () => js.Promise[Unit]
    ): BuilderRun = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[BuilderRun]
    }
    
    extension [Self <: BuilderRun](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: BuilderInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: Observable_[BuilderOutput]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: Observable_[BuilderProgressReport]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setResult(value: js.Promise[BuilderOutput]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setStop(value: () => js.Promise[Unit]): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  trait ScheduleOptions extends StObject {
    
    /**
      * Logger to pass to the builder. Note that messages will stop being forwarded, and if you want
      * to log a builder scheduled from your builder you should forward log events yourself.
      */
    var logger: js.UndefOr[Logger] = js.undefined
    
    /**
      * Target to pass to the builder.
      */
    var target: js.UndefOr[Target] = js.undefined
  }
  object ScheduleOptions {
    
    inline def apply(): ScheduleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScheduleOptions]
    }
    
    extension [Self <: ScheduleOptions](x: Self) {
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait Target
    extends StObject
       with JsonObject
       with typings.angularDevkitArchitect.srcInputSchemaMod.Target
  object Target {
    
    inline def apply(project: String, target: String): Target = {
      val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularDevkitArchitect.anon.State
    - typings.angularDevkitArchitect.anon.Error
    - typings.angularDevkitArchitect.anon.Status
    - typings.angularDevkitArchitect.anon.Current
  */
  trait TypedBuilderProgress extends StObject
  object TypedBuilderProgress {
    
    inline def Current(current: Double, state: Running): typings.angularDevkitArchitect.anon.Current = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularDevkitArchitect.anon.Current]
    }
    
    inline def Error(state: typings.angularDevkitArchitect.srcProgressSchemaMod.State.Error): typings.angularDevkitArchitect.anon.Error = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], error = null)
      __obj.asInstanceOf[typings.angularDevkitArchitect.anon.Error]
    }
    
    inline def State(state: Stopped): typings.angularDevkitArchitect.anon.State = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularDevkitArchitect.anon.State]
    }
    
    inline def Status(state: Waiting): typings.angularDevkitArchitect.anon.Status = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularDevkitArchitect.anon.Status]
    }
  }
}
