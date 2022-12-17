package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationRecordingNameString extends StObject {
  
  var destinationRecordingName: String
}
object DestinationRecordingNameString {
  
  inline def apply(destinationRecordingName: String): DestinationRecordingNameString = {
    val __obj = js.Dynamic.literal(destinationRecordingName = destinationRecordingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationRecordingNameString]
  }
  
  extension [Self <: DestinationRecordingNameString](x: Self) {
    
    inline def setDestinationRecordingName(value: String): Self = StObject.set(x, "destinationRecordingName", value.asInstanceOf[js.Any])
  }
}
