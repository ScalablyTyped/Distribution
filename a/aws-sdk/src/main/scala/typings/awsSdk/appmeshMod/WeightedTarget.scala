package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeightedTarget extends js.Object {
  /**
    * The virtual node to associate with the weighted target.
    */
  var virtualNode: ResourceName = js.native
  /**
    * The relative weight of the weighted target.
    */
  var weight: PercentInt = js.native
}

object WeightedTarget {
  @scala.inline
  def apply(virtualNode: ResourceName, weight: PercentInt): WeightedTarget = {
    val __obj = js.Dynamic.literal(virtualNode = virtualNode.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightedTarget]
  }
  @scala.inline
  implicit class WeightedTargetOps[Self <: WeightedTarget] (val x: Self) extends AnyVal {
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
    def setVirtualNode(value: ResourceName): Self = this.set("virtualNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeight(value: PercentInt): Self = this.set("weight", value.asInstanceOf[js.Any])
  }
  
}

