package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAliasInput extends js.Object {
  /**
    * A unique identifier for the alias that you want to update. You can use either the alias ID or ARN value.
    */
  var AliasId: typings.awsDashSdk.clientsGameliftMod.AliasId = js.native
  /**
    * A human-readable description of the alias.
    */
  var Description: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A descriptive label that is associated with an alias. Alias names do not need to be unique.
    */
  var Name: js.UndefOr[NonBlankAndLengthConstraintString] = js.native
  /**
    * The routing configuration, including routing type and fleet target, for the alias.
    */
  var RoutingStrategy: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.RoutingStrategy] = js.native
}

object UpdateAliasInput {
  @scala.inline
  def apply(
    AliasId: AliasId,
    Description: NonZeroAndMaxString = null,
    Name: NonBlankAndLengthConstraintString = null,
    RoutingStrategy: RoutingStrategy = null
  ): UpdateAliasInput = {
    val __obj = js.Dynamic.literal(AliasId = AliasId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RoutingStrategy != null) __obj.updateDynamic("RoutingStrategy")(RoutingStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAliasInput]
  }
}

