package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentMetadata extends js.Object {
  var _id: java.lang.String
  var _key: java.lang.String
  var _rev: java.lang.String
}

object DocumentMetadata {
  @scala.inline
  def apply(_id: java.lang.String, _key: java.lang.String, _rev: java.lang.String): DocumentMetadata = {
    val __obj = js.Dynamic.literal(_id = _id, _key = _key, _rev = _rev)
  
    __obj.asInstanceOf[DocumentMetadata]
  }
}

