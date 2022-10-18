package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSourcesConfig extends StObject {
  
  /**
    * Information about whether DevOps Guru is configured to consume recommendations which are generated from AWS CodeGuru Profiler.
    */
  var AmazonCodeGuruProfiler: js.UndefOr[AmazonCodeGuruProfilerIntegration] = js.undefined
}
object EventSourcesConfig {
  
  inline def apply(): EventSourcesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSourcesConfig]
  }
  
  extension [Self <: EventSourcesConfig](x: Self) {
    
    inline def setAmazonCodeGuruProfiler(value: AmazonCodeGuruProfilerIntegration): Self = StObject.set(x, "AmazonCodeGuruProfiler", value.asInstanceOf[js.Any])
    
    inline def setAmazonCodeGuruProfilerUndefined: Self = StObject.set(x, "AmazonCodeGuruProfiler", js.undefined)
  }
}
