package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUsageLimitRequest extends StObject {
  
  /**
    * The limit amount. If time-based, this amount is in Redshift Processing Units (RPU) consumed per hour. If data-based, this amount is in terabytes (TB) of data transferred between Regions in cross-account sharing. The value must be a positive number.
    */
  var amount: Long
  
  /**
    * The action that Amazon Redshift Serverless takes when the limit is reached. The default is log.
    */
  var breachAction: js.UndefOr[UsageLimitBreachAction] = js.undefined
  
  /**
    * The time period that the amount applies to. A weekly period begins on Sunday. The default is monthly.
    */
  var period: js.UndefOr[UsageLimitPeriod] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Redshift Serverless resource to create the usage limit for.
    */
  var resourceArn: String
  
  /**
    * The type of Amazon Redshift Serverless usage to create a usage limit for.
    */
  var usageType: UsageLimitUsageType
}
object CreateUsageLimitRequest {
  
  inline def apply(amount: Long, resourceArn: String, usageType: UsageLimitUsageType): CreateUsageLimitRequest = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], usageType = usageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUsageLimitRequest]
  }
  
  extension [Self <: CreateUsageLimitRequest](x: Self) {
    
    inline def setAmount(value: Long): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBreachAction(value: UsageLimitBreachAction): Self = StObject.set(x, "breachAction", value.asInstanceOf[js.Any])
    
    inline def setBreachActionUndefined: Self = StObject.set(x, "breachAction", js.undefined)
    
    inline def setPeriod(value: UsageLimitPeriod): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setUsageType(value: UsageLimitUsageType): Self = StObject.set(x, "usageType", value.asInstanceOf[js.Any])
  }
}
