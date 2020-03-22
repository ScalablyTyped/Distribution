package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSearchPlaceholder extends js.Object {
  var itemUnit: String
  var itemsUnit: String
  var searchPlaceholder: String
  var titles: js.Array[String]
}

object AnonSearchPlaceholder {
  @scala.inline
  def apply(itemUnit: String, itemsUnit: String, searchPlaceholder: String, titles: js.Array[String]): AnonSearchPlaceholder = {
    val __obj = js.Dynamic.literal(itemUnit = itemUnit.asInstanceOf[js.Any], itemsUnit = itemsUnit.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], titles = titles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSearchPlaceholder]
  }
}

