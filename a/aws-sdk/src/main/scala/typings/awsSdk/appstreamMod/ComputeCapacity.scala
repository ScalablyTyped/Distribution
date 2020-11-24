package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputeCapacity extends js.Object {
  
  /**
    * The desired number of streaming instances.
    */
  var DesiredInstances: Integer = js.native
}
object ComputeCapacity {
  
  @scala.inline
  def apply(DesiredInstances: Integer): ComputeCapacity = {
    val __obj = js.Dynamic.literal(DesiredInstances = DesiredInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeCapacity]
  }
  
  @scala.inline
  implicit class ComputeCapacityOps[Self <: ComputeCapacity] (val x: Self) extends AnyVal {
    
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
    def setDesiredInstances(value: Integer): Self = this.set("DesiredInstances", value.asInstanceOf[js.Any])
  }
}
