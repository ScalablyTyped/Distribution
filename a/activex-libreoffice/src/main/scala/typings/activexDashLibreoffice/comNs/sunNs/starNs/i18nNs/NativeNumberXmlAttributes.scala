package typings.activexDashLibreoffice.comNs.sunNs.starNs.i18nNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
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
  var Format: String
  var Locale: typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
  /** The type of the number string, for example, "short" or "medium" or "long". */
  var Style: String
}

object NativeNumberXmlAttributes {
  @scala.inline
  def apply(Format: String, Locale: Locale, Style: String): NativeNumberXmlAttributes = {
    val __obj = js.Dynamic.literal(Format = Format, Locale = Locale, Style = Style)
  
    __obj.asInstanceOf[NativeNumberXmlAttributes]
  }
}

