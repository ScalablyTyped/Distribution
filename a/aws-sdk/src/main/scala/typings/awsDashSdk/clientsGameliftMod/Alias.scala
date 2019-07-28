package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alias extends js.Object {
  /**
    * Unique identifier for an alias; alias ARNs are unique across all regions.
    */
  var AliasArn: js.UndefOr[ArnStringModel] = js.undefined
  /**
    * Unique identifier for an alias; alias IDs are unique within a region.
    */
  var AliasId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.AliasId] = js.undefined
  /**
    * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Human-readable description of an alias.
    */
  var Description: js.UndefOr[FreeText] = js.undefined
  /**
    * Time stamp indicating when this data object was last modified. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Descriptive label that is associated with an alias. Alias names do not need to be unique.
    */
  var Name: js.UndefOr[NonBlankAndLengthConstraintString] = js.undefined
  /**
    * Alias configuration for the alias, including routing type and settings.
    */
  var RoutingStrategy: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.RoutingStrategy] = js.undefined
}

object Alias {
  @scala.inline
  def apply(
    AliasArn: ArnStringModel = null,
    AliasId: AliasId = null,
    CreationTime: Timestamp = null,
    Description: FreeText = null,
    LastUpdatedTime: Timestamp = null,
    Name: NonBlankAndLengthConstraintString = null,
    RoutingStrategy: RoutingStrategy = null
  ): Alias = {
    val __obj = js.Dynamic.literal()
    if (AliasArn != null) __obj.updateDynamic("AliasArn")(AliasArn)
    if (AliasId != null) __obj.updateDynamic("AliasId")(AliasId)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (RoutingStrategy != null) __obj.updateDynamic("RoutingStrategy")(RoutingStrategy)
    __obj.asInstanceOf[Alias]
  }
}

