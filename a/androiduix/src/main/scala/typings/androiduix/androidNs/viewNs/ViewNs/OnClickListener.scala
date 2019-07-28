package typings.androiduix.androidNs.viewNs.ViewNs

import typings.androiduix.androidNs.viewNs.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnClickListener extends js.Object {
  def onClick(v: View): Unit
}

object OnClickListener {
  @scala.inline
  def apply(onClick: View => Unit): OnClickListener = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick))
  
    __obj.asInstanceOf[OnClickListener]
  }
}

