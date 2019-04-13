package typings
package awsDashSdkLib.clientsSimpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  /**
    * 
    */
  var AlternateNameEncoding: js.UndefOr[String] = js.undefined
  /**
    * A list of attributes.
    */
  var Attributes: AttributeList
  /**
    * The name of the item.
    */
  var Name: String
}

object Item {
  @scala.inline
  def apply(Attributes: AttributeList, Name: String, AlternateNameEncoding: String = null): Item = {
    val __obj = js.Dynamic.literal(Attributes = Attributes, Name = Name)
    if (AlternateNameEncoding != null) __obj.updateDynamic("AlternateNameEncoding")(AlternateNameEncoding)
    __obj.asInstanceOf[Item]
  }
}

