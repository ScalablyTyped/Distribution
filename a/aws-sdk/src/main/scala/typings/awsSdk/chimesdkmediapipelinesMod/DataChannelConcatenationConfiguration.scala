package typings.awsSdk.chimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataChannelConcatenationConfiguration extends StObject {
  
  /**
    * Enables or disables the configuration object.
    */
  var State: ArtifactsConcatenationState
}
object DataChannelConcatenationConfiguration {
  
  inline def apply(State: ArtifactsConcatenationState): DataChannelConcatenationConfiguration = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataChannelConcatenationConfiguration]
  }
  
  extension [Self <: DataChannelConcatenationConfiguration](x: Self) {
    
    inline def setState(value: ArtifactsConcatenationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
