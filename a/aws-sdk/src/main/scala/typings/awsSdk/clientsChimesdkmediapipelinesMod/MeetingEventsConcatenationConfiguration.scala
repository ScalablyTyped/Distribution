package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeetingEventsConcatenationConfiguration extends StObject {
  
  /**
    * Enables or disables the configuration object.
    */
  var State: ArtifactsConcatenationState
}
object MeetingEventsConcatenationConfiguration {
  
  inline def apply(State: ArtifactsConcatenationState): MeetingEventsConcatenationConfiguration = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeetingEventsConcatenationConfiguration]
  }
  
  extension [Self <: MeetingEventsConcatenationConfiguration](x: Self) {
    
    inline def setState(value: ArtifactsConcatenationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
