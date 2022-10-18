package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAlertResponse extends StObject {
  
  /**
    * The ARN of the updated alert.
    */
  var AlertArn: js.UndefOr[Arn] = js.undefined
}
object UpdateAlertResponse {
  
  inline def apply(): UpdateAlertResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAlertResponse]
  }
  
  extension [Self <: UpdateAlertResponse](x: Self) {
    
    inline def setAlertArn(value: Arn): Self = StObject.set(x, "AlertArn", value.asInstanceOf[js.Any])
    
    inline def setAlertArnUndefined: Self = StObject.set(x, "AlertArn", js.undefined)
  }
}
