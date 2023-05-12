package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Option extends StObject {
  
  /**
    * Specifies the description of the option.
    */
  var Description: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * Specifies the label of the option.
    */
  var Label: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * Specifies the value of the option.
    */
  var Value: js.UndefOr[EnclosedInStringProperty] = js.undefined
}
object Option {
  
  inline def apply(): Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Option]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: EnclosedInStringProperty): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLabel(value: EnclosedInStringProperty): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    inline def setValue(value: EnclosedInStringProperty): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
