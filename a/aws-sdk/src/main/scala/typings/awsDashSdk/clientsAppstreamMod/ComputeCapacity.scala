package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputeCapacity extends js.Object {
  /**
    * The desired number of streaming instances.
    */
  var DesiredInstances: Integer
}

object ComputeCapacity {
  @scala.inline
  def apply(DesiredInstances: Integer): ComputeCapacity = {
    val __obj = js.Dynamic.literal(DesiredInstances = DesiredInstances)
  
    __obj.asInstanceOf[ComputeCapacity]
  }
}

