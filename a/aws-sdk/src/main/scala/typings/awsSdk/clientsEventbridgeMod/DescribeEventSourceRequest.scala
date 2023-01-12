package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventSourceRequest extends StObject {
  
  /**
    * The name of the partner event source to display the details of.
    */
  var Name: EventSourceName
}
object DescribeEventSourceRequest {
  
  inline def apply(Name: EventSourceName): DescribeEventSourceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventSourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEventSourceRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: EventSourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
