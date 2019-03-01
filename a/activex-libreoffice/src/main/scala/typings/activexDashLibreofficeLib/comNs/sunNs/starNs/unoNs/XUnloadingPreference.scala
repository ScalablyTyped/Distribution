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
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    releaseOnNotification: js.Function0[scala.Boolean]
  ): XUnloadingPreference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("releaseOnNotification")(releaseOnNotification)
    __obj.asInstanceOf[XUnloadingPreference]
  }
}

