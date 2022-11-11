package typings.awsSdk.clientsSchedulerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the target.
    */
  var Arn: TargetArn
}
object TargetSummary {
  
  inline def apply(Arn: TargetArn): TargetSummary = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetSummary]
  }
  
  extension [Self <: TargetSummary](x: Self) {
    
    inline def setArn(value: TargetArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
