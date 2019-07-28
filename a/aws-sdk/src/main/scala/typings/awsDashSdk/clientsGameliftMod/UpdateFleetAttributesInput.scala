package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFleetAttributesInput extends js.Object {
  /**
    * Human-readable description of a fleet.
    */
  var Description: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Unique identifier for a fleet to update attribute metadata for.
    */
  var FleetId: typings.awsDashSdk.clientsGameliftMod.FleetId
  /**
    * Names of metric groups to include this fleet in. Amazon CloudWatch uses a fleet metric group is to aggregate metrics from multiple fleets. Use an existing metric group name to add this fleet to the group. Or use a new name to create a new metric group. A fleet can only be included in one metric group at a time.
    */
  var MetricGroups: js.UndefOr[MetricGroupList] = js.undefined
  /**
    * Descriptive label that is associated with a fleet. Fleet names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Game session protection policy to apply to all new instances created in this fleet. Instances that already exist are not affected. You can set protection for individual instances using UpdateGameSession.    NoProtection -- The game session can be terminated during a scale-down event.    FullProtection -- If the game session is in an ACTIVE status, it cannot be terminated during a scale-down event.  
    */
  var NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.undefined
  /**
    * Policy that limits the number of game sessions an individual player can create over a span of time. 
    */
  var ResourceCreationLimitPolicy: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.ResourceCreationLimitPolicy] = js.undefined
}

object UpdateFleetAttributesInput {
  @scala.inline
  def apply(
    FleetId: FleetId,
    Description: NonZeroAndMaxString = null,
    MetricGroups: MetricGroupList = null,
    Name: NonZeroAndMaxString = null,
    NewGameSessionProtectionPolicy: ProtectionPolicy = null,
    ResourceCreationLimitPolicy: ResourceCreationLimitPolicy = null
  ): UpdateFleetAttributesInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (MetricGroups != null) __obj.updateDynamic("MetricGroups")(MetricGroups)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (NewGameSessionProtectionPolicy != null) __obj.updateDynamic("NewGameSessionProtectionPolicy")(NewGameSessionProtectionPolicy.asInstanceOf[js.Any])
    if (ResourceCreationLimitPolicy != null) __obj.updateDynamic("ResourceCreationLimitPolicy")(ResourceCreationLimitPolicy)
    __obj.asInstanceOf[UpdateFleetAttributesInput]
  }
}

