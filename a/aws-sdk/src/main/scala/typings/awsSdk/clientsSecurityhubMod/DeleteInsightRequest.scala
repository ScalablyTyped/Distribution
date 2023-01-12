package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInsightRequest extends StObject {
  
  /**
    * The ARN of the insight to delete.
    */
  var InsightArn: NonEmptyString
}
object DeleteInsightRequest {
  
  inline def apply(InsightArn: NonEmptyString): DeleteInsightRequest = {
    val __obj = js.Dynamic.literal(InsightArn = InsightArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInsightRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteInsightRequest] (val x: Self) extends AnyVal {
    
    inline def setInsightArn(value: NonEmptyString): Self = StObject.set(x, "InsightArn", value.asInstanceOf[js.Any])
  }
}
