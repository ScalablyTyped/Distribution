package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the settings for number formatting. */
trait NumberFormatSettings extends XPropertySet {
  /** is set to indicate that a zero value should be formatted as an empty string. */
  var NoZero: Boolean
  /**
    * specifies the date which is represented by the value 0.
    *
    * The most common value for this is 12/30/1899.
    */
  var NullDate: Date
  /** specifies the maximum number of decimals used for the standard number format ("General"). */
  var StandardDecimals: Double
  /** specifies the first year to be generated from a two-digit year input. */
  var TwoDigitDateStart: Double
}

object NumberFormatSettings {
  @scala.inline
  def apply(
    NoZero: Boolean,
    NullDate: Date,
    PropertySetInfo: XPropertySetInfo,
    StandardDecimals: Double,
    TwoDigitDateStart: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): NumberFormatSettings = {
    val __obj = js.Dynamic.literal(NoZero = NoZero.asInstanceOf[js.Any], NullDate = NullDate.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], StandardDecimals = StandardDecimals.asInstanceOf[js.Any], TwoDigitDateStart = TwoDigitDateStart.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[NumberFormatSettings]
  }
}

