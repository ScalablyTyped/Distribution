package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationRequest extends StObject {
  
  /**
    * A wrapper object holding the API Gateway endpoint type and stage name for the proxy. 
    */
  var ApiGatewayProxy: js.UndefOr[ApiGatewayProxyInput] = js.undefined
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.ClientToken] = js.undefined
  
  /**
    * The unique identifier of the environment.
    */
  var EnvironmentIdentifier: EnvironmentId
  
  /**
    * The name to use for the application. 
    */
  var Name: ApplicationName
  
  /**
    * The proxy type of the proxy created within the application. 
    */
  var ProxyType: typings.awsSdk.clientsMigrationhubrefactorspacesMod.ProxyType
  
  /**
    * The tags to assign to the application. A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key-value pair.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The ID of the virtual private cloud (VPC).
    */
  var VpcId: typings.awsSdk.clientsMigrationhubrefactorspacesMod.VpcId
}
object CreateApplicationRequest {
  
  inline def apply(EnvironmentIdentifier: EnvironmentId, Name: ApplicationName, ProxyType: ProxyType, VpcId: VpcId): CreateApplicationRequest = {
    val __obj = js.Dynamic.literal(EnvironmentIdentifier = EnvironmentIdentifier.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ProxyType = ProxyType.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateApplicationRequest] (val x: Self) extends AnyVal {
    
    inline def setApiGatewayProxy(value: ApiGatewayProxyInput): Self = StObject.set(x, "ApiGatewayProxy", value.asInstanceOf[js.Any])
    
    inline def setApiGatewayProxyUndefined: Self = StObject.set(x, "ApiGatewayProxy", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setEnvironmentIdentifier(value: EnvironmentId): Self = StObject.set(x, "EnvironmentIdentifier", value.asInstanceOf[js.Any])
    
    inline def setName(value: ApplicationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setProxyType(value: ProxyType): Self = StObject.set(x, "ProxyType", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
