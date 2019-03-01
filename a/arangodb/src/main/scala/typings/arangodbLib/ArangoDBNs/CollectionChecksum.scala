package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionChecksum extends js.Object {
  var checksum: java.lang.String
  var revision: java.lang.String
}

object CollectionChecksum {
  @scala.inline
  def apply(checksum: java.lang.String, revision: java.lang.String): CollectionChecksum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checksum")(checksum)
    __obj.updateDynamic("revision")(revision)
    __obj.asInstanceOf[CollectionChecksum]
  }
}

