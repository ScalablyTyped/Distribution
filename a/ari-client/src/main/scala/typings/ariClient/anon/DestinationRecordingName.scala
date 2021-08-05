package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationRecordingName extends StObject {
  
  var destinationRecordingName: String
  
  var recordingName: String
}
object DestinationRecordingName {
  
  inline def apply(destinationRecordingName: String, recordingName: String): DestinationRecordingName = {
    val __obj = js.Dynamic.literal(destinationRecordingName = destinationRecordingName.asInstanceOf[js.Any], recordingName = recordingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationRecordingName]
  }
  
  extension [Self <: DestinationRecordingName](x: Self) {
    
    inline def setDestinationRecordingName(value: String): Self = StObject.set(x, "destinationRecordingName", value.asInstanceOf[js.Any])
    
    inline def setRecordingName(value: String): Self = StObject.set(x, "recordingName", value.asInstanceOf[js.Any])
  }
}
