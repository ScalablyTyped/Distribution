package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute extends js.Object {
  /**
    * The name of the attribute.
    */
  var Name: js.UndefOr[AttributeName] = js.undefined
  /**
    * The value of the attribute.
    */
  var Value: js.UndefOr[AttributeValue] = js.undefined
}

object Attribute {
  @scala.inline
  def apply(Name: AttributeName = null, Value: AttributeValue = null): Attribute = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[Attribute]
  }
}

