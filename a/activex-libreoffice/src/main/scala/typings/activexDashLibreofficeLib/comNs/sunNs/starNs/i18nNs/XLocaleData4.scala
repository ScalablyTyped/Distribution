package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access locale specific data.
  *
  * Derived from {@link com.sun.star.i18n.XLocaleData3} this provides an additional method to return a sequence of date acceptance patterns for a locale.
  * @since LibreOffice 3.6
  */
trait XLocaleData4 extends XLocaleData3 {
  /**
    * returns a sequence of date acceptance patterns for a locale
    *
    * Patterns with input combinations that are accepted as incomplete date input, such as **M/D** or **D.M.**
    */
  def getDateAcceptancePatterns(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): activexDashInteropLib.SafeArray[java.lang.String]
}

