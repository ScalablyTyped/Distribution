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
  
  extension [Self <: DescribeApplicationInstanceDetailsRequest](x: Self) {
    
    inline def setApplicationInstanceId(value: ApplicationInstanceId): Self = StObject.set(x, "ApplicationInstanceId", value.asInstanceOf[js.Any])
  }
}
