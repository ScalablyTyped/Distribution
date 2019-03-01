package typings
package androiduixLib.androidNs.contentNs.DialogInterfaceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMultiChoiceClickListener extends js.Object {
  def onClick(
    dialog: androiduixLib.androidNs.contentNs.DialogInterface,
    which: scala.Double,
    isChecked: scala.Boolean
  ): scala.Unit
}

object OnMultiChoiceClickListener {
  @scala.inline
  def apply(
    onClick: js.Function3[
      androiduixLib.androidNs.contentNs.DialogInterface, 
      scala.Double, 
      scala.Boolean, 
      scala.Unit
    ]
  ): OnMultiChoiceClickListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[OnMultiChoiceClickListener]
  }
}

