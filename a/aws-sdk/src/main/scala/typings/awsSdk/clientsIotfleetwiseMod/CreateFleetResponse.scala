package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFleetResponse extends StObject {
  
  /**
    *  The ARN of the created fleet. 
    */
  var arn: typings.awsSdk.clientsIotfleetwiseMod.arn
  
  /**
    *  The ID of the created fleet. 
    */
  var id: fleetId
}
object CreateFleetResponse {
  
  inline def apply(arn: arn, id: fleetId): CreateFleetResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFleetResponse]
  }
  
  extension [Self <: CreateFleetResponse](x: Self) {
    
    inline def setArn(value: arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setId(value: fleetId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
