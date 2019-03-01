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
    canenter: js.Function1[/* repeated */ js.Any, scala.Boolean],
    canexit: js.Function1[/* repeated */ js.Any, scala.Boolean],
    description: java.lang.String,
    selected: scala.Boolean,
    title: java.lang.String,
    wzData: js.Any,
    wzTitle: java.lang.String
  ): WzStep = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canenter")(canenter)
    __obj.updateDynamic("canexit")(canexit)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("selected")(selected)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("wzData")(wzData)
    __obj.updateDynamic("wzTitle")(wzTitle)
    __obj.asInstanceOf[WzStep]
  }
}

