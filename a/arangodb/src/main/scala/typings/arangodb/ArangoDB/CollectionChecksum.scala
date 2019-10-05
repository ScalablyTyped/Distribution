package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionChecksum extends js.Object {
  var checksum: String
  var revision: String
}

object CollectionChecksum {
  @scala.inline
  def apply(checksum: String, revision: String): CollectionChecksum = {
    val __obj = js.Dynamic.literal(checksum = checksum, revision = revision)
  
    __obj.asInstanceOf[CollectionChecksum]
  }
}

