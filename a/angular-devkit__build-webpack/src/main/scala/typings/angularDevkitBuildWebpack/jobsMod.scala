package typings.angularDevkitBuildWebpack

import typings.angularDevkitBuildWebpack.anon.PartialJobDescription
import typings.angularDevkitBuildWebpack.anon.PartialReadwriteJobDescri
import typings.angularDevkitBuildWebpack.createJobHandlerMod.SimpleJobHandlerFn
import typings.angularDevkitBuildWebpack.dispatcherMod.JobDispatcher
import typings.angularDevkitBuildWebpack.interfaceMod.SchemaRegistry
import typings.angularDevkitBuildWebpack.interfaceMod.SchemaValidatorError
import typings.angularDevkitBuildWebpack.jobsApiMod.JobHandler
import typings.angularDevkitBuildWebpack.jobsApiMod.JobName
import typings.angularDevkitBuildWebpack.jobsApiMod.Registry
import typings.angularDevkitBuildWebpack.loggerLoggerMod.LoggerApi
import typings.angularDevkitBuildWebpack.strategyMod.strategy.JobStrategy
import typings.angularDevkitBuildWebpack.utilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jobsMod {
  
  @JSImport("@angular-devkit/build-webpack/core/src/experimental/jobs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/build-webpack/core/src/experimental/jobs", "ChannelAlreadyExistException")
  @js.native
  open class ChannelAlreadyExistException protected ()
    extends typings.angularDevkitBuildWebpack.createJobHandlerMod.ChannelAlreadyExistException {
    def this(name: String) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/experimental/jobs", "FallbackRegistry")
  @js.native
  open class FallbackRegistry[MinimumArgumentValueT /* <: JsonValue */, MinimumInputValueT /* <: JsonValue */, MinimumOutputValueT /* <: JsonValue */] ()
    extends typings.angularDevkitBuildWebpack.fallbackRegistryMod.FallbackRegistry[MinimumArgumentValueT, MinimumInputValueT, MinimumOutputValueT] {
    def this(_fallbacks: js.Array[Registry[MinimumArgumentValueT, MinimumInputValueT, MinimumOutputValueT]]) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/experimental/jobs", "JobArgumentSchemaValidationError")
  @js.native
  open class JobArgumentSchemaValidationError ()
    extends typings.angularDevkitBuildWebpack.simpleSchedulerMod.JobArgumentSchemaValidationError {
    def this(errors: js.Array[SchemaValidatorError]) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/experimental/jobs", "JobDoesNotExistException")
  @js.native
  open class JobDoesNotExistException protected ()
    extends typings.angularDevkitBuildWebpack.jobsExceptionMod.JobDoesNotExistException {
    def this(name: JobName) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/experimental/jobs", "JobInboundMessageKind")
  @js.native
  object JobInboundMessageKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.angularDevkitBuildWebpack.jobsApiMod.JobInboundMessageKind & String] = js.native
    
    /* "in" */ val Input: typings.angularDevkitBuildWebpack.jobsApiMod.JobInboundMessageKind.Input & String = js.native
    
    /* "ip" */ val Ping: typings.angularDevkitBuildWebpack.jobsApiMod.JobInboundMessageKind.Ping & String = js.native
    
    /* "is" */ val Stop: typings.angularDevkitBuildWebpack.jobsApiMod.JobInboundMessageKind.Stop & String = js.native
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/experimental/jobs", "JobInboundMessageSchemaValidationError")
  @js.native
  open class JobInboundMessageSchemaValidationError ()
    extends typings.angularDevkitBuildWebpack.simpleSchedulerMod.JobInboundMessageSchemaValidationError {
    def this(errors: js.Array[SchemaValidatorError]) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/experimental/jobs", "JobNameAlreadyRegisteredException")
  @js.native
  open class JobNameAlreadyRegisteredException protected ()
    extends typings.angularDevkitBuildWebpack.jobsExceptionMod.JobNameAlreadyRegisteredException {
    def this(name: JobName) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/experimental/jobs", "JobOutboundMessageKind")
  @js.native
  object JobOutboundMessageKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind & String] = js.native
    
    /* "cc" */ val ChannelComplete: typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.ChannelComplete & String = js.native
    
    /* "cn" */ val ChannelCreate: typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.ChannelCreate & String = js.native
    
    /* "ce" */ val ChannelError: typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.ChannelError & String = js.native
    
    /* "cm" */ val ChannelMessage: typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.ChannelMessage & String = js.native
    
    /* "e" */ val End: typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.End & String = js.native
    
    /* "c" */ val OnReady: typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.OnReady & String = js.native
    
    /* "o" */ val Output: typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.Output & String = js.native
    
    /* "p" */ val Pong: typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.Pong & String = js.native
    
    /* "s" */ val Start: typings.angularDevkitBuildWebpack.jobsApiMod.JobOutboundMessageKind.Start & String = js.native
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/experimental/jobs", "JobOutputSchemaValidationError")
  @js.native
  open class JobOutputSchemaValidationError ()
    extends typings.angularDevkitBuildWebpack.simpleSchedulerMod.JobOutputSchemaValidationError {
    def this(errors: js.Array[SchemaValidatorError]) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/experimental/jobs", "JobState")
  @js.native
  object JobState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.angularDevkitBuildWebpack.jobsApiMod.JobState & String] = js.native
    
    /* "ended" */ val Ended: typings.angularDevkitBuildWebpack.jobsApiMod.JobState.Ended & String = js.native
    
    /* "errored" */ val Errored: typings.angularDevkitBuildWebpack.jobsApiMod.JobState.Errored & String = js.native
    
    /* "queued" */ val Queued: typings.angularDevkitBuildWebpack.jobsApiMod.JobState.Queued & String = js.native
    
    /* "ready" */ val Ready: typings.angularDevkitBuildWebpack.jobsApiMod.JobState.Ready & String = js.native
    
    /* "started" */ val Started: typings.angularDevkitBuildWebpack.jobsApiMod.JobState.Started & String = js.native
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/experimental/jobs", "SimpleJobRegistry")
  @js.native
  open class SimpleJobRegistry[MinimumArgumentValueT /* <: JsonValue */, MinimumInputValueT /* <: JsonValue */, MinimumOutputValueT /* <: JsonValue */] ()
    extends typings.angularDevkitBuildWebpack.simpleRegistryMod.SimpleJobRegistry[MinimumArgumentValueT, MinimumInputValueT, MinimumOutputValueT]
  
  @JSImport("@angular-devkit/build-webpack/core/src/experimental/jobs", "SimpleScheduler")
  @js.native
  open class SimpleScheduler[MinimumArgumentT /* <: JsonValue */, MinimumInputT /* <: JsonValue */, MinimumOutputT /* <: JsonValue */] protected ()
    extends typings.angularDevkitBuildWebpack.simpleSchedulerMod.SimpleScheduler[MinimumArgumentT, MinimumInputT, MinimumOutputT] {
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
  
  inline def isJobHandler[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](value: Any): /* is @angular-devkit/build-webpack.@angular-devkit/build-webpack/core/src/experimental/jobs/api.JobHandler<A, I, O> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJobHandler")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @angular-devkit/build-webpack.@angular-devkit/build-webpack/core/src/experimental/jobs/api.JobHandler<A, I, O> */ Boolean]
  
  object strategy {
    
    @JSImport("@angular-devkit/build-webpack/core/src/experimental/jobs", "strategy")
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
