package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyAttributeTypeDescription extends js.Object {
  /**
    * The name of the attribute.
    */
  var AttributeName: js.UndefOr[typings.awsDashSdk.clientsElbMod.AttributeName] = js.native
  /**
    * The type of the attribute. For example, Boolean or Integer.
    */
  var AttributeType: js.UndefOr[typings.awsDashSdk.clientsElbMod.AttributeType] = js.native
  /**
    * The cardinality of the attribute. Valid values:   ONE(1) : Single value required   ZERO_OR_ONE(0..1) : Up to one value is allowed   ZERO_OR_MORE(0..*) : Optional. Multiple values are allowed   ONE_OR_MORE(1..*0) : Required. Multiple values are allowed  
    */
  var Cardinality: js.UndefOr[typings.awsDashSdk.clientsElbMod.Cardinality] = js.native
  /**
    * The default value of the attribute, if applicable.
    */
  var DefaultValue: js.UndefOr[typings.awsDashSdk.clientsElbMod.DefaultValue] = js.native
  /**
    * A description of the attribute.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsElbMod.Description] = js.native
}

object PolicyAttributeTypeDescription {
  @scala.inline
  def apply(
    AttributeName: AttributeName = null,
    AttributeType: AttributeType = null,
    Cardinality: Cardinality = null,
    DefaultValue: DefaultValue = null,
    Description: Description = null
  ): PolicyAttributeTypeDescription = {
    val __obj = js.Dynamic.literal()
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName.asInstanceOf[js.Any])
    if (AttributeType != null) __obj.updateDynamic("AttributeType")(AttributeType.asInstanceOf[js.Any])
    if (Cardinality != null) __obj.updateDynamic("Cardinality")(Cardinality.asInstanceOf[js.Any])
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyAttributeTypeDescription]
  }
}

