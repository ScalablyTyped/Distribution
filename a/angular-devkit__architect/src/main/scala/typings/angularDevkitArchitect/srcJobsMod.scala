package typings.angularDevkitArchitect

import typings.angularDevkitArchitect.anon.PartialJobDescription
import typings.angularDevkitArchitect.anon.PartialReadwriteJobDescri
import typings.angularDevkitArchitect.srcJobsApiMod.JobHandler
import typings.angularDevkitArchitect.srcJobsApiMod.JobName
import typings.angularDevkitArchitect.srcJobsApiMod.Registry
import typings.angularDevkitArchitect.srcJobsCreateJobHandlerMod.SimpleJobHandlerFn
import typings.angularDevkitArchitect.srcJobsDispatcherMod.JobDispatcher
import typings.angularDevkitArchitect.srcJobsStrategyMod.strategy.JobStrategy
import typings.angularDevkitCore.srcJsonSchemaInterfaceMod.SchemaRegistry
import typings.angularDevkitCore.srcJsonSchemaInterfaceMod.SchemaValidatorError
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typings.angularDevkitCore.srcLoggerLoggerMod.LoggerApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcJobsMod {
  
  @JSImport("@angular-devkit/architect/src/jobs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/architect/src/jobs", "ChannelAlreadyExistException")
  @js.native
  open class ChannelAlreadyExistException protected ()
    extends typings.angularDevkitArchitect.srcJobsCreateJobHandlerMod.ChannelAlreadyExistException {
    def this(name: String) = this()
  }
  
  @JSImport("@angular-devkit/architect/src/jobs", "FallbackRegistry")
  @js.native
  open class FallbackRegistry[MinimumArgumentValueT /* <: JsonValue */, MinimumInputValueT /* <: JsonValue */, MinimumOutputValueT /* <: JsonValue */] ()
    extends typings.angularDevkitArchitect.srcJobsFallbackRegistryMod.FallbackRegistry[MinimumArgumentValueT, MinimumInputValueT, MinimumOutputValueT] {
    def this(_fallbacks: js.Array[Registry[MinimumArgumentValueT, MinimumInputValueT, MinimumOutputValueT]]) = this()
  }
  
  @JSImport("@angular-devkit/architect/src/jobs", "JobArgumentSchemaValidationError")
  @js.native
  open class JobArgumentSchemaValidationError ()
    extends typings.angularDevkitArchitect.srcJobsSimpleSchedulerMod.JobArgumentSchemaValidationError {
    def this(errors: js.Array[SchemaValidatorError]) = this()
  }
  
  @JSImport("@angular-devkit/architect/src/jobs", "JobDoesNotExistException")
  @js.native
  open class JobDoesNotExistException protected ()
    extends typings.angularDevkitArchitect.srcJobsExceptionMod.JobDoesNotExistException {
    def this(name: JobName) = this()
  }
  
  @JSImport("@angular-devkit/architect/src/jobs", "JobInboundMessageKind")
  @js.native
  object JobInboundMessageKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.angularDevkitArchitect.srcJobsApiMod.JobInboundMessageKind & String] = js.native
    
    /* "in" */ val Input: typings.angularDevkitArchitect.srcJobsApiMod.JobInboundMessageKind.Input & String = js.native
    
    /* "ip" */ val Ping: typings.angularDevkitArchitect.srcJobsApiMod.JobInboundMessageKind.Ping & String = js.native
    
    /* "is" */ val Stop: typings.angularDevkitArchitect.srcJobsApiMod.JobInboundMessageKind.Stop & String = js.native
  }
  
  @JSImport("@angular-devkit/architect/src/jobs", "JobInboundMessageSchemaValidationError")
  @js.native
  open class JobInboundMessageSchemaValidationError ()
    extends typings.angularDevkitArchitect.srcJobsSimpleSchedulerMod.JobInboundMessageSchemaValidationError {
    def this(errors: js.Array[SchemaValidatorError]) = this()
  }
  
  @JSImport("@angular-devkit/architect/src/jobs", "JobNameAlreadyRegisteredException")
  @js.native
  open class JobNameAlreadyRegisteredException protected ()
    extends typings.angularDevkitArchitect.srcJobsExceptionMod.JobNameAlreadyRegisteredException {
    def this(name: JobName) = this()
  }
  
  @JSImport("@angular-devkit/architect/src/jobs", "JobOutboundMessageKind")
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
  
  @JSImport("@angular-devkit/architect/src/jobs", "JobOutputSchemaValidationError")
  @js.native
  open class JobOutputSchemaValidationError ()
    extends typings.angularDevkitArchitect.srcJobsSimpleSchedulerMod.JobOutputSchemaValidationError {
    def this(errors: js.Array[SchemaValidatorError]) = this()
  }
  
  @JSImport("@angular-devkit/architect/src/jobs", "JobState")
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
  
  @JSImport("@angular-devkit/architect/src/jobs", "SimpleJobRegistry")
  @js.native
  open class SimpleJobRegistry[MinimumArgumentValueT /* <: JsonValue */, MinimumInputValueT /* <: JsonValue */, MinimumOutputValueT /* <: JsonValue */] ()
    extends typings.angularDevkitArchitect.srcJobsSimpleRegistryMod.SimpleJobRegistry[MinimumArgumentValueT, MinimumInputValueT, MinimumOutputValueT]
  
  @JSImport("@angular-devkit/architect/src/jobs", "SimpleScheduler")
  @js.native
  open class SimpleScheduler[MinimumArgumentT /* <: JsonValue */, MinimumInputT /* <: JsonValue */, MinimumOutputT /* <: JsonValue */] protected ()
    extends typings.angularDevkitArchitect.srcJobsSimpleSchedulerMod.SimpleScheduler[MinimumArgumentT, MinimumInputT, MinimumOutputT] {
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
    
    @JSImport("@angular-devkit/architect/src/jobs", "strategy")
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
