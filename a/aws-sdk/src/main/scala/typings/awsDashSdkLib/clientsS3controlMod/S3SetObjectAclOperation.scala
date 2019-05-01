package typings
package awsDashSdkLib.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3SetObjectAclOperation extends js.Object {
  /**
    * 
    */
  var AccessControlPolicy: js.UndefOr[S3AccessControlPolicy] = js.undefined
}

object S3SetObjectAclOperation {
  @scala.inline
  def apply(AccessControlPolicy: S3AccessControlPolicy = null): S3SetObjectAclOperation = {
    val __obj = js.Dynamic.literal()
    if (AccessControlPolicy != null) __obj.updateDynamic("AccessControlPolicy")(AccessControlPolicy)
    __obj.asInstanceOf[S3SetObjectAclOperation]
  }
}

