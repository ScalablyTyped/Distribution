package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectLabelsImagePropertiesSettings extends StObject {
  
  /**
    * The maximum number of dominant colors to return when detecting labels in an image. The default value is 10.
    */
  var MaxDominantColors: js.UndefOr[DetectLabelsMaxDominantColors] = js.undefined
}
object DetectLabelsImagePropertiesSettings {
  
  inline def apply(): DetectLabelsImagePropertiesSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectLabelsImagePropertiesSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectLabelsImagePropertiesSettings] (val x: Self) extends AnyVal {
    
    inline def setMaxDominantColors(value: DetectLabelsMaxDominantColors): Self = StObject.set(x, "MaxDominantColors", value.asInstanceOf[js.Any])
    
    inline def setMaxDominantColorsUndefined: Self = StObject.set(x, "MaxDominantColors", js.undefined)
  }
}
