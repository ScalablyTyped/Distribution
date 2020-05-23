package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var position: LngLat
}

object Name {
  @scala.inline
  def apply(name: String, position: LngLat): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

