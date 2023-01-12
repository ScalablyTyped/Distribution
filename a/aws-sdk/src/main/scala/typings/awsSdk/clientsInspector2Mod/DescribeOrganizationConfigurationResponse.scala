package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOrganizationConfigurationResponse extends StObject {
  
  /**
    * The scan types are automatically enabled for new members of your organization.
    */
  var autoEnable: js.UndefOr[AutoEnable] = js.undefined
  
  /**
    * Represents whether your organization has reached the maximum Amazon Web Services account limit for Amazon Inspector.
    */
  var maxAccountLimitReached: js.UndefOr[Boolean] = js.undefined
}
object DescribeOrganizationConfigurationResponse {
  
  inline def apply(): DescribeOrganizationConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeOrganizationConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setAutoEnable(value: AutoEnable): Self = StObject.set(x, "autoEnable", value.asInstanceOf[js.Any])
    
    inline def setAutoEnableUndefined: Self = StObject.set(x, "autoEnable", js.undefined)
    
    inline def setMaxAccountLimitReached(value: Boolean): Self = StObject.set(x, "maxAccountLimitReached", value.asInstanceOf[js.Any])
    
    inline def setMaxAccountLimitReachedUndefined: Self = StObject.set(x, "maxAccountLimitReached", js.undefined)
  }
}
