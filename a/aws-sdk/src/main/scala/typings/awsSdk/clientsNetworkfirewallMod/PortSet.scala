package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortSet extends StObject {
  
  /**
    * The set of port ranges. 
    */
  var Definition: js.UndefOr[VariableDefinitionList] = js.undefined
}
object PortSet {
  
  inline def apply(): PortSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PortSet] (val x: Self) extends AnyVal {
    
    inline def setDefinition(value: VariableDefinitionList): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "Definition", js.undefined)
    
    inline def setDefinitionVarargs(value: VariableDefinition*): Self = StObject.set(x, "Definition", js.Array(value*))
  }
}
