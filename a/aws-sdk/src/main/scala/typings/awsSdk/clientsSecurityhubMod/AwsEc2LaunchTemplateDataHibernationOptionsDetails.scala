package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataHibernationOptionsDetails extends StObject {
  
  /**
    *  If you set this parameter to true, the instance is enabled for hibernation. 
    */
  var Configured: js.UndefOr[Boolean] = js.undefined
}
object AwsEc2LaunchTemplateDataHibernationOptionsDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataHibernationOptionsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataHibernationOptionsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataHibernationOptionsDetails] (val x: Self) extends AnyVal {
    
    inline def setConfigured(value: Boolean): Self = StObject.set(x, "Configured", value.asInstanceOf[js.Any])
    
    inline def setConfiguredUndefined: Self = StObject.set(x, "Configured", js.undefined)
  }
}
