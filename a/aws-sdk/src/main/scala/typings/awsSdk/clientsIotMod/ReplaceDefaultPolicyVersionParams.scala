package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceDefaultPolicyVersionParams extends StObject {
  
  /**
    * The name of the template to be applied. The only supported value is BLANK_POLICY.
    */
  var templateName: PolicyTemplateName
}
object ReplaceDefaultPolicyVersionParams {
  
  inline def apply(templateName: PolicyTemplateName): ReplaceDefaultPolicyVersionParams = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceDefaultPolicyVersionParams]
  }
  
  extension [Self <: ReplaceDefaultPolicyVersionParams](x: Self) {
    
    inline def setTemplateName(value: PolicyTemplateName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
