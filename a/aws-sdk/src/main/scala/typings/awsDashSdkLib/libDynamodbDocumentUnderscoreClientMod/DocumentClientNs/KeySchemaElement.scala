package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeySchemaElement extends js.Object {
  /**
    * The name of a key attribute.
    */
  var AttributeName: KeySchemaAttributeName
  /**
    * The role that this key attribute will assume:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB' usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value. 
    */
  var KeyType: KeyType
}

object KeySchemaElement {
  @scala.inline
  def apply(AttributeName: KeySchemaAttributeName, KeyType: KeyType): KeySchemaElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AttributeName")(AttributeName)
    __obj.updateDynamic("KeyType")(KeyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeySchemaElement]
  }
}

