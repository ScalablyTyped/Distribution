package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCopyJobOutput extends js.Object {
  
  /**
    * Contains detailed information about a copy job.
    */
  var CopyJob: js.UndefOr[typings.awsSdk.backupMod.CopyJob] = js.native
}
object DescribeCopyJobOutput {
  
  @scala.inline
  def apply(): DescribeCopyJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCopyJobOutput]
  }
  
  @scala.inline
  implicit class DescribeCopyJobOutputOps[Self <: DescribeCopyJobOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCopyJob(value: CopyJob): Self = this.set("CopyJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyJob: Self = this.set("CopyJob", js.undefined)
  }
}
