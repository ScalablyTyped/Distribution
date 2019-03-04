package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents an extended property set for printer properties.
  *
  * All properties are vetoable properties. If you change the properties between {@link com.sun.star.awt.XPrinter.startPage()} and {@link
  * com.sun.star.awt.XPrinter.endPage()} , a {@link com.sun.star.beans.PropertyVetoException} is thrown.
  * @see XPrinter
  * @see XInfoPrinter
  */
trait XPrinterPropertySet
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** returns a binary encoded version of the printer setup. */
  var BinarySetup: activexDashInteropLib.SafeArray[scala.Double]
  /** returns descriptions of all available printer forms. */
  val FormDescriptions: activexDashInteropLib.SafeArray[java.lang.String]
  /** returns a binary encoded version of the printer setup. */
  def getBinarySetup(): activexDashInteropLib.SafeArray[scala.Double]
  /** returns descriptions of all available printer forms. */
  def getFormDescriptions(): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * sets the form that should be used.
    *
    * Indirectly a printer is selected.
    */
  def selectForm(aFormDescription: java.lang.String): scala.Unit
  /**
    * sets the data specific to the printer driver.
    *
    * Get this data from the info printer and set the data to the printer.
    */
  def setBinarySetup(data: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): scala.Unit
  /** sets the orientation. */
  def setHorizontal(bHorizontal: scala.Boolean): scala.Unit
}

object XPrinterPropertySet {
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
  ): XPrinterPropertySet = {
    val __obj = js.Dynamic.literal(BinarySetup = BinarySetup, FormDescriptions = FormDescriptions, PropertySetInfo = PropertySetInfo, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getBinarySetup = getBinarySetup, getFormDescriptions = getFormDescriptions, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, selectForm = selectForm, setBinarySetup = setBinarySetup, setHorizontal = setHorizontal, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[XPrinterPropertySet]
  }
}

