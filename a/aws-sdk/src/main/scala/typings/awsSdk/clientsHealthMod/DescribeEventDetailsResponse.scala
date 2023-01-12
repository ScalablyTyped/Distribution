package typings.awsSdk.clientsHealthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventDetailsResponse extends StObject {
  
  /**
    * Error messages for any events that could not be retrieved.
    */
  var failedSet: js.UndefOr[DescribeEventDetailsFailedSet] = js.undefined
  
  /**
    * Information about the events that could be retrieved.
    */
  var successfulSet: js.UndefOr[DescribeEventDetailsSuccessfulSet] = js.undefined
}
object DescribeEventDetailsResponse {
  
  inline def apply(): DescribeEventDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventDetailsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEventDetailsResponse] (val x: Self) extends AnyVal {
    
    inline def setFailedSet(value: DescribeEventDetailsFailedSet): Self = StObject.set(x, "failedSet", value.asInstanceOf[js.Any])
    
    inline def setFailedSetUndefined: Self = StObject.set(x, "failedSet", js.undefined)
    
    inline def setFailedSetVarargs(value: EventDetailsErrorItem*): Self = StObject.set(x, "failedSet", js.Array(value*))
    
    inline def setSuccessfulSet(value: DescribeEventDetailsSuccessfulSet): Self = StObject.set(x, "successfulSet", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulSetUndefined: Self = StObject.set(x, "successfulSet", js.undefined)
    
    inline def setSuccessfulSetVarargs(value: EventDetails*): Self = StObject.set(x, "successfulSet", js.Array(value*))
  }
}
