package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputeResourceUpdate extends js.Object {
  
  /**
    * The desired number of Amazon EC2 vCPUS in the compute environment.
    */
  var desiredvCpus: js.UndefOr[Integer] = js.native
  
  /**
    * The maximum number of Amazon EC2 vCPUs that an environment can reach.
    */
  var maxvCpus: js.UndefOr[Integer] = js.native
  
  /**
    * The minimum number of Amazon EC2 vCPUs that an environment should maintain.
    */
  var minvCpus: js.UndefOr[Integer] = js.native
}
object ComputeResourceUpdate {
  
  @scala.inline
  def apply(): ComputeResourceUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputeResourceUpdate]
  }
  
  @scala.inline
  implicit class ComputeResourceUpdateOps[Self <: ComputeResourceUpdate] (val x: Self) extends AnyVal {
    
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
    def setDesiredvCpus(value: Integer): Self = this.set("desiredvCpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesiredvCpus: Self = this.set("desiredvCpus", js.undefined)
    
    @scala.inline
    def setMaxvCpus(value: Integer): Self = this.set("maxvCpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxvCpus: Self = this.set("maxvCpus", js.undefined)
    
    @scala.inline
    def setMinvCpus(value: Integer): Self = this.set("minvCpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinvCpus: Self = this.set("minvCpus", js.undefined)
  }
}
