package typings.awsSdk.clientsArczonalshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetManagedResourceRequest extends StObject {
  
  /**
    * The identifier for the resource to include in a zonal shift. The identifier is the Amazon Resource Name (ARN) for the resource. At this time, you can only start a zonal shift for Network Load Balancers and Application Load Balancers with cross-zone load balancing turned off.
    */
  var resourceIdentifier: ResourceIdentifier
}
object GetManagedResourceRequest {
  
  inline def apply(resourceIdentifier: ResourceIdentifier): GetManagedResourceRequest = {
    val __obj = js.Dynamic.literal(resourceIdentifier = resourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetManagedResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetManagedResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "resourceIdentifier", value.asInstanceOf[js.Any])
  }
}
