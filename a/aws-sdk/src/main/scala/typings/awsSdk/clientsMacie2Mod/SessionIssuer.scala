package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionIssuer extends StObject {
  
  /**
    * The unique identifier for the Amazon Web Services account that owns the entity that was used to get the credentials.
    */
  var accountId: js.UndefOr[string] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the source account, IAM user, or role that was used to get the credentials.
    */
  var arn: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for the entity that was used to get the credentials.
    */
  var principalId: js.UndefOr[string] = js.undefined
  
  /**
    * The source of the temporary security credentials, such as Root, IAMUser, or Role.
    */
  var `type`: js.UndefOr[string] = js.undefined
  
  /**
    * The name or alias of the user or role that issued the session. This value is null if the credentials were obtained from a root account that doesn't have an alias.
    */
  var userName: js.UndefOr[string] = js.undefined
}
object SessionIssuer {
  
  inline def apply(): SessionIssuer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionIssuer]
  }
  
  extension [Self <: SessionIssuer](x: Self) {
    
    inline def setAccountId(value: string): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setArn(value: string): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setPrincipalId(value: string): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalIdUndefined: Self = StObject.set(x, "principalId", js.undefined)
    
    inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserName(value: string): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
