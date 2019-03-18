package typings
package antdLib.libFormFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormComponentProps[V] extends js.Object {
  var form: WrappedFormUtils[V]
}

object FormComponentProps {
  @scala.inline
  def apply[V](form: WrappedFormUtils[V]): FormComponentProps[V] = {
    val __obj = js.Dynamic.literal(form = form)
  
    __obj.asInstanceOf[FormComponentProps[V]]
  }
}

