package typings.awsSdk.clientsOamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSinkPolicyInput extends StObject {
  
  /**
    * The ARN of the sink to retrieve the policy of.
    */
  var SinkIdentifier: ResourceIdentifier
}
object GetSinkPolicyInput {
  
  inline def apply(SinkIdentifier: ResourceIdentifier): GetSinkPolicyInput = {
    val __obj = js.Dynamic.literal(SinkIdentifier = SinkIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSinkPolicyInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSinkPolicyInput] (val x: Self) extends AnyVal {
    
    inline def setSinkIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "SinkIdentifier", value.asInstanceOf[js.Any])
  }
}
