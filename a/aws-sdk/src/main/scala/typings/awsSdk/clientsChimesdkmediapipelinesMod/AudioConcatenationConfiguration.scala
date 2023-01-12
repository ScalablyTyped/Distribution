package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioConcatenationConfiguration extends StObject {
  
  /**
    * Enables the name object, where name is the name of the configuration object, such as AudioConcatenation.
    */
  var State: AudioArtifactsConcatenationState
}
object AudioConcatenationConfiguration {
  
  inline def apply(State: AudioArtifactsConcatenationState): AudioConcatenationConfiguration = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioConcatenationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioConcatenationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setState(value: AudioArtifactsConcatenationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
