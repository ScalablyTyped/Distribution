package typings
package angularDashLockerLib.angularMod.lockerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILockerProvider
  extends angularLib.angularMod.IServiceProvider {
  /**
    * Allow the defaults to be specified via the `lockerProvider`
    *
    * @param {ILockerSettings}  lockerSettings  The defaults to override
    */
  def defaults(lockerSettings: ILockerSettings): scala.Unit
}

object ILockerProvider {
  @scala.inline
  def apply($get: js.Any, defaults: ILockerSettings => scala.Unit): ILockerProvider = {
    val __obj = js.Dynamic.literal($get = $get, defaults = js.Any.fromFunction1(defaults))
  
    __obj.asInstanceOf[ILockerProvider]
  }
}

