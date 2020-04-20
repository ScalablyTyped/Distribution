package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

