package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowStepOutputUnion extends StObject {
  
  /**
    * The integer value. 
    */
  var integerValue: js.UndefOr[Integer] = js.undefined
  
  /**
    * The list of string value.
    */
  var listOfStringValue: js.UndefOr[StringList] = js.undefined
  
  /**
    * The string value.
    */
  var stringValue: js.UndefOr[StringValue] = js.undefined
}
object WorkflowStepOutputUnion {
  
  inline def apply(): WorkflowStepOutputUnion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowStepOutputUnion]
  }
  
  extension [Self <: WorkflowStepOutputUnion](x: Self) {
    
    inline def setIntegerValue(value: Integer): Self = StObject.set(x, "integerValue", value.asInstanceOf[js.Any])
    
    inline def setIntegerValueUndefined: Self = StObject.set(x, "integerValue", js.undefined)
    
    inline def setListOfStringValue(value: StringList): Self = StObject.set(x, "listOfStringValue", value.asInstanceOf[js.Any])
    
    inline def setListOfStringValueUndefined: Self = StObject.set(x, "listOfStringValue", js.undefined)
    
    inline def setListOfStringValueVarargs(value: StringListMember*): Self = StObject.set(x, "listOfStringValue", js.Array(value*))
    
    inline def setStringValue(value: StringValue): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
