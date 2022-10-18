package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeywordInformation extends StObject {
  
  /**
    * The keyword as a string.
    */
  var Keyword: typings.awsSdk.clientsPinpointsmsvoicev2Mod.Keyword
  
  /**
    * The action to perform for the keyword.
    */
  var KeywordAction: typings.awsSdk.clientsPinpointsmsvoicev2Mod.KeywordAction
  
  /**
    * A custom message that can be used with the keyword.
    */
  var KeywordMessage: typings.awsSdk.clientsPinpointsmsvoicev2Mod.KeywordMessage
}
object KeywordInformation {
  
  inline def apply(Keyword: Keyword, KeywordAction: KeywordAction, KeywordMessage: KeywordMessage): KeywordInformation = {
    val __obj = js.Dynamic.literal(Keyword = Keyword.asInstanceOf[js.Any], KeywordAction = KeywordAction.asInstanceOf[js.Any], KeywordMessage = KeywordMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeywordInformation]
  }
  
  extension [Self <: KeywordInformation](x: Self) {
    
    inline def setKeyword(value: Keyword): Self = StObject.set(x, "Keyword", value.asInstanceOf[js.Any])
    
    inline def setKeywordAction(value: KeywordAction): Self = StObject.set(x, "KeywordAction", value.asInstanceOf[js.Any])
    
    inline def setKeywordMessage(value: KeywordMessage): Self = StObject.set(x, "KeywordMessage", value.asInstanceOf[js.Any])
  }
}
