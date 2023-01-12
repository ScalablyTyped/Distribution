package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComparedFace extends StObject {
  
  /**
    * Bounding box of the face.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.clientsRekognitionMod.BoundingBox] = js.undefined
  
  /**
    * Level of confidence that what the bounding box contains is a face.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  /**
    *  The emotions that appear to be expressed on the face, and the confidence level in the determination. Valid values include "Happy", "Sad", "Angry", "Confused", "Disgusted", "Surprised", "Calm", "Unknown", and "Fear". 
    */
  var Emotions: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Emotions] = js.undefined
  
  /**
    * An array of facial landmarks.
    */
  var Landmarks: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Landmarks] = js.undefined
  
  /**
    * Indicates the pose of the face as determined by its pitch, roll, and yaw.
    */
  var Pose: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Pose] = js.undefined
  
  /**
    * Identifies face image brightness and sharpness. 
    */
  var Quality: js.UndefOr[ImageQuality] = js.undefined
  
  /**
    *  Indicates whether or not the face is smiling, and the confidence level in the determination. 
    */
  var Smile: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Smile] = js.undefined
}
object ComparedFace {
  
  inline def apply(): ComparedFace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComparedFace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComparedFace] (val x: Self) extends AnyVal {
    
    inline def setBoundingBox(value: BoundingBox): Self = StObject.set(x, "BoundingBox", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxUndefined: Self = StObject.set(x, "BoundingBox", js.undefined)
    
    inline def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setEmotions(value: Emotions): Self = StObject.set(x, "Emotions", value.asInstanceOf[js.Any])
    
    inline def setEmotionsUndefined: Self = StObject.set(x, "Emotions", js.undefined)
    
    inline def setEmotionsVarargs(value: Emotion*): Self = StObject.set(x, "Emotions", js.Array(value*))
    
    inline def setLandmarks(value: Landmarks): Self = StObject.set(x, "Landmarks", value.asInstanceOf[js.Any])
    
    inline def setLandmarksUndefined: Self = StObject.set(x, "Landmarks", js.undefined)
    
    inline def setLandmarksVarargs(value: Landmark*): Self = StObject.set(x, "Landmarks", js.Array(value*))
    
    inline def setPose(value: Pose): Self = StObject.set(x, "Pose", value.asInstanceOf[js.Any])
    
    inline def setPoseUndefined: Self = StObject.set(x, "Pose", js.undefined)
    
    inline def setQuality(value: ImageQuality): Self = StObject.set(x, "Quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "Quality", js.undefined)
    
    inline def setSmile(value: Smile): Self = StObject.set(x, "Smile", value.asInstanceOf[js.Any])
    
    inline def setSmileUndefined: Self = StObject.set(x, "Smile", js.undefined)
  }
}
