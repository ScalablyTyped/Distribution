package typings.arangodb.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentMetadata extends js.Object {
  var _id: String
  var _key: String
  var _rev: String
}

object DocumentMetadata {
  @scala.inline
  def apply(_id: String, _key: String, _rev: String): DocumentMetadata = {
    val __obj = js.Dynamic.literal(_id = _id, _key = _key, _rev = _rev)
  
    __obj.asInstanceOf[DocumentMetadata]
  }
}

