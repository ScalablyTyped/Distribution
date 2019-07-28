package typings.awsDashSdk.clientsSimpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceableAttribute extends js.Object {
  /**
    * The name of the replaceable attribute.
    */
  var Name: String
  /**
    * A flag specifying whether or not to replace the attribute/value pair or to add a new attribute/value pair. The default setting is false.
    */
  var Replace: js.UndefOr[Boolean] = js.undefined
  /**
    * The value of the replaceable attribute.
    */
  var Value: String
}

object ReplaceableAttribute {
  @scala.inline
  def apply(Name: String, Value: String, Replace: js.UndefOr[Boolean] = js.undefined): ReplaceableAttribute = {
    val __obj = js.Dynamic.literal(Name = Name, Value = Value)
    if (!js.isUndefined(Replace)) __obj.updateDynamic("Replace")(Replace)
    __obj.asInstanceOf[ReplaceableAttribute]
  }
}

