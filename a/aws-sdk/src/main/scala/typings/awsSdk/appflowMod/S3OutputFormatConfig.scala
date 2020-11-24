package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3OutputFormatConfig extends js.Object {
  
  var aggregationConfig: js.UndefOr[AggregationConfig] = js.native
  
  /**
    *  Indicates the file type that Amazon AppFlow places in the Amazon S3 bucket. 
    */
  var fileType: js.UndefOr[FileType] = js.native
  
  /**
    *  Determines the prefix that Amazon AppFlow applies to the folder name in the Amazon S3 bucket. You can name folders according to the flow frequency and date. 
    */
  var prefixConfig: js.UndefOr[PrefixConfig] = js.native
}
object S3OutputFormatConfig {
  
  @scala.inline
  def apply(): S3OutputFormatConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3OutputFormatConfig]
  }
  
  @scala.inline
  implicit class S3OutputFormatConfigOps[Self <: S3OutputFormatConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAggregationConfig(value: AggregationConfig): Self = this.set("aggregationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregationConfig: Self = this.set("aggregationConfig", js.undefined)
    
    @scala.inline
    def setFileType(value: FileType): Self = this.set("fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
    
    @scala.inline
    def setPrefixConfig(value: PrefixConfig): Self = this.set("prefixConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixConfig: Self = this.set("prefixConfig", js.undefined)
  }
}
