package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the settings for number formatting. */
@js.native
trait NumberFormatSettings extends XPropertySet {
  
  /** is set to indicate that a zero value should be formatted as an empty string. */
  var NoZero: Boolean = js.native
  
  /**
    * specifies the date which is represented by the value 0.
    *
    * The most common value for this is 12/30/1899.
    */
  var NullDate: Date = js.native
  
  /** specifies the maximum number of decimals used for the standard number format ("General"). */
  var StandardDecimals: Double = js.native
  
  /** specifies the first year to be generated from a two-digit year input. */
  var TwoDigitDateStart: Double = js.native
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
  
  @scala.inline
  implicit class NumberFormatSettingsMutableBuilder[Self <: NumberFormatSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNoZero(value: Boolean): Self = StObject.set(x, "NoZero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullDate(value: Date): Self = StObject.set(x, "NullDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardDecimals(value: Double): Self = StObject.set(x, "StandardDecimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwoDigitDateStart(value: Double): Self = StObject.set(x, "TwoDigitDateStart", value.asInstanceOf[js.Any])
  }
}
