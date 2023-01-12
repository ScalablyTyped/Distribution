package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMediaConcatenationPipelineResponse extends StObject {
  
  /**
    * A media concatenation pipeline object, the ID, source type, MediaPipelineARN, and sink of a media concatenation pipeline object.
    */
  var MediaConcatenationPipeline: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.MediaConcatenationPipeline] = js.undefined
}
object CreateMediaConcatenationPipelineResponse {
  
  inline def apply(): CreateMediaConcatenationPipelineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMediaConcatenationPipelineResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMediaConcatenationPipelineResponse] (val x: Self) extends AnyVal {
    
    inline def setMediaConcatenationPipeline(value: MediaConcatenationPipeline): Self = StObject.set(x, "MediaConcatenationPipeline", value.asInstanceOf[js.Any])
    
    inline def setMediaConcatenationPipelineUndefined: Self = StObject.set(x, "MediaConcatenationPipeline", js.undefined)
  }
}
