package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateHubRequest extends StObject {
  
  /**
    * A description of the updated hub.
    */
  var HubDescription: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HubDescription] = js.undefined
  
  /**
    * The display name of the hub.
    */
  var HubDisplayName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HubDisplayName] = js.undefined
  
  /**
    * The name of the hub to update.
    */
  var HubName: typings.awsSdk.clientsSagemakerMod.HubName
  
  /**
    * The searchable keywords for the hub.
    */
  var HubSearchKeywords: js.UndefOr[HubSearchKeywordList] = js.undefined
}
object UpdateHubRequest {
  
  inline def apply(HubName: HubName): UpdateHubRequest = {
    val __obj = js.Dynamic.literal(HubName = HubName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateHubRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateHubRequest] (val x: Self) extends AnyVal {
    
    inline def setHubDescription(value: HubDescription): Self = StObject.set(x, "HubDescription", value.asInstanceOf[js.Any])
    
    inline def setHubDescriptionUndefined: Self = StObject.set(x, "HubDescription", js.undefined)
    
    inline def setHubDisplayName(value: HubDisplayName): Self = StObject.set(x, "HubDisplayName", value.asInstanceOf[js.Any])
    
    inline def setHubDisplayNameUndefined: Self = StObject.set(x, "HubDisplayName", js.undefined)
    
    inline def setHubName(value: HubName): Self = StObject.set(x, "HubName", value.asInstanceOf[js.Any])
    
    inline def setHubSearchKeywords(value: HubSearchKeywordList): Self = StObject.set(x, "HubSearchKeywords", value.asInstanceOf[js.Any])
    
    inline def setHubSearchKeywordsUndefined: Self = StObject.set(x, "HubSearchKeywords", js.undefined)
    
    inline def setHubSearchKeywordsVarargs(value: HubSearchKeyword*): Self = StObject.set(x, "HubSearchKeywords", js.Array(value*))
  }
}
