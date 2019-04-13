package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetGrant extends js.Object {
  /**
    * 
    */
  var Grantee: js.UndefOr[Grantee] = js.undefined
  /**
    * Logging permissions assigned to the Grantee for the bucket.
    */
  var Permission: js.UndefOr[BucketLogsPermission] = js.undefined
}

object TargetGrant {
  @scala.inline
  def apply(Grantee: Grantee = null, Permission: BucketLogsPermission = null): TargetGrant = {
    val __obj = js.Dynamic.literal()
    if (Grantee != null) __obj.updateDynamic("Grantee")(Grantee)
    if (Permission != null) __obj.updateDynamic("Permission")(Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetGrant]
  }
}

