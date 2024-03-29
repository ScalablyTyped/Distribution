package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeDBSecurityGroupIngressResult extends StObject {
  
  var DBSecurityGroup: js.UndefOr[typings.awsSdk.clientsRdsMod.DBSecurityGroup] = js.undefined
}
object AuthorizeDBSecurityGroupIngressResult {
  
  inline def apply(): AuthorizeDBSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeDBSecurityGroupIngressResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorizeDBSecurityGroupIngressResult] (val x: Self) extends AnyVal {
    
    inline def setDBSecurityGroup(value: DBSecurityGroup): Self = StObject.set(x, "DBSecurityGroup", value.asInstanceOf[js.Any])
    
    inline def setDBSecurityGroupUndefined: Self = StObject.set(x, "DBSecurityGroup", js.undefined)
  }
}
