package typings.airtable

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpHeadersMod {
  
  @JSImport("airtable/lib/http_headers", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with HttpHeaders {
    
    /* CompleteClass */
    var _headersByLowercasedKey: Any = js.native
    
    /* CompleteClass */
    override def set(headerKey: String, headerValue: String): Unit = js.native
    
    /* CompleteClass */
    override def toJSON(): StringDictionary[String] = js.native
  }
  
  trait HttpHeaders extends StObject {
    
    var _headersByLowercasedKey: Any
    
    def set(headerKey: String, headerValue: String): Unit
    
    def toJSON(): StringDictionary[String]
  }
  object HttpHeaders {
    
    inline def apply(
      _headersByLowercasedKey: Any,
      set: (String, String) => Unit,
      toJSON: () => StringDictionary[String]
    ): HttpHeaders = {
      val __obj = js.Dynamic.literal(_headersByLowercasedKey = _headersByLowercasedKey.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[HttpHeaders]
    }
    
    extension [Self <: HttpHeaders](x: Self) {
      
      inline def setSet(value: (String, String) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setToJSON(value: () => StringDictionary[String]): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def set_headersByLowercasedKey(value: Any): Self = StObject.set(x, "_headersByLowercasedKey", value.asInstanceOf[js.Any])
    }
  }
}
