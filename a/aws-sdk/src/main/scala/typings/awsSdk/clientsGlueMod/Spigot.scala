package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Spigot extends StObject {
  
  /**
    * The data inputs identified by their node names.
    */
  var Inputs: OneInput
  
  /**
    * The name of the transform node.
    */
  var Name: NodeName
  
  /**
    * A path in Amazon S3 where the transform will write a subset of records from the dataset to a JSON file in an Amazon S3 bucket.
    */
  var Path: EnclosedInStringProperty
  
  /**
    * The probability (a decimal value with a maximum value of 1) of picking any given record. A value of 1 indicates that each row read from the dataset should be included in the sample output.
    */
  var Prob: js.UndefOr[typings.awsSdk.clientsGlueMod.Prob] = js.undefined
  
  /**
    * Specifies a number of records to write starting from the beginning of the dataset.
    */
  var Topk: js.UndefOr[typings.awsSdk.clientsGlueMod.Topk] = js.undefined
}
object Spigot {
  
  inline def apply(Inputs: OneInput, Name: NodeName, Path: EnclosedInStringProperty): Spigot = {
    val __obj = js.Dynamic.literal(Inputs = Inputs.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spigot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Spigot] (val x: Self) extends AnyVal {
    
    inline def setInputs(value: OneInput): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: EnclosedInStringProperty): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setProb(value: Prob): Self = StObject.set(x, "Prob", value.asInstanceOf[js.Any])
    
    inline def setProbUndefined: Self = StObject.set(x, "Prob", js.undefined)
    
    inline def setTopk(value: Topk): Self = StObject.set(x, "Topk", value.asInstanceOf[js.Any])
    
    inline def setTopkUndefined: Self = StObject.set(x, "Topk", js.undefined)
  }
}
