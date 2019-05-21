package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Affix extends js.Object {
  var affix: scala.Boolean
  var getContainer: js.Function0[stdLib.Window]
  var showInkInFixed: scala.Boolean
}

object Anon_Affix {
  @scala.inline
  def apply(affix: scala.Boolean, getContainer: () => stdLib.Window, showInkInFixed: scala.Boolean): Anon_Affix = {
    val __obj = js.Dynamic.literal(affix = affix, getContainer = js.Any.fromFunction0(getContainer), showInkInFixed = showInkInFixed)
  
    __obj.asInstanceOf[Anon_Affix]
  }
}

