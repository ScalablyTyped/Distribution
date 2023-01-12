package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricDestinationSummary extends StObject {
  
  /**
    * Specifies whether the destination is CloudWatch or Evidently.
    */
  var Destination: js.UndefOr[MetricDestination] = js.undefined
  
  /**
    * If the destination is Evidently, this specifies the ARN of the Evidently experiment that receives the metrics.
    */
  var DestinationArn: js.UndefOr[typings.awsSdk.clientsRumMod.DestinationArn] = js.undefined
  
  /**
    * This field appears only when the destination is Evidently. It specifies the ARN of the IAM role that is used to write to the Evidently experiment that receives the metrics.
    */
  var IamRoleArn: js.UndefOr[typings.awsSdk.clientsRumMod.IamRoleArn] = js.undefined
}
object MetricDestinationSummary {
  
  inline def apply(): MetricDestinationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricDestinationSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricDestinationSummary] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: MetricDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationArn(value: DestinationArn): Self = StObject.set(x, "DestinationArn", value.asInstanceOf[js.Any])
    
    inline def setDestinationArnUndefined: Self = StObject.set(x, "DestinationArn", js.undefined)
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setIamRoleArn(value: IamRoleArn): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setIamRoleArnUndefined: Self = StObject.set(x, "IamRoleArn", js.undefined)
  }
}
