package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAliasInput extends js.Object {
  /**
    * Human-readable description of an alias.
    */
  var Description: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Descriptive label that is associated with an alias. Alias names do not need to be unique.
    */
  var Name: NonBlankAndLengthConstraintString
  /**
    * Object that specifies the fleet and routing type to use for the alias.
    */
  var RoutingStrategy: awsDashSdkLib.clientsGameliftMod.RoutingStrategy
}

object CreateAliasInput {
  @scala.inline
  def apply(
    Name: NonBlankAndLengthConstraintString,
    RoutingStrategy: RoutingStrategy,
    Description: NonZeroAndMaxString = null
  ): CreateAliasInput = {
    val __obj = js.Dynamic.literal(Name = Name, RoutingStrategy = RoutingStrategy)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[CreateAliasInput]
  }
}

