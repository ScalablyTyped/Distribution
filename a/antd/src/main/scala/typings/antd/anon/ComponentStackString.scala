package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentStackString extends js.Object {
  var componentStack: String = js.native
}

object ComponentStackString {
  @scala.inline
  def apply(componentStack: String): ComponentStackString = {
    val __obj = js.Dynamic.literal(componentStack = componentStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentStackString]
  }
  @scala.inline
  implicit class ComponentStackStringOps[Self <: ComponentStackString] (val x: Self) extends AnyVal {
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
    def setComponentStack(value: String): Self = this.set("componentStack", value.asInstanceOf[js.Any])
  }
  
}

