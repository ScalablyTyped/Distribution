package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialplanCEP extends js.Object {
  var app_data: String
  var app_name: String
  /* Properties */
  var context: String
  var exten: String
  var priority: Double
}

object DialplanCEP {
  @scala.inline
  def apply(app_data: String, app_name: String, context: String, exten: String, priority: Double): DialplanCEP = {
    val __obj = js.Dynamic.literal(app_data = app_data.asInstanceOf[js.Any], app_name = app_name.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], exten = exten.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialplanCEP]
  }
}

