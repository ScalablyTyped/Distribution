package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyTypeDescription extends js.Object {
  /**
    * A description of the policy type.
    */
  var Description: js.UndefOr[Description] = js.undefined
  /**
    * The description of the policy attributes associated with the policies defined by Elastic Load Balancing.
    */
  var PolicyAttributeTypeDescriptions: js.UndefOr[PolicyAttributeTypeDescriptions] = js.undefined
  /**
    * The name of the policy type.
    */
  var PolicyTypeName: js.UndefOr[PolicyTypeName] = js.undefined
}

object PolicyTypeDescription {
  @scala.inline
  def apply(
    Description: Description = null,
    PolicyAttributeTypeDescriptions: PolicyAttributeTypeDescriptions = null,
    PolicyTypeName: PolicyTypeName = null
  ): PolicyTypeDescription = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (PolicyAttributeTypeDescriptions != null) __obj.updateDynamic("PolicyAttributeTypeDescriptions")(PolicyAttributeTypeDescriptions)
    if (PolicyTypeName != null) __obj.updateDynamic("PolicyTypeName")(PolicyTypeName)
    __obj.asInstanceOf[PolicyTypeDescription]
  }
}

