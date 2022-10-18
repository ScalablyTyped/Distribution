package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBrokerRequest extends StObject {
  
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: string
}
object DescribeBrokerRequest {
  
  inline def apply(BrokerId: string): DescribeBrokerRequest = {
    val __obj = js.Dynamic.literal(BrokerId = BrokerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBrokerRequest]
  }
  
  extension [Self <: DescribeBrokerRequest](x: Self) {
    
    inline def setBrokerId(value: string): Self = StObject.set(x, "BrokerId", value.asInstanceOf[js.Any])
  }
}
