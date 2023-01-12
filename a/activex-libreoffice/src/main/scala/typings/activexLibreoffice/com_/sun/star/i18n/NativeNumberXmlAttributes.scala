package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.com_.sun.star.lang.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Attributes describing a native number mode for a specific locale, stored in XML file format.
  *
  * Used with {@link XNativeNumberSupplier.convertToXmlAttributes()} and {@link XNativeNumberSupplier.convertFromXmlAttributes()}
  * @since OOo 1.1.2
  */
trait NativeNumberXmlAttributes extends StObject {
  
  var Format: String
  
  var Locale: typings.activexLibreoffice.com_.sun.star.lang.Locale
  
  /** The type of the number string, for example, "short" or "medium" or "long". */
  var Style: String
}
object NativeNumberXmlAttributes {
  
  inline def apply(Format: String, Locale: Locale, Style: String): NativeNumberXmlAttributes = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeNumberXmlAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NativeNumberXmlAttributes] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: String): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
  }
}
