package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeApiDestinationRequest extends StObject {
  
  /**
    * The name of the API destination to retrieve.
    */
  var Name: ApiDestinationName
}
object DescribeApiDestinationRequest {
  
  inline def apply(Name: ApiDestinationName): DescribeApiDestinationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeApiDestinationRequest]
  }
  
  extension [Self <: DescribeApiDestinationRequest](x: Self) {
    
    inline def setName(value: ApiDestinationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
