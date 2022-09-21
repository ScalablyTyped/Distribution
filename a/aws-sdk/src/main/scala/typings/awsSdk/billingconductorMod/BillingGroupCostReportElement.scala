package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingGroupCostReportElement extends StObject {
  
  /**
    * The actual Amazon Web Services charges for the billing group. 
    */
  var AWSCost: js.UndefOr[typings.awsSdk.billingconductorMod.AWSCost] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a billing group. 
    */
  var Arn: js.UndefOr[BillingGroupArn] = js.undefined
  
  /**
    * The displayed currency. 
    */
  var Currency: js.UndefOr[typings.awsSdk.billingconductorMod.Currency] = js.undefined
  
  /**
    *  The billing group margin. 
    */
  var Margin: js.UndefOr[typings.awsSdk.billingconductorMod.Margin] = js.undefined
  
  /**
    *  The percentage of billing group margin. 
    */
  var MarginPercentage: js.UndefOr[typings.awsSdk.billingconductorMod.MarginPercentage] = js.undefined
  
  /**
    * The hypothetical Amazon Web Services charges based on the associated pricing plan of a billing group. 
    */
  var ProformaCost: js.UndefOr[typings.awsSdk.billingconductorMod.ProformaCost] = js.undefined
}
object BillingGroupCostReportElement {
  
  inline def apply(): BillingGroupCostReportElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingGroupCostReportElement]
  }
  
  extension [Self <: BillingGroupCostReportElement](x: Self) {
    
    inline def setAWSCost(value: AWSCost): Self = StObject.set(x, "AWSCost", value.asInstanceOf[js.Any])
    
    inline def setAWSCostUndefined: Self = StObject.set(x, "AWSCost", js.undefined)
    
    inline def setArn(value: BillingGroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCurrency(value: Currency): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "Currency", js.undefined)
    
    inline def setMargin(value: Margin): Self = StObject.set(x, "Margin", value.asInstanceOf[js.Any])
    
    inline def setMarginPercentage(value: MarginPercentage): Self = StObject.set(x, "MarginPercentage", value.asInstanceOf[js.Any])
    
    inline def setMarginPercentageUndefined: Self = StObject.set(x, "MarginPercentage", js.undefined)
    
    inline def setMarginUndefined: Self = StObject.set(x, "Margin", js.undefined)
    
    inline def setProformaCost(value: ProformaCost): Self = StObject.set(x, "ProformaCost", value.asInstanceOf[js.Any])
    
    inline def setProformaCostUndefined: Self = StObject.set(x, "ProformaCost", js.undefined)
  }
}
