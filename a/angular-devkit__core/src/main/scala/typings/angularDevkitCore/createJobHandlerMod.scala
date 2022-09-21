package typings.angularDevkitCore

import typings.angularDevkitCore.anon.PartialJobDescription
import typings.angularDevkitCore.exceptionMod.BaseException
import typings.angularDevkitCore.jobsApiMod.Job
import typings.angularDevkitCore.jobsApiMod.JobDescription
import typings.angularDevkitCore.jobsApiMod.JobHandler
import typings.angularDevkitCore.jobsApiMod.JobHandlerContext
import typings.angularDevkitCore.jobsApiMod.Scheduler
import typings.angularDevkitCore.loggerLoggerMod.LoggerApi
import typings.angularDevkitCore.utilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createJobHandlerMod {
  
  @JSImport("@angular-devkit/core/src/experimental/jobs/create-job-handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/core/src/experimental/jobs/create-job-handler", "ChannelAlreadyExistException")
  @js.native
  open class ChannelAlreadyExistException protected () extends BaseException {
    def this(name: String) = this()
  }
  
  inline def createJobFactory[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](loader: js.Function0[js.Promise[JobHandler[A, I, O]]]): JobHandler[A, I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("createJobFactory")(loader.asInstanceOf[js.Any]).asInstanceOf[JobHandler[A, I, O]]
  inline def createJobFactory[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](loader: js.Function0[js.Promise[JobHandler[A, I, O]]], options: PartialJobDescription): JobHandler[A, I, O] = (^.asInstanceOf[js.Dynamic].applyDynamic("createJobFactory")(loader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JobHandler[A, I, O]]
  
  inline def createJobHandler[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](fn: SimpleJobHandlerFn[A, I, O]): JobHandler[A, I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("createJobHandler")(fn.asInstanceOf[js.Any]).asInstanceOf[JobHandler[A, I, O]]
  inline def createJobHandler[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](fn: SimpleJobHandlerFn[A, I, O], options: PartialJobDescription): JobHandler[A, I, O] = (^.asInstanceOf[js.Dynamic].applyDynamic("createJobHandler")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JobHandler[A, I, O]]
  
  inline def createLoggerJob[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](job: JobHandler[A, I, O], logger: LoggerApi): JobHandler[A, I, O] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLoggerJob")(job.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[JobHandler[A, I, O]]
  
  trait SimpleJobHandlerContext[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */]
    extends StObject
       with JobHandlerContext[A, I, O] {
    
    def createChannel(name: String): Any
    
    var input: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<I> */ Any
  }
  object SimpleJobHandlerContext {
    
    inline def apply[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](
      createChannel: String => Any,
      dependencies: js.Array[Job[JsonValue, JsonValue, JsonValue]],
      description: JobDescription,
      inboundBus: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<JobInboundMessage<MinimumInputValueT>> */ Any,
      input: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<I> */ Any,
      scheduler: Scheduler[JsonValue, JsonValue, JsonValue]
    ): SimpleJobHandlerContext[A, I, O] = {
      val __obj = js.Dynamic.literal(createChannel = js.Any.fromFunction1(createChannel), dependencies = dependencies.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], inboundBus = inboundBus.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], scheduler = scheduler.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleJobHandlerContext[A, I, O]]
    }
    
    extension [Self <: SimpleJobHandlerContext[?, ?, ?], A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](x: Self & (SimpleJobHandlerContext[A, I, O])) {
      
      inline def setCreateChannel(value: String => Any): Self = StObject.set(x, "createChannel", js.Any.fromFunction1(value))
      
      inline def setInput(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<I> */ Any
      ): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    }
  }
  
  type SimpleJobHandlerFn[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */] = js.Function2[
    /* input */ A, 
    /* context */ SimpleJobHandlerContext[A, I, O], 
    O | js.Promise[O] | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<O> */ Any)
  ]
}
