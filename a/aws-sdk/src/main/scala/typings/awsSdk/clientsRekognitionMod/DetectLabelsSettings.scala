package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectLabelsSettings extends StObject {
  
  /**
    * Contains the specified filters for GENERAL_LABELS.
    */
  var GeneralLabels: js.UndefOr[GeneralLabelsSettings] = js.undefined
  
  /**
    * Contains the chosen number of maximum dominant colors in an image.
    */
  var ImageProperties: js.UndefOr[DetectLabelsImagePropertiesSettings] = js.undefined
}
object DetectLabelsSettings {
  
  inline def apply(): DetectLabelsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectLabelsSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectLabelsSettings] (val x: Self) extends AnyVal {
    
    inline def setGeneralLabels(value: GeneralLabelsSettings): Self = StObject.set(x, "GeneralLabels", value.asInstanceOf[js.Any])
    
    inline def setGeneralLabelsUndefined: Self = StObject.set(x, "GeneralLabels", js.undefined)
    
    inline def setImageProperties(value: DetectLabelsImagePropertiesSettings): Self = StObject.set(x, "ImageProperties", value.asInstanceOf[js.Any])
    
    inline def setImagePropertiesUndefined: Self = StObject.set(x, "ImageProperties", js.undefined)
  }
}
