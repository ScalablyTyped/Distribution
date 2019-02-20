package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attributes describing a native number mode for a specific locale, stored in XML file format.
  *
  * Used with {@link XNativeNumberSupplier.convertToXmlAttributes()} and {@link XNativeNumberSupplier.convertFromXmlAttributes()}
  * @since OOo 1.1.2
  */
trait NativeNumberXmlAttributes extends js.Object {
  var Format: java.lang.String
  var Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale
  /** The type of the number string, for example, "short" or "medium" or "long". */
  var Style: java.lang.String
}

