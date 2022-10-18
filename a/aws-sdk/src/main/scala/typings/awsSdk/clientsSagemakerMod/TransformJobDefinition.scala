package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformJobDefinition extends StObject {
  
  /**
    * A string that determines the number of records included in a single mini-batch.  SingleRecord means only one record is used per mini-batch. MultiRecord means a mini-batch is set to contain as many records that can fit within the MaxPayloadInMB limit.
    */
  var BatchStrategy: js.UndefOr[typings.awsSdk.clientsSagemakerMod.BatchStrategy] = js.undefined
  
  /**
    * The environment variables to set in the Docker container. We support up to 16 key and values entries in the map.
    */
  var Environment: js.UndefOr[TransformEnvironmentMap] = js.undefined
  
  /**
    * The maximum number of parallel requests that can be sent to each instance in a transform job. The default value is 1.
    */
  var MaxConcurrentTransforms: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxConcurrentTransforms] = js.undefined
  
  /**
    * The maximum payload size allowed, in MB. A payload is the data portion of a record (without metadata).
    */
  var MaxPayloadInMB: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxPayloadInMB] = js.undefined
  
  /**
    * A description of the input source and the way the transform job consumes it.
    */
  var TransformInput: typings.awsSdk.clientsSagemakerMod.TransformInput
  
  /**
    * Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.
    */
  var TransformOutput: typings.awsSdk.clientsSagemakerMod.TransformOutput
  
  /**
    * Identifies the ML compute instances for the transform job.
    */
  var TransformResources: typings.awsSdk.clientsSagemakerMod.TransformResources
}
object TransformJobDefinition {
  
  inline def apply(
    TransformInput: TransformInput,
    TransformOutput: TransformOutput,
    TransformResources: TransformResources
  ): TransformJobDefinition = {
    val __obj = js.Dynamic.literal(TransformInput = TransformInput.asInstanceOf[js.Any], TransformOutput = TransformOutput.asInstanceOf[js.Any], TransformResources = TransformResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformJobDefinition]
  }
  
  extension [Self <: TransformJobDefinition](x: Self) {
    
    inline def setBatchStrategy(value: BatchStrategy): Self = StObject.set(x, "BatchStrategy", value.asInstanceOf[js.Any])
    
    inline def setBatchStrategyUndefined: Self = StObject.set(x, "BatchStrategy", js.undefined)
    
    inline def setEnvironment(value: TransformEnvironmentMap): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    inline def setMaxConcurrentTransforms(value: MaxConcurrentTransforms): Self = StObject.set(x, "MaxConcurrentTransforms", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentTransformsUndefined: Self = StObject.set(x, "MaxConcurrentTransforms", js.undefined)
    
    inline def setMaxPayloadInMB(value: MaxPayloadInMB): Self = StObject.set(x, "MaxPayloadInMB", value.asInstanceOf[js.Any])
    
    inline def setMaxPayloadInMBUndefined: Self = StObject.set(x, "MaxPayloadInMB", js.undefined)
    
    inline def setTransformInput(value: TransformInput): Self = StObject.set(x, "TransformInput", value.asInstanceOf[js.Any])
    
    inline def setTransformOutput(value: TransformOutput): Self = StObject.set(x, "TransformOutput", value.asInstanceOf[js.Any])
    
    inline def setTransformResources(value: TransformResources): Self = StObject.set(x, "TransformResources", value.asInstanceOf[js.Any])
  }
}
