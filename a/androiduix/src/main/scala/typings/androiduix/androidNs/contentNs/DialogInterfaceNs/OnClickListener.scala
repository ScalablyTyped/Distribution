package typings.androiduix.androidNs.contentNs.DialogInterfaceNs

import typings.androiduix.androidNs.contentNs.DialogInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnClickListener extends js.Object {
  def onClick(dialog: DialogInterface, which: Double): Unit
}

object OnClickListener {
  @scala.inline
  def apply(onClick: (DialogInterface, Double) => Unit): OnClickListener = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction2(onClick))
  
    __obj.asInstanceOf[OnClickListener]
  }
}

