package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activity extends StObject {
  
  /**
    * The settings for a custom message activity. This type of activity calls an AWS Lambda function or web hook that sends messages to participants.
    */
  var CUSTOM: js.UndefOr[CustomMessageActivity] = js.undefined
  
  /**
    * The settings for a yes/no split activity. This type of activity sends participants down one of two paths in a journey, based on conditions that you specify.
    */
  var ConditionalSplit: js.UndefOr[ConditionalSplitActivity] = js.undefined
  
  /**
    * The settings for a connect activity. This type of activity initiates a contact center call to participants.
    */
  var ContactCenter: js.UndefOr[ContactCenterActivity] = js.undefined
  
  /**
    * The custom description of the activity.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * The settings for an email activity. This type of activity sends an email message to participants.
    */
  var EMAIL: js.UndefOr[EmailMessageActivity] = js.undefined
  
  /**
    * The settings for a holdout activity. This type of activity stops a journey for a specified percentage of participants.
    */
  var Holdout: js.UndefOr[HoldoutActivity] = js.undefined
  
  /**
    * The settings for a multivariate split activity. This type of activity sends participants down one of as many as five paths (including a default Else path) in a journey, based on conditions that you specify.
    */
  var MultiCondition: js.UndefOr[MultiConditionalSplitActivity] = js.undefined
  
  /**
    * The settings for a push notification activity. This type of activity sends a push notification to participants.
    */
  var PUSH: js.UndefOr[PushMessageActivity] = js.undefined
  
  /**
    * The settings for a random split activity. This type of activity randomly sends specified percentages of participants down one of as many as five paths in a journey, based on conditions that you specify.
    */
  var RandomSplit: js.UndefOr[RandomSplitActivity] = js.undefined
  
  /**
    * The settings for an SMS activity. This type of activity sends a text message to participants.
    */
  var SMS: js.UndefOr[SMSMessageActivity] = js.undefined
  
  /**
    * The settings for a wait activity. This type of activity waits for a certain amount of time or until a specific date and time before moving participants to the next activity in a journey.
    */
  var Wait: js.UndefOr[WaitActivity] = js.undefined
}
object Activity {
  
  inline def apply(): Activity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Activity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Activity] (val x: Self) extends AnyVal {
    
    inline def setCUSTOM(value: CustomMessageActivity): Self = StObject.set(x, "CUSTOM", value.asInstanceOf[js.Any])
    
    inline def setCUSTOMUndefined: Self = StObject.set(x, "CUSTOM", js.undefined)
    
    inline def setConditionalSplit(value: ConditionalSplitActivity): Self = StObject.set(x, "ConditionalSplit", value.asInstanceOf[js.Any])
    
    inline def setConditionalSplitUndefined: Self = StObject.set(x, "ConditionalSplit", js.undefined)
    
    inline def setContactCenter(value: ContactCenterActivity): Self = StObject.set(x, "ContactCenter", value.asInstanceOf[js.Any])
    
    inline def setContactCenterUndefined: Self = StObject.set(x, "ContactCenter", js.undefined)
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEMAIL(value: EmailMessageActivity): Self = StObject.set(x, "EMAIL", value.asInstanceOf[js.Any])
    
    inline def setEMAILUndefined: Self = StObject.set(x, "EMAIL", js.undefined)
    
    inline def setHoldout(value: HoldoutActivity): Self = StObject.set(x, "Holdout", value.asInstanceOf[js.Any])
    
    inline def setHoldoutUndefined: Self = StObject.set(x, "Holdout", js.undefined)
    
    inline def setMultiCondition(value: MultiConditionalSplitActivity): Self = StObject.set(x, "MultiCondition", value.asInstanceOf[js.Any])
    
    inline def setMultiConditionUndefined: Self = StObject.set(x, "MultiCondition", js.undefined)
    
    inline def setPUSH(value: PushMessageActivity): Self = StObject.set(x, "PUSH", value.asInstanceOf[js.Any])
    
    inline def setPUSHUndefined: Self = StObject.set(x, "PUSH", js.undefined)
    
    inline def setRandomSplit(value: RandomSplitActivity): Self = StObject.set(x, "RandomSplit", value.asInstanceOf[js.Any])
    
    inline def setRandomSplitUndefined: Self = StObject.set(x, "RandomSplit", js.undefined)
    
    inline def setSMS(value: SMSMessageActivity): Self = StObject.set(x, "SMS", value.asInstanceOf[js.Any])
    
    inline def setSMSUndefined: Self = StObject.set(x, "SMS", js.undefined)
    
    inline def setWait(value: WaitActivity): Self = StObject.set(x, "Wait", value.asInstanceOf[js.Any])
    
    inline def setWaitUndefined: Self = StObject.set(x, "Wait", js.undefined)
  }
}
