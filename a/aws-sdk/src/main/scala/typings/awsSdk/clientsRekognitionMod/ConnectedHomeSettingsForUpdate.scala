package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectedHomeSettingsForUpdate extends StObject {
  
  /**
    *  Specifies what you want to detect in the video, such as people, packages, or pets. The current valid labels you can include in this list are: "PERSON", "PET", "PACKAGE", and "ALL". 
    */
  var Labels: js.UndefOr[ConnectedHomeLabels] = js.undefined
  
  /**
    *  The minimum confidence required to label an object in the video. 
    */
  var MinConfidence: js.UndefOr[Percent] = js.undefined
}
object ConnectedHomeSettingsForUpdate {
  
  inline def apply(): ConnectedHomeSettingsForUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectedHomeSettingsForUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectedHomeSettingsForUpdate] (val x: Self) extends AnyVal {
    
    inline def setLabels(value: ConnectedHomeLabels): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    inline def setLabelsVarargs(value: ConnectedHomeLabel*): Self = StObject.set(x, "Labels", js.Array(value*))
    
    inline def setMinConfidence(value: Percent): Self = StObject.set(x, "MinConfidence", value.asInstanceOf[js.Any])
    
    inline def setMinConfidenceUndefined: Self = StObject.set(x, "MinConfidence", js.undefined)
  }
}
