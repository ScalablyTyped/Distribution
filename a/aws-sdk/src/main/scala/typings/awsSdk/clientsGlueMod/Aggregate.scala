package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aggregate extends StObject {
  
  /**
    * Specifies the aggregate functions to be performed on specified fields. 
    */
  var Aggs: AggregateOperations
  
  /**
    * Specifies the fields to group by.
    */
  var Groups: GlueStudioPathList
  
  /**
    * Specifies the fields and rows to use as inputs for the aggregate transform.
    */
  var Inputs: OneInput
  
  /**
    * The name of the transform node.
    */
  var Name: NodeName
}
object Aggregate {
  
  inline def apply(Aggs: AggregateOperations, Groups: GlueStudioPathList, Inputs: OneInput, Name: NodeName): Aggregate = {
    val __obj = js.Dynamic.literal(Aggs = Aggs.asInstanceOf[js.Any], Groups = Groups.asInstanceOf[js.Any], Inputs = Inputs.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Aggregate] (val x: Self) extends AnyVal {
    
    inline def setAggs(value: AggregateOperations): Self = StObject.set(x, "Aggs", value.asInstanceOf[js.Any])
    
    inline def setAggsVarargs(value: AggregateOperation*): Self = StObject.set(x, "Aggs", js.Array(value*))
    
    inline def setGroups(value: GlueStudioPathList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsVarargs(value: EnclosedInStringProperties*): Self = StObject.set(x, "Groups", js.Array(value*))
    
    inline def setInputs(value: OneInput): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
