package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindingSource extends js.Object {
  
  /**
    * Includes details about how the access that generated the finding is granted. This is populated for Amazon S3 bucket findings.
    */
  var detail: js.UndefOr[FindingSourceDetail] = js.native
  
  /**
    * Indicates the type of access that generated the finding.
    */
  var `type`: FindingSourceType = js.native
}
object FindingSource {
  
  @scala.inline
  def apply(`type`: FindingSourceType): FindingSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindingSource]
  }
  
  @scala.inline
  implicit class FindingSourceOps[Self <: FindingSource] (val x: Self) extends AnyVal {
    
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
    def setType(value: FindingSourceType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetail(value: FindingSourceDetail): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
  }
}
