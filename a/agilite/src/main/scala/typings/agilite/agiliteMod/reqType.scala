package typings.agilite.agiliteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reqType extends js.Object {
  var DELETE: String
  var GET: String
  var POST: String
  var PUT: String
}

object reqType {
  @scala.inline
  def apply(DELETE: String, GET: String, POST: String, PUT: String): reqType = {
    val __obj = js.Dynamic.literal(DELETE = DELETE, GET = GET, POST = POST, PUT = PUT)
  
    __obj.asInstanceOf[reqType]
  }
}

