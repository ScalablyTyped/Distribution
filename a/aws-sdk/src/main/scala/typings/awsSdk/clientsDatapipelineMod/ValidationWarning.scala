package typings.awsSdk.clientsDatapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationWarning extends StObject {
  
  /**
    * The identifier of the object that contains the validation warning.
    */
  var id: js.UndefOr[typings.awsSdk.clientsDatapipelineMod.id] = js.undefined
  
  /**
    * A description of the validation warning.
    */
  var warnings: js.UndefOr[validationMessages] = js.undefined
}
object ValidationWarning {
  
  inline def apply(): ValidationWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationWarning]
  }
  
  extension [Self <: ValidationWarning](x: Self) {
    
    inline def setId(value: id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setWarnings(value: validationMessages): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: validationMessage*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
