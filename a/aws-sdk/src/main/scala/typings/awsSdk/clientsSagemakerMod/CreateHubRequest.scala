package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHubRequest extends StObject {
  
  /**
    * A description of the hub.
    */
  var HubDescription: typings.awsSdk.clientsSagemakerMod.HubDescription
  
  /**
    * The display name of the hub.
    */
  var HubDisplayName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HubDisplayName] = js.undefined
  
  /**
    * The name of the hub to create.
    */
  var HubName: typings.awsSdk.clientsSagemakerMod.HubName
  
  /**
    * The searchable keywords for the hub.
    */
  var HubSearchKeywords: js.UndefOr[HubSearchKeywordList] = js.undefined
  
  /**
    * The Amazon S3 storage configuration for the hub.
    */
  var S3StorageConfig: js.UndefOr[HubS3StorageConfig] = js.undefined
  
  /**
    * Any tags to associate with the hub.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateHubRequest {
  
  inline def apply(HubDescription: HubDescription, HubName: HubName): CreateHubRequest = {
    val __obj = js.Dynamic.literal(HubDescription = HubDescription.asInstanceOf[js.Any], HubName = HubName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHubRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateHubRequest] (val x: Self) extends AnyVal {
    
    inline def setHubDescription(value: HubDescription): Self = StObject.set(x, "HubDescription", value.asInstanceOf[js.Any])
    
    inline def setHubDisplayName(value: HubDisplayName): Self = StObject.set(x, "HubDisplayName", value.asInstanceOf[js.Any])
    
    inline def setHubDisplayNameUndefined: Self = StObject.set(x, "HubDisplayName", js.undefined)
    
    inline def setHubName(value: HubName): Self = StObject.set(x, "HubName", value.asInstanceOf[js.Any])
    
    inline def setHubSearchKeywords(value: HubSearchKeywordList): Self = StObject.set(x, "HubSearchKeywords", value.asInstanceOf[js.Any])
    
    inline def setHubSearchKeywordsUndefined: Self = StObject.set(x, "HubSearchKeywords", js.undefined)
    
    inline def setHubSearchKeywordsVarargs(value: HubSearchKeyword*): Self = StObject.set(x, "HubSearchKeywords", js.Array(value*))
    
    inline def setS3StorageConfig(value: HubS3StorageConfig): Self = StObject.set(x, "S3StorageConfig", value.asInstanceOf[js.Any])
    
    inline def setS3StorageConfigUndefined: Self = StObject.set(x, "S3StorageConfig", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
