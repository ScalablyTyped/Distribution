package typings.activexLibreoffice.com_.sun.star.i18n

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * {@link Implementation} name details returned in a sequence by {@link XLocaleData.getCollatorImplementations()} .
  * @see XLocaleData for links to DTD of XML locale data files.
  */
trait Implementation extends StObject {
  
  var isDefault: Boolean
  
  var unoID: String
}
object Implementation {
  
  inline def apply(isDefault: Boolean, unoID: String): Implementation = {
    val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any], unoID = unoID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Implementation]
  }
  
  extension [Self <: Implementation](x: Self) {
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setUnoID(value: String): Self = StObject.set(x, "unoID", value.asInstanceOf[js.Any])
  }
}
