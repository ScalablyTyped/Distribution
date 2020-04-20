package typings.awsKcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Record extends js.Object {
  var data: String
  var partitionKey: String
  var sequenceNumber: String
}

object Record {
  @scala.inline
  def apply(data: String, partitionKey: String, sequenceNumber: String): Record = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], partitionKey = partitionKey.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record]
  }
}

