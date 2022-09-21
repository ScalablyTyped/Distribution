package typings.activexLibreoffice.com_.sun.star.document

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a CMIS property. */
trait CmisProperty extends StObject {
  
  /** specifies the possible choices of the values. */
  var Choices: Any
  
  /** unique ID of the Cmis property */
  var Id: String
  
  /** specifies if the property has multiple value */
  var MultiValued: Boolean
  
  /** specifies the display name of the CMIS property. */
  var Name: String
  
  /** specifies if the property value can be freely set or is restricted from a list of choices. */
  var OpenChoice: Boolean
  
  /** specifies if the property is required and can not be empty. */
  var Required: Boolean
  
  /** type of the property */
  var Type: String
  
  /** specifies if the property is updatable. */
  var Updatable: Boolean
  
  /** specifies value of the property */
  var Value: Any
}
object CmisProperty {
  
  inline def apply(
    Choices: Any,
    Id: String,
    MultiValued: Boolean,
    Name: String,
    OpenChoice: Boolean,
    Required: Boolean,
    Type: String,
    Updatable: Boolean,
    Value: Any
  ): CmisProperty = {
    val __obj = js.Dynamic.literal(Choices = Choices.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], MultiValued = MultiValued.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OpenChoice = OpenChoice.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Updatable = Updatable.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmisProperty]
  }
  
  extension [Self <: CmisProperty](x: Self) {
    
    inline def setChoices(value: Any): Self = StObject.set(x, "Choices", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setMultiValued(value: Boolean): Self = StObject.set(x, "MultiValued", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOpenChoice(value: Boolean): Self = StObject.set(x, "OpenChoice", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "Required", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setUpdatable(value: Boolean): Self = StObject.set(x, "Updatable", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
