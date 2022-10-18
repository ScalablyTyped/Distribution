package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectiveEquipmentBodyPart extends StObject {
  
  /**
    * The confidence that Amazon Rekognition has in the detection accuracy of the detected body part. 
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  /**
    * An array of Personal Protective Equipment items detected around a body part.
    */
  var EquipmentDetections: js.UndefOr[typings.awsSdk.clientsRekognitionMod.EquipmentDetections] = js.undefined
  
  /**
    * The detected body part.
    */
  var Name: js.UndefOr[BodyPart] = js.undefined
}
object ProtectiveEquipmentBodyPart {
  
  inline def apply(): ProtectiveEquipmentBodyPart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtectiveEquipmentBodyPart]
  }
  
  extension [Self <: ProtectiveEquipmentBodyPart](x: Self) {
    
    inline def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setEquipmentDetections(value: EquipmentDetections): Self = StObject.set(x, "EquipmentDetections", value.asInstanceOf[js.Any])
    
    inline def setEquipmentDetectionsUndefined: Self = StObject.set(x, "EquipmentDetections", js.undefined)
    
    inline def setEquipmentDetectionsVarargs(value: EquipmentDetection*): Self = StObject.set(x, "EquipmentDetections", js.Array(value*))
    
    inline def setName(value: BodyPart): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
