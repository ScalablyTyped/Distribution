package typings.atlassianConnectJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  var fields: js.Object
  var issueType: Double
  var pid: Double
}

object Fields {
  @scala.inline
  def apply(fields: js.Object, issueType: Double, pid: Double): Fields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], issueType = issueType.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
}

