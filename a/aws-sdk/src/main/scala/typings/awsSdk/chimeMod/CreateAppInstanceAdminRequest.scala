package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppInstanceAdminRequest extends StObject {
  
  /**
    * The ARN of the administrator of the current app instance.
    */
  var AppInstanceAdminArn: ChimeArn
  
  /**
    * The ARN of the app instance.
    */
  var AppInstanceArn: ChimeArn
}
object CreateAppInstanceAdminRequest {
  
  inline def apply(AppInstanceAdminArn: ChimeArn, AppInstanceArn: ChimeArn): CreateAppInstanceAdminRequest = {
    val __obj = js.Dynamic.literal(AppInstanceAdminArn = AppInstanceAdminArn.asInstanceOf[js.Any], AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppInstanceAdminRequest]
  }
  
  extension [Self <: CreateAppInstanceAdminRequest](x: Self) {
    
    inline def setAppInstanceAdminArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceAdminArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
  }
}
