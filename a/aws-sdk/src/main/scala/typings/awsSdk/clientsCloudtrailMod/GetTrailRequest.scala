package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTrailRequest extends StObject {
  
  /**
    * The name or the Amazon Resource Name (ARN) of the trail for which you want to retrieve settings information.
    */
  var Name: String
}
object GetTrailRequest {
  
  inline def apply(Name: String): GetTrailRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTrailRequest]
  }
  
  extension [Self <: GetTrailRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
