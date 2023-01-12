package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnsTopicConfiguration extends StObject {
  
  /**
    * The JSON policy text that defines who can access an Amazon SNS topic. For more information, see Example cases for Amazon SNS access control in the Amazon SNS Developer Guide.
    */
  var topicPolicy: js.UndefOr[SnsTopicPolicy] = js.undefined
}
object SnsTopicConfiguration {
  
  inline def apply(): SnsTopicConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnsTopicConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnsTopicConfiguration] (val x: Self) extends AnyVal {
    
    inline def setTopicPolicy(value: SnsTopicPolicy): Self = StObject.set(x, "topicPolicy", value.asInstanceOf[js.Any])
    
    inline def setTopicPolicyUndefined: Self = StObject.set(x, "topicPolicy", js.undefined)
  }
}
