package typings.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePipelineNotificationsResponse extends StObject {
  
  /**
    * A section of the response body that provides information about the pipeline associated with this notification.
    */
  var Pipeline: js.UndefOr[typings.awsSdk.clientsElastictranscoderMod.Pipeline] = js.undefined
}
object UpdatePipelineNotificationsResponse {
  
  inline def apply(): UpdatePipelineNotificationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePipelineNotificationsResponse]
  }
  
  extension [Self <: UpdatePipelineNotificationsResponse](x: Self) {
    
    inline def setPipeline(value: Pipeline): Self = StObject.set(x, "Pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineUndefined: Self = StObject.set(x, "Pipeline", js.undefined)
  }
}
