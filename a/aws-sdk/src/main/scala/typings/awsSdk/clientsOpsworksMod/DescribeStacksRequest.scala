package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStacksRequest extends StObject {
  
  /**
    * An array of stack IDs that specify the stacks to be described. If you omit this parameter, DescribeStacks returns a description of every stack.
    */
  var StackIds: js.UndefOr[Strings] = js.undefined
}
object DescribeStacksRequest {
  
  inline def apply(): DescribeStacksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStacksRequest]
  }
  
  extension [Self <: DescribeStacksRequest](x: Self) {
    
    inline def setStackIds(value: Strings): Self = StObject.set(x, "StackIds", value.asInstanceOf[js.Any])
    
    inline def setStackIdsUndefined: Self = StObject.set(x, "StackIds", js.undefined)
    
    inline def setStackIdsVarargs(value: String*): Self = StObject.set(x, "StackIds", js.Array(value*))
  }
}
