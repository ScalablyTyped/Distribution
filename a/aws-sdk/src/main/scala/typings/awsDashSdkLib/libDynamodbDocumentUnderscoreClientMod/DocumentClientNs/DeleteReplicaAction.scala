package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteReplicaAction extends js.Object {
  /**
    * The region of the replica to be removed.
    */
  var RegionName: RegionName
}

object DeleteReplicaAction {
  @scala.inline
  def apply(RegionName: RegionName): DeleteReplicaAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("RegionName")(RegionName)
    __obj.asInstanceOf[DeleteReplicaAction]
  }
}

