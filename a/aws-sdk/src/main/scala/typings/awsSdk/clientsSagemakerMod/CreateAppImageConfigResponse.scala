package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppImageConfigResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the AppImageConfig.
    */
  var AppImageConfigArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AppImageConfigArn] = js.undefined
}
object CreateAppImageConfigResponse {
  
  inline def apply(): CreateAppImageConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAppImageConfigResponse]
  }
  
  extension [Self <: CreateAppImageConfigResponse](x: Self) {
    
    inline def setAppImageConfigArn(value: AppImageConfigArn): Self = StObject.set(x, "AppImageConfigArn", value.asInstanceOf[js.Any])
    
    inline def setAppImageConfigArnUndefined: Self = StObject.set(x, "AppImageConfigArn", js.undefined)
  }
}
