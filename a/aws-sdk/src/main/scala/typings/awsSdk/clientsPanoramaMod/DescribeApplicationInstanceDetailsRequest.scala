package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeApplicationInstanceDetailsRequest extends StObject {
  
  /**
    * The application instance's ID.
    */
  var ApplicationInstanceId: typings.awsSdk.clientsPanoramaMod.ApplicationInstanceId
}
object DescribeApplicationInstanceDetailsRequest {
  
  inline def apply(ApplicationInstanceId: ApplicationInstanceId): DescribeApplicationInstanceDetailsRequest = {
    val __obj = js.Dynamic.literal(ApplicationInstanceId = ApplicationInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeApplicationInstanceDetailsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeApplicationInstanceDetailsRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationInstanceId(value: ApplicationInstanceId): Self = StObject.set(x, "ApplicationInstanceId", value.asInstanceOf[js.Any])
  }
}
