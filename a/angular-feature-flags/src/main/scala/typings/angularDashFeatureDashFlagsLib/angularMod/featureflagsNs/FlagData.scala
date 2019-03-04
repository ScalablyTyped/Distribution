package typings
package angularDashFeatureDashFlagsLib.angularMod.featureflagsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlagData extends js.Object {
  /**
    * Boolean value for enabling/disabling the feature
    */
  var active: scala.Boolean
  /**
    * A long description of the flag to further explain the feature being toggled
    * (only visible in the list of flags)
    */
  var description: java.lang.String
  /**
    * Unique key that is used from the markup to resolve whether a flag is active or not.
    */
  var key: java.lang.String
  /**
    * A short name of the flag (only visible in the list of flags)
    */
  var name: java.lang.String
}

object FlagData {
  @scala.inline
  def apply(
    active: scala.Boolean,
    description: java.lang.String,
    key: java.lang.String,
    name: java.lang.String
  ): FlagData = {
    val __obj = js.Dynamic.literal(active = active, description = description, key = key, name = name)
  
    __obj.asInstanceOf[FlagData]
  }
}

