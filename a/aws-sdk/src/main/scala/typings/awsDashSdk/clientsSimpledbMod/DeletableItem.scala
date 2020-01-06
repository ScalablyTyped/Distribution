package typings.awsDashSdk.clientsSimpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletableItem extends js.Object {
  var Attributes: js.UndefOr[DeletableAttributeList] = js.native
  var Name: String = js.native
}

object DeletableItem {
  @scala.inline
  def apply(Name: String, Attributes: DeletableAttributeList = null): DeletableItem = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletableItem]
  }
}

