package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectAnomalyResult extends StObject {
  
  /**
    * If the model is an image segmentation model, Anomalies contains a list of anomaly types found in the image. There is one entry for each type of anomaly found (even if multiple instances of an anomaly type exist on the image). The first element in the list is always an anomaly type representing the image background ('background') and shouldn't be considered an anomaly. Amazon Lookout for Vision automatically add the background anomaly type to the response, and you don't need to declare a background anomaly type in your dataset. If the list has one entry ('background'), no anomalies were found on the image.  An image classification model doesn't return an Anomalies list. 
    */
  var Anomalies: js.UndefOr[AnomalyList] = js.undefined
  
  /**
    * If the model is an image segmentation model, AnomalyMask contains pixel masks that covers all anomaly types found on the image. Each anomaly type has a different mask color. To map a color to an anomaly type, see the color field of the PixelAnomaly object. An image classification model doesn't return an Anomalies list. 
    */
  var AnomalyMask: js.UndefOr[typings.awsSdk.clientsLookoutvisionMod.AnomalyMask] = js.undefined
  
  /**
    * The confidence that Lookout for Vision has in the accuracy of the classification in IsAnomalous.
    */
  var Confidence: js.UndefOr[Float] = js.undefined
  
  /**
    * True if Amazon Lookout for Vision classifies the image as containing an anomaly, otherwise false.
    */
  var IsAnomalous: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The source of the image that was analyzed. direct means that the images was supplied from the local computer. No other values are supported.
    */
  var Source: js.UndefOr[ImageSource] = js.undefined
}
object DetectAnomalyResult {
  
  inline def apply(): DetectAnomalyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectAnomalyResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectAnomalyResult] (val x: Self) extends AnyVal {
    
    inline def setAnomalies(value: AnomalyList): Self = StObject.set(x, "Anomalies", value.asInstanceOf[js.Any])
    
    inline def setAnomaliesUndefined: Self = StObject.set(x, "Anomalies", js.undefined)
    
    inline def setAnomaliesVarargs(value: Anomaly*): Self = StObject.set(x, "Anomalies", js.Array(value*))
    
    inline def setAnomalyMask(value: AnomalyMask): Self = StObject.set(x, "AnomalyMask", value.asInstanceOf[js.Any])
    
    inline def setAnomalyMaskUndefined: Self = StObject.set(x, "AnomalyMask", js.undefined)
    
    inline def setConfidence(value: Float): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setIsAnomalous(value: Boolean): Self = StObject.set(x, "IsAnomalous", value.asInstanceOf[js.Any])
    
    inline def setIsAnomalousUndefined: Self = StObject.set(x, "IsAnomalous", js.undefined)
    
    inline def setSource(value: ImageSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
  }
}
