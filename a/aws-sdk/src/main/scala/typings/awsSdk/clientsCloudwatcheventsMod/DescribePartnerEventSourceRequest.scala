package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePartnerEventSourceRequest extends StObject {
  
  /**
    * The name of the event source to display.
    */
  var Name: EventSourceName
}
object DescribePartnerEventSourceRequest {
  
  inline def apply(Name: EventSourceName): DescribePartnerEventSourceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePartnerEventSourceRequest]
  }
  
  extension [Self <: DescribePartnerEventSourceRequest](x: Self) {
    
    inline def setName(value: EventSourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
