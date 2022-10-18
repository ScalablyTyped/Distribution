package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationRecordingName extends StObject {
  
  var destinationRecordingName: String
}
object DestinationRecordingName {
  
  inline def apply(destinationRecordingName: String): DestinationRecordingName = {
    val __obj = js.Dynamic.literal(destinationRecordingName = destinationRecordingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationRecordingName]
  }
  
  extension [Self <: DestinationRecordingName](x: Self) {
    
    inline def setDestinationRecordingName(value: String): Self = StObject.set(x, "destinationRecordingName", value.asInstanceOf[js.Any])
  }
}
