package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailabilityZone extends js.Object {
  /**
    * The name of the availability zone.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * 
    */
  var SupportedPlatforms: js.UndefOr[SupportedPlatformsList] = js.native
}

object AvailabilityZone {
  @scala.inline
  def apply(Name: String = null, SupportedPlatforms: SupportedPlatformsList = null): AvailabilityZone = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (SupportedPlatforms != null) __obj.updateDynamic("SupportedPlatforms")(SupportedPlatforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailabilityZone]
  }
}

