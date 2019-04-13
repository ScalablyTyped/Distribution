package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trigger extends js.Object {
  /**
    * The name of the trigger.
    */
  var Name: js.UndefOr[ResourceId] = js.undefined
}

object Trigger {
  @scala.inline
  def apply(Name: ResourceId = null): Trigger = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[Trigger]
  }
}

