package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2InstanceMonitoringDetails extends StObject {
  
  /**
    *  Indicates whether detailed monitoring is turned on. Otherwise, basic monitoring is turned on. 
    */
  var State: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2InstanceMonitoringDetails {
  
  inline def apply(): AwsEc2InstanceMonitoringDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2InstanceMonitoringDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2InstanceMonitoringDetails] (val x: Self) extends AnyVal {
    
    inline def setState(value: NonEmptyString): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
