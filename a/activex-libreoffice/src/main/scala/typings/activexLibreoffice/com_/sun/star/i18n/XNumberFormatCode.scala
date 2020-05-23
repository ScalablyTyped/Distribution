package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Access number format codes defined in locale data. */
trait XNumberFormatCode extends XInterface {
  /**
    * returns all format codes for a given **nFormatUsage** and locale.
    * @param nFormatUsage one of {@link KNumberFormatUsage} values
    * @param rLocale The locale for which the format codes are requested.
    */
  def getAllFormatCode(nFormatUsage: Double, rLocale: Locale): SafeArray[NumberFormatCode]
  /**
    * returns all format codes for a given locale.
    * @param rLocale The locale for which the format codes are requested.
    */
  def getAllFormatCodes(rLocale: Locale): SafeArray[NumberFormatCode]
  /**
    * returns the default number format code of a specific category (usage group) for a given locale and format length type.
    * @param nFormatType one of the constants listed in {@link KNumberFormatType}
    * @param nFormatUsage one of {@link KNumberFormatUsage} values
    * @param rLocale The locale for which the format code is requested.
    */
  def getDefault(nFormatType: Double, nFormatUsage: Double, rLocale: Locale): NumberFormatCode
  /**
    * returns the number format pointed to by **nFormatIndex** for a given locale.
    * @param nFormatIndex one of {@link NumberFormatIndex} values
    * @param rLocale The locale for which the format code is requested.
    */
  def getFormatCode(nFormatIndex: Double, rLocale: Locale): NumberFormatCode
}

object XNumberFormatCode {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getAllFormatCode: (Double, Locale) => SafeArray[NumberFormatCode],
    getAllFormatCodes: Locale => SafeArray[NumberFormatCode],
    getDefault: (Double, Double, Locale) => NumberFormatCode,
    getFormatCode: (Double, Locale) => NumberFormatCode,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XNumberFormatCode = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getAllFormatCode = js.Any.fromFunction2(getAllFormatCode), getAllFormatCodes = js.Any.fromFunction1(getAllFormatCodes), getDefault = js.Any.fromFunction3(getDefault), getFormatCode = js.Any.fromFunction2(getFormatCode), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XNumberFormatCode]
  }
}

