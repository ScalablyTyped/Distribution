package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutKeywordResult extends StObject {
  
  /**
    * The keyword that was added.
    */
  var Keyword: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.Keyword] = js.undefined
  
  /**
    * The action to perform when the keyword is used.
    */
  var KeywordAction: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.KeywordAction] = js.undefined
  
  /**
    * The message associated with the keyword.
    */
  var KeywordMessage: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.KeywordMessage] = js.undefined
  
  /**
    * The PhoneNumberId or PoolId that the keyword was associated with.
    */
  var OriginationIdentity: js.UndefOr[String] = js.undefined
  
  /**
    * The PhoneNumberArn or PoolArn that the keyword was associated with.
    */
  var OriginationIdentityArn: js.UndefOr[String] = js.undefined
}
object PutKeywordResult {
  
  inline def apply(): PutKeywordResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutKeywordResult]
  }
  
  extension [Self <: PutKeywordResult](x: Self) {
    
    inline def setKeyword(value: Keyword): Self = StObject.set(x, "Keyword", value.asInstanceOf[js.Any])
    
    inline def setKeywordAction(value: KeywordAction): Self = StObject.set(x, "KeywordAction", value.asInstanceOf[js.Any])
    
    inline def setKeywordActionUndefined: Self = StObject.set(x, "KeywordAction", js.undefined)
    
    inline def setKeywordMessage(value: KeywordMessage): Self = StObject.set(x, "KeywordMessage", value.asInstanceOf[js.Any])
    
    inline def setKeywordMessageUndefined: Self = StObject.set(x, "KeywordMessage", js.undefined)
    
    inline def setKeywordUndefined: Self = StObject.set(x, "Keyword", js.undefined)
    
    inline def setOriginationIdentity(value: String): Self = StObject.set(x, "OriginationIdentity", value.asInstanceOf[js.Any])
    
    inline def setOriginationIdentityArn(value: String): Self = StObject.set(x, "OriginationIdentityArn", value.asInstanceOf[js.Any])
    
    inline def setOriginationIdentityArnUndefined: Self = StObject.set(x, "OriginationIdentityArn", js.undefined)
    
    inline def setOriginationIdentityUndefined: Self = StObject.set(x, "OriginationIdentity", js.undefined)
  }
}
