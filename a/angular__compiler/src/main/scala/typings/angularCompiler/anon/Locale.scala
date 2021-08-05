package typings.angularCompiler.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.i18nAstMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locale extends StObject {
  
  var i18nNodesByMsgId: StringDictionary[js.Array[Node]]
  
  var locale: String
}
object Locale {
  
  inline def apply(i18nNodesByMsgId: StringDictionary[js.Array[Node]], locale: String): Locale = {
    val __obj = js.Dynamic.literal(i18nNodesByMsgId = i18nNodesByMsgId.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  
  extension [Self <: Locale](x: Self) {
    
    inline def setI18nNodesByMsgId(value: StringDictionary[js.Array[Node]]): Self = StObject.set(x, "i18nNodesByMsgId", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
  }
}
