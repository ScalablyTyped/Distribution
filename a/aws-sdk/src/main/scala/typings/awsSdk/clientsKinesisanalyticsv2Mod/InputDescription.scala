package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputDescription extends StObject {
  
  /**
    * Returns the in-application stream names that are mapped to the stream source. 
    */
  var InAppStreamNames: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.InAppStreamNames] = js.undefined
  
  /**
    * The input ID that is associated with the application input. This is the ID that Kinesis Data Analytics assigns to each input configuration that you add to your application. 
    */
  var InputId: js.UndefOr[Id] = js.undefined
  
  /**
    * Describes the configured parallelism (number of in-application streams mapped to the streaming source). 
    */
  var InputParallelism: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.InputParallelism] = js.undefined
  
  /**
    * The description of the preprocessor that executes on records in this input before the application's code is run. 
    */
  var InputProcessingConfigurationDescription: js.UndefOr[
    typings.awsSdk.clientsKinesisanalyticsv2Mod.InputProcessingConfigurationDescription
  ] = js.undefined
  
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns in the in-application stream that is being created. 
    */
  var InputSchema: js.UndefOr[SourceSchema] = js.undefined
  
  /**
    * The point at which the application is configured to read from the input stream.
    */
  var InputStartingPositionConfiguration: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.InputStartingPositionConfiguration] = js.undefined
  
  /**
    * If a Kinesis Data Firehose delivery stream is configured as a streaming source, provides the delivery stream's ARN. 
    */
  var KinesisFirehoseInputDescription: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.KinesisFirehoseInputDescription] = js.undefined
  
  /**
    * If a Kinesis data stream is configured as a streaming source, provides the Kinesis data stream's Amazon Resource Name (ARN). 
    */
  var KinesisStreamsInputDescription: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.KinesisStreamsInputDescription] = js.undefined
  
  /**
    * The in-application name prefix.
    */
  var NamePrefix: js.UndefOr[InAppStreamName] = js.undefined
}
object InputDescription {
  
  inline def apply(): InputDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputDescription]
  }
  
  extension [Self <: InputDescription](x: Self) {
    
    inline def setInAppStreamNames(value: InAppStreamNames): Self = StObject.set(x, "InAppStreamNames", value.asInstanceOf[js.Any])
    
    inline def setInAppStreamNamesUndefined: Self = StObject.set(x, "InAppStreamNames", js.undefined)
    
    inline def setInAppStreamNamesVarargs(value: InAppStreamName*): Self = StObject.set(x, "InAppStreamNames", js.Array(value*))
    
    inline def setInputId(value: Id): Self = StObject.set(x, "InputId", value.asInstanceOf[js.Any])
    
    inline def setInputIdUndefined: Self = StObject.set(x, "InputId", js.undefined)
    
    inline def setInputParallelism(value: InputParallelism): Self = StObject.set(x, "InputParallelism", value.asInstanceOf[js.Any])
    
    inline def setInputParallelismUndefined: Self = StObject.set(x, "InputParallelism", js.undefined)
    
    inline def setInputProcessingConfigurationDescription(value: InputProcessingConfigurationDescription): Self = StObject.set(x, "InputProcessingConfigurationDescription", value.asInstanceOf[js.Any])
    
    inline def setInputProcessingConfigurationDescriptionUndefined: Self = StObject.set(x, "InputProcessingConfigurationDescription", js.undefined)
    
    inline def setInputSchema(value: SourceSchema): Self = StObject.set(x, "InputSchema", value.asInstanceOf[js.Any])
    
    inline def setInputSchemaUndefined: Self = StObject.set(x, "InputSchema", js.undefined)
    
    inline def setInputStartingPositionConfiguration(value: InputStartingPositionConfiguration): Self = StObject.set(x, "InputStartingPositionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInputStartingPositionConfigurationUndefined: Self = StObject.set(x, "InputStartingPositionConfiguration", js.undefined)
    
    inline def setKinesisFirehoseInputDescription(value: KinesisFirehoseInputDescription): Self = StObject.set(x, "KinesisFirehoseInputDescription", value.asInstanceOf[js.Any])
    
    inline def setKinesisFirehoseInputDescriptionUndefined: Self = StObject.set(x, "KinesisFirehoseInputDescription", js.undefined)
    
    inline def setKinesisStreamsInputDescription(value: KinesisStreamsInputDescription): Self = StObject.set(x, "KinesisStreamsInputDescription", value.asInstanceOf[js.Any])
    
    inline def setKinesisStreamsInputDescriptionUndefined: Self = StObject.set(x, "KinesisStreamsInputDescription", js.undefined)
    
    inline def setNamePrefix(value: InAppStreamName): Self = StObject.set(x, "NamePrefix", value.asInstanceOf[js.Any])
    
    inline def setNamePrefixUndefined: Self = StObject.set(x, "NamePrefix", js.undefined)
  }
}
