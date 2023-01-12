package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlarmAction extends StObject {
  
  var dynamoDB: js.UndefOr[DynamoDBAction] = js.undefined
  
  var dynamoDBv2: js.UndefOr[DynamoDBv2Action] = js.undefined
  
  var firehose: js.UndefOr[FirehoseAction] = js.undefined
  
  var iotEvents: js.UndefOr[IotEventsAction] = js.undefined
  
  var iotSiteWise: js.UndefOr[IotSiteWiseAction] = js.undefined
  
  var iotTopicPublish: js.UndefOr[IotTopicPublishAction] = js.undefined
  
  var lambda: js.UndefOr[LambdaAction] = js.undefined
  
  var sns: js.UndefOr[SNSTopicPublishAction] = js.undefined
  
  var sqs: js.UndefOr[SqsAction] = js.undefined
}
object AlarmAction {
  
  inline def apply(): AlarmAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlarmAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlarmAction] (val x: Self) extends AnyVal {
    
    inline def setDynamoDB(value: DynamoDBAction): Self = StObject.set(x, "dynamoDB", value.asInstanceOf[js.Any])
    
    inline def setDynamoDBUndefined: Self = StObject.set(x, "dynamoDB", js.undefined)
    
    inline def setDynamoDBv2(value: DynamoDBv2Action): Self = StObject.set(x, "dynamoDBv2", value.asInstanceOf[js.Any])
    
    inline def setDynamoDBv2Undefined: Self = StObject.set(x, "dynamoDBv2", js.undefined)
    
    inline def setFirehose(value: FirehoseAction): Self = StObject.set(x, "firehose", value.asInstanceOf[js.Any])
    
    inline def setFirehoseUndefined: Self = StObject.set(x, "firehose", js.undefined)
    
    inline def setIotEvents(value: IotEventsAction): Self = StObject.set(x, "iotEvents", value.asInstanceOf[js.Any])
    
    inline def setIotEventsUndefined: Self = StObject.set(x, "iotEvents", js.undefined)
    
    inline def setIotSiteWise(value: IotSiteWiseAction): Self = StObject.set(x, "iotSiteWise", value.asInstanceOf[js.Any])
    
    inline def setIotSiteWiseUndefined: Self = StObject.set(x, "iotSiteWise", js.undefined)
    
    inline def setIotTopicPublish(value: IotTopicPublishAction): Self = StObject.set(x, "iotTopicPublish", value.asInstanceOf[js.Any])
    
    inline def setIotTopicPublishUndefined: Self = StObject.set(x, "iotTopicPublish", js.undefined)
    
    inline def setLambda(value: LambdaAction): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    inline def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
    
    inline def setSns(value: SNSTopicPublishAction): Self = StObject.set(x, "sns", value.asInstanceOf[js.Any])
    
    inline def setSnsUndefined: Self = StObject.set(x, "sns", js.undefined)
    
    inline def setSqs(value: SqsAction): Self = StObject.set(x, "sqs", value.asInstanceOf[js.Any])
    
    inline def setSqsUndefined: Self = StObject.set(x, "sqs", js.undefined)
  }
}
