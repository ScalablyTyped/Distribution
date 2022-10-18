package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOpsItemResponse extends StObject {
  
  /**
    * The ID of the OpsItem.
    */
  var OpsItemId: js.UndefOr[String] = js.undefined
}
object CreateOpsItemResponse {
  
  inline def apply(): CreateOpsItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOpsItemResponse]
  }
  
  extension [Self <: CreateOpsItemResponse](x: Self) {
    
    inline def setOpsItemId(value: String): Self = StObject.set(x, "OpsItemId", value.asInstanceOf[js.Any])
    
    inline def setOpsItemIdUndefined: Self = StObject.set(x, "OpsItemId", js.undefined)
  }
}
