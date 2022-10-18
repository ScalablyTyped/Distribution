package typings.actionsOnGoogle.distServiceDialogflowApiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1MessageOptionItem extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var image: js.UndefOr[DialogflowV1MessageImage] = js.undefined
  
  var optionInfo: js.UndefOr[DialogflowV1MessageOptionInfo] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object DialogflowV1MessageOptionItem {
  
  inline def apply(): DialogflowV1MessageOptionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1MessageOptionItem]
  }
  
  extension [Self <: DialogflowV1MessageOptionItem](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setImage(value: DialogflowV1MessageImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setOptionInfo(value: DialogflowV1MessageOptionInfo): Self = StObject.set(x, "optionInfo", value.asInstanceOf[js.Any])
    
    inline def setOptionInfoUndefined: Self = StObject.set(x, "optionInfo", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
