package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInsightResponse extends StObject {
  
  /**
    * The ARN of the insight created.
    */
  var InsightArn: NonEmptyString
}
object CreateInsightResponse {
  
  inline def apply(InsightArn: NonEmptyString): CreateInsightResponse = {
    val __obj = js.Dynamic.literal(InsightArn = InsightArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInsightResponse]
  }
  
  extension [Self <: CreateInsightResponse](x: Self) {
    
    inline def setInsightArn(value: NonEmptyString): Self = StObject.set(x, "InsightArn", value.asInstanceOf[js.Any])
  }
}
