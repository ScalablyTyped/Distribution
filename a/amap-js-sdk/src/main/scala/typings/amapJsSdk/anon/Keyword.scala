package typings.amapJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Keyword extends StObject {
  
  var city: String
  
  var keyword: String
}
object Keyword {
  
  inline def apply(city: String, keyword: String): Keyword = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyword]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Keyword] (val x: Self) extends AnyVal {
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
  }
}
