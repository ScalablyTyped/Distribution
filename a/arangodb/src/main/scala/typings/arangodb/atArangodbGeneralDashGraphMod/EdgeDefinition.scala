package typings.arangodb.atArangodbGeneralDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeDefinition extends js.Object {
  var collection: String
  var from: js.Array[String]
  var to: js.Array[String]
}

object EdgeDefinition {
  @scala.inline
  def apply(collection: String, from: js.Array[String], to: js.Array[String]): EdgeDefinition = {
    val __obj = js.Dynamic.literal(collection = collection, from = from, to = to)
  
    __obj.asInstanceOf[EdgeDefinition]
  }
}

