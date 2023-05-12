package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaLiveConnectorPipeline extends StObject {
  
  /**
    * The time at which the connector pipeline was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The connector pipeline's ARN.
    */
  var MediaPipelineArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The connector pipeline's ID.
    */
  var MediaPipelineId: js.UndefOr[GuidString] = js.undefined
  
  /**
    * The connector pipeline's data sinks.
    */
  var Sinks: js.UndefOr[LiveConnectorSinkList] = js.undefined
  
  /**
    * The connector pipeline's data sources.
    */
  var Sources: js.UndefOr[LiveConnectorSourceList] = js.undefined
  
  /**
    * The connector pipeline's status.
    */
  var Status: js.UndefOr[MediaPipelineStatus] = js.undefined
  
  /**
    * The time at which the connector pipeline was last updated.
    */
  var UpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
}
object MediaLiveConnectorPipeline {
  
  inline def apply(): MediaLiveConnectorPipeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaLiveConnectorPipeline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaLiveConnectorPipeline] (val x: Self) extends AnyVal {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setMediaPipelineArn(value: AmazonResourceName): Self = StObject.set(x, "MediaPipelineArn", value.asInstanceOf[js.Any])
    
    inline def setMediaPipelineArnUndefined: Self = StObject.set(x, "MediaPipelineArn", js.undefined)
    
    inline def setMediaPipelineId(value: GuidString): Self = StObject.set(x, "MediaPipelineId", value.asInstanceOf[js.Any])
    
    inline def setMediaPipelineIdUndefined: Self = StObject.set(x, "MediaPipelineId", js.undefined)
    
    inline def setSinks(value: LiveConnectorSinkList): Self = StObject.set(x, "Sinks", value.asInstanceOf[js.Any])
    
    inline def setSinksUndefined: Self = StObject.set(x, "Sinks", js.undefined)
    
    inline def setSinksVarargs(value: LiveConnectorSinkConfiguration*): Self = StObject.set(x, "Sinks", js.Array(value*))
    
    inline def setSources(value: LiveConnectorSourceList): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "Sources", js.undefined)
    
    inline def setSourcesVarargs(value: LiveConnectorSourceConfiguration*): Self = StObject.set(x, "Sources", js.Array(value*))
    
    inline def setStatus(value: MediaPipelineStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
  }
}
