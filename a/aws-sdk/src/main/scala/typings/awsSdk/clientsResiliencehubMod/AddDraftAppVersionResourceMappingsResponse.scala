package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddDraftAppVersionResourceMappingsResponse extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the application. The format for this ARN is: arn:partition:resiliencehub:region:account:app/app-id. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var appArn: Arn
  
  /**
    * The version of the application.
    */
  var appVersion: EntityVersion
  
  /**
    * Mappings used to map logical resources from the template to physical resources. You can use the mapping type CFN_STACK if the application template uses a logical stack name. Or you can map individual resources by using the mapping type RESOURCE. We recommend using the mapping type CFN_STACK if the application is backed by a CloudFormation stack.
    */
  var resourceMappings: ResourceMappingList
}
object AddDraftAppVersionResourceMappingsResponse {
  
  inline def apply(appArn: Arn, appVersion: EntityVersion, resourceMappings: ResourceMappingList): AddDraftAppVersionResourceMappingsResponse = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], resourceMappings = resourceMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddDraftAppVersionResourceMappingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddDraftAppVersionResourceMappingsResponse] (val x: Self) extends AnyVal {
    
    inline def setAppArn(value: Arn): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setAppVersion(value: EntityVersion): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setResourceMappings(value: ResourceMappingList): Self = StObject.set(x, "resourceMappings", value.asInstanceOf[js.Any])
    
    inline def setResourceMappingsVarargs(value: ResourceMapping*): Self = StObject.set(x, "resourceMappings", js.Array(value*))
  }
}
