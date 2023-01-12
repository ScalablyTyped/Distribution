package typings.awsSdk.clientsCodestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateTeamMemberResult extends StObject {
  
  /**
    * The user- or system-generated token from the initial request that can be used to repeat the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
}
object AssociateTeamMemberResult {
  
  inline def apply(): AssociateTeamMemberResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateTeamMemberResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateTeamMemberResult] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
  }
}
