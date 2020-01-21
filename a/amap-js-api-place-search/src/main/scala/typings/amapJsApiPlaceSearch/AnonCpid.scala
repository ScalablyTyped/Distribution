package typings.amapJsApiPlaceSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCpid extends js.Object {
  var cpid: String
  var floor: String
  var truefloor: String
}

object AnonCpid {
  @scala.inline
  def apply(cpid: String, floor: String, truefloor: String): AnonCpid = {
    val __obj = js.Dynamic.literal(cpid = cpid.asInstanceOf[js.Any], floor = floor.asInstanceOf[js.Any], truefloor = truefloor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCpid]
  }
}

