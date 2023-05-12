package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HubContentInfo extends StObject {
  
  /**
    * The date and time that the hub content was created.
    */
  var CreationTime: js.Date
  
  /**
    * The version of the hub content document schema.
    */
  var DocumentSchemaVersion: typings.awsSdk.clientsSagemakerMod.DocumentSchemaVersion
  
  /**
    * The Amazon Resource Name (ARN) of the hub content.
    */
  var HubContentArn: typings.awsSdk.clientsSagemakerMod.HubContentArn
  
  /**
    * A description of the hub content.
    */
  var HubContentDescription: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HubContentDescription] = js.undefined
  
  /**
    * The display name of the hub content.
    */
  var HubContentDisplayName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HubContentDisplayName] = js.undefined
  
  /**
    * The name of the hub content.
    */
  var HubContentName: typings.awsSdk.clientsSagemakerMod.HubContentName
  
  /**
    * The searchable keywords for the hub content.
    */
  var HubContentSearchKeywords: js.UndefOr[HubContentSearchKeywordList] = js.undefined
  
  /**
    * The status of the hub content.
    */
  var HubContentStatus: typings.awsSdk.clientsSagemakerMod.HubContentStatus
  
  /**
    * The type of hub content.
    */
  var HubContentType: typings.awsSdk.clientsSagemakerMod.HubContentType
  
  /**
    * The version of the hub content.
    */
  var HubContentVersion: typings.awsSdk.clientsSagemakerMod.HubContentVersion
}
object HubContentInfo {
  
  inline def apply(
    CreationTime: js.Date,
    DocumentSchemaVersion: DocumentSchemaVersion,
    HubContentArn: HubContentArn,
    HubContentName: HubContentName,
    HubContentStatus: HubContentStatus,
    HubContentType: HubContentType,
    HubContentVersion: HubContentVersion
  ): HubContentInfo = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], DocumentSchemaVersion = DocumentSchemaVersion.asInstanceOf[js.Any], HubContentArn = HubContentArn.asInstanceOf[js.Any], HubContentName = HubContentName.asInstanceOf[js.Any], HubContentStatus = HubContentStatus.asInstanceOf[js.Any], HubContentType = HubContentType.asInstanceOf[js.Any], HubContentVersion = HubContentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[HubContentInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HubContentInfo] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setDocumentSchemaVersion(value: DocumentSchemaVersion): Self = StObject.set(x, "DocumentSchemaVersion", value.asInstanceOf[js.Any])
    
    inline def setHubContentArn(value: HubContentArn): Self = StObject.set(x, "HubContentArn", value.asInstanceOf[js.Any])
    
    inline def setHubContentDescription(value: HubContentDescription): Self = StObject.set(x, "HubContentDescription", value.asInstanceOf[js.Any])
    
    inline def setHubContentDescriptionUndefined: Self = StObject.set(x, "HubContentDescription", js.undefined)
    
    inline def setHubContentDisplayName(value: HubContentDisplayName): Self = StObject.set(x, "HubContentDisplayName", value.asInstanceOf[js.Any])
    
    inline def setHubContentDisplayNameUndefined: Self = StObject.set(x, "HubContentDisplayName", js.undefined)
    
    inline def setHubContentName(value: HubContentName): Self = StObject.set(x, "HubContentName", value.asInstanceOf[js.Any])
    
    inline def setHubContentSearchKeywords(value: HubContentSearchKeywordList): Self = StObject.set(x, "HubContentSearchKeywords", value.asInstanceOf[js.Any])
    
    inline def setHubContentSearchKeywordsUndefined: Self = StObject.set(x, "HubContentSearchKeywords", js.undefined)
    
    inline def setHubContentSearchKeywordsVarargs(value: HubSearchKeyword*): Self = StObject.set(x, "HubContentSearchKeywords", js.Array(value*))
    
    inline def setHubContentStatus(value: HubContentStatus): Self = StObject.set(x, "HubContentStatus", value.asInstanceOf[js.Any])
    
    inline def setHubContentType(value: HubContentType): Self = StObject.set(x, "HubContentType", value.asInstanceOf[js.Any])
    
    inline def setHubContentVersion(value: HubContentVersion): Self = StObject.set(x, "HubContentVersion", value.asInstanceOf[js.Any])
  }
}
