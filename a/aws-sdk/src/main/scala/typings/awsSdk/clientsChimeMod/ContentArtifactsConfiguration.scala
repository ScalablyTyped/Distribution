package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentArtifactsConfiguration extends StObject {
  
  /**
    * The MUX type of the artifact configuration.
    */
  var MuxType: js.UndefOr[ContentMuxType] = js.undefined
  
  /**
    * Indicates whether the content artifact is enabled or disabled.
    */
  var State: ArtifactsState
}
object ContentArtifactsConfiguration {
  
  inline def apply(State: ArtifactsState): ContentArtifactsConfiguration = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentArtifactsConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentArtifactsConfiguration] (val x: Self) extends AnyVal {
    
    inline def setMuxType(value: ContentMuxType): Self = StObject.set(x, "MuxType", value.asInstanceOf[js.Any])
    
    inline def setMuxTypeUndefined: Self = StObject.set(x, "MuxType", js.undefined)
    
    inline def setState(value: ArtifactsState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
