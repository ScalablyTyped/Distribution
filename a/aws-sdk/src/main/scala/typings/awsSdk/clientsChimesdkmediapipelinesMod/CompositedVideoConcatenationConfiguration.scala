package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositedVideoConcatenationConfiguration extends StObject {
  
  /**
    * Enables or disables the configuration object.
    */
  var State: ArtifactsConcatenationState
}
object CompositedVideoConcatenationConfiguration {
  
  inline def apply(State: ArtifactsConcatenationState): CompositedVideoConcatenationConfiguration = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositedVideoConcatenationConfiguration]
  }
  
  extension [Self <: CompositedVideoConcatenationConfiguration](x: Self) {
    
    inline def setState(value: ArtifactsConcatenationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
