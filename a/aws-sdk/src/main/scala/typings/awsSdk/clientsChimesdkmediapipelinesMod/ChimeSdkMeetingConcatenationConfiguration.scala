package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChimeSdkMeetingConcatenationConfiguration extends StObject {
  
  /**
    * The configuration for the artifacts in an Amazon Chime SDK meeting concatenation.
    */
  var ArtifactsConfiguration: ArtifactsConcatenationConfiguration
}
object ChimeSdkMeetingConcatenationConfiguration {
  
  inline def apply(ArtifactsConfiguration: ArtifactsConcatenationConfiguration): ChimeSdkMeetingConcatenationConfiguration = {
    val __obj = js.Dynamic.literal(ArtifactsConfiguration = ArtifactsConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChimeSdkMeetingConcatenationConfiguration]
  }
  
  extension [Self <: ChimeSdkMeetingConcatenationConfiguration](x: Self) {
    
    inline def setArtifactsConfiguration(value: ArtifactsConcatenationConfiguration): Self = StObject.set(x, "ArtifactsConfiguration", value.asInstanceOf[js.Any])
  }
}
