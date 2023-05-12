package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductionVariantServerlessUpdateConfig extends StObject {
  
  /**
    * The updated maximum number of concurrent invocations your serverless endpoint can process.
    */
  var MaxConcurrency: js.UndefOr[ServerlessMaxConcurrency] = js.undefined
  
  /**
    * The updated amount of provisioned concurrency to allocate for the serverless endpoint. Should be less than or equal to MaxConcurrency.
    */
  var ProvisionedConcurrency: js.UndefOr[ServerlessProvisionedConcurrency] = js.undefined
}
object ProductionVariantServerlessUpdateConfig {
  
  inline def apply(): ProductionVariantServerlessUpdateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductionVariantServerlessUpdateConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductionVariantServerlessUpdateConfig] (val x: Self) extends AnyVal {
    
    inline def setMaxConcurrency(value: ServerlessMaxConcurrency): Self = StObject.set(x, "MaxConcurrency", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrencyUndefined: Self = StObject.set(x, "MaxConcurrency", js.undefined)
    
    inline def setProvisionedConcurrency(value: ServerlessProvisionedConcurrency): Self = StObject.set(x, "ProvisionedConcurrency", value.asInstanceOf[js.Any])
    
    inline def setProvisionedConcurrencyUndefined: Self = StObject.set(x, "ProvisionedConcurrency", js.undefined)
  }
}
