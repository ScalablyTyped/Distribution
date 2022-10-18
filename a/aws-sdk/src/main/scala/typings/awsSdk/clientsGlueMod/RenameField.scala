package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenameField extends StObject {
  
  /**
    * The data inputs identified by their node names.
    */
  var Inputs: OneInput
  
  /**
    * The name of the transform node.
    */
  var Name: NodeName
  
  /**
    * A JSON path to a variable in the data structure for the source data.
    */
  var SourcePath: EnclosedInStringProperties
  
  /**
    * A JSON path to a variable in the data structure for the target data.
    */
  var TargetPath: EnclosedInStringProperties
}
object RenameField {
  
  inline def apply(
    Inputs: OneInput,
    Name: NodeName,
    SourcePath: EnclosedInStringProperties,
    TargetPath: EnclosedInStringProperties
  ): RenameField = {
    val __obj = js.Dynamic.literal(Inputs = Inputs.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SourcePath = SourcePath.asInstanceOf[js.Any], TargetPath = TargetPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameField]
  }
  
  extension [Self <: RenameField](x: Self) {
    
    inline def setInputs(value: OneInput): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSourcePath(value: EnclosedInStringProperties): Self = StObject.set(x, "SourcePath", value.asInstanceOf[js.Any])
    
    inline def setSourcePathVarargs(value: EnclosedInStringProperty*): Self = StObject.set(x, "SourcePath", js.Array(value*))
    
    inline def setTargetPath(value: EnclosedInStringProperties): Self = StObject.set(x, "TargetPath", value.asInstanceOf[js.Any])
    
    inline def setTargetPathVarargs(value: EnclosedInStringProperty*): Self = StObject.set(x, "TargetPath", js.Array(value*))
  }
}
