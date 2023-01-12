package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FaceDetection extends StObject {
  
  /**
    * The face properties for the detected face.
    */
  var Face: js.UndefOr[FaceDetail] = js.undefined
  
  /**
    * Time, in milliseconds from the start of the video, that the face was detected. Note that Timestamp is not guaranteed to be accurate to the individual frame where the face first appears.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Timestamp] = js.undefined
}
object FaceDetection {
  
  inline def apply(): FaceDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceDetection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FaceDetection] (val x: Self) extends AnyVal {
    
    inline def setFace(value: FaceDetail): Self = StObject.set(x, "Face", value.asInstanceOf[js.Any])
    
    inline def setFaceUndefined: Self = StObject.set(x, "Face", js.undefined)
    
    inline def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
