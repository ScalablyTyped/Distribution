package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConcatenationSource extends StObject {
  
  /**
    * The concatenation settings for the media pipeline in a configuration object.
    */
  var MediaCapturePipelineSourceConfiguration: typings.awsSdk.clientsChimesdkmediapipelinesMod.MediaCapturePipelineSourceConfiguration
  
  /**
    * The type of concatenation source in a configuration object.
    */
  var Type: ConcatenationSourceType
}
object ConcatenationSource {
  
  inline def apply(
    MediaCapturePipelineSourceConfiguration: MediaCapturePipelineSourceConfiguration,
    Type: ConcatenationSourceType
  ): ConcatenationSource = {
    val __obj = js.Dynamic.literal(MediaCapturePipelineSourceConfiguration = MediaCapturePipelineSourceConfiguration.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcatenationSource]
  }
  
  extension [Self <: ConcatenationSource](x: Self) {
    
    inline def setMediaCapturePipelineSourceConfiguration(value: MediaCapturePipelineSourceConfiguration): Self = StObject.set(x, "MediaCapturePipelineSourceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setType(value: ConcatenationSourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
