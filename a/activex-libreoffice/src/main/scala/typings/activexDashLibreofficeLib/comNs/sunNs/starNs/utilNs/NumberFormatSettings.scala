package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the settings for number formatting. */
trait NumberFormatSettings
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** is set to indicate that a zero value should be formatted as an empty string. */
  var NoZero: scala.Boolean
  /**
    * specifies the date which is represented by the value 0.
    *
    * The most common value for this is 12/30/1899.
    */
  var NullDate: Date
  /** specifies the maximum number of decimals used for the standard number format ("General"). */
  var StandardDecimals: scala.Double
  /** specifies the first year to be generated from a two-digit year input. */
  var TwoDigitDateStart: scala.Double
}

object NumberFormatSettings {
  @scala.inline
  def apply(
    NoZero: scala.Boolean,
    NullDate: Date,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    StandardDecimals: scala.Double,
    TwoDigitDateStart: scala.Double,
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
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): NumberFormatSettings = {
    val __obj = js.Dynamic.literal(NoZero = NoZero, NullDate = NullDate, PropertySetInfo = PropertySetInfo, StandardDecimals = StandardDecimals, TwoDigitDateStart = TwoDigitDateStart, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[NumberFormatSettings]
  }
}

