package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceRequest extends StObject {
  
  /**
    * The ID of the application which the service is created.
    */
  var ApplicationIdentifier: ApplicationId
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.ClientToken] = js.undefined
  
  /**
    * The description of the service.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.Description] = js.undefined
  
  /**
    * The type of endpoint to use for the service. The type can be a URL in a VPC or an Lambda function.
    */
  var EndpointType: ServiceEndpointType
  
  /**
    * The ID of the environment in which the service is created.
    */
  var EnvironmentIdentifier: EnvironmentId
  
  /**
    * The configuration for the Lambda endpoint type.
    */
  var LambdaEndpoint: js.UndefOr[LambdaEndpointInput] = js.undefined
  
  /**
    * The name of the service.
    */
  var Name: ServiceName
  
  /**
    * The tags to assign to the service. A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key-value pair.. 
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The configuration for the URL endpoint type.
    */
  var UrlEndpoint: js.UndefOr[UrlEndpointInput] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.VpcId] = js.undefined
}
object CreateServiceRequest {
  
  inline def apply(
    ApplicationIdentifier: ApplicationId,
    EndpointType: ServiceEndpointType,
    EnvironmentIdentifier: EnvironmentId,
    Name: ServiceName
  ): CreateServiceRequest = {
    val __obj = js.Dynamic.literal(ApplicationIdentifier = ApplicationIdentifier.asInstanceOf[js.Any], EndpointType = EndpointType.asInstanceOf[js.Any], EnvironmentIdentifier = EnvironmentIdentifier.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceRequest]
  }
  
  extension [Self <: CreateServiceRequest](x: Self) {
    
    inline def setApplicationIdentifier(value: ApplicationId): Self = StObject.set(x, "ApplicationIdentifier", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEndpointType(value: ServiceEndpointType): Self = StObject.set(x, "EndpointType", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdentifier(value: EnvironmentId): Self = StObject.set(x, "EnvironmentIdentifier", value.asInstanceOf[js.Any])
    
    inline def setLambdaEndpoint(value: LambdaEndpointInput): Self = StObject.set(x, "LambdaEndpoint", value.asInstanceOf[js.Any])
    
    inline def setLambdaEndpointUndefined: Self = StObject.set(x, "LambdaEndpoint", js.undefined)
    
    inline def setName(value: ServiceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setUrlEndpoint(value: UrlEndpointInput): Self = StObject.set(x, "UrlEndpoint", value.asInstanceOf[js.Any])
    
    inline def setUrlEndpointUndefined: Self = StObject.set(x, "UrlEndpoint", js.undefined)
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
