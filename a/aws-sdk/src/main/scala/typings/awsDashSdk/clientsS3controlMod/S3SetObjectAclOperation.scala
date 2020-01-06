package typings.awsDashSdk.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3SetObjectAclOperation extends js.Object {
  /**
    * 
    */
  var AccessControlPolicy: js.UndefOr[S3AccessControlPolicy] = js.native
}

object S3SetObjectAclOperation {
  @scala.inline
  def apply(AccessControlPolicy: S3AccessControlPolicy = null): S3SetObjectAclOperation = {
    val __obj = js.Dynamic.literal()
    if (AccessControlPolicy != null) __obj.updateDynamic("AccessControlPolicy")(AccessControlPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3SetObjectAclOperation]
  }
}

