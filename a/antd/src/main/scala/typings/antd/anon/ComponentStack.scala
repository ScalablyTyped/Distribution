package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentStack extends js.Object {
  var componentStack: js.UndefOr[String] = js.undefined
}

object ComponentStack {
  @scala.inline
  def apply(componentStack: String = null): ComponentStack = {
    val __obj = js.Dynamic.literal()
    if (componentStack != null) __obj.updateDynamic("componentStack")(componentStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentStack]
  }
}

