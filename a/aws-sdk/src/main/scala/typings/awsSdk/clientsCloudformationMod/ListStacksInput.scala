package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStacksInput extends StObject {
  
  /**
    * A string that identifies the next page of stacks that you want to retrieve.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudformationMod.NextToken] = js.undefined
  
  /**
    * Stack status to use as a filter. Specify one or more stack status codes to list only stacks with the specified status codes. For a complete list of stack status codes, see the StackStatus parameter of the Stack data type.
    */
  var StackStatusFilter: js.UndefOr[typings.awsSdk.clientsCloudformationMod.StackStatusFilter] = js.undefined
}
object ListStacksInput {
  
  inline def apply(): ListStacksInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStacksInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStacksInput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStackStatusFilter(value: StackStatusFilter): Self = StObject.set(x, "StackStatusFilter", value.asInstanceOf[js.Any])
    
    inline def setStackStatusFilterUndefined: Self = StObject.set(x, "StackStatusFilter", js.undefined)
    
    inline def setStackStatusFilterVarargs(value: StackStatus*): Self = StObject.set(x, "StackStatusFilter", js.Array(value*))
  }
}
