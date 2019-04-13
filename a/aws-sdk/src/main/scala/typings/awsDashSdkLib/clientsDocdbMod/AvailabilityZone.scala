package typings
package awsDashSdkLib.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailabilityZone extends js.Object {
  /**
    * The name of the Availability Zone.
    */
  var Name: js.UndefOr[String] = js.undefined
}

object AvailabilityZone {
  @scala.inline
  def apply(Name: String = null): AvailabilityZone = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[AvailabilityZone]
  }
}

