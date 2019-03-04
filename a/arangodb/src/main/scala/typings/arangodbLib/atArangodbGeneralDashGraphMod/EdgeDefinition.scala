package typings
package arangodbLib.atArangodbGeneralDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeDefinition extends js.Object {
  var collection: java.lang.String
  var from: js.Array[java.lang.String]
  var to: js.Array[java.lang.String]
}

object EdgeDefinition {
  @scala.inline
  def apply(collection: java.lang.String, from: js.Array[java.lang.String], to: js.Array[java.lang.String]): EdgeDefinition = {
    val __obj = js.Dynamic.literal(collection = collection, from = from, to = to)
  
    __obj.asInstanceOf[EdgeDefinition]
  }
}

