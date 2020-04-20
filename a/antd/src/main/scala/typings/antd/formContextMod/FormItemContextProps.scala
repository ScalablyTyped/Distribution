package typings.antd.formContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormItemContextProps extends js.Object {
  def updateItemErrors(name: String, errors: js.Array[String]): Unit
}

object FormItemContextProps {
  @scala.inline
  def apply(updateItemErrors: (String, js.Array[String]) => Unit): FormItemContextProps = {
    val __obj = js.Dynamic.literal(updateItemErrors = js.Any.fromFunction2(updateItemErrors))
    __obj.asInstanceOf[FormItemContextProps]
  }
}

