package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateReplicaAction extends js.Object {
  /**
    * The region of the replica to be added.
    */
  var RegionName: awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.RegionName
}

object CreateReplicaAction {
  @scala.inline
  def apply(RegionName: RegionName): CreateReplicaAction = {
    val __obj = js.Dynamic.literal(RegionName = RegionName)
  
    __obj.asInstanceOf[CreateReplicaAction]
  }
}

