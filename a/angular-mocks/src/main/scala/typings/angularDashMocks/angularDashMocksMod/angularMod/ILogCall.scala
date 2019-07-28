package typings.angularDashMocks.angularDashMocksMod.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILogCall extends js.Object {
  var logs: js.Array[String]
}

object ILogCall {
  @scala.inline
  def apply(logs: js.Array[String]): ILogCall = {
    val __obj = js.Dynamic.literal(logs = logs)
  
    __obj.asInstanceOf[ILogCall]
  }
}

