package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSMSSandboxAccountStatusResult extends StObject {
  
  /**
    * Indicates whether the calling Amazon Web Services account is in the SMS sandbox.
    */
  var IsInSandbox: Boolean
}
object GetSMSSandboxAccountStatusResult {
  
  inline def apply(IsInSandbox: Boolean): GetSMSSandboxAccountStatusResult = {
    val __obj = js.Dynamic.literal(IsInSandbox = IsInSandbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSMSSandboxAccountStatusResult]
  }
  
  extension [Self <: GetSMSSandboxAccountStatusResult](x: Self) {
    
    inline def setIsInSandbox(value: Boolean): Self = StObject.set(x, "IsInSandbox", value.asInstanceOf[js.Any])
  }
}
