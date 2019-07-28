package typings.awsDashSdk.clientsSimpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletableAttribute extends js.Object {
  /**
    * The name of the attribute.
    */
  var Name: String
  /**
    * The value of the attribute.
    */
  var Value: js.UndefOr[String] = js.undefined
}

object DeletableAttribute {
  @scala.inline
  def apply(Name: String, Value: String = null): DeletableAttribute = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[DeletableAttribute]
  }
}

