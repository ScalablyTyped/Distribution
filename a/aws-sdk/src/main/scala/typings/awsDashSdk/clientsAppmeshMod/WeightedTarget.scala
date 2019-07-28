package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeightedTarget extends js.Object {
  /**
    * The virtual node to associate with the weighted target.
    */
  var virtualNode: ResourceName
  /**
    * The relative weight of the weighted target.
    */
  var weight: PercentInt
}

object WeightedTarget {
  @scala.inline
  def apply(virtualNode: ResourceName, weight: PercentInt): WeightedTarget = {
    val __obj = js.Dynamic.literal(virtualNode = virtualNode, weight = weight)
  
    __obj.asInstanceOf[WeightedTarget]
  }
}

