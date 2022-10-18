package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropFields extends StObject {
  
  /**
    * The data inputs identified by their node names.
    */
  var Inputs: OneInput
  
  /**
    * The name of the transform node.
    */
  var Name: NodeName
  
  /**
    * A JSON path to a variable in the data structure.
    */
  var Paths: GlueStudioPathList
}
object DropFields {
  
  inline def apply(Inputs: OneInput, Name: NodeName, Paths: GlueStudioPathList): DropFields = {
    val __obj = js.Dynamic.literal(Inputs = Inputs.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Paths = Paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropFields]
  }
  
  extension [Self <: DropFields](x: Self) {
    
    inline def setInputs(value: OneInput): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPaths(value: GlueStudioPathList): Self = StObject.set(x, "Paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: EnclosedInStringProperties*): Self = StObject.set(x, "Paths", js.Array(value*))
  }
}
