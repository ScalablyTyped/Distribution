package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponsePlanInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the response plan.
    */
  var arn: Arn
}
object DeleteResponsePlanInput {
  
  inline def apply(arn: Arn): DeleteResponsePlanInput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponsePlanInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResponsePlanInput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
