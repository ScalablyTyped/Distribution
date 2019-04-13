package typings
package awsDashSdkLib.clientsDynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Record extends js.Object {
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
  @scala.inline
  def apply(
    awsRegion: String = null,
    dynamodb: StreamRecord = null,
    eventID: String = null,
    eventName: OperationType = null,
    eventSource: String = null,
    eventVersion: String = null,
    userIdentity: Identity = null
  ): Record = {
    val __obj = js.Dynamic.literal()
    if (awsRegion != null) __obj.updateDynamic("awsRegion")(awsRegion)
    if (dynamodb != null) __obj.updateDynamic("dynamodb")(dynamodb)
    if (eventID != null) __obj.updateDynamic("eventID")(eventID)
    if (eventName != null) __obj.updateDynamic("eventName")(eventName.asInstanceOf[js.Any])
    if (eventSource != null) __obj.updateDynamic("eventSource")(eventSource)
    if (eventVersion != null) __obj.updateDynamic("eventVersion")(eventVersion)
    if (userIdentity != null) __obj.updateDynamic("userIdentity")(userIdentity)
    __obj.asInstanceOf[Record]
  }
}

