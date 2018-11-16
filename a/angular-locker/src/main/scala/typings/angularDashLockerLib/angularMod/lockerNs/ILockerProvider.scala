package typings
package angularDashLockerLib.angularMod.lockerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ILockerProvider
  extends angularLib.angularMod.angularNs.IServiceProvider {
  /**
              * Allow the defaults to be specified via the `lockerProvider`
              *
              * @param {ILockerSettings}  lockerSettings  The defaults to override
              */
  def defaults(lockerSettings: ILockerSettings): scala.Unit
}

