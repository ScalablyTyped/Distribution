package typings.awsSdk.backupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVirtualMachinesInput extends StObject {
  
  /**
    * The maximum number of virtual machines to list.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.backupgatewayMod.MaxResults] = js.undefined
  
  /**
    * The next item following a partial list of returned resources. For example, if a request is made to return maxResults number of resources, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.backupgatewayMod.NextToken] = js.undefined
}
object ListVirtualMachinesInput {
  
  inline def apply(): ListVirtualMachinesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVirtualMachinesInput]
  }
  
  extension [Self <: ListVirtualMachinesInput](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
