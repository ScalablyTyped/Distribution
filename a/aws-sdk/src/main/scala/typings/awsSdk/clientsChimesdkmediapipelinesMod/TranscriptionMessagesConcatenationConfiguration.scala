package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranscriptionMessagesConcatenationConfiguration extends StObject {
  
  /**
    * Enables or disables the configuration object.
    */
  var State: ArtifactsConcatenationState
}
object TranscriptionMessagesConcatenationConfiguration {
  
  inline def apply(State: ArtifactsConcatenationState): TranscriptionMessagesConcatenationConfiguration = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranscriptionMessagesConcatenationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TranscriptionMessagesConcatenationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setState(value: ArtifactsConcatenationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
