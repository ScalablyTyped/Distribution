package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Replica extends js.Object {
  /**
    * The region where the replica needs to be created.
    */
  var RegionName: js.UndefOr[RegionName] = js.undefined
}

object Replica {
  @scala.inline
  def apply(RegionName: RegionName = null): Replica = {
    val __obj = js.Dynamic.literal()
    if (RegionName != null) __obj.updateDynamic("RegionName")(RegionName)
    __obj.asInstanceOf[Replica]
  }
}

