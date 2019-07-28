package typings.awsDashSdk.clientsSimpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceableItem extends js.Object {
  /**
    * The list of attributes for a replaceable item.
    */
  var Attributes: ReplaceableAttributeList
  /**
    * The name of the replaceable item.
    */
  var Name: String
}

object ReplaceableItem {
  @scala.inline
  def apply(Attributes: ReplaceableAttributeList, Name: String): ReplaceableItem = {
    val __obj = js.Dynamic.literal(Attributes = Attributes, Name = Name)
  
    __obj.asInstanceOf[ReplaceableItem]
  }
}

