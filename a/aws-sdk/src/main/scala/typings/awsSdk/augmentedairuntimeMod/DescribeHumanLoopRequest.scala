package typings.awsSdk.augmentedairuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHumanLoopRequest extends StObject {
  
  /**
    * The name of the human loop that you want information about.
    */
  var HumanLoopName: typings.awsSdk.augmentedairuntimeMod.HumanLoopName
}
object DescribeHumanLoopRequest {
  
  inline def apply(HumanLoopName: HumanLoopName): DescribeHumanLoopRequest = {
    val __obj = js.Dynamic.literal(HumanLoopName = HumanLoopName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHumanLoopRequest]
  }
  
  extension [Self <: DescribeHumanLoopRequest](x: Self) {
    
    inline def setHumanLoopName(value: HumanLoopName): Self = StObject.set(x, "HumanLoopName", value.asInstanceOf[js.Any])
  }
}
