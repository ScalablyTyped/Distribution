package typings.antd.formContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormItemContextProps extends js.Object {
  def updateItemErrors(name: String, errors: js.Array[String]): Unit = js.native
}

object FormItemContextProps {
  @scala.inline
  def apply(updateItemErrors: (String, js.Array[String]) => Unit): FormItemContextProps = {
    val __obj = js.Dynamic.literal(updateItemErrors = js.Any.fromFunction2(updateItemErrors))
    __obj.asInstanceOf[FormItemContextProps]
  }
  @scala.inline
  implicit class FormItemContextPropsOps[Self <: FormItemContextProps] (val x: Self) extends AnyVal {
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
    def setUpdateItemErrors(value: (String, js.Array[String]) => Unit): Self = this.set("updateItemErrors", js.Any.fromFunction2(value))
  }
  
}

