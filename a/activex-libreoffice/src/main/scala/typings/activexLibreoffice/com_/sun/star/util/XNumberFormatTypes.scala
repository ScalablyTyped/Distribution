package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents functions to get specific, predefined number formats. */
@js.native
trait XNumberFormatTypes extends XInterface {
  /**
    * @param nKey index of the old number format
    * @param nLocale the locale to which the number format is converted
    * @returns the index of the converted number format if successful, the old index if the number format could not be converted.
    */
  def getFormatForLocale(nKey: Double, nLocale: Locale): Double = js.native
  /**
    * @param nIndex the index of the wanted number format within the formats for the given locale. One of the {@link com.sun.star.i18n.NumberFormatIndex} cons
    * @param nLocale the locale for which the key is requested.
    * @returns the key of a built-in format for a locale:
    */
  def getFormatIndex(nIndex: Double, nLocale: Locale): Double = js.native
  /**
    * @param nType the type of the number format. Must be one of the {@link NumberFormat} constants.
    * @param nLocale the locale for which the number format is requested.
    * @returns the key of the standard format within a specified type for a given locale.
    */
  def getStandardFormat(nType: Double, nLocale: Locale): Double = js.native
  /** @returns the key of the standard format for a locale. */
  def getStandardIndex(nLocale: Locale): Double = js.native
  /** verifies if one type of number format is compatible with another type. */
  def isTypeCompatible(nOldType: Double, nNewType: Double): Boolean = js.native
}

object XNumberFormatTypes {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getFormatForLocale: (Double, Locale) => Double,
    getFormatIndex: (Double, Locale) => Double,
    getStandardFormat: (Double, Locale) => Double,
    getStandardIndex: Locale => Double,
    isTypeCompatible: (Double, Double) => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XNumberFormatTypes = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getFormatForLocale = js.Any.fromFunction2(getFormatForLocale), getFormatIndex = js.Any.fromFunction2(getFormatIndex), getStandardFormat = js.Any.fromFunction2(getStandardFormat), getStandardIndex = js.Any.fromFunction1(getStandardIndex), isTypeCompatible = js.Any.fromFunction2(isTypeCompatible), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XNumberFormatTypes]
  }
  @scala.inline
  implicit class XNumberFormatTypesOps[Self <: XNumberFormatTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetFormatForLocale(value: (Double, Locale) => Double): Self = this.set("getFormatForLocale", js.Any.fromFunction2(value))
    @scala.inline
    def setGetFormatIndex(value: (Double, Locale) => Double): Self = this.set("getFormatIndex", js.Any.fromFunction2(value))
    @scala.inline
    def setGetStandardFormat(value: (Double, Locale) => Double): Self = this.set("getStandardFormat", js.Any.fromFunction2(value))
    @scala.inline
    def setGetStandardIndex(value: Locale => Double): Self = this.set("getStandardIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setIsTypeCompatible(value: (Double, Double) => Boolean): Self = this.set("isTypeCompatible", js.Any.fromFunction2(value))
  }
  
}

