package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsperpage extends js.Object {
  var items_per_page: String
  var jump_to: String
  var jump_to_confirm: String
  var next_3: String
  var next_5: String
  var next_page: String
  var page: String
  var prev_3: String
  var prev_5: String
  var prev_page: String
}

object AnonItemsperpage {
  @scala.inline
  def apply(
    items_per_page: String,
    jump_to: String,
    jump_to_confirm: String,
    next_3: String,
    next_5: String,
    next_page: String,
    page: String,
    prev_3: String,
    prev_5: String,
    prev_page: String
  ): AnonItemsperpage = {
    val __obj = js.Dynamic.literal(items_per_page = items_per_page.asInstanceOf[js.Any], jump_to = jump_to.asInstanceOf[js.Any], jump_to_confirm = jump_to_confirm.asInstanceOf[js.Any], next_3 = next_3.asInstanceOf[js.Any], next_5 = next_5.asInstanceOf[js.Any], next_page = next_page.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], prev_3 = prev_3.asInstanceOf[js.Any], prev_5 = prev_5.asInstanceOf[js.Any], prev_page = prev_page.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsperpage]
  }
}

