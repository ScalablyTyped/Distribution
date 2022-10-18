package typings.awsLambda.triggerSesMod

import typings.awsLambda.awsLambdaStrings.Stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SESReceiptStopAction extends StObject {
  
  var topicArn: js.UndefOr[String] = js.undefined
  
  var `type`: Stop
}
object SESReceiptStopAction {
  
  inline def apply(): SESReceiptStopAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Stop")
    __obj.asInstanceOf[SESReceiptStopAction]
  }
  
  extension [Self <: SESReceiptStopAction](x: Self) {
    
    inline def setTopicArn(value: String): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
    
    inline def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
    
    inline def setType(value: Stop): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
