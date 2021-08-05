package typings.actionsOnGoogle.v1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1Result extends StObject {
  
  var action: js.UndefOr[String] = js.undefined
  
  var actionIncomplete: js.UndefOr[Boolean] = js.undefined
  
  var contexts: js.UndefOr[js.Array[DialogflowV1Context]] = js.undefined
  
  var fulfillment: js.UndefOr[DialogflowV1Fulfillment] = js.undefined
  
  var metadata: js.UndefOr[DialogflowV1Metadata] = js.undefined
  
  var parameters: js.UndefOr[DialogflowV1Parameters] = js.undefined
  
  var resolvedQuery: js.UndefOr[String] = js.undefined
  
  var score: js.UndefOr[Double] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
  
  var speech: js.UndefOr[String] = js.undefined
}
object DialogflowV1Result {
  
  inline def apply(): DialogflowV1Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1Result]
  }
  
  extension [Self <: DialogflowV1Result](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionIncomplete(value: Boolean): Self = StObject.set(x, "actionIncomplete", value.asInstanceOf[js.Any])
    
    inline def setActionIncompleteUndefined: Self = StObject.set(x, "actionIncomplete", js.undefined)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setContexts(value: js.Array[DialogflowV1Context]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    inline def setContextsVarargs(value: DialogflowV1Context*): Self = StObject.set(x, "contexts", js.Array(value :_*))
    
    inline def setFulfillment(value: DialogflowV1Fulfillment): Self = StObject.set(x, "fulfillment", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentUndefined: Self = StObject.set(x, "fulfillment", js.undefined)
    
    inline def setMetadata(value: DialogflowV1Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setParameters(value: DialogflowV1Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setResolvedQuery(value: String): Self = StObject.set(x, "resolvedQuery", value.asInstanceOf[js.Any])
    
    inline def setResolvedQueryUndefined: Self = StObject.set(x, "resolvedQuery", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSpeech(value: String): Self = StObject.set(x, "speech", value.asInstanceOf[js.Any])
    
    inline def setSpeechUndefined: Self = StObject.set(x, "speech", js.undefined)
  }
}
