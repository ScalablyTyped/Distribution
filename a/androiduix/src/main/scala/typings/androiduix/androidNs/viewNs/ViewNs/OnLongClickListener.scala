package typings.androiduix.androidNs.viewNs.ViewNs

import typings.androiduix.androidNs.viewNs.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnLongClickListener extends js.Object {
  def onLongClick(v: View): Boolean
}

object OnLongClickListener {
  @scala.inline
  def apply(onLongClick: View => Boolean): OnLongClickListener = {
    val __obj = js.Dynamic.literal(onLongClick = js.Any.fromFunction1(onLongClick))
  
    __obj.asInstanceOf[OnLongClickListener]
  }
}

