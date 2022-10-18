package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChimeSdkMeetingConfiguration extends StObject {
  
  /**
    * The configuration for the artifacts in an Amazon Chime SDK meeting.
    */
  var ArtifactsConfiguration: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.ArtifactsConfiguration] = js.undefined
  
  /**
    * The source configuration for a specified media pipline.
    */
  var SourceConfiguration: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.SourceConfiguration] = js.undefined
}
object ChimeSdkMeetingConfiguration {
  
  inline def apply(): ChimeSdkMeetingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChimeSdkMeetingConfiguration]
  }
  
  extension [Self <: ChimeSdkMeetingConfiguration](x: Self) {
    
    inline def setArtifactsConfiguration(value: ArtifactsConfiguration): Self = StObject.set(x, "ArtifactsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setArtifactsConfigurationUndefined: Self = StObject.set(x, "ArtifactsConfiguration", js.undefined)
    
    inline def setSourceConfiguration(value: SourceConfiguration): Self = StObject.set(x, "SourceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSourceConfigurationUndefined: Self = StObject.set(x, "SourceConfiguration", js.undefined)
  }
}
