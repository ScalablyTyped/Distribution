package typings.awsLambda.sesMod

import typings.awsLambda.awsLambdaStrings.SNS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SESReceiptSnsAction extends StObject {
  
  var topicArn: String
  
  var `type`: SNS
}
object SESReceiptSnsAction {
  
  inline def apply(topicArn: String): SESReceiptSnsAction = {
    val __obj = js.Dynamic.literal(topicArn = topicArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SNS")
    __obj.asInstanceOf[SESReceiptSnsAction]
  }
  
  extension [Self <: SESReceiptSnsAction](x: Self) {
    
    inline def setTopicArn(value: String): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
    
    inline def setType(value: SNS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
