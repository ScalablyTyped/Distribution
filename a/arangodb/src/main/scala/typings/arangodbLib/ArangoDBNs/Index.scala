package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index[T /* <: js.Object */] extends js.Object {
  var code: scala.Double
  var deduplicate: scala.Boolean
  var fields: js.Array[java.lang.String]
  var id: java.lang.String
  var isNewlyCreated: scala.Boolean
  var selectivityEstimate: scala.Double
  var sparse: scala.Boolean
  var `type`: IndexType
  var unique: scala.Boolean
}

