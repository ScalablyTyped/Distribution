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

object NativeNumberXmlAttributes {
  @scala.inline
  def apply(
    Format: java.lang.String,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Style: java.lang.String
  ): NativeNumberXmlAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Format")(Format)
    __obj.updateDynamic("Locale")(Locale)
    __obj.updateDynamic("Style")(Style)
    __obj.asInstanceOf[NativeNumberXmlAttributes]
  }
}

