package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents an information printer. */
trait XInfoPrinter extends XPrinterPropertySet {
  /**
    * creates a new object which implements an {@link XDevice} .
    *
    * The current settings are used as a template.
    */
  def createDevice(): XDevice
}

object XInfoPrinter {
  @scala.inline
  def apply(
    BinarySetup: activexDashInteropLib.SafeArray[scala.Double],
    FormDescriptions: activexDashInteropLib.SafeArray[java.lang.String],
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    createDevice: js.Function0[XDevice],
    getBinarySetup: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getFormDescriptions: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    selectForm: js.Function1[java.lang.String, scala.Unit],
    setBinarySetup: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Unit],
    setHorizontal: js.Function1[scala.Boolean, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): XInfoPrinter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BinarySetup")(BinarySetup)
    __obj.updateDynamic("FormDescriptions")(FormDescriptions)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("createDevice")(createDevice)
    __obj.updateDynamic("getBinarySetup")(getBinarySetup)
    __obj.updateDynamic("getFormDescriptions")(getFormDescriptions)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("selectForm")(selectForm)
    __obj.updateDynamic("setBinarySetup")(setBinarySetup)
    __obj.updateDynamic("setHorizontal")(setHorizontal)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[XInfoPrinter]
  }
}

