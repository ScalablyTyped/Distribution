package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Permission extends StObject {
  
  /**
    * The private CA actions that can be performed by the designated AWS service.
    */
  var Actions: js.UndefOr[ActionList] = js.undefined
  
  /**
    * The Amazon Resource Number (ARN) of the private CA from which the permission was issued.
    */
  var CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time at which the permission was created.
    */
  var CreatedAt: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The name of the policy that is associated with the permission.
    */
  var Policy: js.UndefOr[AWSPolicy] = js.undefined
  
  /**
    * The AWS service or entity that holds the permission. At this time, the only valid principal is acm.amazonaws.com.
    */
  var Principal: js.UndefOr[typings.awsSdk.acmpcaMod.Principal] = js.undefined
  
  /**
    * The ID of the account that assigned the permission.
    */
  var SourceAccount: js.UndefOr[AccountId] = js.undefined
}
object Permission {
  
  inline def apply(): Permission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Permission]
  }
  
  extension [Self <: Permission](x: Self) {
    
    inline def setActions(value: ActionList): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "Actions", js.undefined)
    
    inline def setActionsVarargs(value: ActionType*): Self = StObject.set(x, "Actions", js.Array(value :_*))
    
    inline def setCertificateAuthorityArn(value: Arn): Self = StObject.set(x, "CertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthorityArnUndefined: Self = StObject.set(x, "CertificateAuthorityArn", js.undefined)
    
    inline def setCreatedAt(value: TStamp): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setPolicy(value: AWSPolicy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    
    inline def setPrincipal(value: Principal): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "Principal", js.undefined)
    
    inline def setSourceAccount(value: AccountId): Self = StObject.set(x, "SourceAccount", value.asInstanceOf[js.Any])
    
    inline def setSourceAccountUndefined: Self = StObject.set(x, "SourceAccount", js.undefined)
  }
}
