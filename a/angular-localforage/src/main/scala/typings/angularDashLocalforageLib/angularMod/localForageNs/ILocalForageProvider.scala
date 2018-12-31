package typings
package angularDashLocalforageLib.angularMod.localForageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocalForageProvider extends js.Object {
  def config(config: LocalForageConfig): scala.Unit
  def setNotify(onItemSet: scala.Boolean, onItemRemove: scala.Boolean): scala.Unit
}

