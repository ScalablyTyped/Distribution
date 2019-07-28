package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyAttachment extends js.Object {
  /**
    * The ObjectIdentifier that is associated with PolicyAttachment.
    */
  var ObjectIdentifier: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.ObjectIdentifier] = js.undefined
  /**
    * The ID of PolicyAttachment.
    */
  var PolicyId: js.UndefOr[ObjectIdentifier] = js.undefined
  /**
    * The type of policy that can be associated with PolicyAttachment.
    */
  var PolicyType: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.PolicyType] = js.undefined
}

object PolicyAttachment {
  @scala.inline
  def apply(
    ObjectIdentifier: ObjectIdentifier = null,
    PolicyId: ObjectIdentifier = null,
    PolicyType: PolicyType = null
  ): PolicyAttachment = {
    val __obj = js.Dynamic.literal()
    if (ObjectIdentifier != null) __obj.updateDynamic("ObjectIdentifier")(ObjectIdentifier)
    if (PolicyId != null) __obj.updateDynamic("PolicyId")(PolicyId)
    if (PolicyType != null) __obj.updateDynamic("PolicyType")(PolicyType)
    __obj.asInstanceOf[PolicyAttachment]
  }
}

