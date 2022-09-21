package typings.awsSdk.backupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVirtualMachinesOutput extends StObject {
  
  /**
    * The next item following a partial list of returned resources. For example, if a request is made to return maxResults number of resources, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.backupgatewayMod.NextToken] = js.undefined
  
  /**
    * A list of your VirtualMachine objects, ordered by their Amazon Resource Names (ARNs).
    */
  var VirtualMachines: js.UndefOr[typings.awsSdk.backupgatewayMod.VirtualMachines] = js.undefined
}
object ListVirtualMachinesOutput {
  
  inline def apply(): ListVirtualMachinesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVirtualMachinesOutput]
  }
  
  extension [Self <: ListVirtualMachinesOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVirtualMachines(value: VirtualMachines): Self = StObject.set(x, "VirtualMachines", value.asInstanceOf[js.Any])
    
    inline def setVirtualMachinesUndefined: Self = StObject.set(x, "VirtualMachines", js.undefined)
    
    inline def setVirtualMachinesVarargs(value: VirtualMachine*): Self = StObject.set(x, "VirtualMachines", js.Array(value*))
  }
}
