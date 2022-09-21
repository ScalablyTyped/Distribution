package typings.angularCompiler.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait I18nNodesByMsgId extends StObject {
  
  var i18nNodesByMsgId: StringDictionary[js.Array[Node]]
  
  var locale: String | Null
}
object I18nNodesByMsgId {
  
  inline def apply(i18nNodesByMsgId: StringDictionary[js.Array[Node]]): I18nNodesByMsgId = {
    val __obj = js.Dynamic.literal(i18nNodesByMsgId = i18nNodesByMsgId.asInstanceOf[js.Any], locale = null)
    __obj.asInstanceOf[I18nNodesByMsgId]
  }
  
  extension [Self <: I18nNodesByMsgId](x: Self) {
    
    inline def setI18nNodesByMsgId(value: StringDictionary[js.Array[Node]]): Self = StObject.set(x, "i18nNodesByMsgId", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleNull: Self = StObject.set(x, "locale", null)
  }
}
