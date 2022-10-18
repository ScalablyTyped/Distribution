package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLChannel extends StObject {
  
  /**
    * The channel type (optional) is an enum string. The default value is training. Channels for training and validation must share the same ContentType and TargetAttributeName. For information on specifying training and validation channel types, see  How to specify training and validation datasets .
    */
  var ChannelType: js.UndefOr[AutoMLChannelType] = js.undefined
  
  /**
    * You can use Gzip or None. The default value is None.
    */
  var CompressionType: js.UndefOr[typings.awsSdk.clientsSagemakerMod.CompressionType] = js.undefined
  
  /**
    * The content type of the data from the input source. You can use text/csv;header=present or x-application/vnd.amazon+parquet. The default value is text/csv;header=present.
    */
  var ContentType: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ContentType] = js.undefined
  
  /**
    * The data source for an AutoML channel.
    */
  var DataSource: AutoMLDataSource
  
  /**
    * The name of the target variable in supervised learning, usually represented by 'y'.
    */
  var TargetAttributeName: typings.awsSdk.clientsSagemakerMod.TargetAttributeName
}
object AutoMLChannel {
  
  inline def apply(DataSource: AutoMLDataSource, TargetAttributeName: TargetAttributeName): AutoMLChannel = {
    val __obj = js.Dynamic.literal(DataSource = DataSource.asInstanceOf[js.Any], TargetAttributeName = TargetAttributeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLChannel]
  }
  
  extension [Self <: AutoMLChannel](x: Self) {
    
    inline def setChannelType(value: AutoMLChannelType): Self = StObject.set(x, "ChannelType", value.asInstanceOf[js.Any])
    
    inline def setChannelTypeUndefined: Self = StObject.set(x, "ChannelType", js.undefined)
    
    inline def setCompressionType(value: CompressionType): Self = StObject.set(x, "CompressionType", value.asInstanceOf[js.Any])
    
    inline def setCompressionTypeUndefined: Self = StObject.set(x, "CompressionType", js.undefined)
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setDataSource(value: AutoMLDataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setTargetAttributeName(value: TargetAttributeName): Self = StObject.set(x, "TargetAttributeName", value.asInstanceOf[js.Any])
  }
}
