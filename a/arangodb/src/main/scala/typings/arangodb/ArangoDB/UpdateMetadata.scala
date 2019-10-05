package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateMetadata extends DocumentMetadata {
  var _oldRev: String
}

object UpdateMetadata {
  @scala.inline
  def apply(_id: String, _key: String, _oldRev: String, _rev: String): UpdateMetadata = {
    val __obj = js.Dynamic.literal(_id = _id, _key = _key, _oldRev = _oldRev, _rev = _rev)
  
    __obj.asInstanceOf[UpdateMetadata]
  }
}

