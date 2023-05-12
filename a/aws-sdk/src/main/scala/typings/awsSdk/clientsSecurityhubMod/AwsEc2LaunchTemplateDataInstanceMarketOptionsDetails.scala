package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataInstanceMarketOptionsDetails extends StObject {
  
  /**
    *  The market type. 
    */
  var MarketType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The options for Spot Instances. 
    */
  var SpotOptions: js.UndefOr[AwsEc2LaunchTemplateDataInstanceMarketOptionsSpotOptionsDetails] = js.undefined
}
object AwsEc2LaunchTemplateDataInstanceMarketOptionsDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataInstanceMarketOptionsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataInstanceMarketOptionsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataInstanceMarketOptionsDetails] (val x: Self) extends AnyVal {
    
    inline def setMarketType(value: NonEmptyString): Self = StObject.set(x, "MarketType", value.asInstanceOf[js.Any])
    
    inline def setMarketTypeUndefined: Self = StObject.set(x, "MarketType", js.undefined)
    
    inline def setSpotOptions(value: AwsEc2LaunchTemplateDataInstanceMarketOptionsSpotOptionsDetails): Self = StObject.set(x, "SpotOptions", value.asInstanceOf[js.Any])
    
    inline def setSpotOptionsUndefined: Self = StObject.set(x, "SpotOptions", js.undefined)
  }
}
