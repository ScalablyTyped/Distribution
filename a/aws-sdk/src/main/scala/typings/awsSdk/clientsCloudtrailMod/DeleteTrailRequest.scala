package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTrailRequest extends StObject {
  
  /**
    * Specifies the name or the CloudTrail ARN of the trail to be deleted. The following is the format of a trail ARN. arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var Name: String
}
object DeleteTrailRequest {
  
  inline def apply(Name: String): DeleteTrailRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrailRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTrailRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
