package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHypervisorsOutput extends StObject {
  
  /**
    * A list of your Hypervisor objects, ordered by their Amazon Resource Names (ARNs).
    */
  var Hypervisors: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.Hypervisors] = js.undefined
  
  /**
    * The next item following a partial list of returned resources. For example, if a request is made to return maxResults number of resources, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.NextToken] = js.undefined
}
object ListHypervisorsOutput {
  
  inline def apply(): ListHypervisorsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHypervisorsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListHypervisorsOutput] (val x: Self) extends AnyVal {
    
    inline def setHypervisors(value: Hypervisors): Self = StObject.set(x, "Hypervisors", value.asInstanceOf[js.Any])
    
    inline def setHypervisorsUndefined: Self = StObject.set(x, "Hypervisors", js.undefined)
    
    inline def setHypervisorsVarargs(value: Hypervisor*): Self = StObject.set(x, "Hypervisors", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
