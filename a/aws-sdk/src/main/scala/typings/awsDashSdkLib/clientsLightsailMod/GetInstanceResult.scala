package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the specified instance.
    */
  var instance: js.UndefOr[Instance] = js.undefined
}

object GetInstanceResult {
  @scala.inline
  def apply(instance: Instance = null): GetInstanceResult = {
    val __obj = js.Dynamic.literal()
    if (instance != null) __obj.updateDynamic("instance")(instance)
    __obj.asInstanceOf[GetInstanceResult]
  }
}

