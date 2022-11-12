package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelDetection extends StObject {
  
  /**
    * Details about the detected label.
    */
  var Label: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Label] = js.undefined
  
  /**
    * Time, in milliseconds from the start of the video, that the label was detected. Note that Timestamp is not guaranteed to be accurate to the individual frame where the label first appears.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Timestamp] = js.undefined
}
object LabelDetection {
  
  inline def apply(): LabelDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelDetection]
  }
  
  extension [Self <: LabelDetection](x: Self) {
    
    inline def setLabel(value: Label): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    inline def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
