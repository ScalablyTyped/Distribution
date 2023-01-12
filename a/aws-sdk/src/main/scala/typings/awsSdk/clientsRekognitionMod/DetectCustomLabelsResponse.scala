package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectCustomLabelsResponse extends StObject {
  
  /**
    * An array of custom labels detected in the input image.
    */
  var CustomLabels: js.UndefOr[typings.awsSdk.clientsRekognitionMod.CustomLabels] = js.undefined
}
object DetectCustomLabelsResponse {
  
  inline def apply(): DetectCustomLabelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectCustomLabelsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectCustomLabelsResponse] (val x: Self) extends AnyVal {
    
    inline def setCustomLabels(value: CustomLabels): Self = StObject.set(x, "CustomLabels", value.asInstanceOf[js.Any])
    
    inline def setCustomLabelsUndefined: Self = StObject.set(x, "CustomLabels", js.undefined)
    
    inline def setCustomLabelsVarargs(value: CustomLabel*): Self = StObject.set(x, "CustomLabels", js.Array(value*))
  }
}
