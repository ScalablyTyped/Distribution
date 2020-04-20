package typings.agilite.mod

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
    val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any], PUT = PUT.asInstanceOf[js.Any])
    __obj.asInstanceOf[reqType]
  }
}

