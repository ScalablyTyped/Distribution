package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamProcessorDataSharingPreference extends StObject {
  
  /**
    *  If this option is set to true, you choose to share data with Rekognition to improve model performance. 
    */
  var OptIn: Boolean
}
object StreamProcessorDataSharingPreference {
  
  inline def apply(OptIn: Boolean): StreamProcessorDataSharingPreference = {
    val __obj = js.Dynamic.literal(OptIn = OptIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamProcessorDataSharingPreference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamProcessorDataSharingPreference] (val x: Self) extends AnyVal {
    
    inline def setOptIn(value: Boolean): Self = StObject.set(x, "OptIn", value.asInstanceOf[js.Any])
  }
}
