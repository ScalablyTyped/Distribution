package typings.antd

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTitles extends js.Object {
  var itemUnit: String
  var itemsUnit: String
  var notFoundContent: ReactNode
  var searchPlaceholder: String
  var titles: js.Array[String]
}

object AnonTitles {
  @scala.inline
  def apply(
    itemUnit: String,
    itemsUnit: String,
    searchPlaceholder: String,
    titles: js.Array[String],
    notFoundContent: ReactNode = null
  ): AnonTitles = {
    val __obj = js.Dynamic.literal(itemUnit = itemUnit.asInstanceOf[js.Any], itemsUnit = itemsUnit.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], titles = titles.asInstanceOf[js.Any])
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTitles]
  }
}

