package typings.awsSdk.clientsDynamodbstreamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Record extends StObject {
  
  /**
    * The region in which the GetRecords request was received.
    */
  var awsRegion: js.UndefOr[String] = js.undefined
  
  /**
    * The main body of the stream record, containing all of the DynamoDB-specific fields.
    */
  var dynamodb: js.UndefOr[StreamRecord] = js.undefined
  
  /**
    * A globally unique identifier for the event that was recorded in this stream record.
    */
  var eventID: js.UndefOr[String] = js.undefined
  
  /**
    * The type of data modification that was performed on the DynamoDB table:    INSERT - a new item was added to the table.    MODIFY - one or more of an existing item's attributes were modified.    REMOVE - the item was deleted from the table  
    */
  var eventName: js.UndefOr[OperationType] = js.undefined
  
  /**
    * The AWS service from which the stream record originated. For DynamoDB Streams, this is aws:dynamodb.
    */
  var eventSource: js.UndefOr[String] = js.undefined
  
  /**
    * The version number of the stream record format. This number is updated whenever the structure of Record is modified. Client applications must not assume that eventVersion will remain at a particular value, as this number is subject to change at any time. In general, eventVersion will only increase as the low-level DynamoDB Streams API evolves.
    */
  var eventVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Items that are deleted by the Time to Live process after expiration have the following fields:    Records[].userIdentity.type "Service"   Records[].userIdentity.principalId "dynamodb.amazonaws.com"  
    */
  var userIdentity: js.UndefOr[Identity] = js.undefined
}
object Record {
  
  inline def apply(): Record = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Record]
  }
  
  extension [Self <: Record](x: Self) {
    
    inline def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionUndefined: Self = StObject.set(x, "awsRegion", js.undefined)
    
    inline def setDynamodb(value: StreamRecord): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
    
    inline def setDynamodbUndefined: Self = StObject.set(x, "dynamodb", js.undefined)
    
    inline def setEventID(value: String): Self = StObject.set(x, "eventID", value.asInstanceOf[js.Any])
    
    inline def setEventIDUndefined: Self = StObject.set(x, "eventID", js.undefined)
    
    inline def setEventName(value: OperationType): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
    
    inline def setEventSource(value: String): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
    
    inline def setEventSourceUndefined: Self = StObject.set(x, "eventSource", js.undefined)
    
    inline def setEventVersion(value: String): Self = StObject.set(x, "eventVersion", value.asInstanceOf[js.Any])
    
    inline def setEventVersionUndefined: Self = StObject.set(x, "eventVersion", js.undefined)
    
    inline def setUserIdentity(value: Identity): Self = StObject.set(x, "userIdentity", value.asInstanceOf[js.Any])
    
    inline def setUserIdentityUndefined: Self = StObject.set(x, "userIdentity", js.undefined)
  }
}
