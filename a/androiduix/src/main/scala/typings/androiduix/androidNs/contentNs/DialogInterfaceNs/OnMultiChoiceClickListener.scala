package typings.androiduix.androidNs.contentNs.DialogInterfaceNs

import typings.androiduix.androidNs.contentNs.DialogInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMultiChoiceClickListener extends js.Object {
  def onClick(dialog: DialogInterface, which: Double, isChecked: Boolean): Unit
}

object OnMultiChoiceClickListener {
  @scala.inline
  def apply(onClick: (DialogInterface, Double, Boolean) => Unit): OnMultiChoiceClickListener = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction3(onClick))
  
    __obj.asInstanceOf[OnMultiChoiceClickListener]
  }
}

