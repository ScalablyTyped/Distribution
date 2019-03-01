package typings
package antdLib.libFormFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormComponentProps extends js.Object {
  var form: WrappedFormUtils
}

object FormComponentProps {
  @scala.inline
  def apply(form: WrappedFormUtils): FormComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("form")(form)
    __obj.asInstanceOf[FormComponentProps]
  }
}

