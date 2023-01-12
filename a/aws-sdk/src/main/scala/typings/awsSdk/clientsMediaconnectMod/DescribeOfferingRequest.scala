package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOfferingRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the offering.
    */
  var OfferingArn: string
}
object DescribeOfferingRequest {
  
  inline def apply(OfferingArn: string): DescribeOfferingRequest = {
    val __obj = js.Dynamic.literal(OfferingArn = OfferingArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOfferingRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeOfferingRequest] (val x: Self) extends AnyVal {
    
    inline def setOfferingArn(value: string): Self = StObject.set(x, "OfferingArn", value.asInstanceOf[js.Any])
  }
}
