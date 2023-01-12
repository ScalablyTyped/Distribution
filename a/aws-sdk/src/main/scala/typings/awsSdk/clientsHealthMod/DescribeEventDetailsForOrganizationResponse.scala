package typings.awsSdk.clientsHealthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventDetailsForOrganizationResponse extends StObject {
  
  /**
    * Error messages for any events that could not be retrieved.
    */
  var failedSet: js.UndefOr[DescribeEventDetailsForOrganizationFailedSet] = js.undefined
  
  /**
    * Information about the events that could be retrieved.
    */
  var successfulSet: js.UndefOr[DescribeEventDetailsForOrganizationSuccessfulSet] = js.undefined
}
object DescribeEventDetailsForOrganizationResponse {
  
  inline def apply(): DescribeEventDetailsForOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventDetailsForOrganizationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEventDetailsForOrganizationResponse] (val x: Self) extends AnyVal {
    
    inline def setFailedSet(value: DescribeEventDetailsForOrganizationFailedSet): Self = StObject.set(x, "failedSet", value.asInstanceOf[js.Any])
    
    inline def setFailedSetUndefined: Self = StObject.set(x, "failedSet", js.undefined)
    
    inline def setFailedSetVarargs(value: OrganizationEventDetailsErrorItem*): Self = StObject.set(x, "failedSet", js.Array(value*))
    
    inline def setSuccessfulSet(value: DescribeEventDetailsForOrganizationSuccessfulSet): Self = StObject.set(x, "successfulSet", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulSetUndefined: Self = StObject.set(x, "successfulSet", js.undefined)
    
    inline def setSuccessfulSetVarargs(value: OrganizationEventDetails*): Self = StObject.set(x, "successfulSet", js.Array(value*))
  }
}
