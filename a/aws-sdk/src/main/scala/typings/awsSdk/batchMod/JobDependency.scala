package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobDependency extends js.Object {
  
  /**
    * The job ID of the AWS Batch job associated with this dependency.
    */
  var jobId: js.UndefOr[String] = js.native
  
  /**
    * The type of the job dependency.
    */
  var `type`: js.UndefOr[ArrayJobDependency] = js.native
}
object JobDependency {
  
  @scala.inline
  def apply(): JobDependency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobDependency]
  }
  
  @scala.inline
  implicit class JobDependencyOps[Self <: JobDependency] (val x: Self) extends AnyVal {
    
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
    def setJobId(value: String): Self = this.set("jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
    
    @scala.inline
    def setType(value: ArrayJobDependency): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
