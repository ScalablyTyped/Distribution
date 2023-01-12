package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryDescription extends StObject {
  
  /**
    *  The 12-digit account number of the Amazon Web Services account that manages the repository. 
    */
  var administratorAccount: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the repository. 
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    *  A text description of the repository. 
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    *  The name of the domain that contains the repository. 
    */
  var domainName: js.UndefOr[DomainName] = js.undefined
  
  /**
    *  The 12-digit account number of the Amazon Web Services account that owns the domain that contains the repository. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  An array of external connections associated with the repository. 
    */
  var externalConnections: js.UndefOr[RepositoryExternalConnectionInfoList] = js.undefined
  
  /**
    *  The name of the repository. 
    */
  var name: js.UndefOr[RepositoryName] = js.undefined
  
  /**
    *  A list of upstream repositories to associate with the repository. The order of the upstream repositories in the list determines their priority order when CodeArtifact looks for a requested package version. For more information, see Working with upstream repositories. 
    */
  var upstreams: js.UndefOr[UpstreamRepositoryInfoList] = js.undefined
}
object RepositoryDescription {
  
  inline def apply(): RepositoryDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepositoryDescription] (val x: Self) extends AnyVal {
    
    inline def setAdministratorAccount(value: AccountId): Self = StObject.set(x, "administratorAccount", value.asInstanceOf[js.Any])
    
    inline def setAdministratorAccountUndefined: Self = StObject.set(x, "administratorAccount", js.undefined)
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    inline def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    inline def setExternalConnections(value: RepositoryExternalConnectionInfoList): Self = StObject.set(x, "externalConnections", value.asInstanceOf[js.Any])
    
    inline def setExternalConnectionsUndefined: Self = StObject.set(x, "externalConnections", js.undefined)
    
    inline def setExternalConnectionsVarargs(value: RepositoryExternalConnectionInfo*): Self = StObject.set(x, "externalConnections", js.Array(value*))
    
    inline def setName(value: RepositoryName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpstreams(value: UpstreamRepositoryInfoList): Self = StObject.set(x, "upstreams", value.asInstanceOf[js.Any])
    
    inline def setUpstreamsUndefined: Self = StObject.set(x, "upstreams", js.undefined)
    
    inline def setUpstreamsVarargs(value: UpstreamRepositoryInfo*): Self = StObject.set(x, "upstreams", js.Array(value*))
  }
}
