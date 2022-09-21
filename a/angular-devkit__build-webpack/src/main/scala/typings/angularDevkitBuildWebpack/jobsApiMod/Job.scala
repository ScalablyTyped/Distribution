package typings.angularDevkitBuildWebpack.jobsApiMod

import typings.angularDevkitBuildWebpack.schemaSchemaMod.JsonSchema
import typings.angularDevkitBuildWebpack.utilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Job[ArgumentT /* <: JsonValue */, InputT /* <: JsonValue */, OutputT /* <: JsonValue */] extends StObject {
  
  /**
    * Argument sent when scheduling the job. This is a copy of the argument.
    */
  val argument: ArgumentT = js.native
  
  /**
    * Description of the job. Resolving the job's description can be done asynchronously, so this
    * is an observable that will resolve when it's ready.
    */
  val description: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<JobDescription> */ Any = js.native
  
  /**
    * Get a channel that validates against the schema. Messages will be filtered by the schema.
    * @param name The name of the channel.
    * @param schema A schema to use to validate messages.
    */
  def getChannel[T /* <: JsonValue */](name: String): Any = js.native
  def getChannel[T /* <: JsonValue */](name: String, schema: JsonSchema): Any = js.native
  
  /**
    * The JobInboundMessage messages TO the job.
    */
  val inboundBus: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observer<JobInboundMessage<InputT>> */ Any = js.native
  
  /**
    * The input to the job. This goes through the input channel as messages.
    */
  val input: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observer<InputT> */ Any = js.native
  
  /**
    * The JobOutboundMessage FROM the job.
    */
  val outboundBus: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<JobOutboundMessage<OutputT>> */ Any = js.native
  
  /**
    * Outputs of this job.
    */
  val output: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<OutputT> */ Any = js.native
  
  /**
    * Pings the job and wait for the resulting Pong before completing.
    */
  def ping(): Any = js.native
  
  /**
    * The current state of the job.
    */
  val state: JobState = js.native
  
  /**
    * Stops the job from running. This is different than unsubscribing from the output as in it
    * sends the JobInboundMessageKind.Stop raw input to the job.
    */
  def stop(): Unit = js.native
}
