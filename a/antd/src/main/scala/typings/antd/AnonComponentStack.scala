package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponentStack extends js.Object {
  var componentStack: js.UndefOr[String] = js.undefined
}

object AnonComponentStack {
  @scala.inline
  def apply(componentStack: String = null): AnonComponentStack = {
    val __obj = js.Dynamic.literal()
    if (componentStack != null) __obj.updateDynamic("componentStack")(componentStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponentStack]
  }
}

