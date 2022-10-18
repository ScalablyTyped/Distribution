package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestGridSession extends StObject {
  
  /**
    * The ARN of the session.
    */
  var arn: js.UndefOr[DeviceFarmArn] = js.undefined
  
  /**
    * The number of billed minutes that were used for this session. 
    */
  var billingMinutes: js.UndefOr[Double] = js.undefined
  
  /**
    * The time that the session was started.
    */
  var created: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time the session ended.
    */
  var ended: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A JSON object of options and parameters passed to the Selenium WebDriver.
    */
  var seleniumProperties: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the session.
    */
  var status: js.UndefOr[TestGridSessionStatus] = js.undefined
}
object TestGridSession {
  
  inline def apply(): TestGridSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestGridSession]
  }
  
  extension [Self <: TestGridSession](x: Self) {
    
    inline def setArn(value: DeviceFarmArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setBillingMinutes(value: Double): Self = StObject.set(x, "billingMinutes", value.asInstanceOf[js.Any])
    
    inline def setBillingMinutesUndefined: Self = StObject.set(x, "billingMinutes", js.undefined)
    
    inline def setCreated(value: js.Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setEnded(value: js.Date): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
    
    inline def setEndedUndefined: Self = StObject.set(x, "ended", js.undefined)
    
    inline def setSeleniumProperties(value: String): Self = StObject.set(x, "seleniumProperties", value.asInstanceOf[js.Any])
    
    inline def setSeleniumPropertiesUndefined: Self = StObject.set(x, "seleniumProperties", js.undefined)
    
    inline def setStatus(value: TestGridSessionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
