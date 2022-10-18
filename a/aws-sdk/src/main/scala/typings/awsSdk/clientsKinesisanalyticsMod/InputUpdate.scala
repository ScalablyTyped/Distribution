package typings.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputUpdate extends StObject {
  
  /**
    * Input ID of the application input to be updated.
    */
  var InputId: Id
  
  /**
    * Describes the parallelism updates (the number in-application streams Amazon Kinesis Analytics creates for the specific streaming source).
    */
  var InputParallelismUpdate: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsMod.InputParallelismUpdate] = js.undefined
  
  /**
    * Describes updates for an input processing configuration.
    */
  var InputProcessingConfigurationUpdate: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsMod.InputProcessingConfigurationUpdate] = js.undefined
  
  /**
    * Describes the data format on the streaming source, and how record elements on the streaming source map to columns of the in-application stream that is created.
    */
  var InputSchemaUpdate: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsMod.InputSchemaUpdate] = js.undefined
  
  /**
    * If an Amazon Kinesis Firehose delivery stream is the streaming source to be updated, provides an updated stream ARN and IAM role ARN.
    */
  var KinesisFirehoseInputUpdate: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsMod.KinesisFirehoseInputUpdate] = js.undefined
  
  /**
    * If an Amazon Kinesis stream is the streaming source to be updated, provides an updated stream Amazon Resource Name (ARN) and IAM role ARN.
    */
  var KinesisStreamsInputUpdate: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsMod.KinesisStreamsInputUpdate] = js.undefined
  
  /**
    * Name prefix for in-application streams that Amazon Kinesis Analytics creates for the specific streaming source.
    */
  var NamePrefixUpdate: js.UndefOr[InAppStreamName] = js.undefined
}
object InputUpdate {
  
  inline def apply(InputId: Id): InputUpdate = {
    val __obj = js.Dynamic.literal(InputId = InputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputUpdate]
  }
  
  extension [Self <: InputUpdate](x: Self) {
    
    inline def setInputId(value: Id): Self = StObject.set(x, "InputId", value.asInstanceOf[js.Any])
    
    inline def setInputParallelismUpdate(value: InputParallelismUpdate): Self = StObject.set(x, "InputParallelismUpdate", value.asInstanceOf[js.Any])
    
    inline def setInputParallelismUpdateUndefined: Self = StObject.set(x, "InputParallelismUpdate", js.undefined)
    
    inline def setInputProcessingConfigurationUpdate(value: InputProcessingConfigurationUpdate): Self = StObject.set(x, "InputProcessingConfigurationUpdate", value.asInstanceOf[js.Any])
    
    inline def setInputProcessingConfigurationUpdateUndefined: Self = StObject.set(x, "InputProcessingConfigurationUpdate", js.undefined)
    
    inline def setInputSchemaUpdate(value: InputSchemaUpdate): Self = StObject.set(x, "InputSchemaUpdate", value.asInstanceOf[js.Any])
    
    inline def setInputSchemaUpdateUndefined: Self = StObject.set(x, "InputSchemaUpdate", js.undefined)
    
    inline def setKinesisFirehoseInputUpdate(value: KinesisFirehoseInputUpdate): Self = StObject.set(x, "KinesisFirehoseInputUpdate", value.asInstanceOf[js.Any])
    
    inline def setKinesisFirehoseInputUpdateUndefined: Self = StObject.set(x, "KinesisFirehoseInputUpdate", js.undefined)
    
    inline def setKinesisStreamsInputUpdate(value: KinesisStreamsInputUpdate): Self = StObject.set(x, "KinesisStreamsInputUpdate", value.asInstanceOf[js.Any])
    
    inline def setKinesisStreamsInputUpdateUndefined: Self = StObject.set(x, "KinesisStreamsInputUpdate", js.undefined)
    
    inline def setNamePrefixUpdate(value: InAppStreamName): Self = StObject.set(x, "NamePrefixUpdate", value.asInstanceOf[js.Any])
    
    inline def setNamePrefixUpdateUndefined: Self = StObject.set(x, "NamePrefixUpdate", js.undefined)
  }
}
