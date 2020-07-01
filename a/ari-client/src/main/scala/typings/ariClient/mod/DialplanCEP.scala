package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialplanCEP extends js.Object {
  /**
    * Parameter of current dialplan application.
    */
  var app_data: String
  /**
    * Name of current dialplan application.
    */
  var app_name: String
  /**
    * Context in the dialplan.
    */
  var context: String
  /**
    * Extension in the dialplan.
    */
  var exten: String
  /**
    * Priority in the dialplan.
    */
  var priority: Double
}

object DialplanCEP {
  @scala.inline
  def apply(app_data: String, app_name: String, context: String, exten: String, priority: Double): DialplanCEP = {
    val __obj = js.Dynamic.literal(app_data = app_data.asInstanceOf[js.Any], app_name = app_name.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], exten = exten.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialplanCEP]
  }
}

