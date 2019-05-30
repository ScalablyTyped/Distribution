package typings
package awsDashSdkLib.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thing extends js.Object {
  /**
    * The ARN of the thing.
    */
  var thingArn: js.UndefOr[ThingArn] = js.undefined
  /**
    * The name of the thing.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
}

object Thing {
  @scala.inline
  def apply(thingArn: ThingArn = null, thingName: ThingName = null): Thing = {
    val __obj = js.Dynamic.literal()
    if (thingArn != null) __obj.updateDynamic("thingArn")(thingArn)
    if (thingName != null) __obj.updateDynamic("thingName")(thingName)
    __obj.asInstanceOf[Thing]
  }
}

