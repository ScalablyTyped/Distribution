package typings.appleMusicApi

import typings.appleMusicApi.AppleMusicApi.Station
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: Station
}

object AnonData {
  @scala.inline
  def apply(data: Station): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonData]
  }
}

