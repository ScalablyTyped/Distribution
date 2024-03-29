package typings.awsSdk.anon

import typings.awsSdk.clientsCodegurureviewerMod.Arn
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/codegurureviewer.DescribeCodeReviewRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeCodeReviewRequest extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the CodeReview object. 
    */
  var CodeReviewArn: Arn
}
object DescribeCodeReviewRequest {
  
  inline def apply(CodeReviewArn: Arn): DescribeCodeReviewRequest = {
    val __obj = js.Dynamic.literal(CodeReviewArn = CodeReviewArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCodeReviewRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCodeReviewRequest] (val x: Self) extends AnyVal {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setCodeReviewArn(value: Arn): Self = StObject.set(x, "CodeReviewArn", value.asInstanceOf[js.Any])
  }
}
