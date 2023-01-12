package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopAction extends StObject {
  
  /**
    * The scope of the StopAction. The only acceptable value is RuleSet.
    */
  var Scope: StopScope
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the stop action is taken. An example of an Amazon SNS topic ARN is arn:aws:sns:us-west-2:123456789012:MyTopic. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
    */
  var TopicArn: js.UndefOr[AmazonResourceName] = js.undefined
}
object StopAction {
  
  inline def apply(Scope: StopScope): StopAction = {
    val __obj = js.Dynamic.literal(Scope = Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopAction] (val x: Self) extends AnyVal {
    
    inline def setScope(value: StopScope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    inline def setTopicArn(value: AmazonResourceName): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
    
    inline def setTopicArnUndefined: Self = StObject.set(x, "TopicArn", js.undefined)
  }
}
