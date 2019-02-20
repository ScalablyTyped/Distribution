package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Access number format codes defined in locale data. */
trait XNumberFormatCode
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns all format codes for a given **nFormatUsage** and locale.
    * @param nFormatUsage one of {@link KNumberFormatUsage} values
    * @param rLocale The locale for which the format codes are requested.
    */
  def getAllFormatCode(nFormatUsage: scala.Double, rLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): activexDashInteropLib.SafeArray[NumberFormatCode]
  /**
    * returns all format codes for a given locale.
    * @param rLocale The locale for which the format codes are requested.
    */
  def getAllFormatCodes(rLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): activexDashInteropLib.SafeArray[NumberFormatCode]
  /**
    * returns the default number format code of a specific category (usage group) for a given locale and format length type.
    * @param nFormatType one of the constants listed in {@link KNumberFormatType}
    * @param nFormatUsage one of {@link KNumberFormatUsage} values
    * @param rLocale The locale for which the format code is requested.
    */
  def getDefault(
    nFormatType: scala.Double,
    nFormatUsage: scala.Double,
    rLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  ): NumberFormatCode
  /**
    * returns the number format pointed to by **nFormatIndex** for a given locale.
    * @param nFormatIndex one of {@link NumberFormatIndex} values
    * @param rLocale The locale for which the format code is requested.
    */
  def getFormatCode(nFormatIndex: scala.Double, rLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): NumberFormatCode
}

