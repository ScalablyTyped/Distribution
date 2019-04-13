package typings
package awsDashSdkLib.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Protection extends js.Object {
  /**
    * The unique identifier (ID) of the protection.
    */
  var Id: js.UndefOr[ProtectionId] = js.undefined
  /**
    * The friendly name of the protection. For example, My CloudFront distributions.
    */
  var Name: js.UndefOr[ProtectionName] = js.undefined
  /**
    * The ARN (Amazon Resource Name) of the AWS resource that is protected.
    */
  var ResourceArn: js.UndefOr[ResourceArn] = js.undefined
}

object Protection {
  @scala.inline
  def apply(Id: ProtectionId = null, Name: ProtectionName = null, ResourceArn: ResourceArn = null): Protection = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (ResourceArn != null) __obj.updateDynamic("ResourceArn")(ResourceArn)
    __obj.asInstanceOf[Protection]
  }
}

