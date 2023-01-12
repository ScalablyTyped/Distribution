package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOpsItemRequest extends StObject {
  
  /**
    * The ID of the OpsItem that you want to get.
    */
  var OpsItemId: typings.awsSdk.clientsSsmMod.OpsItemId
}
object GetOpsItemRequest {
  
  inline def apply(OpsItemId: OpsItemId): GetOpsItemRequest = {
    val __obj = js.Dynamic.literal(OpsItemId = OpsItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOpsItemRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetOpsItemRequest] (val x: Self) extends AnyVal {
    
    inline def setOpsItemId(value: OpsItemId): Self = StObject.set(x, "OpsItemId", value.asInstanceOf[js.Any])
  }
}
