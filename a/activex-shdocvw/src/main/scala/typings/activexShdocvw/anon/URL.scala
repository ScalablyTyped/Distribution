package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait URL extends StObject {
  
  val URL: String
}
object URL {
  
  inline def apply(URL: String): URL = {
    val __obj = js.Dynamic.literal(URL = URL.asInstanceOf[js.Any])
    __obj.asInstanceOf[URL]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: URL] (val x: Self) extends AnyVal {
    
    inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
