package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopLoggingRequest extends StObject {
  
  /**
    * Specifies the name or the CloudTrail ARN of the trail for which CloudTrail will stop logging Amazon Web Services API calls. The following is the format of a trail ARN.  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var Name: String
}
object StopLoggingRequest {
  
  inline def apply(Name: String): StopLoggingRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopLoggingRequest]
  }
  
  extension [Self <: StopLoggingRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
