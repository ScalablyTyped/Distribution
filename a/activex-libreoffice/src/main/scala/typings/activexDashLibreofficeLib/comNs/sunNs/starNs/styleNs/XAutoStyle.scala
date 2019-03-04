package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface allows access to a single automatic style. */
trait XAutoStyle
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XMultiPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XMultiPropertyStates {
  /** returns a sequence of all properties that are set in the style */
  val Properties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  /** returns a sequence of all properties that are set in the style */
  def getProperties(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
}

object XAutoStyle {
  @scala.inline
  def apply(
    Properties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    acquire: js.Function0[scala.Unit],
    addPropertiesChangeListener: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
    firePropertiesChangeEvent: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
    getProperties: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues],
    getPropertyDefaults: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[_]
    ],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyStates: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState]
    ],
    getPropertyValues: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[_]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertiesChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
    setAllPropertiesToDefault: js.Function0[scala.Unit],
    setPropertiesToDefault: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], scala.Unit],
    setPropertyValues: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      scala.Unit
    ]
  ): XAutoStyle = {
    val __obj = js.Dynamic.literal(Properties = Properties.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo, acquire = acquire, addPropertiesChangeListener = addPropertiesChangeListener, firePropertiesChangeEvent = firePropertiesChangeEvent, getProperties = getProperties, getPropertyDefaults = getPropertyDefaults, getPropertySetInfo = getPropertySetInfo, getPropertyStates = getPropertyStates, getPropertyValues = getPropertyValues, queryInterface = queryInterface, release = release, removePropertiesChangeListener = removePropertiesChangeListener, setAllPropertiesToDefault = setAllPropertiesToDefault, setPropertiesToDefault = setPropertiesToDefault, setPropertyValues = setPropertyValues)
  
    __obj.asInstanceOf[XAutoStyle]
  }
}

