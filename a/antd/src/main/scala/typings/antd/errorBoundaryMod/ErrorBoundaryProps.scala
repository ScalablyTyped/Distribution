package typings.antd.errorBoundaryMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorBoundaryProps extends js.Object {
  var description: js.UndefOr[ReactNode] = js.undefined
  var message: js.UndefOr[ReactNode] = js.undefined
}

object ErrorBoundaryProps {
  @scala.inline
  def apply(description: ReactNode = null, message: ReactNode = null): ErrorBoundaryProps = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorBoundaryProps]
  }
}

