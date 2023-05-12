package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportHubContentRequest extends StObject {
  
  /**
    * The version of the hub content schema to import.
    */
  var DocumentSchemaVersion: typings.awsSdk.clientsSagemakerMod.DocumentSchemaVersion
  
  /**
    * A description of the hub content to import.
    */
  var HubContentDescription: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HubContentDescription] = js.undefined
  
  /**
    * The display name of the hub content to import.
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
    * The name of the hub content to import.
    */
  var HubContentName: typings.awsSdk.clientsSagemakerMod.HubContentName
  
  /**
    * The searchable keywords of the hub content.
    */
  var HubContentSearchKeywords: js.UndefOr[HubContentSearchKeywordList] = js.undefined
  
  /**
    * The type of hub content to import.
    */
  var HubContentType: typings.awsSdk.clientsSagemakerMod.HubContentType
  
  /**
    * The version of the hub content to import.
    */
  var HubContentVersion: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HubContentVersion] = js.undefined
  
  /**
    * The name of the hub to import content into.
    */
  var HubName: typings.awsSdk.clientsSagemakerMod.HubName
  
  /**
    * Any tags associated with the hub content.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ImportHubContentRequest {
  
  inline def apply(
    DocumentSchemaVersion: DocumentSchemaVersion,
    HubContentDocument: HubContentDocument,
    HubContentName: HubContentName,
    HubContentType: HubContentType,
    HubName: HubName
  ): ImportHubContentRequest = {
    val __obj = js.Dynamic.literal(DocumentSchemaVersion = DocumentSchemaVersion.asInstanceOf[js.Any], HubContentDocument = HubContentDocument.asInstanceOf[js.Any], HubContentName = HubContentName.asInstanceOf[js.Any], HubContentType = HubContentType.asInstanceOf[js.Any], HubName = HubName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportHubContentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportHubContentRequest] (val x: Self) extends AnyVal {
    
    inline def setDocumentSchemaVersion(value: DocumentSchemaVersion): Self = StObject.set(x, "DocumentSchemaVersion", value.asInstanceOf[js.Any])
    
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
    
    inline def setHubContentType(value: HubContentType): Self = StObject.set(x, "HubContentType", value.asInstanceOf[js.Any])
    
    inline def setHubContentVersion(value: HubContentVersion): Self = StObject.set(x, "HubContentVersion", value.asInstanceOf[js.Any])
    
    inline def setHubContentVersionUndefined: Self = StObject.set(x, "HubContentVersion", js.undefined)
    
    inline def setHubName(value: HubName): Self = StObject.set(x, "HubName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
