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
  def getOrdinalSuffix(nNumber: scala.Double, aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): activexDashInteropLib.SafeArray[java.lang.String]
}

