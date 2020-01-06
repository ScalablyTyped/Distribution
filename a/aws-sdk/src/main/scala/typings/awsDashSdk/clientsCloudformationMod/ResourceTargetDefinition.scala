package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceTargetDefinition extends js.Object {
  /**
    * Indicates which resource attribute is triggering this update, such as a change in the resource attribute's Metadata, Properties, or Tags.
    */
  var Attribute: js.UndefOr[ResourceAttribute] = js.native
  /**
    * If the Attribute value is Properties, the name of the property. For all other attributes, the value is null.
    */
  var Name: js.UndefOr[PropertyName] = js.native
  /**
    * If the Attribute value is Properties, indicates whether a change to this property causes the resource to be recreated. The value can be Never, Always, or Conditionally. To determine the conditions for a Conditionally recreation, see the update behavior for that property in the AWS CloudFormation User Guide.
    */
  var RequiresRecreation: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.RequiresRecreation] = js.native
}

object ResourceTargetDefinition {
  @scala.inline
  def apply(
    Attribute: ResourceAttribute = null,
    Name: PropertyName = null,
    RequiresRecreation: RequiresRecreation = null
  ): ResourceTargetDefinition = {
    val __obj = js.Dynamic.literal()
    if (Attribute != null) __obj.updateDynamic("Attribute")(Attribute.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RequiresRecreation != null) __obj.updateDynamic("RequiresRecreation")(RequiresRecreation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceTargetDefinition]
  }
}

