package typings.awsSdk.clientsAugmentedairuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopHumanLoopRequest extends StObject {
  
  /**
    * The name of the human loop that you want to stop.
    */
  var HumanLoopName: typings.awsSdk.clientsAugmentedairuntimeMod.HumanLoopName
}
object StopHumanLoopRequest {
  
  inline def apply(HumanLoopName: HumanLoopName): StopHumanLoopRequest = {
    val __obj = js.Dynamic.literal(HumanLoopName = HumanLoopName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopHumanLoopRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopHumanLoopRequest] (val x: Self) extends AnyVal {
    
    inline def setHumanLoopName(value: HumanLoopName): Self = StObject.set(x, "HumanLoopName", value.asInstanceOf[js.Any])
  }
}
