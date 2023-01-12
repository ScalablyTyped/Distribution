package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrainingDataSchema extends StObject {
  
  var labelSchema: js.UndefOr[LabelSchema] = js.undefined
  
  /**
    * The training data schema variables.
    */
  var modelVariables: ListOfStrings
}
object TrainingDataSchema {
  
  inline def apply(modelVariables: ListOfStrings): TrainingDataSchema = {
    val __obj = js.Dynamic.literal(modelVariables = modelVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingDataSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrainingDataSchema] (val x: Self) extends AnyVal {
    
    inline def setLabelSchema(value: LabelSchema): Self = StObject.set(x, "labelSchema", value.asInstanceOf[js.Any])
    
    inline def setLabelSchemaUndefined: Self = StObject.set(x, "labelSchema", js.undefined)
    
    inline def setModelVariables(value: ListOfStrings): Self = StObject.set(x, "modelVariables", value.asInstanceOf[js.Any])
    
    inline def setModelVariablesVarargs(value: String*): Self = StObject.set(x, "modelVariables", js.Array(value*))
  }
}
