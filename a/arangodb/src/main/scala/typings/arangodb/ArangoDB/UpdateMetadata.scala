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
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _key = _key.asInstanceOf[js.Any], _oldRev = _oldRev.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateMetadata]
  }
}

