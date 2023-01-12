package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EquipmentDetection extends StObject {
  
  /**
    * A bounding box surrounding the item of detected PPE.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.clientsRekognitionMod.BoundingBox] = js.undefined
  
  /**
    * The confidence that Amazon Rekognition has that the bounding box (BoundingBox) contains an item of PPE.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  /**
    * Information about the body part covered by the detected PPE.
    */
  var CoversBodyPart: js.UndefOr[typings.awsSdk.clientsRekognitionMod.CoversBodyPart] = js.undefined
  
  /**
    * The type of detected PPE.
    */
  var Type: js.UndefOr[ProtectiveEquipmentType] = js.undefined
}
object EquipmentDetection {
  
  inline def apply(): EquipmentDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EquipmentDetection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EquipmentDetection] (val x: Self) extends AnyVal {
    
    inline def setBoundingBox(value: BoundingBox): Self = StObject.set(x, "BoundingBox", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxUndefined: Self = StObject.set(x, "BoundingBox", js.undefined)
    
    inline def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setCoversBodyPart(value: CoversBodyPart): Self = StObject.set(x, "CoversBodyPart", value.asInstanceOf[js.Any])
    
    inline def setCoversBodyPartUndefined: Self = StObject.set(x, "CoversBodyPart", js.undefined)
    
    inline def setType(value: ProtectiveEquipmentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
