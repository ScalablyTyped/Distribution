package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLJobChannel extends StObject {
  
  /**
    * The type of channel. Defines whether the data are used for training or validation. The default value is training. Channels for training and validation must share the same ContentType 
    */
  var ChannelType: js.UndefOr[AutoMLChannelType] = js.undefined
  
  /**
    * The allowed compression types depend on the input format. We allow the compression type Gzip for S3Prefix inputs only. For all other inputs, the compression type should be None. If no compression type is provided, we default to None.
    */
  var CompressionType: js.UndefOr[typings.awsSdk.clientsSagemakerMod.CompressionType] = js.undefined
  
  /**
    * The content type of the data from the input source. The following are the allowed content types for different problems:   ImageClassification: image/png, image/jpeg, image/ *    TextClassification: text/csv;header=present   
    */
  var ContentType: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ContentType] = js.undefined
  
  /**
    * The data source for an AutoML channel.
    */
  var DataSource: js.UndefOr[AutoMLDataSource] = js.undefined
}
object AutoMLJobChannel {
  
  inline def apply(): AutoMLJobChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLJobChannel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoMLJobChannel] (val x: Self) extends AnyVal {
    
    inline def setChannelType(value: AutoMLChannelType): Self = StObject.set(x, "ChannelType", value.asInstanceOf[js.Any])
    
    inline def setChannelTypeUndefined: Self = StObject.set(x, "ChannelType", js.undefined)
    
    inline def setCompressionType(value: CompressionType): Self = StObject.set(x, "CompressionType", value.asInstanceOf[js.Any])
    
    inline def setCompressionTypeUndefined: Self = StObject.set(x, "CompressionType", js.undefined)
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setDataSource(value: AutoMLDataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "DataSource", js.undefined)
  }
}
