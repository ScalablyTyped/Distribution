package typings.antd

import typings.antd.antdStrings.bottom
import typings.antd.antdStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBottomLoading extends js.Object {
  var loading: Boolean
  var multiLines: Boolean
  var notFoundContent: String
  var placement: bottom | top
}

object AnonBottomLoading {
  @scala.inline
  def apply(loading: Boolean, multiLines: Boolean, notFoundContent: String, placement: bottom | top): AnonBottomLoading = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], multiLines = multiLines.asInstanceOf[js.Any], notFoundContent = notFoundContent.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBottomLoading]
  }
}

