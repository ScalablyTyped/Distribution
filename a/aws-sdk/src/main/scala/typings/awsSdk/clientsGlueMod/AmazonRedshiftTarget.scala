package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmazonRedshiftTarget extends StObject {
  
  /**
    * Specifies the data of the Amazon Reshift target node.
    */
  var Data: js.UndefOr[AmazonRedshiftNodeData] = js.undefined
  
  /**
    * The nodes that are inputs to the data target.
    */
  var Inputs: js.UndefOr[OneInput] = js.undefined
  
  /**
    * The name of the Amazon Redshift target.
    */
  var Name: js.UndefOr[NodeName] = js.undefined
}
object AmazonRedshiftTarget {
  
  inline def apply(): AmazonRedshiftTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmazonRedshiftTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmazonRedshiftTarget] (val x: Self) extends AnyVal {
    
    inline def setData(value: AmazonRedshiftNodeData): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
    
    inline def setInputs(value: OneInput): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "Inputs", js.undefined)
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
