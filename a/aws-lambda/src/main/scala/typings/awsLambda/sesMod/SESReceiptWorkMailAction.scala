package typings.awsLambda.sesMod

import typings.awsLambda.awsLambdaStrings.WorkMail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SESReceiptWorkMailAction extends StObject {
  
  var organizationArn: String
  
  var topicArn: js.UndefOr[String] = js.undefined
  
  var `type`: WorkMail
}
object SESReceiptWorkMailAction {
  
  inline def apply(organizationArn: String): SESReceiptWorkMailAction = {
    val __obj = js.Dynamic.literal(organizationArn = organizationArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WorkMail")
    __obj.asInstanceOf[SESReceiptWorkMailAction]
  }
  
  extension [Self <: SESReceiptWorkMailAction](x: Self) {
    
    inline def setOrganizationArn(value: String): Self = StObject.set(x, "organizationArn", value.asInstanceOf[js.Any])
    
    inline def setTopicArn(value: String): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
    
    inline def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
    
    inline def setType(value: WorkMail): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
