package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePatchGroupStateRequest extends StObject {
  
  /**
    * The name of the patch group whose patch snapshot should be retrieved.
    */
  var PatchGroup: typings.awsSdk.clientsSsmMod.PatchGroup
}
object DescribePatchGroupStateRequest {
  
  inline def apply(PatchGroup: PatchGroup): DescribePatchGroupStateRequest = {
    val __obj = js.Dynamic.literal(PatchGroup = PatchGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePatchGroupStateRequest]
  }
  
  extension [Self <: DescribePatchGroupStateRequest](x: Self) {
    
    inline def setPatchGroup(value: PatchGroup): Self = StObject.set(x, "PatchGroup", value.asInstanceOf[js.Any])
  }
}
