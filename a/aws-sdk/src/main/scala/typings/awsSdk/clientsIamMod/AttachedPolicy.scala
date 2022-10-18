package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachedPolicy extends StObject {
  
  var PolicyArn: js.UndefOr[arnType] = js.undefined
  
  /**
    * The friendly name of the attached policy.
    */
  var PolicyName: js.UndefOr[policyNameType] = js.undefined
}
object AttachedPolicy {
  
  inline def apply(): AttachedPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachedPolicy]
  }
  
  extension [Self <: AttachedPolicy](x: Self) {
    
    inline def setPolicyArn(value: arnType): Self = StObject.set(x, "PolicyArn", value.asInstanceOf[js.Any])
    
    inline def setPolicyArnUndefined: Self = StObject.set(x, "PolicyArn", js.undefined)
    
    inline def setPolicyName(value: policyNameType): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
  }
}
