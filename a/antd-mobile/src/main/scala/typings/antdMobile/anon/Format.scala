package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  var format: String
  
  var invalid: String
  
  var parse: String
}
object Format {
  
  inline def apply(format: String, invalid: String, parse: String): Format = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setInvalid(value: String): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setParse(value: String): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
  }
}
