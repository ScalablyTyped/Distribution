package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides an supplier of number formats
  * @see NumberFormats
  * @see NumberFormatter
  * @since OOo 1.1.2
  */
trait NumberFormatsSupplier extends XNumberFormatsSupplier {
  /** Create using default locale. */
  def createWithDefaultLocale(): scala.Unit
  /**
    * Create using specific locale.
    * @param Locale the locale of the number formats supplier
    */
  def createWithLocale(Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): scala.Unit
}

