package typings.antd.errorBoundaryMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorBoundaryProps extends js.Object {
  var description: js.UndefOr[ReactNode] = js.native
  var message: js.UndefOr[ReactNode] = js.native
}

object ErrorBoundaryProps {
  @scala.inline
  def apply(): ErrorBoundaryProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorBoundaryProps]
  }
  @scala.inline
  implicit class ErrorBoundaryPropsOps[Self <: ErrorBoundaryProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: ReactNode): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setMessage(value: ReactNode): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

