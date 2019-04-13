package typings
package awsDashSdkLib.clientsDynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeySchemaElement extends js.Object {
  /**
    * The name of a key attribute.
    */
  var AttributeName: KeySchemaAttributeName
  /**
    * The attribute data, consisting of the data type and the attribute value itself.
    */
  var KeyType: awsDashSdkLib.clientsDynamodbstreamsMod.KeyType
}

object KeySchemaElement {
  @scala.inline
  def apply(AttributeName: KeySchemaAttributeName, KeyType: KeyType): KeySchemaElement = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName, KeyType = KeyType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeySchemaElement]
  }
}

