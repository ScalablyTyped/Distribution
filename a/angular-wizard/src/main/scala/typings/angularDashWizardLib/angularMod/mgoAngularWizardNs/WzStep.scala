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

