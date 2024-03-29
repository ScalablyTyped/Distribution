package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectProtectiveEquipmentRequest extends StObject {
  
  /**
    * The image in which you want to detect PPE on detected persons. The image can be passed as image bytes or you can reference an image stored in an Amazon S3 bucket. 
    */
  var Image: typings.awsSdk.clientsRekognitionMod.Image
  
  /**
    * An array of PPE types that you want to summarize.
    */
  var SummarizationAttributes: js.UndefOr[ProtectiveEquipmentSummarizationAttributes] = js.undefined
}
object DetectProtectiveEquipmentRequest {
  
  inline def apply(Image: Image): DetectProtectiveEquipmentRequest = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectProtectiveEquipmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectProtectiveEquipmentRequest] (val x: Self) extends AnyVal {
    
    inline def setImage(value: Image): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    inline def setSummarizationAttributes(value: ProtectiveEquipmentSummarizationAttributes): Self = StObject.set(x, "SummarizationAttributes", value.asInstanceOf[js.Any])
    
    inline def setSummarizationAttributesUndefined: Self = StObject.set(x, "SummarizationAttributes", js.undefined)
  }
}
