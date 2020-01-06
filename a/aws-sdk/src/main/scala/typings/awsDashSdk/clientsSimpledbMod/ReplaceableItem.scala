package typings.awsDashSdk.clientsSimpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceableItem extends js.Object {
  /**
    * The list of attributes for a replaceable item.
    */
  var Attributes: ReplaceableAttributeList = js.native
  /**
    * The name of the replaceable item.
    */
  var Name: String = js.native
}

object ReplaceableItem {
  @scala.inline
  def apply(Attributes: ReplaceableAttributeList, Name: String): ReplaceableItem = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReplaceableItem]
  }
}

