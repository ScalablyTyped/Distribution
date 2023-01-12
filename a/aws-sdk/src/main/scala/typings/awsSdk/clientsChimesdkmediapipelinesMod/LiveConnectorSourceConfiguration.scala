package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveConnectorSourceConfiguration extends StObject {
  
  /**
    * The configuration settings of the connector pipeline.
    */
  var ChimeSdkMeetingLiveConnectorConfiguration: typings.awsSdk.clientsChimesdkmediapipelinesMod.ChimeSdkMeetingLiveConnectorConfiguration
  
  /**
    * The source configuration's media source type.
    */
  var SourceType: LiveConnectorSourceType
}
object LiveConnectorSourceConfiguration {
  
  inline def apply(
    ChimeSdkMeetingLiveConnectorConfiguration: ChimeSdkMeetingLiveConnectorConfiguration,
    SourceType: LiveConnectorSourceType
  ): LiveConnectorSourceConfiguration = {
    val __obj = js.Dynamic.literal(ChimeSdkMeetingLiveConnectorConfiguration = ChimeSdkMeetingLiveConnectorConfiguration.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveConnectorSourceConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LiveConnectorSourceConfiguration] (val x: Self) extends AnyVal {
    
    inline def setChimeSdkMeetingLiveConnectorConfiguration(value: ChimeSdkMeetingLiveConnectorConfiguration): Self = StObject.set(x, "ChimeSdkMeetingLiveConnectorConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSourceType(value: LiveConnectorSourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
  }
}
