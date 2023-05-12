package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelDetectionSettings extends StObject {
  
  var GeneralLabels: js.UndefOr[GeneralLabelsSettings] = js.undefined
}
object LabelDetectionSettings {
  
  inline def apply(): LabelDetectionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelDetectionSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelDetectionSettings] (val x: Self) extends AnyVal {
    
    inline def setGeneralLabels(value: GeneralLabelsSettings): Self = StObject.set(x, "GeneralLabels", value.asInstanceOf[js.Any])
    
    inline def setGeneralLabelsUndefined: Self = StObject.set(x, "GeneralLabels", js.undefined)
  }
}
