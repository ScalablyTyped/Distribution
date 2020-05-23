package typings.apidoc.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: Record[String, _]
  var project: Record[String, _]
}

object Data {
  @scala.inline
  def apply(data: Record[String, _], project: Record[String, _]): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

