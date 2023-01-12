package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputDescription extends StObject {
  
  /**
    * The data format used for writing data to the destination.
    */
  var DestinationSchema: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.DestinationSchema] = js.undefined
  
  /**
    * Describes the Kinesis Data Firehose delivery stream that is configured as the destination where output is written.
    */
  var KinesisFirehoseOutputDescription: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.KinesisFirehoseOutputDescription] = js.undefined
  
  /**
    * Describes the Kinesis data stream that is configured as the destination where output is written.
    */
  var KinesisStreamsOutputDescription: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.KinesisStreamsOutputDescription] = js.undefined
  
  /**
    * Describes the Lambda function that is configured as the destination where output is written.
    */
  var LambdaOutputDescription: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.LambdaOutputDescription] = js.undefined
  
  /**
    * The name of the in-application stream that is configured as output.
    */
  var Name: js.UndefOr[InAppStreamName] = js.undefined
  
  /**
    * A unique identifier for the output configuration.
    */
  var OutputId: js.UndefOr[Id] = js.undefined
}
object OutputDescription {
  
  inline def apply(): OutputDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputDescription] (val x: Self) extends AnyVal {
    
    inline def setDestinationSchema(value: DestinationSchema): Self = StObject.set(x, "DestinationSchema", value.asInstanceOf[js.Any])
    
    inline def setDestinationSchemaUndefined: Self = StObject.set(x, "DestinationSchema", js.undefined)
    
    inline def setKinesisFirehoseOutputDescription(value: KinesisFirehoseOutputDescription): Self = StObject.set(x, "KinesisFirehoseOutputDescription", value.asInstanceOf[js.Any])
    
    inline def setKinesisFirehoseOutputDescriptionUndefined: Self = StObject.set(x, "KinesisFirehoseOutputDescription", js.undefined)
    
    inline def setKinesisStreamsOutputDescription(value: KinesisStreamsOutputDescription): Self = StObject.set(x, "KinesisStreamsOutputDescription", value.asInstanceOf[js.Any])
    
    inline def setKinesisStreamsOutputDescriptionUndefined: Self = StObject.set(x, "KinesisStreamsOutputDescription", js.undefined)
    
    inline def setLambdaOutputDescription(value: LambdaOutputDescription): Self = StObject.set(x, "LambdaOutputDescription", value.asInstanceOf[js.Any])
    
    inline def setLambdaOutputDescriptionUndefined: Self = StObject.set(x, "LambdaOutputDescription", js.undefined)
    
    inline def setName(value: InAppStreamName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOutputId(value: Id): Self = StObject.set(x, "OutputId", value.asInstanceOf[js.Any])
    
    inline def setOutputIdUndefined: Self = StObject.set(x, "OutputId", js.undefined)
  }
}
