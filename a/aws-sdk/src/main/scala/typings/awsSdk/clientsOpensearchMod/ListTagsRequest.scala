package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsRequest extends StObject {
  
  /**
    * Amazon Resource Name (ARN) for the domain to view tags for.
    */
  var ARN: typings.awsSdk.clientsOpensearchMod.ARN
}
object ListTagsRequest {
  
  inline def apply(ARN: ARN): ListTagsRequest = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsRequest]
  }
  
  extension [Self <: ListTagsRequest](x: Self) {
    
    inline def setARN(value: ARN): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
  }
}
