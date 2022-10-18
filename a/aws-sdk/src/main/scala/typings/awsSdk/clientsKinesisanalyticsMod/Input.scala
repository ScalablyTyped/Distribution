package typings.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input extends StObject {
  
  /**
    * Describes the number of in-application streams to create.  Data from your source is routed to these in-application input streams.  (see Configuring Application Input.
    */
  var InputParallelism: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsMod.InputParallelism] = js.undefined
  
  /**
    * The InputProcessingConfiguration for the input. An input processor transforms records as they are received from the stream, before the application's SQL code executes. Currently, the only input processing configuration available is InputLambdaProcessor.
    */
  var InputProcessingConfiguration: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsMod.InputProcessingConfiguration] = js.undefined
  
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns in the in-application stream that is being created. Also used to describe the format of the reference data source.
    */
  var InputSchema: SourceSchema
  
  /**
    * If the streaming source is an Amazon Kinesis Firehose delivery stream, identifies the delivery stream's ARN and an IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf. Note: Either KinesisStreamsInput or KinesisFirehoseInput is required.
    */
  var KinesisFirehoseInput: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsMod.KinesisFirehoseInput] = js.undefined
  
  /**
    * If the streaming source is an Amazon Kinesis stream, identifies the stream's Amazon Resource Name (ARN) and an IAM role that enables Amazon Kinesis Analytics to access the stream on your behalf. Note: Either KinesisStreamsInput or KinesisFirehoseInput is required.
    */
  var KinesisStreamsInput: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsMod.KinesisStreamsInput] = js.undefined
  
  /**
    * Name prefix to use when creating an in-application stream. Suppose that you specify a prefix "MyInApplicationStream." Amazon Kinesis Analytics then creates one or more (as per the InputParallelism count you specified) in-application streams with names "MyInApplicationStream_001," "MyInApplicationStream_002," and so on. 
    */
  var NamePrefix: InAppStreamName
}
object Input {
  
  inline def apply(InputSchema: SourceSchema, NamePrefix: InAppStreamName): Input = {
    val __obj = js.Dynamic.literal(InputSchema = InputSchema.asInstanceOf[js.Any], NamePrefix = NamePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
  
  extension [Self <: Input](x: Self) {
    
    inline def setInputParallelism(value: InputParallelism): Self = StObject.set(x, "InputParallelism", value.asInstanceOf[js.Any])
    
    inline def setInputParallelismUndefined: Self = StObject.set(x, "InputParallelism", js.undefined)
    
    inline def setInputProcessingConfiguration(value: InputProcessingConfiguration): Self = StObject.set(x, "InputProcessingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInputProcessingConfigurationUndefined: Self = StObject.set(x, "InputProcessingConfiguration", js.undefined)
    
    inline def setInputSchema(value: SourceSchema): Self = StObject.set(x, "InputSchema", value.asInstanceOf[js.Any])
    
    inline def setKinesisFirehoseInput(value: KinesisFirehoseInput): Self = StObject.set(x, "KinesisFirehoseInput", value.asInstanceOf[js.Any])
    
    inline def setKinesisFirehoseInputUndefined: Self = StObject.set(x, "KinesisFirehoseInput", js.undefined)
    
    inline def setKinesisStreamsInput(value: KinesisStreamsInput): Self = StObject.set(x, "KinesisStreamsInput", value.asInstanceOf[js.Any])
    
    inline def setKinesisStreamsInputUndefined: Self = StObject.set(x, "KinesisStreamsInput", js.undefined)
    
    inline def setNamePrefix(value: InAppStreamName): Self = StObject.set(x, "NamePrefix", value.asInstanceOf[js.Any])
  }
}
