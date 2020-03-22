package typings.antd.formListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldData extends js.Object {
  var fieldKey: Double
  var key: Double
  var name: Double
}

object FieldData {
  @scala.inline
  def apply(fieldKey: Double, key: Double, name: Double): FieldData = {
    val __obj = js.Dynamic.literal(fieldKey = fieldKey.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldData]
  }
}

