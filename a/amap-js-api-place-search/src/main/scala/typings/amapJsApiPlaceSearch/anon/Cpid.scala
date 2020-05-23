package typings.amapJsApiPlaceSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cpid extends js.Object {
  var cpid: String
  var floor: String
  var truefloor: String
}

object Cpid {
  @scala.inline
  def apply(cpid: String, floor: String, truefloor: String): Cpid = {
    val __obj = js.Dynamic.literal(cpid = cpid.asInstanceOf[js.Any], floor = floor.asInstanceOf[js.Any], truefloor = truefloor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cpid]
  }
}

