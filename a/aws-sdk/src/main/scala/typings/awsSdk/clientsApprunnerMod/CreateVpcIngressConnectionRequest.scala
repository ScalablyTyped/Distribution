package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcIngressConnectionRequest extends StObject {
  
  /**
    * Specifications for the customer’s Amazon VPC and the related Amazon Web Services PrivateLink VPC endpoint that are used to create the VPC Ingress Connection resource.
    */
  var IngressVpcConfiguration: typings.awsSdk.clientsApprunnerMod.IngressVpcConfiguration
  
  /**
    * The Amazon Resource Name (ARN) for this App Runner service that is used to create the VPC Ingress Connection resource.
    */
  var ServiceArn: AppRunnerResourceArn
  
  /**
    * An optional list of metadata items that you can associate with the VPC Ingress Connection resource. A tag is a key-value pair.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A name for the VPC Ingress Connection resource. It must be unique across all the active VPC Ingress Connections in your Amazon Web Services account in the Amazon Web Services Region. 
    */
  var VpcIngressConnectionName: typings.awsSdk.clientsApprunnerMod.VpcIngressConnectionName
}
object CreateVpcIngressConnectionRequest {
  
  inline def apply(
    IngressVpcConfiguration: IngressVpcConfiguration,
    ServiceArn: AppRunnerResourceArn,
    VpcIngressConnectionName: VpcIngressConnectionName
  ): CreateVpcIngressConnectionRequest = {
    val __obj = js.Dynamic.literal(IngressVpcConfiguration = IngressVpcConfiguration.asInstanceOf[js.Any], ServiceArn = ServiceArn.asInstanceOf[js.Any], VpcIngressConnectionName = VpcIngressConnectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcIngressConnectionRequest]
  }
  
  extension [Self <: CreateVpcIngressConnectionRequest](x: Self) {
    
    inline def setIngressVpcConfiguration(value: IngressVpcConfiguration): Self = StObject.set(x, "IngressVpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setServiceArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ServiceArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcIngressConnectionName(value: VpcIngressConnectionName): Self = StObject.set(x, "VpcIngressConnectionName", value.asInstanceOf[js.Any])
  }
}
