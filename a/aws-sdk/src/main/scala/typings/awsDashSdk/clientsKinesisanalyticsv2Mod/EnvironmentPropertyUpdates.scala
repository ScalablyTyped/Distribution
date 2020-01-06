package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentPropertyUpdates extends js.Object {
  /**
    * Describes updates to the execution property groups.
    */
  var PropertyGroups: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.PropertyGroups = js.native
}

object EnvironmentPropertyUpdates {
  @scala.inline
  def apply(PropertyGroups: PropertyGroups): EnvironmentPropertyUpdates = {
    val __obj = js.Dynamic.literal(PropertyGroups = PropertyGroups.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EnvironmentPropertyUpdates]
  }
}

