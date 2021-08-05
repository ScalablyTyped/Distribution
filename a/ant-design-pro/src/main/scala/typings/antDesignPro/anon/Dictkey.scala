package typings.antDesignPro.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* key */ StringDictionary[String] {
  
  var clear: String
  
  var emptyText: String
  
  var viewMore: String
}
object Dictkey {
  
  inline def apply(clear: String, emptyText: String, viewMore: String): Dictkey = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], emptyText = emptyText.asInstanceOf[js.Any], viewMore = viewMore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  extension [Self <: Dictkey](x: Self) {
    
    inline def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    inline def setEmptyText(value: String): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
    
    inline def setViewMore(value: String): Self = StObject.set(x, "viewMore", value.asInstanceOf[js.Any])
  }
}
