package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAppImageConfigResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the AppImageConfig.
    */
  var AppImageConfigArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AppImageConfigArn] = js.undefined
}
object UpdateAppImageConfigResponse {
  
  inline def apply(): UpdateAppImageConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAppImageConfigResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAppImageConfigResponse] (val x: Self) extends AnyVal {
    
    inline def setAppImageConfigArn(value: AppImageConfigArn): Self = StObject.set(x, "AppImageConfigArn", value.asInstanceOf[js.Any])
    
    inline def setAppImageConfigArnUndefined: Self = StObject.set(x, "AppImageConfigArn", js.undefined)
  }
}
