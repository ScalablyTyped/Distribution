package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReplicaAction extends js.Object {
  /**
    * The Region of the replica to be added.
    */
  var RegionName: typings.awsDashSdk.clientsDynamodbMod.RegionName = js.native
}

object CreateReplicaAction {
  @scala.inline
  def apply(RegionName: RegionName): CreateReplicaAction = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateReplicaAction]
  }
}

