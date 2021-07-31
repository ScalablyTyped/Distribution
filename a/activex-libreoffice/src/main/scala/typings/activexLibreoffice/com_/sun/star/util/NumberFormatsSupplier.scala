package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides an supplier of number formats
  * @see NumberFormats
  * @see NumberFormatter
  * @since OOo 1.1.2
  */
trait NumberFormatsSupplier
  extends StObject
     with XNumberFormatsSupplier {
  
  /** Create using default locale. */
  def createWithDefaultLocale(): Unit
  
  /**
    * Create using specific locale.
    * @param Locale the locale of the number formats supplier
    */
  def createWithLocale(Locale: Locale): Unit
}
object NumberFormatsSupplier {
  
  @scala.inline
  def apply(
    NumberFormatSettings: XPropertySet,
    NumberFormats: XNumberFormats,
    acquire: () => Unit,
    createWithDefaultLocale: () => Unit,
    createWithLocale: Locale => Unit,
    getNumberFormatSettings: () => XPropertySet,
    getNumberFormats: () => XNumberFormats,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): NumberFormatsSupplier = {
    val __obj = js.Dynamic.literal(NumberFormatSettings = NumberFormatSettings.asInstanceOf[js.Any], NumberFormats = NumberFormats.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createWithDefaultLocale = js.Any.fromFunction0(createWithDefaultLocale), createWithLocale = js.Any.fromFunction1(createWithLocale), getNumberFormatSettings = js.Any.fromFunction0(getNumberFormatSettings), getNumberFormats = js.Any.fromFunction0(getNumberFormats), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[NumberFormatsSupplier]
  }
  
  @scala.inline
  implicit class NumberFormatsSupplierMutableBuilder[Self <: NumberFormatsSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateWithDefaultLocale(value: () => Unit): Self = StObject.set(x, "createWithDefaultLocale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateWithLocale(value: Locale => Unit): Self = StObject.set(x, "createWithLocale", js.Any.fromFunction1(value))
  }
}
