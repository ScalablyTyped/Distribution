package typings.antd.autoCompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceItemObject extends js.Object {
  var text: String
  var value: String
}

object DataSourceItemObject {
  @scala.inline
  def apply(text: String, value: String): DataSourceItemObject = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceItemObject]
  }
}

