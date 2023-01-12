package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnsChannelConfig extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of an Amazon Simple Notification Service topic. 
    */
  var TopicArn: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.TopicArn] = js.undefined
}
object SnsChannelConfig {
  
  inline def apply(): SnsChannelConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnsChannelConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnsChannelConfig] (val x: Self) extends AnyVal {
    
    inline def setTopicArn(value: TopicArn): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
    
    inline def setTopicArnUndefined: Self = StObject.set(x, "TopicArn", js.undefined)
  }
}
