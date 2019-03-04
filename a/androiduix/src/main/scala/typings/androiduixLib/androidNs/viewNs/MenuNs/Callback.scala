package typings
package androiduixLib.androidNs.viewNs.MenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  def onMenuItemSelected(menu: androiduixLib.androidNs.viewNs.Menu, item: androiduixLib.androidNs.viewNs.MenuItem): scala.Boolean
}

object Callback {
  @scala.inline
  def apply(
    onMenuItemSelected: js.Function2[
      androiduixLib.androidNs.viewNs.Menu, 
      androiduixLib.androidNs.viewNs.MenuItem, 
      scala.Boolean
    ]
  ): Callback = {
    val __obj = js.Dynamic.literal(onMenuItemSelected = onMenuItemSelected)
  
    __obj.asInstanceOf[Callback]
  }
}

