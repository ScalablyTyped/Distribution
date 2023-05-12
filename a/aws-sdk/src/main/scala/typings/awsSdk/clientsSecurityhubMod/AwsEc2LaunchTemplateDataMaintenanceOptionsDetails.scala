package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataMaintenanceOptionsDetails extends StObject {
  
  /**
    *  Disables the automatic recovery behavior of your instance or sets it to default. 
    */
  var AutoRecovery: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2LaunchTemplateDataMaintenanceOptionsDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataMaintenanceOptionsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataMaintenanceOptionsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataMaintenanceOptionsDetails] (val x: Self) extends AnyVal {
    
    inline def setAutoRecovery(value: NonEmptyString): Self = StObject.set(x, "AutoRecovery", value.asInstanceOf[js.Any])
    
    inline def setAutoRecoveryUndefined: Self = StObject.set(x, "AutoRecovery", js.undefined)
  }
}
