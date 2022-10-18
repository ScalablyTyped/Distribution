package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTopic extends StObject {
  
  /**
    * The date and time of when you associated your directory with the Amazon SNS topic.
    */
  var CreatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Directory ID of an Directory Service directory that will publish status messages to an Amazon SNS topic.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.DirectoryId] = js.undefined
  
  /**
    * The topic registration status.
    */
  var Status: js.UndefOr[TopicStatus] = js.undefined
  
  /**
    * The Amazon SNS topic ARN (Amazon Resource Name).
    */
  var TopicArn: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.TopicArn] = js.undefined
  
  /**
    * The name of an Amazon SNS topic the receives status messages from the directory.
    */
  var TopicName: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.TopicName] = js.undefined
}
object EventTopic {
  
  inline def apply(): EventTopic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTopic]
  }
  
  extension [Self <: EventTopic](x: Self) {
    
    inline def setCreatedDateTime(value: js.Date): Self = StObject.set(x, "CreatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "CreatedDateTime", js.undefined)
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    inline def setStatus(value: TopicStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTopicArn(value: TopicArn): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
    
    inline def setTopicArnUndefined: Self = StObject.set(x, "TopicArn", js.undefined)
    
    inline def setTopicName(value: TopicName): Self = StObject.set(x, "TopicName", value.asInstanceOf[js.Any])
    
    inline def setTopicNameUndefined: Self = StObject.set(x, "TopicName", js.undefined)
  }
}
