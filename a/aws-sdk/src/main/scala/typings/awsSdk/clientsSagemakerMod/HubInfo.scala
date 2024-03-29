package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HubInfo extends StObject {
  
  /**
    * The date and time that the hub was created.
    */
  var CreationTime: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the hub.
    */
  var HubArn: typings.awsSdk.clientsSagemakerMod.HubArn
  
  /**
    * A description of the hub.
    */
  var HubDescription: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HubDescription] = js.undefined
  
  /**
    * The display name of the hub.
    */
  var HubDisplayName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HubDisplayName] = js.undefined
  
  /**
    * The name of the hub.
    */
  var HubName: typings.awsSdk.clientsSagemakerMod.HubName
  
  /**
    * The searchable keywords for the hub.
    */
  var HubSearchKeywords: js.UndefOr[HubSearchKeywordList] = js.undefined
  
  /**
    * The status of the hub.
    */
  var HubStatus: typings.awsSdk.clientsSagemakerMod.HubStatus
  
  /**
    * The date and time that the hub was last modified.
    */
  var LastModifiedTime: js.Date
}
object HubInfo {
  
  inline def apply(
    CreationTime: js.Date,
    HubArn: HubArn,
    HubName: HubName,
    HubStatus: HubStatus,
    LastModifiedTime: js.Date
  ): HubInfo = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], HubArn = HubArn.asInstanceOf[js.Any], HubName = HubName.asInstanceOf[js.Any], HubStatus = HubStatus.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[HubInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HubInfo] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setHubArn(value: HubArn): Self = StObject.set(x, "HubArn", value.asInstanceOf[js.Any])
    
    inline def setHubDescription(value: HubDescription): Self = StObject.set(x, "HubDescription", value.asInstanceOf[js.Any])
    
    inline def setHubDescriptionUndefined: Self = StObject.set(x, "HubDescription", js.undefined)
    
    inline def setHubDisplayName(value: HubDisplayName): Self = StObject.set(x, "HubDisplayName", value.asInstanceOf[js.Any])
    
    inline def setHubDisplayNameUndefined: Self = StObject.set(x, "HubDisplayName", js.undefined)
    
    inline def setHubName(value: HubName): Self = StObject.set(x, "HubName", value.asInstanceOf[js.Any])
    
    inline def setHubSearchKeywords(value: HubSearchKeywordList): Self = StObject.set(x, "HubSearchKeywords", value.asInstanceOf[js.Any])
    
    inline def setHubSearchKeywordsUndefined: Self = StObject.set(x, "HubSearchKeywords", js.undefined)
    
    inline def setHubSearchKeywordsVarargs(value: HubSearchKeyword*): Self = StObject.set(x, "HubSearchKeywords", js.Array(value*))
    
    inline def setHubStatus(value: HubStatus): Self = StObject.set(x, "HubStatus", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
  }
}
