package typings.arangodb.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var _from: js.UndefOr[String] = js.undefined
  
  var _to: js.UndefOr[String] = js.undefined
}
object From {
  
  inline def apply(): From = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[From]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
    
    inline def set_from(value: String): Self = StObject.set(x, "_from", value.asInstanceOf[js.Any])
    
    inline def set_fromUndefined: Self = StObject.set(x, "_from", js.undefined)
    
    inline def set_to(value: String): Self = StObject.set(x, "_to", value.asInstanceOf[js.Any])
    
    inline def set_toUndefined: Self = StObject.set(x, "_to", js.undefined)
  }
}
