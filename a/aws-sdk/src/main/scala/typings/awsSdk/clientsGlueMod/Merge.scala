package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Merge extends StObject {
  
  /**
    * The data inputs identified by their node names.
    */
  var Inputs: TwoInputs
  
  /**
    * The name of the transform node.
    */
  var Name: NodeName
  
  /**
    * The list of primary key fields to match records from the source and staging dynamic frames.
    */
  var PrimaryKeys: GlueStudioPathList
  
  /**
    * The source DynamicFrame that will be merged with a staging DynamicFrame.
    */
  var Source: NodeId
}
object Merge {
  
  inline def apply(Inputs: TwoInputs, Name: NodeName, PrimaryKeys: GlueStudioPathList, Source: NodeId): Merge = {
    val __obj = js.Dynamic.literal(Inputs = Inputs.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PrimaryKeys = PrimaryKeys.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Merge]
  }
  
  extension [Self <: Merge](x: Self) {
    
    inline def setInputs(value: TwoInputs): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeys(value: GlueStudioPathList): Self = StObject.set(x, "PrimaryKeys", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeysVarargs(value: EnclosedInStringProperties*): Self = StObject.set(x, "PrimaryKeys", js.Array(value*))
    
    inline def setSource(value: NodeId): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
  }
}
