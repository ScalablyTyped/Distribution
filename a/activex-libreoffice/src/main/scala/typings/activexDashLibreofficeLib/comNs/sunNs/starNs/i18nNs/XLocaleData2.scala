package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access locale specific data.
  *
  * Derived from {@link com.sun.star.i18n.XLocaleData} and provides an additional method to return a sequence of all {@link com.sun.star.i18n.Currency2}
  * elements available for that locale.
  * @since OOo 2.0.3
  */
trait XLocaleData2 extends XLocaleData {
  /** returns all LC_CURRENCY currencies for a locale. */
  def getAllCurrencies2(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): activexDashInteropLib.SafeArray[Currency2]
}

