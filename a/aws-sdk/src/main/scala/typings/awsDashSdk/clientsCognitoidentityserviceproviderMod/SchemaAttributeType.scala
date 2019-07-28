package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaAttributeType extends js.Object {
  /**
    * The attribute data type.
    */
  var AttributeDataType: js.UndefOr[typings.awsDashSdk.clientsCognitoidentityserviceproviderMod.AttributeDataType] = js.undefined
  /**
    * Specifies whether the attribute type is developer only.
    */
  var DeveloperOnlyAttribute: js.UndefOr[BooleanType] = js.undefined
  /**
    * Specifies whether the value of the attribute can be changed. For any user pool attribute that's mapped to an identity provider attribute, you must set this parameter to true. Amazon Cognito updates mapped attributes when users sign in to your application through an identity provider. If an attribute is immutable, Amazon Cognito throws an error when it attempts to update the attribute. For more information, see Specifying Identity Provider Attribute Mappings for Your User Pool.
    */
  var Mutable: js.UndefOr[BooleanType] = js.undefined
  /**
    * A schema attribute of the name type.
    */
  var Name: js.UndefOr[CustomAttributeNameType] = js.undefined
  /**
    * Specifies the constraints for an attribute of the number type.
    */
  var NumberAttributeConstraints: js.UndefOr[NumberAttributeConstraintsType] = js.undefined
  /**
    * Specifies whether a user pool attribute is required. If the attribute is required and the user does not provide a value, registration or sign-in will fail.
    */
  var Required: js.UndefOr[BooleanType] = js.undefined
  /**
    * Specifies the constraints for an attribute of the string type.
    */
  var StringAttributeConstraints: js.UndefOr[StringAttributeConstraintsType] = js.undefined
}

object SchemaAttributeType {
  @scala.inline
  def apply(
    AttributeDataType: AttributeDataType = null,
    DeveloperOnlyAttribute: js.UndefOr[BooleanType] = js.undefined,
    Mutable: js.UndefOr[BooleanType] = js.undefined,
    Name: CustomAttributeNameType = null,
    NumberAttributeConstraints: NumberAttributeConstraintsType = null,
    Required: js.UndefOr[BooleanType] = js.undefined,
    StringAttributeConstraints: StringAttributeConstraintsType = null
  ): SchemaAttributeType = {
    val __obj = js.Dynamic.literal()
    if (AttributeDataType != null) __obj.updateDynamic("AttributeDataType")(AttributeDataType.asInstanceOf[js.Any])
    if (!js.isUndefined(DeveloperOnlyAttribute)) __obj.updateDynamic("DeveloperOnlyAttribute")(DeveloperOnlyAttribute)
    if (!js.isUndefined(Mutable)) __obj.updateDynamic("Mutable")(Mutable)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (NumberAttributeConstraints != null) __obj.updateDynamic("NumberAttributeConstraints")(NumberAttributeConstraints)
    if (!js.isUndefined(Required)) __obj.updateDynamic("Required")(Required)
    if (StringAttributeConstraints != null) __obj.updateDynamic("StringAttributeConstraints")(StringAttributeConstraints)
    __obj.asInstanceOf[SchemaAttributeType]
  }
}

