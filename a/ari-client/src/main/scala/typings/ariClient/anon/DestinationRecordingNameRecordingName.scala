package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationRecordingNameRecordingName extends StObject {
  
  var destinationRecordingName: String
  
  var recordingName: String
}
object DestinationRecordingNameRecordingName {
  
  inline def apply(destinationRecordingName: String, recordingName: String): DestinationRecordingNameRecordingName = {
    val __obj = js.Dynamic.literal(destinationRecordingName = destinationRecordingName.asInstanceOf[js.Any], recordingName = recordingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationRecordingNameRecordingName]
  }
  
  extension [Self <: DestinationRecordingNameRecordingName](x: Self) {
    
    inline def setDestinationRecordingName(value: String): Self = StObject.set(x, "destinationRecordingName", value.asInstanceOf[js.Any])
    
    inline def setRecordingName(value: String): Self = StObject.set(x, "recordingName", value.asInstanceOf[js.Any])
  }
}
