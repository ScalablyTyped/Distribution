package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductionVariantServerlessConfig extends StObject {
  
  /**
    * The maximum number of concurrent invocations your serverless endpoint can process.
    */
  var MaxConcurrency: ServerlessMaxConcurrency
  
  /**
    * The memory size of your serverless endpoint. Valid values are in 1 GB increments: 1024 MB, 2048 MB, 3072 MB, 4096 MB, 5120 MB, or 6144 MB.
    */
  var MemorySizeInMB: ServerlessMemorySizeInMB
}
object ProductionVariantServerlessConfig {
  
  inline def apply(MaxConcurrency: ServerlessMaxConcurrency, MemorySizeInMB: ServerlessMemorySizeInMB): ProductionVariantServerlessConfig = {
    val __obj = js.Dynamic.literal(MaxConcurrency = MaxConcurrency.asInstanceOf[js.Any], MemorySizeInMB = MemorySizeInMB.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductionVariantServerlessConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductionVariantServerlessConfig] (val x: Self) extends AnyVal {
    
    inline def setMaxConcurrency(value: ServerlessMaxConcurrency): Self = StObject.set(x, "MaxConcurrency", value.asInstanceOf[js.Any])
    
    inline def setMemorySizeInMB(value: ServerlessMemorySizeInMB): Self = StObject.set(x, "MemorySizeInMB", value.asInstanceOf[js.Any])
  }
}
