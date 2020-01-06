package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import typings.awsDashSdk.awsDashSdkStrings.Number_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberSet extends DynamoDbSet {
  var `type`: Number_ = js.native
  var values: js.Array[scala.Double] = js.native
}

object NumberSet {
  @scala.inline
  def apply(`type`: Number_, values: js.Array[scala.Double]): NumberSet = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberSet]
  }
}

