package typings.activexLibreoffice.com_.sun.star.i18n

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Locale (mostly CJK) dependent characters that are forbidden at the start or end of a line.
  *
  * Returned by {@link XLocaleData.getForbiddenCharacters()} and used with {@link XForbiddenCharacters} methods.
  */
trait ForbiddenCharacters extends StObject {
  
  var beginLine: String
  
  var endLine: String
}
object ForbiddenCharacters {
  
  inline def apply(beginLine: String, endLine: String): ForbiddenCharacters = {
    val __obj = js.Dynamic.literal(beginLine = beginLine.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForbiddenCharacters]
  }
  
  extension [Self <: ForbiddenCharacters](x: Self) {
    
    inline def setBeginLine(value: String): Self = StObject.set(x, "beginLine", value.asInstanceOf[js.Any])
    
    inline def setEndLine(value: String): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
  }
}
