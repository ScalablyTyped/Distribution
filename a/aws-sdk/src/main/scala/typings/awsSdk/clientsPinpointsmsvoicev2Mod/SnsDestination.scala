package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnsDestination extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic that you want to publish events to.
    */
  var TopicArn: SnsTopicArn
}
object SnsDestination {
  
  inline def apply(TopicArn: SnsTopicArn): SnsDestination = {
    val __obj = js.Dynamic.literal(TopicArn = TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnsDestination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnsDestination] (val x: Self) extends AnyVal {
    
    inline def setTopicArn(value: SnsTopicArn): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
  }
}
