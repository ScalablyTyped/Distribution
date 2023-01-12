package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputUpdate extends StObject {
  
  /**
    * Describes the data format when records are written to the destination. 
    */
  var DestinationSchemaUpdate: js.UndefOr[DestinationSchema] = js.undefined
  
  /**
    * Describes a Kinesis Data Firehose delivery stream as the destination for the output.
    */
  var KinesisFirehoseOutputUpdate: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.KinesisFirehoseOutputUpdate] = js.undefined
  
  /**
    * Describes a Kinesis data stream as the destination for the output.
    */
  var KinesisStreamsOutputUpdate: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.KinesisStreamsOutputUpdate] = js.undefined
  
  /**
    * Describes an Amazon Lambda function as the destination for the output.
    */
  var LambdaOutputUpdate: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.LambdaOutputUpdate] = js.undefined
  
  /**
    * If you want to specify a different in-application stream for this output configuration, use this field to specify the new in-application stream name.
    */
  var NameUpdate: js.UndefOr[InAppStreamName] = js.undefined
  
  /**
    * Identifies the specific output configuration that you want to update.
    */
  var OutputId: Id
}
object OutputUpdate {
  
  inline def apply(OutputId: Id): OutputUpdate = {
    val __obj = js.Dynamic.literal(OutputId = OutputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputUpdate] (val x: Self) extends AnyVal {
    
    inline def setDestinationSchemaUpdate(value: DestinationSchema): Self = StObject.set(x, "DestinationSchemaUpdate", value.asInstanceOf[js.Any])
    
    inline def setDestinationSchemaUpdateUndefined: Self = StObject.set(x, "DestinationSchemaUpdate", js.undefined)
    
    inline def setKinesisFirehoseOutputUpdate(value: KinesisFirehoseOutputUpdate): Self = StObject.set(x, "KinesisFirehoseOutputUpdate", value.asInstanceOf[js.Any])
    
    inline def setKinesisFirehoseOutputUpdateUndefined: Self = StObject.set(x, "KinesisFirehoseOutputUpdate", js.undefined)
    
    inline def setKinesisStreamsOutputUpdate(value: KinesisStreamsOutputUpdate): Self = StObject.set(x, "KinesisStreamsOutputUpdate", value.asInstanceOf[js.Any])
    
    inline def setKinesisStreamsOutputUpdateUndefined: Self = StObject.set(x, "KinesisStreamsOutputUpdate", js.undefined)
    
    inline def setLambdaOutputUpdate(value: LambdaOutputUpdate): Self = StObject.set(x, "LambdaOutputUpdate", value.asInstanceOf[js.Any])
    
    inline def setLambdaOutputUpdateUndefined: Self = StObject.set(x, "LambdaOutputUpdate", js.undefined)
    
    inline def setNameUpdate(value: InAppStreamName): Self = StObject.set(x, "NameUpdate", value.asInstanceOf[js.Any])
    
    inline def setNameUpdateUndefined: Self = StObject.set(x, "NameUpdate", js.undefined)
    
    inline def setOutputId(value: Id): Self = StObject.set(x, "OutputId", value.asInstanceOf[js.Any])
  }
}
