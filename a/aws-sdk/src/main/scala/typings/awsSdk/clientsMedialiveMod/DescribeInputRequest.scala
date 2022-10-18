package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInputRequest extends StObject {
  
  /**
    * Unique ID of the input
    */
  var InputId: string
}
object DescribeInputRequest {
  
  inline def apply(InputId: string): DescribeInputRequest = {
    val __obj = js.Dynamic.literal(InputId = InputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInputRequest]
  }
  
  extension [Self <: DescribeInputRequest](x: Self) {
    
    inline def setInputId(value: string): Self = StObject.set(x, "InputId", value.asInstanceOf[js.Any])
  }
}
