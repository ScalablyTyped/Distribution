package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositorySummary extends StObject {
  
  /**
    *  The Amazon Web Services account ID that manages the repository. 
    */
  var administratorAccount: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  The ARN of the repository. 
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * A timestamp that represents the date and time the repository was created.
    */
  var createdTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The description of the repository. 
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    *  The name of the domain that contains the repository. 
    */
  var domainName: js.UndefOr[DomainName] = js.undefined
  
  /**
    *  The 12-digit account number of the Amazon Web Services account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  The name of the repository. 
    */
  var name: js.UndefOr[RepositoryName] = js.undefined
}
object RepositorySummary {
  
  inline def apply(): RepositorySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositorySummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepositorySummary] (val x: Self) extends AnyVal {
    
    inline def setAdministratorAccount(value: AccountId): Self = StObject.set(x, "administratorAccount", value.asInstanceOf[js.Any])
    
    inline def setAdministratorAccountUndefined: Self = StObject.set(x, "administratorAccount", js.undefined)
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    inline def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    inline def setName(value: RepositoryName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
