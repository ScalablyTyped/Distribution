package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOpsItemResponse extends StObject {
  
  /**
    * The OpsItem Amazon Resource Name (ARN).
    */
  var OpsItemArn: js.UndefOr[typings.awsSdk.clientsSsmMod.OpsItemArn] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateOpsItemResponse] (val x: Self) extends AnyVal {
    
    inline def setOpsItemArn(value: OpsItemArn): Self = StObject.set(x, "OpsItemArn", value.asInstanceOf[js.Any])
    
    inline def setOpsItemArnUndefined: Self = StObject.set(x, "OpsItemArn", js.undefined)
    
    inline def setOpsItemId(value: String): Self = StObject.set(x, "OpsItemId", value.asInstanceOf[js.Any])
    
    inline def setOpsItemIdUndefined: Self = StObject.set(x, "OpsItemId", js.undefined)
  }
}
