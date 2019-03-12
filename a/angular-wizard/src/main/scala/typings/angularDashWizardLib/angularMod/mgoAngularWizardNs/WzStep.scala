package typings
package angularDashWizardLib.angularMod.mgoAngularWizardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WzStep extends js.Object {
  var description: java.lang.String
  var selected: scala.Boolean
  var title: java.lang.String
  var wzData: js.Any
  var wzTitle: java.lang.String
  def canenter(args: js.Any*): scala.Boolean
  def canexit(args: js.Any*): scala.Boolean
}

object WzStep {
  @scala.inline
  def apply(
    canenter: /* repeated */ js.Any => scala.Boolean,
    canexit: /* repeated */ js.Any => scala.Boolean,
    description: java.lang.String,
    selected: scala.Boolean,
    title: java.lang.String,
    wzData: js.Any,
    wzTitle: java.lang.String
  ): WzStep = {
    val __obj = js.Dynamic.literal(canenter = js.Any.fromFunction1(canenter), canexit = js.Any.fromFunction1(canexit), description = description, selected = selected, title = title, wzData = wzData, wzTitle = wzTitle)
  
    __obj.asInstanceOf[WzStep]
  }
}

