package typings.awsSdk.clientsCognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushSync extends StObject {
  
  /**
    * List of SNS platform application ARNs that could be used by clients.
    */
  var ApplicationArns: js.UndefOr[ApplicationArnList] = js.undefined
  
  /**
    * A role configured to allow Cognito to call SNS on behalf of the developer.
    */
  var RoleArn: js.UndefOr[AssumeRoleArn] = js.undefined
}
object PushSync {
  
  inline def apply(): PushSync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushSync]
  }
  
  extension [Self <: PushSync](x: Self) {
    
    inline def setApplicationArns(value: ApplicationArnList): Self = StObject.set(x, "ApplicationArns", value.asInstanceOf[js.Any])
    
    inline def setApplicationArnsUndefined: Self = StObject.set(x, "ApplicationArns", js.undefined)
    
    inline def setApplicationArnsVarargs(value: ApplicationArn*): Self = StObject.set(x, "ApplicationArns", js.Array(value*))
    
    inline def setRoleArn(value: AssumeRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
