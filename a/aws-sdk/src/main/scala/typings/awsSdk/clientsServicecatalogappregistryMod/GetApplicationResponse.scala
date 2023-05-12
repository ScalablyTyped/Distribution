package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApplicationResponse extends StObject {
  
  /**
    * The Amazon resource name (ARN) that specifies the application across services.
    */
  var arn: js.UndefOr[ApplicationArn] = js.undefined
  
  /**
    * The number of top-level resources that were registered as part of this application.
    */
  var associatedResourceCount: js.UndefOr[AssociationCount] = js.undefined
  
  /**
    * The ISO-8601 formatted timestamp of the moment when the application was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the application.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The identifier of the application.
    */
  var id: js.UndefOr[ApplicationId] = js.undefined
  
  /**
    *  The information about the integration of the application with other services, such as Resource Groups. 
    */
  var integrations: js.UndefOr[Integrations] = js.undefined
  
  /**
    * The ISO-8601 formatted timestamp of the moment when the application was last updated.
    */
  var lastUpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the application. The name must be unique in the region in which you are creating the application.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * Key-value pairs associated with the application.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object GetApplicationResponse {
  
  inline def apply(): GetApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApplicationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetApplicationResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ApplicationArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setAssociatedResourceCount(value: AssociationCount): Self = StObject.set(x, "associatedResourceCount", value.asInstanceOf[js.Any])
    
    inline def setAssociatedResourceCountUndefined: Self = StObject.set(x, "associatedResourceCount", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: ApplicationId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIntegrations(value: Integrations): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
    
    inline def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
