package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillMissingValues extends StObject {
  
  /**
    * A JSON path to a variable in the data structure for the dataset that is filled.
    */
  var FilledPath: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * A JSON path to a variable in the data structure for the dataset that is imputed.
    */
  var ImputedPath: EnclosedInStringProperty
  
  /**
    * The data inputs identified by their node names.
    */
  var Inputs: OneInput
  
  /**
    * The name of the transform node.
    */
  var Name: NodeName
}
object FillMissingValues {
  
  inline def apply(ImputedPath: EnclosedInStringProperty, Inputs: OneInput, Name: NodeName): FillMissingValues = {
    val __obj = js.Dynamic.literal(ImputedPath = ImputedPath.asInstanceOf[js.Any], Inputs = Inputs.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillMissingValues]
  }
  
  extension [Self <: FillMissingValues](x: Self) {
    
    inline def setFilledPath(value: EnclosedInStringProperty): Self = StObject.set(x, "FilledPath", value.asInstanceOf[js.Any])
    
    inline def setFilledPathUndefined: Self = StObject.set(x, "FilledPath", js.undefined)
    
    inline def setImputedPath(value: EnclosedInStringProperty): Self = StObject.set(x, "ImputedPath", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: OneInput): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
