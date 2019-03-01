package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinarySet
  extends awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DocumentClientNs.DynamoDbSet
     with DynamoDbSet {
  var `type`: awsDashSdkLib.awsDashSdkLibStrings.Binary
  var values: js.Array[binaryType]
}

object BinarySet {
  @scala.inline
  def apply(`type`: awsDashSdkLib.awsDashSdkLibStrings.Binary, values: js.Array[binaryType]): BinarySet = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[BinarySet]
  }
}

