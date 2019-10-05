package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FacetAttributeDefinition extends js.Object {
  /**
    * The default value of the attribute (if configured).
    */
  var DefaultValue: js.UndefOr[TypedAttributeValue] = js.undefined
  /**
    * Whether the attribute is mutable or not.
    */
  var IsImmutable: js.UndefOr[Bool] = js.undefined
  /**
    * Validation rules attached to the attribute definition.
    */
  var Rules: js.UndefOr[RuleMap] = js.undefined
  /**
    * The type of the attribute.
    */
  var Type: FacetAttributeType
}

object FacetAttributeDefinition {
  @scala.inline
  def apply(
    Type: FacetAttributeType,
    DefaultValue: TypedAttributeValue = null,
    IsImmutable: js.UndefOr[Boolean] = js.undefined,
    Rules: RuleMap = null
  ): FacetAttributeDefinition = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue)
    if (!js.isUndefined(IsImmutable)) __obj.updateDynamic("IsImmutable")(IsImmutable)
    if (Rules != null) __obj.updateDynamic("Rules")(Rules)
    __obj.asInstanceOf[FacetAttributeDefinition]
  }
}

