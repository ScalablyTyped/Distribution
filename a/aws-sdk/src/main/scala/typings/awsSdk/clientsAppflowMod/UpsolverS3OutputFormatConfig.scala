package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpsolverS3OutputFormatConfig extends StObject {
  
  var aggregationConfig: js.UndefOr[AggregationConfig] = js.undefined
  
  /**
    *  Indicates the file type that Amazon AppFlow places in the Upsolver Amazon S3 bucket. 
    */
  var fileType: js.UndefOr[FileType] = js.undefined
  
  var prefixConfig: PrefixConfig
}
object UpsolverS3OutputFormatConfig {
  
  inline def apply(prefixConfig: PrefixConfig): UpsolverS3OutputFormatConfig = {
    val __obj = js.Dynamic.literal(prefixConfig = prefixConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpsolverS3OutputFormatConfig]
  }
  
  extension [Self <: UpsolverS3OutputFormatConfig](x: Self) {
    
    inline def setAggregationConfig(value: AggregationConfig): Self = StObject.set(x, "aggregationConfig", value.asInstanceOf[js.Any])
    
    inline def setAggregationConfigUndefined: Self = StObject.set(x, "aggregationConfig", js.undefined)
    
    inline def setFileType(value: FileType): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    inline def setPrefixConfig(value: PrefixConfig): Self = StObject.set(x, "prefixConfig", value.asInstanceOf[js.Any])
  }
}
