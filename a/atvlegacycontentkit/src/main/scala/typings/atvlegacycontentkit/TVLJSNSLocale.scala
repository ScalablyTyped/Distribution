package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the users locale.
  *
  * See https://developer.apple.com/documentation/foundation/nslocale for more information.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait TVLJSNSLocale extends StObject {
  
  /**
    * The identifier for the locale.
    */
  var localeIdentifier: String
}
object TVLJSNSLocale {
  
  inline def apply(localeIdentifier: String): TVLJSNSLocale = {
    val __obj = js.Dynamic.literal(localeIdentifier = localeIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[TVLJSNSLocale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TVLJSNSLocale] (val x: Self) extends AnyVal {
    
    inline def setLocaleIdentifier(value: String): Self = StObject.set(x, "localeIdentifier", value.asInstanceOf[js.Any])
  }
}
