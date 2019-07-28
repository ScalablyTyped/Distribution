package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delete extends js.Object {
  /**
    * 
    */
  var Objects: ObjectIdentifierList
  /**
    * Element to enable quiet mode for the request. When you add this element, you must set its value to true.
    */
  var Quiet: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Quiet] = js.undefined
}

object Delete {
  @scala.inline
  def apply(Objects: ObjectIdentifierList, Quiet: js.UndefOr[Quiet] = js.undefined): Delete = {
    val __obj = js.Dynamic.literal(Objects = Objects)
    if (!js.isUndefined(Quiet)) __obj.updateDynamic("Quiet")(Quiet)
    __obj.asInstanceOf[Delete]
  }
}

