package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioArtifactsConfiguration extends StObject {
  
  /**
    * The MUX type of the audio artifact configuration object.
    */
  var MuxType: AudioMuxType
}
object AudioArtifactsConfiguration {
  
  inline def apply(MuxType: AudioMuxType): AudioArtifactsConfiguration = {
    val __obj = js.Dynamic.literal(MuxType = MuxType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioArtifactsConfiguration]
  }
  
  extension [Self <: AudioArtifactsConfiguration](x: Self) {
    
    inline def setMuxType(value: AudioMuxType): Self = StObject.set(x, "MuxType", value.asInstanceOf[js.Any])
  }
}
