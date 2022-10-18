package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepInput extends StObject {
  
  /**
    * The value of the integer.
    */
  var integerValue: js.UndefOr[Integer] = js.undefined
  
  /**
    * List of string values.
    */
  var listOfStringsValue: js.UndefOr[StringList] = js.undefined
  
  /**
    * Map of string values.
    */
  var mapOfStringValue: js.UndefOr[StringMap] = js.undefined
  
  /**
    * String value.
    */
  var stringValue: js.UndefOr[StringValue] = js.undefined
}
object StepInput {
  
  inline def apply(): StepInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepInput]
  }
  
  extension [Self <: StepInput](x: Self) {
    
    inline def setIntegerValue(value: Integer): Self = StObject.set(x, "integerValue", value.asInstanceOf[js.Any])
    
    inline def setIntegerValueUndefined: Self = StObject.set(x, "integerValue", js.undefined)
    
    inline def setListOfStringsValue(value: StringList): Self = StObject.set(x, "listOfStringsValue", value.asInstanceOf[js.Any])
    
    inline def setListOfStringsValueUndefined: Self = StObject.set(x, "listOfStringsValue", js.undefined)
    
    inline def setListOfStringsValueVarargs(value: StringListMember*): Self = StObject.set(x, "listOfStringsValue", js.Array(value*))
    
    inline def setMapOfStringValue(value: StringMap): Self = StObject.set(x, "mapOfStringValue", value.asInstanceOf[js.Any])
    
    inline def setMapOfStringValueUndefined: Self = StObject.set(x, "mapOfStringValue", js.undefined)
    
    inline def setStringValue(value: StringValue): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
