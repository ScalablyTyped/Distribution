package typings.aceBuilds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: AnonFirst
}

object AnonData {
  @scala.inline
  def apply(data: AnonFirst): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonData]
  }
}

