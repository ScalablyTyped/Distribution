package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StreamSpecification extends js.Object {
  /**
       * Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
       */
  var StreamEnabled: js.UndefOr[StreamEnabled] = js.undefined
  /**
       *  When an item in the table is modified, StreamViewType determines what information is written to the stream for this table. Valid values for StreamViewType are:    KEYS_ONLY - Only the key attributes of the modified item are written to the stream.    NEW_IMAGE - The entire item, as it appears after it was modified, is written to the stream.    OLD_IMAGE - The entire item, as it appeared before it was modified, is written to the stream.    NEW_AND_OLD_IMAGES - Both the new and the old item images of the item are written to the stream.  
       */
  var StreamViewType: js.UndefOr[StreamViewType] = js.undefined
}

