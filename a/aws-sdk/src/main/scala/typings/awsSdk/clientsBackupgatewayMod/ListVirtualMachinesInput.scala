package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVirtualMachinesInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the hypervisor connected to your virtual machine.
    */
  var HypervisorArn: js.UndefOr[ServerArn] = js.undefined
  
  /**
    * The maximum number of virtual machines to list.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.MaxResults] = js.undefined
  
  /**
    * The next item following a partial list of returned resources. For example, if a request is made to return maxResults number of resources, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.NextToken] = js.undefined
}
object ListVirtualMachinesInput {
  
  inline def apply(): ListVirtualMachinesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVirtualMachinesInput]
  }
  
  extension [Self <: ListVirtualMachinesInput](x: Self) {
    
    inline def setHypervisorArn(value: ServerArn): Self = StObject.set(x, "HypervisorArn", value.asInstanceOf[js.Any])
    
    inline def setHypervisorArnUndefined: Self = StObject.set(x, "HypervisorArn", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
