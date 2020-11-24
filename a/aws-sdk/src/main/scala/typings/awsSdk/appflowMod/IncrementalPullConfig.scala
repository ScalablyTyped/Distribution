package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncrementalPullConfig extends js.Object {
  
  /**
    *  A field that specifies the date time or timestamp field as the criteria to use when importing incremental records from the source. 
    */
  var datetimeTypeFieldName: js.UndefOr[DatetimeTypeFieldName] = js.native
}
object IncrementalPullConfig {
  
  @scala.inline
  def apply(): IncrementalPullConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncrementalPullConfig]
  }
  
  @scala.inline
  implicit class IncrementalPullConfigOps[Self <: IncrementalPullConfig] (val x: Self) extends AnyVal {
    
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
    def setDatetimeTypeFieldName(value: DatetimeTypeFieldName): Self = this.set("datetimeTypeFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatetimeTypeFieldName: Self = this.set("datetimeTypeFieldName", js.undefined)
  }
}
