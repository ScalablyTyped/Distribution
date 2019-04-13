package typings
package awsDashSdkLib.clientsSimpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletableItem extends js.Object {
  var Attributes: js.UndefOr[DeletableAttributeList] = js.undefined
  var Name: String
}

object DeletableItem {
  @scala.inline
  def apply(Name: String, Attributes: DeletableAttributeList = null): DeletableItem = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    __obj.asInstanceOf[DeletableItem]
  }
}

