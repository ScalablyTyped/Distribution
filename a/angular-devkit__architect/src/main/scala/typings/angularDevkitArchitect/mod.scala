package typings.angularDevkitArchitect

import typings.angularDevkitArchitect.anon.PartialJobDescription
import typings.angularDevkitArchitect.anon.PartialReadwriteJobDescri
import typings.angularDevkitArchitect.srcApiMod.BuilderContext
import typings.angularDevkitArchitect.srcApiMod.BuilderHandlerFn
import typings.angularDevkitArchitect.srcApiMod.BuilderInfo
import typings.angularDevkitArchitect.srcApiMod.BuilderOutput
import typings.angularDevkitArchitect.srcApiMod.ScheduleOptions
import typings.angularDevkitArchitect.srcApiMod.Target
import typings.angularDevkitArchitect.srcInternalMod.ArchitectHost
import typings.angularDevkitArchitect.srcInternalMod.Builder
import typings.angularDevkitArchitect.srcJobsApiMod.JobHandler
import typings.angularDevkitArchitect.srcJobsApiMod.JobName
import typings.angularDevkitArchitect.srcJobsApiMod.Registry
import typings.angularDevkitArchitect.srcJobsCreateJobHandlerMod.SimpleJobHandlerFn
import typings.angularDevkitArchitect.srcJobsDispatcherMod.JobDispatcher
import typings.angularDevkitArchitect.srcJobsStrategyMod.strategy.JobStrategy
import typings.angularDevkitArchitect.srcProgressSchemaMod.State
import typings.angularDevkitCore.srcJsonSchemaInterfaceMod.SchemaRegistry
import typings.angularDevkitCore.srcJsonSchemaInterfaceMod.SchemaValidatorError
import typings.angularDevkitCore.srcJsonUtilsMod.JsonObject
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typings.angularDevkitCore.srcLoggerLoggerMod.LoggerApi
import typings.rxjs.mod.Observable_
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@angular-devkit/architect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/architect", "Architect")
  @js.native
  open class Architect protected ()
    extends typings.angularDevkitArchitect.srcArchitectMod.Architect {
    def this(_host: ArchitectHost[BuilderInfo]) = this()
    def this(_host: ArchitectHost[BuilderInfo], registry: SchemaRegistry) = this()
    def this(
      _host: ArchitectHost[BuilderInfo],
      registry: Unit,
      additionalJobRegistry: Registry[JsonValue, JsonValue, JsonValue]
    ) = this()
    def this(
      _host: ArchitectHost[BuilderInfo],
      registry: SchemaRegistry,
      additionalJobRegistry: Registry[JsonValue, JsonValue, JsonValue]
    ) = this()
  }
  
  @JSImport("@angular-devkit/architect", "BuilderProgressState")
  @js.native
  object BuilderProgressState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[State & String] = js.native
    
    /* "error" */ val Error: typings.angularDevkitArchitect.srcProgressSchemaMod.State.Error & String = js.native
    
    /* "running" */ val Running: typings.angularDevkitArchitect.srcProgressSchemaMod.State.Running & String = js.native
    
    /* "stopped" */ val Stopped: typings.angularDevkitArchitect.srcProgressSchemaMod.State.Stopped & String = js.native
    
    /* "waiting" */ val Waiting: typings.angularDevkitArchitect.srcProgressSchemaMod.State.Waiting & String = js.native
  }
  
  inline def createBuilder[OptT, OutT /* <: BuilderOutput */](fn: BuilderHandlerFn[OptT]): Builder[OptT & JsonObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuilder")(fn.asInstanceOf[js.Any]).asInstanceOf[Builder[OptT & JsonObject]]
  
  inline def fromAsyncIterable[T](iterable: AsyncIterable[T]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAsyncIterable")(iterable.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  
  inline def isBuilderOutput(obj: Any): /* is @angular-devkit/architect.@angular-devkit/architect/src/api.BuilderOutput */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuilderOutput")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @angular-devkit/architect.@angular-devkit/architect/src/api.BuilderOutput */ Boolean]
  
  object jobs {
    
    @JSImport("@angular-devkit/architect", "jobs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular-devkit/architect", "jobs.ChannelAlreadyExistException")
    @js.native
    open class ChannelAlreadyExistException protected ()
      extends typings.angularDevkitArchitect.srcJobsMod.ChannelAlreadyExistException {
      def this(name: String) = this()
    }
    
    @JSImport("@angular-devkit/architect", "jobs.FallbackRegistry")
    @js.native
    open class FallbackRegistry[MinimumArgumentValueT /* <: JsonValue */, MinimumInputValueT /* <: JsonValue */, MinimumOutputValueT /* <: JsonValue */] ()
      extends typings.angularDevkitArchitect.srcJobsMod.FallbackRegistry[MinimumArgumentValueT, MinimumInputValueT, MinimumOutputValueT] {
      def this(_fallbacks: js.Array[Registry[MinimumArgumentValueT, MinimumInputValueT, MinimumOutputValueT]]) = this()
    }
    
    @JSImport("@angular-devkit/architect", "jobs.JobArgumentSchemaValidationError")
    @js.native
    open class JobArgumentSchemaValidationError ()
      extends typings.angularDevkitArchitect.srcJobsMod.JobArgumentSchemaValidationError {
      def this(errors: js.Array[SchemaValidatorError]) = this()
    }
    
    @JSImport("@angular-devkit/architect", "jobs.JobDoesNotExistException")
    @js.native
    open class JobDoesNotExistException protected ()
      extends typings.angularDevkitArchitect.srcJobsMod.JobDoesNotExistException {
      def this(name: JobName) = this()
    }
    
    @JSImport("@angular-devkit/architect", "jobs.JobInboundMessageKind")
    @js.native
    object JobInboundMessageKind extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.angularDevkitArchitect.srcJobsApiMod.JobInboundMessageKind & String] = js.native
      
      /* "in" */ val Input: typings.angularDevkitArchitect.srcJobsApiMod.JobInboundMessageKind.Input & String = js.native
      
      /* "ip" */ val Ping: typings.angularDevkitArchitect.srcJobsApiMod.JobInboundMessageKind.Ping & String = js.native
      
      /* "is" */ val Stop: typings.angularDevkitArchitect.srcJobsApiMod.JobInboundMessageKind.Stop & String = js.native
    }
    
    @JSImport("@angular-devkit/architect", "jobs.JobInboundMessageSchemaValidationError")
    @js.native
    open class JobInboundMessageSchemaValidationError ()
      extends typings.angularDevkitArchitect.srcJobsMod.JobInboundMessageSchemaValidationError {
      def this(errors: js.Array[SchemaValidatorError]) = this()
    }
    
    @JSImport("@angular-devkit/architect", "jobs.JobNameAlreadyRegisteredException")
    @js.native
    open class JobNameAlreadyRegisteredException protected ()
      extends typings.angularDevkitArchitect.srcJobsMod.JobNameAlreadyRegisteredException {
      def this(name: JobName) = this()
    }
    
    @JSImport("@angular-devkit/architect", "jobs.JobOutboundMessageKind")
    @js.native
    object JobOutboundMessageKind extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind & String] = js.native
      
      /* "cc" */ val ChannelComplete: typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.ChannelComplete & String = js.native
      
      /* "cn" */ val ChannelCreate: typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.ChannelCreate & String = js.native
      
      /* "ce" */ val ChannelError: typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.ChannelError & String = js.native
      
      /* "cm" */ val ChannelMessage: typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.ChannelMessage & String = js.native
      
      /* "e" */ val End: typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.End & String = js.native
      
      /* "c" */ val OnReady: typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.OnReady & String = js.native
      
      /* "o" */ val Output: typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.Output & String = js.native
      
      /* "p" */ val Pong: typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.Pong & String = js.native
      
      /* "s" */ val Start: typings.angularDevkitArchitect.srcJobsApiMod.JobOutboundMessageKind.Start & String = js.native
    }
    
    @JSImport("@angular-devkit/architect", "jobs.JobOutputSchemaValidationError")
    @js.native
    open class JobOutputSchemaValidationError ()
      extends typings.angularDevkitArchitect.srcJobsMod.JobOutputSchemaValidationError {
      def this(errors: js.Array[SchemaValidatorError]) = this()
    }
    
    @JSImport("@angular-devkit/architect", "jobs.JobState")
    @js.native
    object JobState extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.angularDevkitArchitect.srcJobsApiMod.JobState & String] = js.native
      
      /* "ended" */ val Ended: typings.angularDevkitArchitect.srcJobsApiMod.JobState.Ended & String = js.native
      
      /* "errored" */ val Errored: typings.angularDevkitArchitect.srcJobsApiMod.JobState.Errored & String = js.native
      
      /* "queued" */ val Queued: typings.angularDevkitArchitect.srcJobsApiMod.JobState.Queued & String = js.native
      
      /* "ready" */ val Ready: typings.angularDevkitArchitect.srcJobsApiMod.JobState.Ready & String = js.native
      
      /* "started" */ val Started: typings.angularDevkitArchitect.srcJobsApiMod.JobState.Started & String = js.native
    }
    
    @JSImport("@angular-devkit/architect", "jobs.SimpleJobRegistry")
    @js.native
    open class SimpleJobRegistry[MinimumArgumentValueT /* <: JsonValue */, MinimumInputValueT /* <: JsonValue */, MinimumOutputValueT /* <: JsonValue */] ()
      extends typings.angularDevkitArchitect.srcJobsMod.SimpleJobRegistry[MinimumArgumentValueT, MinimumInputValueT, MinimumOutputValueT]
    
    @JSImport("@angular-devkit/architect", "jobs.SimpleScheduler")
    @js.native
    open class SimpleScheduler[MinimumArgumentT /* <: JsonValue */, MinimumInputT /* <: JsonValue */, MinimumOutputT /* <: JsonValue */] protected ()
      extends typings.angularDevkitArchitect.srcJobsMod.SimpleScheduler[MinimumArgumentT, MinimumInputT, MinimumOutputT] {
      def this(_jobRegistry: Registry[MinimumArgumentT, MinimumInputT, MinimumOutputT]) = this()
      def this(
        _jobRegistry: Registry[MinimumArgumentT, MinimumInputT, MinimumOutputT],
        _schemaRegistry: SchemaRegistry
      ) = this()
    }
    
    inline def createDispatcher[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](): JobDispatcher[A, I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDispatcher")().asInstanceOf[JobDispatcher[A, I, O]]
    inline def createDispatcher[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](options: PartialReadwriteJobDescri): JobDispatcher[A, I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDispatcher")(options.asInstanceOf[js.Any]).asInstanceOf[JobDispatcher[A, I, O]]
    
    inline def createJobFactory[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](loader: js.Function0[js.Promise[JobHandler[A, I, O]]]): JobHandler[A, I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("createJobFactory")(loader.asInstanceOf[js.Any]).asInstanceOf[JobHandler[A, I, O]]
    inline def createJobFactory[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](loader: js.Function0[js.Promise[JobHandler[A, I, O]]], options: PartialJobDescription): JobHandler[A, I, O] = (^.asInstanceOf[js.Dynamic].applyDynamic("createJobFactory")(loader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JobHandler[A, I, O]]
    
    inline def createJobHandler[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](fn: SimpleJobHandlerFn[A, I, O]): JobHandler[A, I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("createJobHandler")(fn.asInstanceOf[js.Any]).asInstanceOf[JobHandler[A, I, O]]
    inline def createJobHandler[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](fn: SimpleJobHandlerFn[A, I, O], options: PartialJobDescription): JobHandler[A, I, O] = (^.asInstanceOf[js.Dynamic].applyDynamic("createJobHandler")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JobHandler[A, I, O]]
    
    inline def createLoggerJob[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](job: JobHandler[A, I, O], logger: LoggerApi): JobHandler[A, I, O] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLoggerJob")(job.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[JobHandler[A, I, O]]
    
    inline def isJobHandler[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](value: Any): /* is @angular-devkit/architect.@angular-devkit/architect/src/jobs/api.JobHandler<A, I, O> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJobHandler")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @angular-devkit/architect.@angular-devkit/architect/src/jobs/api.JobHandler<A, I, O> */ Boolean]
    
    object strategy {
      
      @JSImport("@angular-devkit/architect", "jobs.strategy")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a JobStrategy that will reuse a running job if the argument matches.
        * @param replayMessages Replay ALL messages if a job is reused, otherwise just hook up where it
        * is.
        */
      inline def memoize[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](): JobStrategy[A, I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("memoize")().asInstanceOf[JobStrategy[A, I, O]]
      inline def memoize[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](replayMessages: Boolean): JobStrategy[A, I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(replayMessages.asInstanceOf[js.Any]).asInstanceOf[JobStrategy[A, I, O]]
      
      /**
        * Creates a JobStrategy that will always reuse a running job, and restart it if the job ended.
        * @param replayMessages Replay ALL messages if a job is reused, otherwise just hook up where it
        * is.
        */
      inline def reuse[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](): JobStrategy[A, I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("reuse")().asInstanceOf[JobStrategy[A, I, O]]
      inline def reuse[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](replayMessages: Boolean): JobStrategy[A, I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("reuse")(replayMessages.asInstanceOf[js.Any]).asInstanceOf[JobStrategy[A, I, O]]
      
      /**
        * Creates a JobStrategy that serializes every call. This strategy can be mixed between jobs.
        */
      inline def serialize[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](): JobStrategy[A, I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")().asInstanceOf[JobStrategy[A, I, O]]
    }
  }
  
  inline def scheduleTargetAndForget(context: BuilderContext, target: Target): Observable_[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleTargetAndForget")(context.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuilderOutput]]
  inline def scheduleTargetAndForget(context: BuilderContext, target: Target, overrides: Unit, scheduleOptions: ScheduleOptions): Observable_[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleTargetAndForget")(context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], scheduleOptions.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuilderOutput]]
  inline def scheduleTargetAndForget(context: BuilderContext, target: Target, overrides: JsonObject): Observable_[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleTargetAndForget")(context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuilderOutput]]
  inline def scheduleTargetAndForget(context: BuilderContext, target: Target, overrides: JsonObject, scheduleOptions: ScheduleOptions): Observable_[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleTargetAndForget")(context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], scheduleOptions.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuilderOutput]]
  
  inline def targetFromTargetString(str: String): Target = ^.asInstanceOf[js.Dynamic].applyDynamic("targetFromTargetString")(str.asInstanceOf[js.Any]).asInstanceOf[Target]
  
  inline def targetStringFromTarget(param0: Target): String = ^.asInstanceOf[js.Dynamic].applyDynamic("targetStringFromTarget")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
}
