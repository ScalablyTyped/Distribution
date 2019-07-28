package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: String
  var info: String
  var success: String
  var warning: String
}

object Anon_Error {
  @scala.inline
  def apply(error: String, info: String, success: String, warning: String): Anon_Error = {
    val __obj = js.Dynamic.literal(error = error, info = info, success = success, warning = warning)
  
    __obj.asInstanceOf[Anon_Error]
  }
}

