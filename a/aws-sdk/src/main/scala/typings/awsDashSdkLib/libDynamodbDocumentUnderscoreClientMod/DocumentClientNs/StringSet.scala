package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringSet
  extends awsDashSdkLib.clientsDynamodbMod.DynamoDBNs.DocumentClientNs.DynamoDbSet
     with DynamoDbSet {
  var `type`: awsDashSdkLib.awsDashSdkLibStrings.String
  var values: js.Array[java.lang.String]
}

object StringSet {
  @scala.inline
  def apply(`type`: awsDashSdkLib.awsDashSdkLibStrings.String, values: js.Array[java.lang.String]): StringSet = {
    val __obj = js.Dynamic.literal(values = values)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StringSet]
  }
}

