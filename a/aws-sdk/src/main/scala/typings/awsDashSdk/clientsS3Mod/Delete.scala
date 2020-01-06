package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delete extends js.Object {
  /**
    * The objects to delete.
    */
  var Objects: ObjectIdentifierList = js.native
  /**
    * Element to enable quiet mode for the request. When you add this element, you must set its value to true.
    */
  var Quiet: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Quiet] = js.native
}

object Delete {
  @scala.inline
  def apply(Objects: ObjectIdentifierList, Quiet: js.UndefOr[Boolean] = js.undefined): Delete = {
    val __obj = js.Dynamic.literal(Objects = Objects.asInstanceOf[js.Any])
    if (!js.isUndefined(Quiet)) __obj.updateDynamic("Quiet")(Quiet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
}

