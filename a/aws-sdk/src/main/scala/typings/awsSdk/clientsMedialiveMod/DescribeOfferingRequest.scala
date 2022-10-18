package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOfferingRequest extends StObject {
  
  /**
    * Unique offering ID, e.g. '87654321'
    */
  var OfferingId: string
}
object DescribeOfferingRequest {
  
  inline def apply(OfferingId: string): DescribeOfferingRequest = {
    val __obj = js.Dynamic.literal(OfferingId = OfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOfferingRequest]
  }
  
  extension [Self <: DescribeOfferingRequest](x: Self) {
    
    inline def setOfferingId(value: string): Self = StObject.set(x, "OfferingId", value.asInstanceOf[js.Any])
  }
}
