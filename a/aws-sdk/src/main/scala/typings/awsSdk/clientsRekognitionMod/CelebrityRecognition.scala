package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CelebrityRecognition extends StObject {
  
  /**
    * Information about a recognized celebrity.
    */
  var Celebrity: js.UndefOr[CelebrityDetail] = js.undefined
  
  /**
    * The time, in milliseconds from the start of the video, that the celebrity was recognized. Note that Timestamp is not guaranteed to be accurate to the individual frame where the celebrity first appears.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Timestamp] = js.undefined
}
object CelebrityRecognition {
  
  inline def apply(): CelebrityRecognition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CelebrityRecognition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CelebrityRecognition] (val x: Self) extends AnyVal {
    
    inline def setCelebrity(value: CelebrityDetail): Self = StObject.set(x, "Celebrity", value.asInstanceOf[js.Any])
    
    inline def setCelebrityUndefined: Self = StObject.set(x, "Celebrity", js.undefined)
    
    inline def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
