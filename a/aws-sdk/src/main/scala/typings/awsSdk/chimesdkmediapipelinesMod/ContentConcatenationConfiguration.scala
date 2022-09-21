package typings.awsSdk.chimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentConcatenationConfiguration extends StObject {
  
  /**
    * Enables or disables the configuration object.
    */
  var State: ArtifactsConcatenationState
}
object ContentConcatenationConfiguration {
  
  inline def apply(State: ArtifactsConcatenationState): ContentConcatenationConfiguration = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentConcatenationConfiguration]
  }
  
  extension [Self <: ContentConcatenationConfiguration](x: Self) {
    
    inline def setState(value: ArtifactsConcatenationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
