package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFleetResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the updated fleet.
    */
  var arn: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.arn] = js.undefined
  
  /**
    * The ID of the updated fleet.
    */
  var id: js.UndefOr[fleetId] = js.undefined
}
object UpdateFleetResponse {
  
  inline def apply(): UpdateFleetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFleetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFleetResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setId(value: fleetId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
