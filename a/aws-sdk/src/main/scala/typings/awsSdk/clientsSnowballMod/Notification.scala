package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notification extends StObject {
  
  /**
    * The list of job states that will trigger a notification for this job.
    */
  var JobStatesToNotify: js.UndefOr[JobStateList] = js.undefined
  
  /**
    * Any change in job state will trigger a notification for this job.
    */
  var NotifyAll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The new SNS TopicArn that you want to associate with this job. You can create Amazon Resource Names (ARNs) for topics by using the CreateTopic Amazon SNS API action. You can subscribe email addresses to an Amazon SNS topic through the Amazon Web Services Management Console, or by using the Subscribe Amazon Simple Notification Service (Amazon SNS) API action.
    */
  var SnsTopicARN: js.UndefOr[typings.awsSdk.clientsSnowballMod.SnsTopicARN] = js.undefined
}
object Notification {
  
  inline def apply(): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Notification] (val x: Self) extends AnyVal {
    
    inline def setJobStatesToNotify(value: JobStateList): Self = StObject.set(x, "JobStatesToNotify", value.asInstanceOf[js.Any])
    
    inline def setJobStatesToNotifyUndefined: Self = StObject.set(x, "JobStatesToNotify", js.undefined)
    
    inline def setJobStatesToNotifyVarargs(value: JobState*): Self = StObject.set(x, "JobStatesToNotify", js.Array(value*))
    
    inline def setNotifyAll(value: Boolean): Self = StObject.set(x, "NotifyAll", value.asInstanceOf[js.Any])
    
    inline def setNotifyAllUndefined: Self = StObject.set(x, "NotifyAll", js.undefined)
    
    inline def setSnsTopicARN(value: SnsTopicARN): Self = StObject.set(x, "SnsTopicARN", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicARNUndefined: Self = StObject.set(x, "SnsTopicARN", js.undefined)
  }
}
