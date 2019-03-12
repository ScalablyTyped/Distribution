package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * supports the formatting of numberings in various language environments.
  * @author Oliver Specht
  * @see com.sun.star.text.NumberingRules
  * @see com.sun.star.text.NumberingLevel
  * @version 1.0
  */
trait XNumberingFormatter
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the formatted numbering string according to the given {@link com.sun.star.text.NumberingLevel} and the given {@link com.sun.star.lang.Locale} . */
  def makeNumberingString(
    aProperties: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  ): java.lang.String
}

object XNumberingFormatter {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    makeNumberingString: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale) => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XNumberingFormatter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), makeNumberingString = js.Any.fromFunction2(makeNumberingString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XNumberingFormatter]
  }
}

