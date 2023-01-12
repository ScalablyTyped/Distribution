package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateHibernationOptionsRequest extends StObject {
  
  /**
    * If you set this parameter to true, the instance is enabled for hibernation. Default: false 
    */
  var Configured: js.UndefOr[Boolean] = js.undefined
}
object LaunchTemplateHibernationOptionsRequest {
  
  inline def apply(): LaunchTemplateHibernationOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateHibernationOptionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchTemplateHibernationOptionsRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigured(value: Boolean): Self = StObject.set(x, "Configured", value.asInstanceOf[js.Any])
    
    inline def setConfiguredUndefined: Self = StObject.set(x, "Configured", js.undefined)
  }
}
