package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRestoreJobInput extends js.Object {
  
  /**
    * Uniquely identifies the job that restores a recovery point.
    */
  var RestoreJobId: typings.awsSdk.backupMod.RestoreJobId = js.native
}
object DescribeRestoreJobInput {
  
  @scala.inline
  def apply(RestoreJobId: RestoreJobId): DescribeRestoreJobInput = {
    val __obj = js.Dynamic.literal(RestoreJobId = RestoreJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRestoreJobInput]
  }
  
  @scala.inline
  implicit class DescribeRestoreJobInputOps[Self <: DescribeRestoreJobInput] (val x: Self) extends AnyVal {
    
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
    def setRestoreJobId(value: RestoreJobId): Self = this.set("RestoreJobId", value.asInstanceOf[js.Any])
  }
}
