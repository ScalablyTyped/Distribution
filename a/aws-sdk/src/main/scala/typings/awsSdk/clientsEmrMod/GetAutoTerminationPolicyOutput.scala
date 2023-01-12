package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAutoTerminationPolicyOutput extends StObject {
  
  /**
    * Specifies the auto-termination policy that is attached to an Amazon EMR cluster. 
    */
  var AutoTerminationPolicy: js.UndefOr[typings.awsSdk.clientsEmrMod.AutoTerminationPolicy] = js.undefined
}
object GetAutoTerminationPolicyOutput {
  
  inline def apply(): GetAutoTerminationPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAutoTerminationPolicyOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAutoTerminationPolicyOutput] (val x: Self) extends AnyVal {
    
    inline def setAutoTerminationPolicy(value: AutoTerminationPolicy): Self = StObject.set(x, "AutoTerminationPolicy", value.asInstanceOf[js.Any])
    
    inline def setAutoTerminationPolicyUndefined: Self = StObject.set(x, "AutoTerminationPolicy", js.undefined)
  }
}
