package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationTargetItem extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the SNS topic.
    */
  var snsTopicArn: js.UndefOr[Arn] = js.undefined
}
object NotificationTargetItem {
  
  inline def apply(): NotificationTargetItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationTargetItem]
  }
  
  extension [Self <: NotificationTargetItem](x: Self) {
    
    inline def setSnsTopicArn(value: Arn): Self = StObject.set(x, "snsTopicArn", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicArnUndefined: Self = StObject.set(x, "snsTopicArn", js.undefined)
  }
}
