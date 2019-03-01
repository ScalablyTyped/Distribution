package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateMetadata extends DocumentMetadata {
  var _oldRev: java.lang.String
}

object UpdateMetadata {
  @scala.inline
  def apply(_id: java.lang.String, _key: java.lang.String, _oldRev: java.lang.String, _rev: java.lang.String): UpdateMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_id")(_id)
    __obj.updateDynamic("_key")(_key)
    __obj.updateDynamic("_oldRev")(_oldRev)
    __obj.updateDynamic("_rev")(_rev)
    __obj.asInstanceOf[UpdateMetadata]
  }
}

