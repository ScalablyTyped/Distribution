package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Backwards-compatibility remainder of a removed library unloading feature.
  * @deprecated DeprecatedDo not use.
  */
trait XUnloadingPreference extends XInterface {
  def releaseOnNotification(): scala.Boolean
}

object XUnloadingPreference {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    releaseOnNotification: () => scala.Boolean
  ): XUnloadingPreference = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), releaseOnNotification = js.Any.fromFunction0(releaseOnNotification))
  
    __obj.asInstanceOf[XUnloadingPreference]
  }
}

