package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmazonCodeGuruProfilerIntegration extends StObject {
  
  /**
    * The status of the CodeGuru Profiler integration. Specifies if DevOps Guru is enabled to consume recommendations that are generated from Amazon CodeGuru Profiler.
    */
  var Status: js.UndefOr[EventSourceOptInStatus] = js.undefined
}
object AmazonCodeGuruProfilerIntegration {
  
  inline def apply(): AmazonCodeGuruProfilerIntegration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmazonCodeGuruProfilerIntegration]
  }
  
  extension [Self <: AmazonCodeGuruProfilerIntegration](x: Self) {
    
    inline def setStatus(value: EventSourceOptInStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
