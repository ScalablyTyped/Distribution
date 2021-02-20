package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStacksResult extends StObject {
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the stacks.
    */
  var Stacks: js.UndefOr[StackList] = js.native
}
object DescribeStacksResult {
  
  @scala.inline
  def apply(): DescribeStacksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStacksResult]
  }
  
  @scala.inline
  implicit class DescribeStacksResultMutableBuilder[Self <: DescribeStacksResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStacks(value: StackList): Self = StObject.set(x, "Stacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStacksUndefined: Self = StObject.set(x, "Stacks", js.undefined)
    
    @scala.inline
    def setStacksVarargs(value: Stack*): Self = StObject.set(x, "Stacks", js.Array(value :_*))
  }
}
