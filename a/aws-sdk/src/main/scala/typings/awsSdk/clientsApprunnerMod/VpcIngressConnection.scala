package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcIngressConnection extends StObject {
  
  /**
    * The Account Id you use to create the VPC Ingress Connection resource.
    */
  var AccountId: js.UndefOr[CustomerAccountId] = js.undefined
  
  /**
    * The time when the VPC Ingress Connection was created. It's in the Unix time stamp format.    Type: Timestamp     Required: Yes   
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time when the App Runner service was deleted. It's in the Unix time stamp format.    Type: Timestamp     Required: No   
    */
  var DeletedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The domain name associated with the VPC Ingress Connection resource.
    */
  var DomainName: js.UndefOr[typings.awsSdk.clientsApprunnerMod.DomainName] = js.undefined
  
  /**
    * Specifications for the customer’s VPC and related PrivateLink VPC endpoint that are used to associate with the VPC Ingress Connection resource.
    */
  var IngressVpcConfiguration: js.UndefOr[typings.awsSdk.clientsApprunnerMod.IngressVpcConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the service associated with the VPC Ingress Connection. 
    */
  var ServiceArn: js.UndefOr[AppRunnerResourceArn] = js.undefined
  
  /**
    * The current status of the VPC Ingress Connection. The VPC Ingress Connection displays one of the following statuses: AVAILABLE, PENDING_CREATION, PENDING_UPDATE, PENDING_DELETION,FAILED_CREATION, FAILED_UPDATE, FAILED_DELETION, and DELETED.. 
    */
  var Status: js.UndefOr[VpcIngressConnectionStatus] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the VPC Ingress Connection. 
    */
  var VpcIngressConnectionArn: js.UndefOr[AppRunnerResourceArn] = js.undefined
  
  /**
    * The customer-provided VPC Ingress Connection name.
    */
  var VpcIngressConnectionName: js.UndefOr[typings.awsSdk.clientsApprunnerMod.VpcIngressConnectionName] = js.undefined
}
object VpcIngressConnection {
  
  inline def apply(): VpcIngressConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcIngressConnection]
  }
  
  extension [Self <: VpcIngressConnection](x: Self) {
    
    inline def setAccountId(value: CustomerAccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDeletedAt(value: js.Date): Self = StObject.set(x, "DeletedAt", value.asInstanceOf[js.Any])
    
    inline def setDeletedAtUndefined: Self = StObject.set(x, "DeletedAt", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setIngressVpcConfiguration(value: IngressVpcConfiguration): Self = StObject.set(x, "IngressVpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setIngressVpcConfigurationUndefined: Self = StObject.set(x, "IngressVpcConfiguration", js.undefined)
    
    inline def setServiceArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ServiceArn", value.asInstanceOf[js.Any])
    
    inline def setServiceArnUndefined: Self = StObject.set(x, "ServiceArn", js.undefined)
    
    inline def setStatus(value: VpcIngressConnectionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVpcIngressConnectionArn(value: AppRunnerResourceArn): Self = StObject.set(x, "VpcIngressConnectionArn", value.asInstanceOf[js.Any])
    
    inline def setVpcIngressConnectionArnUndefined: Self = StObject.set(x, "VpcIngressConnectionArn", js.undefined)
    
    inline def setVpcIngressConnectionName(value: VpcIngressConnectionName): Self = StObject.set(x, "VpcIngressConnectionName", value.asInstanceOf[js.Any])
    
    inline def setVpcIngressConnectionNameUndefined: Self = StObject.set(x, "VpcIngressConnectionName", js.undefined)
  }
}
