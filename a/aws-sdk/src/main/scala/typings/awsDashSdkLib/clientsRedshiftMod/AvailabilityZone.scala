package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailabilityZone extends js.Object {
  /**
    * The name of the availability zone.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * 
    */
  var SupportedPlatforms: js.UndefOr[SupportedPlatformsList] = js.undefined
}

object AvailabilityZone {
  @scala.inline
  def apply(Name: String = null, SupportedPlatforms: SupportedPlatformsList = null): AvailabilityZone = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (SupportedPlatforms != null) __obj.updateDynamic("SupportedPlatforms")(SupportedPlatforms)
    __obj.asInstanceOf[AvailabilityZone]
  }
}

