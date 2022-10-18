package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApplicationVersionResponse extends StObject {
  
  /**
    * The specific version of the application.
    */
  var applicationVersion: Version
  
  /**
    * The timestamp when the application version was created.
    */
  var creationTime: js.Date
  
  /**
    * The content of the application definition. This is a JSON object that contains the resource configuration/definitions that identify an application.
    */
  var definitionContent: StringFree65000
  
  /**
    * The application description.
    */
  var description: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The name of the application version.
    */
  var name: EntityName
  
  /**
    * The status of the application version.
    */
  var status: ApplicationVersionLifecycle
  
  /**
    * The reason for the reported status.
    */
  var statusReason: js.UndefOr[String] = js.undefined
}
object GetApplicationVersionResponse {
  
  inline def apply(
    applicationVersion: Version,
    creationTime: js.Date,
    definitionContent: StringFree65000,
    name: EntityName,
    status: ApplicationVersionLifecycle
  ): GetApplicationVersionResponse = {
    val __obj = js.Dynamic.literal(applicationVersion = applicationVersion.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], definitionContent = definitionContent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationVersionResponse]
  }
  
  extension [Self <: GetApplicationVersionResponse](x: Self) {
    
    inline def setApplicationVersion(value: Version): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setDefinitionContent(value: StringFree65000): Self = StObject.set(x, "definitionContent", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: EntityDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: EntityName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ApplicationVersionLifecycle): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
  }
}
