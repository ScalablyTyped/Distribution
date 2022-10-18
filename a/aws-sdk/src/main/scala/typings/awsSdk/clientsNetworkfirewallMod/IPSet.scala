package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPSet extends StObject {
  
  /**
    * The list of IP addresses and address ranges, in CIDR notation. 
    */
  var Definition: VariableDefinitionList
}
object IPSet {
  
  inline def apply(Definition: VariableDefinitionList): IPSet = {
    val __obj = js.Dynamic.literal(Definition = Definition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPSet]
  }
  
  extension [Self <: IPSet](x: Self) {
    
    inline def setDefinition(value: VariableDefinitionList): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionVarargs(value: VariableDefinition*): Self = StObject.set(x, "Definition", js.Array(value*))
  }
}
