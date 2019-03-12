package typings
package androiduixLib.androidNs.viewNs.ViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnLongClickListener extends js.Object {
  def onLongClick(v: androiduixLib.androidNs.viewNs.View): scala.Boolean
}

object OnLongClickListener {
  @scala.inline
  def apply(onLongClick: androiduixLib.androidNs.viewNs.View => scala.Boolean): OnLongClickListener = {
    val __obj = js.Dynamic.literal(onLongClick = js.Any.fromFunction1(onLongClick))
  
    __obj.asInstanceOf[OnLongClickListener]
  }
}

