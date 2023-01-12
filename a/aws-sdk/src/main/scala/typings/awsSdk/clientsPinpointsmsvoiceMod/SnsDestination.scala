package typings.awsSdk.clientsPinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnsDestination extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic that you want to publish events to.
    */
  var TopicArn: js.UndefOr[String] = js.undefined
}
object SnsDestination {
  
  inline def apply(): SnsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnsDestination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnsDestination] (val x: Self) extends AnyVal {
    
    inline def setTopicArn(value: String): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
    
    inline def setTopicArnUndefined: Self = StObject.set(x, "TopicArn", js.undefined)
  }
}
