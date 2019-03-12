package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to locale specific ordinal suffix systems.
  * @since OOo 2.2
  */
trait XOrdinalSuffix
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Returns all the possible ordinal suffixes for the number.
    *
    * This method will provide "<b>st</b>", "<b>nd</b>", "<b>rd</b>", "<b>th</b>" for an English locale, depending on the provided number. In some locales
    * like French, Italian or Spanish it ca return several suffixes for one number.
    *
    * Examples: for the number '1', the values will be **st** in English, but **er** and **re** in French. All these values may depend on the underlying
    * version of ICU.
    */
  def getOrdinalSuffix(nNumber: scala.Double, aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): stdLib.SafeArray[java.lang.String]
}

object XOrdinalSuffix {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getOrdinalSuffix: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => stdLib.SafeArray[java.lang.String],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XOrdinalSuffix = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getOrdinalSuffix = js.Any.fromFunction2(getOrdinalSuffix), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XOrdinalSuffix]
  }
}

