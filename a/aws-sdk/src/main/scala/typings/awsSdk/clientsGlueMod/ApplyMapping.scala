package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyMapping extends StObject {
  
  /**
    * The data inputs identified by their node names.
    */
  var Inputs: OneInput
  
  /**
    * Specifies the mapping of data property keys in the data source to data property keys in the data target.
    */
  var Mapping: Mappings
  
  /**
    * The name of the transform node.
    */
  var Name: NodeName
}
object ApplyMapping {
  
  inline def apply(Inputs: OneInput, Mapping: Mappings, Name: NodeName): ApplyMapping = {
    val __obj = js.Dynamic.literal(Inputs = Inputs.asInstanceOf[js.Any], Mapping = Mapping.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyMapping]
  }
  
  extension [Self <: ApplyMapping](x: Self) {
    
    inline def setInputs(value: OneInput): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setMapping(value: Mappings): Self = StObject.set(x, "Mapping", value.asInstanceOf[js.Any])
    
    inline def setMappingVarargs(value: Mapping*): Self = StObject.set(x, "Mapping", js.Array(value*))
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
