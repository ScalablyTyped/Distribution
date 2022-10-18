package typings.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePipelineNotificationsRequest extends StObject {
  
  /**
    * The identifier of the pipeline for which you want to change notification settings.
    */
  var Id: typings.awsSdk.clientsElastictranscoderMod.Id
  
  /**
    * The topic ARN for the Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job status.  To receive notifications, you must also subscribe to the new topic in the Amazon SNS console.     Progressing: The topic ARN for the Amazon Simple Notification Service (Amazon SNS) topic that you want to notify when Elastic Transcoder has started to process jobs that are added to this pipeline. This is the ARN that Amazon SNS returned when you created the topic.    Complete: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder has finished processing a job. This is the ARN that Amazon SNS returned when you created the topic.    Warning: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder encounters a warning condition. This is the ARN that Amazon SNS returned when you created the topic.    Error: The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder encounters an error condition. This is the ARN that Amazon SNS returned when you created the topic.  
    */
  var Notifications: typings.awsSdk.clientsElastictranscoderMod.Notifications
}
object UpdatePipelineNotificationsRequest {
  
  inline def apply(Id: Id, Notifications: Notifications): UpdatePipelineNotificationsRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Notifications = Notifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePipelineNotificationsRequest]
  }
  
  extension [Self <: UpdatePipelineNotificationsRequest](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setNotifications(value: Notifications): Self = StObject.set(x, "Notifications", value.asInstanceOf[js.Any])
  }
}
