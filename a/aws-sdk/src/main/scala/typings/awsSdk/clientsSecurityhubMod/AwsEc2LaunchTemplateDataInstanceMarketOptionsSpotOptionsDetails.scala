package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataInstanceMarketOptionsSpotOptionsDetails extends StObject {
  
  /**
    *  Deprecated. 
    */
  var BlockDurationMinutes: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The behavior when a Spot Instance is interrupted. 
    */
  var InstanceInterruptionBehavior: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The maximum hourly price you're willing to pay for the Spot Instances. 
    */
  var MaxPrice: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The Spot Instance request type. 
    */
  var SpotInstanceType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The end date of the request, in UTC format (YYYY-MM-DDTHH:MM:SSZ), for persistent requests. 
    */
  var ValidUntil: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2LaunchTemplateDataInstanceMarketOptionsSpotOptionsDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataInstanceMarketOptionsSpotOptionsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataInstanceMarketOptionsSpotOptionsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataInstanceMarketOptionsSpotOptionsDetails] (val x: Self) extends AnyVal {
    
    inline def setBlockDurationMinutes(value: Integer): Self = StObject.set(x, "BlockDurationMinutes", value.asInstanceOf[js.Any])
    
    inline def setBlockDurationMinutesUndefined: Self = StObject.set(x, "BlockDurationMinutes", js.undefined)
    
    inline def setInstanceInterruptionBehavior(value: NonEmptyString): Self = StObject.set(x, "InstanceInterruptionBehavior", value.asInstanceOf[js.Any])
    
    inline def setInstanceInterruptionBehaviorUndefined: Self = StObject.set(x, "InstanceInterruptionBehavior", js.undefined)
    
    inline def setMaxPrice(value: NonEmptyString): Self = StObject.set(x, "MaxPrice", value.asInstanceOf[js.Any])
    
    inline def setMaxPriceUndefined: Self = StObject.set(x, "MaxPrice", js.undefined)
    
    inline def setSpotInstanceType(value: NonEmptyString): Self = StObject.set(x, "SpotInstanceType", value.asInstanceOf[js.Any])
    
    inline def setSpotInstanceTypeUndefined: Self = StObject.set(x, "SpotInstanceType", js.undefined)
    
    inline def setValidUntil(value: NonEmptyString): Self = StObject.set(x, "ValidUntil", value.asInstanceOf[js.Any])
    
    inline def setValidUntilUndefined: Self = StObject.set(x, "ValidUntil", js.undefined)
  }
}
