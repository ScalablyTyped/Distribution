package typings.awsSdk.clientsCodegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCodeReviewResponse extends StObject {
  
  /**
    * Information about the code review.
    */
  var CodeReview: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.CodeReview] = js.undefined
}
object DescribeCodeReviewResponse {
  
  inline def apply(): DescribeCodeReviewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCodeReviewResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCodeReviewResponse] (val x: Self) extends AnyVal {
    
    inline def setCodeReview(value: CodeReview): Self = StObject.set(x, "CodeReview", value.asInstanceOf[js.Any])
    
    inline def setCodeReviewUndefined: Self = StObject.set(x, "CodeReview", js.undefined)
  }
}
