package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEnvironmentAccountConnectionInput extends StObject {
  
  /**
    * When included, if two identical requests are made with the same client token, Proton returns the environment account connection that the first request created.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM service role that Proton uses when provisioning directly defined components in the associated environment account. It determines the scope of infrastructure that a component can provision in the account. You must specify componentRoleArn to allow directly defined components to be associated with any environments running in this account. For more information about components, see Proton components in the Proton User Guide.
    */
  var componentRoleArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the Proton environment that's created in the associated management account.
    */
  var environmentName: ResourceName
  
  /**
    * The ID of the management account that accepts or rejects the environment account connection. You create and manage the Proton environment in this account. If the management account accepts the environment account connection, Proton can use the associated IAM role to provision environment infrastructure resources in the associated environment account.
    */
  var managementAccountId: AwsAccountId
  
  /**
    * The Amazon Resource Name (ARN) of the IAM service role that's created in the environment account. Proton uses this role to provision infrastructure resources in the associated environment account.
    */
  var roleArn: Arn
  
  /**
    * An optional list of metadata items that you can associate with the Proton environment account connection. A tag is a key-value pair. For more information, see Proton resources and tagging in the Proton User Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateEnvironmentAccountConnectionInput {
  
  inline def apply(environmentName: ResourceName, managementAccountId: AwsAccountId, roleArn: Arn): CreateEnvironmentAccountConnectionInput = {
    val __obj = js.Dynamic.literal(environmentName = environmentName.asInstanceOf[js.Any], managementAccountId = managementAccountId.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentAccountConnectionInput]
  }
  
  extension [Self <: CreateEnvironmentAccountConnectionInput](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setComponentRoleArn(value: Arn): Self = StObject.set(x, "componentRoleArn", value.asInstanceOf[js.Any])
    
    inline def setComponentRoleArnUndefined: Self = StObject.set(x, "componentRoleArn", js.undefined)
    
    inline def setEnvironmentName(value: ResourceName): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setManagementAccountId(value: AwsAccountId): Self = StObject.set(x, "managementAccountId", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
