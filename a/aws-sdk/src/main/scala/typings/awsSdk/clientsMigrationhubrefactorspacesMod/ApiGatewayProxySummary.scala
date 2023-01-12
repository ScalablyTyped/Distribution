package typings.awsSdk.clientsMigrationhubrefactorspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiGatewayProxySummary extends StObject {
  
  /**
    * The resource ID of the API Gateway for the proxy. 
    */
  var ApiGatewayId: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.ApiGatewayId] = js.undefined
  
  /**
    * The type of API Gateway endpoint created. 
    */
  var EndpointType: js.UndefOr[ApiGatewayEndpointType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Network Load Balancer configured by the API Gateway proxy. 
    */
  var NlbArn: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.NlbArn] = js.undefined
  
  /**
    * The name of the Network Load Balancer that is configured by the API Gateway proxy. 
    */
  var NlbName: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.NlbName] = js.undefined
  
  /**
    * The endpoint URL of the API Gateway proxy. 
    */
  var ProxyUrl: js.UndefOr[Uri] = js.undefined
  
  /**
    * The name of the API Gateway stage. The name defaults to prod. 
    */
  var StageName: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.StageName] = js.undefined
  
  /**
    * The VpcLink ID of the API Gateway proxy. 
    */
  var VpcLinkId: js.UndefOr[typings.awsSdk.clientsMigrationhubrefactorspacesMod.VpcLinkId] = js.undefined
}
object ApiGatewayProxySummary {
  
  inline def apply(): ApiGatewayProxySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiGatewayProxySummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApiGatewayProxySummary] (val x: Self) extends AnyVal {
    
    inline def setApiGatewayId(value: ApiGatewayId): Self = StObject.set(x, "ApiGatewayId", value.asInstanceOf[js.Any])
    
    inline def setApiGatewayIdUndefined: Self = StObject.set(x, "ApiGatewayId", js.undefined)
    
    inline def setEndpointType(value: ApiGatewayEndpointType): Self = StObject.set(x, "EndpointType", value.asInstanceOf[js.Any])
    
    inline def setEndpointTypeUndefined: Self = StObject.set(x, "EndpointType", js.undefined)
    
    inline def setNlbArn(value: NlbArn): Self = StObject.set(x, "NlbArn", value.asInstanceOf[js.Any])
    
    inline def setNlbArnUndefined: Self = StObject.set(x, "NlbArn", js.undefined)
    
    inline def setNlbName(value: NlbName): Self = StObject.set(x, "NlbName", value.asInstanceOf[js.Any])
    
    inline def setNlbNameUndefined: Self = StObject.set(x, "NlbName", js.undefined)
    
    inline def setProxyUrl(value: Uri): Self = StObject.set(x, "ProxyUrl", value.asInstanceOf[js.Any])
    
    inline def setProxyUrlUndefined: Self = StObject.set(x, "ProxyUrl", js.undefined)
    
    inline def setStageName(value: StageName): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
    
    inline def setStageNameUndefined: Self = StObject.set(x, "StageName", js.undefined)
    
    inline def setVpcLinkId(value: VpcLinkId): Self = StObject.set(x, "VpcLinkId", value.asInstanceOf[js.Any])
    
    inline def setVpcLinkIdUndefined: Self = StObject.set(x, "VpcLinkId", js.undefined)
  }
}
