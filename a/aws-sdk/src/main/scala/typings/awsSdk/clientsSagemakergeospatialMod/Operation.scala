package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Operation extends StObject {
  
  /**
    * Textual representation of the math operation; Equation used to compute the spectral index.
    */
  var Equation: String
  
  /**
    * The name of the operation.
    */
  var Name: String
  
  /**
    * The type of the operation.
    */
  var OutputType: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.OutputType] = js.undefined
}
object Operation {
  
  inline def apply(Equation: String, Name: String): Operation = {
    val __obj = js.Dynamic.literal(Equation = Equation.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Operation] (val x: Self) extends AnyVal {
    
    inline def setEquation(value: String): Self = StObject.set(x, "Equation", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutputType(value: OutputType): Self = StObject.set(x, "OutputType", value.asInstanceOf[js.Any])
    
    inline def setOutputTypeUndefined: Self = StObject.set(x, "OutputType", js.undefined)
  }
}
