package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneratedPolicy extends StObject {
  
  /**
    * The text to use as the content for the new policy. The policy is created using the CreatePolicy action.
    */
  var policy: String
}
object GeneratedPolicy {
  
  inline def apply(policy: String): GeneratedPolicy = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratedPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeneratedPolicy] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
  }
}
