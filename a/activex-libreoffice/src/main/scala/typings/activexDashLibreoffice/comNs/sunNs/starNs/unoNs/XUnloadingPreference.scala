package typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs

import typings.activexDashLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Backwards-compatibility remainder of a removed library unloading feature.
  * @deprecated DeprecatedDo not use.
  */
trait XUnloadingPreference extends XInterface {
  def releaseOnNotification(): Boolean
}

object XUnloadingPreference {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    releaseOnNotification: () => Boolean
  ): XUnloadingPreference = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), releaseOnNotification = js.Any.fromFunction0(releaseOnNotification))
  
    __obj.asInstanceOf[XUnloadingPreference]
  }
}

