package typings.amapJsSdk

import typings.amapJsSdk.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var position: LngLat
}

object AnonName {
  @scala.inline
  def apply(name: String, position: LngLat): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonName]
  }
}

