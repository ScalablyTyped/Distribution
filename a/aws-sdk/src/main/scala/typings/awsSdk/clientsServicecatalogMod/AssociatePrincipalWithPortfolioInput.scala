package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociatePrincipalWithPortfolioInput extends StObject {
  
  /**
    * The language code.    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The portfolio identifier.
    */
  var PortfolioId: Id
  
  /**
    * The ARN of the principal (user, role, or group). This field allows an ARN with no accountID if PrincipalType is IAM_PATTERN.  You can associate multiple IAM patterns even if the account has no principal with that name. This is useful in Principal Name Sharing if you want to share a principal without creating it in the account that owns the portfolio. 
    */
  var PrincipalARN: typings.awsSdk.clientsServicecatalogMod.PrincipalARN
  
  /**
    * The principal type. The supported value is IAM if you use a fully defined ARN, or IAM_PATTERN if you use an ARN with no accountID. 
    */
  var PrincipalType: typings.awsSdk.clientsServicecatalogMod.PrincipalType
}
object AssociatePrincipalWithPortfolioInput {
  
  inline def apply(PortfolioId: Id, PrincipalARN: PrincipalARN, PrincipalType: PrincipalType): AssociatePrincipalWithPortfolioInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId.asInstanceOf[js.Any], PrincipalARN = PrincipalARN.asInstanceOf[js.Any], PrincipalType = PrincipalType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatePrincipalWithPortfolioInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociatePrincipalWithPortfolioInput] (val x: Self) extends AnyVal {
    
    inline def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    inline def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    inline def setPortfolioId(value: Id): Self = StObject.set(x, "PortfolioId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalARN(value: PrincipalARN): Self = StObject.set(x, "PrincipalARN", value.asInstanceOf[js.Any])
    
    inline def setPrincipalType(value: PrincipalType): Self = StObject.set(x, "PrincipalType", value.asInstanceOf[js.Any])
  }
}
