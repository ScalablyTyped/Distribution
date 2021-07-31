package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3OutputFormatConfig extends StObject {
  
  var aggregationConfig: js.UndefOr[AggregationConfig] = js.undefined
  
  /**
    *  Indicates the file type that Amazon AppFlow places in the Amazon S3 bucket. 
    */
  var fileType: js.UndefOr[FileType] = js.undefined
  
  /**
    *  Determines the prefix that Amazon AppFlow applies to the folder name in the Amazon S3 bucket. You can name folders according to the flow frequency and date. 
    */
  var prefixConfig: js.UndefOr[PrefixConfig] = js.undefined
}
object S3OutputFormatConfig {
  
  @scala.inline
  def apply(): S3OutputFormatConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3OutputFormatConfig]
  }
  
  @scala.inline
  implicit class S3OutputFormatConfigMutableBuilder[Self <: S3OutputFormatConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregationConfig(value: AggregationConfig): Self = StObject.set(x, "aggregationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationConfigUndefined: Self = StObject.set(x, "aggregationConfig", js.undefined)
    
    @scala.inline
    def setFileType(value: FileType): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    @scala.inline
    def setPrefixConfig(value: PrefixConfig): Self = StObject.set(x, "prefixConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixConfigUndefined: Self = StObject.set(x, "prefixConfig", js.undefined)
  }
}
