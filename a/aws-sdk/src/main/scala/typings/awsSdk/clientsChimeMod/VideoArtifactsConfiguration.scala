package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoArtifactsConfiguration extends StObject {
  
  /**
    * The MUX type of the video artifact configuration object.
    */
  var MuxType: js.UndefOr[VideoMuxType] = js.undefined
  
  /**
    * Indicates whether the video artifact is enabled or disabled.
    */
  var State: ArtifactsState
}
object VideoArtifactsConfiguration {
  
  inline def apply(State: ArtifactsState): VideoArtifactsConfiguration = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoArtifactsConfiguration]
  }
  
  extension [Self <: VideoArtifactsConfiguration](x: Self) {
    
    inline def setMuxType(value: VideoMuxType): Self = StObject.set(x, "MuxType", value.asInstanceOf[js.Any])
    
    inline def setMuxTypeUndefined: Self = StObject.set(x, "MuxType", js.undefined)
    
    inline def setState(value: ArtifactsState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
