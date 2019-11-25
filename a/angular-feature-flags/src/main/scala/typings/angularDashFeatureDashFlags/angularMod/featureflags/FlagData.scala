package typings.angularDashFeatureDashFlags.angularMod.featureflags

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlagData extends js.Object {
  /**
    * Boolean value for enabling/disabling the feature
    */
  var active: Boolean
  /**
    * A long description of the flag to further explain the feature being toggled
    * (only visible in the list of flags)
    */
  var description: String
  /**
    * Unique key that is used from the markup to resolve whether a flag is active or not.
    */
  var key: String
  /**
    * A short name of the flag (only visible in the list of flags)
    */
  var name: String
}

object FlagData {
  @scala.inline
  def apply(active: Boolean, description: String, key: String, name: String): FlagData = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FlagData]
  }
}

