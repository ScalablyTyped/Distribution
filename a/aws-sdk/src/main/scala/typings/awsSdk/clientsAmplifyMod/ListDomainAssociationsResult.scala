package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDomainAssociationsResult extends StObject {
  
  /**
    *  A list of domain associations. 
    */
  var domainAssociations: DomainAssociations
  
  /**
    *  A pagination token. If non-null, a pagination token is returned in a result. Pass its value in another request to retrieve more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDomainAssociationsResult {
  
  inline def apply(domainAssociations: DomainAssociations): ListDomainAssociationsResult = {
    val __obj = js.Dynamic.literal(domainAssociations = domainAssociations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainAssociationsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDomainAssociationsResult] (val x: Self) extends AnyVal {
    
    inline def setDomainAssociations(value: DomainAssociations): Self = StObject.set(x, "domainAssociations", value.asInstanceOf[js.Any])
    
    inline def setDomainAssociationsVarargs(value: DomainAssociation*): Self = StObject.set(x, "domainAssociations", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
