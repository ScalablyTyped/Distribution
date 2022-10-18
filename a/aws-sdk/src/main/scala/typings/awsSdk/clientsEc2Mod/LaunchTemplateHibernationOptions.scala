package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateHibernationOptions extends StObject {
  
  /**
    * If this parameter is set to true, the instance is enabled for hibernation; otherwise, it is not enabled for hibernation.
    */
  var Configured: js.UndefOr[Boolean] = js.undefined
}
object LaunchTemplateHibernationOptions {
  
  inline def apply(): LaunchTemplateHibernationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateHibernationOptions]
  }
  
  extension [Self <: LaunchTemplateHibernationOptions](x: Self) {
    
    inline def setConfigured(value: Boolean): Self = StObject.set(x, "Configured", value.asInstanceOf[js.Any])
    
    inline def setConfiguredUndefined: Self = StObject.set(x, "Configured", js.undefined)
  }
}
