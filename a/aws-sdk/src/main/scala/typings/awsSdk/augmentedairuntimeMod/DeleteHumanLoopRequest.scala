package typings.awsSdk.augmentedairuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteHumanLoopRequest extends StObject {
  
  /**
    * The name of the human loop that you want to delete.
    */
  var HumanLoopName: typings.awsSdk.augmentedairuntimeMod.HumanLoopName
}
object DeleteHumanLoopRequest {
  
  inline def apply(HumanLoopName: HumanLoopName): DeleteHumanLoopRequest = {
    val __obj = js.Dynamic.literal(HumanLoopName = HumanLoopName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHumanLoopRequest]
  }
  
  extension [Self <: DeleteHumanLoopRequest](x: Self) {
    
    inline def setHumanLoopName(value: HumanLoopName): Self = StObject.set(x, "HumanLoopName", value.asInstanceOf[js.Any])
  }
}
