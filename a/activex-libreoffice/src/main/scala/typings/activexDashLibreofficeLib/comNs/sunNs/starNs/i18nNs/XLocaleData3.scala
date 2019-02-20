package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access locale specific data.
  *
  * Derived from {@link com.sun.star.i18n.XLocaleData2} this provides an additional method to return a sequence of all {@link com.sun.star.i18n.Calendar2}
  * elements available for that locale.
  * @since LibreOffice 3.5
  */
trait XLocaleData3 extends XLocaleData2 {
  /** returns all LC_CALENDAR calendars for a locale. */
  def getAllCalendars2(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): activexDashInteropLib.SafeArray[Calendar2]
}

