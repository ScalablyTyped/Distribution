package typings.angularDashLocalforage.angularMod.localForageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocalForageProvider extends js.Object {
  def config(config: LocalForageConfig): Unit
  def setNotify(onItemSet: Boolean, onItemRemove: Boolean): Unit
}

object ILocalForageProvider {
  @scala.inline
  def apply(config: LocalForageConfig => Unit, setNotify: (Boolean, Boolean) => Unit): ILocalForageProvider = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config), setNotify = js.Any.fromFunction2(setNotify))
  
    __obj.asInstanceOf[ILocalForageProvider]
  }
}

