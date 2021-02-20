package typings.activexLibreoffice.com_.sun.star.document

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a CMIS property. */
@js.native
trait CmisProperty extends StObject {
  
  /** specifies the possible choices of the values. */
  var Choices: js.Any = js.native
  
  /** unique ID of the Cmis property */
  var Id: String = js.native
  
  /** specifies if the property has multiple value */
  var MultiValued: Boolean = js.native
  
  /** specifies the display name of the CMIS property. */
  var Name: String = js.native
  
  /** specifies if the property value can be freely set or is restricted from a list of choices. */
  var OpenChoice: Boolean = js.native
  
  /** specifies if the property is required and can not be empty. */
  var Required: Boolean = js.native
  
  /** type of the property */
  var Type: String = js.native
  
  /** specifies if the property is updatable. */
  var Updatable: Boolean = js.native
  
  /** specifies value of the property */
  var Value: js.Any = js.native
}
object CmisProperty {
  
  @scala.inline
  def apply(
    Choices: js.Any,
    Id: String,
    MultiValued: Boolean,
    Name: String,
    OpenChoice: Boolean,
    Required: Boolean,
    Type: String,
    Updatable: Boolean,
    Value: js.Any
  ): CmisProperty = {
    val __obj = js.Dynamic.literal(Choices = Choices.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], MultiValued = MultiValued.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OpenChoice = OpenChoice.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Updatable = Updatable.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmisProperty]
  }
  
  @scala.inline
  implicit class CmisPropertyMutableBuilder[Self <: CmisProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChoices(value: js.Any): Self = StObject.set(x, "Choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiValued(value: Boolean): Self = StObject.set(x, "MultiValued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenChoice(value: Boolean): Self = StObject.set(x, "OpenChoice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "Required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatable(value: Boolean): Self = StObject.set(x, "Updatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
