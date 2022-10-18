package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStacksOutput extends StObject {
  
  /**
    * If the output exceeds 1 MB in size, a string that identifies the next page of stacks. If no additional page exists, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudformationMod.NextToken] = js.undefined
  
  /**
    * A list of stack structures.
    */
  var Stacks: js.UndefOr[typings.awsSdk.clientsCloudformationMod.Stacks] = js.undefined
}
object DescribeStacksOutput {
  
  inline def apply(): DescribeStacksOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStacksOutput]
  }
  
  extension [Self <: DescribeStacksOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStacks(value: Stacks): Self = StObject.set(x, "Stacks", value.asInstanceOf[js.Any])
    
    inline def setStacksUndefined: Self = StObject.set(x, "Stacks", js.undefined)
    
    inline def setStacksVarargs(value: Stack*): Self = StObject.set(x, "Stacks", js.Array(value*))
  }
}
