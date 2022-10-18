package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterEventTopicRequest extends StObject {
  
  /**
    * The Directory ID to remove as a publisher. This directory will no longer send messages to the specified Amazon SNS topic.
    */
  var DirectoryId: typings.awsSdk.clientsDirectoryserviceMod.DirectoryId
  
  /**
    * The name of the Amazon SNS topic from which to remove the directory as a publisher.
    */
  var TopicName: typings.awsSdk.clientsDirectoryserviceMod.TopicName
}
object DeregisterEventTopicRequest {
  
  inline def apply(DirectoryId: DirectoryId, TopicName: TopicName): DeregisterEventTopicRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], TopicName = TopicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterEventTopicRequest]
  }
  
  extension [Self <: DeregisterEventTopicRequest](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setTopicName(value: TopicName): Self = StObject.set(x, "TopicName", value.asInstanceOf[js.Any])
  }
}
