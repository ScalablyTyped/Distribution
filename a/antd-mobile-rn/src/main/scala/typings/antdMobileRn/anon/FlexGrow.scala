package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexGrow extends js.Object {
  var alignItems: String
  var backgroundColor: String
  var flexDirection: String
  var flexGrow: Double
  var paddingLeft: Double
}

object FlexGrow {
  @scala.inline
  def apply(
    alignItems: String,
    backgroundColor: String,
    flexDirection: String,
    flexGrow: Double,
    paddingLeft: Double
  ): FlexGrow = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any], flexGrow = flexGrow.asInstanceOf[js.Any], paddingLeft = paddingLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexGrow]
  }
}

