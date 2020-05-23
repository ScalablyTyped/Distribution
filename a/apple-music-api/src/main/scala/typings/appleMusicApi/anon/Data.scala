package typings.appleMusicApi.anon

import typings.appleMusicApi.AppleMusicApi.Station
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: Station
}

object Data {
  @scala.inline
  def apply(data: Station): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

