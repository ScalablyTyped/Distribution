package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicaUpdate extends js.Object {
  /**
    * The parameters required for creating a replica on an existing global table.
    */
  var Create: js.UndefOr[CreateReplicaAction] = js.undefined
  /**
    * The name of the existing replica to be removed.
    */
  var Delete: js.UndefOr[DeleteReplicaAction] = js.undefined
}

