package typings.aceBuilds.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataString extends js.Object {
  var data: String
}

object DataString {
  @scala.inline
  def apply(data: String): DataString = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataString]
  }
}

