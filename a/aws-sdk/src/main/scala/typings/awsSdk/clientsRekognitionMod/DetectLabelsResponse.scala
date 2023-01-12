package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectLabelsResponse extends StObject {
  
  /**
    * Information about the properties of the input image, such as brightness, sharpness, contrast, and dominant colors.
    */
  var ImageProperties: js.UndefOr[DetectLabelsImageProperties] = js.undefined
  
  /**
    * Version number of the label detection model that was used to detect labels.
    */
  var LabelModelVersion: js.UndefOr[String] = js.undefined
  
  /**
    * An array of labels for the real-world objects detected. 
    */
  var Labels: js.UndefOr[typings.awsSdk.clientsRekognitionMod.Labels] = js.undefined
  
  /**
    * The value of OrientationCorrection is always null. If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata that includes the image's orientation. Amazon Rekognition uses this orientation information to perform image correction. The bounding box coordinates are translated to represent object locations after the orientation information in the Exif metadata is used to correct the image orientation. Images in .png format don't contain Exif metadata. Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without orientation information in the image Exif metadata. The bounding box coordinates aren't translated and represent the object locations before the image is rotated. 
    */
  var OrientationCorrection: js.UndefOr[typings.awsSdk.clientsRekognitionMod.OrientationCorrection] = js.undefined
}
object DetectLabelsResponse {
  
  inline def apply(): DetectLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectLabelsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectLabelsResponse] (val x: Self) extends AnyVal {
    
    inline def setImageProperties(value: DetectLabelsImageProperties): Self = StObject.set(x, "ImageProperties", value.asInstanceOf[js.Any])
    
    inline def setImagePropertiesUndefined: Self = StObject.set(x, "ImageProperties", js.undefined)
    
    inline def setLabelModelVersion(value: String): Self = StObject.set(x, "LabelModelVersion", value.asInstanceOf[js.Any])
    
    inline def setLabelModelVersionUndefined: Self = StObject.set(x, "LabelModelVersion", js.undefined)
    
    inline def setLabels(value: Labels): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    inline def setLabelsVarargs(value: Label*): Self = StObject.set(x, "Labels", js.Array(value*))
    
    inline def setOrientationCorrection(value: OrientationCorrection): Self = StObject.set(x, "OrientationCorrection", value.asInstanceOf[js.Any])
    
    inline def setOrientationCorrectionUndefined: Self = StObject.set(x, "OrientationCorrection", js.undefined)
  }
}
