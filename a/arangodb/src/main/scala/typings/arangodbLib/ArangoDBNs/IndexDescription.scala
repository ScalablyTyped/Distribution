package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IndexDescription[T] extends js.Object {
  var deduplicate: js.UndefOr[scala.Boolean] = js.undefined
  var fields: js.Array[java.lang.String]
  var sparse: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: IndexType
  var unique: js.UndefOr[scala.Boolean] = js.undefined
}

