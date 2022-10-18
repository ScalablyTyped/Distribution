package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSegmentVersionRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  /**
    * The unique identifier for the segment.
    */
  var SegmentId: string
  
  /**
    * The unique version number (Version property) for the campaign version.
    */
  var Version: string
}
object GetSegmentVersionRequest {
  
  inline def apply(ApplicationId: string, SegmentId: string, Version: string): GetSegmentVersionRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SegmentId = SegmentId.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentVersionRequest]
  }
  
  extension [Self <: GetSegmentVersionRequest](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setSegmentId(value: string): Self = StObject.set(x, "SegmentId", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: string): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
