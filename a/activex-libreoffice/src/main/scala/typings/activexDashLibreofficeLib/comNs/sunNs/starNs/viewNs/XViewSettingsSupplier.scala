package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the view settings of the object. */
trait XViewSettingsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns an interface to the {@link ViewSettings} .  Subclasses might be returned instead, offering more settings. */
  val ViewSettings: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** @returns an interface to the {@link ViewSettings} .  Subclasses might be returned instead, offering more settings. */
  def getViewSettings(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}

object XViewSettingsSupplier {
  @scala.inline
  def apply(
    ViewSettings: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: js.Function0[scala.Unit],
    getViewSettings: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XViewSettingsSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ViewSettings")(ViewSettings)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getViewSettings")(getViewSettings)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XViewSettingsSupplier]
  }
}

