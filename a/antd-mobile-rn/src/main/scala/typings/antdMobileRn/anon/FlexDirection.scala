package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexDirection extends js.Object {
  var alignItems: String
  var flexDirection: String
  var justifyContent: String
}

object FlexDirection {
  @scala.inline
  def apply(alignItems: String, flexDirection: String, justifyContent: String): FlexDirection = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexDirection]
  }
}

