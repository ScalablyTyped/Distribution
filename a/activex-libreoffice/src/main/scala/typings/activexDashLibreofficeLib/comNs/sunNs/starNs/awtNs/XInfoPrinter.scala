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
    val __obj = js.Dynamic.literal(BinarySetup = BinarySetup, FormDescriptions = FormDescriptions, PropertySetInfo = PropertySetInfo, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, createDevice = createDevice, getBinarySetup = getBinarySetup, getFormDescriptions = getFormDescriptions, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, selectForm = selectForm, setBinarySetup = setBinarySetup, setHorizontal = setHorizontal, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[XInfoPrinter]
  }
}

