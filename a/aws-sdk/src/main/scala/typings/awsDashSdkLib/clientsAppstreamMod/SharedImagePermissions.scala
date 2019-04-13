package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedImagePermissions extends js.Object {
  /**
    * Describes the permissions for a shared image.
    */
  var imagePermissions: ImagePermissions
  /**
    * The 12-digit identifier of the AWS account with which the image is shared.
    */
  var sharedAccountId: AwsAccountId
}

object SharedImagePermissions {
  @scala.inline
  def apply(imagePermissions: ImagePermissions, sharedAccountId: AwsAccountId): SharedImagePermissions = {
    val __obj = js.Dynamic.literal(imagePermissions = imagePermissions, sharedAccountId = sharedAccountId)
  
    __obj.asInstanceOf[SharedImagePermissions]
  }
}

