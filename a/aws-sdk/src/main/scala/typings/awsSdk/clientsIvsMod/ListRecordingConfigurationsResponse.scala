package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecordingConfigurationsResponse extends StObject {
  
  /**
    * If there are more recording configurations than maxResults, use nextToken in the request to get the next set.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * List of the matching recording configurations.
    */
  var recordingConfigurations: RecordingConfigurationList
}
object ListRecordingConfigurationsResponse {
  
  inline def apply(recordingConfigurations: RecordingConfigurationList): ListRecordingConfigurationsResponse = {
    val __obj = js.Dynamic.literal(recordingConfigurations = recordingConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRecordingConfigurationsResponse]
  }
  
  extension [Self <: ListRecordingConfigurationsResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRecordingConfigurations(value: RecordingConfigurationList): Self = StObject.set(x, "recordingConfigurations", value.asInstanceOf[js.Any])
    
    inline def setRecordingConfigurationsVarargs(value: RecordingConfigurationSummary*): Self = StObject.set(x, "recordingConfigurations", js.Array(value*))
  }
}
