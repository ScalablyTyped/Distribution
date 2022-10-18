package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMediaConcatenationPipelineRequest extends StObject {
  
  /**
    * The unique identifier for the client request. The token makes the API request idempotent. Use a unique token for each media concatenation pipeline request.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.ClientRequestToken] = js.undefined
  
  /**
    * An object that specifies the data sinks for the media concatenation pipeline.
    */
  var Sinks: ConcatenationSinkList
  
  /**
    * An object that specifies the sources for the media concatenation pipeline.
    */
  var Sources: ConcatenationSourceList
  
  /**
    * The tags associated with the media concatenation pipeline.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateMediaConcatenationPipelineRequest {
  
  inline def apply(Sinks: ConcatenationSinkList, Sources: ConcatenationSourceList): CreateMediaConcatenationPipelineRequest = {
    val __obj = js.Dynamic.literal(Sinks = Sinks.asInstanceOf[js.Any], Sources = Sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMediaConcatenationPipelineRequest]
  }
  
  extension [Self <: CreateMediaConcatenationPipelineRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setSinks(value: ConcatenationSinkList): Self = StObject.set(x, "Sinks", value.asInstanceOf[js.Any])
    
    inline def setSinksVarargs(value: ConcatenationSink*): Self = StObject.set(x, "Sinks", js.Array(value*))
    
    inline def setSources(value: ConcatenationSourceList): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesVarargs(value: ConcatenationSource*): Self = StObject.set(x, "Sources", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
