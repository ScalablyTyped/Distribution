package typings.awsSdk.clientsSchemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDiscovererRequest extends StObject {
  
  /**
    * The ID of the discoverer.
    */
  var DiscovererId: string
}
object DescribeDiscovererRequest {
  
  inline def apply(DiscovererId: string): DescribeDiscovererRequest = {
    val __obj = js.Dynamic.literal(DiscovererId = DiscovererId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDiscovererRequest]
  }
  
  extension [Self <: DescribeDiscovererRequest](x: Self) {
    
    inline def setDiscovererId(value: string): Self = StObject.set(x, "DiscovererId", value.asInstanceOf[js.Any])
  }
}
