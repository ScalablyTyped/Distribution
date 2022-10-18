package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectModerationLabelsResponse extends StObject {
  
  /**
    * Shows the results of the human in the loop evaluation.
    */
  var HumanLoopActivationOutput: js.UndefOr[typings.awsSdk.clientsRekognitionMod.HumanLoopActivationOutput] = js.undefined
  
  /**
    * Array of detected Moderation labels and the time, in milliseconds from the start of the video, they were detected.
    */
  var ModerationLabels: js.UndefOr[typings.awsSdk.clientsRekognitionMod.ModerationLabels] = js.undefined
  
  /**
    * Version number of the moderation detection model that was used to detect unsafe content.
    */
  var ModerationModelVersion: js.UndefOr[String] = js.undefined
}
object DetectModerationLabelsResponse {
  
  inline def apply(): DetectModerationLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectModerationLabelsResponse]
  }
  
  extension [Self <: DetectModerationLabelsResponse](x: Self) {
    
    inline def setHumanLoopActivationOutput(value: HumanLoopActivationOutput): Self = StObject.set(x, "HumanLoopActivationOutput", value.asInstanceOf[js.Any])
    
    inline def setHumanLoopActivationOutputUndefined: Self = StObject.set(x, "HumanLoopActivationOutput", js.undefined)
    
    inline def setModerationLabels(value: ModerationLabels): Self = StObject.set(x, "ModerationLabels", value.asInstanceOf[js.Any])
    
    inline def setModerationLabelsUndefined: Self = StObject.set(x, "ModerationLabels", js.undefined)
    
    inline def setModerationLabelsVarargs(value: ModerationLabel*): Self = StObject.set(x, "ModerationLabels", js.Array(value*))
    
    inline def setModerationModelVersion(value: String): Self = StObject.set(x, "ModerationModelVersion", value.asInstanceOf[js.Any])
    
    inline def setModerationModelVersionUndefined: Self = StObject.set(x, "ModerationModelVersion", js.undefined)
  }
}
