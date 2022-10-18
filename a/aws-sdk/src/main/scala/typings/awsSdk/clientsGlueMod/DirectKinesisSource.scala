package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectKinesisSource extends StObject {
  
  /**
    * Additional options for data preview.
    */
  var DataPreviewOptions: js.UndefOr[StreamingDataPreviewOptions] = js.undefined
  
  /**
    * Whether to automatically determine the schema from the incoming data.
    */
  var DetectSchema: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The name of the data source.
    */
  var Name: NodeName
  
  /**
    * Additional options for the Kinesis streaming data source.
    */
  var StreamingOptions: js.UndefOr[KinesisStreamingSourceOptions] = js.undefined
  
  /**
    * The amount of time to spend processing each micro batch.
    */
  var WindowSize: js.UndefOr[BoxedPositiveInt] = js.undefined
}
object DirectKinesisSource {
  
  inline def apply(Name: NodeName): DirectKinesisSource = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectKinesisSource]
  }
  
  extension [Self <: DirectKinesisSource](x: Self) {
    
    inline def setDataPreviewOptions(value: StreamingDataPreviewOptions): Self = StObject.set(x, "DataPreviewOptions", value.asInstanceOf[js.Any])
    
    inline def setDataPreviewOptionsUndefined: Self = StObject.set(x, "DataPreviewOptions", js.undefined)
    
    inline def setDetectSchema(value: BoxedBoolean): Self = StObject.set(x, "DetectSchema", value.asInstanceOf[js.Any])
    
    inline def setDetectSchemaUndefined: Self = StObject.set(x, "DetectSchema", js.undefined)
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setStreamingOptions(value: KinesisStreamingSourceOptions): Self = StObject.set(x, "StreamingOptions", value.asInstanceOf[js.Any])
    
    inline def setStreamingOptionsUndefined: Self = StObject.set(x, "StreamingOptions", js.undefined)
    
    inline def setWindowSize(value: BoxedPositiveInt): Self = StObject.set(x, "WindowSize", value.asInstanceOf[js.Any])
    
    inline def setWindowSizeUndefined: Self = StObject.set(x, "WindowSize", js.undefined)
  }
}
