package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordingName extends StObject {
  
  var recordingName: String
}
object RecordingName {
  
  inline def apply(recordingName: String): RecordingName = {
    val __obj = js.Dynamic.literal(recordingName = recordingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordingName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecordingName] (val x: Self) extends AnyVal {
    
    inline def setRecordingName(value: String): Self = StObject.set(x, "recordingName", value.asInstanceOf[js.Any])
  }
}
