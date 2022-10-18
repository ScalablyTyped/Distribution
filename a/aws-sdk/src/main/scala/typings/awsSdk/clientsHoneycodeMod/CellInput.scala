package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellInput extends StObject {
  
  /**
    *  Fact represents the data that is entered into a cell. This data can be free text or a formula. Formulas need to start with the equals (=) sign. 
    */
  var fact: js.UndefOr[Fact] = js.undefined
  
  /**
    *  A list representing the values that are entered into a ROWSET cell. Facts list can have either only values or rowIDs, and rowIDs should from the same table. 
    */
  var facts: js.UndefOr[FactList] = js.undefined
}
object CellInput {
  
  inline def apply(): CellInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellInput]
  }
  
  extension [Self <: CellInput](x: Self) {
    
    inline def setFact(value: Fact): Self = StObject.set(x, "fact", value.asInstanceOf[js.Any])
    
    inline def setFactUndefined: Self = StObject.set(x, "fact", js.undefined)
    
    inline def setFacts(value: FactList): Self = StObject.set(x, "facts", value.asInstanceOf[js.Any])
    
    inline def setFactsUndefined: Self = StObject.set(x, "facts", js.undefined)
    
    inline def setFactsVarargs(value: Fact*): Self = StObject.set(x, "facts", js.Array(value*))
  }
}
