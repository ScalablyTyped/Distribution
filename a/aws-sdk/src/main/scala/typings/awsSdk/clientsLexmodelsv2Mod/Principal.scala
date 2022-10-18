package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Principal extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the principal.
    */
  var arn: js.UndefOr[PrincipalArn] = js.undefined
  
  /**
    * The name of the AWS service that should allowed or denied access to an Amazon Lex action.
    */
  var service: js.UndefOr[ServicePrincipal] = js.undefined
}
object Principal {
  
  inline def apply(): Principal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Principal]
  }
  
  extension [Self <: Principal](x: Self) {
    
    inline def setArn(value: PrincipalArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setService(value: ServicePrincipal): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
