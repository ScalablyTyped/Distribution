package typings.awsSdk.clientsEcrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Registry extends StObject {
  
  /**
    * An array of objects representing the aliases for a public registry.
    */
  var aliases: RegistryAliasList
  
  /**
    * The Amazon Resource Name (ARN) of the public registry.
    */
  var registryArn: Arn
  
  /**
    * The AWS account ID associated with the registry. If you do not specify a registry, the default public registry is assumed.
    */
  var registryId: RegistryId
  
  /**
    * The URI of a public registry. The URI contains a universal prefix and the registry alias.
    */
  var registryUri: Url
  
  /**
    * Whether the account is verified. This indicates whether the account is an AWS Marketplace vendor. If an account is verified, each public repository will received a verified account badge on the Amazon ECR Public Gallery.
    */
  var verified: RegistryVerified
}
object Registry {
  
  inline def apply(
    aliases: RegistryAliasList,
    registryArn: Arn,
    registryId: RegistryId,
    registryUri: Url,
    verified: RegistryVerified
  ): Registry = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], registryArn = registryArn.asInstanceOf[js.Any], registryId = registryId.asInstanceOf[js.Any], registryUri = registryUri.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Registry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Registry] (val x: Self) extends AnyVal {
    
    inline def setAliases(value: RegistryAliasList): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesVarargs(value: RegistryAlias*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setRegistryArn(value: Arn): Self = StObject.set(x, "registryArn", value.asInstanceOf[js.Any])
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryUri(value: Url): Self = StObject.set(x, "registryUri", value.asInstanceOf[js.Any])
    
    inline def setVerified(value: RegistryVerified): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
  }
}
