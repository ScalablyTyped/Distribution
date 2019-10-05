package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypedLinkAttributeDefinition extends js.Object {
  /**
    * The default value of the attribute (if configured).
    */
  var DefaultValue: js.UndefOr[TypedAttributeValue] = js.undefined
  /**
    * Whether the attribute is mutable or not.
    */
  var IsImmutable: js.UndefOr[Bool] = js.undefined
  /**
    * The unique name of the typed link attribute.
    */
  var Name: AttributeName
  /**
    * The required behavior of the TypedLinkAttributeDefinition.
    */
  var RequiredBehavior: RequiredAttributeBehavior
  /**
    * Validation rules that are attached to the attribute definition.
    */
  var Rules: js.UndefOr[RuleMap] = js.undefined
  /**
    * The type of the attribute.
    */
  var Type: FacetAttributeType
}

object TypedLinkAttributeDefinition {
  @scala.inline
  def apply(
    Name: AttributeName,
    RequiredBehavior: RequiredAttributeBehavior,
    Type: FacetAttributeType,
    DefaultValue: TypedAttributeValue = null,
    IsImmutable: js.UndefOr[Boolean] = js.undefined,
    Rules: RuleMap = null
  ): TypedLinkAttributeDefinition = {
    val __obj = js.Dynamic.literal(Name = Name, RequiredBehavior = RequiredBehavior.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue)
    if (!js.isUndefined(IsImmutable)) __obj.updateDynamic("IsImmutable")(IsImmutable)
    if (Rules != null) __obj.updateDynamic("Rules")(Rules)
    __obj.asInstanceOf[TypedLinkAttributeDefinition]
  }
}

