package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAlertRequest extends StObject {
  
  /**
    * The ARN of the alert to delete.
    */
  var AlertArn: Arn
}
object DeleteAlertRequest {
  
  inline def apply(AlertArn: Arn): DeleteAlertRequest = {
    val __obj = js.Dynamic.literal(AlertArn = AlertArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAlertRequest]
  }
  
  extension [Self <: DeleteAlertRequest](x: Self) {
    
    inline def setAlertArn(value: Arn): Self = StObject.set(x, "AlertArn", value.asInstanceOf[js.Any])
  }
}
