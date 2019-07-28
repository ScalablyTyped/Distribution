package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAliasInput extends js.Object {
  /**
    * Unique identifier for a fleet alias. Specify the alias you want to update.
    */
  var AliasId: typings.awsDashSdk.clientsGameliftMod.AliasId
  /**
    * Human-readable description of an alias.
    */
  var Description: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Descriptive label that is associated with an alias. Alias names do not need to be unique.
    */
  var Name: js.UndefOr[NonBlankAndLengthConstraintString] = js.undefined
  /**
    * Object that specifies the fleet and routing type to use for the alias.
    */
  var RoutingStrategy: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.RoutingStrategy] = js.undefined
}

object UpdateAliasInput {
  @scala.inline
  def apply(
    AliasId: AliasId,
    Description: NonZeroAndMaxString = null,
    Name: NonBlankAndLengthConstraintString = null,
    RoutingStrategy: RoutingStrategy = null
  ): UpdateAliasInput = {
    val __obj = js.Dynamic.literal(AliasId = AliasId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (RoutingStrategy != null) __obj.updateDynamic("RoutingStrategy")(RoutingStrategy)
    __obj.asInstanceOf[UpdateAliasInput]
  }
}

