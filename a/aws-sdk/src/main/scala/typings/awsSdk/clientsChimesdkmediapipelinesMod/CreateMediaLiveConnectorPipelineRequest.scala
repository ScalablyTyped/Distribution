package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMediaLiveConnectorPipelineRequest extends StObject {
  
  /**
    * The token assigned to the client making the request.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.ClientRequestToken] = js.undefined
  
  /**
    * The media live connector pipeline's data sinks.
    */
  var Sinks: LiveConnectorSinkList
  
  /**
    * The media live connector pipeline's data sources.
    */
  var Sources: LiveConnectorSourceList
  
  /**
    * The tags associated with the media live connector pipeline.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateMediaLiveConnectorPipelineRequest {
  
  inline def apply(Sinks: LiveConnectorSinkList, Sources: LiveConnectorSourceList): CreateMediaLiveConnectorPipelineRequest = {
    val __obj = js.Dynamic.literal(Sinks = Sinks.asInstanceOf[js.Any], Sources = Sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMediaLiveConnectorPipelineRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMediaLiveConnectorPipelineRequest] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setSinks(value: LiveConnectorSinkList): Self = StObject.set(x, "Sinks", value.asInstanceOf[js.Any])
    
    inline def setSinksVarargs(value: LiveConnectorSinkConfiguration*): Self = StObject.set(x, "Sinks", js.Array(value*))
    
    inline def setSources(value: LiveConnectorSourceList): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesVarargs(value: LiveConnectorSourceConfiguration*): Self = StObject.set(x, "Sources", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
