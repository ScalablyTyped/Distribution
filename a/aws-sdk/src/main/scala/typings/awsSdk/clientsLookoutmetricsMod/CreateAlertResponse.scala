package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAlertResponse extends StObject {
  
  /**
    * The ARN of the alert.
    */
  var AlertArn: js.UndefOr[Arn] = js.undefined
}
object CreateAlertResponse {
  
  inline def apply(): CreateAlertResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAlertResponse]
  }
  
  extension [Self <: CreateAlertResponse](x: Self) {
    
    inline def setAlertArn(value: Arn): Self = StObject.set(x, "AlertArn", value.asInstanceOf[js.Any])
    
    inline def setAlertArnUndefined: Self = StObject.set(x, "AlertArn", js.undefined)
  }
}
