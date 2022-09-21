package typings.awsSdk.chimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioFeatures extends StObject {
  
  /**
    * Makes echo reduction available to clients who connect to the meeting.
    */
  var EchoReduction: js.UndefOr[MeetingFeatureStatus] = js.undefined
}
object AudioFeatures {
  
  inline def apply(): AudioFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioFeatures]
  }
  
  extension [Self <: AudioFeatures](x: Self) {
    
    inline def setEchoReduction(value: MeetingFeatureStatus): Self = StObject.set(x, "EchoReduction", value.asInstanceOf[js.Any])
    
    inline def setEchoReductionUndefined: Self = StObject.set(x, "EchoReduction", js.undefined)
  }
}
