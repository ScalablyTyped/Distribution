package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAppInstanceAdminRequest extends StObject {
  
  /**
    * The ARN of the AppInstance's administrator.
    */
  var AppInstanceAdminArn: ChimeArn
  
  /**
    * The ARN of the AppInstance.
    */
  var AppInstanceArn: ChimeArn
}
object DeleteAppInstanceAdminRequest {
  
  inline def apply(AppInstanceAdminArn: ChimeArn, AppInstanceArn: ChimeArn): DeleteAppInstanceAdminRequest = {
    val __obj = js.Dynamic.literal(AppInstanceAdminArn = AppInstanceAdminArn.asInstanceOf[js.Any], AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppInstanceAdminRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAppInstanceAdminRequest] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceAdminArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceAdminArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
  }
}
