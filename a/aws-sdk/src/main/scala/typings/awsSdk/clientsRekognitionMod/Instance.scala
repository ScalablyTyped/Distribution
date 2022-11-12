package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instance extends StObject {
  
  /**
    * The position of the label instance on the image.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.clientsRekognitionMod.BoundingBox] = js.undefined
  
  /**
    * The confidence that Amazon Rekognition has in the accuracy of the bounding box.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  /**
    * The dominant colors found in an individual instance of a label.
    */
  var DominantColors: js.UndefOr[typings.awsSdk.clientsRekognitionMod.DominantColors] = js.undefined
}
object Instance {
  
  inline def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  
  extension [Self <: Instance](x: Self) {
    
    inline def setBoundingBox(value: BoundingBox): Self = StObject.set(x, "BoundingBox", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxUndefined: Self = StObject.set(x, "BoundingBox", js.undefined)
    
    inline def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setDominantColors(value: DominantColors): Self = StObject.set(x, "DominantColors", value.asInstanceOf[js.Any])
    
    inline def setDominantColorsUndefined: Self = StObject.set(x, "DominantColors", js.undefined)
    
    inline def setDominantColorsVarargs(value: DominantColor*): Self = StObject.set(x, "DominantColors", js.Array(value*))
  }
}
