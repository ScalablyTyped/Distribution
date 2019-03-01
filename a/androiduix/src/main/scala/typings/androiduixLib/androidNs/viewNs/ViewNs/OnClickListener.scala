package typings
package androiduixLib.androidNs.viewNs.ViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnClickListener extends js.Object {
  def onClick(v: androiduixLib.androidNs.viewNs.View): scala.Unit
}

object OnClickListener {
  @scala.inline
  def apply(onClick: js.Function1[androiduixLib.androidNs.viewNs.View, scala.Unit]): OnClickListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[OnClickListener]
  }
}

