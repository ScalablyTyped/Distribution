package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomIndicesInput extends StObject {
  
  /**
    * A list of BandMath indices to compute.
    */
  var Operations: js.UndefOr[OperationsListInput] = js.undefined
}
object CustomIndicesInput {
  
  inline def apply(): CustomIndicesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomIndicesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomIndicesInput] (val x: Self) extends AnyVal {
    
    inline def setOperations(value: OperationsListInput): Self = StObject.set(x, "Operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "Operations", js.undefined)
    
    inline def setOperationsVarargs(value: Operation*): Self = StObject.set(x, "Operations", js.Array(value*))
  }
}
