package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutRequest extends js.Object {
  /**
    * A map of attribute name to attribute values, representing the primary key of an item to be processed by PutItem. All of the table's primary key attributes must be specified, and their data types must match those of the table's key schema. If any attributes are present in the item which are part of an index key schema for the table, their types must match the index key schema.
    */
  var Item: PutItemInputAttributeMap
}

object PutRequest {
  @scala.inline
  def apply(Item: PutItemInputAttributeMap): PutRequest = {
    val __obj = js.Dynamic.literal(Item = Item)
  
    __obj.asInstanceOf[PutRequest]
  }
}

