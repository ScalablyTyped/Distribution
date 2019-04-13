package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeValueTarget extends js.Object {
  /**
    * The value of the attribute.
    */
  var AttributeValue: js.UndefOr[String] = js.undefined
}

object AttributeValueTarget {
  @scala.inline
  def apply(AttributeValue: String = null): AttributeValueTarget = {
    val __obj = js.Dynamic.literal()
    if (AttributeValue != null) __obj.updateDynamic("AttributeValue")(AttributeValue)
    __obj.asInstanceOf[AttributeValueTarget]
  }
}

