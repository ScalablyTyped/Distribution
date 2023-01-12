package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishFindingToSnsParams extends StObject {
  
  /**
    * The ARN of the topic to which you want to publish the findings.
    */
  var topicArn: SnsTopicArn
}
object PublishFindingToSnsParams {
  
  inline def apply(topicArn: SnsTopicArn): PublishFindingToSnsParams = {
    val __obj = js.Dynamic.literal(topicArn = topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishFindingToSnsParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublishFindingToSnsParams] (val x: Self) extends AnyVal {
    
    inline def setTopicArn(value: SnsTopicArn): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
  }
}
