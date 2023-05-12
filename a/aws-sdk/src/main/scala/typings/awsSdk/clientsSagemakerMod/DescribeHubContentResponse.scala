package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHubContentResponse extends StObject {
  
  /**
    * The date and time that hub content was created.
    */
  var CreationTime: js.Date
  
  /**
    * The document schema version for the hub content.
    */
  var DocumentSchemaVersion: typings.awsSdk.clientsSagemakerMod.DocumentSchemaVersion
  
  /**
    * The failure reason if importing hub content failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the hub that contains the content. 
    */
  var HubArn: typings.awsSdk.clientsSagemakerMod.HubArn
  
  /**
    * The Amazon Resource Name (ARN) of the hub content.
    */
  var HubContentArn: typings.awsSdk.clientsSagemakerMod.HubContentArn
  
  /**
    * The location of any dependencies that the hub content has, such as scripts, model artifacts, datasets, or notebooks.
    */
  var HubContentDependencies: js.UndefOr[HubContentDependencyList] = js.undefined
  
  /**
    * A description of the hub content.
    */
  var HubContentDescription: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HubContentDescription] = js.undefined
  
  /**
    * The display name of the hub content.
    */
  var HubContentDisplayName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HubContentDisplayName] = js.undefined
  
  /**
    * The hub content document that describes information about the hub content such as type, associated containers, scripts, and more.
    */
  var HubContentDocument: typings.awsSdk.clientsSagemakerMod.HubContentDocument
  
  /**
    * A string that provides a description of the hub content. This string can include links, tables, and standard markdown formating.
    */
  var HubContentMarkdown: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HubContentMarkdown] = js.undefined
  
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
  
  /**
    * The name of the hub that contains the content.
    */
  var HubName: typings.awsSdk.clientsSagemakerMod.HubName
}
object DescribeHubContentResponse {
  
  inline def apply(
    CreationTime: js.Date,
    DocumentSchemaVersion: DocumentSchemaVersion,
    HubArn: HubArn,
    HubContentArn: HubContentArn,
    HubContentDocument: HubContentDocument,
    HubContentName: HubContentName,
    HubContentStatus: HubContentStatus,
    HubContentType: HubContentType,
    HubContentVersion: HubContentVersion,
    HubName: HubName
  ): DescribeHubContentResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], DocumentSchemaVersion = DocumentSchemaVersion.asInstanceOf[js.Any], HubArn = HubArn.asInstanceOf[js.Any], HubContentArn = HubContentArn.asInstanceOf[js.Any], HubContentDocument = HubContentDocument.asInstanceOf[js.Any], HubContentName = HubContentName.asInstanceOf[js.Any], HubContentStatus = HubContentStatus.asInstanceOf[js.Any], HubContentType = HubContentType.asInstanceOf[js.Any], HubContentVersion = HubContentVersion.asInstanceOf[js.Any], HubName = HubName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHubContentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeHubContentResponse] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setDocumentSchemaVersion(value: DocumentSchemaVersion): Self = StObject.set(x, "DocumentSchemaVersion", value.asInstanceOf[js.Any])
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setHubArn(value: HubArn): Self = StObject.set(x, "HubArn", value.asInstanceOf[js.Any])
    
    inline def setHubContentArn(value: HubContentArn): Self = StObject.set(x, "HubContentArn", value.asInstanceOf[js.Any])
    
    inline def setHubContentDependencies(value: HubContentDependencyList): Self = StObject.set(x, "HubContentDependencies", value.asInstanceOf[js.Any])
    
    inline def setHubContentDependenciesUndefined: Self = StObject.set(x, "HubContentDependencies", js.undefined)
    
    inline def setHubContentDependenciesVarargs(value: HubContentDependency*): Self = StObject.set(x, "HubContentDependencies", js.Array(value*))
    
    inline def setHubContentDescription(value: HubContentDescription): Self = StObject.set(x, "HubContentDescription", value.asInstanceOf[js.Any])
    
    inline def setHubContentDescriptionUndefined: Self = StObject.set(x, "HubContentDescription", js.undefined)
    
    inline def setHubContentDisplayName(value: HubContentDisplayName): Self = StObject.set(x, "HubContentDisplayName", value.asInstanceOf[js.Any])
    
    inline def setHubContentDisplayNameUndefined: Self = StObject.set(x, "HubContentDisplayName", js.undefined)
    
    inline def setHubContentDocument(value: HubContentDocument): Self = StObject.set(x, "HubContentDocument", value.asInstanceOf[js.Any])
    
    inline def setHubContentMarkdown(value: HubContentMarkdown): Self = StObject.set(x, "HubContentMarkdown", value.asInstanceOf[js.Any])
    
    inline def setHubContentMarkdownUndefined: Self = StObject.set(x, "HubContentMarkdown", js.undefined)
    
    inline def setHubContentName(value: HubContentName): Self = StObject.set(x, "HubContentName", value.asInstanceOf[js.Any])
    
    inline def setHubContentSearchKeywords(value: HubContentSearchKeywordList): Self = StObject.set(x, "HubContentSearchKeywords", value.asInstanceOf[js.Any])
    
    inline def setHubContentSearchKeywordsUndefined: Self = StObject.set(x, "HubContentSearchKeywords", js.undefined)
    
    inline def setHubContentSearchKeywordsVarargs(value: HubSearchKeyword*): Self = StObject.set(x, "HubContentSearchKeywords", js.Array(value*))
    
    inline def setHubContentStatus(value: HubContentStatus): Self = StObject.set(x, "HubContentStatus", value.asInstanceOf[js.Any])
    
    inline def setHubContentType(value: HubContentType): Self = StObject.set(x, "HubContentType", value.asInstanceOf[js.Any])
    
    inline def setHubContentVersion(value: HubContentVersion): Self = StObject.set(x, "HubContentVersion", value.asInstanceOf[js.Any])
    
    inline def setHubName(value: HubName): Self = StObject.set(x, "HubName", value.asInstanceOf[js.Any])
  }
}
