package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SNSConfiguration extends StObject {
  
  /**
    * The ARN of the IAM role that has access to the target SNS topic.
    */
  var RoleArn: Arn
  
  /**
    * The format of the SNS topic.    JSON – Send JSON alerts with an anomaly ID and a link to the anomaly detail page. This is the default.    LONG_TEXT – Send human-readable alerts with information about the impacted timeseries and a link to the anomaly detail page. We recommend this for email.    SHORT_TEXT – Send human-readable alerts with a link to the anomaly detail page. We recommend this for SMS.  
    */
  var SnsFormat: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.SnsFormat] = js.undefined
  
  /**
    * The ARN of the target SNS topic.
    */
  var SnsTopicArn: Arn
}
object SNSConfiguration {
  
  inline def apply(RoleArn: Arn, SnsTopicArn: Arn): SNSConfiguration = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], SnsTopicArn = SnsTopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SNSConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SNSConfiguration] (val x: Self) extends AnyVal {
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setSnsFormat(value: SnsFormat): Self = StObject.set(x, "SnsFormat", value.asInstanceOf[js.Any])
    
    inline def setSnsFormatUndefined: Self = StObject.set(x, "SnsFormat", js.undefined)
    
    inline def setSnsTopicArn(value: Arn): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
  }
}
