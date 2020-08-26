package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.com_.sun.star.lang.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attributes describing a native number mode for a specific locale, stored in XML file format.
  *
  * Used with {@link XNativeNumberSupplier.convertToXmlAttributes()} and {@link XNativeNumberSupplier.convertFromXmlAttributes()}
  * @since OOo 1.1.2
  */
@js.native
trait NativeNumberXmlAttributes extends js.Object {
  var Format: String = js.native
  var Locale: typings.activexLibreoffice.com_.sun.star.lang.Locale = js.native
  /** The type of the number string, for example, "short" or "medium" or "long". */
  var Style: String = js.native
}

object NativeNumberXmlAttributes {
  @scala.inline
  def apply(Format: String, Locale: Locale, Style: String): NativeNumberXmlAttributes = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeNumberXmlAttributes]
  }
  @scala.inline
  implicit class NativeNumberXmlAttributesOps[Self <: NativeNumberXmlAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFormat(value: String): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: Locale): Self = this.set("Locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: String): Self = this.set("Style", value.asInstanceOf[js.Any])
  }
  
}

