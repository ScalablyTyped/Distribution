package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import typings.awsDashSdk.awsDashSdkStrings.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberSet extends DynamoDbSet {
  var `type`: Number
  var values: js.Array[scala.Double]
}

object NumberSet {
  @scala.inline
  def apply(`type`: Number, values: js.Array[scala.Double]): NumberSet = {
    val __obj = js.Dynamic.literal(values = values)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NumberSet]
  }
}

