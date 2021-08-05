package typings.arangodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Charset extends StObject {
  
  var charset: String
}
object Charset {
  
  inline def apply(charset: String): Charset = {
    val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Charset]
  }
  
  extension [Self <: Charset](x: Self) {
    
    inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
  }
}
