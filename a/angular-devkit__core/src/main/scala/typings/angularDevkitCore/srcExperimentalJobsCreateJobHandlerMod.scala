package typings.angularDevkitCore

import typings.angularDevkitCore.anon.PartialJobDescription
import typings.angularDevkitCore.srcExceptionMod.BaseException
import typings.angularDevkitCore.srcExperimentalJobsApiMod.Job
import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobDescription
import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobHandler
import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobHandlerContext
import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessage
import typings.angularDevkitCore.srcExperimentalJobsApiMod.Scheduler
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typings.angularDevkitCore.srcLoggerLoggerMod.LoggerApi
import typings.rxjs.distTypesInternalTypesMod.Observer
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExperimentalJobsCreateJobHandlerMod {
  
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
    
    def createChannel(name: String): Observer[JsonValue]
    
    var input: Observable_[I]
  }
  object SimpleJobHandlerContext {
    
    inline def apply[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](
      createChannel: String => Observer[JsonValue],
      dependencies: js.Array[Job[JsonValue, JsonValue, JsonValue]],
      description: JobDescription,
      inboundBus: Observable_[JobInboundMessage[I]],
      input: Observable_[I],
      scheduler: Scheduler[JsonValue, JsonValue, JsonValue]
    ): SimpleJobHandlerContext[A, I, O] = {
      val __obj = js.Dynamic.literal(createChannel = js.Any.fromFunction1(createChannel), dependencies = dependencies.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], inboundBus = inboundBus.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], scheduler = scheduler.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleJobHandlerContext[A, I, O]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleJobHandlerContext[?, ?, ?], A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */] (val x: Self & (SimpleJobHandlerContext[A, I, O])) extends AnyVal {
      
      inline def setCreateChannel(value: String => Observer[JsonValue]): Self = StObject.set(x, "createChannel", js.Any.fromFunction1(value))
      
      inline def setInput(value: Observable_[I]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    }
  }
  
  type SimpleJobHandlerFn[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */] = js.Function2[
    /* input */ A, 
    /* context */ SimpleJobHandlerContext[A, I, O], 
    O | js.Promise[O] | Observable_[O]
  ]
}
