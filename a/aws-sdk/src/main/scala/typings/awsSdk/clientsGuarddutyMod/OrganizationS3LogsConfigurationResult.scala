package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationS3LogsConfigurationResult extends StObject {
  
  /**
    * A value that describes whether S3 data event logs are automatically enabled for new members of the organization.
    */
  var AutoEnable: Boolean
}
object OrganizationS3LogsConfigurationResult {
  
  inline def apply(AutoEnable: Boolean): OrganizationS3LogsConfigurationResult = {
    val __obj = js.Dynamic.literal(AutoEnable = AutoEnable.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationS3LogsConfigurationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationS3LogsConfigurationResult] (val x: Self) extends AnyVal {
    
    inline def setAutoEnable(value: Boolean): Self = StObject.set(x, "AutoEnable", value.asInstanceOf[js.Any])
  }
}
