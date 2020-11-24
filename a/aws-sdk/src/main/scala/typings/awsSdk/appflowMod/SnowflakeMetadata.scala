package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnowflakeMetadata extends js.Object {
  
  /**
    *  Specifies the supported AWS Regions when using Snowflake. 
    */
  var supportedRegions: js.UndefOr[RegionList] = js.native
}
object SnowflakeMetadata {
  
  @scala.inline
  def apply(): SnowflakeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnowflakeMetadata]
  }
  
  @scala.inline
  implicit class SnowflakeMetadataOps[Self <: SnowflakeMetadata] (val x: Self) extends AnyVal {
    
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
    def setSupportedRegionsVarargs(value: Region*): Self = this.set("supportedRegions", js.Array(value :_*))
    
    @scala.inline
    def setSupportedRegions(value: RegionList): Self = this.set("supportedRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedRegions: Self = this.set("supportedRegions", js.undefined)
  }
}
