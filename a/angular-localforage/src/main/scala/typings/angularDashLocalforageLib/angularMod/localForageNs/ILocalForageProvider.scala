package typings
package angularDashLocalforageLib.angularMod.localForageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocalForageProvider extends js.Object {
  def config(config: LocalForageConfig): scala.Unit
  def setNotify(onItemSet: scala.Boolean, onItemRemove: scala.Boolean): scala.Unit
}

object ILocalForageProvider {
  @scala.inline
  def apply(config: LocalForageConfig => scala.Unit, setNotify: (scala.Boolean, scala.Boolean) => scala.Unit): ILocalForageProvider = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config), setNotify = js.Any.fromFunction2(setNotify))
  
    __obj.asInstanceOf[ILocalForageProvider]
  }
}

