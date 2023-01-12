package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldValidationConfiguration extends StObject {
  
  /**
    * The validation to perform on a number value.
    */
  var numValues: js.UndefOr[NumValues] = js.undefined
  
  /**
    * The validation to perform on a string value.
    */
  var strValues: js.UndefOr[StrValues] = js.undefined
  
  /**
    * The validation to perform on an object type. 
    */
  var `type`: String
  
  /**
    * The validation message to display.
    */
  var validationMessage: js.UndefOr[String] = js.undefined
}
object FieldValidationConfiguration {
  
  inline def apply(`type`: String): FieldValidationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldValidationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldValidationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setNumValues(value: NumValues): Self = StObject.set(x, "numValues", value.asInstanceOf[js.Any])
    
    inline def setNumValuesUndefined: Self = StObject.set(x, "numValues", js.undefined)
    
    inline def setNumValuesVarargs(value: Integer*): Self = StObject.set(x, "numValues", js.Array(value*))
    
    inline def setStrValues(value: StrValues): Self = StObject.set(x, "strValues", value.asInstanceOf[js.Any])
    
    inline def setStrValuesUndefined: Self = StObject.set(x, "strValues", js.undefined)
    
    inline def setStrValuesVarargs(value: String*): Self = StObject.set(x, "strValues", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValidationMessage(value: String): Self = StObject.set(x, "validationMessage", value.asInstanceOf[js.Any])
    
    inline def setValidationMessageUndefined: Self = StObject.set(x, "validationMessage", js.undefined)
  }
}
