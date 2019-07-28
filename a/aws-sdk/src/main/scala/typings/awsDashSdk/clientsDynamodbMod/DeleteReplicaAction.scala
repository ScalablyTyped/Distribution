package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteReplicaAction extends js.Object {
  /**
    * The region of the replica to be removed.
    */
  var RegionName: typings.awsDashSdk.clientsDynamodbMod.RegionName
}

object DeleteReplicaAction {
  @scala.inline
  def apply(RegionName: RegionName): DeleteReplicaAction = {
    val __obj = js.Dynamic.literal(RegionName = RegionName)
  
    __obj.asInstanceOf[DeleteReplicaAction]
  }
}

