package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTopicPermissionsRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account that contains the topic that you want described.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The ID of the topic that you want to describe. This ID is unique per Amazon Web Services Region for each Amazon Web Services account.
    */
  var TopicId: typings.awsSdk.clientsQuicksightMod.TopicId
}
object DescribeTopicPermissionsRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, TopicId: TopicId): DescribeTopicPermissionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], TopicId = TopicId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTopicPermissionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTopicPermissionsRequest] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setTopicId(value: TopicId): Self = StObject.set(x, "TopicId", value.asInstanceOf[js.Any])
  }
}
